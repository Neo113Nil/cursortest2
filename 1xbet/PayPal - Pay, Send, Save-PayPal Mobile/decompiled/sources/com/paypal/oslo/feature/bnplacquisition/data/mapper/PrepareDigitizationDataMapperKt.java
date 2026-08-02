package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/digitilization/PrepareDigitizationData;", "toDigitizationData", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/digitilization/PrepareDigitizationData;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/PrepareDigitizationDataRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/PrepareBNPLDigitizationDataInput;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/PrepareBNPLDigitizationDataInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/PrepareDigitizationDataRequest;)Lcom/paypal/oslo/api/graphql/schema/type/PrepareBNPLDigitizationDataInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PrepareDigitizationDataMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.PrepareDigitizationData toDigitizationData(com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData prepareBnplDigitizationData;
        com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess onPrepareBNPLDigitizationDataSuccess;
        com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData issuerDigitizationData;
        java.lang.String opaquePaymentCard;
        if (data == null || (prepareBnplDigitizationData = data.getPrepareBnplDigitizationData()) == null || (onPrepareBNPLDigitizationDataSuccess = prepareBnplDigitizationData.getOnPrepareBNPLDigitizationDataSuccess()) == null || (issuerDigitizationData = onPrepareBNPLDigitizationDataSuccess.getIssuerDigitizationData()) == null || (opaquePaymentCard = issuerDigitizationData.getOpaquePaymentCard()) == null) {
            return null;
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.PrepareDigitizationData(new com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.DigitizationData(opaquePaymentCard));
    }

    public static final com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.PrepareDigitizationDataRequest prepareDigitizationDataRequest) {
        com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType creditExternalWalletType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prepareDigitizationDataRequest, "");
        java.lang.String creditAccountId = prepareDigitizationDataRequest.getCreditAccountId();
        if (kotlin.jvm.internal.Intrinsics.areEqual(prepareDigitizationDataRequest.getDeviceWallet().getType(), "GOOGLE_WALLET")) {
            creditExternalWalletType = com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType.GOOGLE_WALLET;
        } else {
            creditExternalWalletType = com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType.UNKNOWN__;
            com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "DeviceSupportedWallet type: ".concat(java.lang.String.valueOf(prepareDigitizationDataRequest.getDeviceWallet().getType())));
        }
        return new com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput(creditAccountId, new com.apollographql.apollo.api.Optional.Present(new com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput(new com.apollographql.apollo.api.Optional.Present(prepareDigitizationDataRequest.getDevice().getExternalDeviceId()), null, 2, null)), new com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceWalletInput(new com.apollographql.apollo.api.Optional.Present(prepareDigitizationDataRequest.getDeviceWallet().getWalletId()), null, new com.apollographql.apollo.api.Optional.Present(creditExternalWalletType), 2, null));
    }
}
