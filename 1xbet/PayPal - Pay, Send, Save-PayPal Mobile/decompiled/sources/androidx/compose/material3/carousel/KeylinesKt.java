package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a7\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001b\u0010\u001a"}, d2 = {"Landroidx/compose/ui/unit/Density;", "density", "", "carouselMainAxisSize", "preferredItemSize", "itemSpacing", "", "itemCount", "minSmallItemSize", "maxSmallItemSize", "Landroidx/compose/material3/carousel/KeylineList;", "multiBrowseKeylineList", "(Landroidx/compose/ui/unit/Density;FFFIFF)Landroidx/compose/material3/carousel/KeylineList;", "itemSize", "uncontainedKeylineList", "(Landroidx/compose/ui/unit/Density;FFF)Landroidx/compose/material3/carousel/KeylineList;", "maxItemSize", "", "isCentered", "heroKeylineList", "(Landroidx/compose/ui/unit/Density;FLjava/lang/Float;FIZFF)Landroidx/compose/material3/carousel/KeylineList;", "leftAnchorSize", "rightAnchorSize", "Landroidx/compose/material3/carousel/Arrangement;", "arrangement", "createLeftAlignedKeylineList", "(FFFFLandroidx/compose/material3/carousel/Arrangement;)Landroidx/compose/material3/carousel/KeylineList;", "createCenterAlignedKeylineList"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeylinesKt {
    public static /* synthetic */ androidx.compose.material3.carousel.KeylineList multiBrowseKeylineList$default(androidx.compose.ui.unit.Density density, float f, float f2, float f3, int i, float f4, float f5, int i2, java.lang.Object obj) {
        if ((i2 & 32) != 0) {
            f4 = density.mo1418toPx0680j_4(androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.m4244getMinSmallItemSizeD9Ej5fM());
        }
        float f6 = f4;
        if ((i2 & 64) != 0) {
            f5 = density.mo1418toPx0680j_4(androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.m4243getMaxSmallItemSizeD9Ej5fM());
        }
        return multiBrowseKeylineList(density, f, f2, f3, i, f6, f5);
    }

    public static final androidx.compose.material3.carousel.KeylineList multiBrowseKeylineList(androidx.compose.ui.unit.Density density, float f, float f2, float f3, int i, float f4, float f5) {
        if (f == 0.0f || f2 == 0.0f) {
            return androidx.compose.material3.carousel.KeylineListKt.emptyKeylineList();
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float min = java.lang.Math.min(f2, f);
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(min / 3.0f, f4, f5);
        float f6 = (min + coerceIn) / 2.0f;
        int[] iArr3 = f < f4 * 2.0f ? new int[]{0} : iArr;
        int ceil = (int) java.lang.Math.ceil(f / min);
        int max = (ceil - java.lang.Math.max(1, (int) java.lang.Math.floor(((f - (kotlin.collections.ArraysKt.maxOrThrow(iArr2) * f6)) - (kotlin.collections.ArraysKt.maxOrThrow(iArr3) * f5)) / min))) + 1;
        int[] iArr4 = new int[max];
        for (int i2 = 0; i2 < max; i2++) {
            iArr4[i2] = ceil - i2;
        }
        float mo1418toPx0680j_4 = density.mo1418toPx0680j_4(androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.m4242getAnchorSizeD9Ej5fM$material3());
        androidx.compose.material3.carousel.Arrangement findLowestCostArrangement = androidx.compose.material3.carousel.Arrangement.INSTANCE.findLowestCostArrangement(f, f3, coerceIn, f4, f5, iArr3, f6, iArr2, min, iArr4);
        if (findLowestCostArrangement != null && findLowestCostArrangement.itemCount() > i) {
            int smallCount = findLowestCostArrangement.getSmallCount();
            int mediumCount = findLowestCostArrangement.getMediumCount();
            for (int itemCount = findLowestCostArrangement.itemCount() - i; itemCount > 0; itemCount--) {
                if (smallCount > 0) {
                    smallCount--;
                } else if (mediumCount > 1) {
                    mediumCount--;
                }
            }
            findLowestCostArrangement = androidx.compose.material3.carousel.Arrangement.INSTANCE.findLowestCostArrangement(f, f3, coerceIn, f4, f5, new int[]{smallCount}, f6, new int[]{mediumCount}, min, iArr4);
        }
        if (findLowestCostArrangement == null) {
            return androidx.compose.material3.carousel.KeylineListKt.emptyKeylineList();
        }
        return createLeftAlignedKeylineList(f, f3, mo1418toPx0680j_4, mo1418toPx0680j_4, findLowestCostArrangement);
    }

    public static final androidx.compose.material3.carousel.KeylineList uncontainedKeylineList(androidx.compose.ui.unit.Density density, float f, float f2, float f3) {
        if (f == 0.0f || f2 == 0.0f) {
            return androidx.compose.material3.carousel.KeylineListKt.emptyKeylineList();
        }
        float min = java.lang.Math.min(f2 + f3, f);
        int max = java.lang.Math.max(1, (int) java.lang.Math.floor(f / min));
        float f4 = f - (max * min);
        int i = f4 <= 0.0f ? 0 : 1;
        float mo1418toPx0680j_4 = density.mo1418toPx0680j_4(androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.m4242getAnchorSizeD9Ej5fM$material3());
        float max2 = java.lang.Math.max(1.5f * f4, mo1418toPx0680j_4);
        float f5 = 0.85f * min;
        if (max2 > f5) {
            max2 = java.lang.Math.min(java.lang.Math.max(f5, f4 * 1.2f), min);
        }
        return createLeftAlignedKeylineList(f, f3, java.lang.Math.max(java.lang.Math.min(mo1418toPx0680j_4, f2), max2 * 0.5f), mo1418toPx0680j_4, new androidx.compose.material3.carousel.Arrangement(0, 0.0f, 0, max2, i, min, max));
    }

    public static final androidx.compose.material3.carousel.KeylineList heroKeylineList(androidx.compose.ui.unit.Density density, float f, java.lang.Float f2, float f3, int i, boolean z, float f4, float f5) {
        if (f == 0.0f) {
            return androidx.compose.material3.carousel.KeylineListKt.emptyKeylineList();
        }
        boolean z2 = z && i >= 3;
        int[] iArr = new int[1];
        if (z2) {
            iArr[0] = 2;
        } else {
            iArr[0] = 1;
        }
        float min = java.lang.Math.min(f2 != null ? f2.floatValue() : f, f);
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(min / 3.0f, f4, f5);
        if (f < (kotlin.collections.ArraysKt.maxOrThrow(iArr) * f4) + (1.25f * f4)) {
            iArr = new int[]{0};
        }
        int[] iArr2 = iArr;
        int ceil = (int) java.lang.Math.ceil(f / min);
        int max = (ceil - java.lang.Math.max(1, (int) java.lang.Math.floor((f - (kotlin.collections.ArraysKt.maxOrThrow(iArr2) * f4)) / min))) + 1;
        int[] iArr3 = new int[max];
        for (int i2 = 0; i2 < max; i2++) {
            iArr3[i2] = ceil - i2;
        }
        float mo1418toPx0680j_4 = density.mo1418toPx0680j_4(androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.m4242getAnchorSizeD9Ej5fM$material3());
        androidx.compose.material3.carousel.Arrangement findLowestCostArrangement = androidx.compose.material3.carousel.Arrangement.INSTANCE.findLowestCostArrangement(f, f3, coerceIn, f4, f5, iArr2, 0.0f, new int[]{0}, min, iArr3);
        if (findLowestCostArrangement == null) {
            return androidx.compose.material3.carousel.KeylineListKt.emptyKeylineList();
        }
        if (z2 && i >= findLowestCostArrangement.itemCount()) {
            return createCenterAlignedKeylineList(f, f3, mo1418toPx0680j_4, mo1418toPx0680j_4, findLowestCostArrangement);
        }
        return createLeftAlignedKeylineList(f, f3, mo1418toPx0680j_4, mo1418toPx0680j_4, findLowestCostArrangement);
    }

    public static final androidx.compose.material3.carousel.KeylineList createLeftAlignedKeylineList(float f, float f2, final float f3, final float f4, final androidx.compose.material3.carousel.Arrangement arrangement) {
        return androidx.compose.material3.carousel.KeylineListKt.m4264keylineListOfWNYm7Xg(f, f2, androidx.compose.material3.carousel.CarouselAlignment.INSTANCE.m4241getStartNUL3oTo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.carousel.KeylinesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.carousel.KeylinesKt.$r8$lambda$JyiI8ZkZuYhW8knkatgLlJkvj38(f3, arrangement, f4, (androidx.compose.material3.carousel.KeylineListScope) obj);
            }
        });
    }

    public static final androidx.compose.material3.carousel.KeylineList createCenterAlignedKeylineList(float f, float f2, final float f3, final float f4, final androidx.compose.material3.carousel.Arrangement arrangement) {
        return androidx.compose.material3.carousel.KeylineListKt.m4264keylineListOfWNYm7Xg(f, f2, androidx.compose.material3.carousel.CarouselAlignment.INSTANCE.m4239getCenterNUL3oTo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.carousel.KeylinesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.carousel.KeylinesKt.m4265$r8$lambda$QbkoQwxyp7HURpe3g901L9vcOk(f3, arrangement, f4, (androidx.compose.material3.carousel.KeylineListScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JyiI8ZkZuYhW8knkatgLlJkvj38(float f, androidx.compose.material3.carousel.Arrangement arrangement, float f2, androidx.compose.material3.carousel.KeylineListScope keylineListScope) {
        keylineListScope.add(f, true);
        int largeCount = arrangement.getLargeCount();
        for (int i = 0; i < largeCount; i++) {
            androidx.compose.material3.carousel.KeylineListScope.add$default(keylineListScope, arrangement.getLargeSize(), false, 2, null);
        }
        int mediumCount = arrangement.getMediumCount();
        for (int i2 = 0; i2 < mediumCount; i2++) {
            androidx.compose.material3.carousel.KeylineListScope.add$default(keylineListScope, arrangement.getMediumSize(), false, 2, null);
        }
        int smallCount = arrangement.getSmallCount();
        for (int i3 = 0; i3 < smallCount; i3++) {
            androidx.compose.material3.carousel.KeylineListScope.add$default(keylineListScope, arrangement.getSmallSize(), false, 2, null);
        }
        keylineListScope.add(f2, true);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QbkoQwxyp7HUR-pe3g901L9vcOk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4265$r8$lambda$QbkoQwxyp7HURpe3g901L9vcOk(float f, androidx.compose.material3.carousel.Arrangement arrangement, float f2, androidx.compose.material3.carousel.KeylineListScope keylineListScope) {
        keylineListScope.add(f, true);
        int smallCount = arrangement.getSmallCount() / 2;
        for (int i = 0; i < smallCount; i++) {
            androidx.compose.material3.carousel.KeylineListScope.add$default(keylineListScope, arrangement.getSmallSize(), false, 2, null);
        }
        int mediumCount = arrangement.getMediumCount() / 2;
        for (int i2 = 0; i2 < mediumCount; i2++) {
            androidx.compose.material3.carousel.KeylineListScope.add$default(keylineListScope, arrangement.getMediumSize(), false, 2, null);
        }
        int largeCount = arrangement.getLargeCount();
        for (int i3 = 0; i3 < largeCount; i3++) {
            androidx.compose.material3.carousel.KeylineListScope.add$default(keylineListScope, arrangement.getLargeSize(), false, 2, null);
        }
        int mediumCount2 = arrangement.getMediumCount() / 2;
        for (int i4 = 0; i4 < mediumCount2; i4++) {
            androidx.compose.material3.carousel.KeylineListScope.add$default(keylineListScope, arrangement.getMediumSize(), false, 2, null);
        }
        int smallCount2 = arrangement.getSmallCount() / 2;
        for (int i5 = 0; i5 < smallCount2; i5++) {
            androidx.compose.material3.carousel.KeylineListScope.add$default(keylineListScope, arrangement.getSmallSize(), false, 2, null);
        }
        keylineListScope.add(f2, true);
        return kotlin.Unit.INSTANCE;
    }
}
