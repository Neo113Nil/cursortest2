package androidx.compose.material.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ androidx.compose.material.internal.PopupLayout Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.unit.LayoutDirection getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        this.Camera2StreamConfigurationMap.setParentLayoutDirection(this.getHighResolutionOutputSizeshNQ4ISI);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, 0, 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }, 4, null);
    }

    ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1(androidx.compose.material.internal.PopupLayout popupLayout, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.Camera2StreamConfigurationMap = popupLayout;
        this.getHighResolutionOutputSizeshNQ4ISI = layoutDirection;
    }
}
