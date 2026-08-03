package com.facebook;

/* compiled from: AccessToken.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 E2\u00020\u0001:\u0003CDEB\u0089\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011B\u000f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0014\u0010.\u001a\u00020/2\n\u00100\u001a\u000601j\u0002`2H\u0002J\u001a\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u00105\u001a\u000206H\u0016J\u0013\u00107\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010:\u001a\u000206H\u0016J\r\u0010;\u001a\u00020<H\u0000¢\u0006\u0002\b=J\b\u0010>\u001a\u00020\u0003H\u0016J\b\u0010?\u001a\u00020\u0003H\u0002J\u0018\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020\u00132\u0006\u0010B\u001a\u000206H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0011\u0010#\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010%\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010(\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0016¨\u0006F"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "accessToken", "", "applicationId", "userId", "permissions", "", "declinedPermissions", "expiredPermissions", "accessTokenSource", "Lcom/facebook/AccessTokenSource;", "expirationTime", "Ljava/util/Date;", "lastRefreshTime", "dataAccessExpirationTime", "graphDomain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getApplicationId", "()Ljava/lang/String;", "getDataAccessExpirationTime", "()Ljava/util/Date;", "", "getDeclinedPermissions", "()Ljava/util/Set;", "getExpiredPermissions", "expires", "getExpires", "getGraphDomain", "isDataAccessExpired", "", "()Z", "isExpired", "isInstagramToken", "lastRefresh", "getLastRefresh", "getPermissions", "source", "getSource", "()Lcom/facebook/AccessTokenSource;", "token", "getToken", "getUserId", "appendPermissions", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "convertTokenSourceForGraphDomain", "tokenSource", "describeContents", "", "equals", "other", "", "hashCode", "toJSONObject", "Lorg/json/JSONObject;", "toJSONObject$facebook_core_release", "toString", "tokenToString", "writeToParcel", "dest", "flags", "AccessTokenCreationCallback", "AccessTokenRefreshCallback", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AccessToken implements android.os.Parcelable {
    public static final java.lang.String ACCESS_TOKEN_KEY = "access_token";
    private static final java.lang.String APPLICATION_ID_KEY = "application_id";
    public static final android.os.Parcelable.Creator<com.facebook.AccessToken> CREATOR;
    private static final int CURRENT_JSON_FORMAT = 1;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.AccessToken.Companion INSTANCE = new com.facebook.AccessToken.Companion(null);
    public static final java.lang.String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";
    private static final java.lang.String DECLINED_PERMISSIONS_KEY = "declined_permissions";
    private static final com.facebook.AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;
    private static final java.util.Date DEFAULT_EXPIRATION_TIME;
    public static final java.lang.String DEFAULT_GRAPH_DOMAIN = "facebook";
    private static final java.util.Date DEFAULT_LAST_REFRESH_TIME;
    private static final java.lang.String EXPIRED_PERMISSIONS_KEY = "expired_permissions";
    private static final java.lang.String EXPIRES_AT_KEY = "expires_at";
    public static final java.lang.String EXPIRES_IN_KEY = "expires_in";
    public static final java.lang.String GRAPH_DOMAIN = "graph_domain";
    private static final java.lang.String LAST_REFRESH_KEY = "last_refresh";
    private static final java.util.Date MAX_DATE;
    private static final java.lang.String PERMISSIONS_KEY = "permissions";
    private static final java.lang.String SOURCE_KEY = "source";
    private static final java.lang.String TOKEN_KEY = "token";
    public static final java.lang.String USER_ID_KEY = "user_id";
    private static final java.lang.String VERSION_KEY = "version";
    private final java.lang.String applicationId;
    private final java.util.Date dataAccessExpirationTime;
    private final java.util.Set<java.lang.String> declinedPermissions;
    private final java.util.Set<java.lang.String> expiredPermissions;
    private final java.util.Date expires;
    private final java.lang.String graphDomain;
    private final java.util.Date lastRefresh;
    private final java.util.Set<java.lang.String> permissions;
    private final com.facebook.AccessTokenSource source;
    private final java.lang.String token;
    private final java.lang.String userId;

    /* compiled from: AccessToken.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/facebook/AccessToken$AccessTokenCreationCallback;", "", "onError", "", "error", "Lcom/facebook/FacebookException;", "onSuccess", "token", "Lcom/facebook/AccessToken;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface AccessTokenCreationCallback {
        void onError(com.facebook.FacebookException error);

        void onSuccess(com.facebook.AccessToken token);
    }

    /* compiled from: AccessToken.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "", "OnTokenRefreshFailed", "", "exception", "Lcom/facebook/FacebookException;", "OnTokenRefreshed", "accessToken", "Lcom/facebook/AccessToken;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface AccessTokenRefreshCallback {
        void OnTokenRefreshFailed(com.facebook.FacebookException exception);

        void OnTokenRefreshed(com.facebook.AccessToken accessToken);
    }

    /* compiled from: AccessToken.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.AccessTokenSource.valuesCustom().length];
            iArr[com.facebook.AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[com.facebook.AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[com.facebook.AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessToken(java.lang.String accessToken, java.lang.String applicationId, java.lang.String userId, java.util.Collection<java.lang.String> collection, java.util.Collection<java.lang.String> collection2, java.util.Collection<java.lang.String> collection3, com.facebook.AccessTokenSource accessTokenSource, java.util.Date date, java.util.Date date2, java.util.Date date3) {
        this(accessToken, applicationId, userId, collection, collection2, collection3, accessTokenSource, date, date2, date3, null, 1024, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "userId");
    }

    @kotlin.jvm.JvmStatic
    public static final void createFromNativeLinkingIntent(android.content.Intent intent, java.lang.String str, com.facebook.AccessToken.AccessTokenCreationCallback accessTokenCreationCallback) {
        INSTANCE.createFromNativeLinkingIntent(intent, str, accessTokenCreationCallback);
    }

    @kotlin.jvm.JvmStatic
    public static final void expireCurrentAccessToken() {
        INSTANCE.expireCurrentAccessToken();
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.AccessToken getCurrentAccessToken() {
        return INSTANCE.getCurrentAccessToken();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isCurrentAccessTokenActive() {
        return INSTANCE.isCurrentAccessTokenActive();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isDataAccessActive() {
        return INSTANCE.isDataAccessActive();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isLoggedInWithInstagram() {
        return INSTANCE.isLoggedInWithInstagram();
    }

    @kotlin.jvm.JvmStatic
    public static final void refreshCurrentAccessTokenAsync() {
        INSTANCE.refreshCurrentAccessTokenAsync();
    }

    @kotlin.jvm.JvmStatic
    public static final void refreshCurrentAccessTokenAsync(com.facebook.AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        INSTANCE.refreshCurrentAccessTokenAsync(accessTokenRefreshCallback);
    }

    @kotlin.jvm.JvmStatic
    public static final void setCurrentAccessToken(com.facebook.AccessToken accessToken) {
        INSTANCE.setCurrentAccessToken(accessToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final java.util.Date getExpires() {
        return this.expires;
    }

    public final java.util.Set<java.lang.String> getPermissions() {
        return this.permissions;
    }

    public final java.util.Set<java.lang.String> getDeclinedPermissions() {
        return this.declinedPermissions;
    }

    public final java.util.Set<java.lang.String> getExpiredPermissions() {
        return this.expiredPermissions;
    }

    public final java.lang.String getToken() {
        return this.token;
    }

    public final com.facebook.AccessTokenSource getSource() {
        return this.source;
    }

    public final java.util.Date getLastRefresh() {
        return this.lastRefresh;
    }

    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    public final java.lang.String getUserId() {
        return this.userId;
    }

    public final java.util.Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    public final java.lang.String getGraphDomain() {
        return this.graphDomain;
    }

    public /* synthetic */ AccessToken(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Collection collection, java.util.Collection collection2, java.util.Collection collection3, com.facebook.AccessTokenSource accessTokenSource, java.util.Date date, java.util.Date date2, java.util.Date date3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (i & 1024) != 0 ? DEFAULT_GRAPH_DOMAIN : str4);
    }

    public AccessToken(java.lang.String accessToken, java.lang.String applicationId, java.lang.String userId, java.util.Collection<java.lang.String> collection, java.util.Collection<java.lang.String> collection2, java.util.Collection<java.lang.String> collection3, com.facebook.AccessTokenSource accessTokenSource, java.util.Date date, java.util.Date date2, java.util.Date date3, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "userId");
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(accessToken, "accessToken");
        com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(applicationId, "applicationId");
        com.facebook.internal.Validate validate3 = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(userId, "userId");
        this.expires = date == null ? DEFAULT_EXPIRATION_TIME : date;
        java.util.Set<java.lang.String> unmodifiableSet = java.util.Collections.unmodifiableSet(collection != null ? new java.util.HashSet(collection) : new java.util.HashSet());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.permissions = unmodifiableSet;
        java.util.Set<java.lang.String> unmodifiableSet2 = java.util.Collections.unmodifiableSet(collection2 != null ? new java.util.HashSet(collection2) : new java.util.HashSet());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.declinedPermissions = unmodifiableSet2;
        java.util.Set<java.lang.String> unmodifiableSet3 = java.util.Collections.unmodifiableSet(collection3 != null ? new java.util.HashSet(collection3) : new java.util.HashSet());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.expiredPermissions = unmodifiableSet3;
        this.token = accessToken;
        this.source = convertTokenSourceForGraphDomain(accessTokenSource == null ? DEFAULT_ACCESS_TOKEN_SOURCE : accessTokenSource, str);
        this.lastRefresh = date2 == null ? DEFAULT_LAST_REFRESH_TIME : date2;
        this.applicationId = applicationId;
        this.userId = userId;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? DEFAULT_EXPIRATION_TIME : date3;
        this.graphDomain = str == null ? DEFAULT_GRAPH_DOMAIN : str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("{AccessToken token:");
        sb.append(tokenToString());
        appendPermissions(sb);
        sb.append("}");
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.facebook.AccessToken)) {
            return false;
        }
        com.facebook.AccessToken accessToken = (com.facebook.AccessToken) other;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.expires, accessToken.expires) && kotlin.jvm.internal.Intrinsics.areEqual(this.permissions, accessToken.permissions) && kotlin.jvm.internal.Intrinsics.areEqual(this.declinedPermissions, accessToken.declinedPermissions) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiredPermissions, accessToken.expiredPermissions) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, accessToken.token) && this.source == accessToken.source && kotlin.jvm.internal.Intrinsics.areEqual(this.lastRefresh, accessToken.lastRefresh) && kotlin.jvm.internal.Intrinsics.areEqual(this.applicationId, accessToken.applicationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.userId, accessToken.userId) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            java.lang.String str = this.graphDomain;
            java.lang.String str2 = accessToken.graphDomain;
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.expires.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.expiredPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataAccessExpirationTime.hashCode()) * 31;
        java.lang.String str = this.graphDomain;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isExpired() {
        return new java.util.Date().after(this.expires);
    }

    public final boolean isDataAccessExpired() {
        return new java.util.Date().after(this.dataAccessExpirationTime);
    }

    public final boolean isInstagramToken() {
        java.lang.String str = this.graphDomain;
        return str != null && str.equals(com.facebook.FacebookSdk.INSTAGRAM);
    }

    public final org.json.JSONObject toJSONObject$facebook_core_release() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.token);
        jSONObject.put(EXPIRES_AT_KEY, this.expires.getTime());
        jSONObject.put("permissions", new org.json.JSONArray((java.util.Collection) this.permissions));
        jSONObject.put(DECLINED_PERMISSIONS_KEY, new org.json.JSONArray((java.util.Collection) this.declinedPermissions));
        jSONObject.put(EXPIRED_PERMISSIONS_KEY, new org.json.JSONArray((java.util.Collection) this.expiredPermissions));
        jSONObject.put(LAST_REFRESH_KEY, this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put(APPLICATION_ID_KEY, this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put(DATA_ACCESS_EXPIRATION_TIME, this.dataAccessExpirationTime.getTime());
        java.lang.String str = this.graphDomain;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    private final java.lang.String tokenToString() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.isLoggingBehaviorEnabled(com.facebook.LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
            return this.token;
        }
        return "ACCESS_TOKEN_REMOVED";
    }

    private final void appendPermissions(java.lang.StringBuilder builder) {
        builder.append(" permissions:");
        builder.append(com.ironsource.X3.j.d);
        builder.append(android.text.TextUtils.join(", ", this.permissions));
        builder.append(com.ironsource.X3.j.e);
    }

    private final com.facebook.AccessTokenSource convertTokenSourceForGraphDomain(com.facebook.AccessTokenSource tokenSource, java.lang.String graphDomain) {
        if (graphDomain == null || !graphDomain.equals(com.facebook.FacebookSdk.INSTAGRAM)) {
            return tokenSource;
        }
        int i = com.facebook.AccessToken.WhenMappings.$EnumSwitchMapping$0[tokenSource.ordinal()];
        if (i == 1) {
            return com.facebook.AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
        }
        if (i != 2) {
            return i != 3 ? tokenSource : com.facebook.AccessTokenSource.INSTAGRAM_WEB_VIEW;
        }
        return com.facebook.AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
    }

    public AccessToken(android.os.Parcel parcel) {
        com.facebook.AccessTokenSource accessTokenSource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.expires = new java.util.Date(parcel.readLong());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = arrayList;
        parcel.readStringList(arrayList2);
        java.util.ArrayList arrayList3 = arrayList;
        java.util.Set<java.lang.String> unmodifiableSet = java.util.Collections.unmodifiableSet(new java.util.HashSet(arrayList3));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.permissions = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList2);
        java.util.Set<java.lang.String> unmodifiableSet2 = java.util.Collections.unmodifiableSet(new java.util.HashSet(arrayList3));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.declinedPermissions = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList2);
        java.util.Set<java.lang.String> unmodifiableSet3 = java.util.Collections.unmodifiableSet(new java.util.HashSet(arrayList3));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.expiredPermissions = unmodifiableSet3;
        java.lang.String readString = parcel.readString();
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        this.token = com.facebook.internal.Validate.notNullOrEmpty(readString, "token");
        java.lang.String readString2 = parcel.readString();
        if (readString2 != null) {
            accessTokenSource = com.facebook.AccessTokenSource.valueOf(readString2);
        } else {
            accessTokenSource = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        this.source = accessTokenSource;
        this.lastRefresh = new java.util.Date(parcel.readLong());
        java.lang.String readString3 = parcel.readString();
        com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
        this.applicationId = com.facebook.internal.Validate.notNullOrEmpty(readString3, "applicationId");
        java.lang.String readString4 = parcel.readString();
        com.facebook.internal.Validate validate3 = com.facebook.internal.Validate.INSTANCE;
        this.userId = com.facebook.internal.Validate.notNullOrEmpty(readString4, "userId");
        this.dataAccessExpirationTime = new java.util.Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.expires.getTime());
        dest.writeStringList(new java.util.ArrayList(this.permissions));
        dest.writeStringList(new java.util.ArrayList(this.declinedPermissions));
        dest.writeStringList(new java.util.ArrayList(this.expiredPermissions));
        dest.writeString(this.token);
        dest.writeString(this.source.name());
        dest.writeLong(this.lastRefresh.getTime());
        dest.writeString(this.applicationId);
        dest.writeString(this.userId);
        dest.writeLong(this.dataAccessExpirationTime.getTime());
        dest.writeString(this.graphDomain);
    }

    /* compiled from: AccessToken.kt */
    @kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0000¢\u0006\u0002\b J<\u0010!\u001a\u0004\u0018\u00010\b2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0004H\u0002J\u0015\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,J\u0017\u0010-\u001a\u0004\u0018\u00010\b2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b.J \u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u0010(\u001a\u00020\u00042\u0006\u00103\u001a\u000204H\u0007J\u001f\u00105\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b6J\b\u00107\u001a\u000200H\u0007J\n\u00108\u001a\u0004\u0018\u00010\bH\u0007J'\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040#2\u0006\u0010$\u001a\u00020%2\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b;J\b\u0010<\u001a\u00020=H\u0007J\b\u0010>\u001a\u00020=H\u0007J\b\u0010?\u001a\u00020=H\u0007J\b\u0010@\u001a\u000200H\u0007J\u0012\u0010@\u001a\u0002002\b\u0010A\u001a\u0004\u0018\u00010BH\u0007J\u0012\u0010C\u001a\u0002002\b\u0010D\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/facebook/AccessToken$Companion;", "", "()V", "ACCESS_TOKEN_KEY", "", "APPLICATION_ID_KEY", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AccessToken;", "CURRENT_JSON_FORMAT", "", "DATA_ACCESS_EXPIRATION_TIME", "DECLINED_PERMISSIONS_KEY", "DEFAULT_ACCESS_TOKEN_SOURCE", "Lcom/facebook/AccessTokenSource;", "DEFAULT_EXPIRATION_TIME", "Ljava/util/Date;", "DEFAULT_GRAPH_DOMAIN", "DEFAULT_LAST_REFRESH_TIME", "EXPIRED_PERMISSIONS_KEY", "EXPIRES_AT_KEY", "EXPIRES_IN_KEY", "GRAPH_DOMAIN", "LAST_REFRESH_KEY", "MAX_DATE", "PERMISSIONS_KEY", "SOURCE_KEY", "TOKEN_KEY", "USER_ID_KEY", "VERSION_KEY", "createExpired", "current", "createExpired$facebook_core_release", "createFromBundle", "requestedPermissions", "", "bundle", "Landroid/os/Bundle;", "source", "expirationBase", "applicationId", "createFromJSONObject", "jsonObject", "Lorg/json/JSONObject;", "createFromJSONObject$facebook_core_release", "createFromLegacyCache", "createFromLegacyCache$facebook_core_release", "createFromNativeLinkingIntent", "", "intent", "Landroid/content/Intent;", "accessTokenCallback", "Lcom/facebook/AccessToken$AccessTokenCreationCallback;", "createFromRefresh", "createFromRefresh$facebook_core_release", "expireCurrentAccessToken", "getCurrentAccessToken", "getPermissionsFromBundle", com.ironsource.X3.i.W, "getPermissionsFromBundle$facebook_core_release", "isCurrentAccessTokenActive", "", "isDataAccessActive", "isLoggedInWithInstagram", "refreshCurrentAccessTokenAsync", "callback", "Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "setCurrentAccessToken", "accessToken", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.AccessToken getCurrentAccessToken() {
            return com.facebook.AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
        }

        @kotlin.jvm.JvmStatic
        public final void setCurrentAccessToken(com.facebook.AccessToken accessToken) {
            com.facebook.AccessTokenManager.INSTANCE.getInstance().setCurrentAccessToken(accessToken);
        }

        @kotlin.jvm.JvmStatic
        public final boolean isCurrentAccessTokenActive() {
            com.facebook.AccessToken currentAccessTokenField = com.facebook.AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            return (currentAccessTokenField == null || currentAccessTokenField.isExpired()) ? false : true;
        }

        @kotlin.jvm.JvmStatic
        public final boolean isDataAccessActive() {
            com.facebook.AccessToken currentAccessTokenField = com.facebook.AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            return (currentAccessTokenField == null || currentAccessTokenField.isDataAccessExpired()) ? false : true;
        }

        @kotlin.jvm.JvmStatic
        public final boolean isLoggedInWithInstagram() {
            com.facebook.AccessToken currentAccessTokenField = com.facebook.AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            return (currentAccessTokenField == null || currentAccessTokenField.isExpired() || !currentAccessTokenField.isInstagramToken()) ? false : true;
        }

        @kotlin.jvm.JvmStatic
        public final void expireCurrentAccessToken() {
            com.facebook.AccessToken currentAccessTokenField = com.facebook.AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            if (currentAccessTokenField != null) {
                setCurrentAccessToken(createExpired$facebook_core_release(currentAccessTokenField));
            }
        }

        @kotlin.jvm.JvmStatic
        public final void refreshCurrentAccessTokenAsync() {
            com.facebook.AccessTokenManager.INSTANCE.getInstance().refreshCurrentAccessToken(null);
        }

        @kotlin.jvm.JvmStatic
        public final void refreshCurrentAccessTokenAsync(com.facebook.AccessToken.AccessTokenRefreshCallback callback) {
            com.facebook.AccessTokenManager.INSTANCE.getInstance().refreshCurrentAccessToken(callback);
        }

        @kotlin.jvm.JvmStatic
        public final void createFromNativeLinkingIntent(android.content.Intent intent, final java.lang.String applicationId, final com.facebook.AccessToken.AccessTokenCreationCallback accessTokenCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenCallback, "accessTokenCallback");
            if (intent.getExtras() == null) {
                accessTokenCallback.onError(new com.facebook.FacebookException("No extras found on intent"));
                return;
            }
            final android.os.Bundle bundle = new android.os.Bundle(intent.getExtras());
            java.lang.String string = bundle.getString("access_token");
            if (string == null || string.length() == 0) {
                accessTokenCallback.onError(new com.facebook.FacebookException("No access token found on intent"));
                return;
            }
            java.lang.String string2 = bundle.getString("user_id");
            if (string2 == null || string2.length() == 0) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.getGraphMeRequestWithCacheAsync(string, new com.facebook.internal.Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.AccessToken$Companion$createFromNativeLinkingIntent$1
                    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                    public void onSuccess(org.json.JSONObject userInfo) {
                        java.lang.String string3;
                        com.facebook.AccessToken createFromBundle;
                        if (userInfo == null) {
                            string3 = null;
                        } else {
                            try {
                                string3 = userInfo.getString("id");
                            } catch (java.lang.Exception unused) {
                                accessTokenCallback.onError(new com.facebook.FacebookException("Unable to generate access token due to missing user id"));
                                return;
                            }
                        }
                        if (string3 == null) {
                            throw new java.lang.IllegalStateException("Required value was null.".toString());
                        }
                        bundle.putString("user_id", string3);
                        com.facebook.AccessToken.AccessTokenCreationCallback accessTokenCreationCallback = accessTokenCallback;
                        createFromBundle = com.facebook.AccessToken.INSTANCE.createFromBundle(null, bundle, com.facebook.AccessTokenSource.FACEBOOK_APPLICATION_WEB, new java.util.Date(), applicationId);
                        accessTokenCreationCallback.onSuccess(createFromBundle);
                    }

                    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                    public void onFailure(com.facebook.FacebookException error) {
                        accessTokenCallback.onError(error);
                    }
                });
            } else {
                accessTokenCallback.onSuccess(createFromBundle(null, bundle, com.facebook.AccessTokenSource.FACEBOOK_APPLICATION_WEB, new java.util.Date(), applicationId));
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.AccessToken createFromRefresh$facebook_core_release(com.facebook.AccessToken current, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "current");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (current.getSource() != com.facebook.AccessTokenSource.FACEBOOK_APPLICATION_WEB && current.getSource() != com.facebook.AccessTokenSource.FACEBOOK_APPLICATION_NATIVE && current.getSource() != com.facebook.AccessTokenSource.FACEBOOK_APPLICATION_SERVICE) {
                throw new com.facebook.FacebookException(kotlin.jvm.internal.Intrinsics.stringPlus("Invalid token source: ", current.getSource()));
            }
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            java.util.Date bundleLongAsDate = com.facebook.internal.Utility.getBundleLongAsDate(bundle, com.facebook.AccessToken.EXPIRES_IN_KEY, new java.util.Date(0L));
            java.lang.String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            java.lang.String string2 = bundle.getString("graph_domain");
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            java.util.Date bundleLongAsDate2 = com.facebook.internal.Utility.getBundleLongAsDate(bundle, com.facebook.AccessToken.DATA_ACCESS_EXPIRATION_TIME, new java.util.Date(0L));
            com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
            if (com.facebook.internal.Utility.isNullOrEmpty(string)) {
                return null;
            }
            return new com.facebook.AccessToken(string, current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), bundleLongAsDate, new java.util.Date(), bundleLongAsDate2, string2);
        }

        public final com.facebook.AccessToken createExpired$facebook_core_release(com.facebook.AccessToken current) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "current");
            return new com.facebook.AccessToken(current.getToken(), current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), new java.util.Date(), new java.util.Date(), current.getDataAccessExpirationTime(), null, 1024, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.AccessToken createFromLegacyCache$facebook_core_release(android.os.Bundle bundle) {
            java.lang.String string;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            java.util.List<java.lang.String> permissionsFromBundle$facebook_core_release = getPermissionsFromBundle$facebook_core_release(bundle, com.facebook.LegacyTokenHelper.PERMISSIONS_KEY);
            java.util.List<java.lang.String> permissionsFromBundle$facebook_core_release2 = getPermissionsFromBundle$facebook_core_release(bundle, com.facebook.LegacyTokenHelper.DECLINED_PERMISSIONS_KEY);
            java.util.List<java.lang.String> permissionsFromBundle$facebook_core_release3 = getPermissionsFromBundle$facebook_core_release(bundle, com.facebook.LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY);
            java.lang.String applicationId = com.facebook.LegacyTokenHelper.INSTANCE.getApplicationId(bundle);
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (com.facebook.internal.Utility.isNullOrEmpty(applicationId)) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                applicationId = com.facebook.FacebookSdk.getApplicationId();
            }
            java.lang.String str = applicationId;
            java.lang.String token = com.facebook.LegacyTokenHelper.INSTANCE.getToken(bundle);
            if (token == null) {
                return null;
            }
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            org.json.JSONObject awaitGetGraphMeRequestWithCache = com.facebook.internal.Utility.awaitGetGraphMeRequestWithCache(token);
            if (awaitGetGraphMeRequestWithCache == null) {
                string = null;
            } else {
                try {
                    string = awaitGetGraphMeRequestWithCache.getString("id");
                } catch (org.json.JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new com.facebook.AccessToken(token, str, string, permissionsFromBundle$facebook_core_release, permissionsFromBundle$facebook_core_release2, permissionsFromBundle$facebook_core_release3, com.facebook.LegacyTokenHelper.INSTANCE.getSource(bundle), com.facebook.LegacyTokenHelper.INSTANCE.getExpirationDate(bundle), com.facebook.LegacyTokenHelper.INSTANCE.getLastRefreshDate(bundle), null, null, 1024, null);
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<java.lang.String> getPermissionsFromBundle$facebook_core_release(android.os.Bundle bundle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(key);
            if (stringArrayList == null) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List<java.lang.String> unmodifiableList = java.util.Collections.unmodifiableList(new java.util.ArrayList(stringArrayList));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.AccessToken createFromJSONObject$facebook_core_release(org.json.JSONObject jsonObject) throws org.json.JSONException {
            java.util.ArrayList jsonArrayToStringList;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") > 1) {
                throw new com.facebook.FacebookException("Unknown AccessToken serialization format.");
            }
            java.lang.String token = jsonObject.getString("token");
            java.util.Date date = new java.util.Date(jsonObject.getLong(com.facebook.AccessToken.EXPIRES_AT_KEY));
            org.json.JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            org.json.JSONArray declinedPermissionsArray = jsonObject.getJSONArray(com.facebook.AccessToken.DECLINED_PERMISSIONS_KEY);
            org.json.JSONArray optJSONArray = jsonObject.optJSONArray(com.facebook.AccessToken.EXPIRED_PERMISSIONS_KEY);
            java.util.Date date2 = new java.util.Date(jsonObject.getLong(com.facebook.AccessToken.LAST_REFRESH_KEY));
            java.lang.String string = jsonObject.getString("source");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
            com.facebook.AccessTokenSource valueOf = com.facebook.AccessTokenSource.valueOf(string);
            java.lang.String applicationId = jsonObject.getString(com.facebook.AccessToken.APPLICATION_ID_KEY);
            java.lang.String userId = jsonObject.getString("user_id");
            java.util.Date date3 = new java.util.Date(jsonObject.optLong(com.facebook.AccessToken.DATA_ACCESS_EXPIRATION_TIME, 0L));
            java.lang.String optString = jsonObject.optString("graph_domain", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(token, "token");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(userId, "userId");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
            java.util.List<java.lang.String> jsonArrayToStringList2 = com.facebook.internal.Utility.jsonArrayToStringList(permissionsArray);
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
            java.util.List<java.lang.String> jsonArrayToStringList3 = com.facebook.internal.Utility.jsonArrayToStringList(declinedPermissionsArray);
            if (optJSONArray == null) {
                jsonArrayToStringList = new java.util.ArrayList();
            } else {
                com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                jsonArrayToStringList = com.facebook.internal.Utility.jsonArrayToStringList(optJSONArray);
            }
            return new com.facebook.AccessToken(token, applicationId, userId, jsonArrayToStringList2, jsonArrayToStringList3, jsonArrayToStringList, valueOf, date, date2, date3, optString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.facebook.AccessToken createFromBundle(java.util.List<java.lang.String> requestedPermissions, android.os.Bundle bundle, com.facebook.AccessTokenSource source, java.util.Date expirationBase, java.lang.String applicationId) {
            java.lang.String string;
            java.lang.String string2 = bundle.getString("access_token");
            if (string2 == null) {
                return null;
            }
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            java.util.Date bundleLongAsDate = com.facebook.internal.Utility.getBundleLongAsDate(bundle, com.facebook.AccessToken.EXPIRES_IN_KEY, expirationBase);
            if (bundleLongAsDate == null || (string = bundle.getString("user_id")) == null) {
                return null;
            }
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            return new com.facebook.AccessToken(string2, applicationId, string, requestedPermissions, null, null, source, bundleLongAsDate, new java.util.Date(), com.facebook.internal.Utility.getBundleLongAsDate(bundle, com.facebook.AccessToken.DATA_ACCESS_EXPIRATION_TIME, new java.util.Date(0L)), null, 1024, null);
        }
    }

    static {
        java.util.Date date = new java.util.Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        DEFAULT_LAST_REFRESH_TIME = new java.util.Date();
        DEFAULT_ACCESS_TOKEN_SOURCE = com.facebook.AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        CREATOR = new android.os.Parcelable.Creator<com.facebook.AccessToken>() { // from class: com.facebook.AccessToken$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.facebook.AccessToken createFromParcel(android.os.Parcel source) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
                return new com.facebook.AccessToken(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.facebook.AccessToken[] newArray(int size) {
                return new com.facebook.AccessToken[size];
            }
        };
    }
}
