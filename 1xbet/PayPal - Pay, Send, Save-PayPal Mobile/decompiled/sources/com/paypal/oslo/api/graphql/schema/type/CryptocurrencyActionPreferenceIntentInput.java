package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionPreferenceIntentInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionType;", "intent", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionType;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionType;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionType;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionPreferenceIntentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionType;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencyActionPreferenceIntentInput {
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType intent;

    public CryptocurrencyActionPreferenceIntentInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType cryptocurrencyActionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyActionType, "");
        this.intent = cryptocurrencyActionType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType getIntent() {
        return this.intent;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType cryptocurrencyActionType = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyActionPreferenceIntentInput(intent=");
        sb.append(cryptocurrencyActionType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceIntentInput) && this.intent == ((com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceIntentInput) other).intent;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceIntentInput copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceIntentInput(intent);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType getIntent() {
        return this.intent;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceIntentInput copy$default(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceIntentInput cryptocurrencyActionPreferenceIntentInput, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType cryptocurrencyActionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencyActionType = cryptocurrencyActionPreferenceIntentInput.intent;
        }
        return cryptocurrencyActionPreferenceIntentInput.copy(cryptocurrencyActionType);
    }
}
