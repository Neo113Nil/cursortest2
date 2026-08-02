package com.zettle.sdk.feature.taptopay.ui.tipping;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001b\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0015\u0010!\u001a\u00020#8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010$R\u0015\u0010\u001f\u001a\u00020%8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\"\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/PercentageTippingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountComponent;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountComponent;", "getHighSpeedVideoFpsRangesFor", "Landroid/widget/Button;", "getHighSpeedVideoFpsRanges", "Landroid/widget/Button;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/Observer;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/ViewState;", "getHighSpeedVideoSizes", "Landroidx/lifecycle/Observer;", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/PercentageTippingButton;", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/PercentageTippingButton;", "getInputSizeshNQ4ISI", "getInputFormats", "getHighSpeedVideoSizesFor", "getOutputFormats", "Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel;", "Lkotlin/Lazy;", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/TippingViewModel;", "Lcom/google/android/material/appbar/MaterialToolbar;", "getOutputMinFrameDuration", "Lcom/google/android/material/appbar/MaterialToolbar;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PercentageTippingFragment extends androidx.fragment.app.Fragment {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private android.widget.Button Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.view.Observer<com.zettle.sdk.feature.taptopay.ui.payment.ViewState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlin.Lazy getInputSizeshNQ4ISI;
    private com.google.android.material.appbar.MaterialToolbar getOutputMinFrameDuration;

    public PercentageTippingFragment() {
        final com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment percentageTippingFragment = this;
        final kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner> function0 = new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$paymentViewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final androidx.view.ViewModelStoreOwner invoke() {
                androidx.fragment.app.FragmentActivity requireActivity = com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.this.requireActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
                return requireActivity;
            }

            {
                super(0);
            }
        };
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStoreOwner invoke() {
                return (androidx.view.ViewModelStoreOwner) kotlin.jvm.functions.Function0.this.invoke();
            }

            {
                super(0);
            }
        });
        final kotlin.jvm.functions.Function0 function02 = null;
        this.getHighSpeedVideoSizesFor = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(percentageTippingFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                return androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(kotlin.Lazy.this).getGetHighSpeedVideoSizes();
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function03 = kotlin.jvm.functions.Function0.this;
                if (function03 != null && (creationExtras = (androidx.view.viewmodel.CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                androidx.view.ViewModelStoreOwner m9158access$viewModels$lambda1 = androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(lazy);
                androidx.view.HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m9158access$viewModels$lambda1 instanceof androidx.view.HasDefaultViewModelProviderFactory ? (androidx.view.HasDefaultViewModelProviderFactory) m9158access$viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory;
                androidx.view.ViewModelStoreOwner m9158access$viewModels$lambda1 = androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(lazy);
                androidx.view.HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m9158access$viewModels$lambda1 instanceof androidx.view.HasDefaultViewModelProviderFactory ? (androidx.view.HasDefaultViewModelProviderFactory) m9158access$viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory2 = androidx.fragment.app.Fragment.this.getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
                return defaultViewModelProviderFactory2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> function03 = new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$tippingViewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                return new com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel.Factory();
            }
        };
        this.getInputSizeshNQ4ISI = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(percentageTippingFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$special$$inlined$activityViewModels$default$1
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
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function04 = kotlin.jvm.functions.Function0.this;
                if (function04 != null && (creationExtras = (androidx.view.viewmodel.CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                androidx.view.viewmodel.CreationExtras defaultViewModelCreationExtras = percentageTippingFragment.requireActivity().getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, function03 == null ? new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$special$$inlined$activityViewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory = androidx.fragment.app.Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        } : function03);
        this.getHighSpeedVideoFpsRanges = new androidx.view.Observer<com.zettle.sdk.feature.taptopay.ui.payment.ViewState>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$observer$1
            @Override // androidx.view.Observer
            public final /* synthetic */ void onChanged(com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState) {
                com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState2 = viewState;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewState2, "");
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen = viewState2.getScreen();
                if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Initial) {
                    com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Initial initial = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Initial) screen;
                    if (initial.getGratuityFeatureConfiguration() instanceof com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.TippingScreen) {
                        com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.access$onPresentGratuity(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.this, initial.getAmount(), initial.getCurrency(), ((com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.TippingScreen) initial.getGratuityFeatureConfiguration()).getPercentages());
                        return;
                    }
                }
                if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.PercentageTipping) {
                    com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.PercentageTipping percentageTipping = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.PercentageTipping) screen;
                    com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.access$onPresentGratuity(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.this, percentageTipping.getAmount(), percentageTipping.getCurrency(), percentageTipping.getGratuityPercentages());
                }
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        if (com.zettle.sdk.commons.accessibility.FontScaleUtilsKt.isFontScaleEnabled(requireContext)) {
            return inflater.inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.fragment_tap_top_pay_percentage_tipping_accessibility, container, false);
        }
        return inflater.inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.fragment_tap_top_pay_percentage_tipping, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.getHighSpeedVideoSizesFor.getValue()).getState().observe(getViewLifecycleOwner(), this.getHighSpeedVideoFpsRanges);
        android.view.View findViewById = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.amount);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.getHighSpeedVideoFpsRangesFor = (com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent) findViewById;
        android.view.View findViewById2 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.first_option);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = (com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.second_option);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.getOutputFormats = (com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.three_option);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.getInputFormats = (com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.four_option);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.getHighSpeedVideoSizes = (com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.not_now);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.Camera2StreamConfigurationMap = (android.widget.Button) findViewById6;
        android.view.View findViewById7 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.toolbar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.getOutputMinFrameDuration = (com.google.android.material.appbar.MaterialToolbar) findViewById7;
        android.widget.Button button = this.Camera2StreamConfigurationMap;
        com.google.android.material.appbar.MaterialToolbar materialToolbar = null;
        if (button == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            button = null;
        }
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.$r8$lambda$0Jp2sinosk6b1OWxq4WRs31mQk4(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.this, view2);
            }
        });
        com.google.android.material.appbar.MaterialToolbar materialToolbar2 = this.getOutputMinFrameDuration;
        if (materialToolbar2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            materialToolbar = materialToolbar2;
        }
        materialToolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.m23185$r8$lambda$XKRoQfHtJdrmiq25wo6NbA9PeI(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.this, view2);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$0Jp2sinosk6b1OWxq4WRs31mQk4(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment percentageTippingFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentageTippingFragment, "");
        ((com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel) percentageTippingFragment.getInputSizeshNQ4ISI.getValue()).tippingSkipped();
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel tapToPayPaymentViewModel = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) percentageTippingFragment.getHighSpeedVideoSizesFor.getValue();
        androidx.fragment.app.FragmentActivity requireActivity = percentageTippingFragment.requireActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.startTransaction$default(tapToPayPaymentViewModel, requireActivity, 0L, 2, null);
    }

    public static /* synthetic */ void $r8$lambda$9_jZFkRCnlptVOKO1E9t7bR6RnU(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment percentageTippingFragment, java.util.List list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentageTippingFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        ((com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel) percentageTippingFragment.getInputSizeshNQ4ISI.getValue()).startTransaction(((java.lang.Number) list.get(0)).floatValue(), 1);
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel tapToPayPaymentViewModel = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) percentageTippingFragment.getHighSpeedVideoSizesFor.getValue();
        androidx.fragment.app.FragmentActivity requireActivity = percentageTippingFragment.requireActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
        androidx.fragment.app.FragmentActivity fragmentActivity = requireActivity;
        com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton percentageTippingButton = percentageTippingFragment.getHighResolutionOutputSizeshNQ4ISI;
        if (percentageTippingButton == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            percentageTippingButton = null;
        }
        tapToPayPaymentViewModel.startTransaction(fragmentActivity, percentageTippingButton.getGetHighSpeedVideoSizes());
    }

    public static /* synthetic */ void $r8$lambda$GRZD4NfGF4nKQLh9fZl8jOep7V8(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment percentageTippingFragment, java.util.List list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentageTippingFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        ((com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel) percentageTippingFragment.getInputSizeshNQ4ISI.getValue()).startTransaction(((java.lang.Number) list.get(2)).floatValue(), 3);
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel tapToPayPaymentViewModel = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) percentageTippingFragment.getHighSpeedVideoSizesFor.getValue();
        androidx.fragment.app.FragmentActivity requireActivity = percentageTippingFragment.requireActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
        androidx.fragment.app.FragmentActivity fragmentActivity = requireActivity;
        com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton percentageTippingButton = percentageTippingFragment.getInputFormats;
        if (percentageTippingButton == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            percentageTippingButton = null;
        }
        tapToPayPaymentViewModel.startTransaction(fragmentActivity, percentageTippingButton.getGetHighSpeedVideoSizes());
    }

    public static /* synthetic */ void $r8$lambda$QQDCDDGHXbE9Qvw4aTSRtfYTV1I(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment percentageTippingFragment, java.util.List list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentageTippingFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        ((com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel) percentageTippingFragment.getInputSizeshNQ4ISI.getValue()).startTransaction(((java.lang.Number) list.get(1)).floatValue(), 2);
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel tapToPayPaymentViewModel = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) percentageTippingFragment.getHighSpeedVideoSizesFor.getValue();
        androidx.fragment.app.FragmentActivity requireActivity = percentageTippingFragment.requireActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
        androidx.fragment.app.FragmentActivity fragmentActivity = requireActivity;
        com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton percentageTippingButton = percentageTippingFragment.getOutputFormats;
        if (percentageTippingButton == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            percentageTippingButton = null;
        }
        tapToPayPaymentViewModel.startTransaction(fragmentActivity, percentageTippingButton.getGetHighSpeedVideoSizes());
    }

    /* renamed from: $r8$lambda$XKRoQfHtJdrmi-q25wo6NbA9PeI, reason: not valid java name */
    public static /* synthetic */ void m23185$r8$lambda$XKRoQfHtJdrmiq25wo6NbA9PeI(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment percentageTippingFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentageTippingFragment, "");
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) percentageTippingFragment.getHighSpeedVideoSizesFor.getValue()).cancelTransaction();
    }

    /* renamed from: $r8$lambda$pVbTGpCiD1Fb0bhbum-ZByt7FTM, reason: not valid java name */
    public static /* synthetic */ void m23186$r8$lambda$pVbTGpCiD1Fb0bhbumZByt7FTM(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment percentageTippingFragment, long j, java.util.Currency currency, java.util.List list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentageTippingFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) percentageTippingFragment.getHighSpeedVideoSizesFor.getValue()).customAmountTipping(j, currency, list);
    }

    public static final /* synthetic */ void access$onPresentGratuity(final com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment percentageTippingFragment, final long j, final java.util.Currency currency, final java.util.List list) {
        if (currency == null) {
            ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) percentageTippingFragment.getHighSpeedVideoSizesFor.getValue()).cancelTransaction();
            return;
        }
        com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent = percentageTippingFragment.getHighSpeedVideoFpsRangesFor;
        com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton percentageTippingButton = null;
        if (ottoTotalAmountComponent == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            ottoTotalAmountComponent = null;
        }
        androidx.appcompat.widget.AppCompatTextView amountValueTextView = ottoTotalAmountComponent.getAmountValueTextView();
        com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder currency2 = new com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder().currency(currency);
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        amountValueTextView.setText(currency2.locale(locale).build().format(j).toString());
        ((com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel) percentageTippingFragment.getInputSizeshNQ4ISI.getValue()).onPercentageScreenViewed(j, ((java.lang.Number) list.get(0)).floatValue(), ((java.lang.Number) list.get(1)).floatValue(), ((java.lang.Number) list.get(2)).floatValue());
        com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton percentageTippingButton2 = percentageTippingFragment.getHighResolutionOutputSizeshNQ4ISI;
        if (percentageTippingButton2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            percentageTippingButton2 = null;
        }
        percentageTippingButton2.setTipAmount(new com.zettle.sdk.feature.taptopay.ui.tipping.component.TippingOption(j, ((java.lang.Number) list.get(0)).floatValue()), currency);
        com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton percentageTippingButton3 = percentageTippingFragment.getOutputFormats;
        if (percentageTippingButton3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            percentageTippingButton3 = null;
        }
        percentageTippingButton3.setTipAmount(new com.zettle.sdk.feature.taptopay.ui.tipping.component.TippingOption(j, ((java.lang.Number) list.get(1)).floatValue()), currency);
        com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton percentageTippingButton4 = percentageTippingFragment.getInputFormats;
        if (percentageTippingButton4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            percentageTippingButton4 = null;
        }
        percentageTippingButton4.setTipAmount(new com.zettle.sdk.feature.taptopay.ui.tipping.component.TippingOption(j, ((java.lang.Number) list.get(2)).floatValue()), currency);
        com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton percentageTippingButton5 = percentageTippingFragment.getHighSpeedVideoSizes;
        if (percentageTippingButton5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            percentageTippingButton5 = null;
        }
        percentageTippingButton5.setCustomAmount();
        com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton percentageTippingButton6 = percentageTippingFragment.getHighResolutionOutputSizeshNQ4ISI;
        if (percentageTippingButton6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            percentageTippingButton6 = null;
        }
        percentageTippingButton6.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.$r8$lambda$9_jZFkRCnlptVOKO1E9t7bR6RnU(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.this, list, view);
            }
        });
        com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton percentageTippingButton7 = percentageTippingFragment.getOutputFormats;
        if (percentageTippingButton7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            percentageTippingButton7 = null;
        }
        percentageTippingButton7.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.$r8$lambda$QQDCDDGHXbE9Qvw4aTSRtfYTV1I(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.this, list, view);
            }
        });
        com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton percentageTippingButton8 = percentageTippingFragment.getInputFormats;
        if (percentageTippingButton8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            percentageTippingButton8 = null;
        }
        percentageTippingButton8.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.$r8$lambda$GRZD4NfGF4nKQLh9fZl8jOep7V8(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.this, list, view);
            }
        });
        com.zettle.sdk.feature.taptopay.ui.tipping.component.PercentageTippingButton percentageTippingButton9 = percentageTippingFragment.getHighSpeedVideoSizes;
        if (percentageTippingButton9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            percentageTippingButton = percentageTippingButton9;
        }
        percentageTippingButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.m23186$r8$lambda$pVbTGpCiD1Fb0bhbumZByt7FTM(com.zettle.sdk.feature.taptopay.ui.tipping.PercentageTippingFragment.this, j, currency, list, view);
            }
        });
    }
}
