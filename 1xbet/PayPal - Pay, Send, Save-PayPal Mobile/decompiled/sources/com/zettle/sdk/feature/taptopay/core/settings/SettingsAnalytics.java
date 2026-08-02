package com.zettle.sdk.feature.taptopay.core.settings;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000 !2\u00020\u0001:\u0001!J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u001a\u0010\rR\u001e\u0010 \u001a\u0004\u0018\u00010\u001b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics;", "", "", "trackClickedCancelFirstPayment", "()V", "trackClickedGeneralTerms", "trackClickedPaymentsTerms", "trackClickedPrivacyPolicyTerms", "trackClickedReadMore", "trackClickedTakeFirstPayment", "Lcom/zettle/sdk/feature/taptopay/core/settings/WarningType;", "warningType", "trackClickedWarningDialogBack", "(Lcom/zettle/sdk/feature/taptopay/core/settings/WarningType;)V", "trackClickedWarningDialogSettings", "trackDevOptionsInActivation", "trackScreenClosed", "trackScreenOpened", "trackShowPagerLastPage", "trackStartPagerScroll", "", "enabled", "trackToggled", "(Z)V", "trackViewedActivationDetails", "trackViewedFirstPaymentDialog", "trackViewedWarningDialog", "", "getActivationSessionId", "()Ljava/lang/String;", "setActivationSessionId", "(Ljava/lang/String;)V", "activationSessionId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SettingsAnalytics {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalytics.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalytics.Companion.getHighSpeedVideoFpsRangesFor;

    java.lang.String getActivationSessionId();

    void setActivationSessionId(java.lang.String str);

    void trackClickedCancelFirstPayment();

    void trackClickedGeneralTerms();

    void trackClickedPaymentsTerms();

    void trackClickedPrivacyPolicyTerms();

    void trackClickedReadMore();

    void trackClickedTakeFirstPayment();

    void trackClickedWarningDialogBack(com.zettle.sdk.feature.taptopay.core.settings.WarningType warningType);

    void trackClickedWarningDialogSettings(com.zettle.sdk.feature.taptopay.core.settings.WarningType warningType);

    void trackDevOptionsInActivation();

    void trackScreenClosed();

    void trackScreenOpened();

    void trackShowPagerLastPage();

    void trackStartPagerScroll();

    void trackToggled(boolean enabled);

    void trackViewedActivationDetails();

    void trackViewedFirstPaymentDialog();

    void trackViewedWarningDialog(com.zettle.sdk.feature.taptopay.core.settings.WarningType warningType);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalytics.Companion getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalytics.Companion();

        private Companion() {
        }
    }
}
