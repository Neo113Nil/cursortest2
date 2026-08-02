package com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/YearMonthInThePastRule;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule;", "Ljava/time/YearMonth;", "now", "<init>", "(Ljava/time/YearMonth;)V", "input", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "validate", "(Ljava/time/YearMonth;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "Camera2StreamConfigurationMap", "Ljava/time/YearMonth;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class YearMonthInThePastRule implements com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<java.time.YearMonth> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.time.YearMonth getHighSpeedVideoFpsRanges;

    public YearMonthInThePastRule(java.time.YearMonth yearMonth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonth, "");
        this.getHighSpeedVideoFpsRanges = yearMonth;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ YearMonthInThePastRule(java.time.YearMonth yearMonth, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(yearMonth);
        if ((i & 1) != 0) {
            yearMonth = java.time.YearMonth.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(yearMonth, "");
        }
    }

    @Override // com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule
    public final com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult validate(java.time.YearMonth input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return this.getHighSpeedVideoFpsRanges.isAfter(input) ? new com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error(com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Error.Type.FIELD_DATE_IN_THE_PAST) : com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult.Success.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YearMonthInThePastRule() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
