package com.paypal.oslo.feature.settings.domain.mapper.accountsettings;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/mapper/accountsettings/AccountSettingsDataMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/settings/domain/model/AccountSettingsData;", "localData", "Lcom/paypal/oslo/feature/settings/domain/util/AccountSettingsStrings;", "strings", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "settingsDynamicConfiguration", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "formatAddressUseCase", "", "formattedName", "", "isAccountDiscoverable", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", "map", "(Lcom/paypal/oslo/feature/settings/domain/model/AccountSettingsData;Lcom/paypal/oslo/feature/settings/domain/util/AccountSettingsStrings;Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "p1", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;Lcom/paypal/oslo/core/i18n/domain/model/Address;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountSettingsDataMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper INSTANCE = new com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper();

    private AccountSettingsDataMapper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object map(com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData, com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings accountSettingsStrings, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration, com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, java.lang.String str, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> continuation) {
        com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper$map$1 accountSettingsDataMapper$map$1;
        int i;
        java.lang.Boolean bool2;
        java.lang.Object obj;
        com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings accountSettingsStrings2;
        com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration2;
        com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData2;
        java.lang.String str2;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge badge;
        java.util.Iterator it;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData;
        if (continuation instanceof com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper$map$1) {
            accountSettingsDataMapper$map$1 = (com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper$map$1) continuation;
            if ((accountSettingsDataMapper$map$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                accountSettingsDataMapper$map$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj2 = accountSettingsDataMapper$map$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = accountSettingsDataMapper$map$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.core.i18n.domain.model.Address rawAddress = accountSettingsData.getRawAddress();
                    accountSettingsDataMapper$map$1.Camera2StreamConfigurationMap = accountSettingsData;
                    accountSettingsDataMapper$map$1.getHighSpeedVideoFpsRangesFor = accountSettingsStrings;
                    accountSettingsDataMapper$map$1.getHighResolutionOutputSizeshNQ4ISI = settingsDynamicConfiguration;
                    accountSettingsDataMapper$map$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatAddressUseCase);
                    accountSettingsDataMapper$map$1.getHighSpeedVideoFpsRanges = str;
                    bool2 = bool;
                    accountSettingsDataMapper$map$1.getInputFormats = bool2;
                    accountSettingsDataMapper$map$1.getInputSizeshNQ4ISI = 1;
                    java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(formatAddressUseCase, rawAddress, accountSettingsDataMapper$map$1);
                    if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = highSpeedVideoFpsRangesFor;
                    accountSettingsStrings2 = accountSettingsStrings;
                    settingsDynamicConfiguration2 = settingsDynamicConfiguration;
                    accountSettingsData2 = accountSettingsData;
                    str2 = str;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Boolean bool3 = (java.lang.Boolean) accountSettingsDataMapper$map$1.getInputFormats;
                    str2 = (java.lang.String) accountSettingsDataMapper$map$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration3 = (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration) accountSettingsDataMapper$map$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings accountSettingsStrings3 = (com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings) accountSettingsDataMapper$map$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData3 = (com.paypal.oslo.feature.settings.domain.model.AccountSettingsData) accountSettingsDataMapper$map$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    bool2 = bool3;
                    obj = obj2;
                    accountSettingsStrings2 = accountSettingsStrings3;
                    accountSettingsData2 = accountSettingsData3;
                    settingsDynamicConfiguration2 = settingsDynamicConfiguration3;
                }
                java.lang.String str3 = (java.lang.String) obj;
                com.paypal.oslo.feature.settings.domain.model.SettingsItemData profileVisibility = accountSettingsData2.getProfileVisibility();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(bool2, java.lang.Boolean.TRUE)) {
                    badge = new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge(com.paypal.oslo.feature.settings.domain.model.BadgeType.Positive);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(bool2, java.lang.Boolean.FALSE)) {
                    badge = new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge(com.paypal.oslo.feature.settings.domain.model.BadgeType.Negative);
                } else {
                    if (bool2 != null) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    badge = null;
                }
                com.paypal.oslo.feature.settings.domain.model.AccountSettingsData copy$default = com.paypal.oslo.feature.settings.domain.model.AccountSettingsData.copy$default(accountSettingsData2, null, null, null, null, null, com.paypal.oslo.feature.settings.domain.model.SettingsItemData.copy$default(profileVisibility, null, badge, 1, null), null, 95, null);
                java.util.Map<java.lang.String, java.lang.Boolean> enabledFeatures = settingsDynamicConfiguration2.getEnabledFeatures();
                java.util.List<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings> accountSettings = com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureRowOrder.INSTANCE.getAccountSettings();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : accountSettings) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(enabledFeatures.get(((com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings) obj3).getKey()), java.lang.Boolean.TRUE)) {
                        arrayList.add(obj3);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    switch (com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings) it.next()).ordinal()]) {
                        case 1:
                            settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Account.NAME, accountSettingsStrings2.getProfileName(), str2, null, null, false, false, false, com.paypal.oslo.feature.userprofile.api.navigation.UpdateNameDestination.INSTANCE, str2 == null, null, 1272, null);
                            break;
                        case 2:
                            java.lang.String email = accountSettingsStrings2.getEmail();
                            java.lang.String value = copy$default.getEmail().getValue();
                            com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status = copy$default.getEmail().getStatus();
                            com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status2 = copy$default.getEmail().getStatus();
                            java.lang.String text$default = status2 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status2, null, accountSettingsStrings2.getEmailNegativeBadge(), null, null, 13, null) : null;
                            settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Account.EMAIL, email, value, status, text$default == null ? "" : text$default, false, false, false, com.paypal.oslo.feature.userprofile.api.navigation.AllEmailsDestination.INSTANCE, false, null, 1760, null);
                            break;
                        case 3:
                            java.lang.String phoneNumber = accountSettingsStrings2.getPhoneNumber();
                            java.lang.String value2 = copy$default.getPhoneNumber().getValue();
                            com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status3 = copy$default.getPhoneNumber().getStatus();
                            com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status4 = copy$default.getPhoneNumber().getStatus();
                            java.lang.String text$default2 = status4 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status4, null, accountSettingsStrings2.getEmailNegativeBadge(), null, null, 13, null) : null;
                            settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Account.PHONE_NUMBER, phoneNumber, value2, status3, text$default2 == null ? "" : text$default2, false, false, false, com.paypal.oslo.feature.userprofile.api.navigation.AllPhonesDestination.INSTANCE, false, null, 1760, null);
                            break;
                        case 4:
                            settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Account.ADDRESS, accountSettingsStrings2.getAddress(), str3, null, null, false, false, false, com.paypal.oslo.feature.userprofile.api.navigation.AllAddressDestination.INSTANCE, false, null, 1784, null);
                            break;
                        case 5:
                            java.lang.String profileVisibility2 = accountSettingsStrings2.getProfileVisibility();
                            java.lang.String profileVisibilitySubtitle = accountSettingsStrings2.getProfileVisibilitySubtitle();
                            com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status5 = copy$default.getProfileVisibility().getStatus();
                            com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status6 = copy$default.getProfileVisibility().getStatus();
                            java.lang.String text$default3 = status6 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status6, accountSettingsStrings2.getProfileVisibilityPositiveBadge(), accountSettingsStrings2.getProfileVisibilityNegativeBadge(), null, null, 12, null) : null;
                            settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Account.ACCOUNT_VISIBILITY, profileVisibility2, profileVisibilitySubtitle, status5, text$default3 == null ? "" : text$default3, false, false, false, com.paypal.oslo.feature.consumerprivacy.api.navigation.AccountVisibilityDestination.INSTANCE, false, null, 1760, null);
                            break;
                        case 6:
                            settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Account.STATEMENTS_AND_TAXES, accountSettingsStrings2.getStatementsAndTaxes(), accountSettingsStrings2.getStatementsAndTaxesSubtitle(), null, null, false, false, false, new com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.StatementsAndTaxesDestination("settings"), false, null, 1720, null);
                            break;
                        default:
                            throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrayList3.add(settingsItemUiData);
                }
                return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Section.ACCOUNT, accountSettingsStrings2.getTitle(), arrayList3));
            }
        }
        accountSettingsDataMapper$map$1 = new com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper$map$1(this, continuation);
        java.lang.Object obj22 = accountSettingsDataMapper$map$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = accountSettingsDataMapper$map$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        java.lang.String str32 = (java.lang.String) obj;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData profileVisibility3 = accountSettingsData2.getProfileVisibility();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(bool2, java.lang.Boolean.TRUE)) {
        }
        com.paypal.oslo.feature.settings.domain.model.AccountSettingsData copy$default2 = com.paypal.oslo.feature.settings.domain.model.AccountSettingsData.copy$default(accountSettingsData2, null, null, null, null, null, com.paypal.oslo.feature.settings.domain.model.SettingsItemData.copy$default(profileVisibility3, null, badge, 1, null), null, 95, null);
        java.util.Map<java.lang.String, java.lang.Boolean> enabledFeatures2 = settingsDynamicConfiguration2.getEnabledFeatures();
        java.util.List<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings> accountSettings2 = com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureRowOrder.INSTANCE.getAccountSettings();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        while (r7.hasNext()) {
        }
        java.util.ArrayList arrayList22 = arrayList4;
        java.util.ArrayList arrayList32 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList22, 10));
        it = arrayList22.iterator();
        while (it.hasNext()) {
        }
        return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Section.ACCOUNT, accountSettingsStrings2.getTitle(), arrayList32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper$formatAddress$1 accountSettingsDataMapper$formatAddress$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper$formatAddress$1) {
            accountSettingsDataMapper$formatAddress$1 = (com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper$formatAddress$1) continuation;
            if ((accountSettingsDataMapper$formatAddress$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                accountSettingsDataMapper$formatAddress$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = accountSettingsDataMapper$formatAddress$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = accountSettingsDataMapper$formatAddress$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (address == null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Address is null when formatting account data", null, null, 6, null);
                        return "";
                    }
                    com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration = new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, null, null, com.paypal.oslo.core.i18n.domain.model.Address.Style.MULTILINE, null, null, 111, null);
                    accountSettingsDataMapper$formatAddress$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatAddressUseCase);
                    accountSettingsDataMapper$formatAddress$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
                    accountSettingsDataMapper$formatAddress$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressConfiguration);
                    accountSettingsDataMapper$formatAddress$1.Camera2StreamConfigurationMap = 1;
                    obj = formatAddressUseCase.invoke(address, addressConfiguration, accountSettingsDataMapper$formatAddress$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str = (java.lang.String) ((arrow.core.Either) obj).getOrNull();
                return str != null ? "" : str;
            }
        }
        accountSettingsDataMapper$formatAddress$1 = new com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper$formatAddress$1(this, continuation);
        java.lang.Object obj2 = accountSettingsDataMapper$formatAddress$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = accountSettingsDataMapper$formatAddress$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        java.lang.String str2 = (java.lang.String) ((arrow.core.Either) obj2).getOrNull();
        if (str2 != null) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.values().length];
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.NAME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.EMAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.PHONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.ADDRESS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.VISIBILITY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.AccountSettings.STATEMENTS_TAXES.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
