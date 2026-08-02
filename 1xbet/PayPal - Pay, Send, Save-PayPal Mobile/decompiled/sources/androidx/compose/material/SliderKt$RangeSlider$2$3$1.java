package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class SliderKt$RangeSlider$2$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> {
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Float invoke(java.lang.Float f) {
        float highSpeedVideoFpsRanges;
        highSpeedVideoFpsRanges = androidx.compose.material.SliderKt.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, f.floatValue());
        return java.lang.Float.valueOf(highSpeedVideoFpsRanges);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSlider$2$3$1(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2) {
        super(1, kotlin.jvm.internal.Intrinsics.Kotlin.class, "scaleToOffset", "RangeSlider$lambda$4$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.getHighSpeedVideoFpsRanges = closedFloatingPointRange;
        this.getHighResolutionOutputSizeshNQ4ISI = floatRef;
        this.getHighSpeedVideoSizes = floatRef2;
    }
}
