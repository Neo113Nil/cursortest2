package com.paypal.oslo.feature.oneonboarding.inventory.views.address.data;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/Address;", "Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/type/AddressInput;", "toAddressInput", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/api/graphql/schema/type/AddressInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressSubmissionMapperExtensionsKt {
    public static final com.paypal.oslo.api.graphql.schema.type.AddressInput toAddressInput(com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String m11248getAddressLine1rVKqk9c = address.m11248getAddressLine1rVKqk9c();
        if (m11248getAddressLine1rVKqk9c == null) {
            m11248getAddressLine1rVKqk9c = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(m11248getAddressLine1rVKqk9c);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String m11249getAddressLine2c7KZG_s = address.m11249getAddressLine2c7KZG_s();
        if (m11249getAddressLine2c7KZG_s == null) {
            m11249getAddressLine2c7KZG_s = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull2 = companion2.presentIfNotNull(m11249getAddressLine2c7KZG_s);
        com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String m11250getAddressLine3z9ldjEo = address.m11250getAddressLine3z9ldjEo();
        if (m11250getAddressLine3z9ldjEo == null) {
            m11250getAddressLine3z9ldjEo = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull3 = companion3.presentIfNotNull(m11250getAddressLine3z9ldjEo);
        com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String m11251getAdminArea1bsDj6rY = address.m11251getAdminArea1bsDj6rY();
        if (m11251getAdminArea1bsDj6rY == null) {
            m11251getAdminArea1bsDj6rY = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull4 = companion4.presentIfNotNull(m11251getAdminArea1bsDj6rY);
        com.apollographql.apollo.api.Optional.Companion companion5 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String m11252getAdminArea2DR8a_90 = address.m11252getAdminArea2DR8a_90();
        if (m11252getAdminArea2DR8a_90 == null) {
            m11252getAdminArea2DR8a_90 = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull5 = companion5.presentIfNotNull(m11252getAdminArea2DR8a_90);
        com.apollographql.apollo.api.Optional.Companion companion6 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String m11253getAdminArea3W_yfEd8 = address.m11253getAdminArea3W_yfEd8();
        if (m11253getAdminArea3W_yfEd8 == null) {
            m11253getAdminArea3W_yfEd8 = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull6 = companion6.presentIfNotNull(m11253getAdminArea3W_yfEd8);
        com.apollographql.apollo.api.Optional.Companion companion7 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String m11254getAdminArea4GnJiKOo = address.m11254getAdminArea4GnJiKOo();
        if (m11254getAdminArea4GnJiKOo == null) {
            m11254getAdminArea4GnJiKOo = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull7 = companion7.presentIfNotNull(m11254getAdminArea4GnJiKOo);
        com.apollographql.apollo.api.Optional.Companion companion8 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String m11256getPostalCodeyjZ2Xzc = address.m11256getPostalCodeyjZ2Xzc();
        if (m11256getPostalCodeyjZ2Xzc == null) {
            m11256getPostalCodeyjZ2Xzc = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull8 = companion8.presentIfNotNull(m11256getPostalCodeyjZ2Xzc);
        java.lang.String m11255getCountryCodeiSWX8ZM = address.m11255getCountryCodeiSWX8ZM();
        java.lang.String str = m11255getCountryCodeiSWX8ZM != null ? m11255getCountryCodeiSWX8ZM : null;
        return new com.paypal.oslo.api.graphql.schema.type.AddressInput(presentIfNotNull, presentIfNotNull2, presentIfNotNull3, presentIfNotNull4, presentIfNotNull5, presentIfNotNull6, presentIfNotNull7, presentIfNotNull8, str == null ? "" : str);
    }
}
