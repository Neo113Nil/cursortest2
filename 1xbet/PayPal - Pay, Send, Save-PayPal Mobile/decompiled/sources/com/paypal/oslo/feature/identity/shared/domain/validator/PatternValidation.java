package com.paypal.oslo.feature.identity.shared.domain.validator;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/validator/PatternValidation;", "Lcom/paypal/oslo/feature/identity/shared/domain/validator/Validation;", "Ljava/util/regex/Pattern;", "pattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "input", "", "validate", "(Ljava/lang/String;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/regex/Pattern;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PatternValidation implements com.paypal.oslo.feature.identity.shared.domain.validator.Validation {
    private static final com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation PASSWORD;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.regex.Pattern Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation.Companion INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation> EMAIL$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation.m15340$r8$lambda$cQTROvIu89eQFJ3PNVXqYm5How();
        }
    });

    public PatternValidation(java.util.regex.Pattern pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
        this.Camera2StreamConfigurationMap = pattern;
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.validator.Validation
    public final boolean validate(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return this.Camera2StreamConfigurationMap.matcher(input).matches();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/validator/PatternValidation$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/shared/domain/validator/PatternValidation;", "EMAIL$delegate", "Lkotlin/Lazy;", "getEMAIL", "()Lcom/paypal/oslo/feature/identity/shared/domain/validator/PatternValidation;", "EMAIL", "PASSWORD", "Lcom/paypal/oslo/feature/identity/shared/domain/validator/PatternValidation;", "getPASSWORD"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation getEMAIL() {
            return (com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation) com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation.EMAIL$delegate.getValue();
        }

        public final com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation getPASSWORD() {
            return com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation.PASSWORD;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^[A-Za-z0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?`~]*$");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "");
        PASSWORD = new com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation(compile);
    }

    /* renamed from: $r8$lambda$cQTRO-vIu89eQFJ3PNVXqYm5How, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation m15340$r8$lambda$cQTROvIu89eQFJ3PNVXqYm5How() {
        java.util.regex.Pattern pattern = android.util.Patterns.EMAIL_ADDRESS;
        kotlin.jvm.internal.Intrinsics.checkNotNull(pattern);
        return new com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation(pattern);
    }
}
