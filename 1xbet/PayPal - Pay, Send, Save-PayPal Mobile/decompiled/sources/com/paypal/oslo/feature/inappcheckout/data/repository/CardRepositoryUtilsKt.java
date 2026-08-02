package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardAddressInputEntity;", "addressInput", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;", "buildAddressInput", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardAddressInputEntity;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardRepositoryUtilsKt {
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput buildAddressInput(com.paypal.oslo.feature.inappcheckout.domain.entity.CardAddressInputEntity cardAddressInputEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardAddressInputEntity, "");
        if (cardAddressInputEntity.getAddressId() != null) {
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput(com.apollographql.apollo.api.Optional.INSTANCE.present(cardAddressInputEntity.getAddressId()), com.apollographql.apollo.api.Optional.Absent.INSTANCE);
        }
        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardAddressInputEntity.getAddressLine1());
        com.apollographql.apollo.api.Optional presentIfNotNull2 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardAddressInputEntity.getAddressLine2());
        com.apollographql.apollo.api.Optional presentIfNotNull3 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardAddressInputEntity.getAdminArea2());
        com.apollographql.apollo.api.Optional presentIfNotNull4 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardAddressInputEntity.getAdminArea1());
        com.apollographql.apollo.api.Optional presentIfNotNull5 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardAddressInputEntity.getPostalCode());
        java.lang.String countryCode = cardAddressInputEntity.getCountryCode();
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput(com.apollographql.apollo.api.Optional.Absent.INSTANCE, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddressInput(presentIfNotNull, presentIfNotNull2, null, null, null, presentIfNotNull3, presentIfNotNull4, presentIfNotNull5, countryCode == null ? "" : countryCode, 28, null)));
    }
}
