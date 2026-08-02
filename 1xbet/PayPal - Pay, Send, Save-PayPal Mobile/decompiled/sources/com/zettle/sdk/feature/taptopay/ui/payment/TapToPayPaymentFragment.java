package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J!\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0006\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0018\u0010\u0006\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010&R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010(R\u0016\u0010\u001f\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u0010(R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010(R\u0016\u00100\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u0010-R\u0016\u00105\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u0010 R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0015\u00107\u001a\u00020:8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b9\u0010;"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/zettle/sdk/core/log/Loggable;", "<init>", "()V", "", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "onStop", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "p0", "(Z)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getHighSpeedVideoFpsRanges", "Landroidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;", "Landroidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;", "getHighSpeedVideoFpsRangesFor", "Landroid/media/MediaPlayer;", "Landroid/media/MediaPlayer;", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "getHighSpeedVideoSizes", "Z", "Landroid/widget/TextView;", "getOutputMinFrameDuration", "Landroid/widget/TextView;", "getOutputFormats", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountComponent;", "getInputFormats", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountComponent;", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "getOutputSizeshNQ4ISI", "getOutputStallDuration", "Lcom/google/android/material/appbar/MaterialToolbar;", "getOutputStallDurationlomOqCM", "Lcom/google/android/material/appbar/MaterialToolbar;", "getOutputMinFrameDurationlomOqCM", "Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel;", "Lkotlin/Lazy;", "Factory"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayPaymentFragment extends androidx.fragment.app.Fragment implements com.zettle.sdk.core.log.Loggable {

    /* renamed from: Factory, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.constraintlayout.widget.ConstraintLayout getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private android.media.MediaPlayer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.widget.ImageView getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI = true;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private android.widget.TextView getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.widget.ImageView getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private android.widget.ImageView getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private android.widget.TextView getOutputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputStallDurationlomOqCM;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.constraintlayout.widget.ConstraintLayout getOutputStallDuration;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private com.google.android.material.appbar.MaterialToolbar getOutputMinFrameDurationlomOqCM;

    public TapToPayPaymentFragment() {
        final com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment tapToPayPaymentFragment = this;
        final kotlin.jvm.functions.Function0 function0 = null;
        this.getOutputStallDurationlomOqCM = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(tapToPayPaymentFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$special$$inlined$activityViewModels$default$1
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
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function02 = kotlin.jvm.functions.Function0.this;
                if (function02 != null && (creationExtras = (androidx.view.viewmodel.CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                androidx.view.viewmodel.CreationExtras defaultViewModelCreationExtras = tapToPayPaymentFragment.requireActivity().getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$special$$inlined$activityViewModels$default$3
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
        });
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        requireActivity().getGetHighResolutionOutputSizeshNQ4ISI().addCallback(this, new androidx.view.OnBackPressedCallback() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$onAttach$callback$1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                boolean z;
                z = com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.this.getHighResolutionOutputSizeshNQ4ISI;
                if (z) {
                    ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.this.getOutputStallDurationlomOqCM.getValue()).cancelTransaction();
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getWindow().setFlags(8192, 8192);
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel tapToPayPaymentViewModel = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.getOutputStallDurationlomOqCM.getValue();
        androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
        tapToPayPaymentViewModel.verifySecurityChecks(requireActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        return inflater.inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.fragment_taptopay_payment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        requireActivity().getLifecycleRegistry().addObserver(new androidx.view.DefaultLifecycleObserver() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$onViewCreated$$inlined$doOnActivityOnPause$1
            @Override // androidx.view.DefaultLifecycleObserver
            public final void onPause(androidx.view.LifecycleOwner owner) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
                if (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.this.isDetached()) {
                    return;
                }
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.access$getViewModel(this).cancelTransaction();
            }
        });
        this.Camera2StreamConfigurationMap = android.media.MediaPlayer.create(requireContext(), com.zettle.sdk.feature.taptopay.ui.R.raw.readcard_hold);
        this.getHighSpeedVideoFpsRangesFor = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.create(requireContext(), com.zettle.sdk.feature.taptopay.ui.R.drawable.animation_present_card);
        android.view.View findViewById = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_front_animation);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.getHighSpeedVideoSizesFor = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_amount);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.getInputSizeshNQ4ISI = (com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_card_present_type_status);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.getOutputFormats = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.amount_and_instructions_container);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.getHighSpeedVideoFpsRanges = (androidx.constraintlayout.widget.ConstraintLayout) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_present_card_background);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.getOutputMinFrameDuration = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_group_contacless_payment_providers);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) findViewById6;
        this.getOutputStallDuration = constraintLayout;
        android.widget.TextView textView = null;
        if (constraintLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            constraintLayout = null;
        }
        if (((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.getOutputStallDurationlomOqCM.getValue()).isUSAccount()) {
            string = getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_schemes_supported_accessibility_us);
        } else {
            string = getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_schemes_supported_accessibility);
        }
        constraintLayout.setContentDescription(string);
        android.view.View findViewById7 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_pay_by_discover);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById7;
        this.getHighSpeedVideoSizes = imageView;
        if (imageView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        imageView.setVisibility(((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.getOutputStallDurationlomOqCM.getValue()).isUSAccount() ? 0 : 8);
        android.view.View findViewById8 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.toolbar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        com.google.android.material.appbar.MaterialToolbar materialToolbar = (com.google.android.material.appbar.MaterialToolbar) findViewById8;
        this.getOutputMinFrameDurationlomOqCM = materialToolbar;
        if (materialToolbar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            materialToolbar = null;
        }
        materialToolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.m23177$r8$lambda$dG29ZBg4UBXStvAoke4oaiaZM0(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.this, view2);
            }
        });
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.getOutputStallDurationlomOqCM.getValue()).getState().observe(getViewLifecycleOwner(), new com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.ui.payment.ViewState, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$onViewCreated$3
            public final void Camera2StreamConfigurationMap(com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState) {
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen = viewState.getScreen();
                com.zettle.sdk.core.log.LogKt.warn$default(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.this, "the viewState : ".concat(java.lang.String.valueOf(screen)), null, 2, null);
                if (screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.ReadyToReadCard) {
                    com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.ReadyToReadCard readyToReadCard = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.ReadyToReadCard) screen;
                    int i = com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$onViewCreated$3.WhenMappings.$EnumSwitchMapping$0[readyToReadCard.getTxUiEvent().ordinal()];
                    if (i == 1) {
                        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.access$onReadyToReadCard(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.this, readyToReadCard.getInfo());
                        return;
                    }
                    if (i == 2) {
                        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.access$onReadingCard(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.this);
                    } else if (i == 3) {
                        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.access$onCardReadOk(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.this);
                    } else if (i == 4) {
                        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.access$onRetry(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment.this);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState) {
                Camera2StreamConfigurationMap(viewState);
                return kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.TransactionUIEvent.values().length];
                    try {
                        iArr[com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.TransactionUIEvent.READY.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.TransactionUIEvent.READING_CARD.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.TransactionUIEvent.CARD_READ_OK.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.TransactionUIEvent.RETRY.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }
        }));
        android.view.View findViewById9 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.privacy_statement);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.getInputFormats = (android.widget.TextView) findViewById9;
        if (((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.getOutputStallDurationlomOqCM.getValue()).isUSAccount()) {
            java.lang.String string2 = getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_url_privacy_statement_us);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            android.widget.TextView textView2 = this.getInputFormats;
            if (textView2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                textView = textView2;
            }
            textView.setText(getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_privacy_statement, string2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.getHighSpeedVideoFpsRangesFor;
        if (animatedVectorDrawableCompat != null) {
            animatedVectorDrawableCompat.clearAnimationCallbacks();
        }
        android.media.MediaPlayer mediaPlayer = this.Camera2StreamConfigurationMap;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        super.onDestroyView();
    }

    private final void Camera2StreamConfigurationMap() {
        androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.getHighSpeedVideoFpsRangesFor;
        if (animatedVectorDrawableCompat != null) {
            android.widget.ImageView imageView = null;
            if (animatedVectorDrawableCompat.isRunning()) {
                animatedVectorDrawableCompat = null;
            }
            if (animatedVectorDrawableCompat != null) {
                animatedVectorDrawableCompat.stop();
                animatedVectorDrawableCompat.clearAnimationCallbacks();
                animatedVectorDrawableCompat.registerAnimationCallback(new com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$animatePresentCard$2$1(this, animatedVectorDrawableCompat));
                if (!animatedVectorDrawableCompat.isRunning()) {
                    animatedVectorDrawableCompat.start();
                }
                android.widget.ImageView imageView2 = this.getHighSpeedVideoSizesFor;
                if (imageView2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    imageView = imageView2;
                }
                imageView.setImageDrawable(this.getHighSpeedVideoFpsRangesFor);
            }
        }
    }

    private final void Camera2StreamConfigurationMap(boolean p0) {
        com.google.android.material.appbar.MaterialToolbar materialToolbar = this.getOutputMinFrameDurationlomOqCM;
        if (materialToolbar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            materialToolbar = null;
        }
        materialToolbar.setVisibility(p0 ? 0 : 4);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentFragment$Factory;", "Lkotlin/Function1;", "", "Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentFragment;", "<init>", "()V", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "invoke", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentFragment;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$Factory, reason: from kotlin metadata */
    public static final class Companion implements kotlin.jvm.functions.Function1<java.lang.String, com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment> {
        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment invoke(java.lang.String reference) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reference, "");
            com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment tapToPayPaymentFragment = new com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment();
            tapToPayPaymentFragment.setArguments(androidx.core.os.BundleKt.bundleOf(kotlin.TuplesKt.to(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, reference)));
            return tapToPayPaymentFragment;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$dG29ZBg4UBXStvAoke4oa-iaZM0, reason: not valid java name */
    public static /* synthetic */ void m23177$r8$lambda$dG29ZBg4UBXStvAoke4oaiaZM0(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment tapToPayPaymentFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayPaymentFragment, "");
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) tapToPayPaymentFragment.getOutputStallDurationlomOqCM.getValue()).cancelTransaction();
    }

    public static final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel access$getViewModel(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment tapToPayPaymentFragment) {
        return (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) tapToPayPaymentFragment.getOutputStallDurationlomOqCM.getValue();
    }

    public static final /* synthetic */ void access$onCardReadOk(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment tapToPayPaymentFragment) {
        tapToPayPaymentFragment.Camera2StreamConfigurationMap(false);
        tapToPayPaymentFragment.getHighResolutionOutputSizeshNQ4ISI = false;
    }

    public static final /* synthetic */ void access$onReadingCard(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment tapToPayPaymentFragment) {
        tapToPayPaymentFragment.Camera2StreamConfigurationMap(false);
        tapToPayPaymentFragment.getHighResolutionOutputSizeshNQ4ISI = false;
        android.widget.TextView textView = tapToPayPaymentFragment.getOutputFormats;
        android.widget.ImageView imageView = null;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setImportantForAccessibility(1);
        android.widget.TextView textView2 = tapToPayPaymentFragment.getOutputFormats;
        if (textView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView2 = null;
        }
        textView2.setAccessibilityLiveRegion(1);
        android.widget.TextView textView3 = tapToPayPaymentFragment.getOutputFormats;
        if (textView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView3 = null;
        }
        textView3.setText(tapToPayPaymentFragment.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_payment_reading_card));
        android.widget.ImageView imageView2 = tapToPayPaymentFragment.getOutputMinFrameDuration;
        if (imageView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            imageView = imageView2;
        }
        imageView.setImageResource(com.zettle.sdk.feature.taptopay.ui.R.drawable.payment_card_reading_card);
        android.media.MediaPlayer mediaPlayer = tapToPayPaymentFragment.Camera2StreamConfigurationMap;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public static final /* synthetic */ void access$onReadyToReadCard(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment tapToPayPaymentFragment, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo) {
        tapToPayPaymentFragment.Camera2StreamConfigurationMap(true);
        tapToPayPaymentFragment.getHighResolutionOutputSizeshNQ4ISI = true;
        com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentConfiguration getHighSpeedVideoFpsRanges = transactionInfo.getGetHighSpeedVideoFpsRanges();
        long getHighSpeedVideoFpsRangesFor = transactionInfo.getGetHighSpeedVideoFpsRangesFor();
        long getHighResolutionOutputSizeshNQ4ISI = transactionInfo.getGetHighResolutionOutputSizeshNQ4ISI();
        com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder currency = new com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder().currency(getHighSpeedVideoFpsRanges.getCurrency());
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        com.zettle.sdk.common.ui.text.CurrencyFormatter build = currency.locale(locale).build();
        com.zettle.sdk.common.ui.text.OttoAmount formatAsOttoAmount = build.formatAsOttoAmount(getHighSpeedVideoFpsRangesFor);
        android.text.SpannableString format = build.format(getHighSpeedVideoFpsRangesFor - getHighResolutionOutputSizeshNQ4ISI);
        android.text.SpannableString format2 = build.format(getHighResolutionOutputSizeshNQ4ISI);
        android.text.SpannableString format3 = build.format(getHighSpeedVideoFpsRangesFor);
        java.lang.String string = tapToPayPaymentFragment.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_payment_init);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.Object) format3);
        sb.append(" ");
        sb.append(string);
        java.lang.String obj = sb.toString();
        java.lang.Object systemService = tapToPayPaymentFragment.requireContext().getSystemService("accessibility");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            com.zettle.sdk.commons.accessibility.SpeechTextUtilsKt.announceText(accessibilityManager, obj);
        }
        com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent = tapToPayPaymentFragment.getInputSizeshNQ4ISI;
        android.widget.TextView textView = null;
        if (ottoTotalAmountComponent == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            ottoTotalAmountComponent = null;
        }
        ottoTotalAmountComponent.setImportantForAccessibility(4);
        android.widget.TextView textView2 = tapToPayPaymentFragment.getOutputFormats;
        if (textView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView2 = null;
        }
        textView2.setImportantForAccessibility(2);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = tapToPayPaymentFragment.getHighSpeedVideoFpsRanges;
        if (constraintLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            constraintLayout = null;
        }
        constraintLayout.setContentDescription(obj);
        android.widget.ImageView imageView = tapToPayPaymentFragment.getOutputMinFrameDuration;
        if (imageView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        imageView.setImageResource(com.zettle.sdk.feature.taptopay.ui.R.drawable.payment_circle_present_card);
        com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent2 = tapToPayPaymentFragment.getInputSizeshNQ4ISI;
        if (ottoTotalAmountComponent2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            ottoTotalAmountComponent2 = null;
        }
        ottoTotalAmountComponent2.setOttoAmount(formatAsOttoAmount);
        if (getHighResolutionOutputSizeshNQ4ISI > 0) {
            com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent3 = tapToPayPaymentFragment.getInputSizeshNQ4ISI;
            if (ottoTotalAmountComponent3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                ottoTotalAmountComponent3 = null;
            }
            java.lang.String string2 = tapToPayPaymentFragment.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_tipping_payment_details_subtotal);
            java.lang.String string3 = tapToPayPaymentFragment.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_tipping_payment_details);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(string2);
            sb2.append(" ");
            sb2.append((java.lang.Object) format);
            sb2.append(" ");
            sb2.append(string3);
            sb2.append(" ");
            sb2.append((java.lang.Object) format2);
            ottoTotalAmountComponent3.setSecondaryTextBottom(sb2.toString());
        }
        android.widget.TextView textView3 = tapToPayPaymentFragment.getOutputFormats;
        if (textView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            textView = textView3;
        }
        textView.setText(tapToPayPaymentFragment.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_payment_init));
        tapToPayPaymentFragment.Camera2StreamConfigurationMap();
    }

    public static final /* synthetic */ void access$onRetry(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment tapToPayPaymentFragment) {
        tapToPayPaymentFragment.Camera2StreamConfigurationMap(true);
        tapToPayPaymentFragment.getHighResolutionOutputSizeshNQ4ISI = true;
        android.widget.TextView textView = tapToPayPaymentFragment.getOutputFormats;
        android.widget.ImageView imageView = null;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setImportantForAccessibility(1);
        android.widget.TextView textView2 = tapToPayPaymentFragment.getOutputFormats;
        if (textView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView2 = null;
        }
        textView2.setAccessibilityLiveRegion(1);
        android.widget.TextView textView3 = tapToPayPaymentFragment.getOutputFormats;
        if (textView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView3 = null;
        }
        textView3.setText(tapToPayPaymentFragment.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_payment_init));
        android.widget.ImageView imageView2 = tapToPayPaymentFragment.getOutputMinFrameDuration;
        if (imageView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            imageView = imageView2;
        }
        imageView.setImageResource(com.zettle.sdk.feature.taptopay.ui.R.drawable.payment_circle_present_card);
        tapToPayPaymentFragment.Camera2StreamConfigurationMap();
    }
}
