package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0017\u0010\u000eR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0019\u0010\u000e"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement;", "", "", "priority", "", "smallSize", "smallCount", "mediumSize", "mediumCount", "largeSize", "largeCount", "<init>", "(IFIFIFI)V", "itemCount", "()I", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSmallSize", "()F", "getSmallCount", "getMediumSize", "getMediumCount", "getLargeSize", "getLargeCount", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Arrangement {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.carousel.Arrangement.Companion INSTANCE = new androidx.compose.material3.carousel.Arrangement.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private final int largeCount;
    private final float largeSize;
    private final int mediumCount;
    private final float mediumSize;
    private final int smallCount;
    private final float smallSize;

    public Arrangement(int i, float f, int i2, float f2, int i3, float f3, int i4) {
        this.getHighSpeedVideoSizes = i;
        this.smallSize = f;
        this.smallCount = i2;
        this.mediumSize = f2;
        this.mediumCount = i3;
        this.largeSize = f3;
        this.largeCount = i4;
    }

    public final float getSmallSize() {
        return this.smallSize;
    }

    public final int getSmallCount() {
        return this.smallCount;
    }

    public final float getMediumSize() {
        return this.mediumSize;
    }

    public final int getMediumCount() {
        return this.mediumCount;
    }

    public final float getLargeSize() {
        return this.largeSize;
    }

    public final int getLargeCount() {
        return this.largeCount;
    }

    public final int itemCount() {
        return this.largeCount + this.mediumCount + this.smallCount;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement$Companion;", "", "<init>", "()V", "", "availableSpace", "itemSpacing", "targetSmallSize", "minSmallSize", "maxSmallSize", "", "smallCounts", "targetMediumSize", "mediumCounts", "targetLargeSize", "largeCounts", "Landroidx/compose/material3/carousel/Arrangement;", "findLowestCostArrangement", "(FFFFF[IF[IF[I)Landroidx/compose/material3/carousel/Arrangement;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final androidx.compose.material3.carousel.Arrangement findLowestCostArrangement(float availableSpace, float itemSpacing, float targetSmallSize, float minSmallSize, float maxSmallSize, int[] smallCounts, float targetMediumSize, int[] mediumCounts, float targetLargeSize, int[] largeCounts) {
            int i;
            int i2;
            float max;
            int i3;
            androidx.compose.material3.carousel.Arrangement arrangement;
            int[] iArr = smallCounts;
            int[] iArr2 = mediumCounts;
            int[] iArr3 = largeCounts;
            int length = iArr3.length;
            androidx.compose.material3.carousel.Arrangement arrangement2 = null;
            int i4 = 1;
            int i5 = 0;
            while (i5 < length) {
                int i6 = iArr3[i5];
                int length2 = iArr2.length;
                int i7 = 0;
                while (i7 < length2) {
                    int i8 = iArr2[i7];
                    int length3 = iArr.length;
                    int i9 = 0;
                    while (i9 < length3) {
                        int i10 = iArr[i9];
                        float f = availableSpace - ((((i6 + i8) + i10) - 1) * itemSpacing);
                        float coerceIn = kotlin.ranges.RangesKt.coerceIn(targetSmallSize, minSmallSize, maxSmallSize);
                        float f2 = i6;
                        float f3 = i8;
                        float f4 = i10;
                        float f5 = f - (((targetLargeSize * f2) + (targetMediumSize * f3)) + (coerceIn * f4));
                        if (i10 > 0 && f5 > 0.0f) {
                            i = length;
                            i2 = i9;
                            max = java.lang.Math.min(f5 / f4, maxSmallSize - coerceIn);
                        } else {
                            i = length;
                            i2 = i9;
                            if (i10 > 0 && f5 < 0.0f) {
                                max = java.lang.Math.max(f5 / f4, minSmallSize - coerceIn);
                            }
                            if (i10 <= 0) {
                                coerceIn = 0.0f;
                            }
                            float f6 = f3 / 2.0f;
                            float f7 = (f - ((f4 + f6) * coerceIn)) / (f6 + f2);
                            float f8 = (f7 + coerceIn) / 2.0f;
                            if (i8 > 0 || f7 == targetLargeSize) {
                                i3 = length3;
                            } else {
                                float f9 = (targetLargeSize - f7) * f2;
                                i3 = length3;
                                float min = java.lang.Math.min(java.lang.Math.abs(f9), 0.1f * f8 * f3);
                                float f10 = min / f3;
                                if (f9 > 0.0f) {
                                    f8 -= f10;
                                    f7 += min / f2;
                                } else {
                                    f8 += f10;
                                    f7 -= min / f2;
                                }
                            }
                            int i11 = i2;
                            int i12 = i3;
                            int i13 = i8;
                            int i14 = i7;
                            int i15 = length2;
                            float f11 = f8;
                            int i16 = i6;
                            arrangement = new androidx.compose.material3.carousel.Arrangement(i4, coerceIn, i10, f11, i13, f7, i16);
                            if (arrangement2 != null || androidx.compose.material3.carousel.Arrangement.access$cost(arrangement, targetLargeSize) < androidx.compose.material3.carousel.Arrangement.access$cost(arrangement2, targetLargeSize)) {
                                if (androidx.compose.material3.carousel.Arrangement.access$cost(arrangement, targetLargeSize) != 0.0f) {
                                    return arrangement;
                                }
                                arrangement2 = arrangement;
                            }
                            i4++;
                            i9 = i11 + 1;
                            iArr = smallCounts;
                            i6 = i16;
                            length3 = i12;
                            length2 = i15;
                            length = i;
                            i8 = i13;
                            i7 = i14;
                        }
                        coerceIn += max;
                        if (i10 <= 0) {
                        }
                        float f62 = f3 / 2.0f;
                        float f72 = (f - ((f4 + f62) * coerceIn)) / (f62 + f2);
                        float f82 = (f72 + coerceIn) / 2.0f;
                        if (i8 > 0) {
                        }
                        i3 = length3;
                        int i112 = i2;
                        int i122 = i3;
                        int i132 = i8;
                        int i142 = i7;
                        int i152 = length2;
                        float f112 = f82;
                        int i162 = i6;
                        arrangement = new androidx.compose.material3.carousel.Arrangement(i4, coerceIn, i10, f112, i132, f72, i162);
                        if (arrangement2 != null) {
                        }
                        if (androidx.compose.material3.carousel.Arrangement.access$cost(arrangement, targetLargeSize) != 0.0f) {
                        }
                    }
                    i7++;
                    iArr = smallCounts;
                    iArr2 = mediumCounts;
                }
                i5++;
                iArr = smallCounts;
                iArr2 = mediumCounts;
                iArr3 = largeCounts;
            }
            return arrangement2;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ float access$cost(androidx.compose.material3.carousel.Arrangement arrangement, float f) {
        int i = arrangement.largeCount;
        if (i > 0 && arrangement.smallCount > 0 && arrangement.mediumCount > 0) {
            float f2 = arrangement.largeSize;
            float f3 = arrangement.mediumSize;
            if (f2 <= f3 || f3 <= arrangement.smallSize) {
                return Float.MAX_VALUE;
            }
        } else if (i > 0 && arrangement.smallCount > 0 && arrangement.largeSize <= arrangement.smallSize) {
            return Float.MAX_VALUE;
        }
        return java.lang.Math.abs(f - arrangement.largeSize) * arrangement.getHighSpeedVideoSizes;
    }
}
