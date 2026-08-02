package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.hints.Flushable;
import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class EnvelopeSender extends DirectoryProcessor implements IEnvelopeSender {
    private final ILogger logger;
    private final IScopes scopes;
    private final ISerializer serializer;

    public EnvelopeSender(IScopes iScopes, ISerializer iSerializer, ILogger iLogger, long j, int i7) {
        super(iScopes, iLogger, j, i7);
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required.");
        this.serializer = (ISerializer) Objects.requireNonNull(iSerializer, "Serializer is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processFile$0(Flushable flushable) {
        if (flushable.waitFlush()) {
            return;
        }
        this.logger.log(SentryLevel.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processFile$1(Throwable th, File file, Retryable retryable) {
        retryable.setRetry(false);
        this.logger.log(SentryLevel.INFO, th, "File '%s' won't retry.", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processFile$2(File file, Retryable retryable) {
        if (retryable.isRetry()) {
            this.logger.log(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            safeDelete(file, "after trying to capture it");
            this.logger.log(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    private void safeDelete(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.logger.log(SentryLevel.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.DirectoryProcessor
    public boolean isRelevantFileName(String str) {
        return str.endsWith(EnvelopeCache.SUFFIX_ENVELOPE_FILE);
    }

    @Override // io.sentry.DirectoryProcessor
    public /* bridge */ /* synthetic */ void processDirectory(File file) {
        super.processDirectory(file);
    }

    @Override // io.sentry.IEnvelopeSender
    public void processEnvelopeFile(String str, Hint hint) {
        Objects.requireNonNull(str, "Path is required.");
        processFile(new File(str), hint);
    }

    @Override // io.sentry.DirectoryProcessor
    public void processFile(File file, Hint hint) {
        ILogger iLogger;
        e eVar;
        if (!file.isFile()) {
            this.logger.log(SentryLevel.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!isRelevantFileName(file.getName())) {
            this.logger.log(SentryLevel.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.logger.log(SentryLevel.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        SentryEnvelope deserializeEnvelope = this.serializer.deserializeEnvelope(bufferedInputStream);
                        if (deserializeEnvelope == null) {
                            this.logger.log(SentryLevel.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.scopes.captureEnvelope(deserializeEnvelope, hint);
                        }
                        HintUtils.runIfHasTypeLogIfNot(hint, Flushable.class, this.logger, new c(this, 0));
                        bufferedInputStream.close();
                        iLogger = this.logger;
                        eVar = new e(1, this, file);
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e7) {
                    this.logger.log(SentryLevel.ERROR, e7, "I/O on file '%s' failed.", file.getAbsolutePath());
                    iLogger = this.logger;
                    eVar = new e(1, this, file);
                }
            } catch (FileNotFoundException e8) {
                this.logger.log(SentryLevel.ERROR, e8, "File '%s' cannot be found.", file.getAbsolutePath());
                iLogger = this.logger;
                eVar = new e(1, this, file);
            } catch (Throwable th3) {
                this.logger.log(SentryLevel.ERROR, th3, "Failed to capture cached envelope %s", file.getAbsolutePath());
                HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, this.logger, new m(this, th3, file));
                iLogger = this.logger;
                eVar = new e(1, this, file);
            }
            HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, iLogger, eVar);
        } catch (Throwable th4) {
            HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, this.logger, new e(1, this, file));
            throw th4;
        }
    }
}
