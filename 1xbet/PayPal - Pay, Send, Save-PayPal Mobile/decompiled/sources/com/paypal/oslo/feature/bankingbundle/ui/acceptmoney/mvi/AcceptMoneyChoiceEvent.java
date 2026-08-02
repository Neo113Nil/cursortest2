package com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "CloseClicked", "KeepInPayPalClicked", "TransferToBankClicked", "TermsClicked", "Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent$CloseClicked;", "Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent$KeepInPayPalClicked;", "Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent$TermsClicked;", "Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent$TransferToBankClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AcceptMoneyChoiceEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AcceptMoneyChoiceEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent$CloseClicked;", "Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseClicked extends com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.CloseClicked INSTANCE = new com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.CloseClicked();

        public final int hashCode() {
            return -444571723;
        }

        private CloseClicked() {
            super("CloseClicked", null);
        }

        public final java.lang.String toString() {
            return "CloseClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.CloseClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent$KeepInPayPalClicked;", "Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KeepInPayPalClicked extends com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.KeepInPayPalClicked INSTANCE = new com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.KeepInPayPalClicked();

        public final int hashCode() {
            return -2095336700;
        }

        private KeepInPayPalClicked() {
            super("KeepInPayPalClicked", null);
        }

        public final java.lang.String toString() {
            return "KeepInPayPalClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.KeepInPayPalClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent$TransferToBankClicked;", "Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferToBankClicked extends com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.TransferToBankClicked INSTANCE = new com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.TransferToBankClicked();

        public final int hashCode() {
            return -784809793;
        }

        private TransferToBankClicked() {
            super("TransferToBankClicked", null);
        }

        public final java.lang.String toString() {
            return "TransferToBankClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.TransferToBankClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent$TermsClicked;", "Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TermsClicked extends com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.TermsClicked INSTANCE = new com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.TermsClicked();

        public final int hashCode() {
            return 1738384710;
        }

        private TermsClicked() {
            super("TermsClicked", null);
        }

        public final java.lang.String toString() {
            return "TermsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.TermsClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AcceptMoneyChoiceEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
