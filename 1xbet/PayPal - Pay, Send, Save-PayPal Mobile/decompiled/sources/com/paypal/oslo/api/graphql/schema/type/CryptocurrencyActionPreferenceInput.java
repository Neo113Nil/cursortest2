package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionPreferenceInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;", "status", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionType;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionType;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionPreferenceInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionType;", "getActionType", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencyActionPreferenceInput {
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType actionType;
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus status;

    public CryptocurrencyActionPreferenceInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType cryptocurrencyActionType, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus cryptocurrencyPreferenceStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyActionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyPreferenceStatus, "");
        this.actionType = cryptocurrencyActionType;
        this.status = cryptocurrencyPreferenceStatus;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType getActionType() {
        return this.actionType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType cryptocurrencyActionType = this.actionType;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus cryptocurrencyPreferenceStatus = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyActionPreferenceInput(actionType=");
        sb.append(cryptocurrencyActionType);
        sb.append(", status=");
        sb.append(cryptocurrencyPreferenceStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.actionType.hashCode() * 31) + this.status.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput cryptocurrencyActionPreferenceInput = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput) other;
        return this.actionType == cryptocurrencyActionPreferenceInput.actionType && this.status == cryptocurrencyActionPreferenceInput.status;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType actionType, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput(actionType, status);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType getActionType() {
        return this.actionType;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput copy$default(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput cryptocurrencyActionPreferenceInput, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionType cryptocurrencyActionType, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus cryptocurrencyPreferenceStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencyActionType = cryptocurrencyActionPreferenceInput.actionType;
        }
        if ((i & 2) != 0) {
            cryptocurrencyPreferenceStatus = cryptocurrencyActionPreferenceInput.status;
        }
        return cryptocurrencyActionPreferenceInput.copy(cryptocurrencyActionType, cryptocurrencyPreferenceStatus);
    }
}
