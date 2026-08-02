package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/pds/components/ImageAspectRatio;", "", "", "p0", "<init>", "(Ljava/lang/String;IF)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getValue$pds_release", "()F", "Square", "Portrait2x3", "Portrait3x4", "Portrait9x16", "Landscape3x2", "Landscape4x3", "Landscape16x9"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ImageAspectRatio {
    public static final com.paypal.pds.components.ImageAspectRatio Landscape16x9;
    public static final com.paypal.pds.components.ImageAspectRatio Landscape3x2;
    public static final com.paypal.pds.components.ImageAspectRatio Landscape4x3;
    public static final com.paypal.pds.components.ImageAspectRatio Portrait2x3;
    public static final com.paypal.pds.components.ImageAspectRatio Portrait3x4;
    public static final com.paypal.pds.components.ImageAspectRatio Portrait9x16;
    public static final com.paypal.pds.components.ImageAspectRatio Square;
    private static final /* synthetic */ com.paypal.pds.components.ImageAspectRatio[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final float value;

    private ImageAspectRatio(java.lang.String str, int i, float f) {
        this.value = f;
    }

    /* renamed from: getValue$pds_release, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    static {
        com.paypal.pds.components.ImageAspectRatio imageAspectRatio = new com.paypal.pds.components.ImageAspectRatio("Square", 0, 1.0f);
        Square = imageAspectRatio;
        com.paypal.pds.components.ImageAspectRatio imageAspectRatio2 = new com.paypal.pds.components.ImageAspectRatio("Portrait2x3", 1, 0.6666667f);
        Portrait2x3 = imageAspectRatio2;
        com.paypal.pds.components.ImageAspectRatio imageAspectRatio3 = new com.paypal.pds.components.ImageAspectRatio("Portrait3x4", 2, 0.75f);
        Portrait3x4 = imageAspectRatio3;
        com.paypal.pds.components.ImageAspectRatio imageAspectRatio4 = new com.paypal.pds.components.ImageAspectRatio("Portrait9x16", 3, 0.5625f);
        Portrait9x16 = imageAspectRatio4;
        com.paypal.pds.components.ImageAspectRatio imageAspectRatio5 = new com.paypal.pds.components.ImageAspectRatio("Landscape3x2", 4, 1.5f);
        Landscape3x2 = imageAspectRatio5;
        com.paypal.pds.components.ImageAspectRatio imageAspectRatio6 = new com.paypal.pds.components.ImageAspectRatio("Landscape4x3", 5, 1.3333334f);
        Landscape4x3 = imageAspectRatio6;
        com.paypal.pds.components.ImageAspectRatio imageAspectRatio7 = new com.paypal.pds.components.ImageAspectRatio("Landscape16x9", 6, 1.7777778f);
        Landscape16x9 = imageAspectRatio7;
        com.paypal.pds.components.ImageAspectRatio[] imageAspectRatioArr = {imageAspectRatio, imageAspectRatio2, imageAspectRatio3, imageAspectRatio4, imageAspectRatio5, imageAspectRatio6, imageAspectRatio7};
        getHighSpeedVideoFpsRanges = imageAspectRatioArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(imageAspectRatioArr);
    }

    public static com.paypal.pds.components.ImageAspectRatio[] values() {
        return (com.paypal.pds.components.ImageAspectRatio[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.pds.components.ImageAspectRatio valueOf(java.lang.String str) {
        return (com.paypal.pds.components.ImageAspectRatio) java.lang.Enum.valueOf(com.paypal.pds.components.ImageAspectRatio.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.ImageAspectRatio> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
