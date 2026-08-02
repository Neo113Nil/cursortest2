package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a?\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList;", "p0", "", "p1", "p2", "p3", "Landroidx/compose/material3/carousel/Keyline;", "p4", "", "p5", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/material3/carousel/KeylineList;FFFLandroidx/compose/material3/carousel/Keyline;I)Landroidx/compose/material3/carousel/KeylineList;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/material3/carousel/KeylineList;IIFF)Landroidx/compose/material3/carousel/KeylineList;", "getHighSpeedVideoFpsRanges", "(FFFFF)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StrategyKt {
    private static final androidx.compose.material3.carousel.KeylineList getHighSpeedVideoFpsRangesFor(final androidx.compose.material3.carousel.KeylineList keylineList, float f, float f2, float f3, androidx.compose.material3.carousel.Keyline keyline, int i) {
        androidx.compose.material3.carousel.KeylineList keylineList2 = keylineList;
        java.util.ArrayList arrayList = new java.util.ArrayList(keylineList2.size());
        int size = keylineList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.material3.carousel.Keyline keyline2 = keylineList2.get(i2);
            if (!keyline2.isAnchor()) {
                arrayList.add(keyline2);
            }
        }
        final float size2 = f3 / arrayList.size();
        androidx.compose.material3.carousel.KeylineList keylineListOf = androidx.compose.material3.carousel.KeylineListKt.keylineListOf(f, f2, i, (keyline.getOffset() - (size2 / 2.0f)) + f3, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.carousel.StrategyKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.carousel.StrategyKt.m4267$r8$lambda$JfTdpFiHNsgKzlsCPbbzni3B8(androidx.compose.material3.carousel.KeylineList.this, size2, (androidx.compose.material3.carousel.KeylineListScope) obj);
            }
        });
        java.util.ArrayList arrayList2 = new java.util.ArrayList(keylineListOf.size());
        int size3 = keylineListOf.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList2.add(androidx.compose.material3.carousel.Keyline.copy$default(keylineListOf.get(i3), 0.0f, 0.0f, keylineList.get(i3).getUnadjustedOffset(), false, false, false, 0.0f, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null));
        }
        return new androidx.compose.material3.carousel.KeylineList(arrayList2);
    }

    private static final androidx.compose.material3.carousel.KeylineList getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.material3.carousel.KeylineList keylineList, final int i, final int i2, float f, float f2) {
        int i3 = i > i2 ? 1 : -1;
        return androidx.compose.material3.carousel.KeylineListKt.keylineListOf(f, f2, keylineList.getPivotIndex() + i3, keylineList.getPivot().getOffset() + (((keylineList.get(i).getSize() - keylineList.get(i).getCutoff()) + f2) * i3), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.carousel.StrategyKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.carousel.StrategyKt.m4266$r8$lambda$F6kXo0NguFtfvs1KOafcj9zvM(androidx.compose.material3.carousel.KeylineList.this, i, i2, (androidx.compose.material3.carousel.KeylineListScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRanges(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : androidx.compose.ui.util.MathHelpersKt.lerp(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: $r8$lambda$F6kXo0Ng-uFtfv-s1KOafcj9zvM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4266$r8$lambda$F6kXo0NguFtfvs1KOafcj9zvM(androidx.compose.material3.carousel.KeylineList keylineList, int i, int i2, androidx.compose.material3.carousel.KeylineListScope keylineListScope) {
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) keylineList);
        androidx.compose.material3.carousel.Keyline keyline = (androidx.compose.material3.carousel.Keyline) mutableList.get(i);
        mutableList.remove(i);
        mutableList.add(i2, keyline);
        int size = mutableList.size();
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.material3.carousel.Keyline keyline2 = (androidx.compose.material3.carousel.Keyline) mutableList.get(i3);
            keylineListScope.add(keyline2.getSize(), keyline2.isAnchor());
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JfTdpFiHNsgKzlsC--Pbbzni3B8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4267$r8$lambda$JfTdpFiHNsgKzlsCPbbzni3B8(androidx.compose.material3.carousel.KeylineList keylineList, float f, androidx.compose.material3.carousel.KeylineListScope keylineListScope) {
        androidx.compose.material3.carousel.KeylineList keylineList2 = keylineList;
        int size = keylineList2.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.material3.carousel.Keyline keyline = keylineList2.get(i);
            keylineListScope.add(keyline.getSize() - java.lang.Math.abs(f), keyline.isAnchor());
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.util.List access$getEndKeylineSteps(androidx.compose.material3.carousel.KeylineList keylineList, float f, float f2, float f3) {
        if (keylineList.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(keylineList);
        if (keylineList.isLastFocalItemAtEndOfContainer(f)) {
            if (f3 == 0.0f) {
                return arrayList;
            }
            arrayList.add(getHighSpeedVideoFpsRangesFor(keylineList, f, f2, -f3, keylineList.getLastFocal(), keylineList.getLastFocalIndex()));
            return arrayList;
        }
        int lastFocalIndex = keylineList.getLastFocalIndex();
        int lastNonAnchorIndex = keylineList.getLastNonAnchorIndex();
        int i = lastNonAnchorIndex - lastFocalIndex;
        if (i <= 0 && keylineList.getLastFocal().getCutoff() > 0.0f) {
            arrayList.add(getHighResolutionOutputSizeshNQ4ISI(keylineList, 0, 0, f, f2));
            return arrayList;
        }
        for (int i2 = 0; i2 < i; i2++) {
            androidx.compose.material3.carousel.KeylineList keylineList2 = (androidx.compose.material3.carousel.KeylineList) kotlin.collections.CollectionsKt.last((java.util.List) arrayList);
            int i3 = lastNonAnchorIndex - i2;
            arrayList.add(getHighResolutionOutputSizeshNQ4ISI(keylineList2, keylineList.getLastNonAnchorIndex(), i3 < kotlin.collections.CollectionsKt.getLastIndex(keylineList) ? keylineList2.lastIndexBeforeFocalRangeWithSize(keylineList.get(i3 + 1).getSize()) + 1 : 0, f, f2));
        }
        if (f3 == 0.0f) {
            return arrayList;
        }
        arrayList.set(kotlin.collections.CollectionsKt.getLastIndex(arrayList), getHighSpeedVideoFpsRangesFor((androidx.compose.material3.carousel.KeylineList) kotlin.collections.CollectionsKt.last((java.util.List) arrayList), f, f2, -f3, ((androidx.compose.material3.carousel.KeylineList) kotlin.collections.CollectionsKt.last((java.util.List) arrayList)).getLastFocal(), ((androidx.compose.material3.carousel.KeylineList) kotlin.collections.CollectionsKt.last((java.util.List) arrayList)).getLastFocalIndex()));
        return arrayList;
    }

    public static final /* synthetic */ float access$getEndShiftDistance(java.util.List list, float f) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return java.lang.Math.max(((androidx.compose.material3.carousel.Keyline) kotlin.collections.CollectionsKt.last((java.util.List) kotlin.collections.CollectionsKt.first(list))).getUnadjustedOffset() - ((androidx.compose.material3.carousel.Keyline) kotlin.collections.CollectionsKt.last((java.util.List) kotlin.collections.CollectionsKt.last(list))).getUnadjustedOffset(), f);
    }

    public static final /* synthetic */ androidx.compose.material3.carousel.ShiftPointRange access$getShiftPointRange(int i, androidx.collection.FloatList floatList, float f) {
        float f2 = floatList.get(0);
        java.util.Iterator<java.lang.Integer> it = kotlin.ranges.RangesKt.until(1, i).iterator();
        while (it.hasNext()) {
            int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
            float f3 = floatList.get(nextInt);
            if (f <= f3) {
                return new androidx.compose.material3.carousel.ShiftPointRange(nextInt - 1, nextInt, getHighSpeedVideoFpsRanges(0.0f, 1.0f, f2, f3, f));
            }
            f2 = f3;
        }
        return new androidx.compose.material3.carousel.ShiftPointRange(0, 0, 0.0f);
    }

    public static final /* synthetic */ java.util.List access$getStartKeylineSteps(androidx.compose.material3.carousel.KeylineList keylineList, float f, float f2, float f3) {
        if (keylineList.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(keylineList);
        if (keylineList.isFirstFocalItemAtStartOfContainer()) {
            if (f3 == 0.0f) {
                return arrayList;
            }
            arrayList.add(getHighSpeedVideoFpsRangesFor(keylineList, f, f2, f3, keylineList.getFirstFocal(), keylineList.getFirstFocalIndex()));
            return arrayList;
        }
        int firstNonAnchorIndex = keylineList.getFirstNonAnchorIndex();
        int firstFocalIndex = keylineList.getFirstFocalIndex() - firstNonAnchorIndex;
        if (firstFocalIndex <= 0 && keylineList.getFirstFocal().getCutoff() > 0.0f) {
            arrayList.add(getHighResolutionOutputSizeshNQ4ISI(keylineList, 0, 0, f, f2));
            return arrayList;
        }
        for (int i = 0; i < firstFocalIndex; i++) {
            androidx.compose.material3.carousel.KeylineList keylineList2 = (androidx.compose.material3.carousel.KeylineList) kotlin.collections.CollectionsKt.last((java.util.List) arrayList);
            int i2 = firstNonAnchorIndex + i;
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(keylineList);
            if (i2 > 0) {
                lastIndex = keylineList2.firstIndexAfterFocalRangeWithSize(keylineList.get(i2 - 1).getSize()) - 1;
            }
            arrayList.add(getHighResolutionOutputSizeshNQ4ISI(keylineList2, keylineList.getFirstNonAnchorIndex(), lastIndex, f, f2));
        }
        if (f3 == 0.0f) {
            return arrayList;
        }
        arrayList.set(kotlin.collections.CollectionsKt.getLastIndex(arrayList), getHighSpeedVideoFpsRangesFor((androidx.compose.material3.carousel.KeylineList) kotlin.collections.CollectionsKt.last((java.util.List) arrayList), f, f2, f3, ((androidx.compose.material3.carousel.KeylineList) kotlin.collections.CollectionsKt.last((java.util.List) arrayList)).getFirstFocal(), ((androidx.compose.material3.carousel.KeylineList) kotlin.collections.CollectionsKt.last((java.util.List) arrayList)).getFirstFocalIndex()));
        return arrayList;
    }

    public static final /* synthetic */ float access$getStartShiftDistance(java.util.List list, float f) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return java.lang.Math.max(((androidx.compose.material3.carousel.Keyline) kotlin.collections.CollectionsKt.first((java.util.List) kotlin.collections.CollectionsKt.last(list))).getUnadjustedOffset() - ((androidx.compose.material3.carousel.Keyline) kotlin.collections.CollectionsKt.first((java.util.List) kotlin.collections.CollectionsKt.first(list))).getUnadjustedOffset(), f);
    }

    public static final /* synthetic */ androidx.collection.FloatList access$getStepInterpolationPoints(float f, java.util.List list, boolean z) {
        float unadjustedOffset;
        androidx.collection.MutableFloatList mutableFloatListOf = androidx.collection.FloatListKt.mutableFloatListOf(0.0f);
        if (f == 0.0f || list.isEmpty()) {
            return mutableFloatListOf;
        }
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(1, list.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
        java.util.Iterator<java.lang.Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
            int i = nextInt - 1;
            androidx.compose.material3.carousel.KeylineList keylineList = (androidx.compose.material3.carousel.KeylineList) list.get(i);
            androidx.compose.material3.carousel.KeylineList keylineList2 = (androidx.compose.material3.carousel.KeylineList) list.get(nextInt);
            if (z) {
                unadjustedOffset = ((androidx.compose.material3.carousel.Keyline) kotlin.collections.CollectionsKt.first((java.util.List) keylineList2)).getUnadjustedOffset() - ((androidx.compose.material3.carousel.Keyline) kotlin.collections.CollectionsKt.first((java.util.List) keylineList)).getUnadjustedOffset();
            } else {
                unadjustedOffset = ((androidx.compose.material3.carousel.Keyline) kotlin.collections.CollectionsKt.last((java.util.List) keylineList)).getUnadjustedOffset() - ((androidx.compose.material3.carousel.Keyline) kotlin.collections.CollectionsKt.last((java.util.List) keylineList2)).getUnadjustedOffset();
            }
            arrayList.add(java.lang.Boolean.valueOf(mutableFloatListOf.add(nextInt == kotlin.collections.CollectionsKt.getLastIndex(list) ? 1.0f : mutableFloatListOf.get(i) + (unadjustedOffset / f))));
        }
        return mutableFloatListOf;
    }
}
