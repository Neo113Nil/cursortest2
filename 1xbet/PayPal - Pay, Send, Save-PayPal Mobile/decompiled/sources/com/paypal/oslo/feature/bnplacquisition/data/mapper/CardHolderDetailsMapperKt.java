package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/CardHolderDetails;", "toCardHolderDetails", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/CardHolderDetails;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CardHolderDetailsMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails toCardHolderDetails(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment bnplAcquisitionCardHolderFragment) {
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress billingAddress;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionCardHolderFragment, "");
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name name2 = bnplAcquisitionCardHolderFragment.getName();
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address = null;
        address = null;
        address = null;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName userName = name2 != null ? new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName(name2.getFullName(), null, null, 6, null) : null;
        java.lang.String phoneNumber = bnplAcquisitionCardHolderFragment.getPhoneNumber();
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress> billingAddresses = bnplAcquisitionCardHolderFragment.getBillingAddresses();
        if (billingAddresses != null && (billingAddress = (com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) billingAddresses)) != null && (bnplAcquisitionAddressFragment = billingAddress.getBnplAcquisitionAddressFragment()) != null) {
            java.lang.String addressLine1 = bnplAcquisitionAddressFragment.getAddressLine1();
            java.lang.String addressLine2 = bnplAcquisitionAddressFragment.getAddressLine2();
            java.lang.String adminArea1 = bnplAcquisitionAddressFragment.getAdminArea1();
            java.lang.String adminArea2 = bnplAcquisitionAddressFragment.getAdminArea2();
            java.lang.String postalCode = bnplAcquisitionAddressFragment.getPostalCode();
            java.lang.Object countryCode = bnplAcquisitionAddressFragment.getCountryCode();
            address = new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address(addressLine1, addressLine2, adminArea2, adminArea1, postalCode, countryCode instanceof java.lang.String ? (java.lang.String) countryCode : null);
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails(userName, address, phoneNumber);
    }
}
