package com.paypal.oslo.feature.settings.domain.mapper.notificationpreferences;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/mapper/notificationpreferences/NotificationPreferencesDataMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/settings/domain/model/NotificationPreferencesSettingsData;", "localData", "Lcom/paypal/oslo/feature/settings/domain/util/NotificationsStrings;", "strings", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "settingsDynamicConfiguration", "", "baseUrl", "", "isPrimaryUser", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", "map", "(Lcom/paypal/oslo/feature/settings/domain/model/NotificationPreferencesSettingsData;Lcom/paypal/oslo/feature/settings/domain/util/NotificationsStrings;Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;Ljava/lang/String;Z)Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsEnabledFeaturesSpecs$NotificationPrefs;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NotificationPreferencesDataMapper {
    public static final com.paypal.oslo.feature.settings.domain.mapper.notificationpreferences.NotificationPreferencesDataMapper INSTANCE = new com.paypal.oslo.feature.settings.domain.mapper.notificationpreferences.NotificationPreferencesDataMapper();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.Set<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs> getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs[]{com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.RECEIVE_PUSH, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.GENERAL_NOTIFICATIONS_PUSH});
    public static final int $stable = 8;

    private NotificationPreferencesDataMapper() {
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData> map(com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData localData, com.paypal.oslo.feature.settings.domain.util.NotificationsStrings strings, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration, java.lang.String baseUrl, boolean isPrimaryUser) {
        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData;
        java.lang.String text$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDynamicConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUrl, "");
        if (localData == null) {
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.settings.domain.error.SettingsError.GenericError.INSTANCE);
        }
        java.util.Map<java.lang.String, java.lang.Boolean> enabledFeatures = settingsDynamicConfiguration.getEnabledFeatures();
        java.util.List<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs> notificationPreferences = com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureRowOrder.INSTANCE.getNotificationPreferences();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : notificationPreferences) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(enabledFeatures.get(((com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs) obj).getKey()), java.lang.Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs notificationPrefs = (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs) obj2;
            if (isPrimaryUser || !getHighSpeedVideoFpsRangesFor.contains(notificationPrefs)) {
                arrayList2.add(obj2);
            }
        }
        java.util.ArrayList arrayList3 = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            int i = com.paypal.oslo.feature.settings.domain.mapper.notificationpreferences.NotificationPreferencesDataMapper.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs) it.next()).ordinal()];
            if (i == 1) {
                settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.NotificationPreferences.RECEIVE_PUSH, strings.getReceivePushNotifications(), strings.getReceivePushNotificationsSubtitle(), com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Action.INSTANCE, strings.getTurnOn(), false, false, false, null, false, null, 1920, null);
            } else if (i == 2) {
                java.lang.String generalNotifications = strings.getGeneralNotifications();
                java.lang.String value = localData.getGeneralNotifications().getValue();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status = localData.getGeneralNotifications().getStatus();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status2 = localData.getGeneralNotifications().getStatus();
                text$default = status2 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status2, null, null, null, null, 15, null) : null;
                settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.NotificationPreferences.GENERAL_NOTIFICATIONS_HEADER, generalNotifications, value, status, text$default == null ? "" : text$default, false, false, true, null, false, null, 1888, null);
            } else if (i == 3) {
                java.lang.String pushNotifications = strings.getPushNotifications();
                java.lang.String value2 = localData.getPushNotifications().getValue();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status3 = localData.getPushNotifications().getStatus();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status4 = localData.getPushNotifications().getStatus();
                text$default = status4 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status4, null, null, null, null, 15, null) : null;
                settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.NotificationPreferences.PUSH_NOTIFICATIONS, pushNotifications, value2, status3, text$default == null ? "" : text$default, false, false, false, com.paypal.oslo.feature.pushnotification.api.PushNotificationPreferencesDestination.INSTANCE, false, null, 1760, null);
            } else if (i != 4) {
                if (i != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.lang.String marketing = strings.getMarketing();
                java.lang.String value3 = localData.getMarketing().getValue();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status5 = localData.getMarketing().getStatus();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status6 = localData.getMarketing().getStatus();
                text$default = status6 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status6, null, null, null, null, 15, null) : null;
                java.lang.String str = text$default == null ? "" : text$default;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(baseUrl);
                sb.append("/myaccount/preferences/notifications/marketing?hide-menu=true");
                settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.NotificationPreferences.MARKETING, marketing, value3, status5, str, false, false, false, new com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination(sb.toString(), strings.getMarketing(), com.paypal.oslo.feature.settings.constants.SettingsConstants.Analytics.MARKETING_SOURCE, true, false), false, null, 1696, null);
            } else {
                java.lang.String smsAndEmail = strings.getSmsAndEmail();
                java.lang.String value4 = localData.getSmsAndEmail().getValue();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status7 = localData.getSmsAndEmail().getStatus();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status8 = localData.getSmsAndEmail().getStatus();
                text$default = status8 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status8, null, null, null, null, 15, null) : null;
                java.lang.String str2 = text$default == null ? "" : text$default;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(baseUrl);
                sb2.append("/myaccount/preferences/notifications");
                settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.NotificationPreferences.SMS_AND_EMAIL, smsAndEmail, value4, status7, str2, false, false, false, new com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination(sb2.toString(), strings.getSmsAndEmail(), com.paypal.oslo.feature.settings.constants.SettingsConstants.Analytics.SMS_EMAIL_SOURCE, true, false), false, null, 1760, null);
            }
            arrayList4.add(settingsItemUiData);
        }
        return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Section.NOTIFICATION_PREFERENCES, strings.getTitle(), arrayList4));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.values().length];
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.RECEIVE_PUSH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.GENERAL_NOTIFICATIONS_HEADER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.GENERAL_NOTIFICATIONS_PUSH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.GENERAL_NOTIFICATIONS_SMS_EMAIL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NotificationPrefs.GENERAL_NOTIFICATIONS_MARKETING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
