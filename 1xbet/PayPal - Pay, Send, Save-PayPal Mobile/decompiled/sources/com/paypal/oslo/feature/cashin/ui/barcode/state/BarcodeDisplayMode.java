package com.paypal.oslo.feature.cashin.ui.barcode.state;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode;", "", "BarcodeOnly", "SwipeOnly", "BarcodeAndSwipe", "NoCapabilities", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode$BarcodeAndSwipe;", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode$BarcodeOnly;", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode$NoCapabilities;", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode$SwipeOnly;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeDisplayMode {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode$BarcodeOnly;", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BarcodeOnly implements com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.BarcodeOnly INSTANCE = new com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.BarcodeOnly();

        public final int hashCode() {
            return -1064677213;
        }

        private BarcodeOnly() {
        }

        public final java.lang.String toString() {
            return "BarcodeOnly";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.BarcodeOnly)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode$SwipeOnly;", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SwipeOnly implements com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.SwipeOnly INSTANCE = new com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.SwipeOnly();

        public final int hashCode() {
            return 1655825437;
        }

        private SwipeOnly() {
        }

        public final java.lang.String toString() {
            return "SwipeOnly";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.SwipeOnly)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode$BarcodeAndSwipe;", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BarcodeAndSwipe implements com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.BarcodeAndSwipe INSTANCE = new com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.BarcodeAndSwipe();

        public final int hashCode() {
            return 503595290;
        }

        private BarcodeAndSwipe() {
        }

        public final java.lang.String toString() {
            return "BarcodeAndSwipe";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.BarcodeAndSwipe)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode$NoCapabilities;", "Lcom/paypal/oslo/feature/cashin/ui/barcode/state/BarcodeDisplayMode;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoCapabilities implements com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.NoCapabilities INSTANCE = new com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.NoCapabilities();

        public final int hashCode() {
            return -1985163168;
        }

        private NoCapabilities() {
        }

        public final java.lang.String toString() {
            return "NoCapabilities";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.ui.barcode.state.BarcodeDisplayMode.NoCapabilities)) {
                return false;
            }
            return true;
        }
    }
}
