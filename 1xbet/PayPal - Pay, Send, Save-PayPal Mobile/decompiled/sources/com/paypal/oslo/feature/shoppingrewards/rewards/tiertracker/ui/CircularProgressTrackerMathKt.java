package com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "pointsEarned", "", "", "milestones", "", "goldArcPosition", "computeProgress", "(ILjava/util/List;F)F"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CircularProgressTrackerMathKt {
    public static /* synthetic */ float computeProgress$default(int i, java.util.List list, float f, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.75f;
        }
        return computeProgress(i, list, f);
    }

    public static final float computeProgress(int i, java.util.List<java.lang.String> list, float f) {
        java.util.ArrayList arrayList;
        float f2;
        float f3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<java.lang.String> list2 = list;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerKt.parseMilestoneValue((java.lang.String) it.next(), 1000)));
        }
        java.util.List sorted = kotlin.collections.CollectionsKt.sorted(arrayList2);
        if (sorted.isEmpty()) {
            return 0.0f;
        }
        if (sorted.size() == 1) {
            arrayList = kotlin.collections.CollectionsKt.listOf(java.lang.Float.valueOf(1.0f));
        } else {
            int size = sorted.size();
            kotlin.ranges.IntRange indices = kotlin.collections.CollectionsKt.getIndices(sorted);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(indices, 10));
            java.util.Iterator<java.lang.Integer> it2 = indices.iterator();
            while (it2.hasNext()) {
                int nextInt = ((kotlin.collections.IntIterator) it2).nextInt();
                if (nextInt == sorted.size() - 1) {
                    f2 = 1.0f;
                } else {
                    f2 = nextInt == sorted.size() + (-2) ? f : ((nextInt + 1) / (size - 1)) * f;
                }
                arrayList3.add(java.lang.Float.valueOf(f2));
            }
            arrayList = arrayList3;
        }
        float f4 = i;
        if (f4 <= 0.0f) {
            f3 = 0.0f;
        } else {
            if (f4 < ((java.lang.Number) kotlin.collections.CollectionsKt.last(sorted)).intValue()) {
                int size2 = sorted.size();
                int i2 = 0;
                float f5 = 0.0f;
                float f6 = 0.0f;
                while (i2 < size2) {
                    float intValue = ((java.lang.Number) sorted.get(i2)).intValue();
                    f3 = ((java.lang.Number) arrayList.get(i2)).floatValue();
                    if (f4 <= intValue) {
                        float f7 = intValue - f5;
                        if (f7 > 0.0f) {
                            f3 = f6 + (((f4 - f5) / f7) * (f3 - f6));
                        }
                    } else {
                        i2++;
                        f5 = intValue;
                        f6 = f3;
                    }
                }
            }
            f3 = 1.0f;
        }
        return kotlin.ranges.RangesKt.coerceIn(f3, 0.0f, 1.0f);
    }
}
