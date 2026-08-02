package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0005H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "p0", "xor", "(BB)B", "", "", "flagAt", "(ZI)I"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "io/ktor/websocket/UtilsKt")
/* loaded from: classes17.dex */
final /* synthetic */ class UtilsKt__UtilsKt {
    public static final int flagAt(boolean z, int i) {
        if (z) {
            return 1 << i;
        }
        return 0;
    }

    public static final byte xor(byte b, byte b2) {
        return (byte) (b ^ b2);
    }
}
