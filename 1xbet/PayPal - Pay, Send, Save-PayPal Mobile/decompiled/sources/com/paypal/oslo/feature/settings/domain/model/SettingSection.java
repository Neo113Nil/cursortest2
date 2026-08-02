package com.paypal.oslo.feature.settings.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT", "PAYMENT_PREFERENCES", "DATA_PRIVACY", "NOTIFICATIONS", "HELP_SUPPORT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingSection {
    public static final com.paypal.oslo.feature.settings.domain.model.SettingSection ACCOUNT;
    public static final com.paypal.oslo.feature.settings.domain.model.SettingSection DATA_PRIVACY;
    public static final com.paypal.oslo.feature.settings.domain.model.SettingSection HELP_SUPPORT;
    public static final com.paypal.oslo.feature.settings.domain.model.SettingSection NOTIFICATIONS;
    public static final com.paypal.oslo.feature.settings.domain.model.SettingSection PAYMENT_PREFERENCES;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingSection[] getHighSpeedVideoSizes;

    private SettingSection(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection = new com.paypal.oslo.feature.settings.domain.model.SettingSection("ACCOUNT", 0);
        ACCOUNT = settingSection;
        com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection2 = new com.paypal.oslo.feature.settings.domain.model.SettingSection("PAYMENT_PREFERENCES", 1);
        PAYMENT_PREFERENCES = settingSection2;
        com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection3 = new com.paypal.oslo.feature.settings.domain.model.SettingSection("DATA_PRIVACY", 2);
        DATA_PRIVACY = settingSection3;
        com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection4 = new com.paypal.oslo.feature.settings.domain.model.SettingSection("NOTIFICATIONS", 3);
        NOTIFICATIONS = settingSection4;
        com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection5 = new com.paypal.oslo.feature.settings.domain.model.SettingSection("HELP_SUPPORT", 4);
        HELP_SUPPORT = settingSection5;
        com.paypal.oslo.feature.settings.domain.model.SettingSection[] settingSectionArr = {settingSection, settingSection2, settingSection3, settingSection4, settingSection5};
        getHighSpeedVideoSizes = settingSectionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(settingSectionArr);
    }

    public static com.paypal.oslo.feature.settings.domain.model.SettingSection[] values() {
        return (com.paypal.oslo.feature.settings.domain.model.SettingSection[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.settings.domain.model.SettingSection valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.settings.domain.model.SettingSection) java.lang.Enum.valueOf(com.paypal.oslo.feature.settings.domain.model.SettingSection.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.settings.domain.model.SettingSection> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
