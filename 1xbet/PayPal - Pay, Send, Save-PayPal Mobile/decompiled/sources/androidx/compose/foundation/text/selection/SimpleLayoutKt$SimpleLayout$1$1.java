package androidx.compose.foundation.text.selection;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SimpleLayoutKt$SimpleLayout$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    public static final androidx.compose.foundation.text.selection.SimpleLayoutKt$SimpleLayout$1$1 getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.text.selection.SimpleLayoutKt$SimpleLayout$1$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = list.get(i3).mo7353measureBRTryo0(j);
            i = java.lang.Math.max(i, mo7353measureBRTryo0.getWidth());
            i2 = java.lang.Math.max(i2, mo7353measureBRTryo0.getHeight());
            arrayList.add(mo7353measureBRTryo0);
        }
        final java.util.ArrayList arrayList2 = arrayList;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, i, i2, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SimpleLayoutKt$SimpleLayout$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.text.selection.SimpleLayoutKt$SimpleLayout$1$1.getHighSpeedVideoFpsRanges(arrayList2, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoFpsRanges;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(java.util.List list, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i), 0, 0, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    SimpleLayoutKt$SimpleLayout$1$1() {
    }
}
