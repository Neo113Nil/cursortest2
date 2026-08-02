package com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/StringRegexRule;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule;", "", "Lkotlin/text/Regex;", "regex", "<init>", "(Lkotlin/text/Regex;)V", "input", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "validate", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "getHighSpeedVideoSizes", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StringRegexRule implements com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.lang.String> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.text.Regex getHighSpeedVideoFpsRanges;

    public StringRegexRule(kotlin.text.Regex regex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "");
        this.getHighSpeedVideoFpsRanges = regex;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule
    public final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult validate(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return !this.getHighSpeedVideoFpsRanges.matches(input) ? new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error(com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type.FIELD_INVALID_FORMAT) : com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Success.INSTANCE;
    }
}
