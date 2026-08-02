package com.paypal.oslo.feature.wallet.cards.domain.add.validation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationDateRule;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardFieldRule;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "expiryMonthMetadata", "expiryYearMetadata", "metadata", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;)V", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;", "card", "", "field", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;)Ljava/lang/String;", "input", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "validate", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "component3", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "copy", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationDateRule;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CreditCardExpirationDateRule implements com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadata;

    public CreditCardExpirationDateRule(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute2, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardMetadataAttribute, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardMetadataAttribute2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardMetadataAttribute3, "");
        this.getHighSpeedVideoFpsRanges = cardMetadataAttribute;
        this.getHighSpeedVideoSizes = cardMetadataAttribute2;
        this.metadata = cardMetadataAttribute3;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute getMetadata() {
        return this.metadata;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CreditCardExpirationDateRule(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute2, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardMetadataAttribute, cardMetadataAttribute2, cardMetadataAttribute3);
        if ((i & 4) != 0) {
            cardMetadataAttribute3 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute(cardMetadataAttribute.getMinimumLength() + cardMetadataAttribute2.getMinimumLength(), cardMetadataAttribute.getMaximumLength() + cardMetadataAttribute2.getMaximumLength(), cardMetadataAttribute.isRequired() || cardMetadataAttribute2.isRequired(), cardMetadataAttribute.isEditable() || cardMetadataAttribute2.isEditable(), "");
        }
    }

    @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule
    public final java.lang.String field(com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard card) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        java.lang.String expiryMonth = card.getExpiryMonth();
        java.lang.String expiryYear = card.getExpiryYear();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(expiryMonth);
        sb.append(expiryYear);
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule
    public final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult validate(com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (!getMetadata().isRequired()) {
            return com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Success.INSTANCE;
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult validate = super.validate(input);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(validate, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Success.INSTANCE)) {
            return validate;
        }
        java.time.YearMonth expiryDate = input.expiryDate();
        if (expiryDate == null) {
            return new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error(com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type.FIELD_EMPTY);
        }
        return new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.YearMonthInThePastRule(null, 1, null).validate(expiryDate);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute2 = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute3 = this.metadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditCardExpirationDateRule(getHighSpeedVideoFpsRanges=");
        sb.append(cardMetadataAttribute);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(cardMetadataAttribute2);
        sb.append(", metadata=");
        sb.append(cardMetadataAttribute3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.metadata.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationDateRule)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationDateRule creditCardExpirationDateRule = (com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationDateRule) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, creditCardExpirationDateRule.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, creditCardExpirationDateRule.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, creditCardExpirationDateRule.metadata);
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationDateRule copy(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute expiryMonthMetadata, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute expiryYearMetadata, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiryMonthMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiryYearMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationDateRule(expiryMonthMetadata, expiryYearMetadata, metadata);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute getMetadata() {
        return this.metadata;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationDateRule copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationDateRule creditCardExpirationDateRule, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute2, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cardMetadataAttribute = creditCardExpirationDateRule.getHighSpeedVideoFpsRanges;
        }
        if ((i & 2) != 0) {
            cardMetadataAttribute2 = creditCardExpirationDateRule.getHighSpeedVideoSizes;
        }
        if ((i & 4) != 0) {
            cardMetadataAttribute3 = creditCardExpirationDateRule.metadata;
        }
        return creditCardExpirationDateRule.copy(cardMetadataAttribute, cardMetadataAttribute2, cardMetadataAttribute3);
    }
}
