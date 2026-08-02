package com.paypal.oslo.feature.userprofile.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/fragment/BillingAddressFields;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "toProfileAddress", "(Lcom/paypal/oslo/feature/userprofile/graphql/fragment/BillingAddressFields;)Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "", "p0", "Lcom/paypal/oslo/core/userstore/model/AddressConfirmationAuthority;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Object;)Lcom/paypal/oslo/core/userstore/model/AddressConfirmationAuthority;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddressResponseMapperKt {
    public static final com.paypal.oslo.core.userstore.model.ProfileAddress toProfileAddress(com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields billingAddressFields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddressFields, "");
        com.paypal.oslo.feature.userprofile.graphql.fragment.AddressFields addressFields = billingAddressFields.getAddress().getAddressFields();
        return new com.paypal.oslo.core.userstore.model.ProfileAddress(billingAddressFields.getId(), billingAddressFields.getPrimary(), billingAddressFields.getConfirmed(), billingAddressFields.getAddresseeName(), billingAddressFields.getDefaultBilling(), getHighSpeedVideoFpsRangesFor(billingAddressFields.getConfirmationAuthority()), new com.paypal.oslo.core.userstore.model.ProfileAddress.Address(addressFields.getAddressLine1(), addressFields.getAddressLine2(), addressFields.getAddressLine3(), addressFields.getAdminArea1(), addressFields.getAdminArea2(), addressFields.getAdminArea3(), addressFields.getAdminArea4(), addressFields.getCountryCode().toString(), addressFields.getPostalCode()));
    }

    private static final com.paypal.oslo.core.userstore.model.AddressConfirmationAuthority getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        try {
            return com.paypal.oslo.core.userstore.model.AddressConfirmationAuthority.valueOf(obj.toString());
        } catch (java.lang.IllegalArgumentException unused) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Unrecognized AddressConfirmationAuthority value from GraphQL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("authority", obj.toString())), null, 4, null);
            return com.paypal.oslo.core.userstore.model.AddressConfirmationAuthority.NONE;
        }
    }
}
