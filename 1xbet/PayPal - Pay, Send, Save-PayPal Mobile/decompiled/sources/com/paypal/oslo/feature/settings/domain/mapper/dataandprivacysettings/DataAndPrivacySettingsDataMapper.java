package com.paypal.oslo.feature.settings.domain.mapper.dataandprivacysettings;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jo\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/mapper/dataandprivacysettings/DataAndPrivacySettingsDataMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/settings/domain/model/DataAndPrivacySettingsData;", "localData", "Lcom/paypal/oslo/feature/settings/domain/util/DataAndPrivacyStrings;", "strings", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "settingsDynamicConfiguration", "", "isBiometricEnabled", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "biometricError", "Lcom/paypal/oslo/feature/settings/domain/model/LLSState;", "llsState", "", "baseUrl", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "isPrimaryUser", "hasPasskeys", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", "map", "(Lcom/paypal/oslo/feature/settings/domain/model/DataAndPrivacySettingsData;Lcom/paypal/oslo/feature/settings/domain/util/DataAndPrivacyStrings;Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;ZLcom/paypal/oslo/feature/settings/domain/error/SettingsError;Lcom/paypal/oslo/feature/settings/domain/model/LLSState;Ljava/lang/String;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;ZZ)Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsEnabledFeaturesSpecs$DataPrivacySettings;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "", "Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DataAndPrivacySettingsDataMapper {
    public static final com.paypal.oslo.feature.settings.domain.mapper.dataandprivacysettings.DataAndPrivacySettingsDataMapper INSTANCE = new com.paypal.oslo.feature.settings.domain.mapper.dataandprivacysettings.DataAndPrivacySettingsDataMapper();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.Map<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey> getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.ADS_SHOPPING_DATA_DOWNLOAD_DELETE_DATA, com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.INSTANCE.getDsrMerchantEligibility()));

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.Set<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings> getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings[]{com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.PASSKEY, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.BIOMETRICS, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.LLS});
    public static final int $stable = 8;

    private DataAndPrivacySettingsDataMapper() {
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData> map(com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData localData, com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings strings, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration, boolean isBiometricEnabled, com.paypal.oslo.feature.settings.domain.error.SettingsError biometricError, com.paypal.oslo.feature.settings.domain.model.LLSState llsState, java.lang.String baseUrl, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, boolean isPrimaryUser, boolean hasPasskeys) {
        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle toggle;
        java.lang.String text$default;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle toggle2;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDynamicConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(llsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        if (localData == null) {
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.settings.domain.error.SettingsError.GenericError.INSTANCE);
        }
        java.util.Map<java.lang.String, java.lang.Boolean> enabledFeatures = settingsDynamicConfiguration.getEnabledFeatures();
        java.util.List<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings> dataPrivacy = com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureRowOrder.INSTANCE.getDataPrivacy();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : dataPrivacy) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(enabledFeatures.get(((com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings) obj).getKey()), java.lang.Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey = getHighSpeedVideoFpsRanges.get((com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings) obj2);
            if (remoteConfigKey == null || featureGate.checkGate(remoteConfigKey)) {
                arrayList2.add(obj2);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList2) {
            com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings dataPrivacySettings = (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings) obj3;
            if (isPrimaryUser || !getHighSpeedVideoSizes.contains(dataPrivacySettings)) {
                arrayList3.add(obj3);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        java.util.Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            switch (com.paypal.oslo.feature.settings.domain.mapper.dataandprivacysettings.DataAndPrivacySettingsDataMapper.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings) it.next()).ordinal()]) {
                case 1:
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.MANAGE_ACCOUNT_HEADER, strings.getManageAccountHeader(), "", null, "", false, false, true, null, false, null, 1888, null);
                    arrayList5.add(settingsItemUiData);
                case 2:
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge badge = new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge(hasPasskeys ? com.paypal.oslo.feature.settings.domain.model.BadgeType.Positive : com.paypal.oslo.feature.settings.domain.model.BadgeType.Negative);
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.PASSKEY, strings.getPasskey(), strings.getPasskeySubtitle(), badge, com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(badge, strings.getAdded(), strings.getPasskeyDisabled(), null, null, 12, null), false, false, false, new com.paypal.oslo.feature.identity.api.navigation.PasskeyManagementDestination("settings"), false, null, 1760, null);
                    arrayList5.add(settingsItemUiData);
                case 3:
                    java.lang.String biometricErrorMessage = biometricError != null ? strings.getBiometricErrorMessage() : null;
                    if (biometricErrorMessage != null) {
                        toggle = new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle(false);
                    } else {
                        toggle = new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle(isBiometricEnabled);
                    }
                    java.lang.String fingerprintScan = strings.getFingerprintScan();
                    java.lang.String fingerprintScanSubtitle = strings.getFingerprintScanSubtitle();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle toggle3 = toggle;
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status = localData.getFingerprintScan().getStatus();
                    text$default = status != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status, null, null, null, null, 15, null) : null;
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.FINGERPRINT_SCAN, fingerprintScan, fingerprintScanSubtitle, toggle3, text$default == null ? "" : text$default, false, false, false, null, false, biometricErrorMessage, 960, null);
                    arrayList5.add(settingsItemUiData);
                case 4:
                    java.lang.String llsErrorMessage = llsState.getError() != null ? strings.getLlsErrorMessage() : null;
                    if (llsErrorMessage != null) {
                        toggle2 = new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle(false);
                    } else {
                        toggle2 = new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle(llsState.isEnabled());
                    }
                    java.lang.String lls = strings.getLls();
                    java.lang.String llsSubtitle = strings.getLlsSubtitle();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle toggle4 = toggle2;
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status2 = localData.getLls().getStatus();
                    text$default = status2 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status2, null, null, null, null, 15, null) : null;
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.LLS, lls, llsSubtitle, toggle4, text$default == null ? "" : text$default, false, false, false, null, false, llsErrorMessage, 960, null);
                    arrayList5.add(settingsItemUiData);
                case 5:
                    java.lang.String useAnAuthenticatorApp = strings.getUseAnAuthenticatorApp();
                    java.lang.String value = localData.getUseAnAuthenticatorApp().getValue();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status3 = localData.getUseAnAuthenticatorApp().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status4 = localData.getUseAnAuthenticatorApp().getStatus();
                    text$default = status4 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status4, null, null, null, null, 15, null) : null;
                    settingsItemUiData2 = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.AUTHENTICATOR_APP, useAnAuthenticatorApp, value, status3, text$default == null ? "" : text$default, false, false, false, new com.paypal.oslo.feature.identity.api.navigation.VerificationMethodsDestination("settings"), false, null, 1760, null);
                    settingsItemUiData = settingsItemUiData2;
                    arrayList5.add(settingsItemUiData);
                case 6:
                    java.lang.String managedLoginSessions = strings.getManagedLoginSessions();
                    java.lang.String value2 = localData.getManagedLoginSessions().getValue();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status5 = localData.getManagedLoginSessions().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status6 = localData.getManagedLoginSessions().getStatus();
                    text$default = status6 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status6, null, null, null, null, 15, null) : null;
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.LOGIN_SESSIONS, managedLoginSessions, value2, status5, text$default == null ? "" : text$default, false, false, false, new com.paypal.oslo.feature.identity.api.navigation.LoginAndDevicesDestination("settings"), false, null, 1696, null);
                    arrayList5.add(settingsItemUiData);
                case 7:
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.VERIFICATION_METHODS, strings.getVerificationMethods(), strings.getVerificationMethodsSubtitle(), null, "", false, false, false, new com.paypal.oslo.feature.identity.api.navigation.VerificationMethodsDestination("settings"), false, null, 1760, null);
                    arrayList5.add(settingsItemUiData);
                case 8:
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.LOGIN_DEVICES, strings.getLoginDevices(), strings.getLoginDevicesSubtitle(), null, "", false, false, false, new com.paypal.oslo.feature.identity.api.navigation.LoginAndDevicesDestination("settings"), false, null, 1760, null);
                    arrayList5.add(settingsItemUiData);
                case 9:
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.PASSWORD, strings.getPassword(), strings.getPasswordSubtitle(), null, "", false, false, false, new com.paypal.oslo.feature.identity.api.navigation.ChangePasswordDestination("settings"), false, null, 1760, null);
                    arrayList5.add(settingsItemUiData);
                case 10:
                    java.lang.String blockedContacts = strings.getBlockedContacts();
                    java.lang.String blockedContactsSubtitle = strings.getBlockedContactsSubtitle();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(baseUrl);
                    sb.append("/myaccount/transfer/homepage/contact-list/blocked-contacts");
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.BLOCKED_CONTACTS, blockedContacts, blockedContactsSubtitle, null, "", false, false, false, new com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination(sb.toString(), strings.getBlockedContacts(), com.paypal.oslo.feature.settings.constants.SettingsConstants.Analytics.BLOCKED_CONTACTS_SOURCE, true, false), false, null, 1696, null);
                    arrayList5.add(settingsItemUiData);
                case 11:
                    java.lang.String manageYourCollectedAndSharedDataHeader = strings.getManageYourCollectedAndSharedDataHeader();
                    java.lang.String value3 = localData.getAdsAndShoppingData().getValue();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status7 = localData.getAdsAndShoppingData().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status8 = localData.getAdsAndShoppingData().getStatus();
                    text$default = status8 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status8, null, null, null, null, 15, null) : null;
                    settingsItemUiData2 = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.ADS_AND_SHOPPING_HEADER, manageYourCollectedAndSharedDataHeader, value3, status7, text$default == null ? "" : text$default, false, false, true, null, false, null, 1888, null);
                    settingsItemUiData = settingsItemUiData2;
                    arrayList5.add(settingsItemUiData);
                case 12:
                    java.lang.String personalizedShopping = strings.getPersonalizedShopping();
                    java.lang.String personalizedShoppingSubtitle = strings.getPersonalizedShoppingSubtitle();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status9 = localData.getPersonalizedShopping().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status10 = localData.getPersonalizedShopping().getStatus();
                    text$default = status10 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status10, null, null, null, null, 15, null) : null;
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.PERSONALIZED_SHOPPING, personalizedShopping, personalizedShoppingSubtitle, status9, text$default == null ? "" : text$default, false, false, false, com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedShoppingDestination.INSTANCE, false, null, 1760, null);
                    arrayList5.add(settingsItemUiData);
                case 13:
                    java.lang.String personalizedAds = strings.getPersonalizedAds();
                    java.lang.String personalizedAdsSubtitle = strings.getPersonalizedAdsSubtitle();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status11 = localData.getPersonalizedAds().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status12 = localData.getPersonalizedAds().getStatus();
                    text$default = status12 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status12, null, null, null, null, 15, null) : null;
                    settingsItemUiData2 = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.PERSONALIZED_ADS, personalizedAds, personalizedAdsSubtitle, status11, text$default == null ? "" : text$default, false, false, false, com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedAdsDestination.INSTANCE, false, null, 1760, null);
                    settingsItemUiData = settingsItemUiData2;
                    arrayList5.add(settingsItemUiData);
                case 14:
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.CONNECTED_APPS, strings.getConnectedApps(), strings.getConnectedAppsSubtitle(), null, "", false, false, false, com.paypal.oslo.feature.consumerprivacy.api.navigation.ConnectedAppsAndSitesDestination.INSTANCE, false, null, 1760, null);
                    arrayList5.add(settingsItemUiData);
                case 15:
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.DOWNLOAD_DELETE_DATA, strings.getDownloadDeleteData(), strings.getDownloadDeleteDataSubtitle(), null, "", false, false, false, com.paypal.oslo.feature.dataprivacy.api.navigation.ManageYourDataDestination.INSTANCE, false, null, 1696, null);
                    arrayList5.add(settingsItemUiData);
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Section.DATA_AND_PRIVACY, strings.getTitle(), arrayList5));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.values().length];
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.MANAGE_ACCOUNT_HEADER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.PASSKEY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.BIOMETRICS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.LLS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.AUTH_APP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.MANAGED_SESSIONS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.VERIFICATION_METHODS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.LOGIN_DEVICES.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.PASSWORD.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.BLOCKED_CONTACTS.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.ADS_SHOPPING_DATA_HEADER.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.ADS_SHOPPING_DATA_PERSONALIZED_SHOPPING.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.ADS_SHOPPING_DATA_PERSONALIZED_ADS.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.ADS_SHOPPING_DATA_CONNECTED_APPS.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.DataPrivacySettings.ADS_SHOPPING_DATA_DOWNLOAD_DELETE_DATA.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
