package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingOptions;", "", "isBankOnlySupportedAsSecondaryFundingOption", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingOptions;)Z", "isBankAndDebitCardSupported", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SecondaryFundingOptionType;", "(Ljava/util/Set;)Z", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceStatus;", "resolveFundingSourceStatus", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceStatus;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentFundingOptionsExtensionsKt {
    public static final boolean isBankOnlySupportedAsSecondaryFundingOption(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions debitCardFundingOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingOptions, "");
        java.util.Set<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> secondaryFundingOptions = debitCardFundingOptions.getSecondaryFundingOptions();
        return secondaryFundingOptions != null && secondaryFundingOptions.size() == 1 && kotlin.collections.CollectionsKt.first(secondaryFundingOptions) == com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType.BANK;
    }

    public static final boolean isBankAndDebitCardSupported(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions debitCardFundingOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingOptions, "");
        return isBankAndDebitCardSupported(debitCardFundingOptions.getSecondaryFundingOptions());
    }

    public static final boolean isBankAndDebitCardSupported(java.util.Set<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> set) {
        return set != null && set.contains(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType.BANK) && set.contains(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType.DEBIT_CARD);
    }

    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus resolveFundingSourceStatus(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        if (debitCardProductName == com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD && featureGateManager.isPpdcContingencyHandlingEnabled()) {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus.CONTINGENT;
        }
        return com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus.ELIGIBLE;
    }
}
