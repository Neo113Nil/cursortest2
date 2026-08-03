package com.facebook;

/* compiled from: AccessTokenManager.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 !2\u00020\u0001:\u0005!\"#$%B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u001c\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\f\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/facebook/AccessTokenManager;", "", "localBroadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "accessTokenCache", "Lcom/facebook/AccessTokenCache;", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lcom/facebook/AccessTokenCache;)V", "value", "Lcom/facebook/AccessToken;", "currentAccessToken", "getCurrentAccessToken", "()Lcom/facebook/AccessToken;", "setCurrentAccessToken", "(Lcom/facebook/AccessToken;)V", "currentAccessTokenField", "lastAttemptedTokenExtendDate", "Ljava/util/Date;", "tokenRefreshInProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "currentAccessTokenChanged", "", "extendAccessTokenIfNeeded", "loadCurrentAccessToken", "", "refreshCurrentAccessToken", "callback", "Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "refreshCurrentAccessTokenImpl", "sendCurrentAccessTokenChangedBroadcastIntent", "oldAccessToken", "saveToCache", "setTokenExpirationBroadcastAlarm", "shouldExtendAccessToken", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "FacebookRefreshTokenInfo", "InstagramRefreshTokenInfo", "RefreshResult", "RefreshTokenInfo", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AccessTokenManager {
    public static final java.lang.String ACTION_CURRENT_ACCESS_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.AccessTokenManager.Companion INSTANCE = new com.facebook.AccessTokenManager.Companion(null);
    public static final java.lang.String EXTRA_NEW_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";
    public static final java.lang.String EXTRA_OLD_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";
    private static final java.lang.String ME_PERMISSIONS_GRAPH_PATH = "me/permissions";
    public static final java.lang.String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
    public static final java.lang.String TAG = "AccessTokenManager";
    private static final int TOKEN_EXTEND_RETRY_SECONDS = 3600;
    private static final int TOKEN_EXTEND_THRESHOLD_SECONDS = 86400;
    private static com.facebook.AccessTokenManager instanceField;
    private final com.facebook.AccessTokenCache accessTokenCache;
    private com.facebook.AccessToken currentAccessTokenField;
    private java.util.Date lastAttemptedTokenExtendDate;
    private final androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager;
    private final java.util.concurrent.atomic.AtomicBoolean tokenRefreshInProgress;

    /* compiled from: AccessTokenManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "", "grantType", "", "getGrantType", "()Ljava/lang/String;", "graphPath", "getGraphPath", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface RefreshTokenInfo {
        java.lang.String getGrantType();

        java.lang.String getGraphPath();
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.AccessTokenManager getInstance() {
        return INSTANCE.getInstance();
    }

    public AccessTokenManager(androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager, com.facebook.AccessTokenCache accessTokenCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.localBroadcastManager = localBroadcastManager;
        this.accessTokenCache = accessTokenCache;
        this.tokenRefreshInProgress = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.lastAttemptedTokenExtendDate = new java.util.Date(0L);
    }

    /* renamed from: getCurrentAccessToken, reason: from getter */
    public final com.facebook.AccessToken getCurrentAccessTokenField() {
        return this.currentAccessTokenField;
    }

    public final void setCurrentAccessToken(com.facebook.AccessToken accessToken) {
        setCurrentAccessToken(accessToken, true);
    }

    /* compiled from: AccessTokenManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/facebook/AccessTokenManager$FacebookRefreshTokenInfo;", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "()V", "grantType", "", "getGrantType", "()Ljava/lang/String;", "graphPath", "getGraphPath", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class FacebookRefreshTokenInfo implements com.facebook.AccessTokenManager.RefreshTokenInfo {
        private final java.lang.String graphPath = "oauth/access_token";
        private final java.lang.String grantType = "fb_extend_sso_token";

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public java.lang.String getGraphPath() {
            return this.graphPath;
        }

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public java.lang.String getGrantType() {
            return this.grantType;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/facebook/AccessTokenManager$InstagramRefreshTokenInfo;", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "()V", "grantType", "", "getGrantType", "()Ljava/lang/String;", "graphPath", "getGraphPath", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class InstagramRefreshTokenInfo implements com.facebook.AccessTokenManager.RefreshTokenInfo {
        private final java.lang.String graphPath = "refresh_access_token";
        private final java.lang.String grantType = "ig_refresh_token";

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public java.lang.String getGraphPath() {
            return this.graphPath;
        }

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public java.lang.String getGrantType() {
            return this.grantType;
        }
    }

    public final boolean loadCurrentAccessToken() {
        com.facebook.AccessToken load = this.accessTokenCache.load();
        if (load == null) {
            return false;
        }
        setCurrentAccessToken(load, false);
        return true;
    }

    public final void currentAccessTokenChanged() {
        sendCurrentAccessTokenChangedBroadcastIntent(getCurrentAccessTokenField(), getCurrentAccessTokenField());
    }

    private final void setCurrentAccessToken(com.facebook.AccessToken currentAccessToken, boolean saveToCache) {
        com.facebook.AccessToken accessToken = this.currentAccessTokenField;
        this.currentAccessTokenField = currentAccessToken;
        this.tokenRefreshInProgress.set(false);
        this.lastAttemptedTokenExtendDate = new java.util.Date(0L);
        if (saveToCache) {
            if (currentAccessToken != null) {
                this.accessTokenCache.save(currentAccessToken);
            } else {
                this.accessTokenCache.clear();
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.internal.Utility.clearFacebookCookies(com.facebook.FacebookSdk.getApplicationContext());
            }
        }
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.areObjectsEqual(accessToken, currentAccessToken)) {
            return;
        }
        sendCurrentAccessTokenChangedBroadcastIntent(accessToken, currentAccessToken);
        setTokenExpirationBroadcastAlarm();
    }

    private final void sendCurrentAccessTokenChangedBroadcastIntent(com.facebook.AccessToken oldAccessToken, com.facebook.AccessToken currentAccessToken) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Intent intent = new android.content.Intent(com.facebook.FacebookSdk.getApplicationContext(), (java.lang.Class<?>) com.facebook.CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction(ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
        intent.putExtra(EXTRA_OLD_ACCESS_TOKEN, oldAccessToken);
        intent.putExtra(EXTRA_NEW_ACCESS_TOKEN, currentAccessToken);
        this.localBroadcastManager.sendBroadcast(intent);
    }

    private final void setTokenExpirationBroadcastAlarm() {
        android.app.PendingIntent broadcast;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken();
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) applicationContext.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
        if (com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive()) {
            if ((currentAccessToken == null ? null : currentAccessToken.getExpires()) == null || alarmManager == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent(applicationContext, (java.lang.Class<?>) com.facebook.CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction(ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                broadcast = android.app.PendingIntent.getBroadcast(applicationContext, 0, intent, androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            } else {
                broadcast = android.app.PendingIntent.getBroadcast(applicationContext, 0, intent, 0);
            }
            try {
                alarmManager.set(1, currentAccessToken.getExpires().getTime(), broadcast);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final void extendAccessTokenIfNeeded() {
        if (shouldExtendAccessToken()) {
            refreshCurrentAccessToken(null);
        }
    }

    private final boolean shouldExtendAccessToken() {
        com.facebook.AccessToken currentAccessTokenField = getCurrentAccessTokenField();
        if (currentAccessTokenField == null) {
            return false;
        }
        long time = new java.util.Date().getTime();
        return currentAccessTokenField.getSource().getCanExtendToken() && time - this.lastAttemptedTokenExtendDate.getTime() > 3600000 && time - currentAccessTokenField.getLastRefresh().getTime() > 86400000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AccessTokenManager.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/facebook/AccessTokenManager$RefreshResult;", "", "()V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "dataAccessExpirationTime", "", "getDataAccessExpirationTime", "()Ljava/lang/Long;", "setDataAccessExpirationTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "expiresAt", "", "getExpiresAt", "()I", "setExpiresAt", "(I)V", "expiresIn", "getExpiresIn", "setExpiresIn", "graphDomain", "getGraphDomain", "setGraphDomain", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    static final class RefreshResult {
        private java.lang.String accessToken;
        private java.lang.Long dataAccessExpirationTime;
        private int expiresAt;
        private int expiresIn;
        private java.lang.String graphDomain;

        public final java.lang.String getAccessToken() {
            return this.accessToken;
        }

        public final void setAccessToken(java.lang.String str) {
            this.accessToken = str;
        }

        public final int getExpiresAt() {
            return this.expiresAt;
        }

        public final void setExpiresAt(int i) {
            this.expiresAt = i;
        }

        public final int getExpiresIn() {
            return this.expiresIn;
        }

        public final void setExpiresIn(int i) {
            this.expiresIn = i;
        }

        public final java.lang.Long getDataAccessExpirationTime() {
            return this.dataAccessExpirationTime;
        }

        public final void setDataAccessExpirationTime(java.lang.Long l) {
            this.dataAccessExpirationTime = l;
        }

        public final java.lang.String getGraphDomain() {
            return this.graphDomain;
        }

        public final void setGraphDomain(java.lang.String str) {
            this.graphDomain = str;
        }
    }

    public final void refreshCurrentAccessToken(final com.facebook.AccessToken.AccessTokenRefreshCallback callback) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            refreshCurrentAccessTokenImpl(callback);
        } else {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.facebook.AccessTokenManager$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.AccessTokenManager.m5046refreshCurrentAccessToken$lambda0(com.facebook.AccessTokenManager.this, callback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshCurrentAccessToken$lambda-0, reason: not valid java name */
    public static final void m5046refreshCurrentAccessToken$lambda0(com.facebook.AccessTokenManager this$0, com.facebook.AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshCurrentAccessTokenImpl(accessTokenRefreshCallback);
    }

    private final void refreshCurrentAccessTokenImpl(final com.facebook.AccessToken.AccessTokenRefreshCallback callback) {
        final com.facebook.AccessToken currentAccessTokenField = getCurrentAccessTokenField();
        if (currentAccessTokenField == null) {
            if (callback == null) {
                return;
            }
            callback.OnTokenRefreshFailed(new com.facebook.FacebookException("No current access token to refresh"));
            return;
        }
        if (!this.tokenRefreshInProgress.compareAndSet(false, true)) {
            if (callback == null) {
                return;
            }
            callback.OnTokenRefreshFailed(new com.facebook.FacebookException("Refresh already in progress"));
            return;
        }
        this.lastAttemptedTokenExtendDate = new java.util.Date();
        final java.util.HashSet hashSet = new java.util.HashSet();
        final java.util.HashSet hashSet2 = new java.util.HashSet();
        final java.util.HashSet hashSet3 = new java.util.HashSet();
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        final com.facebook.AccessTokenManager.RefreshResult refreshResult = new com.facebook.AccessTokenManager.RefreshResult();
        com.facebook.AccessTokenManager.Companion companion = INSTANCE;
        com.facebook.GraphRequestBatch graphRequestBatch = new com.facebook.GraphRequestBatch(companion.createGrantedPermissionsRequest(currentAccessTokenField, new com.facebook.GraphRequest.Callback() { // from class: com.facebook.AccessTokenManager$$ExternalSyntheticLambda0
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                com.facebook.AccessTokenManager.m5047refreshCurrentAccessTokenImpl$lambda1(atomicBoolean, hashSet, hashSet2, hashSet3, graphResponse);
            }
        }), companion.createExtendAccessTokenRequest(currentAccessTokenField, new com.facebook.GraphRequest.Callback() { // from class: com.facebook.AccessTokenManager$$ExternalSyntheticLambda1
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                com.facebook.AccessTokenManager.m5048refreshCurrentAccessTokenImpl$lambda2(com.facebook.AccessTokenManager.RefreshResult.this, graphResponse);
            }
        }));
        graphRequestBatch.addCallback(new com.facebook.GraphRequestBatch.Callback() { // from class: com.facebook.AccessTokenManager$$ExternalSyntheticLambda2
            @Override // com.facebook.GraphRequestBatch.Callback
            public final void onBatchCompleted(com.facebook.GraphRequestBatch graphRequestBatch2) {
                com.facebook.AccessTokenManager.m5049refreshCurrentAccessTokenImpl$lambda3(com.facebook.AccessTokenManager.RefreshResult.this, currentAccessTokenField, callback, atomicBoolean, hashSet, hashSet2, hashSet3, this, graphRequestBatch2);
            }
        });
        graphRequestBatch.executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshCurrentAccessTokenImpl$lambda-1, reason: not valid java name */
    public static final void m5047refreshCurrentAccessTokenImpl$lambda1(java.util.concurrent.atomic.AtomicBoolean permissionsCallSucceeded, java.util.Set permissions, java.util.Set declinedPermissions, java.util.Set expiredPermissions, com.facebook.GraphResponse response) {
        org.json.JSONArray optJSONArray;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "$permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        org.json.JSONObject jsonObject = response.getJsonObject();
        if (jsonObject == null || (optJSONArray = jsonObject.optJSONArray("data")) == null) {
            return;
        }
        permissionsCallSucceeded.set(true);
        int length = optJSONArray.length();
        if (length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString("permission");
                java.lang.String status = optJSONObject.optString("status");
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                if (!com.facebook.internal.Utility.isNullOrEmpty(optString)) {
                    com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                    if (!com.facebook.internal.Utility.isNullOrEmpty(status)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(status, "status");
                        java.util.Locale US = java.util.Locale.US;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US, "US");
                        java.lang.String status2 = status.toLowerCase(US);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(status2, "(this as java.lang.String).toLowerCase(locale)");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(status2, "status");
                        int hashCode = status2.hashCode();
                        if (hashCode == -1309235419) {
                            if (status2.equals("expired")) {
                                expiredPermissions.add(optString);
                            }
                            android.util.Log.w(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Unexpected status: ", status2));
                        } else if (hashCode == 280295099) {
                            if (status2.equals("granted")) {
                                permissions.add(optString);
                            }
                            android.util.Log.w(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Unexpected status: ", status2));
                        } else {
                            if (hashCode == 568196142 && status2.equals("declined")) {
                                declinedPermissions.add(optString);
                            }
                            android.util.Log.w(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Unexpected status: ", status2));
                        }
                    }
                }
            }
            if (i2 >= length) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshCurrentAccessTokenImpl$lambda-2, reason: not valid java name */
    public static final void m5048refreshCurrentAccessTokenImpl$lambda2(com.facebook.AccessTokenManager.RefreshResult refreshResult, com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        org.json.JSONObject jsonObject = response.getJsonObject();
        if (jsonObject == null) {
            return;
        }
        refreshResult.setAccessToken(jsonObject.optString("access_token"));
        refreshResult.setExpiresAt(jsonObject.optInt("expires_at"));
        refreshResult.setExpiresIn(jsonObject.optInt(com.facebook.AccessToken.EXPIRES_IN_KEY));
        refreshResult.setDataAccessExpirationTime(java.lang.Long.valueOf(jsonObject.optLong(com.facebook.AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
        refreshResult.setGraphDomain(jsonObject.optString("graph_domain", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshCurrentAccessTokenImpl$lambda-3, reason: not valid java name */
    public static final void m5049refreshCurrentAccessTokenImpl$lambda3(com.facebook.AccessTokenManager.RefreshResult refreshResult, com.facebook.AccessToken accessToken, com.facebook.AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback, java.util.concurrent.atomic.AtomicBoolean permissionsCallSucceeded, java.util.Set permissions, java.util.Set declinedPermissions, java.util.Set set, com.facebook.AccessTokenManager this$0, com.facebook.GraphRequestBatch it) {
        com.facebook.AccessToken accessToken2;
        java.util.Date dataAccessExpirationTime;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "$permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        java.util.Set expiredPermissions = set;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.String accessToken3 = refreshResult.getAccessToken();
        int expiresAt = refreshResult.getExpiresAt();
        java.lang.Long dataAccessExpirationTime2 = refreshResult.getDataAccessExpirationTime();
        java.lang.String graphDomain = refreshResult.getGraphDomain();
        try {
            com.facebook.AccessTokenManager.Companion companion = INSTANCE;
            if (companion.getInstance().getCurrentAccessTokenField() != null) {
                com.facebook.AccessToken currentAccessTokenField = companion.getInstance().getCurrentAccessTokenField();
                if ((currentAccessTokenField == null ? null : currentAccessTokenField.getUserId()) == accessToken.getUserId()) {
                    if (permissionsCallSucceeded.get() || accessToken3 != null || expiresAt != 0) {
                        java.util.Date expires = accessToken.getExpires();
                        if (refreshResult.getExpiresAt() != 0) {
                            expires = new java.util.Date(refreshResult.getExpiresAt() * 1000);
                        } else if (refreshResult.getExpiresIn() != 0) {
                            expires = new java.util.Date((refreshResult.getExpiresIn() * 1000) + new java.util.Date().getTime());
                        }
                        java.util.Date date = expires;
                        if (accessToken3 == null) {
                            accessToken3 = accessToken.getToken();
                        }
                        java.lang.String str = accessToken3;
                        java.lang.String applicationId = accessToken.getApplicationId();
                        java.lang.String userId = accessToken.getUserId();
                        java.util.Set permissions2 = permissionsCallSucceeded.get() ? permissions : accessToken.getPermissions();
                        java.util.Set declinedPermissions2 = permissionsCallSucceeded.get() ? declinedPermissions : accessToken.getDeclinedPermissions();
                        if (!permissionsCallSucceeded.get()) {
                            expiredPermissions = accessToken.getExpiredPermissions();
                        }
                        java.util.Set set2 = expiredPermissions;
                        com.facebook.AccessTokenSource source = accessToken.getSource();
                        java.util.Date date2 = new java.util.Date();
                        if (dataAccessExpirationTime2 != null) {
                            dataAccessExpirationTime = new java.util.Date(dataAccessExpirationTime2.longValue() * 1000);
                        } else {
                            dataAccessExpirationTime = accessToken.getDataAccessExpirationTime();
                        }
                        java.util.Date date3 = dataAccessExpirationTime;
                        if (graphDomain == null) {
                            graphDomain = accessToken.getGraphDomain();
                        }
                        com.facebook.AccessToken accessToken4 = new com.facebook.AccessToken(str, applicationId, userId, permissions2, declinedPermissions2, set2, source, date, date2, date3, graphDomain);
                        try {
                            companion.getInstance().setCurrentAccessToken(accessToken4);
                            this$0.tokenRefreshInProgress.set(false);
                            if (accessTokenRefreshCallback != null) {
                                accessTokenRefreshCallback.OnTokenRefreshed(accessToken4);
                                return;
                            }
                            return;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            accessToken2 = accessToken4;
                            this$0.tokenRefreshInProgress.set(false);
                            if (accessTokenRefreshCallback != null && accessToken2 != null) {
                                accessTokenRefreshCallback.OnTokenRefreshed(accessToken2);
                            }
                            throw th;
                        }
                    }
                    if (accessTokenRefreshCallback != null) {
                        accessTokenRefreshCallback.OnTokenRefreshFailed(new com.facebook.FacebookException("Failed to refresh access token"));
                    }
                    this$0.tokenRefreshInProgress.set(false);
                    return;
                }
            }
            if (accessTokenRefreshCallback != null) {
                accessTokenRefreshCallback.OnTokenRefreshFailed(new com.facebook.FacebookException("No current access token to refresh"));
            }
            this$0.tokenRefreshInProgress.set(false);
        } catch (java.lang.Throwable th2) {
            th = th2;
            accessToken2 = null;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/facebook/AccessTokenManager$Companion;", "", "()V", "ACTION_CURRENT_ACCESS_TOKEN_CHANGED", "", "EXTRA_NEW_ACCESS_TOKEN", "EXTRA_OLD_ACCESS_TOKEN", "ME_PERMISSIONS_GRAPH_PATH", "SHARED_PREFERENCES_NAME", "TAG", "TOKEN_EXTEND_RETRY_SECONDS", "", "TOKEN_EXTEND_THRESHOLD_SECONDS", "instanceField", "Lcom/facebook/AccessTokenManager;", "createExtendAccessTokenRequest", "Lcom/facebook/GraphRequest;", "accessToken", "Lcom/facebook/AccessToken;", "callback", "Lcom/facebook/GraphRequest$Callback;", "createGrantedPermissionsRequest", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "getRefreshTokenInfoForToken", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.AccessTokenManager getInstance() {
            com.facebook.AccessTokenManager accessTokenManager;
            com.facebook.AccessTokenManager accessTokenManager2 = com.facebook.AccessTokenManager.instanceField;
            if (accessTokenManager2 != null) {
                return accessTokenManager2;
            }
            synchronized (this) {
                accessTokenManager = com.facebook.AccessTokenManager.instanceField;
                if (accessTokenManager == null) {
                    com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                    androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(com.facebook.FacebookSdk.getApplicationContext());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                    com.facebook.AccessTokenManager accessTokenManager3 = new com.facebook.AccessTokenManager(localBroadcastManager, new com.facebook.AccessTokenCache());
                    com.facebook.AccessTokenManager.Companion companion = com.facebook.AccessTokenManager.INSTANCE;
                    com.facebook.AccessTokenManager.instanceField = accessTokenManager3;
                    accessTokenManager = accessTokenManager3;
                }
            }
            return accessTokenManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.facebook.GraphRequest createGrantedPermissionsRequest(com.facebook.AccessToken accessToken, com.facebook.GraphRequest.Callback callback) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.facebook.GraphRequest.FIELDS_PARAM, "permission,status");
            com.facebook.GraphRequest newGraphPathRequest = com.facebook.GraphRequest.INSTANCE.newGraphPathRequest(accessToken, com.facebook.AccessTokenManager.ME_PERMISSIONS_GRAPH_PATH, callback);
            newGraphPathRequest.setParameters(bundle);
            newGraphPathRequest.setHttpMethod(com.facebook.HttpMethod.GET);
            return newGraphPathRequest;
        }

        private final com.facebook.AccessTokenManager.RefreshTokenInfo getRefreshTokenInfoForToken(com.facebook.AccessToken accessToken) {
            java.lang.String graphDomain = accessToken.getGraphDomain();
            if (graphDomain == null) {
                graphDomain = com.facebook.AccessToken.DEFAULT_GRAPH_DOMAIN;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(graphDomain, com.facebook.FacebookSdk.INSTAGRAM) ? new com.facebook.AccessTokenManager.InstagramRefreshTokenInfo() : new com.facebook.AccessTokenManager.FacebookRefreshTokenInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.facebook.GraphRequest createExtendAccessTokenRequest(com.facebook.AccessToken accessToken, com.facebook.GraphRequest.Callback callback) {
            com.facebook.AccessTokenManager.RefreshTokenInfo refreshTokenInfoForToken = getRefreshTokenInfoForToken(accessToken);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("grant_type", refreshTokenInfoForToken.getGrantType());
            bundle.putString("client_id", accessToken.getApplicationId());
            bundle.putString(com.facebook.GraphRequest.FIELDS_PARAM, "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            com.facebook.GraphRequest newGraphPathRequest = com.facebook.GraphRequest.INSTANCE.newGraphPathRequest(accessToken, refreshTokenInfoForToken.getGraphPath(), callback);
            newGraphPathRequest.setParameters(bundle);
            newGraphPathRequest.setHttpMethod(com.facebook.HttpMethod.GET);
            return newGraphPathRequest;
        }
    }
}
