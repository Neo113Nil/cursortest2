package com.paypal.oslo.api.graphql.shared.fragment;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "expiresInSec", "", "expiresAtTime", "<init>", "(Ljava/lang/String;ILjava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;ILjava/lang/Object;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getToken", com.visa.cbp.getEncExpo.warmup, "getExpiresInSec", "Ljava/lang/Object;", "getExpiresAtTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AuthenticationTokenFragment implements com.apollographql.apollo.api.Fragment.Data {
    private final java.lang.Object expiresAtTime;
    private final int expiresInSec;
    private final java.lang.String token;

    public AuthenticationTokenFragment(java.lang.String str, int i, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.token = str;
        this.expiresInSec = i;
        this.expiresAtTime = obj;
    }

    public final java.lang.String getToken() {
        return this.token;
    }

    public final int getExpiresInSec() {
        return this.expiresInSec;
    }

    public final java.lang.Object getExpiresAtTime() {
        return this.expiresAtTime;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.token;
        int i = this.expiresInSec;
        java.lang.Object obj = this.expiresAtTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationTokenFragment(token=");
        sb.append(str);
        sb.append(", expiresInSec=");
        sb.append(i);
        sb.append(", expiresAtTime=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.token.hashCode() * 31) + java.lang.Integer.hashCode(this.expiresInSec)) * 31) + this.expiresAtTime.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment)) {
            return false;
        }
        com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment = (com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.token, authenticationTokenFragment.token) && this.expiresInSec == authenticationTokenFragment.expiresInSec && kotlin.jvm.internal.Intrinsics.areEqual(this.expiresAtTime, authenticationTokenFragment.expiresAtTime);
    }

    public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment copy(java.lang.String token, int expiresInSec, java.lang.Object expiresAtTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiresAtTime, "");
        return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment(token, expiresInSec, expiresAtTime);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getExpiresAtTime() {
        return this.expiresAtTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExpiresInSec() {
        return this.expiresInSec;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment copy$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment, java.lang.String str, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        if ((i2 & 1) != 0) {
            str = authenticationTokenFragment.token;
        }
        if ((i2 & 2) != 0) {
            i = authenticationTokenFragment.expiresInSec;
        }
        if ((i2 & 4) != 0) {
            obj = authenticationTokenFragment.expiresAtTime;
        }
        return authenticationTokenFragment.copy(str, i, obj);
    }
}
