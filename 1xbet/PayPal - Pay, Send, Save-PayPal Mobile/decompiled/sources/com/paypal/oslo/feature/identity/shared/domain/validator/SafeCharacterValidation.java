package com.paypal.oslo.feature.identity.shared.domain.validator;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/validator/SafeCharacterValidation;", "Lcom/paypal/oslo/feature/identity/shared/domain/validator/Validation;", "", "", "disallowedChars", "Ljava/util/regex/Pattern;", "disallowedPattern", "<init>", "(Ljava/util/Set;Ljava/util/regex/Pattern;)V", "", "input", "", "validate", "(Ljava/lang/String;)Z", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Ljava/util/regex/Pattern;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafeCharacterValidation implements com.paypal.oslo.feature.identity.shared.domain.validator.Validation {
    private static final com.paypal.oslo.feature.identity.shared.domain.validator.SafeCharacterValidation EMAIL;
    private static final com.paypal.oslo.feature.identity.shared.domain.validator.SafeCharacterValidation PASSWORD;
    private static final java.util.Set<java.lang.Character> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<java.lang.Character> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.regex.Pattern Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.shared.domain.validator.SafeCharacterValidation.Companion INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.validator.SafeCharacterValidation.Companion(null);
    public static final int $stable = 8;
    private static final java.util.regex.Pattern getHighSpeedVideoSizes = java.util.regex.Pattern.compile("[\\p{Cc}\\p{Cf}\\p{Cs}\\p{Co}]");

    public SafeCharacterValidation(java.util.Set<java.lang.Character> set, java.util.regex.Pattern pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
        this.getHighResolutionOutputSizeshNQ4ISI = set;
        this.Camera2StreamConfigurationMap = pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SafeCharacterValidation(java.util.Set set, java.util.regex.Pattern pattern, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(set, pattern);
        if ((i & 2) != 0) {
            pattern = getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pattern, "");
        }
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.validator.Validation
    public final boolean validate(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String str = input;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (this.getHighResolutionOutputSizeshNQ4ISI.contains(java.lang.Character.valueOf(charAt)) || this.Camera2StreamConfigurationMap.matcher(java.lang.String.valueOf(charAt)).matches()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0006*\u00020\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/validator/SafeCharacterValidation$Companion;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "getHighSpeedVideoSizes", "Ljava/util/regex/Pattern;", "", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/shared/domain/validator/SafeCharacterValidation;", "EMAIL", "Lcom/paypal/oslo/feature/identity/shared/domain/validator/SafeCharacterValidation;", "getEMAIL", "()Lcom/paypal/oslo/feature/identity/shared/domain/validator/SafeCharacterValidation;", "PASSWORD", "getPASSWORD"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.identity.shared.domain.validator.SafeCharacterValidation getEMAIL() {
            return com.paypal.oslo.feature.identity.shared.domain.validator.SafeCharacterValidation.EMAIL;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.validator.SafeCharacterValidation getPASSWORD() {
            return com.paypal.oslo.feature.identity.shared.domain.validator.SafeCharacterValidation.PASSWORD;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.util.Set<java.lang.Character> of = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{'\\', '\"', java.lang.Character.valueOf(kotlin.text.Typography.less), java.lang.Character.valueOf(kotlin.text.Typography.greater), ';', '\n', 0});
        getHighResolutionOutputSizeshNQ4ISI = of;
        int i = 2;
        EMAIL = new com.paypal.oslo.feature.identity.shared.domain.validator.SafeCharacterValidation(kotlin.collections.SetsKt.plus(of, ' '), null == true ? 1 : 0, i, null == true ? 1 : 0);
        PASSWORD = new com.paypal.oslo.feature.identity.shared.domain.validator.SafeCharacterValidation(of, null == true ? 1 : 0, i, null == true ? 1 : 0);
    }
}
