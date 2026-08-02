package com.datadog.android.core.internal.persistence.tlvformat;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "fileReaderWriter", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;)V", "Ljava/io/File;", "file", "", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlock;", "read$dd_sdk_android_core_release", "(Ljava/io/File;)Ljava/util/List;", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "getFileReaderWriter", "()Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "Companion", "TLVResult"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TLVBlockFileReader {
    public static final java.lang.String CORRUPT_TLV_HEADER_TYPE_ERROR = "TLV header corrupt. Invalid type %s";
    public static final java.lang.String FAILED_TO_DESERIALIZE_ERROR = "Failed to deserialize TLV data length";
    private final com.datadog.android.core.internal.persistence.file.FileReaderWriter fileReaderWriter;
    private final com.datadog.android.api.InternalLogger internalLogger;

    public TLVBlockFileReader(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.persistence.file.FileReaderWriter fileReaderWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileReaderWriter, "");
        this.internalLogger = internalLogger;
        this.fileReaderWriter = fileReaderWriter;
    }

    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    public final com.datadog.android.core.internal.persistence.file.FileReaderWriter getFileReaderWriter() {
        return this.fileReaderWriter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7 A[LOOP:0: B:2:0x0019->B:16:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0 A[EDGE_INSN: B:17:0x00c0->B:18:0x00c0 BREAK  A[LOOP:0: B:2:0x0019->B:16:0x00b7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<com.datadog.android.core.internal.persistence.tlvformat.TLVBlock> read$dd_sdk_android_core_release(java.io.File file) {
        com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader.TLVResult tLVResult;
        com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader.TLVResult tLVResult2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        byte[] readData = this.fileReaderWriter.readData(file);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i < readData.length) {
            int i2 = i + 2;
            com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader.TLVResult tLVResult3 = null;
            if (i2 <= readData.length) {
                final short s = com.datadog.android.core.internal.utils.ByteArrayExtKt.toShort(com.datadog.android.core.internal.utils.ByteArrayExtKt.copyOfRangeSafe(readData, i, i2));
                com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType m10012fromValuexj2QHRw = com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType.INSTANCE.m10012fromValuexj2QHRw(kotlin.UShort.m23518constructorimpl(s));
                if (m10012fromValuexj2QHRw != null) {
                    tLVResult = new com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader.TLVResult(m10012fromValuexj2QHRw, i2);
                    if (tLVResult != null) {
                        int i3 = tLVResult.getHighSpeedVideoSizes;
                        int i4 = i3 + 4;
                        if (i4 <= readData.length) {
                            int i5 = com.datadog.android.core.internal.utils.ByteArrayExtKt.toInt(com.datadog.android.core.internal.utils.ByteArrayExtKt.copyOfRangeSafe(readData, i3, i4)) + i4;
                            tLVResult2 = new com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader.TLVResult(com.datadog.android.core.internal.utils.ByteArrayExtKt.copyOfRangeSafe(readData, i4, i5), i5);
                        } else {
                            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader$logFailedToDeserializeError$1
                                @Override // kotlin.jvm.functions.Function0
                                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                                public final java.lang.String invoke() {
                                    return com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader.FAILED_TO_DESERIALIZE_ERROR;
                                }
                            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                            tLVResult2 = null;
                        }
                        if (tLVResult2 != null) {
                            tLVResult3 = new com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader.TLVResult(new com.datadog.android.core.internal.persistence.tlvformat.TLVBlock((com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType) tLVResult.getHighResolutionOutputSizeshNQ4ISI, (byte[]) tLVResult2.getHighResolutionOutputSizeshNQ4ISI, this.internalLogger), tLVResult2.getHighSpeedVideoSizes);
                        }
                    }
                    if (tLVResult3 != null) {
                        break;
                    }
                    arrayList.add(tLVResult3.getHighResolutionOutputSizeshNQ4ISI);
                    i = tLVResult3.getHighSpeedVideoSizes;
                } else {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader$logTypeCorruptionError$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader.CORRUPT_TLV_HEADER_TYPE_ERROR, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Short.valueOf(s)}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                }
            } else {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader$logFailedToDeserializeError$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader.FAILED_TO_DESERIALIZE_ERROR;
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
            tLVResult = null;
            if (tLVResult != null) {
            }
            if (tLVResult3 != null) {
            }
        }
        return arrayList;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00028\u00008\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0010\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader$TLVResult;", "", "T", "p0", "", "p1", "<init>", "(Ljava/lang/Object;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class TLVResult<T> {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final int getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final T getHighResolutionOutputSizeshNQ4ISI;

        public TLVResult(T t, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
            this.getHighResolutionOutputSizeshNQ4ISI = t;
            this.getHighSpeedVideoSizes = i;
        }

        public final java.lang.String toString() {
            T t = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TLVResult(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(t);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoSizes);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader.TLVResult)) {
                return false;
            }
            com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader.TLVResult tLVResult = (com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader.TLVResult) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, tLVResult.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoSizes == tLVResult.getHighSpeedVideoSizes;
        }
    }
}
