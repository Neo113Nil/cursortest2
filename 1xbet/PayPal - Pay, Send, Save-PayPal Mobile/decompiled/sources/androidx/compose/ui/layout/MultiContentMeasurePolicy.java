package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bæ\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\b*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000e*\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00032\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\u00020\u000e*\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00032\u0006\u0010\u0012\u001a\u00020\u000eH&¢\u0006\u0004\b\u0013\u0010\u0011J/\u0010\u0014\u001a\u00020\u000e*\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00032\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0014\u0010\u0011J/\u0010\u0015\u001a\u00020\u000e*\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00032\u0006\u0010\u0012\u001a\u00020\u000eH&¢\u0006\u0004\b\u0015\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MultiContentMeasurePolicy {
    /* renamed from: measure-3p2s80s */
    androidx.compose.ui.layout.MeasureResult mo1663measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.Measurable>> list, long j);

    default int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.ArrayList arrayList2 = arrayList;
            java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list2 = list.get(i2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new androidx.compose.ui.layout.DefaultIntrinsicMeasurable(list2.get(i3), androidx.compose.ui.layout.IntrinsicMinMax.Min, androidx.compose.ui.layout.IntrinsicWidthHeight.Width));
            }
            arrayList2.add(arrayList3);
        }
        return mo1663measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    default int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.ArrayList arrayList2 = arrayList;
            java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list2 = list.get(i2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new androidx.compose.ui.layout.DefaultIntrinsicMeasurable(list2.get(i3), androidx.compose.ui.layout.IntrinsicMinMax.Min, androidx.compose.ui.layout.IntrinsicWidthHeight.Height));
            }
            arrayList2.add(arrayList3);
        }
        return mo1663measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.ArrayList arrayList2 = arrayList;
            java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list2 = list.get(i2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new androidx.compose.ui.layout.DefaultIntrinsicMeasurable(list2.get(i3), androidx.compose.ui.layout.IntrinsicMinMax.Max, androidx.compose.ui.layout.IntrinsicWidthHeight.Width));
            }
            arrayList2.add(arrayList3);
        }
        return mo1663measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    default int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.ArrayList arrayList2 = arrayList;
            java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list2 = list.get(i2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new androidx.compose.ui.layout.DefaultIntrinsicMeasurable(list2.get(i3), androidx.compose.ui.layout.IntrinsicMinMax.Max, androidx.compose.ui.layout.IntrinsicWidthHeight.Height));
            }
            arrayList2.add(arrayList3);
        }
        return mo1663measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }
}
