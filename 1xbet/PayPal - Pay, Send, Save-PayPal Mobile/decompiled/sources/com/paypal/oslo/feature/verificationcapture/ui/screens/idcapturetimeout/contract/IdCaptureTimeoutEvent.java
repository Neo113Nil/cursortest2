package com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "RetryAutoCaptureTapped", "ManualCaptureTapped", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent$Initialize;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent$ManualCaptureTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent$RetryAutoCaptureTapped;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class IdCaptureTimeoutEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private IdCaptureTimeoutEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent$Initialize;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent.Initialize INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent.Initialize();

        public final int hashCode() {
            return -205446645;
        }

        private Initialize() {
            super("IdCaptureTimeoutEvent.Initialize", null);
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent$RetryAutoCaptureTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryAutoCaptureTapped extends com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent.RetryAutoCaptureTapped INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent.RetryAutoCaptureTapped();

        public final int hashCode() {
            return 2015219766;
        }

        private RetryAutoCaptureTapped() {
            super("IdCaptureTimeoutEvent.RetryAutoCaptureTapped", null);
        }

        public final java.lang.String toString() {
            return "RetryAutoCaptureTapped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent.RetryAutoCaptureTapped)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent$ManualCaptureTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ManualCaptureTapped extends com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent.ManualCaptureTapped INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent.ManualCaptureTapped();

        public final int hashCode() {
            return 326610737;
        }

        private ManualCaptureTapped() {
            super("IdCaptureTimeoutEvent.ManualCaptureTapped", null);
        }

        public final java.lang.String toString() {
            return "ManualCaptureTapped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent.ManualCaptureTapped)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ IdCaptureTimeoutEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
