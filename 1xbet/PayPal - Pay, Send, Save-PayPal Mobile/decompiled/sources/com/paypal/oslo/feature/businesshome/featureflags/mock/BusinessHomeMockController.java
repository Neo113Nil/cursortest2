package com.paypal.oslo.feature.businesshome.featureflags.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/featureflags/mock/BusinessHomeMockController;", "", "<init>", "()V", "", "reset", "", "simulateMerchantInsightsError", "Z", "getSimulateMerchantInsightsError", "()Z", "setSimulateMerchantInsightsError", "(Z)V", "simulateAccountSetupError", "getSimulateAccountSetupError", "setSimulateAccountSetupError", "Lcom/paypal/oslo/feature/businesshome/featureflags/mock/BusinessHomeMockController$InFocusScenario;", "inFocusScenario", "Lcom/paypal/oslo/feature/businesshome/featureflags/mock/BusinessHomeMockController$InFocusScenario;", "getInFocusScenario", "()Lcom/paypal/oslo/feature/businesshome/featureflags/mock/BusinessHomeMockController$InFocusScenario;", "setInFocusScenario", "(Lcom/paypal/oslo/feature/businesshome/featureflags/mock/BusinessHomeMockController$InFocusScenario;)V", "showPipBadge", "getShowPipBadge", "setShowPipBadge", "InFocusScenario"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessHomeMockController {
    private static boolean showPipBadge;
    private static boolean simulateAccountSetupError;
    private static boolean simulateMerchantInsightsError;
    public static final com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController INSTANCE = new com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController();
    private static com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario inFocusScenario = com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.Default;
    public static final int $stable = 8;

    private BusinessHomeMockController() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/featureflags/mock/BusinessHomeMockController$InFocusScenario;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "displayLabel", "Ljava/lang/String;", "getDisplayLabel", "()Ljava/lang/String;", "Default", "Empty", "Single", "Two", "Three", "Four", "Eleven", "Twelve", "OverMaxDisplay"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InFocusScenario {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario Default;
        public static final com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario Eleven;
        public static final com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario Empty;
        public static final com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario Four;
        public static final com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario OverMaxDisplay;
        public static final com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario Single;
        public static final com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario Three;
        public static final com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario Twelve;
        public static final com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario Two;
        private static final /* synthetic */ com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario[] getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.String displayLabel;

        private InFocusScenario(java.lang.String str, int i, java.lang.String str2) {
            this.displayLabel = str2;
        }

        public final java.lang.String getDisplayLabel() {
            return this.displayLabel;
        }

        static {
            com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario inFocusScenario = new com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario("Default", 0, "Default (5 receivables, 2 payables, 2 disputes)");
            Default = inFocusScenario;
            com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario inFocusScenario2 = new com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario("Empty", 1, "Empty state");
            Empty = inFocusScenario2;
            com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario inFocusScenario3 = new com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario("Single", 2, "Single (1 payable, 1 receivable, 1 dispute)");
            Single = inFocusScenario3;
            com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario inFocusScenario4 = new com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario("Two", 3, "2 unique customers each, 2 disputes");
            Two = inFocusScenario4;
            com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario inFocusScenario5 = new com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario("Three", 4, "3 unique customers each, 2 disputes");
            Three = inFocusScenario5;
            com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario inFocusScenario6 = new com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario("Four", 5, "4 unique customers each, 2 disputes");
            Four = inFocusScenario6;
            com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario inFocusScenario7 = new com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario("Eleven", 6, "11 unique customers each, 2 disputes");
            Eleven = inFocusScenario7;
            com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario inFocusScenario8 = new com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario("Twelve", 7, "12 unique customers each, 2 disputes");
            Twelve = inFocusScenario8;
            com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario inFocusScenario9 = new com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario("OverMaxDisplay", 8, "151 payables & receivables, 2 disputes");
            OverMaxDisplay = inFocusScenario9;
            com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario[] inFocusScenarioArr = {inFocusScenario, inFocusScenario2, inFocusScenario3, inFocusScenario4, inFocusScenario5, inFocusScenario6, inFocusScenario7, inFocusScenario8, inFocusScenario9};
            getHighResolutionOutputSizeshNQ4ISI = inFocusScenarioArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(inFocusScenarioArr);
        }

        public static com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario[] values() {
            return (com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    public final boolean getSimulateMerchantInsightsError() {
        return simulateMerchantInsightsError;
    }

    public final void setSimulateMerchantInsightsError(boolean z) {
        simulateMerchantInsightsError = z;
    }

    public final boolean getSimulateAccountSetupError() {
        return simulateAccountSetupError;
    }

    public final void setSimulateAccountSetupError(boolean z) {
        simulateAccountSetupError = z;
    }

    public final com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario getInFocusScenario() {
        return inFocusScenario;
    }

    public final void setInFocusScenario(com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario inFocusScenario2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inFocusScenario2, "");
        inFocusScenario = inFocusScenario2;
    }

    public final boolean getShowPipBadge() {
        return showPipBadge;
    }

    public final void setShowPipBadge(boolean z) {
        showPipBadge = z;
    }

    public final void reset() {
        simulateMerchantInsightsError = false;
        simulateAccountSetupError = false;
        inFocusScenario = com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.Default;
        showPipBadge = false;
    }
}
