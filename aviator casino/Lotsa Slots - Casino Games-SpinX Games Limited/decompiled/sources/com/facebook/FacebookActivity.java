package com.facebook;

/* compiled from: FacebookActivity.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J7\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\b\u0010\u0014\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/FragmentActivity;", "()V", "<set-?>", "Landroidx/fragment/app/Fragment;", "currentFragment", "getCurrentFragment", "()Landroidx/fragment/app/Fragment;", "dump", "", "prefix", "", "fd", "Ljava/io/FileDescriptor;", "writer", "Ljava/io/PrintWriter;", "args", "", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "getFragment", "handlePassThroughError", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class FacebookActivity extends androidx.fragment.app.FragmentActivity {
    private static final java.lang.String FRAGMENT_TAG = "SingleFragment";
    public static final java.lang.String PASS_THROUGH_CANCEL_ACTION = "PassThrough";
    private androidx.fragment.app.Fragment currentFragment;
    private static final java.lang.String TAG = com.facebook.FacebookActivity.class.getName();

    public final androidx.fragment.app.Fragment getCurrentFragment() {
        return this.currentFragment;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.content.Intent intent = getIntent();
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (!com.facebook.FacebookSdk.isInitialized()) {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.logd(TAG, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            android.content.Context applicationContext = getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            com.facebook.FacebookSdk.sdkInitialize(applicationContext);
        }
        setContentView(com.facebook.common.R.layout.com_facebook_activity_layout);
        if (kotlin.jvm.internal.Intrinsics.areEqual(PASS_THROUGH_CANCEL_ACTION, intent.getAction())) {
            handlePassThroughError();
        } else {
            this.currentFragment = getFragment();
        }
    }

    protected androidx.fragment.app.Fragment getFragment() {
        android.content.Intent intent = getIntent();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        androidx.fragment.app.Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(FRAGMENT_TAG);
        if (findFragmentByTag != null) {
            return findFragmentByTag;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(com.facebook.internal.FacebookDialogFragment.TAG, intent.getAction())) {
            com.facebook.internal.FacebookDialogFragment facebookDialogFragment = new com.facebook.internal.FacebookDialogFragment();
            facebookDialogFragment.setRetainInstance(true);
            facebookDialogFragment.show(supportFragmentManager, FRAGMENT_TAG);
            return facebookDialogFragment;
        }
        com.facebook.login.LoginFragment loginFragment = new com.facebook.login.LoginFragment();
        loginFragment.setRetainInstance(true);
        supportFragmentManager.beginTransaction().add(com.facebook.common.R.id.com_facebook_fragment_container, loginFragment, FRAGMENT_TAG).commit();
        return loginFragment;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        androidx.fragment.app.Fragment fragment = this.currentFragment;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(newConfig);
    }

    private final void handlePassThroughError() {
        android.content.Intent requestIntent = getIntent();
        com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestIntent, "requestIntent");
        android.os.Bundle methodArgumentsFromIntent = com.facebook.internal.NativeProtocol.getMethodArgumentsFromIntent(requestIntent);
        com.facebook.internal.NativeProtocol nativeProtocol2 = com.facebook.internal.NativeProtocol.INSTANCE;
        com.facebook.FacebookException exceptionFromErrorData = com.facebook.internal.NativeProtocol.getExceptionFromErrorData(methodArgumentsFromIntent);
        com.facebook.internal.NativeProtocol nativeProtocol3 = com.facebook.internal.NativeProtocol.INSTANCE;
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "intent");
        setResult(0, com.facebook.internal.NativeProtocol.createProtocolResultIntent(intent, null, exceptionFromErrorData));
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void dump(java.lang.String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
            com.facebook.internal.logging.dumpsys.EndToEndDumper companion = com.facebook.internal.logging.dumpsys.EndToEndDumper.INSTANCE.getInstance();
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) (companion == null ? null : java.lang.Boolean.valueOf(companion.maybeDump(prefix, writer, args))), (java.lang.Object) true)) {
                return;
            }
            super.dump(prefix, fd, writer, args);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
