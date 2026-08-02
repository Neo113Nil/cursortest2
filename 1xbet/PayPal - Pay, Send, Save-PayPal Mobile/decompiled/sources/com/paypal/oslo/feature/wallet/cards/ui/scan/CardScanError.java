package com.paypal.oslo.feature.wallet.cards.ui.scan;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError;", "", "", "p0", "<init>", "(Ljava/lang/Integer;)V", "messageResId", "Ljava/lang/Integer;", "getMessageResId", "()Ljava/lang/Integer;", com.ingo.sdk.kotlin.common.analytics.IEventNames.ApiFailure, "CameraError", "CameraInUse", "Cancelled", "Unknown", "Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError$ApiFailure;", "Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError$CameraError;", "Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError$CameraInUse;", "Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError$Cancelled;", "Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CardScanError {
    public static final int $stable = 0;
    private final java.lang.Integer messageResId;

    private CardScanError(java.lang.Integer num) {
        this.messageResId = num;
    }

    public /* synthetic */ CardScanError(java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, null);
    }

    public final java.lang.Integer getMessageResId() {
        return this.messageResId;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError$ApiFailure;", "Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApiFailure extends com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.ApiFailure INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.ApiFailure();

        public final int hashCode() {
            return -1913670551;
        }

        private ApiFailure() {
            super(java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_scan_error_loading), null);
        }

        public final java.lang.String toString() {
            return com.ingo.sdk.kotlin.common.analytics.IEventNames.ApiFailure;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.ApiFailure)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError$CameraError;", "Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CameraError extends com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.CameraError INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.CameraError();

        public final int hashCode() {
            return 1649738410;
        }

        private CameraError() {
            super(java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_scan_error_camera), null);
        }

        public final java.lang.String toString() {
            return "CameraError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.CameraError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError$CameraInUse;", "Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CameraInUse extends com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.CameraInUse INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.CameraInUse();

        public final int hashCode() {
            return 1653285572;
        }

        private CameraInUse() {
            super(java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_scan_error_camera_in_use), null);
        }

        public final java.lang.String toString() {
            return "CameraInUse";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.CameraInUse)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError$Cancelled;", "Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancelled extends com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.Cancelled INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.Cancelled();

        public final int hashCode() {
            return 529818584;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Cancelled() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError$Unknown;", "Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError;", "", "errorCode", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError {
        public static final int $stable = 0;
        private final int errorCode;

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown(int i) {
            super(null, 1, 0 == true ? 1 : 0);
            this.errorCode = i;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            int i = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(errorCode=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.errorCode);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.Unknown) && this.errorCode == ((com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.Unknown) other).errorCode;
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.Unknown copy(int errorCode) {
            return new com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.Unknown(errorCode);
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.Unknown copy$default(com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.Unknown unknown, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = unknown.errorCode;
            }
            return unknown.copy(i);
        }
    }

    public /* synthetic */ CardScanError(java.lang.Integer num, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(num);
    }
}
