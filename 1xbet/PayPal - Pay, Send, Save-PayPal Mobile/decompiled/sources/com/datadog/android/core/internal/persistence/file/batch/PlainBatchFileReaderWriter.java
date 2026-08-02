package com.datadog.android.core.internal.persistence.file.batch;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0003 !\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0007\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0011\u0010\u0018J'\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter;", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", "p0", "p1", "", "p2", "", "Camera2StreamConfigurationMap", "(IILjava/lang/String;)Z", "Ljava/io/InputStream;", "Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockType;", "Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockReadResult;", "getHighSpeedVideoFpsRanges", "(Ljava/io/InputStream;Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockType;)Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockReadResult;", "Ljava/io/File;", "file", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "readData", "(Ljava/io/File;)Ljava/util/List;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "append", "writeData", "(Ljava/io/File;Lcom/datadog/android/api/storage/RawBatchEvent;Z)Z", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizes", "Companion", "BlockReadResult", "BlockType"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlainBatchFileReaderWriter implements com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter {
    public static final java.lang.String ERROR_READ = "Unable to read data from file: %s";
    public static final java.lang.String ERROR_WRITE = "Unable to write data to file: %s";
    public static final int HEADER_SIZE_BYTES = 6;
    public static final int LENGTH_SIZE_BYTES = 4;
    public static final int TYPE_SIZE_BYTES = 2;
    public static final java.lang.String WARNING_NOT_ALL_DATA_READ = "File %s is probably corrupted, not all content was read.";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;

    public PlainBatchFileReaderWriter(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoSizes = internalLogger;
    }

    @Override // com.datadog.android.core.internal.persistence.file.batch.BatchFileReader
    public final java.util.List<com.datadog.android.api.storage.RawBatchEvent> readData(final java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        try {
            return getHighSpeedVideoFpsRanges(file);
        } catch (java.io.IOException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readData$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "Unable to read data from file: %s", java.util.Arrays.copyOf(new java.lang.Object[]{file.getPath()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return kotlin.collections.CollectionsKt.emptyList();
        } catch (java.lang.SecurityException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readData$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "Unable to read data from file: %s", java.util.Arrays.copyOf(new java.lang.Object[]{file.getPath()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }

    private final java.util.List<com.datadog.android.api.storage.RawBatchEvent> getHighSpeedVideoFpsRanges(final java.io.File p0) throws java.io.IOException {
        int lengthSafe = (int) com.datadog.android.core.internal.persistence.file.FileExtKt.lengthSafe(p0, this.getHighSpeedVideoSizes);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(p0), 8192);
        try {
            java.io.BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            int i = lengthSafe;
            while (true) {
                if (i <= 0) {
                    break;
                }
                com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockReadResult highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bufferedInputStream2, com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockType.META);
                if (highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges != null) {
                    com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockReadResult highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(bufferedInputStream2, com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockType.EVENT);
                    i -= highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor + highSpeedVideoFpsRanges2.getHighSpeedVideoFpsRangesFor;
                    if (highSpeedVideoFpsRanges2.getHighSpeedVideoFpsRanges == null) {
                        break;
                    }
                    arrayList.add(new com.datadog.android.api.storage.RawBatchEvent(highSpeedVideoFpsRanges2.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges));
                } else {
                    i -= highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                    break;
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(bufferedInputStream, null);
            if (i == 0 && (lengthSafe <= 0 || !arrayList.isEmpty())) {
                return arrayList;
            }
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readFileData$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.WARNING_NOT_ALL_DATA_READ, java.util.Arrays.copyOf(new java.lang.Object[]{p0.getPath()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return arrayList;
        } finally {
        }
    }

    private final com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockReadResult getHighSpeedVideoFpsRanges(java.io.InputStream p0, final com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockType p1) throws java.io.IOException {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(6);
        int read = p0.read(allocate.array());
        java.lang.String name2 = p1.name();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Block(");
        sb.append(name2);
        sb.append("): Header read");
        if (!Camera2StreamConfigurationMap(6, read, sb.toString())) {
            return new com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockReadResult(null, java.lang.Math.max(0, read));
        }
        final short s = allocate.getShort();
        if (s != p1.getHighSpeedVideoSizes) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$readBlock$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    short s2 = s;
                    com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockType blockType = p1;
                    short s3 = blockType.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected block type identifier=");
                    sb2.append((int) s2);
                    sb2.append(" met, was expecting ");
                    sb2.append(blockType);
                    sb2.append("(");
                    sb2.append((int) s3);
                    sb2.append(")");
                    return sb2.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return new com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockReadResult(null, read);
        }
        int i = allocate.getInt();
        byte[] bArr = new byte[i];
        int read2 = p0.read(bArr);
        java.lang.String name3 = p1.name();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Block(");
        sb2.append(name3);
        sb2.append("):Data read");
        if (Camera2StreamConfigurationMap(i, read2, sb2.toString())) {
            return new com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockReadResult(bArr, read + read2);
        }
        return new com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockReadResult(null, read + java.lang.Math.max(0, read2));
    }

    private final boolean Camera2StreamConfigurationMap(final int p0, final int p1, final java.lang.String p2) {
        if (p0 == p1) {
            return true;
        }
        if (p1 != -1) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$checkReadExpected$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String str = p2;
                    int i = p0;
                    int i2 = p1;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Number of bytes read for operation='");
                    sb.append(str);
                    sb.append("' doesn't match with expected: expected=");
                    sb.append(i);
                    sb.append(", actual=");
                    sb.append(i2);
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return false;
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$checkReadExpected$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return "Unexpected EOF at the operation=".concat(java.lang.String.valueOf(p2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        return false;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockReadResult;", "", "", "p0", "", "p1", "<init>", "([BI)V", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "[B", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class BlockReadResult {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final int getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final byte[] getHighSpeedVideoFpsRanges;

        public BlockReadResult(byte[] bArr, int i) {
            this.getHighSpeedVideoFpsRanges = bArr;
            this.getHighSpeedVideoFpsRangesFor = i;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\b"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/PlainBatchFileReaderWriter$BlockType;", "", "", "p0", "<init>", "(Ljava/lang/String;IS)V", "getHighSpeedVideoFpsRangesFor", "S", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
    enum BlockType {
        EVENT(0),
        META(1);


        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final short getHighSpeedVideoSizes;

        BlockType(short s) {
            this.getHighSpeedVideoSizes = s;
        }
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileWriter
    public final boolean writeData(final java.io.File file, com.datadog.android.api.storage.RawBatchEvent data, boolean append) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file, append);
            try {
                java.io.FileOutputStream fileOutputStream2 = fileOutputStream;
                java.nio.channels.FileLock lock = fileOutputStream2.getChannel().lock();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lock, "");
                try {
                    byte[] metadata = data.getMetadata();
                    java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(metadata.length + 6 + data.getData().length + 6);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allocate, "");
                    java.nio.ByteBuffer put = allocate.putShort(com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockType.META.getHighSpeedVideoSizes).putInt(metadata.length).put(metadata);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(put, "");
                    com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockType blockType = com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter.BlockType.EVENT;
                    byte[] data2 = data.getData();
                    java.nio.ByteBuffer put2 = put.putShort(blockType.getHighSpeedVideoSizes).putInt(data2.length).put(data2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(put2, "");
                    fileOutputStream2.write(put2.array());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    lock.release();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                    return true;
                } catch (java.lang.Throwable th) {
                    lock.release();
                    throw th;
                }
            } finally {
            }
        } catch (java.io.IOException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf(com.datadog.android.api.InternalLogger.Target.MAINTAINER), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$writeData$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "Unable to write data to file: %s", java.util.Arrays.copyOf(new java.lang.Object[]{file.getPath()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return false;
        } catch (java.lang.SecurityException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter$writeData$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "Unable to write data to file: %s", java.util.Arrays.copyOf(new java.lang.Object[]{file.getPath()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return false;
        }
    }
}
