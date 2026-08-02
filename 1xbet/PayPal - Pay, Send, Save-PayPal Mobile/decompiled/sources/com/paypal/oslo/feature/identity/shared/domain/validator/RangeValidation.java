package com.paypal.oslo.feature.identity.shared.domain.validator;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/validator/RangeValidation;", "Lcom/paypal/oslo/feature/identity/shared/domain/validator/Validation;", "Lkotlin/ranges/IntRange;", "range", "<init>", "(Lkotlin/ranges/IntRange;)V", "", "input", "", "validate", "(Ljava/lang/String;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/ranges/IntRange;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RangeValidation implements com.paypal.oslo.feature.identity.shared.domain.validator.Validation {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.ranges.IntRange Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.shared.domain.validator.RangeValidation.Companion INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.validator.RangeValidation.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.feature.identity.shared.domain.validator.RangeValidation PASSWORD = new com.paypal.oslo.feature.identity.shared.domain.validator.RangeValidation(new kotlin.ranges.IntRange(1, 100));

    public RangeValidation(kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        this.Camera2StreamConfigurationMap = intRange;
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.validator.Validation
    public final boolean validate(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlin.ranges.IntRange intRange = this.Camera2StreamConfigurationMap;
        int first = intRange.getFirst();
        int last = intRange.getLast();
        int length = input.length();
        return first <= length && length <= last;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/validator/RangeValidation$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/shared/domain/validator/RangeValidation;", "PASSWORD", "Lcom/paypal/oslo/feature/identity/shared/domain/validator/RangeValidation;", "getPASSWORD", "()Lcom/paypal/oslo/feature/identity/shared/domain/validator/RangeValidation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.identity.shared.domain.validator.RangeValidation getPASSWORD() {
            return com.paypal.oslo.feature.identity.shared.domain.validator.RangeValidation.PASSWORD;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
