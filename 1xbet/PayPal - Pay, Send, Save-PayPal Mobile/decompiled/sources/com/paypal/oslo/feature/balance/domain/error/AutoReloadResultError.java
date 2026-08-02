package com.paypal.oslo.feature.balance.domain.error;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadResultError;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;", "Lcom/paypal/oslo/feature/balance/graphql/type/BalanceAutoReloadOperationStatus;", "operationStatus", "", "errorCode", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadResultError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;", "getOperationStatus", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoReloadResultError {
    public static final int $stable = 0;
    private final java.lang.String errorCode;
    private final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus operationStatus;

    public AutoReloadResultError(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus, java.lang.String str) {
        this.operationStatus = balanceAutoReloadOperationStatus;
        this.errorCode = str;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus getOperationStatus() {
        return this.operationStatus;
    }

    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus = this.operationStatus;
        java.lang.String str = this.errorCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadResultError(operationStatus=");
        sb.append(balanceAutoReloadOperationStatus);
        sb.append(", errorCode=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus = this.operationStatus;
        int hashCode = balanceAutoReloadOperationStatus == null ? 0 : balanceAutoReloadOperationStatus.hashCode();
        java.lang.String str = this.errorCode;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.error.AutoReloadResultError)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.error.AutoReloadResultError autoReloadResultError = (com.paypal.oslo.feature.balance.domain.error.AutoReloadResultError) other;
        return this.operationStatus == autoReloadResultError.operationStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, autoReloadResultError.errorCode);
    }

    public final com.paypal.oslo.feature.balance.domain.error.AutoReloadResultError copy(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus operationStatus, java.lang.String errorCode) {
        return new com.paypal.oslo.feature.balance.domain.error.AutoReloadResultError(operationStatus, errorCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus getOperationStatus() {
        return this.operationStatus;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.error.AutoReloadResultError copy$default(com.paypal.oslo.feature.balance.domain.error.AutoReloadResultError autoReloadResultError, com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            balanceAutoReloadOperationStatus = autoReloadResultError.operationStatus;
        }
        if ((i & 2) != 0) {
            str = autoReloadResultError.errorCode;
        }
        return autoReloadResultError.copy(balanceAutoReloadOperationStatus, str);
    }
}
