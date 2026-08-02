package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/AwaitingData;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Pin", "Address", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/AwaitingData$Address;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/AwaitingData$Pin;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AwaitingData {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AwaitingData(java.lang.String str) {
        this.name = str;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/AwaitingData$Pin;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/AwaitingData;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Pin extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData.Pin INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData.Pin();

        public final int hashCode() {
            return 1671915678;
        }

        private Pin() {
            super("Pin", null);
        }

        public final java.lang.String toString() {
            return "Pin";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData.Pin)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/AwaitingData$Address;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/AwaitingData;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData.Address INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData.Address();

        public final int hashCode() {
            return -670521731;
        }

        private Address() {
            super("Address", null);
        }

        public final java.lang.String toString() {
            return "Address";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData.Address)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AwaitingData(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
