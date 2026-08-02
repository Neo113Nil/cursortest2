package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OneTimePasswordAuthenticationInput;", "", "", "challengeId", "code", "Lcom/paypal/oslo/api/graphql/schema/type/OneTimePasswordMethod;", "method", "nonce", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/OneTimePasswordMethod;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/OneTimePasswordMethod;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/OneTimePasswordMethod;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/OneTimePasswordAuthenticationInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallengeId", "getCode", "Lcom/paypal/oslo/api/graphql/schema/type/OneTimePasswordMethod;", "getMethod", "getNonce"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OneTimePasswordAuthenticationInput {
    private final java.lang.String challengeId;
    private final java.lang.String code;
    private final com.paypal.oslo.api.graphql.schema.type.OneTimePasswordMethod method;
    private final java.lang.String nonce;

    public OneTimePasswordAuthenticationInput(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.OneTimePasswordMethod oneTimePasswordMethod, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneTimePasswordMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.challengeId = str;
        this.code = str2;
        this.method = oneTimePasswordMethod;
        this.nonce = str3;
    }

    public final java.lang.String getChallengeId() {
        return this.challengeId;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OneTimePasswordMethod getMethod() {
        return this.method;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.challengeId;
        java.lang.String str2 = this.code;
        com.paypal.oslo.api.graphql.schema.type.OneTimePasswordMethod oneTimePasswordMethod = this.method;
        java.lang.String str3 = this.nonce;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OneTimePasswordAuthenticationInput(challengeId=");
        sb.append(str);
        sb.append(", code=");
        sb.append(str2);
        sb.append(", method=");
        sb.append(oneTimePasswordMethod);
        sb.append(", nonce=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.challengeId.hashCode() * 31) + this.code.hashCode()) * 31) + this.method.hashCode()) * 31) + this.nonce.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OneTimePasswordAuthenticationInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OneTimePasswordAuthenticationInput oneTimePasswordAuthenticationInput = (com.paypal.oslo.api.graphql.schema.type.OneTimePasswordAuthenticationInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, oneTimePasswordAuthenticationInput.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, oneTimePasswordAuthenticationInput.code) && this.method == oneTimePasswordAuthenticationInput.method && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, oneTimePasswordAuthenticationInput.nonce);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OneTimePasswordAuthenticationInput copy(java.lang.String challengeId, java.lang.String code, com.paypal.oslo.api.graphql.schema.type.OneTimePasswordMethod method, java.lang.String nonce) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
        return new com.paypal.oslo.api.graphql.schema.type.OneTimePasswordAuthenticationInput(challengeId, code, method, nonce);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getNonce() {
        return this.nonce;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OneTimePasswordMethod getMethod() {
        return this.method;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getChallengeId() {
        return this.challengeId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OneTimePasswordAuthenticationInput copy$default(com.paypal.oslo.api.graphql.schema.type.OneTimePasswordAuthenticationInput oneTimePasswordAuthenticationInput, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.OneTimePasswordMethod oneTimePasswordMethod, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = oneTimePasswordAuthenticationInput.challengeId;
        }
        if ((i & 2) != 0) {
            str2 = oneTimePasswordAuthenticationInput.code;
        }
        if ((i & 4) != 0) {
            oneTimePasswordMethod = oneTimePasswordAuthenticationInput.method;
        }
        if ((i & 8) != 0) {
            str3 = oneTimePasswordAuthenticationInput.nonce;
        }
        return oneTimePasswordAuthenticationInput.copy(str, str2, oneTimePasswordMethod, str3);
    }
}
