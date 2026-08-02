package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AlertDialogKt$AlertDialogBaselineLayout$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    public static final androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1 getHighSpeedVideoSizes = new androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1();

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        androidx.compose.ui.layout.Measurable measurable;
        androidx.compose.ui.layout.Measurable measurable2;
        int i;
        int i2;
        long j2;
        final int i3;
        int i4;
        long j3;
        int i5;
        final int i6;
        long j4;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i7);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "title")) {
                break;
            }
            i7++;
        }
        androidx.compose.ui.layout.Measurable measurable3 = measurable;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable3 != null ? measurable3.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null)) : null;
        int size2 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i8);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), "text")) {
                break;
            }
            i8++;
        }
        androidx.compose.ui.layout.Measurable measurable4 = measurable2;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable4 != null ? measurable4.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null)) : null;
        int max = java.lang.Math.max(mo7353measureBRTryo0 != null ? mo7353measureBRTryo0.getWidth() : 0, mo7353measureBRTryo02 != null ? mo7353measureBRTryo02.getWidth() : 0);
        if (mo7353measureBRTryo0 != null) {
            int intValue = java.lang.Integer.valueOf(mo7353measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline())).intValue();
            java.lang.Integer valueOf = intValue == Integer.MIN_VALUE ? null : java.lang.Integer.valueOf(intValue);
            if (valueOf != null) {
                i = valueOf.intValue();
                if (mo7353measureBRTryo0 != null) {
                    int i9 = mo7353measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                    java.lang.Integer valueOf2 = i9 == Integer.MIN_VALUE ? null : java.lang.Integer.valueOf(i9);
                    if (valueOf2 != null) {
                        i2 = valueOf2.intValue();
                        j2 = androidx.compose.material.AlertDialogKt.getHighSpeedVideoFpsRanges;
                        i3 = measureScope.mo1411roundToPxR2X_6o(j2) - i;
                        if (mo7353measureBRTryo02 != null) {
                            int i10 = mo7353measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                            java.lang.Integer valueOf3 = i10 != Integer.MIN_VALUE ? java.lang.Integer.valueOf(i10) : null;
                            if (valueOf3 != null) {
                                i4 = valueOf3.intValue();
                                if (mo7353measureBRTryo0 != null) {
                                    j4 = androidx.compose.material.AlertDialogKt.getHighSpeedVideoFpsRangesFor;
                                    i5 = measureScope.mo1411roundToPxR2X_6o(j4);
                                } else {
                                    j3 = androidx.compose.material.AlertDialogKt.getHighSpeedVideoSizes;
                                    i5 = measureScope.mo1411roundToPxR2X_6o(j3);
                                }
                                int height = mo7353measureBRTryo0 == null ? mo7353measureBRTryo0.getHeight() + i3 : 0;
                                if (mo7353measureBRTryo0 != null) {
                                    i6 = i5 - i4;
                                } else {
                                    i6 = (i2 == 0 ? height - i4 : (i3 + i2) - i4) + i5;
                                }
                                if (mo7353measureBRTryo02 != null) {
                                    if (i2 == 0) {
                                        r4 = (mo7353measureBRTryo02.getHeight() + i5) - i4;
                                    } else {
                                        r4 = ((mo7353measureBRTryo02.getHeight() + i5) - i4) - ((mo7353measureBRTryo0 != null ? mo7353measureBRTryo0.getHeight() : 0) - i2);
                                    }
                                }
                                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, max, r4 + height, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1.getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.this, i3, mo7353measureBRTryo02, i6, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                                    }
                                }, 4, null);
                            }
                        }
                        i4 = 0;
                        if (mo7353measureBRTryo0 != null) {
                        }
                        if (mo7353measureBRTryo0 == null) {
                        }
                        if (mo7353measureBRTryo0 != null) {
                        }
                        if (mo7353measureBRTryo02 != null) {
                        }
                        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, max, r4 + height, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1.getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.this, i3, mo7353measureBRTryo02, i6, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                            }
                        }, 4, null);
                    }
                }
                i2 = 0;
                j2 = androidx.compose.material.AlertDialogKt.getHighSpeedVideoFpsRanges;
                i3 = measureScope.mo1411roundToPxR2X_6o(j2) - i;
                if (mo7353measureBRTryo02 != null) {
                }
                i4 = 0;
                if (mo7353measureBRTryo0 != null) {
                }
                if (mo7353measureBRTryo0 == null) {
                }
                if (mo7353measureBRTryo0 != null) {
                }
                if (mo7353measureBRTryo02 != null) {
                }
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, max, r4 + height, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1.getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.this, i3, mo7353measureBRTryo02, i6, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                    }
                }, 4, null);
            }
        }
        i = 0;
        if (mo7353measureBRTryo0 != null) {
        }
        i2 = 0;
        j2 = androidx.compose.material.AlertDialogKt.getHighSpeedVideoFpsRanges;
        i3 = measureScope.mo1411roundToPxR2X_6o(j2) - i;
        if (mo7353measureBRTryo02 != null) {
        }
        i4 = 0;
        if (mo7353measureBRTryo0 != null) {
        }
        if (mo7353measureBRTryo0 == null) {
        }
        if (mo7353measureBRTryo0 != null) {
        }
        if (mo7353measureBRTryo02 != null) {
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, max, r4 + height, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1.getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.this, i3, mo7353measureBRTryo02, i6, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable placeable, int i, androidx.compose.ui.layout.Placeable placeable2, int i2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, i, 0.0f, 4, null);
        }
        if (placeable2 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable2, 0, i2, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    AlertDialogKt$AlertDialogBaselineLayout$2$1() {
    }
}
