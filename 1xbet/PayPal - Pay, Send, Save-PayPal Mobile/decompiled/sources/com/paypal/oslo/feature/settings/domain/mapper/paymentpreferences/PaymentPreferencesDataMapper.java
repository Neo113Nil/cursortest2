package com.paypal.oslo.feature.settings.domain.mapper.paymentpreferences;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/mapper/paymentpreferences/PaymentPreferencesDataMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/settings/domain/model/PaymentPreferencesSettingsData;", "localData", "Lcom/paypal/oslo/feature/settings/domain/util/PaymentPreferencesStrings;", "strings", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "settingsDynamicConfiguration", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", "map", "(Lcom/paypal/oslo/feature/settings/domain/model/PaymentPreferencesSettingsData;Lcom/paypal/oslo/feature/settings/domain/util/PaymentPreferencesStrings;Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsEnabledFeaturesSpecs$PaymentPrefs;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentPreferencesDataMapper {
    public static final com.paypal.oslo.feature.settings.domain.mapper.paymentpreferences.PaymentPreferencesDataMapper INSTANCE = new com.paypal.oslo.feature.settings.domain.mapper.paymentpreferences.PaymentPreferencesDataMapper();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.Map<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.CREDIT_AUTOPAY, com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.INSTANCE.getCreditEligibility()), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.CASHBACK_AUTOPAY, com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.INSTANCE.getCashbackEligibility()), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.SAVINGS_SMART_ROUTE, com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.INSTANCE.getSavingsSmartRoute()), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.AUTO_SAVE, com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.INSTANCE.getSavingsAutoSave()), kotlin.TuplesKt.to(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.CRYPTO, com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.INSTANCE.getCryptoEligibility()));
    public static final int $stable = 8;

    private PaymentPreferencesDataMapper() {
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData> map(com.paypal.oslo.feature.settings.domain.model.PaymentPreferencesSettingsData localData, com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings strings, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData;
        java.lang.String text$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDynamicConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        if (localData == null) {
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.settings.domain.error.SettingsError.GenericError.INSTANCE);
        }
        java.util.Map<java.lang.String, java.lang.Boolean> enabledFeatures = settingsDynamicConfiguration.getEnabledFeatures();
        java.util.List<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs> paymentPreferences = com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureRowOrder.INSTANCE.getPaymentPreferences();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : paymentPreferences) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(enabledFeatures.get(((com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs) obj).getKey()), java.lang.Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey = getHighResolutionOutputSizeshNQ4ISI.get((com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs) obj2);
            if (remoteConfigKey == null || featureGate.checkGate(remoteConfigKey)) {
                arrayList2.add(obj2);
            }
        }
        java.util.ArrayList arrayList3 = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            switch (com.paypal.oslo.feature.settings.domain.mapper.paymentpreferences.PaymentPreferencesDataMapper.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs) it.next()).ordinal()]) {
                case 1:
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.ONLINE_PAYMENTS, strings.getOnlinePayments(), strings.getOnlinePaymentsFallbackText(), null, null, false, false, false, com.paypal.oslo.feature.wallet.api.navigation.OnlinePaymentDestination.INSTANCE, false, null, 1784, null);
                    break;
                case 2:
                    java.lang.String linkedBusinesses = strings.getLinkedBusinesses();
                    java.lang.String linkedBusinessesSubtitle = strings.getLinkedBusinessesSubtitle();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status = localData.getLinkedBusinesses().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status2 = localData.getLinkedBusinesses().getStatus();
                    java.lang.String text$default2 = status2 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status2, null, null, null, null, 15, null) : null;
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.LINKED_BUSINESSES, linkedBusinesses, linkedBusinessesSubtitle, status, text$default2 == null ? "" : text$default2, false, false, false, new com.paypal.oslo.feature.subscriptions.api.navigation.BusinessesHubDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), false, null, 1760, null);
                    break;
                case 3:
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.IN_STORE_PAYMENTS, strings.getInStorePayments(), strings.getInStorePaymentsFallbackText(), null, null, false, false, false, com.paypal.oslo.feature.wallet.api.navigation.InStorePaymentDestination.INSTANCE, false, null, 1720, null);
                    break;
                case 4:
                    java.lang.String moneyManagement = strings.getMoneyManagement();
                    java.lang.String value = localData.getMoneyManagement().getValue();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status3 = localData.getMoneyManagement().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status4 = localData.getMoneyManagement().getStatus();
                    text$default = status4 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status4, null, null, null, null, 15, null) : null;
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.MONEY_MANAGEMENT_HEADER, moneyManagement, value, status3, text$default == null ? "" : text$default, false, false, true, null, false, null, 1888, null);
                    break;
                case 5:
                    java.lang.String paypalBalance = strings.getPaypalBalance();
                    java.lang.String value2 = localData.getPaypalBalance().getValue();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status5 = localData.getPaypalBalance().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status6 = localData.getPaypalBalance().getStatus();
                    text$default = status6 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status6, strings.getOn(), strings.getOff(), null, null, 12, null) : null;
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_BALANCE, paypalBalance, value2, status5, text$default == null ? "" : text$default, false, false, false, com.paypal.oslo.feature.balance.api.navigation.BalanceDashboardDestination.INSTANCE, false, null, 1760, null);
                    break;
                case 6:
                    java.lang.String paypalCreditCard = strings.getPaypalCreditCard();
                    java.lang.String value3 = localData.getPaypalCredit().getValue();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status7 = localData.getPaypalCredit().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status8 = localData.getPaypalCredit().getStatus();
                    java.lang.String text$default3 = status8 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status8, strings.getOn(), null, null, null, 14, null) : null;
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_CREDIT, paypalCreditCard, value3, status7, text$default3 == null ? "" : text$default3, false, false, false, new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDestination(new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AutopayNavigationArgs(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US, (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), false, null, 1760, null);
                    break;
                case 7:
                    java.lang.String paypalCashbackCard = strings.getPaypalCashbackCard();
                    java.lang.String value4 = localData.getPaypalCashbackCard().getValue();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status9 = localData.getPaypalCashbackCard().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status10 = localData.getPaypalCashbackCard().getStatus();
                    java.lang.String text$default4 = status10 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status10, strings.getOn(), null, null, null, 14, null) : null;
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_CASHBACK_CARD, paypalCashbackCard, value4, status9, text$default4 == null ? "" : text$default4, false, false, false, new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDestination(new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AutopayNavigationArgs(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), false, null, 1760, null);
                    break;
                case 8:
                    java.lang.String payPalSmartRoute = strings.getPayPalSmartRoute();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status11 = localData.getPaypalSavings().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status12 = localData.getPaypalSavings().getStatus();
                    text$default = status12 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status12, strings.getOn(), null, null, null, 14, null) : null;
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.SAVINGS_SMART_ROUTE, payPalSmartRoute, "", status11, text$default == null ? "" : text$default, false, false, false, new com.paypal.oslo.feature.smartroute.api.navigation.SmartRouteDistributionDestination("settings"), false, null, 1760, null);
                    break;
                case 9:
                    java.lang.String paypalSavings = strings.getPaypalSavings();
                    java.lang.String autoSave = strings.getAutoSave();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status13 = localData.getAutoSave().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status14 = localData.getAutoSave().getStatus();
                    text$default = status14 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status14, strings.getOn(), strings.getOff(), null, null, 12, null) : null;
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.AUTO_SAVE, paypalSavings, autoSave, status13, text$default == null ? "" : text$default, false, false, false, com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveDestination.INSTANCE, false, null, 1760, null);
                    break;
                case 10:
                    java.lang.String crypto = strings.getCrypto();
                    java.lang.String value5 = localData.getCrypto().getValue();
                    if (value5.length() == 0) {
                        value5 = strings.getCryptoFallbackText();
                    }
                    java.lang.String str = value5;
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status15 = localData.getCrypto().getStatus();
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status16 = localData.getCrypto().getStatus();
                    text$default = status16 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status16, strings.getOn(), null, null, null, 14, null) : null;
                    settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.CRYPTO, crypto, str, status15, text$default == null ? "" : text$default, false, false, false, com.paypal.oslo.feature.cryptocurrency.api.navigation.MoneyManagementCryptocurrencySettingsDestination.INSTANCE, false, null, 1696, null);
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
            arrayList4.add(settingsItemUiData);
        }
        return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Section.PAYMENT_PREFERENCES, strings.getTitle(), arrayList4));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.values().length];
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.ONLINE_PAYMENTS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.LINKED_BUSINESSES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.IN_STORE_PAYMENTS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.MONEY_MANAGEMENT_HEADER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.BALANCE_AUTO_RELOAD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.CREDIT_AUTOPAY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.CASHBACK_AUTOPAY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.SAVINGS_SMART_ROUTE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.AUTO_SAVE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PaymentPrefs.CRYPTO.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
