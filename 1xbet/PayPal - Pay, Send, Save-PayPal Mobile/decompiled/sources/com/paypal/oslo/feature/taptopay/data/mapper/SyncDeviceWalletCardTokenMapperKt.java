package com.paypal.oslo.feature.taptopay.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardMetadata;", "", "deviceWalletServiceCardId", "walletEnrollmentId", "Lcom/paypal/oslo/api/graphql/schema/type/SyncDeviceWalletCardTokenInput;", "toSyncInput", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardMetadata;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/SyncDeviceWalletCardTokenInput;", "Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;", "toTokenServiceProviderType", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SyncDeviceWalletCardTokenMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider toTokenServiceProviderType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "MDES")) {
            return com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider.MDES;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "VTS")) {
            return com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider.VTS;
        }
        return null;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.SyncDeviceWalletCardTokenInput toSyncInput(com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata cardMetadata, java.lang.String str, java.lang.String str2) {
        com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider tokenServiceProviderType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String tokenExpiryDate = cardMetadata.getTokenExpiryDate();
        if (kotlin.text.StringsKt.isBlank(tokenExpiryDate)) {
            tokenExpiryDate = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(tokenExpiryDate);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String tokenLastDigits = cardMetadata.getTokenLastDigits();
        if (kotlin.text.StringsKt.isBlank(tokenLastDigits)) {
            tokenLastDigits = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull2 = companion2.presentIfNotNull(tokenLastDigits);
        com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String panExpiryDate = cardMetadata.getPanExpiryDate();
        if (panExpiryDate == null || kotlin.text.StringsKt.isBlank(panExpiryDate)) {
            panExpiryDate = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull3 = companion3.presentIfNotNull(panExpiryDate);
        com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
        com.apollographql.apollo.api.Optional presentIfNotNull4 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.api.graphql.schema.type.DeviceWalletTokenizationPartner.PAYPAL);
        com.apollographql.apollo.api.Optional.Companion companion5 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String productId = cardMetadata.getProductId();
        if (productId == null || kotlin.text.StringsKt.isBlank(productId)) {
            productId = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull5 = companion5.presentIfNotNull(productId);
        com.apollographql.apollo.api.Optional.Companion companion6 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String productName = cardMetadata.getProductName();
        if (productName == null || kotlin.text.StringsKt.isBlank(productName)) {
            productName = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull6 = companion4.presentIfNotNull(new com.paypal.oslo.api.graphql.schema.type.DeviceWalletProviderInfoInput(presentIfNotNull4, str2, presentIfNotNull5, companion6.presentIfNotNull(productName)));
        com.apollographql.apollo.api.Optional.Companion companion7 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String tokenTspId = cardMetadata.getTokenTspId();
        com.paypal.oslo.api.graphql.schema.type.DeviceWalletTokenInfoInput deviceWalletTokenInfoInput = new com.paypal.oslo.api.graphql.schema.type.DeviceWalletTokenInfoInput(presentIfNotNull, presentIfNotNull2, presentIfNotNull3, presentIfNotNull6, companion7.presentIfNotNull((tokenTspId == null || (tokenServiceProviderType = toTokenServiceProviderType(tokenTspId)) == null) ? null : new com.paypal.oslo.api.graphql.schema.type.TokenServiceProviderInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(tokenServiceProviderType), cardMetadata.getTokenId())));
        com.apollographql.apollo.api.Optional.Companion companion8 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String shortDescription = cardMetadata.getShortDescription();
        if (shortDescription == null || kotlin.text.StringsKt.isBlank(shortDescription)) {
            shortDescription = null;
        }
        java.lang.String longDescription = cardMetadata.getLongDescription();
        if (longDescription == null || kotlin.text.StringsKt.isBlank(longDescription)) {
            longDescription = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull7 = companion8.presentIfNotNull((shortDescription == null && longDescription == null) ? null : new com.paypal.oslo.api.graphql.schema.type.DeviceWalletCardMetadataInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(shortDescription), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(longDescription)));
        com.apollographql.apollo.api.Optional.Companion companion9 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String issuerName = cardMetadata.getIssuerName();
        if (issuerName == null || kotlin.text.StringsKt.isBlank(issuerName)) {
            issuerName = null;
        }
        java.lang.String issuerWebSite = cardMetadata.getIssuerWebSite();
        if (issuerWebSite == null || kotlin.text.StringsKt.isBlank(issuerWebSite)) {
            issuerWebSite = null;
        }
        return new com.paypal.oslo.api.graphql.schema.type.SyncDeviceWalletCardTokenInput(str, deviceWalletTokenInfoInput, presentIfNotNull7, companion9.presentIfNotNull((issuerName == null && issuerWebSite == null) ? null : new com.paypal.oslo.api.graphql.schema.type.DeviceWalletIssuerDataInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(issuerName), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(issuerWebSite))));
    }
}
