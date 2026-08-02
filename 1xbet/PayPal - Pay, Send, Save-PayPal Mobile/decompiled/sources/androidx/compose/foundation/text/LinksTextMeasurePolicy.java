package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000f\u001a\u00020\f*\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/text/LinksTextMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function0;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class LinksTextMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    public LinksTextMeasurePolicy(kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, final java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.LinksTextMeasurePolicy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.text.LinksTextMeasurePolicy.getHighSpeedVideoSizes(list, this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoSizes;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(java.util.List list, androidx.compose.foundation.text.LinksTextMeasurePolicy linksTextMeasurePolicy, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        java.util.List highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.foundation.text.BasicTextKt.getHighSpeedVideoSizes((java.util.List<? extends androidx.compose.ui.layout.Measurable>) list, (kotlin.jvm.functions.Function0<java.lang.Boolean>) linksTextMeasurePolicy.getHighResolutionOutputSizeshNQ4ISI);
        if (highSpeedVideoSizes != null) {
            int size = highSpeedVideoSizes.size();
            for (int i = 0; i < size; i++) {
                kotlin.Pair pair = (kotlin.Pair) highSpeedVideoSizes.get(i);
                androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) pair.component1();
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) pair.component2();
                androidx.compose.ui.layout.Placeable.PlacementScope.m7415place70tqf50$default(placementScope, placeable, function0 != null ? ((androidx.compose.ui.unit.IntOffset) function0.invoke()).m8738unboximpl() : androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac(), 0.0f, 2, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
