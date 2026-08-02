package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/izettle/android/auth/OAuthTestActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "", "baseScopes", "[Ljava/lang/String;", "verifyScopes", "Lcom/izettle/android/auth/ZettleAuth;", "zettleAuth$delegate", "Lcom/izettle/android/auth/ServiceLocatorDelegate;", "getZettleAuth", "()Lcom/izettle/android/auth/ZettleAuth;", "zettleAuth"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthTestActivity extends android.app.Activity {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.izettle.android.auth.OAuthTestActivity.class, "zettleAuth", "getZettleAuth()Lcom/izettle/android/auth/ZettleAuth;", 0))};
    private final java.lang.String[] baseScopes;
    private final java.lang.String[] verifyScopes;

    /* renamed from: zettleAuth$delegate, reason: from kotlin metadata */
    private final com.izettle.android.auth.ServiceLocatorDelegate zettleAuth = new com.izettle.android.auth.ServiceLocatorDelegate(com.izettle.android.auth.ZettleAuth.class);

    public OAuthTestActivity() {
        java.lang.String[] strArr = {com.izettle.android.auth.AuthScopes.READ_PURCHASE, com.izettle.android.auth.AuthScopes.WRITE_PURCHASE, com.izettle.android.auth.AuthScopes.READ_PRODUCT, com.izettle.android.auth.AuthScopes.WRITE_PRODUCT, com.izettle.android.auth.AuthScopes.READ_FINANCE, com.izettle.android.auth.AuthScopes.WRITE_FINANCE, com.izettle.android.auth.AuthScopes.READ_USER_INFO, com.izettle.android.auth.AuthScopes.WRITE_USER_INFO, com.izettle.android.auth.AuthScopes.READ_ONLINE_PAYMENT, com.izettle.android.auth.AuthScopes.WRITE_ONLINE_PAYMENT, com.izettle.android.auth.AuthScopes.READ_PAYMENT, com.izettle.android.auth.AuthScopes.WRITE_PAYMENT, com.izettle.android.auth.AuthScopes.ALL_INTERNAL};
        this.baseScopes = strArr;
        this.verifyScopes = (java.lang.String[]) kotlin.collections.ArraysKt.plus((java.lang.Object[]) strArr, (java.lang.Object[]) new java.lang.String[]{com.izettle.android.auth.AuthScopes.WRITE_REFUND, com.izettle.android.auth.AuthScopes.WRITE_REFUND2});
    }

    private final com.izettle.android.auth.ZettleAuth getZettleAuth() {
        return (com.izettle.android.auth.ZettleAuth) this.zettleAuth.getValue(this, $$delegatedProperties[0]);
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.izettle.android.auth.R.layout.activity_oauth_test);
        ((android.widget.Button) findViewById(com.izettle.android.auth.R.id.login)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.izettle.android.auth.OAuthTestActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.izettle.android.auth.OAuthTestActivity.onCreate$lambda$0(com.izettle.android.auth.OAuthTestActivity.this, view);
            }
        });
        ((android.widget.Button) findViewById(com.izettle.android.auth.R.id.verify)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.izettle.android.auth.OAuthTestActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.izettle.android.auth.OAuthTestActivity.onCreate$lambda$1(com.izettle.android.auth.OAuthTestActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(final com.izettle.android.auth.OAuthTestActivity oAuthTestActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTestActivity, "");
        oAuthTestActivity.getZettleAuth().registerUserConfigUpdateListener(new kotlin.jvm.functions.Function1<com.zettle.android.entities.UserConfig, kotlin.Unit>() { // from class: com.izettle.android.auth.OAuthTestActivity$onCreate$1$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.android.entities.UserConfig userConfig) {
                getHighSpeedVideoFpsRangesFor(userConfig);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(com.zettle.android.entities.UserConfig userConfig) {
                com.zettle.android.entities.UserInfo userInfo;
                android.widget.TextView textView = (android.widget.TextView) com.izettle.android.auth.OAuthTestActivity.this.findViewById(com.izettle.android.auth.R.id.username);
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setText((userConfig == null || (userInfo = userConfig.getUserInfo()) == null) ? null : userInfo.getPublicName());
                }
            }

            {
                super(1);
            }
        });
        com.izettle.android.auth.OAuthBrowserLoginSpec.Builder toolbarColor = com.izettle.android.auth.OAuthBrowserLoginSpec.INSTANCE.builder().setActivity((android.app.Activity) oAuthTestActivity).setToolbarColor((java.lang.Integer) (-16711936));
        java.lang.String[] strArr = oAuthTestActivity.baseScopes;
        oAuthTestActivity.getZettleAuth().login(toolbarColor.addScopes((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)).build(), new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.izettle.android.auth.OAuthTestActivity$onCreate$1$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                getHighSpeedVideoFpsRangesFor(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                com.izettle.android.auth.OAuthTestActivity oAuthTestActivity2 = com.izettle.android.auth.OAuthTestActivity.this;
                if (result instanceof com.izettle.android.core.data.result.Success) {
                    oAuthTestActivity2.findViewById(com.izettle.android.auth.R.id.loginSuccess).setVisibility(0);
                }
                com.izettle.android.auth.OAuthTestActivity oAuthTestActivity3 = com.izettle.android.auth.OAuthTestActivity.this;
                if (result instanceof com.izettle.android.core.data.result.Failure) {
                    oAuthTestActivity3.findViewById(com.izettle.android.auth.R.id.loginFail).setVisibility(0);
                }
            }

            {
                super(1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(final com.izettle.android.auth.OAuthTestActivity oAuthTestActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTestActivity, "");
        com.izettle.android.auth.ZettleAuth zettleAuth = oAuthTestActivity.getZettleAuth();
        com.izettle.android.auth.VerifySpec.Builder toolbarColor = com.izettle.android.auth.VerifySpec.INSTANCE.builder().setActivity((android.app.Activity) oAuthTestActivity).setToolbarColor((java.lang.Integer) (-16711936));
        java.lang.String[] strArr = oAuthTestActivity.verifyScopes;
        zettleAuth.verify(toolbarColor.addScopes((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)).build(), new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.izettle.android.auth.OAuthTestActivity$onCreate$2$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                getHighSpeedVideoFpsRanges(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                com.izettle.android.auth.OAuthTestActivity oAuthTestActivity2 = com.izettle.android.auth.OAuthTestActivity.this;
                if (result instanceof com.izettle.android.core.data.result.Success) {
                    oAuthTestActivity2.findViewById(com.izettle.android.auth.R.id.verifySuccess).setVisibility(0);
                }
                com.izettle.android.auth.OAuthTestActivity oAuthTestActivity3 = com.izettle.android.auth.OAuthTestActivity.this;
                if (result instanceof com.izettle.android.core.data.result.Failure) {
                    oAuthTestActivity3.findViewById(com.izettle.android.auth.R.id.verifyFail).setVisibility(0);
                }
            }

            {
                super(1);
            }
        });
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
    }
}
