package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AlertDialogKt$AlertDialogFlowRow$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1 alertDialogKt$AlertDialogFlowRow$1$1;
        int max;
        androidx.compose.ui.layout.Placeable placeable;
        float f;
        long j2;
        kotlin.jvm.internal.Ref.IntRef intRef;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        kotlin.jvm.internal.Ref.IntRef intRef3;
        kotlin.jvm.internal.Ref.IntRef intRef4;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        float f2;
        java.util.ArrayList arrayList3;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        final java.util.ArrayList arrayList6 = new java.util.ArrayList();
        kotlin.jvm.internal.Ref.IntRef intRef5 = new kotlin.jvm.internal.Ref.IntRef();
        kotlin.jvm.internal.Ref.IntRef intRef6 = new kotlin.jvm.internal.Ref.IntRef();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        kotlin.jvm.internal.Ref.IntRef intRef7 = new kotlin.jvm.internal.Ref.IntRef();
        kotlin.jvm.internal.Ref.IntRef intRef8 = new kotlin.jvm.internal.Ref.IntRef();
        long Constraints$default = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), 0, 0, 13, null);
        float f3 = this.getHighSpeedVideoFpsRangesFor;
        float f4 = this.getHighSpeedVideoFpsRanges;
        int size = list2.size();
        int i = 0;
        while (i < size) {
            int i2 = size;
            androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = list2.get(i).mo7353measureBRTryo0(Constraints$default);
            if (arrayList7.isEmpty()) {
                placeable = mo7353measureBRTryo0;
                f = f4;
                j2 = Constraints$default;
                intRef = intRef8;
                intRef2 = intRef7;
                intRef3 = intRef6;
                intRef4 = intRef5;
                arrayList = arrayList4;
                arrayList2 = arrayList5;
                f2 = f3;
                arrayList3 = arrayList7;
            } else {
                f = f4;
                if (intRef7.element + measureScope.mo1412roundToPx0680j_4(f3) + mo7353measureBRTryo0.getWidth() > androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j)) {
                    placeable = mo7353measureBRTryo0;
                    arrayList = arrayList4;
                    f2 = f3;
                    j2 = Constraints$default;
                    intRef = intRef8;
                    java.util.ArrayList arrayList8 = arrayList5;
                    intRef2 = intRef7;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList7;
                    intRef3 = intRef6;
                    intRef4 = intRef5;
                    getHighSpeedVideoFpsRanges(arrayList4, intRef6, measureScope, f, arrayList7, arrayList8, intRef, arrayList6, intRef5, intRef2);
                } else {
                    j2 = Constraints$default;
                    intRef = intRef8;
                    intRef2 = intRef7;
                    intRef3 = intRef6;
                    intRef4 = intRef5;
                    arrayList2 = arrayList5;
                    placeable = mo7353measureBRTryo0;
                    arrayList3 = arrayList7;
                    arrayList = arrayList4;
                    f2 = f3;
                }
            }
            kotlin.jvm.internal.Ref.IntRef intRef9 = intRef2;
            if (!arrayList3.isEmpty()) {
                intRef9.element += measureScope.mo1412roundToPx0680j_4(f2);
            }
            arrayList3.add(placeable);
            intRef9.element += placeable.getWidth();
            kotlin.jvm.internal.Ref.IntRef intRef10 = intRef;
            intRef10.element = java.lang.Math.max(intRef10.element, placeable.getHeight());
            i++;
            list2 = list;
            intRef8 = intRef10;
            intRef7 = intRef9;
            f3 = f2;
            arrayList7 = arrayList3;
            f4 = f;
            size = i2;
            arrayList4 = arrayList;
            Constraints$default = j2;
            arrayList5 = arrayList2;
            intRef6 = intRef3;
            intRef5 = intRef4;
        }
        kotlin.jvm.internal.Ref.IntRef intRef11 = intRef6;
        kotlin.jvm.internal.Ref.IntRef intRef12 = intRef5;
        final java.util.ArrayList arrayList9 = arrayList4;
        java.util.ArrayList arrayList10 = arrayList5;
        kotlin.jvm.internal.Ref.IntRef intRef13 = intRef7;
        java.util.ArrayList arrayList11 = arrayList7;
        kotlin.jvm.internal.Ref.IntRef intRef14 = intRef8;
        if (arrayList11.isEmpty()) {
            alertDialogKt$AlertDialogFlowRow$1$1 = this;
        } else {
            alertDialogKt$AlertDialogFlowRow$1$1 = this;
            getHighSpeedVideoFpsRanges(arrayList9, intRef11, measureScope, alertDialogKt$AlertDialogFlowRow$1$1.getHighSpeedVideoFpsRanges, arrayList11, arrayList10, intRef14, arrayList6, intRef12, intRef13);
        }
        if (androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) != Integer.MAX_VALUE) {
            max = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        } else {
            max = java.lang.Math.max(intRef12.element, androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j));
        }
        final int i3 = max;
        int max2 = java.lang.Math.max(intRef11.element, androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j));
        final float f5 = alertDialogKt$AlertDialogFlowRow$1$1.getHighSpeedVideoFpsRangesFor;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, i3, max2, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1.getHighSpeedVideoFpsRanges(arrayList9, measureScope, f5, i3, arrayList6, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(java.util.List list, androidx.compose.ui.layout.MeasureScope measureScope, float f, int i, java.util.List list2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
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
            androidx.compose.foundation.layout.Arrangement.INSTANCE.getBottom().arrange(measureScope, i, iArr, iArr2);
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) list3.get(i4), iArr2[i4], ((java.lang.Number) list2.get(i2)).intValue(), 0.0f, 4, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    AlertDialogKt$AlertDialogFlowRow$1$1(float f, float f2) {
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoFpsRanges = f2;
    }
}
