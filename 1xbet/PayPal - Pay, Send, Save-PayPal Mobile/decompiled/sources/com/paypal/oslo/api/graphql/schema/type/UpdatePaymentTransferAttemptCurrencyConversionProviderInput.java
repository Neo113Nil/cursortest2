package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptCurrencyConversionProviderInput;", "", "paymentTransferAttemptId", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_PLAN_ID, "Lcom/paypal/oslo/api/graphql/schema/type/CurrencyConversionProvider;", "currencyConversionProvider", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CurrencyConversionProvider;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CurrencyConversionProvider;", "copy", "(Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CurrencyConversionProvider;)Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptCurrencyConversionProviderInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getPaymentTransferAttemptId", "Ljava/lang/String;", "getPaymentPlanId", "Lcom/paypal/oslo/api/graphql/schema/type/CurrencyConversionProvider;", "getCurrencyConversionProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatePaymentTransferAttemptCurrencyConversionProviderInput {
    private final com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider currencyConversionProvider;
    private final java.lang.String paymentPlanId;
    private final java.lang.Object paymentTransferAttemptId;

    public UpdatePaymentTransferAttemptCurrencyConversionProviderInput(java.lang.Object obj, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider currencyConversionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyConversionProvider, "");
        this.paymentTransferAttemptId = obj;
        this.paymentPlanId = str;
        this.currencyConversionProvider = currencyConversionProvider;
    }

    public final java.lang.Object getPaymentTransferAttemptId() {
        return this.paymentTransferAttemptId;
    }

    public final java.lang.String getPaymentPlanId() {
        return this.paymentPlanId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider getCurrencyConversionProvider() {
        return this.currencyConversionProvider;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.paymentTransferAttemptId;
        java.lang.String str = this.paymentPlanId;
        com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider currencyConversionProvider = this.currencyConversionProvider;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePaymentTransferAttemptCurrencyConversionProviderInput(paymentTransferAttemptId=");
        sb.append(obj);
        sb.append(", paymentPlanId=");
        sb.append(str);
        sb.append(", currencyConversionProvider=");
        sb.append(currencyConversionProvider);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.paymentTransferAttemptId.hashCode() * 31) + this.paymentPlanId.hashCode()) * 31) + this.currencyConversionProvider.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput updatePaymentTransferAttemptCurrencyConversionProviderInput = (com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTransferAttemptId, updatePaymentTransferAttemptCurrencyConversionProviderInput.paymentTransferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentPlanId, updatePaymentTransferAttemptCurrencyConversionProviderInput.paymentPlanId) && this.currencyConversionProvider == updatePaymentTransferAttemptCurrencyConversionProviderInput.currencyConversionProvider;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput copy(java.lang.Object paymentTransferAttemptId, java.lang.String paymentPlanId, com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider currencyConversionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPlanId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyConversionProvider, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput(paymentTransferAttemptId, paymentPlanId, currencyConversionProvider);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider getCurrencyConversionProvider() {
        return this.currencyConversionProvider;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPaymentPlanId() {
        return this.paymentPlanId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getPaymentTransferAttemptId() {
        return this.paymentTransferAttemptId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput updatePaymentTransferAttemptCurrencyConversionProviderInput, java.lang.Object obj, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider currencyConversionProvider, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = updatePaymentTransferAttemptCurrencyConversionProviderInput.paymentTransferAttemptId;
        }
        if ((i & 2) != 0) {
            str = updatePaymentTransferAttemptCurrencyConversionProviderInput.paymentPlanId;
        }
        if ((i & 4) != 0) {
            currencyConversionProvider = updatePaymentTransferAttemptCurrencyConversionProviderInput.currencyConversionProvider;
        }
        return updatePaymentTransferAttemptCurrencyConversionProviderInput.copy(obj, str, currencyConversionProvider);
    }
}
