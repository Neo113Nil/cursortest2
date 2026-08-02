package com.paypal.oslo.feature.identity.logout.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/logout/domain/model/LogoutResult;", "", "", "success", "", "message", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/identity/logout/domain/model/LogoutResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getSuccess", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LogoutResult {
    public static final int $stable = 0;
    private final java.lang.String message;
    private final boolean success;

    public LogoutResult(boolean z, java.lang.String str) {
        this.success = z;
        this.message = str;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String toString() {
        boolean z = this.success;
        java.lang.String str = this.message;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogoutResult(success=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.success);
        java.lang.String str = this.message;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.logout.domain.model.LogoutResult)) {
            return false;
        }
        com.paypal.oslo.feature.identity.logout.domain.model.LogoutResult logoutResult = (com.paypal.oslo.feature.identity.logout.domain.model.LogoutResult) other;
        return this.success == logoutResult.success && kotlin.jvm.internal.Intrinsics.areEqual(this.message, logoutResult.message);
    }

    public final com.paypal.oslo.feature.identity.logout.domain.model.LogoutResult copy(boolean success, java.lang.String message) {
        return new com.paypal.oslo.feature.identity.logout.domain.model.LogoutResult(success, message);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.logout.domain.model.LogoutResult copy$default(com.paypal.oslo.feature.identity.logout.domain.model.LogoutResult logoutResult, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = logoutResult.success;
        }
        if ((i & 2) != 0) {
            str = logoutResult.message;
        }
        return logoutResult.copy(z, str);
    }
}
