package com.datadog.android.core.internal.persistence.tlvformat;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlock;", "", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "type", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;[BLcom/datadog/android/api/InternalLogger;)V", "", "maxEntrySize", "serialize$dd_sdk_android_core_release", "(I)[B", "[B", "getData", "()[B", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "getType", "()Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TLVBlock {
    public static final java.lang.String BYTE_LENGTH_EXCEEDED_ERROR = "DataBlock length exceeds limit of %s bytes, was %s";
    private final byte[] data;
    private final com.datadog.android.api.InternalLogger internalLogger;
    private final com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType type;

    public TLVBlock(com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType tLVBlockType, byte[] bArr, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tLVBlockType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.type = tLVBlockType;
        this.data = bArr;
        this.internalLogger = internalLogger;
    }

    public final com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType getType() {
        return this.type;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    public static /* synthetic */ byte[] serialize$dd_sdk_android_core_release$default(com.datadog.android.core.internal.persistence.tlvformat.TLVBlock tLVBlock, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = com.datadog.android.sessionreplay.internal.utils.DrawableUtils.MAX_BITMAP_SIZE_BYTES_WITH_RESOURCE_ENDPOINT;
        }
        return tLVBlock.serialize$dd_sdk_android_core_release(i);
    }

    public final byte[] serialize$dd_sdk_android_core_release(final int maxEntrySize) {
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return null;
        }
        int length = bArr.length;
        final int i = length + 6;
        if (i <= maxEntrySize) {
            return java.nio.ByteBuffer.allocate(i).putShort(this.type.getRawValue()).putInt(length).put(this.data).array();
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.tlvformat.TLVBlock$logEntrySizeExceededError$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.persistence.tlvformat.TLVBlock.BYTE_LENGTH_EXCEEDED_ERROR, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(maxEntrySize), java.lang.Integer.valueOf(i)}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        return null;
    }
}
