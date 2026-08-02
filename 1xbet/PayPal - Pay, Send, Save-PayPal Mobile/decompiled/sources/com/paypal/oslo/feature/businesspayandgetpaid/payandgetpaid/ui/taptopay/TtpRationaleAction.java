package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "", "<init>", "()V", "OpenLocationSettings", "OpenNfcSettings", "OpenAppDetailsSettings", "RequestLocationPermissionCheck", "RequestLocationEnabledCheck", "RequestNfcEnabledCheck", "StartTTP", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$OpenAppDetailsSettings;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$OpenLocationSettings;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$OpenNfcSettings;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$RequestLocationEnabledCheck;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$RequestLocationPermissionCheck;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$RequestNfcEnabledCheck;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$StartTTP;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class TtpRationaleAction {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$OpenLocationSettings;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenLocationSettings extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenLocationSettings INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenLocationSettings();

        public final int hashCode() {
            return 1006958306;
        }

        private OpenLocationSettings() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OpenLocationSettings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenLocationSettings)) {
                return false;
            }
            return true;
        }
    }

    private TtpRationaleAction() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$OpenNfcSettings;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenNfcSettings extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenNfcSettings INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenNfcSettings();

        public final int hashCode() {
            return -719853372;
        }

        private OpenNfcSettings() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OpenNfcSettings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenNfcSettings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$OpenAppDetailsSettings;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenAppDetailsSettings extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenAppDetailsSettings INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenAppDetailsSettings();

        public final int hashCode() {
            return -1349930610;
        }

        private OpenAppDetailsSettings() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OpenAppDetailsSettings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenAppDetailsSettings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$RequestLocationPermissionCheck;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestLocationPermissionCheck extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.RequestLocationPermissionCheck INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.RequestLocationPermissionCheck();

        public final int hashCode() {
            return -998880779;
        }

        private RequestLocationPermissionCheck() {
            super(null);
        }

        public final java.lang.String toString() {
            return "RequestLocationPermissionCheck";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.RequestLocationPermissionCheck)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$RequestLocationEnabledCheck;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestLocationEnabledCheck extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.RequestLocationEnabledCheck INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.RequestLocationEnabledCheck();

        public final int hashCode() {
            return 116410955;
        }

        private RequestLocationEnabledCheck() {
            super(null);
        }

        public final java.lang.String toString() {
            return "RequestLocationEnabledCheck";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.RequestLocationEnabledCheck)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$RequestNfcEnabledCheck;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestNfcEnabledCheck extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.RequestNfcEnabledCheck INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.RequestNfcEnabledCheck();

        public final int hashCode() {
            return -1633723773;
        }

        private RequestNfcEnabledCheck() {
            super(null);
        }

        public final java.lang.String toString() {
            return "RequestNfcEnabledCheck";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.RequestNfcEnabledCheck)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction$StartTTP;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartTTP extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.StartTTP INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.StartTTP();

        public final int hashCode() {
            return -681118802;
        }

        private StartTTP() {
            super(null);
        }

        public final java.lang.String toString() {
            return "StartTTP";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.StartTTP)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ TtpRationaleAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
