package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect;", "", "OnPayment", "OnSuccess", "OnFailure", "OnCancelled", "LaunchSDK", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$LaunchSDK;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$OnCancelled;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$OnFailure;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$OnPayment;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$OnSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface TapToPayProgressUiEffect {

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$OnPayment;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;", "paymentRequest", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "paymentPayload", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$OnPayment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;", "getPaymentRequest", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "getPaymentPayload"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPayment implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload paymentPayload;
        private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest;

        public OnPayment(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload tapToPayPayload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayPayload, "");
            this.paymentRequest = paymentRequest;
            this.paymentPayload = tapToPayPayload;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest getPaymentRequest() {
            return this.paymentRequest;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload getPaymentPayload() {
            return this.paymentPayload;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest = this.paymentRequest;
            com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload tapToPayPayload = this.paymentPayload;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPayment(paymentRequest=");
            sb.append(paymentRequest);
            sb.append(", paymentPayload=");
            sb.append(tapToPayPayload);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.paymentRequest.hashCode() * 31) + this.paymentPayload.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnPayment)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnPayment onPayment = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentRequest, onPayment.paymentRequest) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentPayload, onPayment.paymentPayload);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnPayment copy(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload paymentPayload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPayload, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnPayment(paymentRequest, paymentPayload);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload getPaymentPayload() {
            return this.paymentPayload;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest getPaymentRequest() {
            return this.paymentRequest;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnPayment copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnPayment onPayment, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload tapToPayPayload, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentRequest = onPayment.paymentRequest;
            }
            if ((i & 2) != 0) {
                tapToPayPayload = onPayment.paymentPayload;
            }
            return onPayment.copy(paymentRequest, tapToPayPayload);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$OnSuccess;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;", "paymentRequest", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "paymentPayload", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$OnSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;", "getPaymentRequest", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "getPaymentPayload"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSuccess implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload paymentPayload;
        private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest;

        public OnSuccess(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload tapToPayPayload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayPayload, "");
            this.paymentRequest = paymentRequest;
            this.paymentPayload = tapToPayPayload;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest getPaymentRequest() {
            return this.paymentRequest;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload getPaymentPayload() {
            return this.paymentPayload;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest = this.paymentRequest;
            com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload tapToPayPayload = this.paymentPayload;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSuccess(paymentRequest=");
            sb.append(paymentRequest);
            sb.append(", paymentPayload=");
            sb.append(tapToPayPayload);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.paymentRequest.hashCode() * 31) + this.paymentPayload.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnSuccess onSuccess = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentRequest, onSuccess.paymentRequest) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentPayload, onSuccess.paymentPayload);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnSuccess copy(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload paymentPayload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPayload, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnSuccess(paymentRequest, paymentPayload);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload getPaymentPayload() {
            return this.paymentPayload;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest getPaymentRequest() {
            return this.paymentRequest;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnSuccess copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnSuccess onSuccess, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload tapToPayPayload, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentRequest = onSuccess.paymentRequest;
            }
            if ((i & 2) != 0) {
                tapToPayPayload = onSuccess.paymentPayload;
            }
            return onSuccess.copy(paymentRequest, tapToPayPayload);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$OnFailure;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;", "type", "", "reason", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$OnFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;", "getType", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFailure implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect {
        public static final int $stable = 0;
        private final java.lang.String reason;
        private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType type;

        public OnFailure(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureType, "");
            this.type = failureType;
            this.reason = str;
        }

        public /* synthetic */ OnFailure(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.GENERIC_FAILURE : failureType, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType getType() {
            return this.type;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType = this.type;
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFailure(type=");
            sb.append(failureType);
            sb.append(", reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode();
            java.lang.String str = this.reason;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure onFailure = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure) other;
            return this.type == onFailure.type && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, onFailure.reason);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure copy(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType type, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure(type, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure onFailure, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                failureType = onFailure.type;
            }
            if ((i & 2) != 0) {
                str = onFailure.reason;
            }
            return onFailure.copy(failureType, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OnFailure() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$OnCancelled;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCancelled implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnCancelled INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnCancelled();

        public final int hashCode() {
            return -757464975;
        }

        private OnCancelled() {
        }

        public final java.lang.String toString() {
            return "OnCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$LaunchSDK;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect;", "", "amount", "", "referenceID", "<init>", "(JLjava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect$LaunchSDK;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "J", "getAmount", "Ljava/lang/String;", "getReferenceID"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LaunchSDK implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect {
        public static final int $stable = 0;
        private final long amount;
        private final java.lang.String referenceID;

        public LaunchSDK(long j, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = j;
            this.referenceID = str;
        }

        public final long getAmount() {
            return this.amount;
        }

        public final java.lang.String getReferenceID() {
            return this.referenceID;
        }

        public final java.lang.String toString() {
            long j = this.amount;
            java.lang.String str = this.referenceID;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LaunchSDK(amount=");
            sb.append(j);
            sb.append(", referenceID=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.amount) * 31) + this.referenceID.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.LaunchSDK)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.LaunchSDK launchSDK = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.LaunchSDK) other;
            return this.amount == launchSDK.amount && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceID, launchSDK.referenceID);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.LaunchSDK copy(long amount, java.lang.String referenceID) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceID, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.LaunchSDK(amount, referenceID);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReferenceID() {
            return this.referenceID;
        }

        /* renamed from: component1, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.LaunchSDK copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.LaunchSDK launchSDK, long j, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = launchSDK.amount;
            }
            if ((i & 2) != 0) {
                str = launchSDK.referenceID;
            }
            return launchSDK.copy(j, str);
        }
    }
}
