package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "ShowWalletLockedToast", "ShowWalletUnlockedToast", "ShowWalletRemovedToast", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect$NavigateBack;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect$ShowWalletLockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect$ShowWalletRemovedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect$ShowWalletUnlockedToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ManageWalletEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ManageWalletEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect$NavigateBack;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.NavigateBack();

        public final int hashCode() {
            return -317202220;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect$ShowWalletLockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowWalletLockedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletLockedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletLockedToast();

        public final int hashCode() {
            return 1669180075;
        }

        private ShowWalletLockedToast() {
            super("ShowWalletLockedToast", null);
        }

        public final java.lang.String toString() {
            return "ShowWalletLockedToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletLockedToast)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect$ShowWalletUnlockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowWalletUnlockedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletUnlockedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletUnlockedToast();

        public final int hashCode() {
            return 21106418;
        }

        private ShowWalletUnlockedToast() {
            super("ShowWalletUnlockedToast", null);
        }

        public final java.lang.String toString() {
            return "ShowWalletUnlockedToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletUnlockedToast)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect$ShowWalletRemovedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowWalletRemovedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletRemovedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletRemovedToast();

        public final int hashCode() {
            return 2048136697;
        }

        private ShowWalletRemovedToast() {
            super("ShowWalletRemovedToast", null);
        }

        public final java.lang.String toString() {
            return "ShowWalletRemovedToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletRemovedToast)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ManageWalletEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
