package com.facebook.login;

/* compiled from: LoginResult.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/facebook/login/LoginResult;", "", "accessToken", "Lcom/facebook/AccessToken;", "authenticationToken", "Lcom/facebook/AuthenticationToken;", "recentlyGrantedPermissions", "", "", "recentlyDeniedPermissions", "(Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Ljava/util/Set;Ljava/util/Set;)V", "getAccessToken", "()Lcom/facebook/AccessToken;", "getAuthenticationToken", "()Lcom/facebook/AuthenticationToken;", "getRecentlyDeniedPermissions", "()Ljava/util/Set;", "getRecentlyGrantedPermissions", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LoginResult {
    private final com.facebook.AccessToken accessToken;
    private final com.facebook.AuthenticationToken authenticationToken;
    private final java.util.Set<java.lang.String> recentlyDeniedPermissions;
    private final java.util.Set<java.lang.String> recentlyGrantedPermissions;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginResult(com.facebook.AccessToken accessToken, java.util.Set<java.lang.String> recentlyGrantedPermissions, java.util.Set<java.lang.String> recentlyDeniedPermissions) {
        this(accessToken, null, recentlyGrantedPermissions, recentlyDeniedPermissions, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.facebook.login.LoginResult copy$default(com.facebook.login.LoginResult loginResult, com.facebook.AccessToken accessToken, com.facebook.AuthenticationToken authenticationToken, java.util.Set set, java.util.Set set2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            accessToken = loginResult.accessToken;
        }
        if ((i & 2) != 0) {
            authenticationToken = loginResult.authenticationToken;
        }
        if ((i & 4) != 0) {
            set = loginResult.recentlyGrantedPermissions;
        }
        if ((i & 8) != 0) {
            set2 = loginResult.recentlyDeniedPermissions;
        }
        return loginResult.copy(accessToken, authenticationToken, set, set2);
    }

    /* renamed from: component1, reason: from getter */
    public final com.facebook.AccessToken getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final com.facebook.AuthenticationToken getAuthenticationToken() {
        return this.authenticationToken;
    }

    public final java.util.Set<java.lang.String> component3() {
        return this.recentlyGrantedPermissions;
    }

    public final java.util.Set<java.lang.String> component4() {
        return this.recentlyDeniedPermissions;
    }

    public final com.facebook.login.LoginResult copy(com.facebook.AccessToken accessToken, com.facebook.AuthenticationToken authenticationToken, java.util.Set<java.lang.String> recentlyGrantedPermissions, java.util.Set<java.lang.String> recentlyDeniedPermissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        return new com.facebook.login.LoginResult(accessToken, authenticationToken, recentlyGrantedPermissions, recentlyDeniedPermissions);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.facebook.login.LoginResult)) {
            return false;
        }
        com.facebook.login.LoginResult loginResult = (com.facebook.login.LoginResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.accessToken, loginResult.accessToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationToken, loginResult.authenticationToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.recentlyGrantedPermissions, loginResult.recentlyGrantedPermissions) && kotlin.jvm.internal.Intrinsics.areEqual(this.recentlyDeniedPermissions, loginResult.recentlyDeniedPermissions);
    }

    public int hashCode() {
        int hashCode = this.accessToken.hashCode() * 31;
        com.facebook.AuthenticationToken authenticationToken = this.authenticationToken;
        return ((((hashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31) + this.recentlyGrantedPermissions.hashCode()) * 31) + this.recentlyDeniedPermissions.hashCode();
    }

    public java.lang.String toString() {
        return "LoginResult(accessToken=" + this.accessToken + ", authenticationToken=" + this.authenticationToken + ", recentlyGrantedPermissions=" + this.recentlyGrantedPermissions + ", recentlyDeniedPermissions=" + this.recentlyDeniedPermissions + ')';
    }

    public LoginResult(com.facebook.AccessToken accessToken, com.facebook.AuthenticationToken authenticationToken, java.util.Set<java.lang.String> recentlyGrantedPermissions, java.util.Set<java.lang.String> recentlyDeniedPermissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.accessToken = accessToken;
        this.authenticationToken = authenticationToken;
        this.recentlyGrantedPermissions = recentlyGrantedPermissions;
        this.recentlyDeniedPermissions = recentlyDeniedPermissions;
    }

    public /* synthetic */ LoginResult(com.facebook.AccessToken accessToken, com.facebook.AuthenticationToken authenticationToken, java.util.Set set, java.util.Set set2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(accessToken, (i & 2) != 0 ? null : authenticationToken, set, set2);
    }

    public final com.facebook.AccessToken getAccessToken() {
        return this.accessToken;
    }

    public final com.facebook.AuthenticationToken getAuthenticationToken() {
        return this.authenticationToken;
    }

    public final java.util.Set<java.lang.String> getRecentlyGrantedPermissions() {
        return this.recentlyGrantedPermissions;
    }

    public final java.util.Set<java.lang.String> getRecentlyDeniedPermissions() {
        return this.recentlyDeniedPermissions;
    }
}
