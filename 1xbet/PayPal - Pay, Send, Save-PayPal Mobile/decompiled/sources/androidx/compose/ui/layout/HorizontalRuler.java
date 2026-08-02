package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B*\b\u0002\u0012\u001f\u0010\u0006\u001a\u001b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/layout/HorizontalRuler;", "Landroidx/compose/ui/layout/Ruler;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "()V", "coordinate", "Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "targetCoordinates", "calculateCoordinate$ui", "(FLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)F", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HorizontalRuler extends androidx.compose.ui.layout.Ruler {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.layout.HorizontalRuler.Companion INSTANCE = new androidx.compose.ui.layout.HorizontalRuler.Companion(null);

    private HorizontalRuler(kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.Placeable.PlacementScope, ? super java.lang.Float, java.lang.Float> function2) {
        super(function2, null);
    }

    public HorizontalRuler() {
        this(null);
    }

    @Override // androidx.compose.ui.layout.Ruler
    public final float calculateCoordinate$ui(float coordinate, androidx.compose.ui.layout.LayoutCoordinates sourceCoordinates, androidx.compose.ui.layout.LayoutCoordinates targetCoordinates) {
        return java.lang.Float.intBitsToFloat((int) (targetCoordinates.mo7362localPositionOfR5De75A(sourceCoordinates, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(((int) (sourceCoordinates.mo7361getSizeYbymL2g() >> 32)) / 2.0f) << 32) | (java.lang.Float.floatToRawIntBits(coordinate) & 4294967295L))) & 4294967295L));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\t\u0010\bJ1\u0010\u0010\u001a\u00020\u00052\"\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/layout/HorizontalRuler$Companion;", "", "<init>", "()V", "", "Landroidx/compose/ui/layout/HorizontalRuler;", "rulers", "maxOf", "([Landroidx/compose/ui/layout/HorizontalRuler;)Landroidx/compose/ui/layout/HorizontalRuler;", "minOf", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ParameterName;", "Lkotlin/ExtensionFunctionType;", "calculation", "derived", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/HorizontalRuler;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.layout.HorizontalRuler maxOf(final androidx.compose.ui.layout.HorizontalRuler... rulers) {
            return new androidx.compose.ui.layout.HorizontalRuler(new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.Placeable.PlacementScope, java.lang.Float, java.lang.Float>() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$maxOf$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Float invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, java.lang.Float f) {
                    return getHighSpeedVideoFpsRangesFor(placementScope, f.floatValue());
                }

                public final java.lang.Float getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, float f) {
                    float highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.ui.layout.RulerKt.getHighSpeedVideoFpsRangesFor(placementScope, true, rulers, f);
                    return java.lang.Float.valueOf(highSpeedVideoFpsRangesFor);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            }, null);
        }

        public final androidx.compose.ui.layout.HorizontalRuler minOf(final androidx.compose.ui.layout.HorizontalRuler... rulers) {
            return new androidx.compose.ui.layout.HorizontalRuler(new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.Placeable.PlacementScope, java.lang.Float, java.lang.Float>() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$minOf$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Float invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, java.lang.Float f) {
                    return getHighResolutionOutputSizeshNQ4ISI(placementScope, f.floatValue());
                }

                public final java.lang.Float getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, float f) {
                    float highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.ui.layout.RulerKt.getHighSpeedVideoFpsRangesFor(placementScope, false, rulers, f);
                    return java.lang.Float.valueOf(highSpeedVideoFpsRangesFor);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            }, null);
        }

        public final androidx.compose.ui.layout.HorizontalRuler derived(kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.Placeable.PlacementScope, ? super java.lang.Float, java.lang.Float> calculation) {
            return new androidx.compose.ui.layout.HorizontalRuler(calculation, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HorizontalRuler(kotlin.jvm.functions.Function2 function2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }
}
