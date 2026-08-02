package com.paypal.oslo.feature.bnplacquisition.domain.model.address;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "toAddressI18n", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;)Lcom/paypal/oslo/core/i18n/domain/model/Address;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressKt {
    public static final com.paypal.oslo.core.i18n.domain.model.Address toAddressI18n(com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        java.lang.String addressLine1 = address.getAddressLine1();
        java.lang.String m11273constructorimpl = addressLine1 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(addressLine1) : null;
        java.lang.String addressLine2 = address.getAddressLine2();
        java.lang.String m11282constructorimpl = addressLine2 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(addressLine2) : null;
        java.lang.String city = address.getCity();
        java.lang.String m11309constructorimpl = city != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(city) : null;
        java.lang.String state = address.getState();
        java.lang.String m11300constructorimpl = state != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(state) : null;
        java.lang.String postalCode = address.getPostalCode();
        return new com.paypal.oslo.core.i18n.domain.model.Address(m11273constructorimpl, m11282constructorimpl, null, null, null, m11309constructorimpl, m11300constructorimpl, postalCode != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(postalCode) : null, null, null, 796, null);
    }
}
