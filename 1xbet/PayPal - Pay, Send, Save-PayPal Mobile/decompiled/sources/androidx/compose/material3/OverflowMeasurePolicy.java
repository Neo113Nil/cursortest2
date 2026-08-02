package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u0010*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/material3/OverflowMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Landroidx/compose/material3/AppBarOverflowState;", "overflowState", "", "maxItemCount", "", "isVertical", "<init>", "(Landroidx/compose/material3/AppBarOverflowState;IZ)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/material3/AppBarOverflowState;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getMaxItemCount", "()I", "getHighSpeedVideoFpsRanges", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OverflowMeasurePolicy implements androidx.compose.ui.layout.MultiContentMeasurePolicy {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.material3.AppBarOverflowState Camera2StreamConfigurationMap;
    private final int maxItemCount;

    public OverflowMeasurePolicy(androidx.compose.material3.AppBarOverflowState appBarOverflowState, int i, boolean z) {
        this.Camera2StreamConfigurationMap = appBarOverflowState;
        this.maxItemCount = i;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public /* synthetic */ OverflowMeasurePolicy(androidx.compose.material3.AppBarOverflowState appBarOverflowState, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(appBarOverflowState, i, (i2 & 4) != 0 ? false : z);
    }

    public final int getMaxItemCount() {
        return this.maxItemCount;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1663measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.Measurable>> list, long j) {
        java.lang.Integer valueOf;
        int intValue;
        final java.util.ArrayList arrayList;
        java.lang.Integer valueOf2;
        int intValue2;
        java.lang.Integer valueOf3;
        int i;
        int max;
        java.lang.Integer valueOf4;
        java.lang.Integer valueOf5;
        int i2;
        java.lang.Integer valueOf6;
        java.lang.Integer valueOf7;
        long m8545copyZbe2FdA$default;
        java.lang.Integer valueOf8;
        long m8545copyZbe2FdA$default2 = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        boolean z = false;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list.get(0);
        int i3 = 1;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list3 = list.get(1);
        this.Camera2StreamConfigurationMap.setTotalItemCount(list2.size());
        if (this.getHighSpeedVideoFpsRangesFor) {
            if (list3.isEmpty()) {
                valueOf8 = null;
            } else {
                valueOf8 = java.lang.Integer.valueOf(list3.get(0).maxIntrinsicHeight(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j)));
                int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list3);
                if (lastIndex > 0) {
                    int i4 = 1;
                    while (true) {
                        java.lang.Integer valueOf9 = java.lang.Integer.valueOf(list3.get(i4).maxIntrinsicHeight(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j)));
                        if (valueOf9.compareTo(valueOf8) > 0) {
                            valueOf8 = valueOf9;
                        }
                        if (i4 == lastIndex) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            java.lang.Integer num = valueOf8;
            if (num != null) {
                intValue = num.intValue();
            }
            intValue = 0;
        } else {
            if (list3.isEmpty()) {
                valueOf = null;
            } else {
                valueOf = java.lang.Integer.valueOf(list3.get(0).maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j)));
                int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(list3);
                if (lastIndex2 > 0) {
                    int i5 = 1;
                    while (true) {
                        java.lang.Integer valueOf10 = java.lang.Integer.valueOf(list3.get(i5).maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j)));
                        if (valueOf10.compareTo(valueOf) > 0) {
                            valueOf = valueOf10;
                        }
                        if (i5 == lastIndex2) {
                            break;
                        }
                        i5++;
                    }
                }
            }
            java.lang.Integer num2 = valueOf;
            if (num2 != null) {
                intValue = num2.intValue();
            }
            intValue = 0;
        }
        int subtractConstraintSafely = androidx.compose.material3.internal.LayoutUtilKt.subtractConstraintSafely(this.getHighSpeedVideoFpsRangesFor ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), intValue);
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = list2.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = list2.get(i6).mo7353measureBRTryo0(m8545copyZbe2FdA$default2);
            boolean z2 = i6 == kotlin.collections.CollectionsKt.getLastIndex(list2) ? true : z;
            if (!z2 && i6 == this.maxItemCount - 1) {
                break;
            }
            int height = this.getHighSpeedVideoFpsRangesFor ? mo7353measureBRTryo0.getHeight() : mo7353measureBRTryo0.getWidth();
            if (height > subtractConstraintSafely && (!z2 || height > subtractConstraintSafely + intValue)) {
                break;
            }
            arrayList2.add(mo7353measureBRTryo0);
            i7 += height;
            subtractConstraintSafely = androidx.compose.material3.internal.LayoutUtilKt.subtractConstraintSafely(subtractConstraintSafely, height);
            i6++;
            z = false;
        }
        this.Camera2StreamConfigurationMap.setVisibleItemCount(arrayList2.size());
        if (arrayList2.size() != list2.size()) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(m8545copyZbe2FdA$default2, 0, 0, 0, subtractConstraintSafely + intValue, 7, null);
            } else {
                m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(m8545copyZbe2FdA$default2, 0, subtractConstraintSafely + intValue, 0, 0, 13, null);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list3.size());
            int size2 = list3.size();
            for (int i8 = 0; i8 < size2; i8++) {
                arrayList3.add(list3.get(i8).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    valueOf7 = null;
                } else {
                    valueOf7 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList.get(0)).getHeight());
                    int lastIndex3 = kotlin.collections.CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex3 > 0) {
                        int i9 = 1;
                        while (true) {
                            java.lang.Integer valueOf11 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList.get(i9)).getHeight());
                            if (valueOf11.compareTo(valueOf7) > 0) {
                                valueOf7 = valueOf11;
                            }
                            if (i9 == lastIndex3) {
                                break;
                            }
                            i9++;
                        }
                    }
                }
                java.lang.Integer num3 = valueOf7;
                if (num3 != null) {
                    intValue2 = num3.intValue();
                }
            }
            intValue2 = 0;
        } else {
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    valueOf2 = null;
                } else {
                    valueOf2 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList.get(0)).getWidth());
                    int lastIndex4 = kotlin.collections.CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex4 > 0) {
                        int i10 = 1;
                        while (true) {
                            java.lang.Integer valueOf12 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList.get(i10)).getWidth());
                            if (valueOf12.compareTo(valueOf2) > 0) {
                                valueOf2 = valueOf12;
                            }
                            if (i10 == lastIndex4) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
                java.lang.Integer num4 = valueOf2;
                if (num4 != null) {
                    intValue2 = num4.intValue();
                }
            }
            intValue2 = 0;
        }
        int i11 = i7 + intValue2;
        if (this.getHighSpeedVideoFpsRangesFor) {
            if (arrayList2.isEmpty()) {
                valueOf5 = null;
            } else {
                valueOf5 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList2.get(0)).getWidth());
                int lastIndex5 = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
                if (lastIndex5 > 0) {
                    int i12 = 1;
                    while (true) {
                        java.lang.Integer valueOf13 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList2.get(i12)).getWidth());
                        if (valueOf13.compareTo(valueOf5) > 0) {
                            valueOf5 = valueOf13;
                        }
                        if (i12 == lastIndex5) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            java.lang.Integer num5 = valueOf5;
            int intValue3 = num5 != null ? num5.intValue() : 0;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    valueOf6 = null;
                } else {
                    valueOf6 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList.get(0)).getWidth());
                    int lastIndex6 = kotlin.collections.CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex6 > 0) {
                        while (true) {
                            java.lang.Integer valueOf14 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList.get(i3)).getWidth());
                            if (valueOf14.compareTo(valueOf6) > 0) {
                                valueOf6 = valueOf14;
                            }
                            if (i3 == lastIndex6) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
                java.lang.Integer num6 = valueOf6;
                if (num6 != null) {
                    i2 = num6.intValue();
                    max = java.lang.Math.max(intValue3, i2);
                }
            }
            i2 = 0;
            max = java.lang.Math.max(intValue3, i2);
        } else {
            if (arrayList2.isEmpty()) {
                valueOf3 = null;
            } else {
                valueOf3 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList2.get(0)).getHeight());
                int lastIndex7 = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
                if (lastIndex7 > 0) {
                    int i13 = 1;
                    while (true) {
                        java.lang.Integer valueOf15 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList2.get(i13)).getHeight());
                        if (valueOf15.compareTo(valueOf3) > 0) {
                            valueOf3 = valueOf15;
                        }
                        if (i13 == lastIndex7) {
                            break;
                        }
                        i13++;
                    }
                }
            }
            java.lang.Integer num7 = valueOf3;
            int intValue4 = num7 != null ? num7.intValue() : 0;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    i = 0;
                    valueOf4 = null;
                } else {
                    i = 0;
                    valueOf4 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList.get(0)).getHeight());
                    int lastIndex8 = kotlin.collections.CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex8 > 0) {
                        while (true) {
                            java.lang.Integer valueOf16 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList.get(i3)).getHeight());
                            if (valueOf16.compareTo(valueOf4) > 0) {
                                valueOf4 = valueOf16;
                            }
                            if (i3 == lastIndex8) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
                java.lang.Integer num8 = valueOf4;
                if (num8 != null) {
                    i = num8.intValue();
                }
            } else {
                i = 0;
            }
            max = java.lang.Math.max(intValue4, i);
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, max), androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, i11), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.OverflowMeasurePolicy$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.OverflowMeasurePolicy.m3590$r8$lambda$rcD27sJo8sj_ghG7EUSgPaRA_M(arrayList2, arrayList, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, i11), androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, max), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.OverflowMeasurePolicy$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.OverflowMeasurePolicy.m3591$r8$lambda$zUi2ulHi80FZglBdQRdI8tyrjI(arrayList2, arrayList, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* renamed from: $r8$lambda$rcD27sJo8sj_-ghG7EUSgPaRA_M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3590$r8$lambda$rcD27sJo8sj_ghG7EUSgPaRA_M(java.util.List list, java.util.List list2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(i2);
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i, 0.0f, 4, null);
            i += placeable.getHeight();
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list2.get(i3), 0, i, 0.0f, 4, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zUi2ulHi80FZglBdQRd-I8tyrjI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3591$r8$lambda$zUi2ulHi80FZglBdQRdI8tyrjI(java.util.List list, java.util.List list2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(i2);
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, 0, 0.0f, 4, null);
            i += placeable.getWidth();
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list2.get(i3), i, 0, 0.0f, 4, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
