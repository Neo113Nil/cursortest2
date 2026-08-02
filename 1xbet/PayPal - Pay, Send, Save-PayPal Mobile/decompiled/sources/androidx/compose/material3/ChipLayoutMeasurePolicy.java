package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\r\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0014\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0015\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012"}, d2 = {"Landroidx/compose/material3/ChipLayoutMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "<init>", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "p0", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "minIntrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "maxIntrinsicHeight", "minIntrinsicWidth", "maxIntrinsicWidth"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChipLayoutMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        androidx.compose.ui.layout.Measurable measurable;
        androidx.compose.ui.layout.Measurable measurable2;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "leadingIcon")) {
                break;
            }
            i++;
        }
        androidx.compose.ui.layout.Measurable measurable3 = measurable;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable3 != null ? measurable3.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null)) : null;
        final int widthOrZero = androidx.compose.material3.internal.LayoutUtilKt.getWidthOrZero(mo7353measureBRTryo0);
        final int heightOrZero = androidx.compose.material3.internal.LayoutUtilKt.getHeightOrZero(mo7353measureBRTryo0);
        int size2 = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i2);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), "trailingIcon")) {
                break;
            }
            i2++;
        }
        androidx.compose.ui.layout.Measurable measurable4 = measurable2;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable4 != null ? measurable4.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null)) : null;
        int widthOrZero2 = androidx.compose.material3.internal.LayoutUtilKt.getWidthOrZero(mo7353measureBRTryo02);
        final int heightOrZero2 = androidx.compose.material3.internal.LayoutUtilKt.getHeightOrZero(mo7353measureBRTryo02);
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            androidx.compose.ui.layout.Measurable measurable5 = list.get(i3);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable5), "label")) {
                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo03 = measurable5.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8574offsetNN6EwU$default(j, -(widthOrZero + widthOrZero2), 0, 2, null));
                int width = mo7353measureBRTryo03.getWidth();
                final int max = java.lang.Math.max(heightOrZero, java.lang.Math.max(mo7353measureBRTryo03.getHeight(), heightOrZero2));
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width + widthOrZero + widthOrZero2, max, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ChipLayoutMeasurePolicy$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.ChipLayoutMeasurePolicy.getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable.this, heightOrZero, max, mo7353measureBRTryo03, widthOrZero, mo7353measureBRTryo02, heightOrZero2, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                    }
                }, 4, null);
            }
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(list.get(0).minIntrinsicHeight(i));
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(list.get(i2).minIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        java.lang.Integer num = valueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(list.get(0).maxIntrinsicHeight(i));
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(list.get(i2).maxIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        java.lang.Integer num = valueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += list.get(i3).minIntrinsicWidth(i);
        }
        return i2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += list.get(i3).maxIntrinsicWidth(i);
        }
        return i2;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable placeable, int i, int i2, androidx.compose.ui.layout.Placeable placeable2, int i3, androidx.compose.ui.layout.Placeable placeable3, int i4, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(i, i2), 0.0f, 4, null);
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, 0, 0.0f, 4, null);
        if (placeable3 != null) {
            int width = placeable2.getWidth();
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i3 + width, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(i4, i2), 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
