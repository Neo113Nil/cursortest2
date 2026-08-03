package com.facebook.appevents;

/* compiled from: AccessTokenAppIdPair.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0002R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/AccessTokenAppIdPair;", "Ljava/io/Serializable;", "accessToken", "Lcom/facebook/AccessToken;", "(Lcom/facebook/AccessToken;)V", "accessTokenString", "", "applicationId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccessTokenString", "()Ljava/lang/String;", "getApplicationId", "equals", "", "o", "", "hashCode", "", "writeReplace", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "SerializationProxyV1", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AccessTokenAppIdPair implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final java.lang.String accessTokenString;
    private final java.lang.String applicationId;

    public AccessTokenAppIdPair(java.lang.String str, java.lang.String applicationId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.applicationId = applicationId;
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        this.accessTokenString = com.facebook.internal.Utility.isNullOrEmpty(str) ? null : str;
    }

    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    public final java.lang.String getAccessTokenString() {
        return this.accessTokenString;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessTokenAppIdPair(com.facebook.AccessToken accessToken) {
        this(r2, com.facebook.FacebookSdk.getApplicationId());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        java.lang.String token = accessToken.getToken();
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
    }

    public int hashCode() {
        java.lang.String str = this.accessTokenString;
        return (str == null ? 0 : str.hashCode()) ^ this.applicationId.hashCode();
    }

    public boolean equals(java.lang.Object o) {
        if (!(o instanceof com.facebook.appevents.AccessTokenAppIdPair)) {
            return false;
        }
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.appevents.AccessTokenAppIdPair accessTokenAppIdPair = (com.facebook.appevents.AccessTokenAppIdPair) o;
        if (!com.facebook.internal.Utility.areObjectsEqual(accessTokenAppIdPair.accessTokenString, this.accessTokenString)) {
            return false;
        }
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        return com.facebook.internal.Utility.areObjectsEqual(accessTokenAppIdPair.applicationId, this.applicationId);
    }

    /* compiled from: AccessTokenAppIdPair.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/appevents/AccessTokenAppIdPair$SerializationProxyV1;", "Ljava/io/Serializable;", "accessTokenString", "", com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "(Ljava/lang/String;Ljava/lang/String;)V", "readResolve", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SerializationProxyV1 implements java.io.Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        private final java.lang.String accessTokenString;
        private final java.lang.String appId;

        public SerializationProxyV1(java.lang.String str, java.lang.String appId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
            this.accessTokenString = str;
            this.appId = appId;
        }

        private final java.lang.Object readResolve() throws java.io.ObjectStreamException {
            return new com.facebook.appevents.AccessTokenAppIdPair(this.accessTokenString, this.appId);
        }
    }

    private final java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return new com.facebook.appevents.AccessTokenAppIdPair.SerializationProxyV1(this.accessTokenString, this.applicationId);
    }
}
