package com.paypal.oslo.feature.taptopay.ui.setup.verification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/verification/VerificationOption;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "TEXT_CODE", "EMAIL_CODE", "APP_VERIFICATION", "BANK_HELP"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerificationOption {
    public static final com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption APP_VERIFICATION;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption BANK_HELP;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption.Companion INSTANCE;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption EMAIL_CODE;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption TEXT_CODE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption[] getHighSpeedVideoFpsRanges;
    private final java.lang.String id;

    private VerificationOption(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    static {
        com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption verificationOption = new com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption("TEXT_CODE", 0, "text_code");
        TEXT_CODE = verificationOption;
        com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption verificationOption2 = new com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption("EMAIL_CODE", 1, "email_code");
        EMAIL_CODE = verificationOption2;
        com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption verificationOption3 = new com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption("APP_VERIFICATION", 2, "app_verification");
        APP_VERIFICATION = verificationOption3;
        com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption verificationOption4 = new com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption("BANK_HELP", 3, "bank_help");
        BANK_HELP = verificationOption4;
        com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption[] verificationOptionArr = {verificationOption, verificationOption2, verificationOption3, verificationOption4};
        getHighSpeedVideoFpsRanges = verificationOptionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(verificationOptionArr);
        INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/verification/VerificationOption$Companion;", "", "<init>", "()V", "", "id", "Lcom/paypal/oslo/feature/taptopay/ui/setup/verification/VerificationOption;", "fromId", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/ui/setup/verification/VerificationOption;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption fromId(java.lang.String id) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption) obj).getId(), id)) {
                    break;
                }
            }
            return (com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption) obj;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption[] values() {
        return (com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.ui.setup.verification.VerificationOption> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
