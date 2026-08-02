package com.paypal.oslo.core.telemetry.vendors.adjust;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustEventToken;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "USER_SIGNED_IN", "BNPL_ACQ_APPLICATION_START", "BNPL_ACQ_APPLICATION_APPROVED", "BNPL_ACQ_APPLICATION_REVIEW", "BNPL_ACQ_APPLICATION_CONFIRMED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdjustEventToken {
    public static final com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken BNPL_ACQ_APPLICATION_APPROVED;
    public static final com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken BNPL_ACQ_APPLICATION_CONFIRMED;
    public static final com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken BNPL_ACQ_APPLICATION_REVIEW;
    public static final com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken BNPL_ACQ_APPLICATION_START;
    private static final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken USER_SIGNED_IN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String token;

    private AdjustEventToken(java.lang.String str, int i, java.lang.String str2) {
        this.token = str2;
    }

    public final java.lang.String getToken() {
        return this.token;
    }

    static {
        com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken adjustEventToken = new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken("USER_SIGNED_IN", 0, "11jziy");
        USER_SIGNED_IN = adjustEventToken;
        com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken adjustEventToken2 = new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken("BNPL_ACQ_APPLICATION_START", 1, "giqnyb");
        BNPL_ACQ_APPLICATION_START = adjustEventToken2;
        com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken adjustEventToken3 = new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken("BNPL_ACQ_APPLICATION_APPROVED", 2, "haj4vh");
        BNPL_ACQ_APPLICATION_APPROVED = adjustEventToken3;
        com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken adjustEventToken4 = new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken("BNPL_ACQ_APPLICATION_REVIEW", 3, "ojs6rd");
        BNPL_ACQ_APPLICATION_REVIEW = adjustEventToken4;
        com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken adjustEventToken5 = new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken("BNPL_ACQ_APPLICATION_CONFIRMED", 4, "1ax6tq");
        BNPL_ACQ_APPLICATION_CONFIRMED = adjustEventToken5;
        com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken[] adjustEventTokenArr = {adjustEventToken, adjustEventToken2, adjustEventToken3, adjustEventToken4, adjustEventToken5};
        Camera2StreamConfigurationMap = adjustEventTokenArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(adjustEventTokenArr);
    }

    public static com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken[] values() {
        return (com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken) java.lang.Enum.valueOf(com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
