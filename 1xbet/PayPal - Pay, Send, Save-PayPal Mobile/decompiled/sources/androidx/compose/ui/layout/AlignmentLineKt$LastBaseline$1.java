package androidx.compose.ui.layout;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer> {
    public static final androidx.compose.ui.layout.AlignmentLineKt$LastBaseline$1 getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.layout.AlignmentLineKt$LastBaseline$1();

    public final java.lang.Integer getHighSpeedVideoFpsRangesFor(int i, int i2) {
        return java.lang.Integer.valueOf(java.lang.Math.max(i, i2));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num, java.lang.Integer num2) {
        return getHighSpeedVideoFpsRangesFor(num.intValue(), num2.intValue());
    }

    AlignmentLineKt$LastBaseline$1() {
        super(2, kotlin.math.MathKt.class, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "max(II)I", 1);
    }
}
