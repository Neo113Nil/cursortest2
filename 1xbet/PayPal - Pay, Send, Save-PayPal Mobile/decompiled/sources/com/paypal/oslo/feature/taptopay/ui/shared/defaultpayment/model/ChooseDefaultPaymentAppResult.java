package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseDefaultPaymentAppResult;", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Skipped", "Closed", "Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseDefaultPaymentAppResult$Closed;", "Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseDefaultPaymentAppResult$Completed;", "Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseDefaultPaymentAppResult$Skipped;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ChooseDefaultPaymentAppResult {

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseDefaultPaymentAppResult$Completed;", "Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseDefaultPaymentAppResult;", "", "wasPPSetAsDefault", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseDefaultPaymentAppResult$Completed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getWasPPSetAsDefault"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Completed implements com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult {
        public static final int $stable = 0;
        private final boolean wasPPSetAsDefault;

        public Completed(boolean z) {
            this.wasPPSetAsDefault = z;
        }

        public final boolean getWasPPSetAsDefault() {
            return this.wasPPSetAsDefault;
        }

        public final java.lang.String toString() {
            boolean z = this.wasPPSetAsDefault;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Completed(wasPPSetAsDefault=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.wasPPSetAsDefault);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Completed) && this.wasPPSetAsDefault == ((com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Completed) other).wasPPSetAsDefault;
        }

        public final com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Completed copy(boolean wasPPSetAsDefault) {
            return new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Completed(wasPPSetAsDefault);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getWasPPSetAsDefault() {
            return this.wasPPSetAsDefault;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Completed copy$default(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Completed completed, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = completed.wasPPSetAsDefault;
            }
            return completed.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseDefaultPaymentAppResult$Skipped;", "Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseDefaultPaymentAppResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Skipped implements com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Skipped INSTANCE = new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Skipped();

        public final int hashCode() {
            return -1889450664;
        }

        private Skipped() {
        }

        public final java.lang.String toString() {
            return "Skipped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Skipped)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseDefaultPaymentAppResult$Closed;", "Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseDefaultPaymentAppResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Closed implements com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Closed INSTANCE = new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Closed();

        public final int hashCode() {
            return 174825028;
        }

        private Closed() {
        }

        public final java.lang.String toString() {
            return "Closed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Closed)) {
                return false;
            }
            return true;
        }
    }
}
