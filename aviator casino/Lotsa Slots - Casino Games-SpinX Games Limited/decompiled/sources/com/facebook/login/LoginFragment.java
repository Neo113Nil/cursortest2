package com.facebook.login;

/* compiled from: LoginFragment.kt */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 82\u00020\u0001:\u00018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0014J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020 H\u0002J\"\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J&\u0010(\u001a\u0004\u0018\u00010\u00142\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010-\u001a\u00020\u001bH\u0016J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020\u001bH\u0016J\b\u00102\u001a\u00020\u001bH\u0016J\u0010\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020'H\u0016J\b\u00105\u001a\u00020\u001bH\u0014J\b\u00106\u001a\u00020\u001bH\u0014J\b\u00107\u001a\u00020\u001bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/facebook/login/LoginFragment;", "Landroidx/fragment/app/Fragment;", "()V", "callingPackage", "", "<set-?>", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "launcher", "getLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "layoutResId", "", "getLayoutResId", "()I", "Lcom/facebook/login/LoginClient;", com.facebook.login.LoginFragment.SAVED_LOGIN_CLIENT, "getLoginClient", "()Lcom/facebook/login/LoginClient;", "progressBar", "Landroid/view/View;", "request", "Lcom/facebook/login/LoginClient$Request;", "createLoginClient", "getLoginMethodHandlerCallback", "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResult;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "hideSpinner", "initializeCallingPackage", "Landroid/app/Activity;", "onActivityResult", "requestCode", com.ironsource.X3.f.f, "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onLoginClientCompleted", "outcome", "Lcom/facebook/login/LoginClient$Result;", com.ironsource.X3.i.t0, com.ironsource.X3.i.u0, "onSaveInstanceState", "outState", "onSpinnerHidden", "onSpinnerShown", "showSpinner", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class LoginFragment extends androidx.fragment.app.Fragment {
    public static final java.lang.String EXTRA_REQUEST = "request";
    private static final java.lang.String NULL_CALLING_PKG_ERROR_MSG = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.";
    public static final java.lang.String REQUEST_KEY = "com.facebook.LoginFragment:Request";
    public static final java.lang.String RESULT_KEY = "com.facebook.LoginFragment:Result";
    private static final java.lang.String SAVED_LOGIN_CLIENT = "loginClient";
    private static final java.lang.String TAG = "LoginFragment";
    private java.lang.String callingPackage;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcher;
    private com.facebook.login.LoginClient loginClient;
    private android.view.View progressBar;
    private com.facebook.login.LoginClient.Request request;

    protected void onSpinnerHidden() {
    }

    protected void onSpinnerShown() {
    }

    public final com.facebook.login.LoginClient getLoginClient() {
        com.facebook.login.LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(SAVED_LOGIN_CLIENT);
        throw null;
    }

    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getLauncher() {
        androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            return activityResultLauncher;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("launcher");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle savedInstanceState) {
        android.os.Bundle bundleExtra;
        super.onCreate(savedInstanceState);
        com.facebook.login.LoginClient loginClient = savedInstanceState == null ? null : (com.facebook.login.LoginClient) savedInstanceState.getParcelable(SAVED_LOGIN_CLIENT);
        if (loginClient != null) {
            loginClient.setFragment(this);
        } else {
            loginClient = createLoginClient();
        }
        this.loginClient = loginClient;
        getLoginClient().setOnCompletedListener(new com.facebook.login.LoginClient.OnCompletedListener() { // from class: com.facebook.login.LoginFragment$$ExternalSyntheticLambda0
            @Override // com.facebook.login.LoginClient.OnCompletedListener
            public final void onCompleted(com.facebook.login.LoginClient.Result result) {
                com.facebook.login.LoginFragment.m5235onCreate$lambda0(com.facebook.login.LoginFragment.this, result);
            }
        });
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        initializeCallingPackage(activity);
        android.content.Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra(REQUEST_KEY)) != null) {
            this.request = (com.facebook.login.LoginClient.Request) bundleExtra.getParcelable("request");
        }
        androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult startActivityForResult = new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult();
        final kotlin.jvm.functions.Function1<androidx.activity.result.ActivityResult, kotlin.Unit> loginMethodHandlerCallback = getLoginMethodHandlerCallback(activity);
        androidx.activity.result.ActivityResultLauncher<android.content.Intent> registerForActivityResult = registerForActivityResult(startActivityForResult, new androidx.activity.result.ActivityResultCallback() { // from class: com.facebook.login.LoginFragment$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.facebook.login.LoginFragment.m5236onCreate$lambda1(kotlin.jvm.functions.Function1.this, (androidx.activity.result.ActivityResult) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.launcher = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m5235onCreate$lambda0(com.facebook.login.LoginFragment this$0, com.facebook.login.LoginClient.Result outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "outcome");
        this$0.onLoginClientCompleted(outcome);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final void m5236onCreate$lambda1(kotlin.jvm.functions.Function1 tmp0, androidx.activity.result.ActivityResult activityResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(activityResult);
    }

    private final kotlin.jvm.functions.Function1<androidx.activity.result.ActivityResult, kotlin.Unit> getLoginMethodHandlerCallback(final androidx.fragment.app.FragmentActivity activity) {
        return new kotlin.jvm.functions.Function1<androidx.activity.result.ActivityResult, kotlin.Unit>() { // from class: com.facebook.login.LoginFragment$getLoginMethodHandlerCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.activity.result.ActivityResult activityResult) {
                invoke2(activityResult);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.activity.result.ActivityResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    com.facebook.login.LoginFragment.this.getLoginClient().onActivityResult(com.facebook.login.LoginClient.INSTANCE.getLoginRequestCode(), result.getResultCode(), result.getData());
                } else {
                    activity.finish();
                }
            }
        };
    }

    protected com.facebook.login.LoginClient createLoginClient() {
        return new com.facebook.login.LoginClient(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getLoginClient().cancelCurrentHandler();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View inflate = inflater.inflate(getLayoutResId(), container, false);
        android.view.View findViewById = inflate.findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.progressBar = findViewById;
        getLoginClient().setBackgroundProcessingListener(new com.facebook.login.LoginClient.BackgroundProcessingListener() { // from class: com.facebook.login.LoginFragment$onCreateView$1
            @Override // com.facebook.login.LoginClient.BackgroundProcessingListener
            public void onBackgroundProcessingStarted() {
                com.facebook.login.LoginFragment.this.showSpinner();
            }

            @Override // com.facebook.login.LoginClient.BackgroundProcessingListener
            public void onBackgroundProcessingStopped() {
                com.facebook.login.LoginFragment.this.hideSpinner();
            }
        });
        return inflate;
    }

    protected int getLayoutResId() {
        return com.facebook.common.R.layout.com_facebook_login_fragment;
    }

    private final void onLoginClientCompleted(com.facebook.login.LoginClient.Result outcome) {
        this.request = null;
        int i = outcome.code == com.facebook.login.LoginClient.Result.Code.CANCEL ? 0 : -1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(RESULT_KEY, outcome);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i, intent);
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.callingPackage == null) {
            android.util.Log.e(TAG, NULL_CALLING_PKG_ERROR_MSG);
            androidx.fragment.app.FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            activity.finish();
            return;
        }
        getLoginClient().startOrContinueAuth(this.request);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        android.view.View view = getView();
        android.view.View findViewById = view == null ? null : view.findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        getLoginClient().onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable(SAVED_LOGIN_CLIENT, getLoginClient());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSpinner() {
        android.view.View view = this.progressBar;
        if (view == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        view.setVisibility(0);
        onSpinnerShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideSpinner() {
        android.view.View view = this.progressBar;
        if (view == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        view.setVisibility(8);
        onSpinnerHidden();
    }

    private final void initializeCallingPackage(android.app.Activity activity) {
        android.content.ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.callingPackage = callingActivity.getPackageName();
    }
}
