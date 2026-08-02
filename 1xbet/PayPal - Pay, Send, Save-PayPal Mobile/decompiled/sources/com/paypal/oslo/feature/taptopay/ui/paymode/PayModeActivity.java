package com.paypal.oslo.feature.taptopay.ui.paymode;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0015\u0010\r\u001a\u00020\f8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0015\u0010\u000b\u001a\u00020\u000f8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00118\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010:"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/PayModeActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/viewmodel/PayModeViewModel;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/viewmodel/PromoCardViewModel;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager;", "reAuthPromptManager", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager;", "getReAuthPromptManager", "()Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager;", "setReAuthPromptManager", "(Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager;)V", "Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "navResultManager", "Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "getNavResultManager", "()Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "setNavResultManager", "(Lcom/paypal/oslo/core/navigation/result/NavResultManager;)V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getAppNavigator", "()Lcom/paypal/oslo/core/navigation/AppNavigator;", "setAppNavigator", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalSetPreferredAppForOneTimeUseCase;", "setPreferredAppForOneTimeUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalSetPreferredAppForOneTimeUseCase;", "getSetPreferredAppForOneTimeUseCase", "()Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalSetPreferredAppForOneTimeUseCase;", "setSetPreferredAppForOneTimeUseCase", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalSetPreferredAppForOneTimeUseCase;)V", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalUnsetPreferredAppForOneTimeUseCase;", "unsetPreferredAppForOneTimeUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalUnsetPreferredAppForOneTimeUseCase;", "getUnsetPreferredAppForOneTimeUseCase", "()Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalUnsetPreferredAppForOneTimeUseCase;", "setUnsetPreferredAppForOneTimeUseCase", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalUnsetPreferredAppForOneTimeUseCase;)V", "", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResultLauncher;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.hilt.android.AndroidEntryPoint
/* loaded from: classes15.dex */
public final class PayModeActivity extends com.paypal.oslo.feature.taptopay.ui.paymode.Hilt_PayModeActivity {
    public static final java.lang.String EXTRA_CARD_ID = "extra_card_id";
    public static final java.lang.String EXTRA_SOURCE = "extra_source";
    private boolean Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public com.paypal.oslo.core.navigation.AppNavigator appNavigator;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.result.ActivityResultLauncher<android.content.Intent> getHighSpeedVideoFpsRangesFor = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult(), new androidx.view.result.ActivityResultCallback() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$$ExternalSyntheticLambda5
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(java.lang.Object obj) {
            com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.m20100$r8$lambda$B5R4hl7QHGVG45i1mANbJD1O3A(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.this, (androidx.view.result.ActivityResult) obj);
        }
    });
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;

    @javax.inject.Inject
    public com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager reAuthPromptManager;

    @javax.inject.Inject
    public com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase setPreferredAppForOneTimeUseCase;

    @javax.inject.Inject
    public com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase unsetPreferredAppForOneTimeUseCase;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.Companion(null);
    public static final int $stable = 8;

    public PayModeActivity() {
        final com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity = this;
        final kotlin.jvm.functions.Function0 function0 = null;
        this.getHighSpeedVideoFpsRanges = new androidx.view.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                return androidx.view.ComponentActivity.this.getGetHighSpeedVideoFpsRangesFor();
            }
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                return androidx.view.ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function02 = kotlin.jvm.functions.Function0.this;
                return (function02 == null || (creationExtras = (androidx.view.viewmodel.CreationExtras) function02.invoke()) == null) ? payModeActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
        this.getHighSpeedVideoSizes = new androidx.view.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$special$$inlined$viewModels$default$5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                return androidx.view.ComponentActivity.this.getGetHighSpeedVideoFpsRangesFor();
            }
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$special$$inlined$viewModels$default$4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                return androidx.view.ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$special$$inlined$viewModels$default$6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function02 = kotlin.jvm.functions.Function0.this;
                return (function02 == null || (creationExtras = (androidx.view.viewmodel.CreationExtras) function02.invoke()) == null) ? payModeActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    public final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager getReAuthPromptManager() {
        com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager reAuthPromptManager = this.reAuthPromptManager;
        if (reAuthPromptManager != null) {
            return reAuthPromptManager;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setReAuthPromptManager(com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager reAuthPromptManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reAuthPromptManager, "");
        this.reAuthPromptManager = reAuthPromptManager;
    }

    public final com.paypal.oslo.core.navigation.result.NavResultManager getNavResultManager() {
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager = this.navResultManager;
        if (navResultManager != null) {
            return navResultManager;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setNavResultManager(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
        this.navResultManager = navResultManager;
    }

    public final com.paypal.oslo.core.navigation.AppNavigator getAppNavigator() {
        com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.appNavigator;
        if (appNavigator != null) {
            return appNavigator;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setAppNavigator(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.appNavigator = appNavigator;
    }

    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase getSetPreferredAppForOneTimeUseCase() {
        com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase payPalSetPreferredAppForOneTimeUseCase = this.setPreferredAppForOneTimeUseCase;
        if (payPalSetPreferredAppForOneTimeUseCase != null) {
            return payPalSetPreferredAppForOneTimeUseCase;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setSetPreferredAppForOneTimeUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase payPalSetPreferredAppForOneTimeUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalSetPreferredAppForOneTimeUseCase, "");
        this.setPreferredAppForOneTimeUseCase = payPalSetPreferredAppForOneTimeUseCase;
    }

    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase getUnsetPreferredAppForOneTimeUseCase() {
        com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase payPalUnsetPreferredAppForOneTimeUseCase = this.unsetPreferredAppForOneTimeUseCase;
        if (payPalUnsetPreferredAppForOneTimeUseCase != null) {
            return payPalUnsetPreferredAppForOneTimeUseCase;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setUnsetPreferredAppForOneTimeUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase payPalUnsetPreferredAppForOneTimeUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalUnsetPreferredAppForOneTimeUseCase, "");
        this.unsetPreferredAppForOneTimeUseCase = payPalUnsetPreferredAppForOneTimeUseCase;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/PayModeActivity$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "source", "cardId", "Landroid/content/Intent;", "getIntent", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "EXTRA_SOURCE", "Ljava/lang/String;", "EXTRA_CARD_ID"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ android.content.Intent getIntent$default(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.Companion companion, android.app.Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.getIntent(activity, str, str2);
        }

        public final android.content.Intent getIntent(android.app.Activity activity, java.lang.String source, java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.class);
            if (source != null) {
                intent.putExtra(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.EXTRA_SOURCE, source);
            }
            if (cardId != null) {
                intent.putExtra(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.EXTRA_CARD_ID, cardId);
            }
            return intent;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.ui.paymode.Hilt_PayModeActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
        com.paypal.oslo.feature.taptopay.ui.core.util.LockScreenUtilsKt.allowOnLockScreen$default(this, null, 1, null);
        com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity = this;
        androidx.view.EdgeToEdge.enable$default(payModeActivity, null, null, 3, null);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Starting to observe ViewModel events", null, null, 6, null);
        com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity2 = this;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.LifecycleOwnerKt.getLifecycleScope(payModeActivity2), null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1(this, null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.LifecycleOwnerKt.getLifecycleScope(payModeActivity2), null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeCardListForPromoData$1(this, null), 3, null);
        androidx.view.compose.ComponentActivityKt.setContent$default(payModeActivity, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(869113040, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.$r8$lambda$TrKU5d1a9p9NXta8OwK4Wi19o1c(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }), 1, null);
    }

    @Override // com.paypal.oslo.feature.taptopay.ui.paymode.Hilt_PayModeActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (getSetPreferredAppForOneTimeUseCase().invoke(this)) {
            return;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Could not set PayPal as the preferred app for the current transaction", null, null, 6, null);
    }

    @Override // com.paypal.oslo.feature.taptopay.ui.paymode.Hilt_PayModeActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        getUnsetPreferredAppForOneTimeUseCase().invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "handleReAuthEvent called", null, null, 6, null);
        com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState value = ((com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel) this.getHighSpeedVideoFpsRanges.getValue()).getState().getValue();
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired pendingAuthState = value != null ? value.getPendingAuthState() : null;
        if (pendingAuthState == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PromptReAuthEvent received but no pending auth state", null, null, 6, null);
            ((com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel) this.getHighSpeedVideoFpsRanges.getValue()).onReAuthResult(false);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Auth state present - orchestrating authentication", null, null, 6, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.LifecycleOwnerKt.getLifecycleScope(this), null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$handleReAuthEvent$1(this, pendingAuthState, null), 3, null);
        }
    }

    /* renamed from: $r8$lambda$-B5R4hl7QHGVG45i1mANbJD1O3A, reason: not valid java name */
    public static /* synthetic */ void m20100$r8$lambda$B5R4hl7QHGVG45i1mANbJD1O3A(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, androidx.view.result.ActivityResult activityResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "KeyguardManager result: ".concat(java.lang.String.valueOf(activityResult.getResultCode())), null, null, 6, null);
        ((com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel) payModeActivity.getHighSpeedVideoFpsRanges.getValue()).onReAuthResult(activityResult.getResultCode() == -1);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7oj0nfBoAze8Iuu6aHKp55R6I9c(final com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1535265848, i, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PayModeActivity.kt:174)");
            }
            com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel = (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel) payModeActivity.getHighSpeedVideoFpsRanges.getValue();
            com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel promoCardViewModel = (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel) payModeActivity.getHighSpeedVideoSizes.getValue();
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = payModeActivity.getAppNavigator();
            boolean changedInstance = composer.changedInstance(payModeActivity);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.$r8$lambda$LxyxIDRY_znp9z1fr8lg5Jpmcjw(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(payModeActivity);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.m20102$r8$lambda$nsQfFFfuWfd3KRpgMVpAcWe8uk(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt.PayModeActivityContent(payModeViewModel, promoCardViewModel, appNavigator, function0, (kotlin.jvm.functions.Function1) rememberedValue2, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LxyxIDRY_znp9z1fr8lg5Jpmcjw(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity) {
        payModeActivity.finishAndRemoveTask();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TrKU5d1a9p9NXta8OwK4Wi19o1c(final com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(869113040, i, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.onCreate.<anonymous> (PayModeActivity.kt:172)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.core.navigation.result.NavResultEffectKt.getLocalNavResultManager().provides(payModeActivity.getNavResultManager()), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1356398576, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.m20101$r8$lambda$V2R3RmWDNfRiBFxdUpSAsNRGms(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$V2R3RmWDNfR-iBFxdUpSAsNRGms, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20101$r8$lambda$V2R3RmWDNfRiBFxdUpSAsNRGms(final com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1356398576, i, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.onCreate.<anonymous>.<anonymous> (PayModeActivity.kt:173)");
            }
            com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayWindowInsetsWrapperKt.TapToPayWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1535265848, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.$r8$lambda$7oj0nfBoAze8Iuu6aHKp55R6I9c(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nsQf-FFfuWfd3KRpgMVpAcWe8uk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20102$r8$lambda$nsQfFFfuWfd3KRpgMVpAcWe8uk(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, boolean z) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Payment card visibility changed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isVisible", java.lang.Boolean.valueOf(z))), null, 4, null);
        payModeActivity.getHighResolutionOutputSizeshNQ4ISI = z;
        if (z) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "handlePendingAuthIfNeeded - hasUnhandledReAuthEvent=".concat(java.lang.String.valueOf(payModeActivity.Camera2StreamConfigurationMap)), null, null, 6, null);
            if (payModeActivity.Camera2StreamConfigurationMap) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Handling pending auth event", null, null, 6, null);
                payModeActivity.Camera2StreamConfigurationMap = false;
                payModeActivity.getHighSpeedVideoSizes();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel access$getPromoCardViewModel(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity) {
        return (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel) payModeActivity.getHighSpeedVideoSizes.getValue();
    }

    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel access$getViewModel(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity) {
        return (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel) payModeActivity.getHighSpeedVideoFpsRanges.getValue();
    }

    @Override // com.paypal.oslo.feature.taptopay.ui.paymode.Hilt_PayModeActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.paypal.oslo.feature.taptopay.ui.paymode.Hilt_PayModeActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }
}
