package com.paypal.oslo.feature.taptopay.ui.setup.flow.model;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0013\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0013\u001d\u001e\u001f !\"#$%&'()*+,-./"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "", "", "p0", "<init>", "(Z)V", "systemBackEnabled", "Z", "getSystemBackEnabled", "()Z", "Initializing", "ScreenLock", "SetupIntro", "Loading", "FiSelector", "PpdcAcquisitionBridge", "EnterCvv", "TermsAndConditions", "VerificationOptions", "EnterOtp", "Handle3dsVerification", "AppToAppVerification", "CallBankSupport", "ChooseDefaultPayment", "ChooseSecondaryPayment", "XiaomiPaymentConfirmations", "AllSet", com.knotapi.knot.utilities.Constants.META_CLOSE, "Error", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$AllSet;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$AppToAppVerification;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$CallBankSupport;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$ChooseDefaultPayment;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$ChooseSecondaryPayment;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Close;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$EnterCvv;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$EnterOtp;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$FiSelector;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Handle3dsVerification;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Initializing;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Loading;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$PpdcAcquisitionBridge;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$ScreenLock;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$SetupIntro;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$TermsAndConditions;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$VerificationOptions;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$XiaomiPaymentConfirmations;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SetupFlowNavStep {
    public static final int $stable = 0;
    private final boolean systemBackEnabled;

    private SetupFlowNavStep(boolean z) {
        this.systemBackEnabled = z;
    }

    public /* synthetic */ SetupFlowNavStep(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, null);
    }

    public final boolean getSystemBackEnabled() {
        return this.systemBackEnabled;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Initializing;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initializing extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Initializing INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Initializing();

        public final int hashCode() {
            return -898321942;
        }

        private Initializing() {
            super(false, 1, null);
        }

        public final java.lang.String toString() {
            return "Initializing";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Initializing)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$ScreenLock;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenLock extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ScreenLock INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ScreenLock();

        public final int hashCode() {
            return 909251732;
        }

        private ScreenLock() {
            super(true, null);
        }

        public final java.lang.String toString() {
            return "ScreenLock";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ScreenLock)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$SetupIntro;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SetupIntro extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.SetupIntro INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.SetupIntro();

        public final int hashCode() {
            return -1918078260;
        }

        private SetupIntro() {
            super(true, null);
        }

        public final java.lang.String toString() {
            return "SetupIntro";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.SetupIntro)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Loading;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Loading INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Loading();

        public final int hashCode() {
            return 43165055;
        }

        private Loading() {
            super(false, 1, null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$FiSelector;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FiSelector extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.FiSelector INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.FiSelector();

        public final int hashCode() {
            return -1085594977;
        }

        private FiSelector() {
            super(true, null);
        }

        public final java.lang.String toString() {
            return "FiSelector";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.FiSelector)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$PpdcAcquisitionBridge;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PpdcAcquisitionBridge extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.PpdcAcquisitionBridge INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.PpdcAcquisitionBridge();

        public final int hashCode() {
            return 1649616826;
        }

        private PpdcAcquisitionBridge() {
            super(false, 1, null);
        }

        public final java.lang.String toString() {
            return "PpdcAcquisitionBridge";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.PpdcAcquisitionBridge)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$EnterCvv;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnterCvv extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterCvv INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterCvv();

        public final int hashCode() {
            return 1680947336;
        }

        private EnterCvv() {
            super(true, null);
        }

        public final java.lang.String toString() {
            return "EnterCvv";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterCvv)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$TermsAndConditions;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.TermsAndConditions INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.TermsAndConditions();

        public final int hashCode() {
            return 73484677;
        }

        private TermsAndConditions() {
            super(true, null);
        }

        public final java.lang.String toString() {
            return "TermsAndConditions";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.TermsAndConditions)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$VerificationOptions;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerificationOptions extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions();

        public final int hashCode() {
            return 69385158;
        }

        private VerificationOptions() {
            super(false, 1, null);
        }

        public final java.lang.String toString() {
            return "VerificationOptions";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$EnterOtp;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnterOtp extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterOtp INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterOtp();

        public final int hashCode() {
            return 1680958800;
        }

        private EnterOtp() {
            super(true, null);
        }

        public final java.lang.String toString() {
            return "EnterOtp";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterOtp)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Handle3dsVerification;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Handle3dsVerification extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Handle3dsVerification INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Handle3dsVerification();

        public final int hashCode() {
            return -2098457832;
        }

        private Handle3dsVerification() {
            super(true, null);
        }

        public final java.lang.String toString() {
            return "Handle3dsVerification";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Handle3dsVerification)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$AppToAppVerification;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AppToAppVerification extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.AppToAppVerification INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.AppToAppVerification();

        public final int hashCode() {
            return 127314781;
        }

        private AppToAppVerification() {
            super(true, null);
        }

        public final java.lang.String toString() {
            return "AppToAppVerification";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.AppToAppVerification)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$CallBankSupport;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CallBankSupport extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.CallBankSupport INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.CallBankSupport();

        public final int hashCode() {
            return 1266503160;
        }

        private CallBankSupport() {
            super(true, null);
        }

        public final java.lang.String toString() {
            return "CallBankSupport";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.CallBankSupport)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$ChooseDefaultPayment;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChooseDefaultPayment extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ChooseDefaultPayment INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ChooseDefaultPayment();

        public final int hashCode() {
            return -2127730919;
        }

        private ChooseDefaultPayment() {
            super(false, 1, null);
        }

        public final java.lang.String toString() {
            return "ChooseDefaultPayment";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ChooseDefaultPayment)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$ChooseSecondaryPayment;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChooseSecondaryPayment extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ChooseSecondaryPayment INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ChooseSecondaryPayment();

        public final int hashCode() {
            return 1812662150;
        }

        private ChooseSecondaryPayment() {
            super(false, 1, null);
        }

        public final java.lang.String toString() {
            return "ChooseSecondaryPayment";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ChooseSecondaryPayment)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$XiaomiPaymentConfirmations;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class XiaomiPaymentConfirmations extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.XiaomiPaymentConfirmations INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.XiaomiPaymentConfirmations();

        public final int hashCode() {
            return -371308880;
        }

        private XiaomiPaymentConfirmations() {
            super(false, 1, null);
        }

        public final java.lang.String toString() {
            return "XiaomiPaymentConfirmations";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.XiaomiPaymentConfirmations)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$AllSet;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AllSet extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.AllSet INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.AllSet();

        public final int hashCode() {
            return 2039317086;
        }

        private AllSet() {
            super(false, 1, null);
        }

        public final java.lang.String toString() {
            return "AllSet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.AllSet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Close;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Close;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Close extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Close(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult setupFlowNavResult) {
            super(false, 1, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupFlowNavResult, "");
            this.result = setupFlowNavResult;
        }

        public final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult setupFlowNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Close(result=");
            sb.append(setupFlowNavResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close) other).result);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close copy(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close copy$default(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close close, com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult setupFlowNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                setupFlowNavResult = close.result;
            }
            return close.copy(setupFlowNavResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "<init>", "()V", "Tokenization", "Terminal", "Ineligible", "OtpError", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error$Ineligible;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error$OtpError;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error$Terminal;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error$Tokenization;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Error extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep {
        public static final int $stable = 0;

        private Error() {
            super(false, null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error$Tokenization;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Tokenization extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization();

            public final int hashCode() {
                return -643445138;
            }

            private Tokenization() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Tokenization";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error$Terminal;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Terminal extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Terminal INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Terminal();

            public final int hashCode() {
                return -29795809;
            }

            private Terminal() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Terminal";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Terminal)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error$Ineligible;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Ineligible extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Ineligible INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Ineligible();

            public final int hashCode() {
                return -1864975137;
            }

            private Ineligible() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Ineligible";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Ineligible)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error$OtpError;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OtpError extends com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.OtpError INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.OtpError();

            public final int hashCode() {
                return 179813696;
            }

            private OtpError() {
                super(null);
            }

            public final java.lang.String toString() {
                return "OtpError";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.OtpError)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Error(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SetupFlowNavStep(boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
