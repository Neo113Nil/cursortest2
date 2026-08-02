package com.paypal.oslo.feature.inappcheckout.domain.error;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/error/InAppCheckoutErrorName;", "", "<init>", "(Ljava/lang/String;I)V", "BUYER_RESTRICTION", com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, "LOGOUT_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InAppCheckoutErrorName {
    public static final com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName BUYER_RESTRICTION;
    public static final com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName INTERNAL_SERVER_ERROR;
    public static final com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName LOGOUT_ERROR;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private InAppCheckoutErrorName(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName inAppCheckoutErrorName = new com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName("BUYER_RESTRICTION", 0);
        BUYER_RESTRICTION = inAppCheckoutErrorName;
        com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName inAppCheckoutErrorName2 = new com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, 1);
        INTERNAL_SERVER_ERROR = inAppCheckoutErrorName2;
        com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName inAppCheckoutErrorName3 = new com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName("LOGOUT_ERROR", 2);
        LOGOUT_ERROR = inAppCheckoutErrorName3;
        com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName[] inAppCheckoutErrorNameArr = {inAppCheckoutErrorName, inAppCheckoutErrorName2, inAppCheckoutErrorName3};
        getHighSpeedVideoFpsRangesFor = inAppCheckoutErrorNameArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(inAppCheckoutErrorNameArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.error.InAppCheckoutErrorName> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
