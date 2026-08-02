package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "", "", "positions", "sizes", "<init>", "([I[I)V", "[I", "getPositions", "()[I", "getSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridSlots {
    public static final int $stable = 8;
    private final int[] positions;
    private final int[] sizes;

    public LazyStaggeredGridSlots(int[] iArr, int[] iArr2) {
        this.positions = iArr;
        this.sizes = iArr2;
    }

    public final int[] getPositions() {
        return this.positions;
    }

    public final int[] getSizes() {
        return this.sizes;
    }
}
