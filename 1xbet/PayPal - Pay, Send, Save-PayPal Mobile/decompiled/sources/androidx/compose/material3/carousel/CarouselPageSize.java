package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B;\u0012\"\u0010\u0006\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\f*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R0\u0010\u0013\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R+\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b\"\u0004\b\u0011\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b"}, d2 = {"Landroidx/compose/material3/carousel/CarouselPageSize;", "Landroidx/compose/foundation/pager/PageSize;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "Landroidx/compose/material3/carousel/KeylineList;", "keylineList", "beforeContentPadding", "afterContentPadding", "<init>", "(Lkotlin/jvm/functions/Function2;FF)V", "Landroidx/compose/ui/unit/Density;", "", "availableSpace", "pageSpacing", "calculateMainAxisPageSize", "(Landroidx/compose/ui/unit/Density;II)I", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Landroidx/compose/material3/carousel/Strategy;", "p0", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/material3/carousel/Strategy;", "(Landroidx/compose/material3/carousel/Strategy;)V", "getStrategy", "strategy"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarouselPageSize implements androidx.compose.foundation.pager.PageSize {
    public static final int $stable = 0;
    private final float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.lang.Float, java.lang.Float, androidx.compose.material3.carousel.KeylineList> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.material3.carousel.Strategy.INSTANCE.getEmpty(), null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public CarouselPageSize(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, androidx.compose.material3.carousel.KeylineList> function2, float f, float f2) {
        this.getHighSpeedVideoSizes = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.Camera2StreamConfigurationMap = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.material3.carousel.Strategy getHighResolutionOutputSizeshNQ4ISI() {
        return (androidx.compose.material3.carousel.Strategy) this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.material3.carousel.Strategy strategy) {
        this.getHighSpeedVideoFpsRangesFor.setValue(strategy);
    }

    public final androidx.compose.material3.carousel.Strategy getStrategy() {
        return getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.foundation.pager.PageSize
    public final int calculateMainAxisPageSize(androidx.compose.ui.unit.Density density, int i, int i2) {
        float f = i;
        float f2 = i2;
        getHighSpeedVideoFpsRangesFor(new androidx.compose.material3.carousel.Strategy(this.getHighSpeedVideoSizes.invoke(java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2)), f, f2, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap));
        return getStrategy().getIsValid() ? kotlin.math.MathKt.roundToInt(getStrategy().getItemMainAxisSize()) : i;
    }
}
