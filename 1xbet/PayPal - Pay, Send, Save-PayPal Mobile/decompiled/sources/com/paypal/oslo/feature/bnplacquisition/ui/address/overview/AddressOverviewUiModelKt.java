package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/Address;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "toDomainAddress", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressOverviewUiModelKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address toDomainAddress(com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        java.lang.String m11248getAddressLine1rVKqk9c = address.m11248getAddressLine1rVKqk9c();
        java.lang.String str = m11248getAddressLine1rVKqk9c == null ? null : m11248getAddressLine1rVKqk9c;
        java.lang.String m11249getAddressLine2c7KZG_s = address.m11249getAddressLine2c7KZG_s();
        java.lang.String str2 = m11249getAddressLine2c7KZG_s == null ? null : m11249getAddressLine2c7KZG_s;
        java.lang.String m11251getAdminArea1bsDj6rY = address.m11251getAdminArea1bsDj6rY();
        java.lang.String str3 = m11251getAdminArea1bsDj6rY == null ? null : m11251getAdminArea1bsDj6rY;
        java.lang.String m11252getAdminArea2DR8a_90 = address.m11252getAdminArea2DR8a_90();
        java.lang.String str4 = m11252getAdminArea2DR8a_90 == null ? null : m11252getAdminArea2DR8a_90;
        java.lang.String m11256getPostalCodeyjZ2Xzc = address.m11256getPostalCodeyjZ2Xzc();
        java.lang.String str5 = m11256getPostalCodeyjZ2Xzc == null ? null : m11256getPostalCodeyjZ2Xzc;
        java.lang.String m11255getCountryCodeiSWX8ZM = address.m11255getCountryCodeiSWX8ZM();
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address(str, str2, str4, str3, str5, m11255getCountryCodeiSWX8ZM == null ? null : m11255getCountryCodeiSWX8ZM);
    }
}
