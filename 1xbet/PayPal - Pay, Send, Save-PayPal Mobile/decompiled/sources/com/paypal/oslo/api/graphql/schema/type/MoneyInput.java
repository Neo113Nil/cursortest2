package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MoneyInput {
    private final java.lang.Object currencyCode;
    private final java.lang.String value;

    public MoneyInput(java.lang.Object obj, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.currencyCode = obj;
        this.value = str;
    }

    public final java.lang.Object getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.currencyCode;
        java.lang.String str = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyInput(currencyCode=");
        sb.append(obj);
        sb.append(", value=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.MoneyInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput = (com.paypal.oslo.api.graphql.schema.type.MoneyInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, moneyInput.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, moneyInput.value);
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyInput copy(java.lang.Object currencyCode, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.paypal.oslo.api.graphql.schema.type.MoneyInput(currencyCode, value);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCurrencyCode() {
        return this.currencyCode;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MoneyInput copy$default(com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = moneyInput.currencyCode;
        }
        if ((i & 2) != 0) {
            str = moneyInput.value;
        }
        return moneyInput.copy(obj, str);
    }
}
