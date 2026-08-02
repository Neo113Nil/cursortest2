package com.paypal.oslo.feature.identity.passwordrecovery.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordOutput;", "", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "correlationId", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordOutput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "getToken", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreatePasswordOutput {
    public static final int $stable = 0;
    private final java.lang.String correlationId;
    private final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken token;

    public CreatePasswordOutput(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.lang.String str) {
        this.token = userAccessToken;
        this.correlationId = str;
    }

    public final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken getToken() {
        return this.token;
    }

    public final java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken = this.token;
        java.lang.String str = this.correlationId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreatePasswordOutput(token=");
        sb.append(userAccessToken);
        sb.append(", correlationId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken = this.token;
        int hashCode = userAccessToken == null ? 0 : userAccessToken.hashCode();
        java.lang.String str = this.correlationId;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput createPasswordOutput = (com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.token, createPasswordOutput.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, createPasswordOutput.correlationId);
    }

    public final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput copy(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken token, java.lang.String correlationId) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput(token, correlationId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken getToken() {
        return this.token;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput copy$default(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput createPasswordOutput, com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            userAccessToken = createPasswordOutput.token;
        }
        if ((i & 2) != 0) {
            str = createPasswordOutput.correlationId;
        }
        return createPasswordOutput.copy(userAccessToken, str);
    }
}
