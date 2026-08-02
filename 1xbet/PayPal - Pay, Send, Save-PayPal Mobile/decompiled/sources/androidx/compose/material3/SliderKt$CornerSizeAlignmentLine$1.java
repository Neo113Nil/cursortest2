package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class SliderKt$CornerSizeAlignmentLine$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer> {
    public static final androidx.compose.material3.SliderKt$CornerSizeAlignmentLine$1 getHighSpeedVideoFpsRanges = new androidx.compose.material3.SliderKt$CornerSizeAlignmentLine$1();

    public final java.lang.Integer getHighSpeedVideoSizes(int i, int i2) {
        return java.lang.Integer.valueOf(java.lang.Math.min(i, i2));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num, java.lang.Integer num2) {
        return getHighSpeedVideoSizes(num.intValue(), num2.intValue());
    }

    SliderKt$CornerSizeAlignmentLine$1() {
        super(2, kotlin.math.MathKt.class, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "min(II)I", 1);
    }
}
