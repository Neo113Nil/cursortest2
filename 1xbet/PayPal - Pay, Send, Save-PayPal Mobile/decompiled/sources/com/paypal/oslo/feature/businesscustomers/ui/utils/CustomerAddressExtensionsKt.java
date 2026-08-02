package com.paypal.oslo.feature.businesscustomers.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "", "isEmpty", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;)Z", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressInputState;", "toInputState", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;)Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressInputState;", "addressInputState", "applyFormData", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressInputState;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "toI18NAddress", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;)Lcom/paypal/oslo/core/i18n/domain/model/Address;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerAddressExtensionsKt {
    public static final boolean isEmpty(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress customerAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerAddress, "");
        java.lang.String addressLine1 = customerAddress.getAddressLine1();
        if (addressLine1 != null && addressLine1.length() != 0) {
            return false;
        }
        java.lang.String addressLine2 = customerAddress.getAddressLine2();
        if (addressLine2 != null && addressLine2.length() != 0) {
            return false;
        }
        java.lang.String adminArea1 = customerAddress.getAdminArea1();
        if (adminArea1 != null && adminArea1.length() != 0) {
            return false;
        }
        java.lang.String adminArea2 = customerAddress.getAdminArea2();
        if (adminArea2 != null && adminArea2.length() != 0) {
            return false;
        }
        java.lang.String postalCode = customerAddress.getPostalCode();
        return postalCode == null || postalCode.length() == 0;
    }

    public static final com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState toInputState(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress customerAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerAddress, "");
        return new com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState(new com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields(customerAddress.getCountryCode(), customerAddress.getAddressLine1(), customerAddress.getAddressLine2(), customerAddress.getAdminArea1(), customerAddress.getAdminArea2(), customerAddress.getPostalCode()));
    }

    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress applyFormData(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress customerAddress, com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState addressInputState) {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressInputState, "");
        if (com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerFormStateExtensionsKt.isEmpty(addressInputState)) {
            return null;
        }
        java.lang.String countryCode = addressInputState.getAddress().getCountryCode();
        if (countryCode == null) {
            countryCode = customerAddress.getCountryCode();
        }
        java.lang.String str = countryCode;
        java.lang.String line1 = addressInputState.getAddress().getLine1();
        java.lang.String str2 = (line1 == null || line1.length() == 0) ? null : line1;
        java.lang.String line2 = addressInputState.getAddress().getLine2();
        java.lang.String str3 = (line2 == null || line2.length() == 0) ? null : line2;
        java.lang.String state = addressInputState.getAddress().getState();
        java.lang.String str4 = (state == null || state.length() == 0) ? null : state;
        java.lang.String city = addressInputState.getAddress().getCity();
        java.lang.String str5 = (city == null || city.length() == 0) ? null : city;
        java.lang.String zipCode = addressInputState.getAddress().getZipCode();
        copy = customerAddress.copy((r18 & 1) != 0 ? customerAddress.addressLine1 : str2, (r18 & 2) != 0 ? customerAddress.addressLine2 : str3, (r18 & 4) != 0 ? customerAddress.adminArea1 : str4, (r18 & 8) != 0 ? customerAddress.adminArea2 : str5, (r18 & 16) != 0 ? customerAddress.postalCode : (zipCode == null || zipCode.length() == 0) ? null : zipCode, (r18 & 32) != 0 ? customerAddress.countryCode : str, (r18 & 64) != 0 ? customerAddress.addressType : null, (r18 & 128) != 0 ? customerAddress.recipientName : null);
        return copy;
    }

    public static final com.paypal.oslo.core.i18n.domain.model.Address toI18NAddress(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress customerAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerAddress, "");
        java.lang.String addressLine1 = customerAddress.getAddressLine1();
        java.lang.String m11273constructorimpl = addressLine1 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(addressLine1) : null;
        java.lang.String addressLine2 = customerAddress.getAddressLine2();
        java.lang.String m11282constructorimpl = addressLine2 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(addressLine2) : null;
        java.lang.String adminArea1 = customerAddress.getAdminArea1();
        java.lang.String m11300constructorimpl = adminArea1 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(adminArea1) : null;
        java.lang.String adminArea2 = customerAddress.getAdminArea2();
        java.lang.String m11309constructorimpl = adminArea2 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(adminArea2) : null;
        java.lang.String postalCode = customerAddress.getPostalCode();
        return new com.paypal.oslo.core.i18n.domain.model.Address(m11273constructorimpl, m11282constructorimpl, null, null, null, m11309constructorimpl, m11300constructorimpl, postalCode != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(postalCode) : null, com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(customerAddress.getCountryCode()), null, 540, null);
    }
}
