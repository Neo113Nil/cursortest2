package kotlin.math;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lkotlin/math/Constants;", "", "<init>", "()V", "", "getHighSpeedVideoFpsRangesFor", "D", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getInputFormats", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class Constants {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public static final double getHighSpeedVideoFpsRangesFor;
    public static final double getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    public static final double getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    public static final double getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    public static final double getInputFormats;
    public static final kotlin.math.Constants INSTANCE = new kotlin.math.Constants();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    public static final double Camera2StreamConfigurationMap = java.lang.Math.log(2.0d);

    private Constants() {
    }

    static {
        double ulp = java.lang.Math.ulp(1.0d);
        getHighResolutionOutputSizeshNQ4ISI = ulp;
        double sqrt = java.lang.Math.sqrt(ulp);
        getHighSpeedVideoSizes = sqrt;
        double sqrt2 = java.lang.Math.sqrt(sqrt);
        getHighSpeedVideoFpsRangesFor = sqrt2;
        getHighSpeedVideoFpsRanges = 1.0d / sqrt;
        getInputFormats = 1.0d / sqrt2;
    }
}
