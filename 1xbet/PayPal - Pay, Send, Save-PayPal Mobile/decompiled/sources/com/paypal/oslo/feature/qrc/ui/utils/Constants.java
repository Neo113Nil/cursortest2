package com.paypal.oslo.feature.qrc.ui.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/utils/Constants;", "", "<init>", "()V", "", "TOP_BAR_ALPHA", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "SCRIM_ALPHA", "Landroidx/compose/ui/unit/Dp;", "TOTAL_BUTTON_OVERLAY_HEIGHT", "getTOTAL_BUTTON_OVERLAY_HEIGHT-D9Ej5fM", "()F", "", "INTERNET_ERROR", "Ljava/lang/String;", com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, "UNSUPPORTED_QRC_ERROR", "TIME_OUT_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Constants {
    public static final int $stable = 0;
    public static final java.lang.String GENERIC_ERROR = "Something went wrong";
    public static final java.lang.String INTERNET_ERROR = "No internet connection";
    public static final float SCRIM_ALPHA = 0.63f;
    public static final java.lang.String TIME_OUT_ERROR = "Request timed out";
    public static final float TOP_BAR_ALPHA = 0.9f;
    public static final java.lang.String UNSUPPORTED_QRC_ERROR = "This QR code is not supported";
    public static final com.paypal.oslo.feature.qrc.ui.utils.Constants INSTANCE = new com.paypal.oslo.feature.qrc.ui.utils.Constants();
    private static final float TOTAL_BUTTON_OVERLAY_HEIGHT = androidx.compose.ui.unit.Dp.m8601constructorimpl(80.0f);

    private Constants() {
    }

    /* renamed from: getTOTAL_BUTTON_OVERLAY_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m17963getTOTAL_BUTTON_OVERLAY_HEIGHTD9Ej5fM() {
        return TOTAL_BUTTON_OVERLAY_HEIGHT;
    }
}
