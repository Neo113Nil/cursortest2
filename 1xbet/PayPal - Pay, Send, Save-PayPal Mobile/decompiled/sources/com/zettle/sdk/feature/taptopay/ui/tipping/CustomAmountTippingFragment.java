package com.zettle.sdk.feature.taptopay.ui.tipping;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u001e\u001a\u00060\u0006j\u0002`\u001f2\n\u0010\u0003\u001a\u00060\u0006j\u0002`\u001f2\u0006\u0010 \u001a\u00020!H\u0002J$\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020\u001d2\b\b\u0002\u0010/\u001a\u000200H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/CustomAmountTippingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "amount", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountComponent;", "amountBuilder", "Ljava/lang/StringBuilder;", "kotlin.jvm.PlatformType", "currency", "Ljava/util/Currency;", "keypad", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad;", "observer", "Landroidx/lifecycle/Observer;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/ViewState;", "pay", "Landroid/widget/Button;", "paymentViewModel", "Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel;", "getPaymentViewModel", "()Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel;", "paymentViewModel$delegate", "Lkotlin/Lazy;", "tippingViewModel", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/TippingViewModel;", "getTippingViewModel", "()Lcom/zettle/sdk/feature/taptopay/ui/tipping/TippingViewModel;", "tippingViewModel$delegate", "transactionAmount", "", "handleKeypadValue", "Lkotlin/text/StringBuilder;", "input", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setAmount", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "showError", "", "ui_publicRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CustomAmountTippingFragment extends androidx.fragment.app.Fragment {
    public static final int $stable = 8;
    private com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad Camera2StreamConfigurationMap;
    private final androidx.view.Observer<com.zettle.sdk.feature.taptopay.ui.payment.ViewState> getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.StringBuilder getHighSpeedVideoFpsRanges = new java.lang.StringBuilder("0");
    private com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent getHighSpeedVideoFpsRangesFor;
    private java.util.Currency getHighSpeedVideoSizes;
    private long getHighSpeedVideoSizesFor;
    private final kotlin.Lazy getInputFormats;
    private android.widget.Button getInputSizeshNQ4ISI;
    private final kotlin.Lazy getOutputFormats;

    public CustomAmountTippingFragment() {
        final com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment customAmountTippingFragment = this;
        final kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner> function0 = new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment$paymentViewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final androidx.view.ViewModelStoreOwner invoke() {
                androidx.fragment.app.FragmentActivity requireActivity = com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this.requireActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
                return requireActivity;
            }

            {
                super(0);
            }
        };
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment$special$$inlined$viewModels$default$1
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
        this.getOutputFormats = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(customAmountTippingFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                return androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(kotlin.Lazy.this).getGetHighSpeedVideoSizes();
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment$special$$inlined$viewModels$default$3
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
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment$special$$inlined$viewModels$default$4
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
        kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> function03 = new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment$tippingViewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                return new com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel.Factory();
            }
        };
        this.getInputFormats = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(customAmountTippingFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment$special$$inlined$activityViewModels$default$1
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
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function04 = kotlin.jvm.functions.Function0.this;
                if (function04 != null && (creationExtras = (androidx.view.viewmodel.CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                androidx.view.viewmodel.CreationExtras defaultViewModelCreationExtras = customAmountTippingFragment.requireActivity().getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, function03 == null ? new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment$special$$inlined$activityViewModels$default$3
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
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.view.Observer<com.zettle.sdk.feature.taptopay.ui.payment.ViewState>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment$observer$1
            @Override // androidx.view.Observer
            public final /* synthetic */ void onChanged(com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState) {
                java.lang.StringBuilder sb;
                com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState2 = viewState;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewState2, "");
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen = viewState2.getScreen();
                if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.CustomAmountTipping) {
                    com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.CustomAmountTipping customAmountTipping = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.CustomAmountTipping) screen;
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this.getHighSpeedVideoSizes = customAmountTipping.getCurrency();
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this.getHighSpeedVideoSizesFor = customAmountTipping.getAmount();
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment customAmountTippingFragment2 = com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this;
                    sb = customAmountTippingFragment2.getHighSpeedVideoFpsRanges;
                    java.lang.String obj = sb.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                    customAmountTippingFragment2.getHighSpeedVideoFpsRangesFor(java.lang.Long.parseLong(obj), false);
                }
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.view.View inflate = inflater.inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.fragment_tap_to_pay_custom_amount_tipping, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.getOutputFormats.getValue()).getState().observe(getViewLifecycleOwner(), this.getHighResolutionOutputSizeshNQ4ISI);
        android.view.View findViewById = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.amount);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.getHighSpeedVideoFpsRangesFor = (com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent) findViewById;
        android.view.View findViewById2 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.pad);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad keyPad = (com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad) findViewById2;
        this.Camera2StreamConfigurationMap = keyPad;
        android.widget.Button button = null;
        if (keyPad == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            keyPad = null;
        }
        keyPad.getAction(new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment$onViewCreated$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action action) {
                getHighSpeedVideoFpsRangesFor(action);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action action) {
                long j;
                java.lang.StringBuilder sb;
                java.lang.StringBuilder sb2;
                java.lang.StringBuilder sb3;
                java.lang.StringBuilder sb4;
                java.lang.StringBuilder sb5;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
                j = com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this.getHighSpeedVideoSizesFor;
                float maxGratuityPercent = (j * com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.access$getTippingViewModel(com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this).getMaxGratuityPercent()) / 100.0f;
                com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment customAmountTippingFragment = com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this;
                sb = customAmountTippingFragment.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
                java.lang.String obj = com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.access$handleKeypadValue(customAmountTippingFragment, sb, action).toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                long parseLong = java.lang.Long.parseLong(obj);
                if (parseLong <= 0) {
                    sb4 = com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this.getHighSpeedVideoFpsRanges;
                    sb4.setLength(0);
                    sb5 = com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this.getHighSpeedVideoFpsRanges;
                    sb5.append(0);
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this.getHighSpeedVideoFpsRangesFor(0L, false);
                    return;
                }
                if (parseLong > maxGratuityPercent) {
                    long j2 = (long) maxGratuityPercent;
                    sb2 = com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this.getHighSpeedVideoFpsRanges;
                    sb2.setLength(0);
                    sb3 = com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this.getHighSpeedVideoFpsRanges;
                    sb3.append(j2);
                    com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this.getHighSpeedVideoFpsRangesFor(j2, true);
                    return;
                }
                com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this.getHighSpeedVideoFpsRangesFor(parseLong, false);
            }

            {
                super(1);
            }
        });
        android.view.View findViewById3 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.next);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        android.widget.Button button2 = (android.widget.Button) findViewById3;
        this.getInputSizeshNQ4ISI = button2;
        if (button2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            button = button2;
        }
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.m23184$r8$lambda$5rOxgWUFhixTNIqn0YEitdATFE(com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(long j, boolean z) {
        android.widget.Button button = null;
        if (z) {
            long maxGratuityPercent = (long) ((this.getHighSpeedVideoSizesFor * ((com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel) this.getInputFormats.getValue()).getMaxGratuityPercent()) / 100.0f);
            com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent = this.getHighSpeedVideoFpsRangesFor;
            if (ottoTotalAmountComponent == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                ottoTotalAmountComponent = null;
            }
            int i = com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_tipping_amount_limit;
            java.util.Currency currency = this.getHighSpeedVideoSizes;
            if (currency == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                currency = null;
            }
            ottoTotalAmountComponent.setSecondaryTextBottom(getString(i, com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPadKt.format(maxGratuityPercent, currency)));
        } else {
            com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent2 = this.getHighSpeedVideoFpsRangesFor;
            if (ottoTotalAmountComponent2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                ottoTotalAmountComponent2 = null;
            }
            ottoTotalAmountComponent2.setSecondaryTextBottom(null);
        }
        com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder builder = new com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder();
        java.util.Currency currency2 = this.getHighSpeedVideoSizes;
        if (currency2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            currency2 = null;
        }
        com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder currency3 = builder.currency(currency2);
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        com.zettle.sdk.common.ui.text.CurrencyFormatter build = currency3.locale(locale).build();
        com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent3 = this.getHighSpeedVideoFpsRangesFor;
        if (ottoTotalAmountComponent3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            ottoTotalAmountComponent3 = null;
        }
        ottoTotalAmountComponent3.setOttoAmount(build.formatAsOttoAmount(j));
        android.widget.Button button2 = this.getInputSizeshNQ4ISI;
        if (button2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            button = button2;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_tipping_pay_button);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{build.format(j + this.getHighSpeedVideoSizesFor)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        button.setText(format);
    }

    /* renamed from: $r8$lambda$5rOxgWUFhixTNIqn0YEitdA-TFE, reason: not valid java name */
    public static /* synthetic */ void m23184$r8$lambda$5rOxgWUFhixTNIqn0YEitdATFE(com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment customAmountTippingFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAmountTippingFragment, "");
        java.lang.String obj = customAmountTippingFragment.getHighSpeedVideoFpsRanges.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        long parseLong = java.lang.Long.parseLong(obj);
        com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel.startTransaction$default((com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel) customAmountTippingFragment.getInputFormats.getValue(), null, java.lang.Long.valueOf(parseLong), 1, null);
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel tapToPayPaymentViewModel = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) customAmountTippingFragment.getOutputFormats.getValue();
        androidx.fragment.app.FragmentActivity requireActivity = customAmountTippingFragment.requireActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
        tapToPayPaymentViewModel.startTransaction(requireActivity, parseLong);
    }

    public static final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel access$getTippingViewModel(com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment customAmountTippingFragment) {
        return (com.zettle.sdk.feature.taptopay.ui.tipping.TippingViewModel) customAmountTippingFragment.getInputFormats.getValue();
    }

    public static final /* synthetic */ java.lang.StringBuilder access$handleKeypadValue(com.zettle.sdk.feature.taptopay.ui.tipping.CustomAmountTippingFragment customAmountTippingFragment, java.lang.StringBuilder sb, com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action action) {
        if (action instanceof com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Delete) {
            sb.deleteCharAt(sb.length() - 1);
            java.lang.StringBuilder sb2 = sb;
            if (sb2.length() == 0) {
                sb.append(0);
            } else {
                sb = sb2;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            return sb;
        }
        if (action instanceof com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number) {
            sb.append(((com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number) action).getInput());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            return sb;
        }
        if (!(action instanceof com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.DoubleZero)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        sb.append(((com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.DoubleZero) action).getValue());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        return sb;
    }
}
