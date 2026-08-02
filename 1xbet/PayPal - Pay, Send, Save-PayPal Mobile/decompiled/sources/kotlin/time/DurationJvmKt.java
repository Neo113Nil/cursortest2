package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\" \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "decimals", "", "formatToExactDecimals", "(DI)Ljava/lang/String;", "", "durationAssertionsEnabled", "Z", "getDurationAssertionsEnabled", "()Z", "", "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "Camera2StreamConfigurationMap", "[Ljava/lang/ThreadLocal;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DurationJvmKt {
    private static final java.lang.ThreadLocal<java.text.DecimalFormat>[] Camera2StreamConfigurationMap;
    private static final boolean durationAssertionsEnabled = false;

    public static final boolean getDurationAssertionsEnabled() {
        return durationAssertionsEnabled;
    }

    static {
        java.lang.ThreadLocal<java.text.DecimalFormat>[] threadLocalArr = new java.lang.ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new java.lang.ThreadLocal<>();
        }
        Camera2StreamConfigurationMap = threadLocalArr;
    }

    public static final java.lang.String formatToExactDecimals(double d, int i) {
        java.text.DecimalFormat decimalFormat;
        java.lang.ThreadLocal<java.text.DecimalFormat>[] threadLocalArr = Camera2StreamConfigurationMap;
        if (i < threadLocalArr.length) {
            java.lang.ThreadLocal<java.text.DecimalFormat> threadLocal = threadLocalArr[i];
            java.text.DecimalFormat decimalFormat2 = threadLocal.get();
            if (decimalFormat2 == null) {
                decimalFormat2 = new java.text.DecimalFormat("0");
                if (i > 0) {
                    decimalFormat2.setMinimumFractionDigits(i);
                }
                decimalFormat2.setRoundingMode(java.math.RoundingMode.HALF_UP);
                threadLocal.set(decimalFormat2);
            }
            decimalFormat = decimalFormat2;
        } else {
            decimalFormat = new java.text.DecimalFormat("0");
            if (i > 0) {
                decimalFormat.setMinimumFractionDigits(i);
            }
            decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        }
        java.lang.String format = decimalFormat.format(d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
