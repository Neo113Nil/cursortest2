package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "Ljava/util/UUID;", "convertByteToUUID", "([B)Ljava/util/UUID;", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, "convertUUIDToByte", "(Ljava/util/UUID;)[B"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UUIDUtil {
    public static final java.util.UUID convertByteToUUID(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        return new java.util.UUID(wrap.getLong(), wrap.getLong());
    }

    public static final byte[] convertUUIDToByte(java.util.UUID uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        byte[] array = wrap.array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "");
        return array;
    }
}
