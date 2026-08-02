package com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "ContinueTapped", "CancelTapped", "PermissionGranted", "PermissionDenied", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent$CancelTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent$ContinueTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent$Initialize;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent$PermissionDenied;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent$PermissionGranted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class VerificationCaptureTutorialEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private VerificationCaptureTutorialEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent$Initialize;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.Initialize INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.Initialize();

        public final int hashCode() {
            return -362813740;
        }

        private Initialize() {
            super("VerificationCaptureTutorialEvent.Initialize", null);
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent$ContinueTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContinueTapped extends com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.ContinueTapped INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.ContinueTapped();

        public final int hashCode() {
            return 996164439;
        }

        private ContinueTapped() {
            super("VerificationCaptureTutorialEvent.ContinueTapped", null);
        }

        public final java.lang.String toString() {
            return "ContinueTapped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.ContinueTapped)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent$CancelTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelTapped extends com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.CancelTapped INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.CancelTapped();

        public final int hashCode() {
            return 2115296234;
        }

        private CancelTapped() {
            super("VerificationCaptureTutorialEvent.CancelTapped", null);
        }

        public final java.lang.String toString() {
            return "CancelTapped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.CancelTapped)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent$PermissionGranted;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PermissionGranted extends com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.PermissionGranted INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.PermissionGranted();

        public final int hashCode() {
            return 1817895464;
        }

        private PermissionGranted() {
            super("VerificationCaptureTutorialEvent.PermissionGranted", null);
        }

        public final java.lang.String toString() {
            return "PermissionGranted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.PermissionGranted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent$PermissionDenied;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PermissionDenied extends com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.PermissionDenied INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.PermissionDenied();

        public final int hashCode() {
            return -2117079410;
        }

        private PermissionDenied() {
            super("VerificationCaptureTutorialEvent.PermissionDenied", null);
        }

        public final java.lang.String toString() {
            return "PermissionDenied";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialEvent.PermissionDenied)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ VerificationCaptureTutorialEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
