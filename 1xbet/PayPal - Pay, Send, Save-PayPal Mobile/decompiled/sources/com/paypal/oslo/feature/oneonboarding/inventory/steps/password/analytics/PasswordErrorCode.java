package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0015\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/analytics/PasswordErrorCode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "messageResId", "Ljava/lang/Integer;", "getMessageResId", "()Ljava/lang/Integer;", "Companion", "PASSWORD_VALIDATION_FAILED", "INVALID_PASSWORD_LENGTH", "INVALID_PASSWORD_CHARACTERS", "INVALID_PASSWORD_KEY_SEQUENCE", "INVALID_PASSWORD_SEQUENCE", "INVALID_PASSWORD_REPEATED_CHARS", "INVALID_PASSWORD_COMPLEXITY", "INVALID_PASSWORD_BLOCKLIST"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PasswordErrorCode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode.Companion INSTANCE;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode INVALID_PASSWORD_BLOCKLIST;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode INVALID_PASSWORD_CHARACTERS;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode INVALID_PASSWORD_COMPLEXITY;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode INVALID_PASSWORD_KEY_SEQUENCE;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode INVALID_PASSWORD_LENGTH;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode INVALID_PASSWORD_REPEATED_CHARS;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode INVALID_PASSWORD_SEQUENCE;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode PASSWORD_VALIDATION_FAILED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode[] getHighSpeedVideoFpsRanges;
    private final java.lang.Integer messageResId;

    private PasswordErrorCode(java.lang.String str, int i, java.lang.Integer num) {
        this.messageResId = num;
    }

    /* synthetic */ PasswordErrorCode(java.lang.String str, int i, java.lang.Integer num, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? null : num);
    }

    public final java.lang.Integer getMessageResId() {
        return this.messageResId;
    }

    static {
        com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode passwordErrorCode = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode("PASSWORD_VALIDATION_FAILED", 0, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_required_message));
        PASSWORD_VALIDATION_FAILED = passwordErrorCode;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode passwordErrorCode2 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode("INVALID_PASSWORD_LENGTH", 1, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_length_message));
        INVALID_PASSWORD_LENGTH = passwordErrorCode2;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode passwordErrorCode3 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode("INVALID_PASSWORD_CHARACTERS", 2, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_regex_message));
        INVALID_PASSWORD_CHARACTERS = passwordErrorCode3;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode passwordErrorCode4 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode("INVALID_PASSWORD_KEY_SEQUENCE", 3, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_key_sequence_message));
        INVALID_PASSWORD_KEY_SEQUENCE = passwordErrorCode4;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode passwordErrorCode5 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode("INVALID_PASSWORD_SEQUENCE", 4, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_consecutive_number_message));
        INVALID_PASSWORD_SEQUENCE = passwordErrorCode5;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode passwordErrorCode6 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode("INVALID_PASSWORD_REPEATED_CHARS", 5, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_consecutive_repeated_char_message));
        INVALID_PASSWORD_REPEATED_CHARS = passwordErrorCode6;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode passwordErrorCode7 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode("INVALID_PASSWORD_COMPLEXITY", 6, java.lang.Integer.valueOf(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_password_hard_message));
        INVALID_PASSWORD_COMPLEXITY = passwordErrorCode7;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode passwordErrorCode8 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode("INVALID_PASSWORD_BLOCKLIST", 7, null, 1, null);
        INVALID_PASSWORD_BLOCKLIST = passwordErrorCode8;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode[] passwordErrorCodeArr = {passwordErrorCode, passwordErrorCode2, passwordErrorCode3, passwordErrorCode4, passwordErrorCode5, passwordErrorCode6, passwordErrorCode7, passwordErrorCode8};
        getHighSpeedVideoFpsRanges = passwordErrorCodeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(passwordErrorCodeArr);
        INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/analytics/PasswordErrorCode$Companion;", "", "<init>", "()V", "", "messageResId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/analytics/PasswordErrorCode;", "fromMessageResId", "(I)Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/analytics/PasswordErrorCode;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode fromMessageResId(int messageResId) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.lang.Integer messageResId2 = ((com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode) obj).getMessageResId();
                if (messageResId2 != null && messageResId2.intValue() == messageResId) {
                    break;
                }
            }
            return (com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode) obj;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode[] values() {
        return (com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
