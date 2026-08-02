package com.paypal.oslo.feature.revolvingcreditacquisition.data.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/data/remoteconfig/FeatureGateManagerImpl;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/remoteconfig/FeatureGateManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isNativeFlowEnabled", "()Z", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "product", "isAcquisitionFlowDisabledFor", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;)Z", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FeatureGateManagerImpl implements com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.FeatureGateManager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public FeatureGateManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRangesFor = featureGate;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.FeatureGateManager
    public final boolean isNativeFlowEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.RevolvingCreditAcquisitionFeatureGateSpec.INSTANCE.isNativeFlowEnabled());
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.FeatureGateManager
    public final boolean isAcquisitionFlowDisabledFor(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier product) {
        com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey killSwitchCbmc;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        int i = com.paypal.oslo.feature.revolvingcreditacquisition.data.remoteconfig.FeatureGateManagerImpl.WhenMappings.$EnumSwitchMapping$0[product.ordinal()];
        if (i == 1) {
            killSwitchCbmc = com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.RevolvingCreditAcquisitionFeatureGateSpec.INSTANCE.getKillSwitchCbmc();
        } else if (i == 2) {
            killSwitchCbmc = com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.RevolvingCreditAcquisitionFeatureGateSpec.INSTANCE.getKillSwitchPpccUs();
        } else if (i == 3) {
            killSwitchCbmc = com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.RevolvingCreditAcquisitionFeatureGateSpec.INSTANCE.getKillSwitchPpUkPpc();
        } else {
            if (i != 4 && i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            killSwitchCbmc = null;
        }
        if (killSwitchCbmc == null) {
            return true;
        }
        return this.getHighSpeedVideoFpsRangesFor.checkGate(killSwitchCbmc);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.PP_UK_PPC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.PPC_US_V2.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
