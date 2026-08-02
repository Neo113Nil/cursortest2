package com.paypal.oslo.feature.contacts.ui.contacts.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;", "toCountryUi", "(Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;)Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CountryUiKt {
    public static final com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi toCountryUi(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryPhoneDetail, "");
        return new com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi(countryPhoneDetail.getCountryCode(), countryPhoneDetail.getCountryName(), "+".concat(java.lang.String.valueOf(countryPhoneDetail.getCountryCallingCode())), null, countryPhoneDetail.getCountryFlag(), 8, null);
    }
}
