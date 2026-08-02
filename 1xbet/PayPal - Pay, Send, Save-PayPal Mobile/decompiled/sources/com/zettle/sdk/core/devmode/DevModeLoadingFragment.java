package com.zettle.sdk.core.devmode;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b"}, d2 = {"Lcom/zettle/sdk/core/devmode/DevModeLoadingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/widget/ImageView;", "Camera2StreamConfigurationMap", "Landroid/widget/ImageView;", "getHighSpeedVideoSizes", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "getHighSpeedVideoFpsRanges", "Landroid/widget/TextView;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/widget/TextView;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DevModeLoadingFragment extends androidx.fragment.app.Fragment {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private android.widget.ImageView getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.widget.TextView getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private android.widget.TextView getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.swiperefreshlayout.widget.CircularProgressDrawable getHighSpeedVideoFpsRanges;

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        return inflater.inflate(com.zettle.sdk.R.layout.dev_mode_loading_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        android.view.View findViewById = view.findViewById(com.zettle.sdk.R.id.dev_mode_loading_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.getHighResolutionOutputSizeshNQ4ISI = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.zettle.sdk.R.id.dev_mode_loading_sub_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.getHighSpeedVideoFpsRangesFor = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.zettle.sdk.R.id.dev_mode_loading_icon);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.getHighSpeedVideoSizes = (android.widget.ImageView) findViewById3;
        androidx.swiperefreshlayout.widget.CircularProgressDrawable circularProgressDrawable = new androidx.swiperefreshlayout.widget.CircularProgressDrawable(requireContext());
        circularProgressDrawable.setStrokeWidth(getResources().getDimension(com.zettle.sdk.R.dimen.loading_stroke_width));
        android.widget.TextView textView = null;
        circularProgressDrawable.setColorSchemeColors(androidx.core.content.res.ResourcesCompat.getColor(getResources(), com.zettle.sdk.R.color.progressIndicator, null));
        this.getHighSpeedVideoFpsRanges = circularProgressDrawable;
        circularProgressDrawable.start();
        android.widget.ImageView imageView = this.getHighSpeedVideoSizes;
        if (imageView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        imageView.setImageDrawable(this.getHighSpeedVideoFpsRanges);
        android.widget.TextView textView2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (textView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView2 = null;
        }
        textView2.setText(com.zettle.sdk.R.string.dev_mode_loading_payment_in_progress);
        android.widget.TextView textView3 = this.getHighSpeedVideoFpsRangesFor;
        if (textView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            textView = textView3;
        }
        textView.setText(com.zettle.sdk.R.string.dev_mode_loading_payment_please_wait);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        androidx.swiperefreshlayout.widget.CircularProgressDrawable circularProgressDrawable = this.getHighSpeedVideoFpsRanges;
        if (circularProgressDrawable != null) {
            circularProgressDrawable.stop();
        }
    }
}
