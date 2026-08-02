package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0015\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\n\u001a\u0015\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\u0003\u0010\r\u001a\u0015\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000e¢\u0006\u0004\b\u0003\u0010\u0010\u001a\u0015\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0011¢\u0006\u0004\b\u0003\u0010\u0013\u001a\u0015\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u0014¢\u0006\u0004\b\u0003\u0010\u0016\u001a\u0015\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u0017¢\u0006\u0004\b\u0003\u0010\u0019"}, d2 = {"", "array", "Lkotlin/collections/ByteIterator;", "iterator", "([B)Lkotlin/collections/ByteIterator;", "", "Lkotlin/collections/CharIterator;", "([C)Lkotlin/collections/CharIterator;", "", "Lkotlin/collections/ShortIterator;", "([S)Lkotlin/collections/ShortIterator;", "", "Lkotlin/collections/IntIterator;", "([I)Lkotlin/collections/IntIterator;", "", "Lkotlin/collections/LongIterator;", "([J)Lkotlin/collections/LongIterator;", "", "Lkotlin/collections/FloatIterator;", "([F)Lkotlin/collections/FloatIterator;", "", "Lkotlin/collections/DoubleIterator;", "([D)Lkotlin/collections/DoubleIterator;", "", "Lkotlin/collections/BooleanIterator;", "([Z)Lkotlin/collections/BooleanIterator;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrayIteratorsKt {
    public static final kotlin.collections.ByteIterator iterator(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return new kotlin.jvm.internal.ArrayByteIterator(bArr);
    }

    public static final kotlin.collections.CharIterator iterator(char[] cArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        return new kotlin.jvm.internal.ArrayCharIterator(cArr);
    }

    public static final kotlin.collections.ShortIterator iterator(short[] sArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sArr, "");
        return new kotlin.jvm.internal.ArrayShortIterator(sArr);
    }

    public static final kotlin.collections.IntIterator iterator(int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        return new kotlin.jvm.internal.ArrayIntIterator(iArr);
    }

    public static final kotlin.collections.LongIterator iterator(long[] jArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jArr, "");
        return new kotlin.jvm.internal.ArrayLongIterator(jArr);
    }

    public static final kotlin.collections.FloatIterator iterator(float[] fArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fArr, "");
        return new kotlin.jvm.internal.ArrayFloatIterator(fArr);
    }

    public static final kotlin.collections.DoubleIterator iterator(double[] dArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dArr, "");
        return new kotlin.jvm.internal.ArrayDoubleIterator(dArr);
    }

    public static final kotlin.collections.BooleanIterator iterator(boolean[] zArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zArr, "");
        return new kotlin.jvm.internal.ArrayBooleanIterator(zArr);
    }
}
