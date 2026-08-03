package androidx.compose.ui.layout;

/* compiled from: Placeable.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u001f\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"DefaultConstraints", "Landroidx/compose/ui/unit/Constraints;", "J", "DefaultLayerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "PlacementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "lookaheadCapablePlaceable", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "owner", "Landroidx/compose/ui/node/Owner;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaceableKt {
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> DefaultLayerBlock = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.ui.layout.PlaceableKt$DefaultLayerBlock$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
            invoke2(graphicsLayerScope);
            return kotlin.Unit.INSTANCE;
        }
    };
    private static final long DefaultConstraints = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    public static final androidx.compose.ui.layout.Placeable.PlacementScope PlacementScope(androidx.compose.ui.node.LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new androidx.compose.ui.layout.LookaheadCapablePlacementScope(lookaheadCapablePlaceable);
    }

    public static final androidx.compose.ui.layout.Placeable.PlacementScope PlacementScope(androidx.compose.ui.node.Owner owner) {
        return new androidx.compose.ui.layout.OuterPlacementScope(owner);
    }
}
