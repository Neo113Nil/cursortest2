package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/nio/ByteBuffer;", "p0", "", "xor", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V", "", "getOUTGOING_CHANNEL_CAPACITY", "()I", "getHighResolutionOutputSizeshNQ4ISI"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "io/ktor/websocket/UtilsKt")
/* loaded from: classes17.dex */
final /* synthetic */ class UtilsKt__UtilsJvmKt {
    public static final void xor(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer2, "");
        java.nio.ByteBuffer slice = byteBuffer.slice();
        java.nio.ByteBuffer slice2 = byteBuffer2.slice();
        int remaining = slice2.remaining();
        int remaining2 = slice.remaining();
        for (int i = 0; i < remaining2; i++) {
            slice.put(i, (byte) (slice.get(i) ^ slice2.get(i % remaining)));
        }
    }

    public static final int getOUTGOING_CHANNEL_CAPACITY() {
        java.lang.String property = java.lang.System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        if (property != null) {
            return java.lang.Integer.parseInt(property);
        }
        return 8;
    }
}
