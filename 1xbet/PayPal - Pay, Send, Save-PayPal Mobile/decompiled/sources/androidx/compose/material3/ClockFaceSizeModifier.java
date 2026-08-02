package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\f\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/material3/ClockFaceSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "<init>", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClockFaceSizeModifier implements androidx.compose.ui.layout.LayoutModifier {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo2052measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        float f;
        float f2;
        float clockDialMinContainerSize;
        float f3 = measureScope.mo1415toDpu2uoSUM(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j));
        f = androidx.compose.material3.TimePickerKt.toString;
        if (androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(f3, f) >= 0) {
            clockDialMinContainerSize = androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.m5106getClockDialContainerSizeD9Ej5fM();
        } else {
            f2 = androidx.compose.material3.TimePickerKt.getValidOutputFormatsForInputhNQ4ISI;
            if (androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(f3, f2) >= 0) {
                clockDialMinContainerSize = androidx.compose.material3.TimePickerKt.getHighSpeedVideoFpsRangesFor;
            } else {
                clockDialMinContainerSize = androidx.compose.material3.TimePickerKt.getClockDialMinContainerSize();
            }
        }
        int i = measureScope.mo1412roundToPx0680j_4(clockDialMinContainerSize);
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(i, i));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ClockFaceSizeModifier$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.ClockFaceSizeModifier.$r8$lambda$nsyiTYOq3Ay9TjB0yOIg7V4riF0(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nsyiTYOq3Ay9TjB0yOIg7V4riF0(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
