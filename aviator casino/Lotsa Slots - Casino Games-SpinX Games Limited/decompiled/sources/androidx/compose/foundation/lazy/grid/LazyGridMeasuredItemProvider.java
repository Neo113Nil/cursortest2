package androidx.compose.foundation.lazy.grid;

/* compiled from: LazyGridMeasuredItemProvider.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ@\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J*\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "measureScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "defaultMainAxisSpacing", "", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;I)V", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "createItem", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, com.ironsource.X3.i.W, com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "crossAxisSize", "mainAxisSpacing", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "getAndMeasure", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getAndMeasure-3p2s80s", "(IIJ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredItemProvider {
    public static final int $stable = 0;
    private final int defaultMainAxisSpacing;
    private final androidx.compose.foundation.lazy.grid.LazyGridItemProvider itemProvider;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope measureScope;

    public abstract androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem createItem(int index, java.lang.Object key, java.lang.Object contentType, int crossAxisSize, int mainAxisSpacing, java.util.List<? extends androidx.compose.ui.layout.Placeable> placeables);

    public LazyGridMeasuredItemProvider(androidx.compose.foundation.lazy.grid.LazyGridItemProvider lazyGridItemProvider, androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, int i) {
        this.itemProvider = lazyGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.defaultMainAxisSpacing = i;
    }

    /* renamed from: getAndMeasure-3p2s80s$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem m709getAndMeasure3p2s80s$default(androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i, int i2, long j, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-3p2s80s");
        }
        if ((i3 & 2) != 0) {
            i2 = lazyGridMeasuredItemProvider.defaultMainAxisSpacing;
        }
        return lazyGridMeasuredItemProvider.m710getAndMeasure3p2s80s(i, i2, j);
    }

    /* renamed from: getAndMeasure-3p2s80s, reason: not valid java name */
    public final androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem m710getAndMeasure3p2s80s(int index, int mainAxisSpacing, long constraints) {
        int m4425getMinHeightimpl;
        java.lang.Object key = this.itemProvider.getKey(index);
        java.lang.Object contentType = this.itemProvider.getContentType(index);
        java.util.List<androidx.compose.ui.layout.Placeable> mo732measure0kLqBqw = this.measureScope.mo732measure0kLqBqw(index, constraints);
        if (androidx.compose.ui.unit.Constraints.m4422getHasFixedWidthimpl(constraints)) {
            m4425getMinHeightimpl = androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(constraints);
        } else {
            if (!androidx.compose.ui.unit.Constraints.m4421getHasFixedHeightimpl(constraints)) {
                throw new java.lang.IllegalArgumentException("does not have fixed height".toString());
            }
            m4425getMinHeightimpl = androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(constraints);
        }
        return createItem(index, key, contentType, m4425getMinHeightimpl, mainAxisSpacing, mo732measure0kLqBqw);
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
