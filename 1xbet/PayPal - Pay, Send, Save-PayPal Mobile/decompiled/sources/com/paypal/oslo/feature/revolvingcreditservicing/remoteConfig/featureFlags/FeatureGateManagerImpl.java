package com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManagerImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isTestFeatureEnabled", "()Z", "mockGraphqlEnabled", "isPayPalPlusCbmcEnabled", "cardActivationFeatureEnabled", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "product", "isServicingKilledFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Z", "isPushToWalletEnabled", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeatureGateManagerImpl implements com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FeatureGateManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighResolutionOutputSizeshNQ4ISI = featureGate;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager
    public final boolean isTestFeatureEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.RevolvingCreditFeatureGateSpec.INSTANCE.isTestFeatureEnabled());
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager
    public final boolean mockGraphqlEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.RevolvingCreditFeatureGateSpec.INSTANCE.getMockGraphqlEnabled());
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager
    public final boolean isPayPalPlusCbmcEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.RevolvingCreditFeatureGateSpec.INSTANCE.getPayPalPlusCbmc());
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager
    public final boolean cardActivationFeatureEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.RevolvingCreditFeatureGateSpec.INSTANCE.getCardActivationFeatureEnabled());
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager
    public final boolean isPushToWalletEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.RevolvingCreditFeatureGateSpec.INSTANCE.getPushToWalletEnabled());
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager
    public final boolean isServicingKilledFor(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier product) {
        com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey killSwitchPpccUs;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        switch (com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManagerImpl.WhenMappings.$EnumSwitchMapping$0[product.ordinal()]) {
            case 1:
                killSwitchPpccUs = com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.RevolvingCreditFeatureGateSpec.INSTANCE.getKillSwitchPpccUs();
                break;
            case 2:
                killSwitchPpccUs = com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.RevolvingCreditFeatureGateSpec.INSTANCE.getKillSwitchCbmc();
                break;
            case 3:
                killSwitchPpccUs = com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.RevolvingCreditFeatureGateSpec.INSTANCE.getKillSwitchPpcUsV2();
                break;
            case 4:
                killSwitchPpccUs = com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.RevolvingCreditFeatureGateSpec.INSTANCE.getKillSwitchSyfUsEbaymc();
                break;
            case 5:
                killSwitchPpccUs = com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.RevolvingCreditFeatureGateSpec.INSTANCE.getKillSwitchSyfUsPpmc();
                break;
            case 6:
                killSwitchPpccUs = com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.RevolvingCreditFeatureGateSpec.INSTANCE.getKillSwitchSyfUsSmtcnct();
                break;
            case 7:
                killSwitchPpccUs = com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.RevolvingCreditFeatureGateSpec.INSTANCE.getKillSwitchPpUkPpc();
                break;
            case 8:
                killSwitchPpccUs = null;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        if (killSwitchPpccUs == null) {
            return false;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate(killSwitchPpccUs);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PPC_US_V2.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_EBAYMC.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_PPMC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_SMTCNCT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
