package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/usecase/SettingsUseCasesProvider;", "", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetSettingsUseCase;", "getSettings", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetPaymentPreferencesUseCase;", "getPaymentPreferences", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetDataAndPrivacyUseCase;", "getDataAndPrivacy", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetNotificationPreferencesUseCase;", "getNotificationPreferences", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetHelpAndSupportUseCase;", "getHelpAndSupport", "Lcom/paypal/oslo/feature/settings/domain/usecase/LogoutUseCase;", "logoutUseCase", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetAppVersionUseCase;", "getAppVersionUseCase", "Lcom/paypal/oslo/feature/settings/domain/usecase/RefreshItemUseCase;", "refreshItem", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/usecase/GetSettingsUseCase;Lcom/paypal/oslo/feature/settings/domain/usecase/GetPaymentPreferencesUseCase;Lcom/paypal/oslo/feature/settings/domain/usecase/GetDataAndPrivacyUseCase;Lcom/paypal/oslo/feature/settings/domain/usecase/GetNotificationPreferencesUseCase;Lcom/paypal/oslo/feature/settings/domain/usecase/GetHelpAndSupportUseCase;Lcom/paypal/oslo/feature/settings/domain/usecase/LogoutUseCase;Lcom/paypal/oslo/feature/settings/domain/usecase/GetAppVersionUseCase;Lcom/paypal/oslo/feature/settings/domain/usecase/RefreshItemUseCase;)V", "Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "section", "Lcom/paypal/oslo/feature/settings/domain/usecase/SectionUseCase;", "invoke", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;)Lcom/paypal/oslo/feature/settings/domain/usecase/SectionUseCase;", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetSettingsUseCase;", "getGetSettings", "()Lcom/paypal/oslo/feature/settings/domain/usecase/GetSettingsUseCase;", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetPaymentPreferencesUseCase;", "getGetPaymentPreferences", "()Lcom/paypal/oslo/feature/settings/domain/usecase/GetPaymentPreferencesUseCase;", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetDataAndPrivacyUseCase;", "getGetDataAndPrivacy", "()Lcom/paypal/oslo/feature/settings/domain/usecase/GetDataAndPrivacyUseCase;", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetNotificationPreferencesUseCase;", "getGetNotificationPreferences", "()Lcom/paypal/oslo/feature/settings/domain/usecase/GetNotificationPreferencesUseCase;", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetHelpAndSupportUseCase;", "getGetHelpAndSupport", "()Lcom/paypal/oslo/feature/settings/domain/usecase/GetHelpAndSupportUseCase;", "Lcom/paypal/oslo/feature/settings/domain/usecase/LogoutUseCase;", "getLogoutUseCase", "()Lcom/paypal/oslo/feature/settings/domain/usecase/LogoutUseCase;", "Lcom/paypal/oslo/feature/settings/domain/usecase/GetAppVersionUseCase;", "getGetAppVersionUseCase", "()Lcom/paypal/oslo/feature/settings/domain/usecase/GetAppVersionUseCase;", "Lcom/paypal/oslo/feature/settings/domain/usecase/RefreshItemUseCase;", "getRefreshItem", "()Lcom/paypal/oslo/feature/settings/domain/usecase/RefreshItemUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsUseCasesProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase getAppVersionUseCase;
    private final com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase getDataAndPrivacy;
    private final com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase getHelpAndSupport;
    private final com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase getNotificationPreferences;
    private final com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase getPaymentPreferences;
    private final com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase getSettings;
    private final com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase logoutUseCase;
    private final com.paypal.oslo.feature.settings.domain.usecase.RefreshItemUseCase refreshItem;

    @javax.inject.Inject
    public SettingsUseCasesProvider(com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase getSettingsUseCase, com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase getPaymentPreferencesUseCase, com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase getDataAndPrivacyUseCase, com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase getNotificationPreferencesUseCase, com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase getHelpAndSupportUseCase, com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase logoutUseCase, com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase getAppVersionUseCase, com.paypal.oslo.feature.settings.domain.usecase.RefreshItemUseCase refreshItemUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSettingsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentPreferencesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDataAndPrivacyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getNotificationPreferencesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getHelpAndSupportUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoutUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAppVersionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshItemUseCase, "");
        this.getSettings = getSettingsUseCase;
        this.getPaymentPreferences = getPaymentPreferencesUseCase;
        this.getDataAndPrivacy = getDataAndPrivacyUseCase;
        this.getNotificationPreferences = getNotificationPreferencesUseCase;
        this.getHelpAndSupport = getHelpAndSupportUseCase;
        this.logoutUseCase = logoutUseCase;
        this.getAppVersionUseCase = getAppVersionUseCase;
        this.refreshItem = refreshItemUseCase;
    }

    public final com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase getGetSettings() {
        return this.getSettings;
    }

    public final com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase getGetPaymentPreferences() {
        return this.getPaymentPreferences;
    }

    public final com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase getGetDataAndPrivacy() {
        return this.getDataAndPrivacy;
    }

    public final com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase getGetNotificationPreferences() {
        return this.getNotificationPreferences;
    }

    public final com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase getGetHelpAndSupport() {
        return this.getHelpAndSupport;
    }

    public final com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase getLogoutUseCase() {
        return this.logoutUseCase;
    }

    public final com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase getGetAppVersionUseCase() {
        return this.getAppVersionUseCase;
    }

    public final com.paypal.oslo.feature.settings.domain.usecase.RefreshItemUseCase getRefreshItem() {
        return this.refreshItem;
    }

    public final com.paypal.oslo.feature.settings.domain.usecase.SectionUseCase invoke(com.paypal.oslo.feature.settings.domain.model.SettingSection section) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        int i = com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider.WhenMappings.$EnumSwitchMapping$0[section.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return this.getDataAndPrivacy;
        }
        if (i == 3) {
            return this.getPaymentPreferences;
        }
        if (i == 4) {
            return this.getNotificationPreferences;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return this.getHelpAndSupport;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.settings.domain.model.SettingSection.values().length];
            try {
                iArr[com.paypal.oslo.feature.settings.domain.model.SettingSection.ACCOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.domain.model.SettingSection.PAYMENT_PREFERENCES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.domain.model.SettingSection.NOTIFICATIONS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.domain.model.SettingSection.HELP_SUPPORT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
