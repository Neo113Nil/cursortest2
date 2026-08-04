package io.sentry;

import W5.AbstractC0486a1;
import io.sentry.clientreport.ClientReport;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.FileUtils;
import io.sentry.util.JsonSerializationUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.Base64;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryEnvelopeItem {
    private static final long MAX_PROFILE_CHUNK_SIZE = 52428800;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private byte[] data;
    private final Callable<byte[]> dataFactory;
    private final SentryEnvelopeItemHeader header;

    public static class CachedItem {
        private byte[] bytes;
        private final Callable<byte[]> dataFactory;

        public CachedItem(Callable<byte[]> callable) {
            this.dataFactory = callable;
        }

        private static byte[] orEmptyArray(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] getBytes() {
            Callable<byte[]> callable;
            if (this.bytes == null && (callable = this.dataFactory) != null) {
                this.bytes = callable.call();
            }
            return orEmptyArray(this.bytes);
        }
    }

    public SentryEnvelopeItem(SentryEnvelopeItemHeader sentryEnvelopeItemHeader, byte[] bArr) {
        this.header = (SentryEnvelopeItemHeader) Objects.requireNonNull(sentryEnvelopeItemHeader, "SentryEnvelopeItemHeader is required.");
        this.data = bArr;
        this.dataFactory = null;
    }

    private static void ensureAttachmentSizeLimit(long j, long j3, String str) throws SentryEnvelopeException {
        if (j > j3) {
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j3)));
        }
    }

    public static SentryEnvelopeItem fromAttachment(ISerializer iSerializer, ILogger iLogger, Attachment attachment, long j) {
        CachedItem cachedItem = new CachedItem(new r(attachment, j, iSerializer, iLogger));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Attachment, new o(cachedItem, 16), attachment.getContentType(), attachment.getFilename(), attachment.getAttachmentType()), new o(cachedItem, 17));
    }

    public static SentryEnvelopeItem fromCheckIn(ISerializer iSerializer, CheckIn checkIn) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(checkIn, "CheckIn is required.");
        CachedItem cachedItem = new CachedItem(new p(3, iSerializer, checkIn));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.CheckIn, new o(cachedItem, 11), "application/json", null), new o(cachedItem, 12));
    }

    public static SentryEnvelopeItem fromClientReport(ISerializer iSerializer, ClientReport clientReport) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(clientReport, "ClientReport is required.");
        CachedItem cachedItem = new CachedItem(new p(2, iSerializer, clientReport));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.resolve(clientReport), new o(cachedItem, 9), "application/json", null), new o(cachedItem, 10));
    }

    public static SentryEnvelopeItem fromEvent(ISerializer iSerializer, SentryBaseEvent sentryBaseEvent) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(sentryBaseEvent, "SentryEvent is required.");
        CachedItem cachedItem = new CachedItem(new p(0, iSerializer, sentryBaseEvent));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.resolve(sentryBaseEvent), new o(cachedItem, 2), "application/json", null), new o(cachedItem, 3));
    }

    public static SentryEnvelopeItem fromLogs(ISerializer iSerializer, SentryLogEvents sentryLogEvents) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(sentryLogEvents, "SentryLogEvents is required.");
        CachedItem cachedItem = new CachedItem(new p(4, iSerializer, sentryLogEvents));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Log, new o(cachedItem, 13), "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(sentryLogEvents.getItems().size())), new o(cachedItem, 14));
    }

    public static SentryEnvelopeItem fromProfileChunk(final ProfileChunk profileChunk, final ISerializer iSerializer) {
        final File traceFile = profileChunk.getTraceFile();
        CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.lambda$fromProfileChunk$15(traceFile, profileChunk, iSerializer);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.ProfileChunk, new o(cachedItem, 6), "application-json", traceFile.getName(), (String) null, profileChunk.getPlatform(), (Integer) null), new o(cachedItem, 8));
    }

    public static SentryEnvelopeItem fromProfilingTrace(ProfilingTraceData profilingTraceData, long j, ISerializer iSerializer) {
        File traceFile = profilingTraceData.getTraceFile();
        CachedItem cachedItem = new CachedItem(new r(traceFile, j, profilingTraceData, iSerializer));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Profile, new o(cachedItem, 18), "application-json", traceFile.getName()), new o(cachedItem, 19));
    }

    public static SentryEnvelopeItem fromReplay(final ISerializer iSerializer, final ILogger iLogger, final SentryReplayEvent sentryReplayEvent, final ReplayRecording replayRecording, final boolean z4) {
        final File videoFile = sentryReplayEvent.getVideoFile();
        CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.lambda$fromReplay$24(iSerializer, sentryReplayEvent, replayRecording, videoFile, iLogger, z4);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.ReplayVideo, new o(cachedItem, 7), null, null), new o(cachedItem, 15));
    }

    public static SentryEnvelopeItem fromSession(ISerializer iSerializer, Session session) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(session, "Session is required.");
        CachedItem cachedItem = new CachedItem(new p(5, iSerializer, session));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Session, new o(cachedItem, 0), "application/json", null), new o(cachedItem, 1));
    }

    public static SentryEnvelopeItem fromUserFeedback(ISerializer iSerializer, UserFeedback userFeedback) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(userFeedback, "UserFeedback is required.");
        CachedItem cachedItem = new CachedItem(new p(1, iSerializer, userFeedback));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.UserFeedback, new o(cachedItem, 4), "application/json", null), new o(cachedItem, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromAttachment$12(Attachment attachment, long j, ISerializer iSerializer, ILogger iLogger) throws SentryEnvelopeException {
        byte[] bArrCall;
        if (attachment.getBytes() != null) {
            byte[] bytes = attachment.getBytes();
            ensureAttachmentSizeLimit(bytes.length, j, attachment.getFilename());
            return bytes;
        }
        if (attachment.getSerializable() != null) {
            byte[] bArrBytesFrom = JsonSerializationUtils.bytesFrom(iSerializer, iLogger, attachment.getSerializable());
            if (bArrBytesFrom != null) {
                ensureAttachmentSizeLimit(bArrBytesFrom.length, j, attachment.getFilename());
                return bArrBytesFrom;
            }
        } else {
            if (attachment.getPathname() != null) {
                return FileUtils.readBytesFromFile(attachment.getPathname(), j);
            }
            if (attachment.getByteProvider() != null && (bArrCall = attachment.getByteProvider().call()) != null) {
                ensureAttachmentSizeLimit(bArrCall.length, j, attachment.getFilename());
                return bArrCall;
            }
        }
        throw new SentryEnvelopeException(AbstractC0486a1.h("Couldn't attach the attachment ", attachment.getFilename(), ".\nPlease check that either bytes, serializable, path or provider is set."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromAttachment$13(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromCheckIn$10(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromCheckIn$9(ISerializer iSerializer, CheckIn checkIn) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(checkIn, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromClientReport$21(ISerializer iSerializer, ClientReport clientReport) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(clientReport, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromClientReport$22(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromEvent$3(ISerializer iSerializer, SentryBaseEvent sentryBaseEvent) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(sentryBaseEvent, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromEvent$4(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromLogs$27(ISerializer iSerializer, SentryLogEvents sentryLogEvents) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(sentryLogEvents, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromLogs$28(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromProfileChunk$15(File file, ProfileChunk profileChunk, ISerializer iSerializer) throws SentryEnvelopeException {
        if (!file.exists()) {
            throw new SentryEnvelopeException(AbstractC0486a1.h("Dropping profile chunk, because the file '", file.getName(), "' doesn't exists"));
        }
        String strEncodeToString = Base64.encodeToString(FileUtils.readBytesFromFile(file.getPath(), MAX_PROFILE_CHUNK_SIZE), 3);
        if (strEncodeToString.isEmpty()) {
            throw new SentryEnvelopeException("Profiling trace file is empty");
        }
        profileChunk.setSampledProfile(strEncodeToString);
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                    try {
                        iSerializer.serialize(profileChunk, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e7) {
                throw new SentryEnvelopeException("Failed to serialize profile chunk\n" + e7.getMessage());
            }
        } catch (Throwable th5) {
            file.delete();
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromProfileChunk$16(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromProfilingTrace$18(File file, long j, ProfilingTraceData profilingTraceData, ISerializer iSerializer) throws SentryEnvelopeException {
        if (!file.exists()) {
            throw new SentryEnvelopeException(AbstractC0486a1.h("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
        }
        String strEncodeToString = Base64.encodeToString(FileUtils.readBytesFromFile(file.getPath(), j), 3);
        if (strEncodeToString.isEmpty()) {
            throw new SentryEnvelopeException("Profiling trace file is empty");
        }
        profilingTraceData.setSampledProfile(strEncodeToString);
        profilingTraceData.readDeviceCpuFrequencies();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                    try {
                        iSerializer.serialize(profilingTraceData, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e7) {
                throw new SentryEnvelopeException("Failed to serialize profiling trace data\n" + e7.getMessage());
            }
        } catch (Throwable th5) {
            file.delete();
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromProfilingTrace$19(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromReplay$24(ISerializer iSerializer, SentryReplayEvent sentryReplayEvent, ReplayRecording replayRecording, File file, ILogger iLogger, boolean z4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    iSerializer.serialize(sentryReplayEvent, bufferedWriter);
                    linkedHashMap.put(SentryItemType.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (replayRecording != null) {
                        iSerializer.serialize(replayRecording, bufferedWriter);
                        linkedHashMap.put(SentryItemType.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bytesFromFile = FileUtils.readBytesFromFile(file.getPath(), SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE);
                        if (bytesFromFile.length > 0) {
                            linkedHashMap.put(SentryItemType.ReplayVideo.getItemType(), bytesFromFile);
                        }
                    }
                    byte[] bArrSerializeToMsgpack = serializeToMsgpack(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z4) {
                            FileUtils.deleteRecursively(file.getParentFile());
                        } else {
                            file.delete();
                        }
                    }
                    return bArrSerializeToMsgpack;
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                iLogger.log(SentryLevel.ERROR, "Could not serialize replay recording", th5);
                return null;
            } finally {
                if (file != null) {
                    if (z4) {
                        FileUtils.deleteRecursively(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromReplay$25(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromSession$0(ISerializer iSerializer, Session session) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(session, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromSession$1(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromUserFeedback$6(ISerializer iSerializer, UserFeedback userFeedback) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(userFeedback, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromUserFeedback$7(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    private static byte[] serializeToMsgpack(Map<String, byte[]> map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                byte[] bytes = entry.getKey().getBytes(UTF_8);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] value = entry.getValue();
                int length2 = value.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(value);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public ClientReport getClientReport(ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            ClientReport clientReport = (ClientReport) iSerializer.deserialize(bufferedReader, ClientReport.class);
            bufferedReader.close();
            return clientReport;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public byte[] getData() {
        Callable<byte[]> callable;
        if (this.data == null && (callable = this.dataFactory) != null) {
            this.data = callable.call();
        }
        return this.data;
    }

    public SentryEvent getEvent(ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryEvent sentryEvent = (SentryEvent) iSerializer.deserialize(bufferedReader, SentryEvent.class);
            bufferedReader.close();
            return sentryEvent;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public SentryEnvelopeItemHeader getHeader() {
        return this.header;
    }

    public SentryLogEvents getLogs(ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryLogEvents sentryLogEvents = (SentryLogEvents) iSerializer.deserialize(bufferedReader, SentryLogEvents.class);
            bufferedReader.close();
            return sentryLogEvents;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public SentryTransaction getTransaction(ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryTransaction sentryTransaction = (SentryTransaction) iSerializer.deserialize(bufferedReader, SentryTransaction.class);
            bufferedReader.close();
            return sentryTransaction;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public SentryEnvelopeItem(SentryEnvelopeItemHeader sentryEnvelopeItemHeader, Callable<byte[]> callable) {
        this.header = (SentryEnvelopeItemHeader) Objects.requireNonNull(sentryEnvelopeItemHeader, "SentryEnvelopeItemHeader is required.");
        this.dataFactory = (Callable) Objects.requireNonNull(callable, "DataFactory is required.");
        this.data = null;
    }
}
