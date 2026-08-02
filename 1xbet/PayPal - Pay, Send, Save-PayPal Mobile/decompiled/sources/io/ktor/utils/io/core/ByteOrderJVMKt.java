package io.ktor.utils.io.core;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteOrderJVMKt {
    public static final /* synthetic */ io.ktor.utils.io.core.ByteOrder access$orderOf(java.nio.ByteOrder byteOrder) {
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            return io.ktor.utils.io.core.ByteOrder.BIG_ENDIAN;
        }
        return io.ktor.utils.io.core.ByteOrder.LITTLE_ENDIAN;
    }
}
