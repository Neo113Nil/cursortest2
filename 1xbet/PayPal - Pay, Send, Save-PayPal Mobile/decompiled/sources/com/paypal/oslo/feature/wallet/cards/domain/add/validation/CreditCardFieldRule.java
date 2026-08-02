package com.paypal.oslo.feature.wallet.cards.domain.add.validation;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardFieldRule;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;", "card", "", "field", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;)Ljava/lang/String;", "input", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "validate", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "getMetadata", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "metadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CreditCardFieldRule extends com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard> {
    java.lang.String field(com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard card);

    com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute getMetadata();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult validate(com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule creditCardFieldRule, com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
            return com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule.super.validate(creditCard);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule
    default com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult validate(com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        boolean isRequired = getMetadata().isRequired();
        if (!isRequired) {
            return com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Success.INSTANCE;
        }
        if (!isRequired) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String digits = com.paypal.oslo.feature.wallet.cards.domain.add.StringKtKt.digits(field(input));
        com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule[] ruleArr = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule[3];
        ruleArr[0] = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.StringMinimumLengthRule(getMetadata().getMinimumLength());
        ruleArr[1] = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.StringMaximumLengthRule(getMetadata().getMaximumLength());
        ruleArr[2] = getMetadata().getRegex().length() > 0 ? new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.StringRegexRule(new kotlin.text.Regex(getMetadata().getRegex())) : null;
        java.util.Iterator it = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) ruleArr).iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult validate = ((com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule) it.next()).validate(digits);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(validate, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Success.INSTANCE)) {
                return validate;
            }
        }
        return com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Success.INSTANCE;
    }
}
