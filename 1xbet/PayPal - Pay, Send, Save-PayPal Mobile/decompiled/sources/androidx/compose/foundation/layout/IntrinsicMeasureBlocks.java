package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "<init>", "()V", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "availableHeight", "mainAxisSpacing", "HorizontalMinWidth", "(Ljava/util/List;II)I", "VerticalMinWidth", "availableWidth", "HorizontalMinHeight", "VerticalMinHeight", "HorizontalMaxWidth", "VerticalMaxWidth", "HorizontalMaxHeight", "VerticalMaxHeight"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntrinsicMeasureBlocks {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.layout.IntrinsicMeasureBlocks INSTANCE = new androidx.compose.foundation.layout.IntrinsicMeasureBlocks();

    private IntrinsicMeasureBlocks() {
    }

    public final int HorizontalMinWidth(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = measurables.get(i3);
            float weight = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(availableHeight);
            if (weight == 0.0f) {
                i2 += minIntrinsicWidth;
            } else if (weight > 0.0f) {
                f += weight;
                i = java.lang.Math.max(i, java.lang.Math.round(minIntrinsicWidth / weight));
            }
        }
        return java.lang.Math.round(i * f) + i2 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int VerticalMinWidth(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int availableHeight, int mainAxisSpacing) {
        int round;
        if (measurables.isEmpty()) {
            return 0;
        }
        int min = java.lang.Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list = measurables;
        int size = list.size();
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = measurables.get(i2);
            float weight = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = java.lang.Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableHeight - min);
                min += min2;
                i = java.lang.Math.max(i, intrinsicMeasurable.minIntrinsicWidth(min2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f == 0.0f) {
            round = 0;
        } else {
            round = availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(availableHeight - min, 0) / f);
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = measurables.get(i3);
            float weight2 = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i = java.lang.Math.max(i, intrinsicMeasurable2.minIntrinsicWidth(round != Integer.MAX_VALUE ? java.lang.Math.round(round * weight2) : Integer.MAX_VALUE));
            }
        }
        return i;
    }

    public final int HorizontalMinHeight(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int availableWidth, int mainAxisSpacing) {
        int round;
        if (measurables.isEmpty()) {
            return 0;
        }
        int min = java.lang.Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list = measurables;
        int size = list.size();
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = measurables.get(i2);
            float weight = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = java.lang.Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableWidth - min);
                min += min2;
                i = java.lang.Math.max(i, intrinsicMeasurable.minIntrinsicHeight(min2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f == 0.0f) {
            round = 0;
        } else {
            round = availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(availableWidth - min, 0) / f);
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = measurables.get(i3);
            float weight2 = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i = java.lang.Math.max(i, intrinsicMeasurable2.minIntrinsicHeight(round != Integer.MAX_VALUE ? java.lang.Math.round(round * weight2) : Integer.MAX_VALUE));
            }
        }
        return i;
    }

    public final int VerticalMinHeight(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = measurables.get(i3);
            float weight = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(availableWidth);
            if (weight == 0.0f) {
                i2 += minIntrinsicHeight;
            } else if (weight > 0.0f) {
                f += weight;
                i = java.lang.Math.max(i, java.lang.Math.round(minIntrinsicHeight / weight));
            }
        }
        return java.lang.Math.round(i * f) + i2 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int HorizontalMaxWidth(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = measurables.get(i3);
            float weight = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(availableHeight);
            if (weight == 0.0f) {
                i2 += maxIntrinsicWidth;
            } else if (weight > 0.0f) {
                f += weight;
                i = java.lang.Math.max(i, java.lang.Math.round(maxIntrinsicWidth / weight));
            }
        }
        return java.lang.Math.round(i * f) + i2 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int VerticalMaxWidth(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int availableHeight, int mainAxisSpacing) {
        int round;
        if (measurables.isEmpty()) {
            return 0;
        }
        int min = java.lang.Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list = measurables;
        int size = list.size();
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = measurables.get(i2);
            float weight = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = java.lang.Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableHeight - min);
                min += min2;
                i = java.lang.Math.max(i, intrinsicMeasurable.maxIntrinsicWidth(min2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f == 0.0f) {
            round = 0;
        } else {
            round = availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(availableHeight - min, 0) / f);
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = measurables.get(i3);
            float weight2 = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i = java.lang.Math.max(i, intrinsicMeasurable2.maxIntrinsicWidth(round != Integer.MAX_VALUE ? java.lang.Math.round(round * weight2) : Integer.MAX_VALUE));
            }
        }
        return i;
    }

    public final int HorizontalMaxHeight(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int availableWidth, int mainAxisSpacing) {
        int round;
        if (measurables.isEmpty()) {
            return 0;
        }
        int min = java.lang.Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list = measurables;
        int size = list.size();
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = measurables.get(i2);
            float weight = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = java.lang.Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableWidth - min);
                min += min2;
                i = java.lang.Math.max(i, intrinsicMeasurable.maxIntrinsicHeight(min2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f == 0.0f) {
            round = 0;
        } else {
            round = availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(availableWidth - min, 0) / f);
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = measurables.get(i3);
            float weight2 = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i = java.lang.Math.max(i, intrinsicMeasurable2.maxIntrinsicHeight(round != Integer.MAX_VALUE ? java.lang.Math.round(round * weight2) : Integer.MAX_VALUE));
            }
        }
        return i;
    }

    public final int VerticalMaxHeight(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = measurables.get(i3);
            float weight = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(availableWidth);
            if (weight == 0.0f) {
                i2 += maxIntrinsicHeight;
            } else if (weight > 0.0f) {
                f += weight;
                i = java.lang.Math.max(i, java.lang.Math.round(maxIntrinsicHeight / weight));
            }
        }
        return java.lang.Math.round(i * f) + i2 + ((measurables.size() - 1) * mainAxisSpacing);
    }
}
