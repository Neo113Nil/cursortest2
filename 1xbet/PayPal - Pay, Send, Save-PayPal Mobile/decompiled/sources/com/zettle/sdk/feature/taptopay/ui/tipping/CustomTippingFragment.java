package com.zettle.sdk.feature.taptopay.ui.tipping;

@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0015\u0010\u0019\u001a\u00020\"8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0015\u0010*\u001a\u00020(8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b)\u0010#R\u0016\u0010)\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010,R\u0016\u0010%\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/CustomTippingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/fragment/app/Fragment;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ljava/util/Currency;", "getHighSpeedVideoSizes", "Ljava/util/Currency;", "", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/lifecycle/Observer;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/ViewState;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/Observer;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel;", "Lkotlin/Lazy;", "Lcom/google/android/material/tabs/TabLayout;", "getOutputFormats", "Lcom/google/android/material/tabs/TabLayout;", "getOutputMinFrameDuration", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/TippingViewModel;", "getInputSizeshNQ4ISI", "getInputFormats", "Lcom/google/android/material/appbar/MaterialToolbar;", "Lcom/google/android/material/appbar/MaterialToolbar;", "", "getHighSpeedVideoSizesFor", "J"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CustomTippingFragment extends androidx.fragment.app.Fragment {
    public static final int $stable = 8;
    private final androidx.view.Observer<com.zettle.sdk.feature.taptopay.ui.payment.ViewState> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.List<java.lang.Float> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.util.Currency getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private long getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private com.google.android.material.appbar.MaterialToolbar getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private com.google.android.material.tabs.TabLayout getOutputMinFrameDuration;

    public CustomTippingFragment() {
        final com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment customTippingFragment = this;
        final kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner> function0 = new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment$paymentViewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final androidx.view.ViewModelStoreOwner invoke() {
                androidx.fragment.app.FragmentActivity requireActivity = com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment.this.requireActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
                return requireActivity;
            }

            {
                super(0);
            }
        };
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment$special$$inlined$viewModels$default$1
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
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(customTippingFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                return androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(kotlin.Lazy.this).getGetHighSpeedVideoSizes();
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment$special$$inlined$viewModels$default$3
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
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment$special$$inlined$viewModels$default$4
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
        kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> function03 = new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment$tippingViewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                return new com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel.Factory();
            }
        };
        this.getInputFormats = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(customTippingFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment$special$$inlined$activityViewModels$default$1
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
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function04 = kotlin.jvm.functions.Function0.this;
                if (function04 != null && (creationExtras = (androidx.view.viewmodel.CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                androidx.view.viewmodel.CreationExtras defaultViewModelCreationExtras = customTippingFragment.requireActivity().getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, function03 == null ? new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment$special$$inlined$activityViewModels$default$3
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
        this.Camera2StreamConfigurationMap = new androidx.view.Observer<com.zettle.sdk.feature.taptopay.ui.payment.ViewState>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment$observer$1
            @Override // androidx.view.Observer
            public final /* synthetic */ void onChanged(com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState) {
                com.google.android.material.appbar.MaterialToolbar materialToolbar;
                com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState2 = viewState;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewState2, "");
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen = viewState2.getScreen();
                if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.CustomAmountTipping) {
                    com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.CustomAmountTipping customAmountTipping = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.CustomAmountTipping) screen;
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment.this.getHighSpeedVideoSizes = customAmountTipping.getCurrency();
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment.this.getOutputFormats = customAmountTipping.getAmount();
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment.this.getHighSpeedVideoFpsRangesFor = customAmountTipping.getGratuityPercentages();
                    materialToolbar = com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment.this.getInputSizeshNQ4ISI;
                    if (materialToolbar == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        materialToolbar = null;
                    }
                    materialToolbar.setTitle(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPadKt.format(customAmountTipping.getAmount(), customAmountTipping.getCurrency()));
                }
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.view.View inflate = inflater.inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.fragment_tap_to_pay_custom_tipping, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).getState().observe(getViewLifecycleOwner(), this.Camera2StreamConfigurationMap);
        ((com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel) this.getInputFormats.getValue()).onCustomerTipScreenViewed();
        android.view.View findViewById = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.tabLayout);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) findViewById;
        this.getOutputMinFrameDuration = tabLayout;
        com.google.android.material.appbar.MaterialToolbar materialToolbar = null;
        if (tabLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            tabLayout = null;
        }
        tabLayout.addOnTabSelectedListener(new com.google.android.material.tabs.TabLayout.OnTabSelectedListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment$onViewCreated$1
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(com.google.android.material.tabs.TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(com.google.android.material.tabs.TabLayout.Tab tab) {
                java.lang.Integer valueOf = tab != null ? java.lang.Integer.valueOf(tab.getPosition()) : null;
                if (valueOf != null && valueOf.intValue() == 0) {
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment.this.getHighSpeedVideoFpsRangesFor(new com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment());
                } else {
                    if (valueOf == null || valueOf.intValue() != 1) {
                        return;
                    }
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment.this.getHighSpeedVideoFpsRangesFor(new com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment());
                }
            }
        });
        getHighSpeedVideoFpsRangesFor(new com.zettle.sdk.feature.taptopay.ui.tipping.CustomPercentageTippingFragment());
        android.view.View findViewById2 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.toolbar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        com.google.android.material.appbar.MaterialToolbar materialToolbar2 = (com.google.android.material.appbar.MaterialToolbar) findViewById2;
        this.getInputSizeshNQ4ISI = materialToolbar2;
        if (materialToolbar2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            materialToolbar = materialToolbar2;
        }
        materialToolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment.$r8$lambda$vWJ_CfDqnd9OSkKjY0ezqz8QIUY(com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(androidx.fragment.app.Fragment p0) {
        java.lang.String name2 = p0.getClass().getName();
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, name2)) {
            return;
        }
        getChildFragmentManager().beginTransaction().replace(com.zettle.sdk.feature.taptopay.ui.R.id.container, p0).commitNowAllowingStateLoss();
        this.getHighSpeedVideoFpsRanges = name2;
    }

    public static /* synthetic */ void $r8$lambda$vWJ_CfDqnd9OSkKjY0ezqz8QIUY(com.zettle.sdk.feature.taptopay.ui.tipping.CustomTippingFragment customTippingFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customTippingFragment, "");
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel tapToPayPaymentViewModel = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) customTippingFragment.getHighResolutionOutputSizeshNQ4ISI.getValue();
        long j = customTippingFragment.getOutputFormats;
        java.util.Currency currency = customTippingFragment.getHighSpeedVideoSizes;
        java.util.List<java.lang.Float> list = null;
        if (currency == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            currency = null;
        }
        java.util.List<java.lang.Float> list2 = customTippingFragment.getHighSpeedVideoFpsRangesFor;
        if (list2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            list = list2;
        }
        tapToPayPaymentViewModel.percentageTipping(j, currency, list);
    }
}
