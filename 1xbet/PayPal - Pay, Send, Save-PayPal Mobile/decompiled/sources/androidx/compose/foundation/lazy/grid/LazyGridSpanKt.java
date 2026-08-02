package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "currentLineSpan", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "GridItemSpan", "(I)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridSpanKt {
    public static final long GridItemSpan(int i) {
        if (i <= 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("The span value should be higher than 0");
        }
        return androidx.compose.foundation.lazy.grid.GridItemSpan.m1804constructorimpl(i);
    }
}
