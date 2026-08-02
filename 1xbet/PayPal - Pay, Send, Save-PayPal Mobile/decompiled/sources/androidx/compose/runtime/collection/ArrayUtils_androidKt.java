package androidx.compose.runtime.collection;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aN\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "", "destination", "", "destinationOffset", "startIndex", "endIndex", "fastCopyInto", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ArrayUtils_androidKt {
    public static final <T> T[] fastCopyInto(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        java.lang.System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }
}
