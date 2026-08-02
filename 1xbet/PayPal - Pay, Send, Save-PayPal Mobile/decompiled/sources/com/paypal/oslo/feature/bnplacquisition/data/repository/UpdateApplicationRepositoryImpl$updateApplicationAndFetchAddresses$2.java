package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class UpdateApplicationRepositoryImpl$updateApplicationAndFetchAddresses$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchAddressesMutation.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl$updateApplicationAndFetchAddresses$2 getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl$updateApplicationAndFetchAddresses$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress invoke(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchAddressesMutation.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.SaveAddressMapperKt.toSaveAddress(data);
    }

    UpdateApplicationRepositoryImpl$updateApplicationAndFetchAddresses$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.SaveAddressMapperKt.class, "toSaveAddress", "toSaveAddress(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchAddressesMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/saveaddress/SaveAddress;", 1);
    }
}
