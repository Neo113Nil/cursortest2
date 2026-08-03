package coil.compose;

/* compiled from: SubcomposeAsyncImage.kt */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2 implements androidx.compose.ui.layout.MeasurePolicy {
    public static final coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2 INSTANCE = new coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2();

    SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2() {
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit measure_3p2s80s$lambda$0(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), null, new kotlin.jvm.functions.Function1() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit measure_3p2s80s$lambda$0;
                measure_3p2s80s$lambda$0 = coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2.measure_3p2s80s$lambda$0((androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            }
        }, 4, null);
    }
}
