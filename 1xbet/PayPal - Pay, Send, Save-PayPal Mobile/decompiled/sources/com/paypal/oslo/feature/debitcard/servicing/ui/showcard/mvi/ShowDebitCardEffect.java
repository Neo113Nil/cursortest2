package com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowCopiedCardNumberConfirmationToast", "RetryLoadCardDetails", "OpenSupportPage", "CloseBottomSheet", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect$CloseBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect$OpenSupportPage;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect$RetryLoadCardDetails;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect$ShowCopiedCardNumberConfirmationToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ShowDebitCardEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ShowDebitCardEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect$ShowCopiedCardNumberConfirmationToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCopiedCardNumberConfirmationToast extends com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.ShowCopiedCardNumberConfirmationToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.ShowCopiedCardNumberConfirmationToast();

        public final int hashCode() {
            return 39742502;
        }

        private ShowCopiedCardNumberConfirmationToast() {
            super("ShowCopiedCardNumberConfirmationToast", null);
        }

        public final java.lang.String toString() {
            return "ShowCopiedCardNumberConfirmationToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.ShowCopiedCardNumberConfirmationToast)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect$RetryLoadCardDetails;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryLoadCardDetails extends com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.RetryLoadCardDetails INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.RetryLoadCardDetails();

        public final int hashCode() {
            return -1732829386;
        }

        private RetryLoadCardDetails() {
            super("RetryLoadCardDetails", null);
        }

        public final java.lang.String toString() {
            return "RetryLoadCardDetails";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.RetryLoadCardDetails)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect$OpenSupportPage;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenSupportPage extends com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.OpenSupportPage INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.OpenSupportPage();

        public final int hashCode() {
            return 778781794;
        }

        private OpenSupportPage() {
            super("OpenSupportPage", null);
        }

        public final java.lang.String toString() {
            return "OpenSupportPage";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.OpenSupportPage)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect$CloseBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseBottomSheet extends com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.CloseBottomSheet INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.CloseBottomSheet();

        public final int hashCode() {
            return -1164494706;
        }

        private CloseBottomSheet() {
            super("CloseBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "CloseBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.CloseBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ShowDebitCardEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
