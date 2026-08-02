package com.paypal.oslo.feature.consumerprivacy.ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyToolbarNavigationType;", "", "<init>", "(Ljava/lang/String;I)V", com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK, com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PrivacyToolbarNavigationType {
    public static final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType BACK;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType CLOSE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType[] getHighSpeedVideoSizes;

    private PrivacyToolbarNavigationType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType privacyToolbarNavigationType = new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType(com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK, 0);
        BACK = privacyToolbarNavigationType;
        com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType privacyToolbarNavigationType2 = new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, 1);
        CLOSE = privacyToolbarNavigationType2;
        com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType[] privacyToolbarNavigationTypeArr = {privacyToolbarNavigationType, privacyToolbarNavigationType2};
        getHighSpeedVideoSizes = privacyToolbarNavigationTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(privacyToolbarNavigationTypeArr);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType[] values() {
        return (com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
