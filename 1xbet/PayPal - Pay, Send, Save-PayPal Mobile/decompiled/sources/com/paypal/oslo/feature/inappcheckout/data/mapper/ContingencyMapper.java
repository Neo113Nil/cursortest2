package com.paypal.oslo.feature.inappcheckout.data.mapper;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/ContingencyDTO;", "contingencyDTO", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "map", "(Lcom/paypal/oslo/feature/inappcheckout/data/dto/ContingencyDTO;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$Contingency;", "contingency", "getContingency", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$Contingency;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContingencyMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ContingencyMapper() {
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity map(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO contingencyDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyDTO, "");
        if (contingencyDTO instanceof com.paypal.oslo.feature.inappcheckout.data.dto.AddCardContingencyDTO) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.AddCardContingency(null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.FUNDING_SELECTION, 1, null);
        }
        if (contingencyDTO instanceof com.paypal.oslo.feature.inappcheckout.data.dto.AuthChallengeContingencyDTO) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthChallengeContingency(null, ((com.paypal.oslo.feature.inappcheckout.data.dto.AuthChallengeContingencyDTO) contingencyDTO).getStepUpAuthID(), com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.FUNDING_SELECTION, 1, null);
        }
        if (contingencyDTO instanceof com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO) {
            com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO preAuthRequiredContingencyDTO = (com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO) contingencyDTO;
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.PreAuthRequiredContingency(null, preAuthRequiredContingencyDTO.getAuthorizationAmount(), preAuthRequiredContingencyDTO.getFundingInstrument(), preAuthRequiredContingencyDTO.getCurrencyCode(), com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.FUNDING_SELECTION, 1, null);
        }
        if (contingencyDTO instanceof com.paypal.oslo.feature.inappcheckout.data.dto.ThreeDsContingencyDTO) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.ThreeDsContingency(null, ((com.paypal.oslo.feature.inappcheckout.data.dto.ThreeDsContingencyDTO) contingencyDTO).getFundingInstrument(), com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.FUNDING_SELECTION, 1, null);
        }
        if (contingencyDTO instanceof com.paypal.oslo.feature.inappcheckout.data.dto.UserConsentForBankAccountInfoContingencyDTO) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.UserConsentForBankAccountInfoContingency(null, null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.FUNDING_SELECTION, 3, null);
        }
        if (contingencyDTO instanceof com.paypal.oslo.feature.inappcheckout.data.dto.BankAccountBalanceRequiredContingencyDTO) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.BankAccountBalanceRequiredContingency(null, null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.FUNDING_SELECTION, 3, null);
        }
        if (contingencyDTO instanceof com.paypal.oslo.feature.inappcheckout.data.dto.CitAuthContingencyDTO) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.CitAuthContingency(null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.FUNDING_SELECTION, 1, null);
        }
        if (contingencyDTO instanceof com.paypal.oslo.feature.inappcheckout.data.dto.ReselectFIContingencyDTO) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.ReselectFIContingency(null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.FUNDING_SELECTION, 1, null);
        }
        if (contingencyDTO instanceof com.paypal.oslo.feature.inappcheckout.data.dto.UpdateCardContingencyDTO) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.UpdateCardContingency(null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.FUNDING_SELECTION, 1, null);
        }
        if (contingencyDTO instanceof com.paypal.oslo.feature.inappcheckout.data.dto.EConsentContingencyDTO) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentContingency(null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.BUYER_INFO, 1, null);
        }
        if (!(contingencyDTO instanceof com.paypal.oslo.feature.inappcheckout.data.dto.UnknownContingencyDTO) && !(contingencyDTO instanceof com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelUnknownContingencyDTO)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentLevelUnknownContingency(null, null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.FUNDING_SELECTION, 3, null);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Contingency contingency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingency, "");
        if (contingency.getOnExternalAddCardContingency() != null) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.AddCardContingency(null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.AUTHORIZE_BILLING_AGREEMENT_CREATION, 1, null);
        }
        if (contingency.getOnExternalAuthChallengeContingency() != null) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthChallengeContingency(null, contingency.getOnExternalAuthChallengeContingency().getStepUpAuthID(), com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.AUTHORIZE_BILLING_AGREEMENT_CREATION, 1, null);
        }
        if (contingency.getOnExternalThreeDsContingency() != null) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.ThreeDsContingency(null, null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.AUTHORIZE_BILLING_AGREEMENT_CREATION, 3, null);
        }
        if (contingency.getOnExternalUserConsentForBankAccountInfoContingency() != null) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.UserConsentForBankAccountInfoContingency(null, null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.AUTHORIZE_BILLING_AGREEMENT_CREATION, 3, null);
        }
        if (contingency.getOnExternalBankAccountBalanceRequiredContingency() != null) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.BankAccountBalanceRequiredContingency(null, null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.AUTHORIZE_BILLING_AGREEMENT_CREATION, 3, null);
        }
        if (contingency.getOnExternalCitAuthContingency() != null) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.CitAuthContingency(null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.AUTHORIZE_BILLING_AGREEMENT_CREATION, 1, null);
        }
        if (contingency.getOnExternalReselectFundingInstrumentContingency() != null) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.ReselectFIContingency(null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.AUTHORIZE_BILLING_AGREEMENT_CREATION, 1, null);
        }
        if (contingency.getOnExternalUpdateCardContingency() != null) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.UpdateCardContingency(null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.AUTHORIZE_BILLING_AGREEMENT_CREATION, 1, null);
        }
        if (contingency.getOnExternalEConsentContingency() != null) {
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentContingency(null, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.AUTHORIZE_BILLING_AGREEMENT_CREATION, 1, null);
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.UnknownContingency(null, null, 1, null);
    }
}
