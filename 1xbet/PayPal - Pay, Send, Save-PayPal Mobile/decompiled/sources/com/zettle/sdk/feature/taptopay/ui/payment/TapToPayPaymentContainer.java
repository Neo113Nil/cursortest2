package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0015\u0010\u001d\u001a\u00020\u001a8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0016\u0010\u001b\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0015\u0010#\u001a\u00020\"8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u001c"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentContainer;", "Lcom/zettle/sdk/ui/ZettleFragment;", "Lcom/zettle/sdk/core/log/Loggable;", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/fragment/app/Fragment;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Payment;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor", "", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroid/view/ViewGroup;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public class TapToPayPaymentContainer extends com.zettle.sdk.ui.ZettleFragment implements com.zettle.sdk.core.log.Loggable {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private android.view.ViewGroup getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer$action$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment invoke() {
            com.zettle.sdk.ui.SdkViewModel sdkViewModel;
            sdkViewModel = com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer.this.getSdkViewModel();
            com.zettle.sdk.features.Action action = sdkViewModel.getAction();
            com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment payment = action instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment ? (com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment) action : null;
            if (payment != null) {
                return payment;
            }
            throw new java.lang.IllegalArgumentException("The Action must be of type TapToPayAction.Payment");
        }

        {
            super(0);
        }
    });

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        return inflater.inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.tap_to_pay_container, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        com.zettle.sdk.extensions.ViewExtKt.enableEdgeToEdgeScreenInsets(view);
        android.view.View findViewById = requireActivity().findViewById(android.R.id.content);
        kotlin.jvm.internal.Intrinsics.checkNotNull(findViewById);
        android.view.View childAt = ((android.view.ViewGroup) findViewById).getChildAt(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(childAt, "");
        this.getHighSpeedVideoSizes = (android.view.ViewGroup) childAt;
        new com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager(getActivity(), new com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer$onViewCreated$1(this), new com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer$onViewCreated$2(this));
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.Camera2StreamConfigurationMap.getValue()).getState().observe(getViewLifecycleOwner(), new com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.ui.payment.ViewState, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer$onViewCreated$3
            public final void Camera2StreamConfigurationMap(com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState) {
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen = viewState.getScreen();
                com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult result = viewState.getResult();
                com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer.this, java.lang.String.valueOf(result));
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer.access$handleSdkResult(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer.this, result);
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer.access$handleScreenNavigation(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer.this, screen);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState) {
                Camera2StreamConfigurationMap(viewState);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        }));
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.Camera2StreamConfigurationMap.getValue()).onStart();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConfig, "");
        super.onConfigurationChanged(newConfig);
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.Camera2StreamConfigurationMap.getValue()).cancelTransaction();
        if (requireActivity().isFinishing()) {
            return;
        }
        requireActivity().finish();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.fragment.app.Fragment p0) {
        java.lang.String name2 = p0.getClass().getName();
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, name2)) {
            return;
        }
        getChildFragmentManager().beginTransaction().replace(com.zettle.sdk.feature.taptopay.ui.R.id.ttp_root_container, p0).commitNowAllowingStateLoss();
        this.getHighSpeedVideoFpsRanges = name2;
    }

    public TapToPayPaymentContainer() {
        final com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer tapToPayPaymentContainer = this;
        final kotlin.jvm.functions.Function0 function0 = null;
        this.Camera2StreamConfigurationMap = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(tapToPayPaymentContainer, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer$special$$inlined$activityViewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                androidx.view.ViewModelStore getHighSpeedVideoSizes = androidx.fragment.app.Fragment.this.requireActivity().getGetHighSpeedVideoSizes();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getHighSpeedVideoSizes, "");
                return getHighSpeedVideoSizes;
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer$special$$inlined$activityViewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function02 = kotlin.jvm.functions.Function0.this;
                if (function02 != null && (creationExtras = (androidx.view.viewmodel.CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                androidx.view.viewmodel.CreationExtras defaultViewModelCreationExtras = tapToPayPaymentContainer.requireActivity().getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer$viewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference reference;
                long amount;
                com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties paymentProperties;
                reference = ((com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment) com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer.this.getHighSpeedVideoFpsRangesFor.getValue()).getReference();
                amount = ((com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment) com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer.this.getHighSpeedVideoFpsRangesFor.getValue()).getAmount();
                paymentProperties = ((com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment) com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer.this.getHighSpeedVideoFpsRangesFor.getValue()).getPaymentProperties();
                return new com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Factory(reference, amount, paymentProperties);
            }

            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ void access$handleScreenNavigation(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer tapToPayPaymentContainer, com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen) {
        if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Loading) {
            tapToPayPaymentContainer.getHighResolutionOutputSizeshNQ4ISI(new com.zettle.sdk.feature.taptopay.ui.payment.LoadingFragment());
            return;
        }
        if (!(screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Initial)) {
            if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.ReadyToReadCard) {
                if (((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.ReadyToReadCard) screen).getTxUiEvent() == com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.TransactionUIEvent.CARD_READ_OK) {
                    tapToPayPaymentContainer.getHighResolutionOutputSizeshNQ4ISI(new com.zettle.sdk.feature.taptopay.ui.payment.AuthorizingFragment());
                    return;
                } else {
                    tapToPayPaymentContainer.getHighResolutionOutputSizeshNQ4ISI(new com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment());
                    return;
                }
            }
            if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Authorising) {
                tapToPayPaymentContainer.getHighResolutionOutputSizeshNQ4ISI(new com.zettle.sdk.feature.taptopay.ui.payment.AuthorizingFragment());
                return;
            }
            if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.RequestSignature) {
                tapToPayPaymentContainer.getHighResolutionOutputSizeshNQ4ISI(new com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment());
                return;
            }
            if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Approved) {
                tapToPayPaymentContainer.getHighResolutionOutputSizeshNQ4ISI(new com.zettle.sdk.feature.taptopay.ui.payment.ApprovedFragment());
                return;
            }
            if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Failed) {
                tapToPayPaymentContainer.getHighResolutionOutputSizeshNQ4ISI(new com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment());
                return;
            }
            if (!(screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Finalised)) {
                if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.CustomAmountTipping) {
                    tapToPayPaymentContainer.getHighResolutionOutputSizeshNQ4ISI(new com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment());
                    return;
                } else {
                    if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.PercentageTipping) {
                        tapToPayPaymentContainer.getHighResolutionOutputSizeshNQ4ISI(new com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment());
                        return;
                    }
                    return;
                }
            }
            if (tapToPayPaymentContainer.requireActivity().isFinishing()) {
                return;
            }
            tapToPayPaymentContainer.requireActivity().finish();
            return;
        }
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Initial initial = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Initial) screen;
        com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration gratuityFeatureConfiguration = initial.getGratuityFeatureConfiguration();
        if (gratuityFeatureConfiguration != null) {
            if (!(gratuityFeatureConfiguration instanceof com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.Headless)) {
                if (!(gratuityFeatureConfiguration instanceof com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.TippingScreen)) {
                    return;
                }
                com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.TippingScreen tippingScreen = (com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.TippingScreen) gratuityFeatureConfiguration;
                if (!tippingScreen.getPercentages().isEmpty()) {
                    ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) tapToPayPaymentContainer.Camera2StreamConfigurationMap.getValue()).percentageTipping(initial.getAmount(), initial.getCurrency(), tippingScreen.getPercentages());
                    return;
                }
            } else {
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel tapToPayPaymentViewModel = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) tapToPayPaymentContainer.Camera2StreamConfigurationMap.getValue();
                androidx.fragment.app.FragmentActivity requireActivity = tapToPayPaymentContainer.requireActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
                tapToPayPaymentViewModel.startTransaction(requireActivity, ((com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.Headless) gratuityFeatureConfiguration).getGratuityAmount());
                return;
            }
        }
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel tapToPayPaymentViewModel2 = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) tapToPayPaymentContainer.Camera2StreamConfigurationMap.getValue();
        androidx.fragment.app.FragmentActivity requireActivity2 = tapToPayPaymentContainer.requireActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity2, "");
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.startTransaction$default(tapToPayPaymentViewModel2, requireActivity2, 0L, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void access$handleSdkResult(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer tapToPayPaymentContainer, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult tapToPayPaymentResult) {
        if (tapToPayPaymentResult instanceof com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Failed) {
            tapToPayPaymentContainer.getSdkViewModel().prepareResult((com.zettle.sdk.ui.ZettleResult) tapToPayPaymentResult);
        } else if (tapToPayPaymentResult instanceof com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Canceled) {
            tapToPayPaymentContainer.getSdkViewModel().prepareResult((com.zettle.sdk.ui.ZettleResult) tapToPayPaymentResult);
        } else if (tapToPayPaymentResult instanceof com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed) {
            tapToPayPaymentContainer.getSdkViewModel().prepareResult((com.zettle.sdk.ui.ZettleResult) tapToPayPaymentResult);
        }
    }

    public static final /* synthetic */ void access$recoverView(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer tapToPayPaymentContainer) {
        android.view.ViewPropertyAnimator rotation;
        android.view.ViewGroup viewGroup = tapToPayPaymentContainer.getHighSpeedVideoSizes;
        if (viewGroup == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            viewGroup = null;
        }
        android.view.ViewPropertyAnimator animate = viewGroup.animate();
        if (animate == null || (rotation = animate.rotation(0.0f)) == null) {
            return;
        }
        rotation.start();
    }

    public static final /* synthetic */ void access$rotateView(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer tapToPayPaymentContainer) {
        android.view.ViewPropertyAnimator rotation;
        android.view.ViewGroup viewGroup = tapToPayPaymentContainer.getHighSpeedVideoSizes;
        if (viewGroup == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            viewGroup = null;
        }
        android.view.ViewPropertyAnimator animate = viewGroup.animate();
        if (animate == null || (rotation = animate.rotation(180.0f)) == null) {
            return;
        }
        rotation.start();
    }
}
