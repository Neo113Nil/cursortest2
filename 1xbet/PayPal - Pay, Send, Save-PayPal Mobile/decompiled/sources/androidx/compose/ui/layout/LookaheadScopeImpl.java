package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R\u0018\u0010\u0010\u001a\u00020\u0003*\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/layout/LookaheadScopeImpl;", "Landroidx/compose/ui/layout/LookaheadScope;", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "scopeCoordinates", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "toLookaheadCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Lkotlin/jvm/functions/Function0;", "getScopeCoordinates", "()Lkotlin/jvm/functions/Function0;", "setScopeCoordinates", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LookaheadScopeImpl implements androidx.compose.ui.layout.LookaheadScope {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> scopeCoordinates;

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
    public final androidx.compose.ui.layout.LayoutCoordinates toLookaheadCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.layout.LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        androidx.compose.ui.layout.LookaheadLayoutCoordinates lookaheadLayoutCoordinates2 = layoutCoordinates instanceof androidx.compose.ui.layout.LookaheadLayoutCoordinates ? (androidx.compose.ui.layout.LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates2 != null) {
            return lookaheadLayoutCoordinates2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates, "");
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = (androidx.compose.ui.node.NodeCoordinator) layoutCoordinates;
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? nodeCoordinator : lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public final androidx.compose.ui.layout.LayoutCoordinates getLookaheadScopeCoordinates(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> function0 = this.scopeCoordinates;
        kotlin.jvm.internal.Intrinsics.checkNotNull(function0);
        return function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScopeImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
