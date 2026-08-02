package com.paypal.oslo.feature.wallet.cards.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "toCvvMetadataForUpdate", "(Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "toExpiryMonthMetadataForUpdate", "toExpiryYearMetadataForUpdate"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardDefinitionUpdateValidationExtKt {
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute toCvvMetadataForUpdate(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition) {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadataAttribute;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinition, "");
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter findOperationParam = com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionValidationExtKt.findOperationParam(cardDefinition, com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.UPDATE, "card_verification_code");
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadata = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule(null, 1, null).getMetadata();
        return (findOperationParam == null || (metadataAttribute = com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionValidationExtKt.toMetadataAttribute(findOperationParam, metadata)) == null) ? metadata : metadataAttribute;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute toExpiryMonthMetadataForUpdate(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition) {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadataAttribute;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinition, "");
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter findOperationParam = com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionValidationExtKt.findOperationParam(cardDefinition, com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.UPDATE, "expiration_time.month");
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadata = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationMonthRule(null, 1, null).getMetadata();
        return (findOperationParam == null || (metadataAttribute = com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionValidationExtKt.toMetadataAttribute(findOperationParam, metadata)) == null) ? metadata : metadataAttribute;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute toExpiryYearMetadataForUpdate(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition) {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadataAttribute;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinition, "");
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter findOperationParam = com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionValidationExtKt.findOperationParam(cardDefinition, com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.UPDATE, "expiration_time.year");
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadata = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationYearRule(null, 1, null).getMetadata();
        return (findOperationParam == null || (metadataAttribute = com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionValidationExtKt.toMetadataAttribute(findOperationParam, metadata)) == null) ? metadata : metadataAttribute;
    }
}
