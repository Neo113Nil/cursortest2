package io.sentry.cache;

import io.sentry.ISerializer;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.clientreport.DiscardReason;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class CacheStrategy {
    protected static final Charset UTF_8 = Charset.forName("UTF-8");
    protected final File directory;
    private final int maxSize;
    protected SentryOptions options;
    protected final LazyEvaluator<ISerializer> serializer = new LazyEvaluator<>(new a(this, 0));

    public CacheStrategy(SentryOptions sentryOptions, String str, int i7) {
        Objects.requireNonNull(str, "Directory is required.");
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        this.directory = new File(str);
        this.maxSize = i7;
    }

    private SentryEnvelope buildNewEnvelope(SentryEnvelope sentryEnvelope, SentryEnvelopeItem sentryEnvelopeItem) {
        ArrayList arrayList = new ArrayList();
        Iterator<SentryEnvelopeItem> it = sentryEnvelope.getItems().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(sentryEnvelopeItem);
        return new SentryEnvelope(sentryEnvelope.getHeader(), arrayList);
    }

    private Session getFirstSession(SentryEnvelope sentryEnvelope) {
        for (SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
            if (isSessionType(sentryEnvelopeItem)) {
                return readSession(sentryEnvelopeItem);
            }
        }
        return null;
    }

    private boolean isSessionType(SentryEnvelopeItem sentryEnvelopeItem) {
        if (sentryEnvelopeItem == null) {
            return false;
        }
        return sentryEnvelopeItem.getHeader().getType().equals(SentryItemType.Session);
    }

    private boolean isValidEnvelope(SentryEnvelope sentryEnvelope) {
        return sentryEnvelope.getItems().iterator().hasNext();
    }

    private boolean isValidSession(Session session) {
        return session.getStatus().equals(Session.State.Ok) && session.getSessionId() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ISerializer lambda$new$0() {
        return this.options.getSerializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortFilesOldestToNewest$1(File file, File file2) {
        return Long.compare(file.lastModified(), file2.lastModified());
    }

    private void moveInitFlagIfNecessary(File file, File[] fileArr) {
        Boolean init;
        int i7;
        File file2;
        SentryEnvelope readEnvelope;
        SentryEnvelopeItem sentryEnvelopeItem;
        Session readSession;
        SentryEnvelope readEnvelope2 = readEnvelope(file);
        if (readEnvelope2 == null || !isValidEnvelope(readEnvelope2)) {
            return;
        }
        this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.CACHE_OVERFLOW, readEnvelope2);
        Session firstSession = getFirstSession(readEnvelope2);
        if (firstSession == null || !isValidSession(firstSession) || (init = firstSession.getInit()) == null || !init.booleanValue()) {
            return;
        }
        int length = fileArr.length;
        for (i7 = 0; i7 < length; i7++) {
            file2 = fileArr[i7];
            readEnvelope = readEnvelope(file2);
            if (readEnvelope != null && isValidEnvelope(readEnvelope)) {
                Iterator<SentryEnvelopeItem> it = readEnvelope.getItems().iterator();
                while (true) {
                    sentryEnvelopeItem = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    SentryEnvelopeItem next = it.next();
                    if (isSessionType(next) && (readSession = readSession(next)) != null && isValidSession(readSession)) {
                        Boolean init2 = readSession.getInit();
                        if (init2 != null && init2.booleanValue()) {
                            this.options.getLogger().log(SentryLevel.ERROR, "Session %s has 2 times the init flag.", firstSession.getSessionId());
                            return;
                        }
                        if (firstSession.getSessionId() != null && firstSession.getSessionId().equals(readSession.getSessionId())) {
                            readSession.setInitAsTrue();
                            try {
                                sentryEnvelopeItem = SentryEnvelopeItem.fromSession(this.serializer.getValue(), readSession);
                                it.remove();
                                break;
                            } catch (IOException e7) {
                                this.options.getLogger().log(SentryLevel.ERROR, e7, "Failed to create new envelope item for the session %s", firstSession.getSessionId());
                            }
                        }
                    }
                }
            }
        }
        return;
        if (sentryEnvelopeItem != null) {
            SentryEnvelope buildNewEnvelope = buildNewEnvelope(readEnvelope, sentryEnvelopeItem);
            long lastModified = file2.lastModified();
            if (!file2.delete()) {
                this.options.getLogger().log(SentryLevel.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
            }
            saveNewEnvelope(buildNewEnvelope, file2, lastModified);
            return;
        }
    }

    private SentryEnvelope readEnvelope(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                SentryEnvelope deserializeEnvelope = this.serializer.getValue().deserializeEnvelope(bufferedInputStream);
                bufferedInputStream.close();
                return deserializeEnvelope;
            } finally {
            }
        } catch (IOException e7) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to deserialize the envelope.", e7);
            return null;
        }
    }

    private Session readSession(SentryEnvelopeItem sentryEnvelopeItem) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.getData()), UTF_8));
            try {
                Session session = (Session) this.serializer.getValue().deserialize(bufferedReader, Session.class);
                bufferedReader.close();
                return session;
            } finally {
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to deserialize the session.", th);
            return null;
        }
    }

    private void saveNewEnvelope(SentryEnvelope sentryEnvelope, File file, long j) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.serializer.getValue().serialize(sentryEnvelope, fileOutputStream);
                file.setLastModified(j);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to serialize the new envelope to the disk.", th);
        }
    }

    private void sortFilesOldestToNewest(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new b());
        }
    }

    public boolean isDirectoryValid() {
        if (this.directory.isDirectory() && this.directory.canWrite() && this.directory.canRead()) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.ERROR, "The directory for caching files is inaccessible.: %s", this.directory.getAbsolutePath());
        return false;
    }

    public void rotateCacheIfNeeded(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.maxSize) {
            this.options.getLogger().log(SentryLevel.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i7 = (length - this.maxSize) + 1;
            sortFilesOldestToNewest(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i7, length);
            for (int i8 = 0; i8 < i7; i8++) {
                File file = fileArr[i8];
                moveInitFlagIfNecessary(file, fileArr2);
                if (!file.delete()) {
                    this.options.getLogger().log(SentryLevel.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}
