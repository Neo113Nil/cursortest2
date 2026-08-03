package androidx.compose.ui.layout;

/* compiled from: LookaheadScope.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\f\u0010\r\u001a\u00020\u0004*\u00020\u0004H\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0018\u0010\t\u001a\u00020\u0004*\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/layout/LookaheadScopeImpl;", "Landroidx/compose/ui/layout/LookaheadScope;", "scopeCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "(Lkotlin/jvm/functions/Function0;)V", "getScopeCoordinates", "()Lkotlin/jvm/functions/Function0;", "setScopeCoordinates", "lookaheadScopeCoordinates", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "toLookaheadCoordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LookaheadScopeImpl implements androidx.compose.ui.layout.LookaheadScope {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> scopeCoordinates;

    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScopeImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-dBAh8RU */
    public /* synthetic */ long mo3406localLookaheadPositionOfdBAh8RU(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2) {
        long mo3410localPositionOfR5De75A;
        mo3410localPositionOfR5De75A = toLookaheadCoordinates(layoutCoordinates).mo3410localPositionOfR5De75A(toLookaheadCoordinates(layoutCoordinates2), androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
        return mo3410localPositionOfR5De75A;
    }

    public LookaheadScopeImpl(kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> function0) {
        this.scopeCoordinates = function0;
    }

    public /* synthetic */ LookaheadScopeImpl(kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    public final kotlin.jvm.functions.Function0<androidx.compose.ui.layout.LayoutCoordinates> getScopeCoordinates() {
        return this.scopeCoordinates;
    }

    public final void setScopeCoordinates(kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> function0) {
        this.scopeCoordinates = function0;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public androidx.compose.ui.layout.LayoutCoordinates toLookaheadCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.layout.LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        androidx.compose.ui.layout.LookaheadLayoutCoordinates lookaheadLayoutCoordinates2 = layoutCoordinates instanceof androidx.compose.ui.layout.LookaheadLayoutCoordinates ? (androidx.compose.ui.layout.LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates2 != null) {
            return lookaheadLayoutCoordinates2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = (androidx.compose.ui.node.NodeCoordinator) layoutCoordinates;
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? nodeCoordinator : lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public androidx.compose.ui.layout.LayoutCoordinates getLookaheadScopeCoordinates(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> function0 = this.scopeCoordinates;
        kotlin.jvm.internal.Intrinsics.checkNotNull(function0);
        return function0.invoke();
    }
}
