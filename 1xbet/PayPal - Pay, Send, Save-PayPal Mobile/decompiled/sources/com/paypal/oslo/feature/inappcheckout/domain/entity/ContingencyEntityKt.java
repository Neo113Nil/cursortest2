package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "", "getRequiresFundingInstrumentRefetch", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)Z", "requiresFundingInstrumentRefetch"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContingencyEntityKt {
    public static final boolean getRequiresFundingInstrumentRefetch(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
        return (contingencyEntity instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.AddCardContingency) || (contingencyEntity instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.ReselectFIContingency) || (contingencyEntity instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.UpdateCardContingency) || (contingencyEntity instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.CitAuthContingency) || (contingencyEntity instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.ThreeDsContingency) || (contingencyEntity instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.UserConsentForBankAccountInfoContingency) || (contingencyEntity instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.BankAccountBalanceRequiredContingency);
    }
}
