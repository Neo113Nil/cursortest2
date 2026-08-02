package com.paypal.oslo.feature.wallet.cards.domain.add.validation;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardCvvRule;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardFieldRule;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "metadata", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;)V", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;", "card", "", "field", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;)Ljava/lang/String;", "component1", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "copy", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardCvvRule;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "getMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CreditCardCvvRule implements com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadata;

    public CreditCardCvvRule(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardMetadataAttribute, "");
        this.metadata = cardMetadataAttribute;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule
    public final /* bridge */ com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult validate(com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard) {
        return super.validate(creditCard);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute getMetadata() {
        return this.metadata;
    }

    public /* synthetic */ CreditCardCvvRule(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute(3, 4, true, true, "") : cardMetadataAttribute);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule
    public final java.lang.String field(com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard card) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        return card.getCvv();
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute = this.metadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditCardCvvRule(metadata=");
        sb.append(cardMetadataAttribute);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.metadata.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, ((com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule) other).metadata);
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule copy(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule(metadata);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute getMetadata() {
        return this.metadata;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule creditCardCvvRule, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cardMetadataAttribute = creditCardCvvRule.metadata;
        }
        return creditCardCvvRule.copy(cardMetadataAttribute);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreditCardCvvRule() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
