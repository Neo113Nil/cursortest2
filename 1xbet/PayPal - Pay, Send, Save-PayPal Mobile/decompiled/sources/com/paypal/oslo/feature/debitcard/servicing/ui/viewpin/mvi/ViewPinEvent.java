package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "CvvChanged", "ConfirmCvvChanged", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_SUBMIT_CLICKED, "BackClicked", "RetryClicked", "CvvValidated", "ConfirmCvvValidated", "VerificationSucceeded", "VerificationFailed", "CountdownTimer", "CountdownTimerExpired", "DoneClicked", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$BackClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$ConfirmCvvChanged;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$ConfirmCvvValidated;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CountdownTimer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CountdownTimerExpired;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CvvChanged;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CvvValidated;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$DoneClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$RetryClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$SubmitClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$VerificationFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$VerificationSucceeded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ViewPinEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ViewPinEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CvvChanged;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CvvChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCvv"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CvvChanged extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent {
        public static final int $stable = 0;
        private final java.lang.String cvv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CvvChanged(java.lang.String str) {
            super("CvvChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cvv = str;
        }

        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cvv;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CvvChanged(cvv=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cvv.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, ((com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvChanged) other).cvv);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvChanged copy(java.lang.String cvv) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvChanged(cvv);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvChanged copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvChanged cvvChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cvvChanged.cvv;
            }
            return cvvChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$ConfirmCvvChanged;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "", "confirmCvv", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$ConfirmCvvChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConfirmCvv"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmCvvChanged extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent {
        public static final int $stable = 0;
        private final java.lang.String confirmCvv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmCvvChanged(java.lang.String str) {
            super("ConfirmCvvChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.confirmCvv = str;
        }

        public final java.lang.String getConfirmCvv() {
            return this.confirmCvv;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.confirmCvv;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmCvvChanged(confirmCvv=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.confirmCvv.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmCvv, ((com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvChanged) other).confirmCvv);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvChanged copy(java.lang.String confirmCvv) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmCvv, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvChanged(confirmCvv);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConfirmCvv() {
            return this.confirmCvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvChanged copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvChanged confirmCvvChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = confirmCvvChanged.confirmCvv;
            }
            return confirmCvvChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$SubmitClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.SubmitClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.SubmitClicked();

        public final int hashCode() {
            return -2042903086;
        }

        private SubmitClicked() {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_SUBMIT_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_SUBMIT_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.SubmitClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$BackClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.BackClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.BackClicked();

        public final int hashCode() {
            return -1107056925;
        }

        private BackClicked() {
            super("BackClicked", null);
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$RetryClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.RetryClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.RetryClicked();

        public final int hashCode() {
            return -1913821412;
        }

        private RetryClicked() {
            super("RetryClicked", null);
        }

        public final java.lang.String toString() {
            return "RetryClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.RetryClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CvvValidated;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "", "isValid", "", "errorMessageResId", "<init>", "(ZLjava/lang/Integer;)V", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "copy", "(ZLjava/lang/Integer;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CvvValidated;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/lang/Integer;", "getErrorMessageResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CvvValidated extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent {
        public static final int $stable = 0;
        private final java.lang.Integer errorMessageResId;
        private final boolean isValid;

        public CvvValidated(boolean z, java.lang.Integer num) {
            super("CvvValidated", null);
            this.isValid = z;
            this.errorMessageResId = num;
        }

        public /* synthetic */ CvvValidated(boolean z, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : num);
        }

        public final boolean isValid() {
            return this.isValid;
        }

        public final java.lang.Integer getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final java.lang.String toString() {
            boolean z = this.isValid;
            java.lang.Integer num = this.errorMessageResId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CvvValidated(isValid=");
            sb.append(z);
            sb.append(", errorMessageResId=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isValid);
            java.lang.Integer num = this.errorMessageResId;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated cvvValidated = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated) other;
            return this.isValid == cvvValidated.isValid && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessageResId, cvvValidated.errorMessageResId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated copy(boolean isValid, java.lang.Integer errorMessageResId) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated(isValid, errorMessageResId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getErrorMessageResId() {
            return this.errorMessageResId;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated cvvValidated, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = cvvValidated.isValid;
            }
            if ((i & 2) != 0) {
                num = cvvValidated.errorMessageResId;
            }
            return cvvValidated.copy(z, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$ConfirmCvvValidated;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "", "isValid", "", "errorMessageResId", "<init>", "(ZLjava/lang/Integer;)V", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "copy", "(ZLjava/lang/Integer;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$ConfirmCvvValidated;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/lang/Integer;", "getErrorMessageResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmCvvValidated extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent {
        public static final int $stable = 0;
        private final java.lang.Integer errorMessageResId;
        private final boolean isValid;

        public ConfirmCvvValidated(boolean z, java.lang.Integer num) {
            super("ConfirmCvvValidated", null);
            this.isValid = z;
            this.errorMessageResId = num;
        }

        public /* synthetic */ ConfirmCvvValidated(boolean z, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : num);
        }

        public final boolean isValid() {
            return this.isValid;
        }

        public final java.lang.Integer getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final java.lang.String toString() {
            boolean z = this.isValid;
            java.lang.Integer num = this.errorMessageResId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmCvvValidated(isValid=");
            sb.append(z);
            sb.append(", errorMessageResId=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isValid);
            java.lang.Integer num = this.errorMessageResId;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated confirmCvvValidated = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated) other;
            return this.isValid == confirmCvvValidated.isValid && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessageResId, confirmCvvValidated.errorMessageResId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated copy(boolean isValid, java.lang.Integer errorMessageResId) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated(isValid, errorMessageResId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getErrorMessageResId() {
            return this.errorMessageResId;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated confirmCvvValidated, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = confirmCvvValidated.isValid;
            }
            if ((i & 2) != 0) {
                num = confirmCvvValidated.errorMessageResId;
            }
            return confirmCvvValidated.copy(z, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$VerificationSucceeded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitInstrumentPinDetails;", "result", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitInstrumentPinDetails;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitInstrumentPinDetails;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitInstrumentPinDetails;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$VerificationSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitInstrumentPinDetails;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerificationSucceeded extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationSucceeded(com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails debitInstrumentPinDetails) {
            super("VerificationSucceeded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPinDetails, "");
            this.result = debitInstrumentPinDetails;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails debitInstrumentPinDetails = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerificationSucceeded(result=");
            sb.append(debitInstrumentPinDetails);
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationSucceeded) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationSucceeded) other).result);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationSucceeded copy(com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationSucceeded(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationSucceeded copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationSucceeded verificationSucceeded, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails debitInstrumentPinDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentPinDetails = verificationSucceeded.result;
            }
            return verificationSucceeded.copy(debitInstrumentPinDetails);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$VerificationFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "", "errorMessage", "errorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$VerificationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "getErrorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerificationFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationFailed(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType) {
            super("VerificationFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorMessage = str;
            this.errorCode = str2;
            this.errorType = debitErrorType;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.String str2 = this.errorCode;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerificationFailed(errorMessage=");
            sb.append(str);
            sb.append(", errorCode=");
            sb.append(str2);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorMessage.hashCode() * 31) + this.errorCode.hashCode()) * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationFailed verificationFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, verificationFailed.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, verificationFailed.errorCode) && this.errorType == verificationFailed.errorType;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationFailed copy(java.lang.String errorMessage, java.lang.String errorCode, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationFailed(errorMessage, errorCode, errorType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationFailed verificationFailed, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = verificationFailed.errorMessage;
            }
            if ((i & 2) != 0) {
                str2 = verificationFailed.errorCode;
            }
            if ((i & 4) != 0) {
                debitErrorType = verificationFailed.errorType;
            }
            return verificationFailed.copy(str, str2, debitErrorType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CountdownTimer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "", "remainingSeconds", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CountdownTimer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRemainingSeconds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CountdownTimer extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent {
        public static final int $stable = 0;
        private final int remainingSeconds;

        public CountdownTimer(int i) {
            super("TimerTick", null);
            this.remainingSeconds = i;
        }

        public final int getRemainingSeconds() {
            return this.remainingSeconds;
        }

        public final java.lang.String toString() {
            int i = this.remainingSeconds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CountdownTimer(remainingSeconds=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.remainingSeconds);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimer) && this.remainingSeconds == ((com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimer) other).remainingSeconds;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimer copy(int remainingSeconds) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimer(remainingSeconds);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRemainingSeconds() {
            return this.remainingSeconds;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimer copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimer countdownTimer, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = countdownTimer.remainingSeconds;
            }
            return countdownTimer.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CountdownTimerExpired;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CountdownTimerExpired extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimerExpired INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimerExpired();

        public final int hashCode() {
            return 1400205012;
        }

        private CountdownTimerExpired() {
            super("TimerExpired", null);
        }

        public final java.lang.String toString() {
            return "CountdownTimerExpired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimerExpired)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$DoneClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DoneClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.DoneClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.DoneClicked();

        public final int hashCode() {
            return 863695848;
        }

        private DoneClicked() {
            super("DoneClicked", null);
        }

        public final java.lang.String toString() {
            return "DoneClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.DoneClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ViewPinEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
