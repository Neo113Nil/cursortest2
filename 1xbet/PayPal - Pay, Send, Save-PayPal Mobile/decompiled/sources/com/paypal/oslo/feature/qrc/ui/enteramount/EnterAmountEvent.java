package com.paypal.oslo.feature.qrc.ui.enteramount;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadScreen", "ContinuePressed", "BackPressed", "ClosePressed", "DismissDialog", "ConfirmCancelPayment", "CancelPaymentComplete", "AmountChanged", "SecondaryAmountChanged", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$AmountChanged;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$BackPressed;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$CancelPaymentComplete;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$ClosePressed;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$ConfirmCancelPayment;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$ContinuePressed;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$DismissDialog;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$LoadScreen;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$SecondaryAmountChanged;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class EnterAmountEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private EnterAmountEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$LoadScreen;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$LoadScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadScreen extends com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadScreen(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
            super("EnterAmountEvent.LoadScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
            this.navArgs = qrcSessionNavArgs;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadScreen(navArgs=");
            sb.append(qrcSessionNavArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.navArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.LoadScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.navArgs, ((com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.LoadScreen) other).navArgs);
        }

        public final com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.LoadScreen copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
            return new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.LoadScreen(navArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.LoadScreen copy$default(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.LoadScreen loadScreen, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionNavArgs = loadScreen.navArgs;
            }
            return loadScreen.copy(qrcSessionNavArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$ContinuePressed;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContinuePressed extends com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ContinuePressed INSTANCE = new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ContinuePressed();

        public final int hashCode() {
            return -760397966;
        }

        private ContinuePressed() {
            super("EnterAmountEvent.ContinuePressed", null);
        }

        public final java.lang.String toString() {
            return "ContinuePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ContinuePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$BackPressed;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackPressed extends com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.BackPressed INSTANCE = new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.BackPressed();

        public final int hashCode() {
            return 2085499570;
        }

        private BackPressed() {
            super("EnterAmountEvent.BackPressed", null);
        }

        public final java.lang.String toString() {
            return "BackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.BackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$ClosePressed;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ClosePressed();

        public final int hashCode() {
            return 618723443;
        }

        private ClosePressed() {
            super("EnterAmountEvent.ClosePressed", null);
        }

        public final java.lang.String toString() {
            return "ClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$DismissDialog;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissDialog extends com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.DismissDialog INSTANCE = new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.DismissDialog();

        public final int hashCode() {
            return 1768063017;
        }

        private DismissDialog() {
            super("EnterAmountEvent.DismissDialog", null);
        }

        public final java.lang.String toString() {
            return "DismissDialog";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.DismissDialog)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$ConfirmCancelPayment;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmCancelPayment extends com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ConfirmCancelPayment INSTANCE = new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ConfirmCancelPayment();

        public final int hashCode() {
            return 1437843381;
        }

        private ConfirmCancelPayment() {
            super("EnterAmountEvent.ConfirmCancelPayment", null);
        }

        public final java.lang.String toString() {
            return "ConfirmCancelPayment";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ConfirmCancelPayment)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$CancelPaymentComplete;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelPaymentComplete extends com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.CancelPaymentComplete INSTANCE = new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.CancelPaymentComplete();

        public final int hashCode() {
            return 1731769404;
        }

        private CancelPaymentComplete() {
            super("EnterAmountEvent.CancelPaymentComplete", null);
        }

        public final java.lang.String toString() {
            return "CancelPaymentComplete";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.CancelPaymentComplete)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$AmountChanged;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;", "", "newAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$AmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNewAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountChanged extends com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        private final java.lang.String newAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmountChanged(java.lang.String str) {
            super("EnterAmountEvent.AmountChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.newAmount = str;
        }

        public final java.lang.String getNewAmount() {
            return this.newAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.newAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountChanged(newAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.newAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.AmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.newAmount, ((com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.AmountChanged) other).newAmount);
        }

        public final com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.AmountChanged copy(java.lang.String newAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newAmount, "");
            return new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.AmountChanged(newAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNewAmount() {
            return this.newAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.AmountChanged copy$default(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.AmountChanged amountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amountChanged.newAmount;
            }
            return amountChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$SecondaryAmountChanged;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;", "", "newAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent$SecondaryAmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNewAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SecondaryAmountChanged extends com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent {
        public static final int $stable = 0;
        private final java.lang.String newAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecondaryAmountChanged(java.lang.String str) {
            super("EnterAmountEvent.SecondaryAmountChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.newAmount = str;
        }

        public final java.lang.String getNewAmount() {
            return this.newAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.newAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SecondaryAmountChanged(newAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.newAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.SecondaryAmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.newAmount, ((com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.SecondaryAmountChanged) other).newAmount);
        }

        public final com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.SecondaryAmountChanged copy(java.lang.String newAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newAmount, "");
            return new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.SecondaryAmountChanged(newAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNewAmount() {
            return this.newAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.SecondaryAmountChanged copy$default(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.SecondaryAmountChanged secondaryAmountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = secondaryAmountChanged.newAmount;
            }
            return secondaryAmountChanged.copy(str);
        }
    }

    public /* synthetic */ EnterAmountEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
