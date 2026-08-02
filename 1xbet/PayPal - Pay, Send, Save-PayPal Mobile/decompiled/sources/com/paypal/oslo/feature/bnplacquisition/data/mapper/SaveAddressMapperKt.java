package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchAddressesMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/saveaddress/SaveAddress;", "toSaveAddress", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchAddressesMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/saveaddress/SaveAddress;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/SaveAddressRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/UpdateBNPLApplicationInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/SaveAddressRequest;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SaveAddressMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress toSaveAddress(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchAddressesMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchAddressesMutation.UpdateBnplApplication updateBnplApplication;
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccess saveAddressSuccess;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason;
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchAddressesMutation.Application application;
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchAddressesMutation.UserProfile userProfile;
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline = null;
        if (data == null || (updateBnplApplication = data.getUpdateBnplApplication()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchAddressesMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = updateBnplApplication.getOnUpdateBNPLApplicationSuccess();
        if (onUpdateBNPLApplicationSuccess == null || (application = onUpdateBNPLApplicationSuccess.getApplication()) == null || (userProfile = application.getUserProfile()) == null) {
            saveAddressSuccess = null;
        } else {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchAddressesMutation.Address> addresses = userProfile.getAddresses();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(addresses, 10));
            java.util.Iterator<T> it = addresses.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment2 = ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchAddressesMutation.Address) it.next()).getBnplAcquisitionAddressFragment();
                java.lang.String addressLine1 = bnplAcquisitionAddressFragment2.getAddressLine1();
                java.lang.String addressLine2 = bnplAcquisitionAddressFragment2.getAddressLine2();
                java.lang.String adminArea1 = bnplAcquisitionAddressFragment2.getAdminArea1();
                java.lang.String adminArea2 = bnplAcquisitionAddressFragment2.getAdminArea2();
                java.lang.String postalCode = bnplAcquisitionAddressFragment2.getPostalCode();
                java.lang.Object countryCode = bnplAcquisitionAddressFragment2.getCountryCode();
                arrayList.add(new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address(addressLine1, addressLine2, adminArea2, adminArea1, postalCode, countryCode instanceof java.lang.String ? (java.lang.String) countryCode : null));
            }
            java.util.ArrayList arrayList2 = arrayList;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchAddressesMutation.BillingAddress billingAddress = userProfile.getBillingAddress();
            if (billingAddress == null || (bnplAcquisitionAddressFragment = billingAddress.getBnplAcquisitionAddressFragment()) == null) {
                address = null;
            } else {
                java.lang.String addressLine12 = bnplAcquisitionAddressFragment.getAddressLine1();
                java.lang.String addressLine22 = bnplAcquisitionAddressFragment.getAddressLine2();
                java.lang.String adminArea12 = bnplAcquisitionAddressFragment.getAdminArea1();
                java.lang.String adminArea22 = bnplAcquisitionAddressFragment.getAdminArea2();
                java.lang.String postalCode2 = bnplAcquisitionAddressFragment.getPostalCode();
                java.lang.Object countryCode2 = bnplAcquisitionAddressFragment.getCountryCode();
                address = new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address(addressLine12, addressLine22, adminArea22, adminArea12, postalCode2, countryCode2 instanceof java.lang.String ? (java.lang.String) countryCode2 : null);
            }
            saveAddressSuccess = new com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccessCreditApplication(arrayList2, address));
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchAddressesMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = updateBnplApplication.getOnUpdateBNPLApplicationDecline();
        if (onUpdateBNPLApplicationDecline != null && (reason = onUpdateBNPLApplicationDecline.getReason()) != null) {
            applicationDecline = com.paypal.oslo.feature.bnplacquisition.data.mapper.ApplicationDeclineMapperKt.toApplicationDecline(reason);
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress(saveAddressSuccess, applicationDecline);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SaveAddressRequest saveAddressRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveAddressRequest, "");
        java.lang.String experienceSessionId = saveAddressRequest.getExperienceSessionId();
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address = saveAddressRequest.getAddress();
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getAddressLine1());
        com.apollographql.apollo.api.Optional presentIfNotNull2 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getAddressLine2());
        com.apollographql.apollo.api.Optional presentIfNotNull3 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getState());
        com.apollographql.apollo.api.Optional presentIfNotNull4 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getCity());
        com.apollographql.apollo.api.Optional presentIfNotNull5 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(address.getPostalCode());
        java.lang.String countryCode = address.getCountryCode();
        return new com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput(companion.presentIfNotNull(new com.paypal.oslo.api.graphql.schema.type.AddressInput(presentIfNotNull, presentIfNotNull2, null, presentIfNotNull3, presentIfNotNull4, null, null, presentIfNotNull5, countryCode == null ? "" : countryCode, 100, null)), null, null, null, null, null, null, null, null, experienceSessionId, null, null, null, null, null, null, null, null, null, null, 1048062, null);
    }
}
