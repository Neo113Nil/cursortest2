package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/PrePaymentDisclosureMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment;", "Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment;)Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PrePaymentDisclosureMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment, com.paypal.oslo.feature.p2p.domain.model.Disclosure> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PrePaymentDisclosureMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.Disclosure map(com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment input) {
        int intValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentHoldDisclosure onPaymentHoldDisclosure = input.getOnPaymentHoldDisclosure();
        if (onPaymentHoldDisclosure == null) {
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnDelayedDebitDisclosure onDelayedDebitDisclosure = input.getOnDelayedDebitDisclosure();
            if (onDelayedDebitDisclosure != null) {
                java.lang.String str = input.get__typename();
                int priority = onDelayedDebitDisclosure.getPriority();
                java.lang.Object maxDuration = onDelayedDebitDisclosure.getMaxDuration();
                return new com.paypal.oslo.feature.p2p.domain.model.Disclosure(str, priority, maxDuration != null ? maxDuration.toString() : null, null, null, null, null, null, null, 504, null);
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentCannotBeReversedDisclosure onPaymentCannotBeReversedDisclosure = input.getOnPaymentCannotBeReversedDisclosure();
            if (onPaymentCannotBeReversedDisclosure != null) {
                intValue = onPaymentCannotBeReversedDisclosure.getPriority();
            } else {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnConfirmPurchaseTransactionDisclosure onConfirmPurchaseTransactionDisclosure = input.getOnConfirmPurchaseTransactionDisclosure();
                if (onConfirmPurchaseTransactionDisclosure != null) {
                    intValue = onConfirmPurchaseTransactionDisclosure.getPriority();
                } else {
                    com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPrePaymentRemittanceDisclosure onPrePaymentRemittanceDisclosure = input.getOnPrePaymentRemittanceDisclosure();
                    java.lang.Integer valueOf = onPrePaymentRemittanceDisclosure != null ? java.lang.Integer.valueOf(onPrePaymentRemittanceDisclosure.getPriority()) : null;
                    if (valueOf == null) {
                        com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnForeignTaxDisclosure onForeignTaxDisclosure = input.getOnForeignTaxDisclosure();
                        valueOf = onForeignTaxDisclosure != null ? java.lang.Integer.valueOf(onForeignTaxDisclosure.getPriority()) : null;
                        if (valueOf == null) {
                            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnStateMandatedFraudulentActivityDisclosure onStateMandatedFraudulentActivityDisclosure = input.getOnStateMandatedFraudulentActivityDisclosure();
                            valueOf = onStateMandatedFraudulentActivityDisclosure != null ? java.lang.Integer.valueOf(onStateMandatedFraudulentActivityDisclosure.getPriority()) : null;
                            if (valueOf == null) {
                                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchDisclosure onPaymentLinkAchDisclosure = input.getOnPaymentLinkAchDisclosure();
                                valueOf = onPaymentLinkAchDisclosure != null ? java.lang.Integer.valueOf(onPaymentLinkAchDisclosure.getPriority()) : null;
                                if (valueOf == null) {
                                    com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericDisclosure onPaymentLinkGenericDisclosure = input.getOnPaymentLinkGenericDisclosure();
                                    valueOf = onPaymentLinkGenericDisclosure != null ? java.lang.Integer.valueOf(onPaymentLinkGenericDisclosure.getPriority()) : null;
                                    if (valueOf == null) {
                                        com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchWithTermDisclosure onPaymentLinkAchWithTermDisclosure = input.getOnPaymentLinkAchWithTermDisclosure();
                                        valueOf = onPaymentLinkAchWithTermDisclosure != null ? java.lang.Integer.valueOf(onPaymentLinkAchWithTermDisclosure.getPriority()) : null;
                                        if (valueOf == null) {
                                            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure onPaymentLinkGenericWithTermDisclosure = input.getOnPaymentLinkGenericWithTermDisclosure();
                                            valueOf = onPaymentLinkGenericWithTermDisclosure != null ? java.lang.Integer.valueOf(onPaymentLinkGenericWithTermDisclosure.getPriority()) : null;
                                            if (valueOf == null) {
                                                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnUnilateralRecipientDisclosure onUnilateralRecipientDisclosure = input.getOnUnilateralRecipientDisclosure();
                                                java.lang.Integer valueOf2 = onUnilateralRecipientDisclosure != null ? java.lang.Integer.valueOf(onUnilateralRecipientDisclosure.getPriority()) : null;
                                                intValue = valueOf2 != null ? valueOf2.intValue() : 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    intValue = valueOf.intValue();
                }
            }
            return new com.paypal.oslo.feature.p2p.domain.model.Disclosure(input.get__typename(), intValue, null, null, null, null, null, null, null, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, null);
        }
        return new com.paypal.oslo.feature.p2p.domain.model.Disclosure(input.get__typename(), onPaymentHoldDisclosure.getPriority(), null, onPaymentHoldDisclosure.getHoldDuration().toString(), null, null, null, null, null, 500, null);
    }
}
