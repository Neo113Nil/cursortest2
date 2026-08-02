package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bç\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH&J\"\u0010\n\u001a\u00020\u000b*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\"\u0010\u000f\u001a\u00020\u000b*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\"\u0010\u0011\u001a\u00020\u000b*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\"\u0010\u0012\u001a\u00020\u000b*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasurePolicy;", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "minIntrinsicWidth", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicHeight", "width", "maxIntrinsicWidth", "maxIntrinsicHeight", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MeasurePolicy {
    /* renamed from: measure-3p2s80s */
    androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static int minIntrinsicWidth(androidx.compose.ui.layout.MeasurePolicy measurePolicy, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
            return androidx.compose.ui.layout.MeasurePolicy.super.minIntrinsicWidth(intrinsicMeasureScope, list, i);
        }

        @java.lang.Deprecated
        public static int minIntrinsicHeight(androidx.compose.ui.layout.MeasurePolicy measurePolicy, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
            return androidx.compose.ui.layout.MeasurePolicy.super.minIntrinsicHeight(intrinsicMeasureScope, list, i);
        }

        @java.lang.Deprecated
        public static int maxIntrinsicWidth(androidx.compose.ui.layout.MeasurePolicy measurePolicy, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
            return androidx.compose.ui.layout.MeasurePolicy.super.maxIntrinsicWidth(intrinsicMeasureScope, list, i);
        }

        @java.lang.Deprecated
        public static int maxIntrinsicHeight(androidx.compose.ui.layout.MeasurePolicy measurePolicy, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
            return androidx.compose.ui.layout.MeasurePolicy.super.maxIntrinsicHeight(intrinsicMeasureScope, list, i);
        }
    }

    default int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new androidx.compose.ui.layout.DefaultIntrinsicMeasurable(list.get(i2), androidx.compose.ui.layout.IntrinsicMinMax.Min, androidx.compose.ui.layout.IntrinsicWidthHeight.Width));
        }
        long Constraints$default = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null);
        return mo1095measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, Constraints$default).getWidth();
    }

    default int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new androidx.compose.ui.layout.DefaultIntrinsicMeasurable(list.get(i2), androidx.compose.ui.layout.IntrinsicMinMax.Min, androidx.compose.ui.layout.IntrinsicWidthHeight.Height));
        }
        long Constraints$default = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null);
        return mo1095measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, Constraints$default).getHeight();
    }

    default int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new androidx.compose.ui.layout.DefaultIntrinsicMeasurable(list.get(i2), androidx.compose.ui.layout.IntrinsicMinMax.Max, androidx.compose.ui.layout.IntrinsicWidthHeight.Width));
        }
        long Constraints$default = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null);
        return mo1095measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, Constraints$default).getWidth();
    }

    default int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new androidx.compose.ui.layout.DefaultIntrinsicMeasurable(list.get(i2), androidx.compose.ui.layout.IntrinsicMinMax.Max, androidx.compose.ui.layout.IntrinsicWidthHeight.Height));
        }
        long Constraints$default = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null);
        return mo1095measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, Constraints$default).getHeight();
    }
}
