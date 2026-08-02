package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u0010\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0014\u001a\u00020\t2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0012¢\u0006\u0002\b\nH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015JO\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u00122\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0019\u001a\u00020!8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/material3/AppBarRowScopeImpl;", "Landroidx/compose/material3/AppBarRowScope;", "Landroidx/compose/material3/AppBarScope;", "Landroidx/compose/material3/AppBarItemProvider;", "Landroidx/compose/material3/AppBarScopeImpl;", "p0", "<init>", "(Landroidx/compose/material3/AppBarScopeImpl;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "p1", "", "p2", "", "p3", "clickableItem", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Z)V", "Lkotlin/Function1;", "Landroidx/compose/material3/AppBarMenuState;", "customItem", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "p4", "toggleableItem", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Z)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/material3/AppBarScopeImpl;", "Camera2StreamConfigurationMap", "", "Landroidx/compose/material3/AppBarItem;", "getItems", "()Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "", "getItemsCount", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppBarRowScopeImpl implements androidx.compose.material3.AppBarRowScope, androidx.compose.material3.AppBarScope, androidx.compose.material3.AppBarItemProvider {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.material3.AppBarScopeImpl Camera2StreamConfigurationMap;

    public AppBarRowScopeImpl(androidx.compose.material3.AppBarScopeImpl appBarScopeImpl) {
        this.Camera2StreamConfigurationMap = appBarScopeImpl;
    }

    @Override // androidx.compose.material3.AppBarScope
    public final void toggleableItem(boolean p0, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> p1, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> p2, java.lang.String p3, boolean p4) {
        this.Camera2StreamConfigurationMap.toggleableItem(p0, p1, p2, p3, p4);
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public final int getItemsCount() {
        return this.Camera2StreamConfigurationMap.getItemsCount();
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public final java.util.List<androidx.compose.material3.AppBarItem> getItems() {
        return this.Camera2StreamConfigurationMap.getItems();
    }

    @Override // androidx.compose.material3.AppBarScope
    public final void customItem(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> p0, kotlin.jvm.functions.Function3<? super androidx.compose.material3.AppBarMenuState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> p1) {
        this.Camera2StreamConfigurationMap.customItem(p0, p1);
    }

    @Override // androidx.compose.material3.AppBarScope
    public final void clickableItem(kotlin.jvm.functions.Function0<kotlin.Unit> p0, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> p1, java.lang.String p2, boolean p3) {
        this.Camera2StreamConfigurationMap.clickableItem(p0, p1, p2, p3);
    }
}
