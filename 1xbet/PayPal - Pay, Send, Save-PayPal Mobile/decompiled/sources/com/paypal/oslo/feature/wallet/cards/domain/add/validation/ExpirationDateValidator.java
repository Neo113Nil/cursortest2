package com.paypal.oslo.feature.wallet.cards.domain.add.validation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/ExpirationDateValidator;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/Validator;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationMonthRule;", "monthRule", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationYearRule;", "yearRule", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationMonthRule;Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationYearRule;)V", "expirationDate", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "validate", "(Ljava/lang/String;)Ljava/util/Map;", "", "isValid", "(Ljava/lang/String;)Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationMonthRule;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationYearRule;", "getHighSpeedVideoSizes", "", "getMaxLength", "()I", "maxLength", "ExpirationDateStringRule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExpirationDateValidator implements com.paypal.oslo.feature.wallet.cards.domain.add.validation.Validator<java.lang.String> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationYearRule getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationMonthRule getHighSpeedVideoFpsRanges;

    public ExpirationDateValidator(com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationMonthRule creditCardExpirationMonthRule, com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationYearRule creditCardExpirationYearRule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardExpirationMonthRule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardExpirationYearRule, "");
        this.getHighSpeedVideoFpsRanges = creditCardExpirationMonthRule;
        this.getHighSpeedVideoSizes = creditCardExpirationYearRule;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.Validator
    public final /* bridge */ java.util.Map<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.lang.String>, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult> validate(java.lang.String str, java.util.Set<? extends com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.lang.String>> set) {
        return super.validate((com.paypal.oslo.feature.wallet.cards.domain.add.validation.ExpirationDateValidator) str, (java.util.Set<? extends com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<com.paypal.oslo.feature.wallet.cards.domain.add.validation.ExpirationDateValidator>>) set);
    }

    public /* synthetic */ ExpirationDateValidator(com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationMonthRule creditCardExpirationMonthRule, com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationYearRule creditCardExpirationYearRule, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationMonthRule(null, 1, null) : creditCardExpirationMonthRule, (i & 2) != 0 ? new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationYearRule(null, 1, null) : creditCardExpirationYearRule);
    }

    public final int getMaxLength() {
        return this.getHighSpeedVideoSizes.getMetadata().getMaximumLength();
    }

    public final java.util.Map<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.lang.String>, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult> validate(java.lang.String expirationDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationDate, "");
        return validate(expirationDate, kotlin.collections.SetsKt.setOf(new com.paypal.oslo.feature.wallet.cards.domain.add.validation.ExpirationDateValidator.ExpirationDateStringRule(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes)));
    }

    public final boolean isValid(java.lang.String expirationDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationDate, "");
        java.util.Map<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.lang.String>, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult> validate = validate(expirationDate);
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

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/ExpirationDateValidator$ExpirationDateStringRule;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationMonthRule;", "p0", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationYearRule;", "p1", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationMonthRule;Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationYearRule;)V", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationMonthRule;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardExpirationYearRule;", "getHighSpeedVideoSizes", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CreditCardFieldRule;", "Ljava/util/List;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class ExpirationDateStringRule implements com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.lang.String> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationMonthRule getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationYearRule getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule> getHighResolutionOutputSizeshNQ4ISI;

        public ExpirationDateStringRule(com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationMonthRule creditCardExpirationMonthRule, com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationYearRule creditCardExpirationYearRule) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardExpirationMonthRule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardExpirationYearRule, "");
            this.getHighSpeedVideoFpsRanges = creditCardExpirationMonthRule;
            this.getHighSpeedVideoSizes = creditCardExpirationYearRule;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule[]{creditCardExpirationMonthRule, creditCardExpirationYearRule, new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationDateRule(creditCardExpirationMonthRule.getMetadata(), creditCardExpirationYearRule.getMetadata(), null, 4, null)});
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult validate(java.lang.String p0) {
            java.lang.Object m23436constructorimpl;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error error = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error(com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type.FIELD_INVALID_FORMAT);
            java.lang.Object obj = null;
            java.lang.String str = p0.length() == 4 ? p0 : null;
            if (str != null) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.paypal.oslo.feature.wallet.cards.domain.add.validation.ExpirationDateValidator.ExpirationDateStringRule expirationDateStringRule = this;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.String.valueOf(java.time.YearMonth.parse(str, java.time.format.DateTimeFormatter.ofPattern("MMyy")).getYear()));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                    m23436constructorimpl = null;
                }
                java.lang.String str2 = (java.lang.String) m23436constructorimpl;
                if (str2 != null) {
                    com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard("", kotlin.text.StringsKt.take(p0, 2), str2, "", (com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress) null, (java.lang.String) null, (com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand) null, (com.paypal.oslo.feature.wallet.cards.domain.add.model.CardholderName) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, 2032, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule> list = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardFieldRule) it.next()).validate(creditCard));
                    }
                    java.util.Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it2.next();
                        if (!kotlin.jvm.internal.Intrinsics.areEqual((com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult) next, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Success.INSTANCE)) {
                            obj = next;
                            break;
                        }
                    }
                    com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult validationResult = (com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult) obj;
                    return validationResult == null ? com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Success.INSTANCE : validationResult;
                }
            }
            return error;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpirationDateValidator() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
