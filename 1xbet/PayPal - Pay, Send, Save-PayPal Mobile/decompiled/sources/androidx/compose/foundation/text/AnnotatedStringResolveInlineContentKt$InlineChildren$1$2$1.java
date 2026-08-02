package androidx.compose.foundation.text;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    public static final androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1 getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).mo7353measureBRTryo0(j));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1.getHighSpeedVideoFpsRanges(arrayList2, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoFpsRanges;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(java.util.List list, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i), 0, 0, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1() {
    }
}
