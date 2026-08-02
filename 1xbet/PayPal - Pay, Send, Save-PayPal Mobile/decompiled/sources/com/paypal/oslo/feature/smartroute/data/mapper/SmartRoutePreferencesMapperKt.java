package com.paypal.oslo.feature.smartroute.data.mapper;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\b*\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0010\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0010\u0010\u0014\u001a\u001b\u0010\u0017\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Data;", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "toDistributionConfiguration", "(Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Data;)Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Target;", "", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Target;)F", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;)Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetEligibilityStatus;", "Lcom/paypal/oslo/feature/smartroute/domain/model/TargetEligibilityStatus;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteTargetEligibilityStatus;)Lcom/paypal/oslo/feature/smartroute/domain/model/TargetEligibilityStatus;", "toGraphQLStatus", "(Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;)Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "Lcom/paypal/oslo/feature/smartroute/domain/model/CryptoStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;", "(Lcom/paypal/oslo/feature/smartroute/domain/model/CryptoStatus;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Preferences;", "originalConfiguration", "toUpdatedConfiguration", "(Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Preferences;Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;)Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SmartRoutePreferencesMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration toDistributionConfiguration(com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Data data) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus;
        com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus2;
        com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus cryptoStatus;
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ReloadAmount reloadAmount;
        java.lang.Object currencyCode;
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ReloadAmount reloadAmount2;
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ThresholdAmount thresholdAmount;
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.AssetPreference assetPreference;
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.AssetPreference assetPreference2;
        java.lang.Object rate;
        com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus eligibilityStatus;
        com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus eligibilityStatus2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences = data.getSmartRoutePreferences();
        if (smartRoutePreferences == null) {
            throw new java.lang.IllegalStateException("smartRoutePreferences is null".toString());
        }
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Distribution distribution = smartRoutePreferences.getDistribution();
        java.util.Iterator<T> it = distribution.getTargets().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Target) obj).getAccountType() == com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType.SAVINGS) {
                break;
            }
        }
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Target target = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Target) obj;
        java.util.Iterator<T> it2 = distribution.getTargets().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Target) obj2).getAccountType() == com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType.CRYPTO_PYUSD) {
                break;
            }
        }
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Target target2 = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Target) obj2;
        float highSpeedVideoSizes = target != null ? getHighSpeedVideoSizes(target) : 0.0f;
        float highSpeedVideoSizes2 = target2 != null ? getHighSpeedVideoSizes(target2) : 0.0f;
        if (target == null || (eligibilityStatus2 = target.getEligibilityStatus()) == null || (targetEligibilityStatus = Camera2StreamConfigurationMap(eligibilityStatus2)) == null) {
            targetEligibilityStatus = com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.UNKNOWN;
        }
        com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus3 = targetEligibilityStatus;
        if (target2 == null || (eligibilityStatus = target2.getEligibilityStatus()) == null || (targetEligibilityStatus2 = Camera2StreamConfigurationMap(eligibilityStatus)) == null) {
            targetEligibilityStatus2 = com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.UNKNOWN;
        }
        com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus4 = targetEligibilityStatus2;
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.CryptocurrencyPreferences cryptocurrencyPreferences = data.getCryptocurrencyPreferences();
        java.lang.String obj3 = (cryptocurrencyPreferences == null || (assetPreference2 = cryptocurrencyPreferences.getAssetPreference()) == null || (rate = assetPreference2.getRate()) == null) ? null : rate.toString();
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.CryptocurrencyPreferences cryptocurrencyPreferences2 = data.getCryptocurrencyPreferences();
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus status = (cryptocurrencyPreferences2 == null || (assetPreference = cryptocurrencyPreferences2.getAssetPreference()) == null) ? null : assetPreference.getStatus();
        int i = status == null ? -1 : com.paypal.oslo.feature.smartroute.data.mapper.SmartRoutePreferencesMapperKt.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i != -1) {
            if (i == 1) {
                cryptoStatus = com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus.OPTED_IN;
            } else if (i == 2) {
                cryptoStatus = com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus.OPTED_OUT;
            } else if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus cryptoStatus2 = cryptoStatus;
            java.lang.String obj4 = data.getSavingsAccountFeatures().getAnnualPercentageYield().toString();
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.BalanceAutoReload balanceAutoReload = data.getBalanceAutoReload();
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold = balanceAutoReload == null ? balanceAutoReload.getOnBalanceAutoReloadThreshold() : null;
            com.paypal.oslo.feature.smartroute.data.mapper.AutoReloadConfig autoReloadConfig = new com.paypal.oslo.feature.smartroute.data.mapper.AutoReloadConfig((onBalanceAutoReloadThreshold != null || (thresholdAmount = onBalanceAutoReloadThreshold.getThresholdAmount()) == null) ? null : thresholdAmount.getValue(), (onBalanceAutoReloadThreshold != null || (reloadAmount2 = onBalanceAutoReloadThreshold.getReloadAmount()) == null) ? null : reloadAmount2.getValue(), (onBalanceAutoReloadThreshold != null || (reloadAmount = onBalanceAutoReloadThreshold.getReloadAmount()) == null || (currencyCode = reloadAmount.getCurrencyCode()) == null) ? null : currencyCode.toString(), onBalanceAutoReloadThreshold == null ? onBalanceAutoReloadThreshold.getFinancialInstrumentId() : null);
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.BalanceAutoReload balanceAutoReload2 = data.getBalanceAutoReload();
            return new com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration(getHighResolutionOutputSizeshNQ4ISI(smartRoutePreferences.getStatus()), highSpeedVideoSizes, highSpeedVideoSizes2, obj3, cryptoStatus2, obj4, (balanceAutoReload2 != null ? balanceAutoReload2.getOnBalanceAutoReloadThreshold() : null) == null, autoReloadConfig.Camera2StreamConfigurationMap, autoReloadConfig.getHighSpeedVideoFpsRanges, autoReloadConfig.getHighResolutionOutputSizeshNQ4ISI, autoReloadConfig.getHighSpeedVideoSizes, smartRoutePreferences.getVersion(), targetEligibilityStatus3, targetEligibilityStatus4);
        }
        cryptoStatus = com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus.UNKNOWN;
        com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus cryptoStatus22 = cryptoStatus;
        java.lang.String obj42 = data.getSavingsAccountFeatures().getAnnualPercentageYield().toString();
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.BalanceAutoReload balanceAutoReload3 = data.getBalanceAutoReload();
        if (balanceAutoReload3 == null) {
        }
        com.paypal.oslo.feature.smartroute.data.mapper.AutoReloadConfig autoReloadConfig2 = new com.paypal.oslo.feature.smartroute.data.mapper.AutoReloadConfig((onBalanceAutoReloadThreshold != null || (thresholdAmount = onBalanceAutoReloadThreshold.getThresholdAmount()) == null) ? null : thresholdAmount.getValue(), (onBalanceAutoReloadThreshold != null || (reloadAmount2 = onBalanceAutoReloadThreshold.getReloadAmount()) == null) ? null : reloadAmount2.getValue(), (onBalanceAutoReloadThreshold != null || (reloadAmount = onBalanceAutoReloadThreshold.getReloadAmount()) == null || (currencyCode = reloadAmount.getCurrencyCode()) == null) ? null : currencyCode.toString(), onBalanceAutoReloadThreshold == null ? onBalanceAutoReloadThreshold.getFinancialInstrumentId() : null);
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.BalanceAutoReload balanceAutoReload22 = data.getBalanceAutoReload();
        return new com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration(getHighResolutionOutputSizeshNQ4ISI(smartRoutePreferences.getStatus()), highSpeedVideoSizes, highSpeedVideoSizes2, obj3, cryptoStatus22, obj42, (balanceAutoReload22 != null ? balanceAutoReload22.getOnBalanceAutoReloadThreshold() : null) == null, autoReloadConfig2.Camera2StreamConfigurationMap, autoReloadConfig2.getHighSpeedVideoFpsRanges, autoReloadConfig2.getHighResolutionOutputSizeshNQ4ISI, autoReloadConfig2.getHighSpeedVideoSizes, smartRoutePreferences.getVersion(), targetEligibilityStatus3, targetEligibilityStatus4);
    }

    private static final float getHighSpeedVideoSizes(com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Target target) {
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.OnSmartRoutePercentage onSmartRoutePercentage;
        if (target.getEligibilityStatus() == com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus.INELIGIBLE || target.getEligibilityStatus() == com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus.UNKNOWN__ || (onSmartRoutePercentage = target.getAllocation().getOnSmartRoutePercentage()) == null) {
            return 0.0f;
        }
        return onSmartRoutePercentage.getValue();
    }

    private static final com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus) {
        int i = com.paypal.oslo.feature.smartroute.data.mapper.SmartRoutePreferencesMapperKt.WhenMappings.$EnumSwitchMapping$1[smartRouteStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.ACTIVE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INACTIVE;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INACTIVE;
    }

    private static final com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus Camera2StreamConfigurationMap(com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus smartRouteTargetEligibilityStatus) {
        int i = com.paypal.oslo.feature.smartroute.data.mapper.SmartRoutePreferencesMapperKt.WhenMappings.$EnumSwitchMapping$2[smartRouteTargetEligibilityStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.ELIGIBLE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.PROVISIONED;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.INELIGIBLE;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.UNKNOWN;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus toGraphQLStatus(com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus smartRouteStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteStatus, "");
        int i = com.paypal.oslo.feature.smartroute.data.mapper.SmartRoutePreferencesMapperKt.WhenMappings.$EnumSwitchMapping$3[smartRouteStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus.ACTIVE;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus.INACTIVE;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus toGraphQLStatus(com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus cryptoStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoStatus, "");
        int i = com.paypal.oslo.feature.smartroute.data.mapper.SmartRoutePreferencesMapperKt.WhenMappings.$EnumSwitchMapping$4[cryptoStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.OPT_IN;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.OPT_OUT;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.OPT_OUT;
    }

    public static final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration toUpdatedConfiguration(com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences preferences, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration) {
        java.lang.Object obj;
        java.lang.Object obj2;
        float f;
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration copy;
        com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage onSmartRoutePercentage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferences, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionConfiguration, "");
        java.util.Iterator<T> it = preferences.getDistribution().getTargets().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target) obj2).getAccountType() == com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType.SAVINGS) {
                break;
            }
        }
        com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target target = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target) obj2;
        float f2 = 0.0f;
        if (target != null) {
            f = target.getAllocation().getOnSmartRoutePercentage() != null ? r3.getPercentageValue() : 0.0f;
        } else {
            f = 0.0f;
        }
        java.util.Iterator<T> it2 = preferences.getDistribution().getTargets().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            if (((com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target) next).getAccountType() == com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType.CRYPTO_PYUSD) {
                obj = next;
                break;
            }
        }
        com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target target2 = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target) obj;
        if (target2 != null && (onSmartRoutePercentage = target2.getAllocation().getOnSmartRoutePercentage()) != null) {
            f2 = onSmartRoutePercentage.getPercentageValue();
        }
        copy = distributionConfiguration.copy((r30 & 1) != 0 ? distributionConfiguration.status : getHighResolutionOutputSizeshNQ4ISI(preferences.getStatus()), (r30 & 2) != 0 ? distributionConfiguration.savingsPercentage : f, (r30 & 4) != 0 ? distributionConfiguration.cryptoPercentage : f2, (r30 & 8) != 0 ? distributionConfiguration.cryptoApyRate : null, (r30 & 16) != 0 ? distributionConfiguration.cryptoOptInStatus : null, (r30 & 32) != 0 ? distributionConfiguration.savingsApy : null, (r30 & 64) != 0 ? distributionConfiguration.autoReloadEnabled : false, (r30 & 128) != 0 ? distributionConfiguration.autoReloadThresholdAmount : null, (r30 & 256) != 0 ? distributionConfiguration.autoReloadAmount : null, (r30 & 512) != 0 ? distributionConfiguration.autoReloadCurrency : null, (r30 & 1024) != 0 ? distributionConfiguration.autoReloadFinancialInstrumentId : null, (r30 & 2048) != 0 ? distributionConfiguration.version : preferences.getVersion(), (r30 & 4096) != 0 ? distributionConfiguration.savingsEligibilityStatus : null, (r30 & 8192) != 0 ? distributionConfiguration.pyusdEligibilityStatus : null);
        return copy;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.OPT_IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.OPT_OUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus.INACTIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus.ELIGIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus.PROVISIONED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus.INELIGIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.values().length];
            try {
                iArr4[com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr4[com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INACTIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus.values().length];
            try {
                iArr5[com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus.OPTED_IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr5[com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus.OPTED_OUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr5[com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }
}
