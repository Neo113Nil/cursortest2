package com.datadog.android.core.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u0007"}, d2 = {"", "", "toByteArray", "(I)[B", "", "(J)[B", "", "(S)[B"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NumberExtKt {
    public static final byte[] toByteArray(short s) {
        byte[] array = java.nio.ByteBuffer.allocate(2).putShort(s).array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "");
        return array;
    }

    public static final byte[] toByteArray(int i) {
        byte[] array = java.nio.ByteBuffer.allocate(4).putInt(i).array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "");
        return array;
    }

    public static final byte[] toByteArray(long j) {
        byte[] array = java.nio.ByteBuffer.allocate(8).putLong(j).array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "");
        return array;
    }
}
