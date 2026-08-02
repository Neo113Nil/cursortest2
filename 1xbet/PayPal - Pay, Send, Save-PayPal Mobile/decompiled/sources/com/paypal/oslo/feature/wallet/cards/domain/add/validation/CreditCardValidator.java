package com.paypal.oslo.feature.wallet.cards.domain.add.validation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardValidator;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/Validator;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule;", "defaults", "<init>", "(Ljava/util/Set;)V", "card", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "validate", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;)Ljava/util/Map;", "input", "rules", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CreditCard;Ljava/util/Set;)Ljava/util/Map;", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CreditCardValidator implements com.paypal.oslo.feature.wallet.cards.domain.add.validation.Validator<com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard>> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public CreditCardValidator(java.util.Set<? extends com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard>> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoFpsRangesFor = set;
    }

    public /* synthetic */ CreditCardValidator(java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule[]{new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardNumberRule(null, 1, null), new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationMonthRule(null, 1, null), new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationYearRule(null, 1, null), new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule(null, 1, null)}) : set);
    }

    public final java.util.Map<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard>, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult> validate(com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard card) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        return super.validate((com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardValidator) card, (java.util.Set<? extends com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardValidator>>) this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.Validator
    public final java.util.Map<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard>, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult> validate(com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard input, java.util.Set<? extends com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard>> rules) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rules, "");
        return super.validate((com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardValidator) input, (java.util.Set<? extends com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardValidator>>) kotlin.collections.SetsKt.plus((java.util.Set) this.getHighSpeedVideoFpsRangesFor, (java.lang.Iterable) rules));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreditCardValidator() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
