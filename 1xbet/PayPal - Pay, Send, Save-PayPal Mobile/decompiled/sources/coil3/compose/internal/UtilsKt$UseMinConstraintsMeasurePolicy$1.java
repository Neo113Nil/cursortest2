package coil3.compose.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class UtilsKt$UseMinConstraintsMeasurePolicy$1 implements androidx.compose.ui.layout.MeasurePolicy {
    public static final coil3.compose.internal.UtilsKt$UseMinConstraintsMeasurePolicy$1 Camera2StreamConfigurationMap = new coil3.compose.internal.UtilsKt$UseMinConstraintsMeasurePolicy$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), null, new kotlin.jvm.functions.Function1() { // from class: coil3.compose.internal.UtilsKt$UseMinConstraintsMeasurePolicy$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = coil3.compose.internal.UtilsKt$UseMinConstraintsMeasurePolicy$1.getHighResolutionOutputSizeshNQ4ISI();
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, 4, null);
    }

    UtilsKt$UseMinConstraintsMeasurePolicy$1() {
    }
}
