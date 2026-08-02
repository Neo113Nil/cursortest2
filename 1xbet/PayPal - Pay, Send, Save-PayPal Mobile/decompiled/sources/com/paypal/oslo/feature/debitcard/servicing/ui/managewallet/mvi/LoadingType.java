package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType;", "", "<init>", "()V", "Screen", "Lock", "Unlock", "Remove", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType$Lock;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType$Remove;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType$Screen;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType$Unlock;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class LoadingType {
    public static final int $stable = 0;

    private LoadingType() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType$Screen;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Screen extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Screen INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Screen();

        public final int hashCode() {
            return 1654024103;
        }

        private Screen() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Screen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Screen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType$Lock;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Lock extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Lock INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Lock();

        public final int hashCode() {
            return -1580597466;
        }

        private Lock() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Lock";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Lock)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType$Unlock;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unlock extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Unlock INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Unlock();

        public final int hashCode() {
            return 1721271935;
        }

        private Unlock() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Unlock";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Unlock)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType$Remove;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Remove extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Remove INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Remove();

        public final int hashCode() {
            return 1627103167;
        }

        private Remove() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Remove";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Remove)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ LoadingType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
