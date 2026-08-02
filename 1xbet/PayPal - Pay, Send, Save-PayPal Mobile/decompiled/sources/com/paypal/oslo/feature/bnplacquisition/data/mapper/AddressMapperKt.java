package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "toAddress", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address toAddress(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionAddressFragment, "");
        java.lang.String addressLine1 = bnplAcquisitionAddressFragment.getAddressLine1();
        java.lang.String addressLine2 = bnplAcquisitionAddressFragment.getAddressLine2();
        java.lang.String adminArea1 = bnplAcquisitionAddressFragment.getAdminArea1();
        java.lang.String adminArea2 = bnplAcquisitionAddressFragment.getAdminArea2();
        java.lang.String postalCode = bnplAcquisitionAddressFragment.getPostalCode();
        java.lang.Object countryCode = bnplAcquisitionAddressFragment.getCountryCode();
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address(addressLine1, addressLine2, adminArea2, adminArea1, postalCode, countryCode instanceof java.lang.String ? (java.lang.String) countryCode : null);
    }
}
