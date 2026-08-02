package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0015\u0010 \u001a\u00020\u001f8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/SignatureFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/widget/TextView;", "getHighSpeedVideoSizes", "Landroid/widget/TextView;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/Observer;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/ViewState;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/Observer;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/ui/SignatureView;", "Lcom/zettle/sdk/feature/taptopay/ui/SignatureView;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel;", "getInputSizeshNQ4ISI", "Lkotlin/Lazy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SignatureFragment extends androidx.fragment.app.Fragment {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private android.widget.TextView getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.widget.TextView getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.zettle.sdk.feature.taptopay.ui.SignatureView getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.Observer<com.zettle.sdk.feature.taptopay.ui.payment.ViewState> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.widget.TextView getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.Lazy getInputSizeshNQ4ISI;

    public SignatureFragment() {
        final com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment signatureFragment = this;
        final kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner> function0 = new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$viewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final androidx.view.ViewModelStoreOwner invoke() {
                androidx.fragment.app.FragmentActivity requireActivity = com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment.this.requireActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
                return requireActivity;
            }

            {
                super(0);
            }
        };
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$special$$inlined$viewModels$default$1
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
        this.getInputSizeshNQ4ISI = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(signatureFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                return androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(kotlin.Lazy.this).getViewModelStore();
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$special$$inlined$viewModels$default$3
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
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$special$$inlined$viewModels$default$4
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
        this.Camera2StreamConfigurationMap = new androidx.view.Observer<com.zettle.sdk.feature.taptopay.ui.payment.ViewState>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$observer$1
            @Override // androidx.view.Observer
            public final /* synthetic */ void onChanged(com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState) {
                com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState2 = viewState;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewState2, "");
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen = viewState2.getScreen();
                if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.RequestSignature) {
                    com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.RequestSignature requestSignature = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.RequestSignature) screen;
                    com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment.access$onRequireSignature(com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment.this, requestSignature.getInfo(), requestSignature.getCardInfo());
                }
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        postponeEnterTransition(1L, java.util.concurrent.TimeUnit.SECONDS);
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        return inflater.inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.fragment_taptopay_payment_signature, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.getInputSizeshNQ4ISI.getValue()).getState().observe(getViewLifecycleOwner(), this.Camera2StreamConfigurationMap);
        android.view.View findViewById = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_signature_widget);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.getHighSpeedVideoFpsRangesFor = (com.zettle.sdk.feature.taptopay.ui.SignatureView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.signature_card_last_four_digits);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_signature_amount);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.getHighSpeedVideoFpsRanges = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_signature_merchant_name);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.getHighSpeedVideoSizes = (android.widget.TextView) findViewById4;
        java.lang.Object systemService = requireContext().getSystemService("accessibility");
        android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
        if (accessibilityManager != null) {
            java.lang.String string = getString(com.zettle.sdk.feature.taptopay.ui.R.string.speech_signature_header);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            com.zettle.sdk.commons.accessibility.SpeechTextUtilsKt.announceText(accessibilityManager, string);
        }
        final android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_signature_clear);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment.$r8$lambda$C5rTRgF6X5dLDCqJNvqwL38Lq8U(com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment.this, view2);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "");
        com.zettle.sdk.common.ui.extensions.ViewExtKt.setAccessibleTouchTarget(textView);
        ((android.widget.ImageView) view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_signature_arrow_back)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment.$r8$lambda$qL0Jd1nIHyfcg8qUqtzHS28RJw4(com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment.this, view2);
            }
        });
        final android.widget.Button button = (android.widget.Button) view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_signature_next);
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment.m23176$r8$lambda$5h0NgoX9lUz8BHN2LUIavJLPi4(com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment.this, view2);
            }
        });
        com.zettle.sdk.feature.taptopay.ui.SignatureView signatureView = this.getHighSpeedVideoFpsRangesFor;
        if (signatureView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            signatureView = null;
        }
        signatureView.setOnContentChangedListener(new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$onViewCreated$4
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                Camera2StreamConfigurationMap(bool.booleanValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(boolean z) {
                boolean z2 = !z;
                button.setEnabled(z2);
                textView.setEnabled(z2);
                textView.setVisibility(z ? 4 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat create = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.create(getResources(), com.zettle.sdk.feature.taptopay.ui.R.drawable.signature_background_pattern, null);
        com.zettle.sdk.feature.taptopay.ui.SignatureView signatureView2 = this.getHighSpeedVideoFpsRangesFor;
        if (signatureView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            signatureView2 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(create);
        signatureView2.setBackground(new com.zettle.sdk.feature.taptopay.ui.payment.TileDrawable(create, android.graphics.Shader.TileMode.REPEAT));
        com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(androidx.view.LifecycleOwnerKt.getLifecycleScope(this), new com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$onViewCreated$5(this, null));
    }

    /* renamed from: $r8$lambda$5h0NgoX9lUz8BHN2-LUIavJLPi4, reason: not valid java name */
    public static /* synthetic */ void m23176$r8$lambda$5h0NgoX9lUz8BHN2LUIavJLPi4(com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment signatureFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signatureFragment, "");
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel tapToPayPaymentViewModel = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) signatureFragment.getInputSizeshNQ4ISI.getValue();
        com.zettle.sdk.feature.taptopay.ui.SignatureView signatureView = signatureFragment.getHighSpeedVideoFpsRangesFor;
        if (signatureView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            signatureView = null;
        }
        tapToPayPaymentViewModel.uploadSignature(signatureView.getSignature());
    }

    public static /* synthetic */ void $r8$lambda$C5rTRgF6X5dLDCqJNvqwL38Lq8U(com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment signatureFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signatureFragment, "");
        com.zettle.sdk.feature.taptopay.ui.SignatureView signatureView = signatureFragment.getHighSpeedVideoFpsRangesFor;
        if (signatureView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            signatureView = null;
        }
        signatureView.clear();
    }

    public static /* synthetic */ void $r8$lambda$qL0Jd1nIHyfcg8qUqtzHS28RJw4(com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment signatureFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signatureFragment, "");
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) signatureFragment.getInputSizeshNQ4ISI.getValue()).cancelTransaction();
    }

    public static final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel access$getViewModel(com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment signatureFragment) {
        return (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) signatureFragment.getInputSizeshNQ4ISI.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r3.equals("ELO_CREDIT") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
    
        r3 = com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_logos_elo_m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f7, code lost:
    
        if (r3.equals("ELO") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010b, code lost:
    
        if (r3.equals("ELO_DEBIT") != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void access$onRequireSignature(com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment signatureFragment, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo cardInfo) {
        int i;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3 = signatureFragment.getHighSpeedVideoFpsRanges;
        android.widget.TextView textView4 = null;
        if (textView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView3 = null;
        }
        java.util.Currency currency = transactionInfo.getGetHighSpeedVideoFpsRanges().getCurrency();
        long getHighSpeedVideoFpsRangesFor = transactionInfo.getGetHighSpeedVideoFpsRangesFor();
        com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder currency2 = new com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder().currency(currency);
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        textView3.setText(currency2.locale(locale).build().format(getHighSpeedVideoFpsRangesFor));
        android.widget.TextView textView5 = signatureFragment.getHighSpeedVideoFpsRanges;
        if (textView5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView5 = null;
        }
        java.util.Currency currency3 = transactionInfo.getGetHighSpeedVideoFpsRanges().getCurrency();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(transactionInfo.getGetHighSpeedVideoFpsRangesFor() / 100.0d);
        sb.append(" ");
        sb.append(currency3);
        textView5.setContentDescription(sb.toString());
        android.widget.TextView textView6 = signatureFragment.getHighResolutionOutputSizeshNQ4ISI;
        if (textView6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView6 = null;
        }
        textView6.setText(cardInfo.getCardLastDigits());
        android.widget.TextView textView7 = signatureFragment.getHighResolutionOutputSizeshNQ4ISI;
        if (textView7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView7 = null;
        }
        java.lang.String cardType = cardInfo.getCardType();
        if (cardType != null) {
            switch (cardType.hashCode()) {
                case -2109615368:
                    if (cardType.equals("UNION_PAY")) {
                        i = com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_logos_unionpay_m;
                        break;
                    }
                    break;
                case -1553624974:
                    if (cardType.equals("MASTERCARD")) {
                        i = com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_logos_mastercard_m;
                        break;
                    }
                    break;
                case -967670187:
                    break;
                case -780280800:
                    if (cardType.equals("VISA_ELECTRON")) {
                        i = com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_logos_electron_m;
                        break;
                    }
                    break;
                case 68744:
                    break;
                case 73257:
                    if (cardType.equals("JCB")) {
                        i = com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_logos_jcb_m;
                        break;
                    }
                    break;
                case 2634817:
                    if (cardType.equals("VISA")) {
                        i = com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_logos_visa_m;
                        break;
                    }
                    break;
                case 50456208:
                    break;
                case 82331935:
                    if (cardType.equals("V_PAY")) {
                        i = com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_logos_vpay_m;
                        break;
                    }
                    break;
                case com.daon.face.quality.DaonFaceQualityException.ERR_UNKNOWN /* 433141802 */:
                    cardType.equals("UNKNOWN");
                    break;
                case 1512044081:
                    if (cardType.equals("AMERICAN_EXPRESS")) {
                        i = com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_logos_amex_m;
                        break;
                    }
                    break;
                case 1545480463:
                    if (cardType.equals("MAESTRO")) {
                        i = com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_logos_maestro_m;
                        break;
                    }
                    break;
                case 1980702025:
                    if (cardType.equals("CARNET")) {
                        i = com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_logos_carnet_m;
                        break;
                    }
                    break;
                case 2016591933:
                    if (cardType.equals("DINERS")) {
                        i = com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_logos_diners_m;
                        break;
                    }
                    break;
            }
            textView7.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
            textView = signatureFragment.getHighResolutionOutputSizeshNQ4ISI;
            if (textView == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textView = null;
            }
            java.lang.String cardType2 = cardInfo.getCardType();
            java.lang.String cardLastDigits = cardInfo.getCardLastDigits();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(cardType2);
            sb2.append(", ");
            sb2.append(cardLastDigits);
            textView.setContentDescription(sb2.toString());
            textView2 = signatureFragment.getHighSpeedVideoSizes;
            if (textView2 != null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                textView4 = textView2;
            }
            textView4.setText(transactionInfo.getGetHighSpeedVideoFpsRanges().getMerchantInfo().getPublicName());
            signatureFragment.startPostponedEnterTransition();
        }
        i = com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_symbols_card_m;
        textView7.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
        textView = signatureFragment.getHighResolutionOutputSizeshNQ4ISI;
        if (textView == null) {
        }
        java.lang.String cardType22 = cardInfo.getCardType();
        java.lang.String cardLastDigits2 = cardInfo.getCardLastDigits();
        java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
        sb22.append(cardType22);
        sb22.append(", ");
        sb22.append(cardLastDigits2);
        textView.setContentDescription(sb22.toString());
        textView2 = signatureFragment.getHighSpeedVideoSizes;
        if (textView2 != null) {
        }
        textView4.setText(transactionInfo.getGetHighSpeedVideoFpsRanges().getMerchantInfo().getPublicName());
        signatureFragment.startPostponedEnterTransition();
    }
}
