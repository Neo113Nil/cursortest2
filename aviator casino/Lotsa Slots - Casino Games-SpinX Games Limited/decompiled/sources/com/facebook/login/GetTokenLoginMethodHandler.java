package com.facebook.login;

/* compiled from: GetTokenLoginMethodHandler.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getTokenClient", "Lcom/facebook/login/GetTokenClient;", "nameForLogging", "", "getNameForLogging", "()Ljava/lang/String;", "cancel", "", "complete", "request", "Lcom/facebook/login/LoginClient$Request;", "result", "Landroid/os/Bundle;", "describeContents", "", "getTokenCompleted", "onComplete", "tryAuthorize", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GetTokenLoginMethodHandler extends com.facebook.login.LoginMethodHandler {
    private com.facebook.login.GetTokenClient getTokenClient;
    private final java.lang.String nameForLogging;
    public static final android.os.Parcelable.Creator<com.facebook.login.GetTokenLoginMethodHandler> CREATOR = new android.os.Parcelable.Creator<com.facebook.login.GetTokenLoginMethodHandler>() { // from class: com.facebook.login.GetTokenLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.GetTokenLoginMethodHandler createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.login.GetTokenLoginMethodHandler(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.GetTokenLoginMethodHandler[] newArray(int size) {
            return new com.facebook.login.GetTokenLoginMethodHandler[size];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(com.facebook.login.LoginClient loginClient) {
        super(loginClient);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "get_token";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public java.lang.String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void cancel() {
        com.facebook.login.GetTokenClient getTokenClient = this.getTokenClient;
        if (getTokenClient == null) {
            return;
        }
        getTokenClient.cancel();
        getTokenClient.setCompletedListener(null);
        this.getTokenClient = null;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(final com.facebook.login.LoginClient.Request request) {
        androidx.fragment.app.FragmentActivity fragmentActivity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        androidx.fragment.app.FragmentActivity activity = getLoginClient().getActivity();
        if (activity == null) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            fragmentActivity = com.facebook.FacebookSdk.getApplicationContext();
        } else {
            fragmentActivity = activity;
        }
        com.facebook.login.GetTokenClient getTokenClient = new com.facebook.login.GetTokenClient(fragmentActivity, request);
        this.getTokenClient = getTokenClient;
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Boolean.valueOf(getTokenClient.start()), (java.lang.Object) false)) {
            return 0;
        }
        getLoginClient().notifyBackgroundProcessingStart();
        com.facebook.internal.PlatformServiceClient.CompletedListener completedListener = new com.facebook.internal.PlatformServiceClient.CompletedListener() { // from class: com.facebook.login.GetTokenLoginMethodHandler$$ExternalSyntheticLambda0
            @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
            public final void completed(android.os.Bundle bundle) {
                com.facebook.login.GetTokenLoginMethodHandler.m5234tryAuthorize$lambda1(com.facebook.login.GetTokenLoginMethodHandler.this, request, bundle);
            }
        };
        com.facebook.login.GetTokenClient getTokenClient2 = this.getTokenClient;
        if (getTokenClient2 == null) {
            return 1;
        }
        getTokenClient2.setCompletedListener(completedListener);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tryAuthorize$lambda-1, reason: not valid java name */
    public static final void m5234tryAuthorize$lambda1(com.facebook.login.GetTokenLoginMethodHandler this$0, com.facebook.login.LoginClient.Request request, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "$request");
        this$0.getTokenCompleted(request, bundle);
    }

    public final void getTokenCompleted(com.facebook.login.LoginClient.Request request, android.os.Bundle result) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        com.facebook.login.GetTokenClient getTokenClient = this.getTokenClient;
        if (getTokenClient != null) {
            getTokenClient.setCompletedListener(null);
        }
        this.getTokenClient = null;
        getLoginClient().notifyBackgroundProcessingStop();
        if (result != null) {
            java.util.ArrayList<java.lang.String> stringArrayList = result.getStringArrayList(com.facebook.internal.NativeProtocol.EXTRA_PERMISSIONS);
            java.util.ArrayList<java.lang.String> emptyList = stringArrayList == null ? kotlin.collections.CollectionsKt.emptyList() : stringArrayList;
            java.util.Set<java.lang.String> permissions = request.getPermissions();
            if (permissions == null) {
                permissions = kotlin.collections.SetsKt.emptySet();
            }
            java.lang.String string = result.getString(com.facebook.internal.NativeProtocol.EXTRA_AUTHENTICATION_TOKEN);
            if (permissions.contains("openid") && ((str = string) == null || str.length() == 0)) {
                getLoginClient().tryNextHandler();
                return;
            }
            if (emptyList.containsAll(permissions)) {
                complete(request, result);
                return;
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            for (java.lang.String str2 : permissions) {
                if (!emptyList.contains(str2)) {
                    hashSet.add(str2);
                }
            }
            if (!hashSet.isEmpty()) {
                addLoggingExtra(com.facebook.login.LoginLogger.EVENT_EXTRAS_NEW_PERMISSIONS, android.text.TextUtils.join(",", hashSet));
            }
            request.setPermissions(hashSet);
        }
        getLoginClient().tryNextHandler();
    }

    public final void onComplete(com.facebook.login.LoginClient.Request request, android.os.Bundle result) {
        com.facebook.login.LoginClient.Result createErrorResult$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        try {
            createErrorResult$default = com.facebook.login.LoginClient.Result.INSTANCE.createCompositeTokenResult(request, com.facebook.login.LoginMethodHandler.INSTANCE.createAccessTokenFromNativeLogin(result, com.facebook.AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId()), com.facebook.login.LoginMethodHandler.INSTANCE.createAuthenticationTokenFromNativeLogin(result, request.getNonce()));
        } catch (com.facebook.FacebookException e) {
            createErrorResult$default = com.facebook.login.LoginClient.Result.Companion.createErrorResult$default(com.facebook.login.LoginClient.Result.INSTANCE, getLoginClient().getPendingRequest(), null, e.getMessage(), null, 8, null);
        }
        getLoginClient().completeAndValidate(createErrorResult$default);
    }

    public final void complete(final com.facebook.login.LoginClient.Request request, final android.os.Bundle result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        java.lang.String string = result.getString(com.facebook.internal.NativeProtocol.EXTRA_USER_ID);
        if (string == null || string.length() == 0) {
            getLoginClient().notifyBackgroundProcessingStart();
            java.lang.String string2 = result.getString(com.facebook.internal.NativeProtocol.EXTRA_ACCESS_TOKEN);
            if (string2 == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.getGraphMeRequestWithCacheAsync(string2, new com.facebook.internal.Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.login.GetTokenLoginMethodHandler$complete$1
                @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                public void onSuccess(org.json.JSONObject userInfo) {
                    try {
                        result.putString(com.facebook.internal.NativeProtocol.EXTRA_USER_ID, userInfo == null ? null : userInfo.getString("id"));
                        this.onComplete(request, result);
                    } catch (org.json.JSONException e) {
                        this.getLoginClient().complete(com.facebook.login.LoginClient.Result.Companion.createErrorResult$default(com.facebook.login.LoginClient.Result.INSTANCE, this.getLoginClient().getPendingRequest(), "Caught exception", e.getMessage(), null, 8, null));
                    }
                }

                @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                public void onFailure(com.facebook.FacebookException error) {
                    this.getLoginClient().complete(com.facebook.login.LoginClient.Result.Companion.createErrorResult$default(com.facebook.login.LoginClient.Result.INSTANCE, this.getLoginClient().getPendingRequest(), "Caught exception", error == null ? null : error.getMessage(), null, 8, null));
                }
            });
            return;
        }
        onComplete(request, result);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "get_token";
    }
}
