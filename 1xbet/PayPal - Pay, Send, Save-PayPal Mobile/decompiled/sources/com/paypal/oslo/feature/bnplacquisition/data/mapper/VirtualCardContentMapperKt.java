package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$ApprovedLoanAmount;", "approvedLoanAmount", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/VirtualCardContent;", "toVirtualCardContent", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$ApprovedLoanAmount;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/VirtualCardContent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VirtualCardContentMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent toVirtualCardContent(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment bnplAcquisitionVirtualCardFragment, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount approvedLoanAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionVirtualCardFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approvedLoanAmount, "");
        java.lang.Object lastNChars = bnplAcquisitionVirtualCardFragment.getLastNChars();
        java.lang.String str = lastNChars instanceof java.lang.String ? (java.lang.String) lastNChars : null;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt cardArt = bnplAcquisitionVirtualCardFragment.getCardArt();
        java.lang.Object url = cardArt != null ? cardArt.getUrl() : null;
        java.lang.String str2 = url instanceof java.lang.String ? (java.lang.String) url : null;
        java.lang.Object createTime = bnplAcquisitionVirtualCardFragment.getCreateTime();
        java.lang.String str3 = createTime instanceof java.lang.String ? (java.lang.String) createTime : null;
        java.lang.Object expirationDuration = bnplAcquisitionVirtualCardFragment.getExpirationDuration();
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent(str, str2, str3, expirationDuration instanceof java.lang.String ? (java.lang.String) expirationDuration : null, com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(approvedLoanAmount.getBnplAcquisitionMoneyFragment()));
    }
}
