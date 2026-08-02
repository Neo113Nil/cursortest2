package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/LoadingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onStop", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/widget/ImageView;", "getHighSpeedVideoFpsRangesFor", "Landroid/widget/ImageView;", "Camera2StreamConfigurationMap", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "getHighSpeedVideoSizes", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LoadingFragment extends androidx.fragment.app.Fragment {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.widget.ImageView Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.swiperefreshlayout.widget.CircularProgressDrawable getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        return inflater.inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.fragment_taptopay_loading, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        android.view.View findViewById = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.loading_icon);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.Camera2StreamConfigurationMap = (android.widget.ImageView) findViewById;
        androidx.swiperefreshlayout.widget.CircularProgressDrawable circularProgressDrawable = new androidx.swiperefreshlayout.widget.CircularProgressDrawable(requireContext());
        circularProgressDrawable.setStrokeWidth(getResources().getDimension(com.zettle.sdk.feature.taptopay.ui.R.dimen.card_reading_progress_stroke));
        android.widget.ImageView imageView = null;
        circularProgressDrawable.setColorSchemeColors(androidx.core.content.res.ResourcesCompat.getColor(getResources(), com.zettle.sdk.feature.taptopay.ui.R.color.progressIndicator, null));
        this.getHighResolutionOutputSizeshNQ4ISI = circularProgressDrawable;
        circularProgressDrawable.start();
        android.widget.ImageView imageView2 = this.Camera2StreamConfigurationMap;
        if (imageView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            imageView = imageView2;
        }
        imageView.setImageDrawable(circularProgressDrawable);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        androidx.swiperefreshlayout.widget.CircularProgressDrawable circularProgressDrawable = this.getHighResolutionOutputSizeshNQ4ISI;
        if (circularProgressDrawable != null) {
            circularProgressDrawable.stop();
        }
    }
}
