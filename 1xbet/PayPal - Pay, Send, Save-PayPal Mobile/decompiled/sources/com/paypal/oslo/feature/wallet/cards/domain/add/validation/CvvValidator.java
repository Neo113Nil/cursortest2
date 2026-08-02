package com.paypal.oslo.feature.wallet.cards.domain.add.validation;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CvvValidator;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/Validator;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardCvvRule;", "rule", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardCvvRule;)V", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "validate", "(Ljava/lang/String;)Ljava/util/Map;", "", "isValid", "(Ljava/lang/String;)Z", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardCvvRule;", "getHighSpeedVideoFpsRanges", "", "getMaxLength", "()I", "maxLength", "CvvStringRule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CvvValidator implements com.paypal.oslo.feature.wallet.cards.domain.add.validation.Validator<java.lang.String> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule getHighSpeedVideoFpsRanges;

    public CvvValidator(com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule creditCardCvvRule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardCvvRule, "");
        this.getHighSpeedVideoFpsRanges = creditCardCvvRule;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.Validator
    public final /* bridge */ java.util.Map<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.lang.String>, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult> validate(java.lang.String str, java.util.Set<? extends com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.lang.String>> set) {
        return super.validate((com.paypal.oslo.feature.wallet.cards.domain.add.validation.CvvValidator) str, (java.util.Set<? extends com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<com.paypal.oslo.feature.wallet.cards.domain.add.validation.CvvValidator>>) set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CvvValidator(com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule creditCardCvvRule, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule(null, 1, 0 == true ? 1 : 0) : creditCardCvvRule);
    }

    public final int getMaxLength() {
        return this.getHighSpeedVideoFpsRanges.getMetadata().getMaximumLength();
    }

    public final java.util.Map<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.lang.String>, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult> validate(java.lang.String cvv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
        return validate(cvv, kotlin.collections.SetsKt.setOf(new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CvvValidator.CvvStringRule(this.getHighSpeedVideoFpsRanges)));
    }

    public final boolean isValid(java.lang.String cvv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
        java.util.Map<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.lang.String>, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult> validate = validate(cvv);
        if (validate.isEmpty()) {
            return true;
        }
        java.util.Iterator<java.util.Map.Entry<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.lang.String>, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult>> it = validate.entrySet().iterator();
        while (it.hasNext()) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(it.next().getValue(), com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Success.INSTANCE)) {
                return false;
            }
        }
        return true;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CvvValidator$CvvStringRule;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardCvvRule;", "p0", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardCvvRule;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardCvvRule;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class CvvStringRule implements com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.lang.String> {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule Camera2StreamConfigurationMap;

        public CvvStringRule(com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule creditCardCvvRule) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardCvvRule, "");
            this.Camera2StreamConfigurationMap = creditCardCvvRule;
        }

        @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule
        public final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult validate(java.lang.String str) {
            java.lang.String str2 = str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            return this.Camera2StreamConfigurationMap.validate(new com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard("", "", "", str2, (com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress) null, (java.lang.String) null, (com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand) null, (com.paypal.oslo.feature.wallet.cards.domain.add.model.CardholderName) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, 2032, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CvvValidator() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
