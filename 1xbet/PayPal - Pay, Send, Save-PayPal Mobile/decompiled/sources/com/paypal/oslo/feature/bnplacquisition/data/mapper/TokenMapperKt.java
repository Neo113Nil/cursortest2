package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/CardProvisionedInformation;", "toToken", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/CardProvisionedInformation;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TokenMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation toToken(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment bnplAcquisitionFpanTokenFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionFpanTokenFragment, "");
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken> provisionedExternalWalletTokens = bnplAcquisitionFpanTokenFragment.getProvisionedExternalWalletTokens();
        java.util.ArrayList arrayList = null;
        if (provisionedExternalWalletTokens != null) {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken> list = provisionedExternalWalletTokens;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken provisionedExternalWalletToken : list) {
                java.lang.Object referenceId = provisionedExternalWalletToken.getReferenceId();
                arrayList2.add(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken(referenceId instanceof java.lang.String ? (java.lang.String) referenceId : null, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.INSTANCE.from(provisionedExternalWalletToken.getWalletType().name()), com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.INSTANCE.from(provisionedExternalWalletToken.getDeviceType().name())));
            }
            arrayList = arrayList2;
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation(arrayList, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.INSTANCE.from(bnplAcquisitionFpanTokenFragment.getServiceProvider().name()), com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork.INSTANCE.from(bnplAcquisitionFpanTokenFragment.getCardNetwork().name()));
    }
}
