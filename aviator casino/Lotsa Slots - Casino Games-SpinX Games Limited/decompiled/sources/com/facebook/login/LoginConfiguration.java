package com.facebook.login;

/* compiled from: LoginConfiguration.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB!\b\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006B+\b\u0016\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/facebook/login/LoginConfiguration;", "", "permissions", "", "", "nonce", "(Ljava/util/Collection;Ljava/lang/String;)V", "codeVerifier", "(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V", "getCodeVerifier", "()Ljava/lang/String;", "getNonce", "", "getPermissions", "()Ljava/util/Set;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LoginConfiguration {
    public static final java.lang.String OPENID = "openid";
    private final java.lang.String codeVerifier;
    private final java.lang.String nonce;
    private final java.util.Set<java.lang.String> permissions;

    /* JADX WARN: Multi-variable type inference failed */
    public LoginConfiguration(java.util.Collection<java.lang.String> collection) {
        this(collection, null, 2, 0 == true ? 1 : 0);
    }

    public final java.util.Set<java.lang.String> getPermissions() {
        return this.permissions;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final java.lang.String getCodeVerifier() {
        return this.codeVerifier;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LoginConfiguration(java.util.Collection collection, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, str);
        if ((i & 2) != 0) {
            str = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginConfiguration(java.util.Collection<java.lang.String> collection, java.lang.String nonce) {
        this(collection, nonce, com.facebook.login.PKCEUtil.generateCodeVerifier());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        com.facebook.login.PKCEUtil pKCEUtil = com.facebook.login.PKCEUtil.INSTANCE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LoginConfiguration(java.util.Collection collection, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, str, str2);
        collection = (i & 1) != 0 ? null : collection;
        if ((i & 2) != 0) {
            str = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LoginConfiguration(java.util.Collection<java.lang.String> collection, java.lang.String nonce, java.lang.String codeVerifier) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        com.facebook.login.NonceUtil nonceUtil = com.facebook.login.NonceUtil.INSTANCE;
        if (com.facebook.login.NonceUtil.isValidNonce(nonce)) {
            com.facebook.login.PKCEUtil pKCEUtil = com.facebook.login.PKCEUtil.INSTANCE;
            if (com.facebook.login.PKCEUtil.isValidCodeVerifier(codeVerifier)) {
                z = true;
                if (z) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                java.util.HashSet hashSet = collection != null ? new java.util.HashSet(collection) : new java.util.HashSet();
                hashSet.add("openid");
                java.util.Set<java.lang.String> unmodifiableSet = java.util.Collections.unmodifiableSet(hashSet);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(permissions)");
                this.permissions = unmodifiableSet;
                this.nonce = nonce;
                this.codeVerifier = codeVerifier;
                return;
            }
        }
        z = false;
        if (z) {
        }
    }
}
