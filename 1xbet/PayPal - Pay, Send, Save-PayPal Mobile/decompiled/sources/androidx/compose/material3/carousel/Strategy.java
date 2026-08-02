package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;BM\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rB1\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0013J)\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010\u000f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0010\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b,\u0010+R\u001a\u0010\u0011\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b-\u0010+R\u001a\u0010\u0012\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b.\u0010+R\u0014\u00100\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010)R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010)R\u0014\u00105\u001a\u0002028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00103\u001a\u0002028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00104R\u0011\u00107\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b6\u0010+R\u001a\u00108\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u0010$"}, d2 = {"Landroidx/compose/material3/carousel/Strategy;", "", "Landroidx/compose/material3/carousel/KeylineList;", "p0", "", "p1", "p2", "", "p3", "p4", "p5", "p6", "<init>", "(Landroidx/compose/material3/carousel/KeylineList;Ljava/util/List;Ljava/util/List;FFFF)V", "defaultKeylines", "availableSpace", "itemSpacing", "beforeContentPadding", "afterContentPadding", "(Landroidx/compose/material3/carousel/KeylineList;FFFF)V", "scrollOffset", "maxScrollOffset", "", "roundToNearestStep", "getKeylineListForScrollOffset$material3", "(FFZ)Landroidx/compose/material3/carousel/KeylineList;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/material3/carousel/KeylineList;", "getDefaultKeylines", "()Landroidx/compose/material3/carousel/KeylineList;", "startKeylineSteps", "Ljava/util/List;", "getStartKeylineSteps", "()Ljava/util/List;", "endKeylineSteps", "getEndKeylineSteps", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAvailableSpace", "()F", "getItemSpacing", "getBeforeContentPadding", "getAfterContentPadding", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/collection/FloatList;", "Camera2StreamConfigurationMap", "Landroidx/collection/FloatList;", "getHighSpeedVideoFpsRangesFor", "getItemMainAxisSize", "itemMainAxisSize", "isValid", "Z", "()Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Strategy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.collection.FloatList getHighSpeedVideoFpsRangesFor;
    private final float afterContentPadding;
    private final float availableSpace;
    private final float beforeContentPadding;
    private final androidx.compose.material3.carousel.KeylineList defaultKeylines;
    private final java.util.List<androidx.compose.material3.carousel.KeylineList> endKeylineSteps;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.FloatList Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.util.List<androidx.compose.material3.carousel.KeylineList> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;
    private final boolean isValid;
    private final float itemSpacing;
    private final java.util.List<androidx.compose.material3.carousel.KeylineList> startKeylineSteps;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.carousel.Strategy.Companion INSTANCE = new androidx.compose.material3.carousel.Strategy.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.material3.carousel.Strategy Empty = new androidx.compose.material3.carousel.Strategy(androidx.compose.material3.carousel.KeylineListKt.emptyKeylineList(), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), 0.0f, 0.0f, 0.0f, 0.0f);

    private Strategy(androidx.compose.material3.carousel.KeylineList keylineList, java.util.List<androidx.compose.material3.carousel.KeylineList> list, java.util.List<androidx.compose.material3.carousel.KeylineList> list2, float f, float f2, float f3, float f4) {
        this.defaultKeylines = keylineList;
        this.startKeylineSteps = list;
        this.endKeylineSteps = list2;
        this.availableSpace = f;
        this.itemSpacing = f2;
        this.beforeContentPadding = f3;
        this.afterContentPadding = f4;
        float access$getStartShiftDistance = androidx.compose.material3.carousel.StrategyKt.access$getStartShiftDistance(list, f3);
        this.getHighSpeedVideoFpsRanges = access$getStartShiftDistance;
        float access$getEndShiftDistance = androidx.compose.material3.carousel.StrategyKt.access$getEndShiftDistance(list2, f4);
        this.getHighSpeedVideoSizes = access$getEndShiftDistance;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.material3.carousel.StrategyKt.access$getStepInterpolationPoints(access$getStartShiftDistance, list, true);
        this.Camera2StreamConfigurationMap = androidx.compose.material3.carousel.StrategyKt.access$getStepInterpolationPoints(access$getEndShiftDistance, list2, false);
        this.isValid = (keylineList.isEmpty() || f == 0.0f || getItemMainAxisSize() == 0.0f) ? false : true;
    }

    public final androidx.compose.material3.carousel.KeylineList getDefaultKeylines() {
        return this.defaultKeylines;
    }

    public final java.util.List<androidx.compose.material3.carousel.KeylineList> getStartKeylineSteps() {
        return this.startKeylineSteps;
    }

    public final java.util.List<androidx.compose.material3.carousel.KeylineList> getEndKeylineSteps() {
        return this.endKeylineSteps;
    }

    public final float getAvailableSpace() {
        return this.availableSpace;
    }

    public final float getItemSpacing() {
        return this.itemSpacing;
    }

    public final float getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final float getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public Strategy(androidx.compose.material3.carousel.KeylineList keylineList, float f, float f2, float f3, float f4) {
        this(keylineList, androidx.compose.material3.carousel.StrategyKt.access$getStartKeylineSteps(keylineList, f, f2, f3), androidx.compose.material3.carousel.StrategyKt.access$getEndKeylineSteps(keylineList, f, f2, f4), f, f2, f3, f4);
    }

    public final float getItemMainAxisSize() {
        return this.defaultKeylines.getFirstFocal().getSize();
    }

    /* renamed from: isValid, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public static /* synthetic */ androidx.compose.material3.carousel.KeylineList getKeylineListForScrollOffset$material3$default(androidx.compose.material3.carousel.Strategy strategy, float f, float f2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return strategy.getKeylineListForScrollOffset$material3(f, f2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.material3.carousel.KeylineList getKeylineListForScrollOffset$material3(float scrollOffset, float maxScrollOffset, boolean roundToNearestStep) {
        float highSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        float max = java.lang.Math.max(0.0f, scrollOffset);
        float f = this.getHighSpeedVideoFpsRanges;
        float max2 = java.lang.Math.max(0.0f, maxScrollOffset - this.getHighSpeedVideoSizes);
        if (f > max || max > max2) {
            highSpeedVideoFpsRanges = androidx.compose.material3.carousel.StrategyKt.getHighSpeedVideoFpsRanges(1.0f, 0.0f, 0.0f, f, max);
            androidx.collection.FloatList floatList = this.getHighSpeedVideoFpsRangesFor;
            java.util.List<androidx.compose.material3.carousel.KeylineList> list = this.startKeylineSteps;
            if (max > max2) {
                highSpeedVideoFpsRanges = androidx.compose.material3.carousel.StrategyKt.getHighSpeedVideoFpsRanges(0.0f, 1.0f, max2, maxScrollOffset, max);
                floatList = this.Camera2StreamConfigurationMap;
                list = this.endKeylineSteps;
                if (max2 < 0.01f && this.startKeylineSteps.size() == 2 && this.endKeylineSteps.size() == 2) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.material3.carousel.KeylineList[]{kotlin.collections.CollectionsKt.last((java.util.List) this.startKeylineSteps), kotlin.collections.CollectionsKt.last((java.util.List) this.endKeylineSteps)});
                    }
                    list = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list);
                }
            }
            androidx.compose.material3.carousel.ShiftPointRange access$getShiftPointRange = androidx.compose.material3.carousel.StrategyKt.access$getShiftPointRange(list.size(), floatList, highSpeedVideoFpsRanges);
            if (roundToNearestStep) {
                if (kotlin.math.MathKt.roundToInt(access$getShiftPointRange.getGetHighSpeedVideoFpsRanges()) == 0) {
                    getHighSpeedVideoFpsRangesFor = access$getShiftPointRange.getGetHighSpeedVideoSizes();
                } else {
                    getHighSpeedVideoFpsRangesFor = access$getShiftPointRange.getGetHighSpeedVideoFpsRangesFor();
                }
                return list.get(getHighSpeedVideoFpsRangesFor);
            }
            return androidx.compose.material3.carousel.KeylineListKt.lerp(list.get(access$getShiftPointRange.getGetHighSpeedVideoSizes()), list.get(access$getShiftPointRange.getGetHighSpeedVideoFpsRangesFor()), access$getShiftPointRange.getGetHighSpeedVideoFpsRanges());
        }
        return this.defaultKeylines;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material3.carousel.Strategy)) {
            return false;
        }
        boolean z = this.isValid;
        if (!z && !((androidx.compose.material3.carousel.Strategy) other).isValid) {
            return true;
        }
        androidx.compose.material3.carousel.Strategy strategy = (androidx.compose.material3.carousel.Strategy) other;
        return z == strategy.isValid && this.availableSpace == strategy.availableSpace && this.itemSpacing == strategy.itemSpacing && this.beforeContentPadding == strategy.beforeContentPadding && this.afterContentPadding == strategy.afterContentPadding && getItemMainAxisSize() == strategy.getItemMainAxisSize() && this.getHighSpeedVideoFpsRanges == strategy.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes == strategy.getHighSpeedVideoSizes && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, strategy.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, strategy.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultKeylines, strategy.defaultKeylines);
    }

    public final int hashCode() {
        boolean z = this.isValid;
        if (!z) {
            return java.lang.Boolean.hashCode(z);
        }
        int hashCode = java.lang.Boolean.hashCode(z);
        int hashCode2 = java.lang.Float.hashCode(this.availableSpace);
        int hashCode3 = java.lang.Float.hashCode(this.itemSpacing);
        int hashCode4 = java.lang.Float.hashCode(this.beforeContentPadding);
        int hashCode5 = java.lang.Float.hashCode(this.afterContentPadding);
        int hashCode6 = java.lang.Float.hashCode(getItemMainAxisSize());
        int hashCode7 = java.lang.Float.hashCode(this.getHighSpeedVideoFpsRanges);
        int hashCode8 = java.lang.Float.hashCode(this.getHighSpeedVideoSizes);
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + this.defaultKeylines.hashCode();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/material3/carousel/Strategy$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/carousel/Strategy;", "Empty", "Landroidx/compose/material3/carousel/Strategy;", "getEmpty", "()Landroidx/compose/material3/carousel/Strategy;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.material3.carousel.Strategy getEmpty() {
            return androidx.compose.material3.carousel.Strategy.Empty;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
