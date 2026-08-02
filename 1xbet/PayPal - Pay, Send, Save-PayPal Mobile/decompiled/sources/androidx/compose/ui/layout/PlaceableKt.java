package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\u0007\"%\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "lookaheadCapablePlaceable", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "PlacementScope", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;)Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/node/Owner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "(Landroidx/compose/ui/node/Owner;)Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/unit/Constraints;", "getHighResolutionOutputSizeshNQ4ISI", "J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaceableKt {
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> Camera2StreamConfigurationMap = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.ui.layout.PlaceableKt$DefaultLayerBlock$1
        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
            getHighResolutionOutputSizeshNQ4ISI(graphicsLayerScope);
            return kotlin.Unit.INSTANCE;
        }
    };
    private static final long getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    public static final androidx.compose.ui.layout.Placeable.PlacementScope PlacementScope(androidx.compose.ui.node.LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new androidx.compose.ui.layout.LookaheadCapablePlacementScope(lookaheadCapablePlaceable);
    }

    public static final androidx.compose.ui.layout.Placeable.PlacementScope PlacementScope(androidx.compose.ui.node.Owner owner) {
        return new androidx.compose.ui.layout.OuterPlacementScope(owner);
    }
}
