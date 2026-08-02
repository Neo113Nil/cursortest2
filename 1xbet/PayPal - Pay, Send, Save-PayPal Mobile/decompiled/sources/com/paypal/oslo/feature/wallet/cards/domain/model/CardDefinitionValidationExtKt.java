package com.paypal.oslo.feature.wallet.cards.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u0013\u0010\f\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\n\u001a\u0013\u0010\r\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\n\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "", "paramName", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationParameter;", "findOperationParam", "(Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationParameter;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "toCardNumberMetadata", "(Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "toCvvMetadata", "toExpiryMonthMetadata", "toExpiryYearMetadata", "getCardNumberMask", "(Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;)Ljava/lang/String;", "defaults", "toMetadataAttribute", "(Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationParameter;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardDefinitionValidationExtKt {
    public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter findOperationParam(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition, com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName cardOperationName, java.lang.String str) {
        java.lang.Object obj;
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter> inputParameters;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardOperationName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation> operations = cardDefinition.getOperations();
        java.lang.Object obj2 = null;
        if (operations == null) {
            return null;
        }
        java.util.Iterator<T> it = operations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation) obj).getOperationName() == cardOperationName) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation cardOperation = (com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation) obj;
        if (cardOperation == null || (inputParameters = cardOperation.getInputParameters()) == null) {
            return null;
        }
        java.util.Iterator<T> it2 = inputParameters.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter) next).getName(), str)) {
                obj2 = next;
                break;
            }
        }
        return (com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter) obj2;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute toCardNumberMetadata(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition) {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadataAttribute;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinition, "");
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter findOperationParam = findOperationParam(cardDefinition, com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.ADD, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.CARD_DETAILS_CARD_NUMBER);
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadata = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardNumberRule(null, 1, null).getMetadata();
        return (findOperationParam == null || (metadataAttribute = toMetadataAttribute(findOperationParam, metadata)) == null) ? metadata : metadataAttribute;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute toCvvMetadata(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition) {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadataAttribute;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinition, "");
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter findOperationParam = findOperationParam(cardDefinition, com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.ADD, "card_verification_code");
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadata = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule(null, 1, null).getMetadata();
        return (findOperationParam == null || (metadataAttribute = toMetadataAttribute(findOperationParam, metadata)) == null) ? metadata : metadataAttribute;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute toExpiryMonthMetadata(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition) {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadataAttribute;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinition, "");
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter findOperationParam = findOperationParam(cardDefinition, com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.ADD, "expiration_time.month");
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadata = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationMonthRule(null, 1, null).getMetadata();
        return (findOperationParam == null || (metadataAttribute = toMetadataAttribute(findOperationParam, metadata)) == null) ? metadata : metadataAttribute;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute toExpiryYearMetadata(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition) {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadataAttribute;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinition, "");
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter findOperationParam = findOperationParam(cardDefinition, com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.ADD, "expiration_time.year");
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadata = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationYearRule(null, 1, null).getMetadata();
        return (findOperationParam == null || (metadataAttribute = toMetadataAttribute(findOperationParam, metadata)) == null) ? metadata : metadataAttribute;
    }

    public static final java.lang.String getCardNumberMask(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinition, "");
        java.util.List<java.lang.Integer> numberGroupingPattern = cardDefinition.getNumberGroupingPattern();
        if (numberGroupingPattern != null) {
            if (numberGroupingPattern.size() < 2) {
                numberGroupingPattern = null;
            }
            if (numberGroupingPattern != null) {
                return kotlin.collections.CollectionsKt.joinToString$default(numberGroupingPattern, " ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionValidationExtKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        java.lang.CharSequence repeat;
                        repeat = kotlin.text.StringsKt.repeat("0", ((java.lang.Integer) obj).intValue());
                        return repeat;
                    }
                }, 30, null);
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute toMetadataAttribute(com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter cardOperationParameter, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardOperationParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardMetadataAttribute, "");
        java.lang.Integer minimumLength = cardOperationParameter.getMinimumLength();
        int intValue = minimumLength != null ? minimumLength.intValue() : cardMetadataAttribute.getMinimumLength();
        java.lang.Integer maximumLength = cardOperationParameter.getMaximumLength();
        int intValue2 = maximumLength != null ? maximumLength.intValue() : cardMetadataAttribute.getMaximumLength();
        java.lang.String regex = cardOperationParameter.getRegex();
        if (regex == null) {
            regex = cardMetadataAttribute.getRegex();
        }
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute(intValue, intValue2, cardOperationParameter.getRequired(), cardMetadataAttribute.isEditable(), regex);
    }
}
