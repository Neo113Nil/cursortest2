package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0015\u0010\"\u001a\u00020 8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010!"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/AuthorizingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStop", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/widget/ImageView;", "Camera2StreamConfigurationMap", "Landroid/widget/ImageView;", "getHighSpeedVideoSizes", "Landroid/widget/TextView;", "getHighSpeedVideoFpsRanges", "Landroid/widget/TextView;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/AuthorizingFragment$VibrateWrapper;", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor", "VibrateWrapper"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AuthorizingFragment extends androidx.fragment.app.Fragment {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private android.widget.ImageView getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.swiperefreshlayout.widget.CircularProgressDrawable getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private android.widget.TextView getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.feature.taptopay.ui.payment.AuthorizingFragment.VibrateWrapper>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.AuthorizingFragment$vibrator$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final com.zettle.sdk.feature.taptopay.ui.payment.AuthorizingFragment.VibrateWrapper invoke() {
            android.os.Vibrator vibrator;
            if (com.zettle.sdk.meta.Platform.INSTANCE.getInfo().isVersionAtLeast(com.zettle.sdk.meta.AndroidVersion.Android12)) {
                java.lang.Object systemService = com.zettle.sdk.feature.taptopay.ui.payment.AuthorizingFragment.this.requireContext().getApplicationContext().getSystemService("vibrator_manager");
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
                vibrator = ((android.os.VibratorManager) systemService).getDefaultVibrator();
            } else {
                java.lang.Object systemService2 = com.zettle.sdk.feature.taptopay.ui.payment.AuthorizingFragment.this.requireContext().getApplicationContext().getSystemService("vibrator");
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "");
                vibrator = (android.os.Vibrator) systemService2;
            }
            android.os.Vibrator vibrator2 = vibrator;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(vibrator2, "");
            return new com.zettle.sdk.feature.taptopay.ui.payment.AuthorizingFragment.VibrateWrapper(vibrator2, 0L, 2, null);
        }

        {
            super(0);
        }
    });

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/AuthorizingFragment$VibrateWrapper;", "", "Landroid/os/Vibrator;", "p0", "", "p1", "<init>", "(Landroid/os/Vibrator;J)V", "getHighSpeedVideoSizes", "J", "Camera2StreamConfigurationMap", "Landroid/os/Vibrator;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class VibrateWrapper {
        final android.os.Vibrator Camera2StreamConfigurationMap;
        final long getHighSpeedVideoSizes;

        private VibrateWrapper(android.os.Vibrator vibrator, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vibrator, "");
            this.Camera2StreamConfigurationMap = vibrator;
            this.getHighSpeedVideoSizes = j;
        }

        public /* synthetic */ VibrateWrapper(android.os.Vibrator vibrator, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(vibrator, (i & 2) != 0 ? 200L : j);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new androidx.view.OnBackPressedCallback() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.AuthorizingFragment$onAttach$callback$1
            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        return inflater.inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.fragment_taptopay_authorizing, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        android.view.View findViewById = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.loading_icon);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.getHighSpeedVideoSizes = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.loading_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = (android.widget.TextView) findViewById2;
        androidx.swiperefreshlayout.widget.CircularProgressDrawable circularProgressDrawable = new androidx.swiperefreshlayout.widget.CircularProgressDrawable(requireContext());
        circularProgressDrawable.setStrokeWidth(getResources().getDimension(com.zettle.sdk.feature.taptopay.ui.R.dimen.card_reading_progress_stroke));
        circularProgressDrawable.setColorSchemeColors(androidx.core.content.res.ResourcesCompat.getColor(getResources(), com.zettle.sdk.feature.taptopay.ui.R.color.progressIndicator, null));
        this.getHighSpeedVideoFpsRanges = circularProgressDrawable;
        circularProgressDrawable.start();
        android.widget.ImageView imageView = this.getHighSpeedVideoSizes;
        if (imageView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        imageView.setImageDrawable(circularProgressDrawable);
        android.widget.TextView textView = this.getHighResolutionOutputSizeshNQ4ISI;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setAccessibilityLiveRegion(1);
        android.widget.TextView textView2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (textView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView2 = null;
        }
        com.zettle.sdk.commons.accessibility.SpeechTextUtilsKt.requestAccessibilityFocus$default(textView2, false, 1, null);
        com.zettle.sdk.feature.taptopay.ui.payment.AuthorizingFragment.VibrateWrapper vibrateWrapper = (com.zettle.sdk.feature.taptopay.ui.payment.AuthorizingFragment.VibrateWrapper) this.getHighSpeedVideoFpsRangesFor.getValue();
        vibrateWrapper.Camera2StreamConfigurationMap.vibrate(android.os.VibrationEffect.createOneShot(vibrateWrapper.getHighSpeedVideoSizes, -1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        androidx.swiperefreshlayout.widget.CircularProgressDrawable circularProgressDrawable = this.getHighSpeedVideoFpsRanges;
        if (circularProgressDrawable != null) {
            circularProgressDrawable.stop();
        }
    }
}
