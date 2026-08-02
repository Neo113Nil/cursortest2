package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayStatusResponse;", "", "<init>", "()V", "Enabled", "Disabled", "Error", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayStatusResponse$Disabled;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayStatusResponse$Enabled;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayStatusResponse$Error;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AutopayStatusResponse {
    public static final int $stable = 0;

    private AutopayStatusResponse() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayStatusResponse$Enabled;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayStatusResponse;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse;", "method", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayStatusResponse$Enabled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse;", "getMethod"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Enabled extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enabled(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse autopayMethodResponse) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayMethodResponse, "");
            this.method = autopayMethodResponse;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse getMethod() {
            return this.method;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse autopayMethodResponse = this.method;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Enabled(method=");
            sb.append(autopayMethodResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.method.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse.Enabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.method, ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse.Enabled) other).method);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse.Enabled copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse method) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse.Enabled(method);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse getMethod() {
            return this.method;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse.Enabled copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse.Enabled enabled, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse autopayMethodResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autopayMethodResponse = enabled.method;
            }
            return enabled.copy(autopayMethodResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayStatusResponse$Disabled;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayStatusResponse;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Disabled extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse.Disabled INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse.Disabled();

        public final int hashCode() {
            return -1175378661;
        }

        private Disabled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Disabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse.Disabled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayStatusResponse$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayStatusResponse;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse.Error INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse.Error();

        public final int hashCode() {
            return 163054537;
        }

        private Error() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayStatusResponse.Error)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AutopayStatusResponse(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
