package com.zettle.sdk.ui;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0019\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/zettle/sdk/ui/ZettleActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/zettle/sdk/core/log/Loggable;", "<init>", "()V", "", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onStop", "Lcom/zettle/sdk/ui/ZettleResult;", "p0", "Camera2StreamConfigurationMap", "(Lcom/zettle/sdk/ui/ZettleResult;)V", "Lcom/zettle/sdk/features/Action;", "getRunningAction$core_publicRelease", "()Lcom/zettle/sdk/features/Action;", "runningAction", "Lcom/zettle/sdk/ui/ZettleViewModel;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZettleActivity extends androidx.appcompat.app.AppCompatActivity implements com.zettle.sdk.core.log.Loggable {
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    public ZettleActivity() {
        final com.zettle.sdk.ui.ZettleActivity zettleActivity = this;
        final kotlin.jvm.functions.Function0 function0 = null;
        this.getHighSpeedVideoFpsRangesFor = new androidx.view.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.ui.ZettleViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.ui.ZettleActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                return androidx.view.ComponentActivity.this.getGetHighSpeedVideoSizes();
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.ui.ZettleActivity$viewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                android.content.Intent intent = com.zettle.sdk.ui.ZettleActivity.this.getIntent();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "");
                return new com.zettle.sdk.ui.ZettleViewModel.Factory(intent);
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.ui.ZettleActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function02 = kotlin.jvm.functions.Function0.this;
                return (function02 == null || (creationExtras = (androidx.view.viewmodel.CreationExtras) function02.invoke()) == null) ? zettleActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle savedInstanceState) {
        java.lang.Object m23436constructorimpl;
        java.util.Set<java.lang.String> keySet;
        setTheme(com.zettle.sdk.R.style.AppTheme_FloatingStyle_Light);
        super.onCreate(savedInstanceState);
        setContentView(com.zettle.sdk.R.layout.zettle_activity);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        if (!com.zettle.sdk.ZettleSDK.INSTANCE.isInitialized()) {
            com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized sDKNotInitialized = com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized.INSTANCE;
            ((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).reportUnexpectedActivityFinish$core_publicRelease(sDKNotInitialized);
            Camera2StreamConfigurationMap(new com.zettle.sdk.core.error.ZettleSDKError(sDKNotInitialized));
            finish();
        }
        if (savedInstanceState != null) {
            com.zettle.sdk.ui.ZettleActivity zettleActivity = this;
            com.zettle.sdk.core.log.LogKt.debug(zettleActivity, "savedInstanceState is not null.");
            if (!((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).getIsConfigurationChanged()) {
                com.zettle.sdk.core.log.LogKt.debug(zettleActivity, "Finishing SDK due to a process kill.");
                com.zettle.sdk.core.error.ZettleSDKFailureReason.ProcessKilled processKilled = com.zettle.sdk.core.error.ZettleSDKFailureReason.ProcessKilled.INSTANCE;
                ((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).reportUnexpectedActivityFinish$core_publicRelease(processKilled);
                Camera2StreamConfigurationMap(new com.zettle.sdk.core.error.ZettleSDKError(processKilled));
                finish();
            }
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.zettle.sdk.ui.ZettleActivity zettleActivity2 = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).getAction());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
            com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionNotFound actionNotFound = com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionNotFound.INSTANCE;
            ((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).reportUnexpectedActivityFinish$core_publicRelease(actionNotFound);
            Camera2StreamConfigurationMap(new com.zettle.sdk.core.error.ZettleSDKError(actionNotFound));
            finish();
        }
        if (!((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).isActionValid$core_publicRelease()) {
            com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionInvalid actionInvalid = com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionInvalid.INSTANCE;
            ((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).reportUnexpectedActivityFinish$core_publicRelease(actionInvalid);
            Camera2StreamConfigurationMap(new com.zettle.sdk.core.error.ZettleSDKError(actionInvalid));
            finish();
        }
        if (((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).shouldLockToPortrait$core_publicRelease(getResources().getBoolean(com.zettle.sdk.R.bool.is_portrait_only))) {
            setRequestedOrientation(1);
        }
        com.zettle.sdk.ui.ZettleActivity zettleActivity3 = this;
        ((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).getResult$core_publicRelease().observe(zettleActivity3, new com.zettle.sdk.ui.ZettleActivityKt$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1<com.zettle.sdk.ui.ZettleResult, kotlin.Unit>() { // from class: com.zettle.sdk.ui.ZettleActivity$setupObservers$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.ui.ZettleResult zettleResult) {
                getHighResolutionOutputSizeshNQ4ISI(zettleResult);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(com.zettle.sdk.ui.ZettleResult zettleResult) {
                com.zettle.sdk.ui.ZettleActivity zettleActivity4 = com.zettle.sdk.ui.ZettleActivity.this;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zettleResult, "");
                zettleActivity4.Camera2StreamConfigurationMap(zettleResult);
            }

            {
                super(1);
            }
        }));
        ((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).getDone$core_publicRelease().observe(zettleActivity3, new com.zettle.sdk.ui.ZettleActivityKt$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: com.zettle.sdk.ui.ZettleActivity$setupObservers$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                getHighSpeedVideoSizes(bool);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(java.lang.Boolean bool) {
                com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.ui.ZettleActivity.this, "finish activity observer: ".concat(java.lang.String.valueOf(bool)));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
                if (bool.booleanValue()) {
                    com.zettle.sdk.ui.ZettleActivity.this.finish();
                }
            }

            {
                super(1);
            }
        }));
        ((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).getViews$core_publicRelease().observe(zettleActivity3, new com.zettle.sdk.ui.ZettleActivityKt$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1<com.zettle.sdk.ui.NavView, kotlin.Unit>() { // from class: com.zettle.sdk.ui.ZettleActivity$setupObservers$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.ui.NavView navView) {
                getHighResolutionOutputSizeshNQ4ISI(navView);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(com.zettle.sdk.ui.NavView navView) {
                androidx.fragment.app.FragmentTransaction add;
                if (navView == null) {
                    return;
                }
                com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.ui.ZettleActivity.this, "navigating to view ".concat(java.lang.String.valueOf(navView)));
                androidx.fragment.app.FragmentTransaction beginTransaction = com.zettle.sdk.ui.ZettleActivity.this.getSupportFragmentManager().beginTransaction();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(beginTransaction, "");
                boolean replace = navView.getReplace();
                if (replace) {
                    add = beginTransaction.replace(com.zettle.sdk.R.id.container, navView.getFragment());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(add, "");
                } else if (!replace) {
                    add = beginTransaction.add(com.zettle.sdk.R.id.container, navView.getFragment());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(add, "");
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (add.isAddToBackStackAllowed() && navView.getBackstackTag() != null) {
                    add = add.addToBackStack(navView.getBackstackTag());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(add, "");
                }
                add.commitAllowingStateLoss();
            }

            {
                super(1);
            }
        }));
        getSupportFragmentManager().setFragmentResultListener(com.zettle.sdk.core.requirements.RequirementsFragment.RESULT_TAG, zettleActivity3, new androidx.fragment.app.FragmentResultListener() { // from class: com.zettle.sdk.ui.ZettleActivity$$ExternalSyntheticLambda0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                com.zettle.sdk.ui.ZettleActivity.$r8$lambda$p6ZDxNgMvXohpoPrWe845Sjl_yg(com.zettle.sdk.ui.ZettleActivity.this, str, bundle);
            }
        });
        android.os.Bundle extras = getIntent().getExtras();
        com.zettle.sdk.ui.ZettleActivity zettleActivity4 = this;
        com.zettle.sdk.core.log.LogKt.debug(zettleActivity4, ":onCreate -> ".concat(java.lang.String.valueOf("ID: ".concat(java.lang.String.valueOf((extras == null || (keySet = extras.keySet()) == null) ? null : kotlin.collections.CollectionsKt.joinToString$default(keySet, null, null, null, 0, null, null, 63, null))))));
        try {
            ((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).requirements$core_publicRelease();
        } catch (com.zettle.sdk.core.error.ZettleThrowable e) {
            com.zettle.sdk.core.log.LogKt.warn(zettleActivity4, "Got error trying to get requirements for from the feature", e);
            java.lang.String featureId = e.getFeatureId();
            if (featureId == null) {
                featureId = "NO ID";
            }
            com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound featureNotFound = new com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound(featureId);
            ((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).reportUnexpectedActivityFinish$core_publicRelease(featureNotFound);
            Camera2StreamConfigurationMap(new com.zettle.sdk.core.error.ZettleSDKError(featureNotFound));
            finish();
        }
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(findViewById(com.zettle.sdk.R.id.container), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.zettle.sdk.ui.ZettleActivity$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                return com.zettle.sdk.ui.ZettleActivity.m23209$r8$lambda$I5IhPbkMrCL1_oTyJPnt2JAx4(view, windowInsetsCompat);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        ((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).setConfigurationChanged$core_publicRelease(isChangingConfigurations());
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        androidx.fragment.app.Fragment fragment = getSupportFragmentManager().getFragments().size() > 0 ? getSupportFragmentManager().getFragments().get(0) : null;
        if (fragment != null && fragment.getChildFragmentManager().getBackStackEntryCount() > 0) {
            fragment.getChildFragmentManager().popBackStack();
        } else if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).shouldHandleNewIntent$core_publicRelease(intent)) {
            finish();
            startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(com.zettle.sdk.ui.ZettleResult p0) {
        com.zettle.sdk.core.log.LogKt.debug(this, "SDK -> POS: ZettleResult ".concat(java.lang.String.valueOf(p0)));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.zettle.sdk.ui.ZettleIntent.ZETTLE_ACTION, ((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).getAction());
        intent.putExtra("ZettleSDKActivity::Result", p0);
        setResult(-1, intent);
    }

    /* renamed from: $r8$lambda$I-5IhPbkMrCL-1_oTyJPnt2JAx4, reason: not valid java name */
    public static /* synthetic */ androidx.core.view.WindowInsetsCompat m23209$r8$lambda$I5IhPbkMrCL1_oTyJPnt2JAx4(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars() | androidx.core.view.WindowInsetsCompat.Type.displayCutout());
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        marginLayoutParams2.bottomMargin = insets.bottom;
        marginLayoutParams2.topMargin = insets.top;
        marginLayoutParams2.leftMargin = insets.left;
        marginLayoutParams2.rightMargin = insets.right;
        view.setLayoutParams(marginLayoutParams);
        return androidx.core.view.WindowInsetsCompat.CONSUMED;
    }

    public static /* synthetic */ void $r8$lambda$p6ZDxNgMvXohpoPrWe845Sjl_yg(com.zettle.sdk.ui.ZettleActivity zettleActivity, java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleActivity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getInt(com.zettle.sdk.core.requirements.RequirementsFragment.RESULT_EXTRA_CODE, 0) == 1) {
            try {
                ((com.zettle.sdk.ui.ZettleViewModel) zettleActivity.getHighSpeedVideoFpsRangesFor.getValue()).start$core_publicRelease();
                return;
            } catch (com.zettle.sdk.core.error.ZettleThrowable e) {
                com.zettle.sdk.core.log.LogKt.warn(zettleActivity, "Got error trying to start the feature", e);
                java.lang.String featureId = e.getFeatureId();
                if (featureId == null) {
                    featureId = "NO ID";
                }
                com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound featureNotFound = new com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound(featureId);
                ((com.zettle.sdk.ui.ZettleViewModel) zettleActivity.getHighSpeedVideoFpsRangesFor.getValue()).reportUnexpectedActivityFinish$core_publicRelease(featureNotFound);
                zettleActivity.Camera2StreamConfigurationMap(new com.zettle.sdk.core.error.ZettleSDKError(featureNotFound));
            }
        }
        zettleActivity.finish();
    }

    public final com.zettle.sdk.features.Action getRunningAction$core_publicRelease() {
        return ((com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoFpsRangesFor.getValue()).getAction();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }
}
