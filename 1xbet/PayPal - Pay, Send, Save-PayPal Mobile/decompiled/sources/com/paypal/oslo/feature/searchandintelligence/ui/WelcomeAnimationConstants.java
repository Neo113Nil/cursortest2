package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\n\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\u000fR\u001a\u0010\t\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/WelcomeAnimationConstants;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "getInputFormats", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes", "()F", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/time/Duration;", "Camera2StreamConfigurationMap", "J", "()J"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final class WelcomeAnimationConstants {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final long getHighSpeedVideoFpsRanges;
    public static final com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants();

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(-62.0f);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(100.0f);

    private WelcomeAnimationConstants() {
    }

    public static float getHighSpeedVideoSizes() {
        return getHighSpeedVideoSizes;
    }

    public static float getHighSpeedVideoFpsRangesFor() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static long getHighResolutionOutputSizeshNQ4ISI() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static long getHighSpeedVideoFpsRanges() {
        return getHighSpeedVideoFpsRanges;
    }

    public static long Camera2StreamConfigurationMap() {
        return Camera2StreamConfigurationMap;
    }

    static {
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        getHighSpeedVideoFpsRangesFor = kotlin.time.DurationKt.toDuration(900, kotlin.time.DurationUnit.MILLISECONDS);
        kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
        getHighSpeedVideoFpsRanges = kotlin.time.DurationKt.toDuration(300, kotlin.time.DurationUnit.MILLISECONDS);
        kotlin.time.Duration.Companion companion3 = kotlin.time.Duration.INSTANCE;
        Camera2StreamConfigurationMap = kotlin.time.DurationKt.toDuration(900, kotlin.time.DurationUnit.MILLISECONDS);
    }
}
