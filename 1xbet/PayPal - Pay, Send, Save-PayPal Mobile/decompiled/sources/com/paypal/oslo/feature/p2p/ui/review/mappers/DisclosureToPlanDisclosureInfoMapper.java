package com.paypal.oslo.feature.p2p.ui.review.mappers;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/mappers/DisclosureToPlanDisclosureInfoMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureInfo;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;)Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureInfo;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DisclosureToPlanDisclosureInfoMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.domain.model.Disclosure, com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DisclosureToPlanDisclosureInfoMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo map(com.paypal.oslo.feature.p2p.domain.model.Disclosure input) {
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType planDisclosureType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType planDisclosureAlertType = kotlin.jvm.internal.Intrinsics.areEqual(input.getType(), com.paypal.oslo.feature.p2p.domain.model.Disclosure.TYPENAME_QUASI_CASH) ? com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType.WARNING : com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType.INFO;
        java.lang.String type = input.getType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, com.paypal.oslo.feature.p2p.domain.model.Disclosure.TYPENAME_QUASI_CASH)) {
            planDisclosureType = com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType.QUASI_CASH;
        } else {
            planDisclosureType = kotlin.jvm.internal.Intrinsics.areEqual(type, com.paypal.oslo.feature.p2p.domain.model.Disclosure.TYPENAME_BANK_ACCOUNT_ECHECK) ? com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType.BANK_ACCOUNT_ECHECK : com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType.UNKNOWN;
        }
        return new com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo(planDisclosureAlertType, planDisclosureType, input.getLinkText(), input.getLinkUrl());
    }
}
