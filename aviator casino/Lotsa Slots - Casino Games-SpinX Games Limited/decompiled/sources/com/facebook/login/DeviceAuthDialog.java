package com.facebook.login;

/* compiled from: DeviceAuthDialog.kt */
@kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0016\u0018\u0000 J2\u00020\u0001:\u0003JKLB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016J4\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002J\b\u0010'\u001a\u00020\u001dH\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000fH\u0015J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u000fH\u0014J\b\u0010,\u001a\u00020\u000fH\u0014J\b\u0010-\u001a\u00020\u001fH\u0014J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J&\u00102\u001a\u0004\u0018\u00010\u00162\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00107\u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020=H\u0014J\u0010\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u000201H\u0016J'\u0010@\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020B2\b\u0010&\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0002\u0010CJ\b\u0010D\u001a\u00020\u001fH\u0002J<\u0010E\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002J\b\u0010G\u001a\u00020\u001fH\u0002J\u0010\u0010H\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010I\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "completed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "confirmationCode", "Landroid/widget/TextView;", "currentGraphRequestPoll", "Lcom/facebook/GraphRequestAsyncTask;", "currentRequestState", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "deviceAuthMethodHandler", "Lcom/facebook/login/DeviceAuthMethodHandler;", "instructions", "isBeingDestroyed", "", "isRetry", "pollRequest", "Lcom/facebook/GraphRequest;", "getPollRequest", "()Lcom/facebook/GraphRequest;", "progressBar", "Landroid/view/View;", "request", "Lcom/facebook/login/LoginClient$Request;", "scheduledPoll", "Ljava/util/concurrent/ScheduledFuture;", "additionalDeviceInfo", "", "", "completeLogin", "", "userId", "permissions", "Lcom/facebook/login/DeviceAuthDialog$PermissionsLists;", "accessToken", "expirationTime", "Ljava/util/Date;", "dataAccessExpirationTime", "getApplicationAccessToken", "getLayoutResId", "", "isSmartLogin", "initializeContentView", "onBackButtonPressed", "onCancel", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onError", "ex", "Lcom/facebook/FacebookException;", "onSaveInstanceState", "outState", "onSuccess", "expiresIn", "", "(Ljava/lang/String;JLjava/lang/Long;)V", "poll", "presentConfirmation", "name", "schedulePoll", "setCurrentRequestState", "startLogin", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "PermissionsLists", "RequestState", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class DeviceAuthDialog extends androidx.fragment.app.DialogFragment {
    private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED = 1349173;
    private static final int LOGIN_ERROR_SUBCODE_CODE_EXPIRED = 1349152;
    private static final int LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING = 1349172;
    private static final java.lang.String REQUEST_STATE_KEY = "request_state";
    private final java.util.concurrent.atomic.AtomicBoolean completed = new java.util.concurrent.atomic.AtomicBoolean();
    private android.widget.TextView confirmationCode;
    private volatile com.facebook.GraphRequestAsyncTask currentGraphRequestPoll;
    private volatile com.facebook.login.DeviceAuthDialog.RequestState currentRequestState;
    private com.facebook.login.DeviceAuthMethodHandler deviceAuthMethodHandler;
    private android.widget.TextView instructions;
    private boolean isBeingDestroyed;
    private boolean isRetry;
    private android.view.View progressBar;
    private com.facebook.login.LoginClient.Request request;
    private volatile java.util.concurrent.ScheduledFuture<?> scheduledPoll;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.login.DeviceAuthDialog.Companion INSTANCE = new com.facebook.login.DeviceAuthDialog.Companion(null);
    private static final java.lang.String DEVICE_LOGIN_ENDPOINT = "device/login";
    private static final java.lang.String DEVICE_LOGIN_STATUS_ENDPOINT = "device/login_status";
    private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING = 1349174;

    public java.util.Map<java.lang.String, java.lang.String> additionalDeviceInfo() {
        return null;
    }

    protected boolean onBackButtonPressed() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        com.facebook.login.DeviceAuthDialog.RequestState requestState;
        com.facebook.login.LoginClient loginClient;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        com.facebook.login.LoginFragment loginFragment = (com.facebook.login.LoginFragment) ((com.facebook.FacebookActivity) requireActivity()).getCurrentFragment();
        com.facebook.login.LoginMethodHandler loginMethodHandler = null;
        if (loginFragment != null && (loginClient = loginFragment.getLoginClient()) != null) {
            loginMethodHandler = loginClient.getCurrentHandler();
        }
        this.deviceAuthMethodHandler = (com.facebook.login.DeviceAuthMethodHandler) loginMethodHandler;
        if (savedInstanceState != null && (requestState = (com.facebook.login.DeviceAuthDialog.RequestState) savedInstanceState.getParcelable(REQUEST_STATE_KEY)) != null) {
            setCurrentRequestState(requestState);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
        final androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
        final int i = com.facebook.common.R.style.com_facebook_auth_dialog;
        android.app.Dialog dialog = new android.app.Dialog(requireActivity, i) { // from class: com.facebook.login.DeviceAuthDialog$onCreateDialog$dialog$1
            {
                super(requireActivity, i);
            }

            @Override // android.app.Dialog
            public void onBackPressed() {
                if (com.facebook.login.DeviceAuthDialog.this.onBackButtonPressed()) {
                    super.onBackPressed();
                }
            }
        };
        com.facebook.devicerequests.internal.DeviceRequestsHelper deviceRequestsHelper = com.facebook.devicerequests.internal.DeviceRequestsHelper.INSTANCE;
        dialog.setContentView(initializeContentView(com.facebook.devicerequests.internal.DeviceRequestsHelper.isAvailable() && !this.isRetry));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.isBeingDestroyed) {
            return;
        }
        onCancel();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.currentRequestState != null) {
            outState.putParcelable(REQUEST_STATE_KEY, this.currentRequestState);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.isBeingDestroyed = true;
        this.completed.set(true);
        super.onDestroyView();
        com.facebook.GraphRequestAsyncTask graphRequestAsyncTask = this.currentGraphRequestPoll;
        if (graphRequestAsyncTask != null) {
            graphRequestAsyncTask.cancel(true);
        }
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.scheduledPoll;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    public void startLogin(com.facebook.login.LoginClient.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("scope", android.text.TextUtils.join(",", request.getPermissions()));
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.internal.ServerProtocol.DIALOG_PARAM_REDIRECT_URI, request.getDeviceRedirectUriString());
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.devicerequests.internal.DeviceRequestsHelper.DEVICE_TARGET_USER_ID, request.getDeviceAuthTargetUserId());
        bundle.putString("access_token", getApplicationAccessToken());
        com.facebook.devicerequests.internal.DeviceRequestsHelper deviceRequestsHelper = com.facebook.devicerequests.internal.DeviceRequestsHelper.INSTANCE;
        java.util.Map<java.lang.String, java.lang.String> additionalDeviceInfo = additionalDeviceInfo();
        bundle.putString(com.facebook.devicerequests.internal.DeviceRequestsHelper.DEVICE_INFO_PARAM, com.facebook.devicerequests.internal.DeviceRequestsHelper.getDeviceInfo(additionalDeviceInfo == null ? null : kotlin.collections.MapsKt.toMutableMap(additionalDeviceInfo)));
        com.facebook.GraphRequest.INSTANCE.newPostRequestWithBundle(null, DEVICE_LOGIN_ENDPOINT, bundle, new com.facebook.GraphRequest.Callback() { // from class: com.facebook.login.DeviceAuthDialog$$ExternalSyntheticLambda6
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                com.facebook.login.DeviceAuthDialog.m5233startLogin$lambda1(com.facebook.login.DeviceAuthDialog.this, graphResponse);
            }
        }).executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startLogin$lambda-1, reason: not valid java name */
    public static final void m5233startLogin$lambda1(com.facebook.login.DeviceAuthDialog this$0, com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.isBeingDestroyed) {
            return;
        }
        if (response.getError() != null) {
            com.facebook.FacebookRequestError error = response.getError();
            com.facebook.FacebookException exception = error == null ? null : error.getException();
            if (exception == null) {
                exception = new com.facebook.FacebookException();
            }
            this$0.onError(exception);
            return;
        }
        org.json.JSONObject graphObject = response.getGraphObject();
        if (graphObject == null) {
            graphObject = new org.json.JSONObject();
        }
        com.facebook.login.DeviceAuthDialog.RequestState requestState = new com.facebook.login.DeviceAuthDialog.RequestState();
        try {
            requestState.setUserCode(graphObject.getString("user_code"));
            requestState.setRequestCode(graphObject.getString("code"));
            requestState.setInterval(graphObject.getLong("interval"));
            this$0.setCurrentRequestState(requestState);
        } catch (org.json.JSONException e) {
            this$0.onError(new com.facebook.FacebookException(e));
        }
    }

    public java.lang.String getApplicationAccessToken() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        sb.append(com.facebook.internal.Validate.hasAppID());
        sb.append('|');
        com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
        sb.append(com.facebook.internal.Validate.hasClientToken());
        return sb.toString();
    }

    private final void setCurrentRequestState(com.facebook.login.DeviceAuthDialog.RequestState currentRequestState) {
        this.currentRequestState = currentRequestState;
        android.widget.TextView textView = this.confirmationCode;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("confirmationCode");
            throw null;
        }
        textView.setText(currentRequestState.getUserCode());
        com.facebook.devicerequests.internal.DeviceRequestsHelper deviceRequestsHelper = com.facebook.devicerequests.internal.DeviceRequestsHelper.INSTANCE;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(getResources(), com.facebook.devicerequests.internal.DeviceRequestsHelper.generateQRCode(currentRequestState.getAuthorizationUri()));
        android.widget.TextView textView2 = this.instructions;
        if (textView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, bitmapDrawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        android.widget.TextView textView3 = this.confirmationCode;
        if (textView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        android.view.View view = this.progressBar;
        if (view == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.isRetry) {
            com.facebook.devicerequests.internal.DeviceRequestsHelper deviceRequestsHelper2 = com.facebook.devicerequests.internal.DeviceRequestsHelper.INSTANCE;
            if (com.facebook.devicerequests.internal.DeviceRequestsHelper.startAdvertisementService(currentRequestState.getUserCode())) {
                new com.facebook.appevents.InternalAppEventsLogger(getContext()).logEventImplicitly(com.facebook.internal.AnalyticsEvents.EVENT_SMART_LOGIN_SERVICE);
            }
        }
        if (currentRequestState.withinLastRefreshWindow()) {
            schedulePoll();
        } else {
            poll();
        }
    }

    protected android.view.View initializeContentView(boolean isSmartLogin) {
        android.view.LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(layoutInflater, "requireActivity().layoutInflater");
        android.view.View inflate = layoutInflater.inflate(getLayoutResId(isSmartLogin), (android.view.ViewGroup) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        android.view.View findViewById = inflate.findViewById(com.facebook.common.R.id.progress_bar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.progress_bar)");
        this.progressBar = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.facebook.common.R.id.confirmation_code);
        if (findViewById2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.confirmationCode = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.facebook.common.R.id.cancel_button);
        if (findViewById3 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        ((android.widget.Button) findViewById3).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.login.DeviceAuthDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facebook.login.DeviceAuthDialog.m5228initializeContentView$lambda2(com.facebook.login.DeviceAuthDialog.this, view);
            }
        });
        android.view.View findViewById4 = inflate.findViewById(com.facebook.common.R.id.com_facebook_device_auth_instructions);
        if (findViewById4 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.instructions = textView;
        if (textView != null) {
            textView.setText(android.text.Html.fromHtml(getString(com.facebook.common.R.string.com_facebook_device_auth_instructions)));
            return inflate;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("instructions");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initializeContentView$lambda-2, reason: not valid java name */
    public static final void m5228initializeContentView$lambda2(com.facebook.login.DeviceAuthDialog this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onCancel();
    }

    protected int getLayoutResId(boolean isSmartLogin) {
        if (isSmartLogin) {
            return com.facebook.common.R.layout.com_facebook_smart_device_dialog_fragment;
        }
        return com.facebook.common.R.layout.com_facebook_device_auth_dialog_fragment;
    }

    private final void poll() {
        com.facebook.login.DeviceAuthDialog.RequestState requestState = this.currentRequestState;
        if (requestState != null) {
            requestState.setLastPoll(new java.util.Date().getTime());
        }
        this.currentGraphRequestPoll = getPollRequest().executeAsync();
    }

    private final void schedulePoll() {
        com.facebook.login.DeviceAuthDialog.RequestState requestState = this.currentRequestState;
        java.lang.Long valueOf = requestState == null ? null : java.lang.Long.valueOf(requestState.getInterval());
        if (valueOf != null) {
            this.scheduledPoll = com.facebook.login.DeviceAuthMethodHandler.INSTANCE.getBackgroundExecutor().schedule(new java.lang.Runnable() { // from class: com.facebook.login.DeviceAuthDialog$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.login.DeviceAuthDialog.m5232schedulePoll$lambda3(com.facebook.login.DeviceAuthDialog.this);
                }
            }, valueOf.longValue(), java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: schedulePoll$lambda-3, reason: not valid java name */
    public static final void m5232schedulePoll$lambda3(com.facebook.login.DeviceAuthDialog this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.poll();
    }

    private final com.facebook.GraphRequest getPollRequest() {
        android.os.Bundle bundle = new android.os.Bundle();
        com.facebook.login.DeviceAuthDialog.RequestState requestState = this.currentRequestState;
        bundle.putString("code", requestState == null ? null : requestState.getRequestCode());
        bundle.putString("access_token", getApplicationAccessToken());
        return com.facebook.GraphRequest.INSTANCE.newPostRequestWithBundle(null, DEVICE_LOGIN_STATUS_ENDPOINT, bundle, new com.facebook.GraphRequest.Callback() { // from class: com.facebook.login.DeviceAuthDialog$$ExternalSyntheticLambda5
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                com.facebook.login.DeviceAuthDialog.m5227_get_pollRequest_$lambda5(com.facebook.login.DeviceAuthDialog.this, graphResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _get_pollRequest_$lambda-5, reason: not valid java name */
    public static final void m5227_get_pollRequest_$lambda5(com.facebook.login.DeviceAuthDialog this$0, com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.completed.get()) {
            return;
        }
        com.facebook.FacebookRequestError error = response.getError();
        if (error != null) {
            int subErrorCode = error.getSubErrorCode();
            if (subErrorCode == LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING || subErrorCode == LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING) {
                this$0.schedulePoll();
                return;
            }
            if (subErrorCode != LOGIN_ERROR_SUBCODE_CODE_EXPIRED) {
                if (subErrorCode == LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED) {
                    this$0.onCancel();
                    return;
                }
                com.facebook.FacebookRequestError error2 = response.getError();
                com.facebook.FacebookException exception = error2 == null ? null : error2.getException();
                if (exception == null) {
                    exception = new com.facebook.FacebookException();
                }
                this$0.onError(exception);
                return;
            }
            com.facebook.login.DeviceAuthDialog.RequestState requestState = this$0.currentRequestState;
            if (requestState != null) {
                com.facebook.devicerequests.internal.DeviceRequestsHelper deviceRequestsHelper = com.facebook.devicerequests.internal.DeviceRequestsHelper.INSTANCE;
                com.facebook.devicerequests.internal.DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            com.facebook.login.LoginClient.Request request = this$0.request;
            if (request != null) {
                this$0.startLogin(request);
                return;
            } else {
                this$0.onCancel();
                return;
            }
        }
        try {
            org.json.JSONObject graphObject = response.getGraphObject();
            if (graphObject == null) {
                graphObject = new org.json.JSONObject();
            }
            java.lang.String string = graphObject.getString("access_token");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "resultObject.getString(\"access_token\")");
            this$0.onSuccess(string, graphObject.getLong(com.facebook.AccessToken.EXPIRES_IN_KEY), java.lang.Long.valueOf(graphObject.optLong(com.facebook.AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
        } catch (org.json.JSONException e) {
            this$0.onError(new com.facebook.FacebookException(e));
        }
    }

    private final void presentConfirmation(final java.lang.String userId, final com.facebook.login.DeviceAuthDialog.PermissionsLists permissions, final java.lang.String accessToken, java.lang.String name, final java.util.Date expirationTime, final java.util.Date dataAccessExpirationTime) {
        java.lang.String string = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        java.lang.String string2 = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_continue_as);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        java.lang.String string3 = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_cancel);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{name}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new android.content.DialogInterface.OnClickListener() { // from class: com.facebook.login.DeviceAuthDialog$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.facebook.login.DeviceAuthDialog.m5230presentConfirmation$lambda6(com.facebook.login.DeviceAuthDialog.this, userId, permissions, accessToken, expirationTime, dataAccessExpirationTime, dialogInterface, i);
            }
        }).setPositiveButton(string3, new android.content.DialogInterface.OnClickListener() { // from class: com.facebook.login.DeviceAuthDialog$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.facebook.login.DeviceAuthDialog.m5231presentConfirmation$lambda8(com.facebook.login.DeviceAuthDialog.this, dialogInterface, i);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: presentConfirmation$lambda-6, reason: not valid java name */
    public static final void m5230presentConfirmation$lambda6(com.facebook.login.DeviceAuthDialog this$0, java.lang.String userId, com.facebook.login.DeviceAuthDialog.PermissionsLists permissions, java.lang.String accessToken, java.util.Date date, java.util.Date date2, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "$userId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "$permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        this$0.completeLogin(userId, permissions, accessToken, date, date2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: presentConfirmation$lambda-8, reason: not valid java name */
    public static final void m5231presentConfirmation$lambda8(com.facebook.login.DeviceAuthDialog this$0, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.view.View initializeContentView = this$0.initializeContentView(false);
        android.app.Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.setContentView(initializeContentView);
        }
        com.facebook.login.LoginClient.Request request = this$0.request;
        if (request == null) {
            return;
        }
        this$0.startLogin(request);
    }

    private final void onSuccess(final java.lang.String accessToken, long expiresIn, java.lang.Long dataAccessExpirationTime) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.facebook.GraphRequest.FIELDS_PARAM, "id,permissions,name");
        final java.util.Date date = null;
        final java.util.Date date2 = expiresIn != 0 ? new java.util.Date(new java.util.Date().getTime() + (expiresIn * 1000)) : null;
        if ((dataAccessExpirationTime == null || dataAccessExpirationTime.longValue() != 0) && dataAccessExpirationTime != null) {
            date = new java.util.Date(dataAccessExpirationTime.longValue() * 1000);
        }
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.GraphRequest newGraphPathRequest = com.facebook.GraphRequest.INSTANCE.newGraphPathRequest(new com.facebook.AccessToken(accessToken, com.facebook.FacebookSdk.getApplicationId(), "0", null, null, null, null, date2, null, date, null, 1024, null), "me", new com.facebook.GraphRequest.Callback() { // from class: com.facebook.login.DeviceAuthDialog$$ExternalSyntheticLambda3
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                com.facebook.login.DeviceAuthDialog.m5229onSuccess$lambda10(com.facebook.login.DeviceAuthDialog.this, accessToken, date2, date, graphResponse);
            }
        });
        newGraphPathRequest.setHttpMethod(com.facebook.HttpMethod.GET);
        newGraphPathRequest.setParameters(bundle);
        newGraphPathRequest.executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-10, reason: not valid java name */
    public static final void m5229onSuccess$lambda10(com.facebook.login.DeviceAuthDialog this$0, java.lang.String accessToken, java.util.Date date, java.util.Date date2, com.facebook.GraphResponse response) {
        java.util.EnumSet<com.facebook.internal.SmartLoginOption> smartLoginOptions;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.completed.get()) {
            return;
        }
        com.facebook.FacebookRequestError error = response.getError();
        if (error != null) {
            com.facebook.FacebookException exception = error.getException();
            if (exception == null) {
                exception = new com.facebook.FacebookException();
            }
            this$0.onError(exception);
            return;
        }
        try {
            org.json.JSONObject graphObject = response.getGraphObject();
            if (graphObject == null) {
                graphObject = new org.json.JSONObject();
            }
            java.lang.String string = graphObject.getString("id");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"id\")");
            com.facebook.login.DeviceAuthDialog.PermissionsLists handlePermissionResponse = INSTANCE.handlePermissionResponse(graphObject);
            java.lang.String string2 = graphObject.getString("name");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"name\")");
            com.facebook.login.DeviceAuthDialog.RequestState requestState = this$0.currentRequestState;
            if (requestState != null) {
                com.facebook.devicerequests.internal.DeviceRequestsHelper deviceRequestsHelper = com.facebook.devicerequests.internal.DeviceRequestsHelper.INSTANCE;
                com.facebook.devicerequests.internal.DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.internal.FetchedAppSettings appSettingsWithoutQuery = com.facebook.internal.FetchedAppSettingsManager.getAppSettingsWithoutQuery(com.facebook.FacebookSdk.getApplicationId());
            java.lang.Boolean bool = null;
            if (appSettingsWithoutQuery != null && (smartLoginOptions = appSettingsWithoutQuery.getSmartLoginOptions()) != null) {
                bool = java.lang.Boolean.valueOf(smartLoginOptions.contains(com.facebook.internal.SmartLoginOption.RequireConfirm));
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) bool, (java.lang.Object) true) && !this$0.isRetry) {
                this$0.isRetry = true;
                this$0.presentConfirmation(string, handlePermissionResponse, accessToken, string2, date, date2);
            } else {
                this$0.completeLogin(string, handlePermissionResponse, accessToken, date, date2);
            }
        } catch (org.json.JSONException e) {
            this$0.onError(new com.facebook.FacebookException(e));
        }
    }

    private final void completeLogin(java.lang.String userId, com.facebook.login.DeviceAuthDialog.PermissionsLists permissions, java.lang.String accessToken, java.util.Date expirationTime, java.util.Date dataAccessExpirationTime) {
        com.facebook.login.DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
        if (deviceAuthMethodHandler != null) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            deviceAuthMethodHandler.onSuccess(accessToken, com.facebook.FacebookSdk.getApplicationId(), userId, permissions.getGrantedPermissions(), permissions.getDeclinedPermissions(), permissions.getExpiredPermissions(), com.facebook.AccessTokenSource.DEVICE_AUTH, expirationTime, null, dataAccessExpirationTime);
        }
        android.app.Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    protected void onError(com.facebook.FacebookException ex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ex, "ex");
        if (this.completed.compareAndSet(false, true)) {
            com.facebook.login.DeviceAuthDialog.RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                com.facebook.devicerequests.internal.DeviceRequestsHelper deviceRequestsHelper = com.facebook.devicerequests.internal.DeviceRequestsHelper.INSTANCE;
                com.facebook.devicerequests.internal.DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            com.facebook.login.DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.onError(ex);
            }
            android.app.Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    protected void onCancel() {
        if (this.completed.compareAndSet(false, true)) {
            com.facebook.login.DeviceAuthDialog.RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                com.facebook.devicerequests.internal.DeviceRequestsHelper deviceRequestsHelper = com.facebook.devicerequests.internal.DeviceRequestsHelper.INSTANCE;
                com.facebook.devicerequests.internal.DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            com.facebook.login.DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.onCancel();
            }
            android.app.Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeviceAuthDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u000f\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0018H\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcelable;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "<set-?>", "", "authorizationUri", "getAuthorizationUri", "()Ljava/lang/String;", "interval", "", "getInterval", "()J", "setInterval", "(J)V", "lastPoll", "requestCode", "getRequestCode", "setRequestCode", "(Ljava/lang/String;)V", "userCode", "describeContents", "", "getUserCode", "setLastPoll", "", "setUserCode", "withinLastRefreshWindow", "", "writeToParcel", "dest", "flags", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    static final class RequestState implements android.os.Parcelable {
        private java.lang.String authorizationUri;
        private long interval;
        private long lastPoll;
        private java.lang.String requestCode;
        private java.lang.String userCode;
        public static final android.os.Parcelable.Creator<com.facebook.login.DeviceAuthDialog.RequestState> CREATOR = new android.os.Parcelable.Creator<com.facebook.login.DeviceAuthDialog.RequestState>() { // from class: com.facebook.login.DeviceAuthDialog$RequestState$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.facebook.login.DeviceAuthDialog.RequestState createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new com.facebook.login.DeviceAuthDialog.RequestState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.facebook.login.DeviceAuthDialog.RequestState[] newArray(int size) {
                return new com.facebook.login.DeviceAuthDialog.RequestState[size];
            }
        };

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final java.lang.String getAuthorizationUri() {
            return this.authorizationUri;
        }

        public final java.lang.String getRequestCode() {
            return this.requestCode;
        }

        public final void setRequestCode(java.lang.String str) {
            this.requestCode = str;
        }

        public final long getInterval() {
            return this.interval;
        }

        public final void setInterval(long j) {
            this.interval = j;
        }

        public RequestState() {
        }

        public final java.lang.String getUserCode() {
            return this.userCode;
        }

        public final void setUserCode(java.lang.String userCode) {
            this.userCode = userCode;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", java.util.Arrays.copyOf(new java.lang.Object[]{userCode}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            this.authorizationUri = format;
        }

        public final void setLastPoll(long lastPoll) {
            this.lastPoll = lastPoll;
        }

        protected RequestState(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.authorizationUri = parcel.readString();
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }

        public final boolean withinLastRefreshWindow() {
            return this.lastPoll != 0 && (new java.util.Date().getTime() - this.lastPoll) - (this.interval * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.authorizationUri);
            dest.writeString(this.userCode);
            dest.writeString(this.requestCode);
            dest.writeLong(this.interval);
            dest.writeLong(this.lastPoll);
        }
    }

    /* compiled from: DeviceAuthDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u00020\f8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$Companion;", "", "()V", "DEVICE_LOGIN_ENDPOINT", "", "getDEVICE_LOGIN_ENDPOINT$facebook_common_release$annotations", "getDEVICE_LOGIN_ENDPOINT$facebook_common_release", "()Ljava/lang/String;", "DEVICE_LOGIN_STATUS_ENDPOINT", "getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release$annotations", "getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release", "LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED", "", "LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING", "getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release$annotations", "getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release", "()I", "LOGIN_ERROR_SUBCODE_CODE_EXPIRED", "LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING", "REQUEST_STATE_KEY", "handlePermissionResponse", "Lcom/facebook/login/DeviceAuthDialog$PermissionsLists;", "result", "Lorg/json/JSONObject;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDEVICE_LOGIN_ENDPOINT$facebook_common_release$annotations() {
        }

        public static /* synthetic */ void getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release$annotations() {
        }

        public static /* synthetic */ void getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release$annotations() {
        }

        private Companion() {
        }

        public final java.lang.String getDEVICE_LOGIN_ENDPOINT$facebook_common_release() {
            return com.facebook.login.DeviceAuthDialog.DEVICE_LOGIN_ENDPOINT;
        }

        public final java.lang.String getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release() {
            return com.facebook.login.DeviceAuthDialog.DEVICE_LOGIN_STATUS_ENDPOINT;
        }

        public final int getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release() {
            return com.facebook.login.DeviceAuthDialog.LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.facebook.login.DeviceAuthDialog.PermissionsLists handlePermissionResponse(org.json.JSONObject result) throws org.json.JSONException {
            java.lang.String optString;
            org.json.JSONArray jSONArray = result.getJSONObject("permissions").getJSONArray("data");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    java.lang.String permission = optJSONObject.optString("permission");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(permission, "permission");
                    if (permission.length() != 0 && !kotlin.jvm.internal.Intrinsics.areEqual(permission, "installed") && (optString = optJSONObject.optString("status")) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(permission);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(permission);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(permission);
                        }
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return new com.facebook.login.DeviceAuthDialog.PermissionsLists(arrayList, arrayList2, arrayList3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeviceAuthDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$PermissionsLists;", "", "grantedPermissions", "", "", "declinedPermissions", "expiredPermissions", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDeclinedPermissions", "()Ljava/util/List;", "setDeclinedPermissions", "(Ljava/util/List;)V", "getExpiredPermissions", "setExpiredPermissions", "getGrantedPermissions", "setGrantedPermissions", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    static final class PermissionsLists {
        private java.util.List<java.lang.String> declinedPermissions;
        private java.util.List<java.lang.String> expiredPermissions;
        private java.util.List<java.lang.String> grantedPermissions;

        public PermissionsLists(java.util.List<java.lang.String> grantedPermissions, java.util.List<java.lang.String> declinedPermissions, java.util.List<java.lang.String> expiredPermissions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declinedPermissions, "declinedPermissions");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiredPermissions, "expiredPermissions");
            this.grantedPermissions = grantedPermissions;
            this.declinedPermissions = declinedPermissions;
            this.expiredPermissions = expiredPermissions;
        }

        public final java.util.List<java.lang.String> getGrantedPermissions() {
            return this.grantedPermissions;
        }

        public final void setGrantedPermissions(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.grantedPermissions = list;
        }

        public final java.util.List<java.lang.String> getDeclinedPermissions() {
            return this.declinedPermissions;
        }

        public final void setDeclinedPermissions(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.declinedPermissions = list;
        }

        public final java.util.List<java.lang.String> getExpiredPermissions() {
            return this.expiredPermissions;
        }

        public final void setExpiredPermissions(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.expiredPermissions = list;
        }
    }
}
