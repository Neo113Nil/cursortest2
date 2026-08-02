package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class AlertDialogKt$AlertDialogFlowRow$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d1 A[SYNTHETIC] */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        androidx.compose.ui.layout.Placeable placeable;
        int i;
        int i2;
        float f;
        float f2;
        kotlin.jvm.internal.Ref.IntRef intRef;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        kotlin.jvm.internal.Ref.IntRef intRef3;
        kotlin.jvm.internal.Ref.IntRef intRef4;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        kotlin.jvm.internal.Ref.IntRef intRef5 = new kotlin.jvm.internal.Ref.IntRef();
        kotlin.jvm.internal.Ref.IntRef intRef6 = new kotlin.jvm.internal.Ref.IntRef();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        kotlin.jvm.internal.Ref.IntRef intRef7 = new kotlin.jvm.internal.Ref.IntRef();
        kotlin.jvm.internal.Ref.IntRef intRef8 = new kotlin.jvm.internal.Ref.IntRef();
        float f3 = this.getHighSpeedVideoFpsRanges;
        float f4 = this.getHighSpeedVideoFpsRangesFor;
        int size = list2.size();
        int i3 = 0;
        while (i3 < size) {
            java.util.ArrayList arrayList7 = arrayList4;
            java.util.ArrayList arrayList8 = arrayList5;
            androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = list2.get(i3).mo7353measureBRTryo0(j);
            if (arrayList6.isEmpty()) {
                placeable = mo7353measureBRTryo0;
                i = i3;
                i2 = size;
                f = f4;
                f2 = f3;
                intRef = intRef8;
                intRef2 = intRef7;
                intRef3 = intRef6;
                intRef4 = intRef5;
                arrayList = arrayList3;
            } else {
                i = i3;
                if (intRef7.element + measureScope.mo1412roundToPx0680j_4(f3) + mo7353measureBRTryo0.getWidth() > androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j)) {
                    placeable = mo7353measureBRTryo0;
                    i2 = size;
                    f = f4;
                    f2 = f3;
                    intRef = intRef8;
                    intRef2 = intRef7;
                    arrayList = arrayList3;
                    arrayList2 = arrayList6;
                    intRef3 = intRef6;
                    intRef4 = intRef5;
                    getHighSpeedVideoFpsRanges(arrayList3, intRef6, measureScope, f4, arrayList6, arrayList7, intRef, arrayList8, intRef5, intRef2);
                    kotlin.jvm.internal.Ref.IntRef intRef9 = intRef2;
                    if (arrayList2.isEmpty()) {
                        intRef9.element += measureScope.mo1412roundToPx0680j_4(f2);
                    }
                    arrayList2.add(placeable);
                    intRef9.element += placeable.getWidth();
                    intRef.element = java.lang.Math.max(intRef.element, placeable.getHeight());
                    i3 = i + 1;
                    list2 = list;
                    intRef7 = intRef9;
                    arrayList6 = arrayList2;
                    f3 = f2;
                    intRef8 = intRef;
                    arrayList4 = arrayList7;
                    arrayList5 = arrayList8;
                    size = i2;
                    f4 = f;
                    arrayList3 = arrayList;
                    intRef6 = intRef3;
                    intRef5 = intRef4;
                } else {
                    f = f4;
                    f2 = f3;
                    intRef = intRef8;
                    intRef2 = intRef7;
                    intRef3 = intRef6;
                    intRef4 = intRef5;
                    arrayList = arrayList3;
                    placeable = mo7353measureBRTryo0;
                    i2 = size;
                }
            }
            arrayList2 = arrayList6;
            kotlin.jvm.internal.Ref.IntRef intRef92 = intRef2;
            if (arrayList2.isEmpty()) {
            }
            arrayList2.add(placeable);
            intRef92.element += placeable.getWidth();
            intRef.element = java.lang.Math.max(intRef.element, placeable.getHeight());
            i3 = i + 1;
            list2 = list;
            intRef7 = intRef92;
            arrayList6 = arrayList2;
            f3 = f2;
            intRef8 = intRef;
            arrayList4 = arrayList7;
            arrayList5 = arrayList8;
            size = i2;
            f4 = f;
            arrayList3 = arrayList;
            intRef6 = intRef3;
            intRef5 = intRef4;
        }
        kotlin.jvm.internal.Ref.IntRef intRef10 = intRef6;
        kotlin.jvm.internal.Ref.IntRef intRef11 = intRef5;
        final java.util.ArrayList arrayList9 = arrayList3;
        java.util.ArrayList arrayList10 = arrayList4;
        final java.util.ArrayList arrayList11 = arrayList5;
        kotlin.jvm.internal.Ref.IntRef intRef12 = intRef8;
        kotlin.jvm.internal.Ref.IntRef intRef13 = intRef7;
        java.util.ArrayList arrayList12 = arrayList6;
        if (!arrayList12.isEmpty()) {
            getHighSpeedVideoFpsRanges(arrayList9, intRef10, measureScope, this.getHighSpeedVideoFpsRangesFor, arrayList12, arrayList10, intRef12, arrayList11, intRef11, intRef13);
        }
        final int max = java.lang.Math.max(intRef11.element, androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j));
        int max2 = java.lang.Math.max(intRef10.element, androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j));
        final float f5 = this.getHighSpeedVideoFpsRanges;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, max, max2, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1.getHighSpeedVideoFpsRangesFor(arrayList9, measureScope, f5, max, arrayList11, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    private static final void getHighSpeedVideoFpsRanges(java.util.List<java.util.List<androidx.compose.ui.layout.Placeable>> list, kotlin.jvm.internal.Ref.IntRef intRef, androidx.compose.ui.layout.MeasureScope measureScope, float f, java.util.List<androidx.compose.ui.layout.Placeable> list2, java.util.List<java.lang.Integer> list3, kotlin.jvm.internal.Ref.IntRef intRef2, java.util.List<java.lang.Integer> list4, kotlin.jvm.internal.Ref.IntRef intRef3, kotlin.jvm.internal.Ref.IntRef intRef4) {
        if (!list.isEmpty()) {
            intRef.element += measureScope.mo1412roundToPx0680j_4(f);
        }
        list.add(0, kotlin.collections.CollectionsKt.toList(list2));
        list3.add(java.lang.Integer.valueOf(intRef2.element));
        list4.add(java.lang.Integer.valueOf(intRef.element));
        intRef.element += intRef2.element;
        intRef3.element = java.lang.Math.max(intRef3.element, intRef4.element);
        list2.clear();
        intRef4.element = 0;
        intRef2.element = 0;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.util.List list, androidx.compose.ui.layout.MeasureScope measureScope, float f, int i, java.util.List list2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.List list3 = (java.util.List) list.get(i2);
            int size2 = list3.size();
            int[] iArr = new int[size2];
            int i3 = 0;
            while (i3 < size2) {
                iArr[i3] = ((androidx.compose.ui.layout.Placeable) list3.get(i3)).getWidth() + (i3 < kotlin.collections.CollectionsKt.getLastIndex(list3) ? measureScope.mo1412roundToPx0680j_4(f) : 0);
                i3++;
            }
            int[] iArr2 = new int[size2];
            androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd().arrange(measureScope, i, iArr, measureScope.getLayoutDirection(), iArr2);
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) list3.get(i4), iArr2[i4], ((java.lang.Number) list2.get(i2)).intValue(), 0.0f, 4, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    AlertDialogKt$AlertDialogFlowRow$1$1(float f, float f2) {
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
    }
}
