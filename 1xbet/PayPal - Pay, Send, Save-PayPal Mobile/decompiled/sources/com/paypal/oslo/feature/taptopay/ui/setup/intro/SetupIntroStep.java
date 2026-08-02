package com.paypal.oslo.feature.taptopay.ui.setup.intro;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0014\b\u0080\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/intro/SetupIntroStep;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;IIIII)V", "stepNumber", com.visa.cbp.getEncExpo.warmup, "getStepNumber", "()I", "titleRes", "getTitleRes", "subtitleRes", "getSubtitleRes", "imageRes", "getImageRes", "Companion", "STEP_1", "STEP_2", "STEP_3"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetupIntroStep {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep.Companion INSTANCE;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep STEP_1;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep STEP_2;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep STEP_3;
    public static final int TOTAL_STEPS = 3;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final int imageRes;
    private final int stepNumber;
    private final int subtitleRes;
    private final int titleRes;

    private SetupIntroStep(java.lang.String str, int i, int i2, int i3, int i4, int i5) {
        this.stepNumber = i2;
        this.titleRes = i3;
        this.subtitleRes = i4;
        this.imageRes = i5;
    }

    public final int getStepNumber() {
        return this.stepNumber;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final int getSubtitleRes() {
        return this.subtitleRes;
    }

    public final int getImageRes() {
        return this.imageRes;
    }

    static {
        com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep setupIntroStep = new com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep("STEP_1", 0, 0, com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_step_one_title, com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_step_one_body, com.paypal.oslo.feature.taptopay.R.drawable.feature_taptopay_setup_intro_1);
        STEP_1 = setupIntroStep;
        com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep setupIntroStep2 = new com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep("STEP_2", 1, 1, com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_step_two_title, com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_step_two_body, com.paypal.oslo.feature.taptopay.R.drawable.feature_taptopay_setup_intro_2);
        STEP_2 = setupIntroStep2;
        com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep setupIntroStep3 = new com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep("STEP_3", 2, 2, com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_step_three_title, com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_third_body_android, com.paypal.oslo.feature.taptopay.R.drawable.feature_taptopay_setup_intro_3);
        STEP_3 = setupIntroStep3;
        com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep[] setupIntroStepArr = {setupIntroStep, setupIntroStep2, setupIntroStep3};
        getHighResolutionOutputSizeshNQ4ISI = setupIntroStepArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(setupIntroStepArr);
        INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/intro/SetupIntroStep$Companion;", "", "<init>", "()V", "", "stepNumber", "Lcom/paypal/oslo/feature/taptopay/ui/setup/intro/SetupIntroStep;", "fromStepNumber", "(I)Lcom/paypal/oslo/feature/taptopay/ui/setup/intro/SetupIntroStep;", "TOTAL_STEPS", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep fromStepNumber(int stepNumber) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep) obj).getStepNumber() == stepNumber) {
                    break;
                }
            }
            com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep setupIntroStep = (com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep) obj;
            return setupIntroStep == null ? com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep.STEP_1 : setupIntroStep;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep[] values() {
        return (com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroStep> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
