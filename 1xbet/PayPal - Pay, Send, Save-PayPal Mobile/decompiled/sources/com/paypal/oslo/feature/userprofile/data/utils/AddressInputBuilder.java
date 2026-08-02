package com.paypal.oslo.feature.userprofile.data.utils;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e*\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/data/utils/AddressInputBuilder;", "", "<init>", "()V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "", "userCountry", "", "setAsDefault", "Lcom/paypal/oslo/api/graphql/schema/type/AddPartyBillingAddressInput;", "buildAddressInput", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/lang/String;Z)Lcom/paypal/oslo/api/graphql/schema/type/AddPartyBillingAddressInput;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "Lcom/apollographql/apollo/api/Optional;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/i18n/domain/model/Field;)Lcom/apollographql/apollo/api/Optional;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddressInputBuilder {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.userprofile.data.utils.AddressInputBuilder INSTANCE = new com.paypal.oslo.feature.userprofile.data.utils.AddressInputBuilder();

    private AddressInputBuilder() {
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AddPartyBillingAddressInput buildAddressInput$default(com.paypal.oslo.feature.userprofile.data.utils.AddressInputBuilder addressInputBuilder, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return addressInputBuilder.buildAddressInput(address, str, z);
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddPartyBillingAddressInput buildAddressInput(com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String userCountry, boolean setAsDefault) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userCountry, "");
        java.lang.String m11248getAddressLine1rVKqk9c = address.m11248getAddressLine1rVKqk9c();
        com.apollographql.apollo.api.Optional<java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(m11248getAddressLine1rVKqk9c != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11272boximpl(m11248getAddressLine1rVKqk9c) : null);
        java.lang.String m11249getAddressLine2c7KZG_s = address.m11249getAddressLine2c7KZG_s();
        com.apollographql.apollo.api.Optional<java.lang.String> highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(m11249getAddressLine2c7KZG_s != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11281boximpl(m11249getAddressLine2c7KZG_s) : null);
        java.lang.String m11250getAddressLine3z9ldjEo = address.m11250getAddressLine3z9ldjEo();
        com.apollographql.apollo.api.Optional<java.lang.String> highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(m11250getAddressLine3z9ldjEo != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11290boximpl(m11250getAddressLine3z9ldjEo) : null);
        java.lang.String m11251getAdminArea1bsDj6rY = address.m11251getAdminArea1bsDj6rY();
        com.apollographql.apollo.api.Optional<java.lang.String> highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(m11251getAdminArea1bsDj6rY != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11299boximpl(m11251getAdminArea1bsDj6rY) : null);
        java.lang.String m11252getAdminArea2DR8a_90 = address.m11252getAdminArea2DR8a_90();
        com.apollographql.apollo.api.Optional<java.lang.String> highSpeedVideoFpsRanges5 = getHighSpeedVideoFpsRanges(m11252getAdminArea2DR8a_90 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11308boximpl(m11252getAdminArea2DR8a_90) : null);
        java.lang.String m11253getAdminArea3W_yfEd8 = address.m11253getAdminArea3W_yfEd8();
        com.apollographql.apollo.api.Optional<java.lang.String> highSpeedVideoFpsRanges6 = getHighSpeedVideoFpsRanges(m11253getAdminArea3W_yfEd8 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11317boximpl(m11253getAdminArea3W_yfEd8) : null);
        java.lang.String m11254getAdminArea4GnJiKOo = address.m11254getAdminArea4GnJiKOo();
        com.apollographql.apollo.api.Optional<java.lang.String> highSpeedVideoFpsRanges7 = getHighSpeedVideoFpsRanges(m11254getAdminArea4GnJiKOo != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea4.m11326boximpl(m11254getAdminArea4GnJiKOo) : null);
        java.lang.String m11255getCountryCodeiSWX8ZM = address.m11255getCountryCodeiSWX8ZM();
        java.lang.String str = m11255getCountryCodeiSWX8ZM != null ? m11255getCountryCodeiSWX8ZM : userCountry;
        java.lang.String m11256getPostalCodeyjZ2Xzc = address.m11256getPostalCodeyjZ2Xzc();
        return new com.paypal.oslo.api.graphql.schema.type.AddPartyBillingAddressInput(new com.paypal.oslo.api.graphql.schema.type.AddressInput(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, highSpeedVideoFpsRanges3, highSpeedVideoFpsRanges4, highSpeedVideoFpsRanges5, highSpeedVideoFpsRanges6, highSpeedVideoFpsRanges7, getHighSpeedVideoFpsRanges(m11256getPostalCodeyjZ2Xzc != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11459boximpl(m11256getPostalCodeyjZ2Xzc) : null), str), setAsDefault);
    }

    private static com.apollographql.apollo.api.Optional<java.lang.String> getHighSpeedVideoFpsRanges(com.paypal.oslo.core.i18n.domain.model.Field field) {
        if (field == null || field.getValue().length() == 0) {
            return com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        }
        return new com.apollographql.apollo.api.Optional.Present(field.getValue());
    }
}
