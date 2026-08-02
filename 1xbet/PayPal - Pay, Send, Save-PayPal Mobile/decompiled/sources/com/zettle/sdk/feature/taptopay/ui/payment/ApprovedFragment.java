package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J!\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0014\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/ApprovedFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onStop", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/media/MediaPlayer;", "getHighSpeedVideoSizes", "Landroid/media/MediaPlayer;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/widget/TextView;", "getHighSpeedVideoFpsRangesFor", "Landroid/widget/TextView;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ApprovedFragment extends androidx.fragment.app.Fragment {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.widget.TextView getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.media.MediaPlayer getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        return inflater.inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.fragment_taptopay_approved, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        this.getHighResolutionOutputSizeshNQ4ISI = android.media.MediaPlayer.create(requireContext(), com.zettle.sdk.feature.taptopay.ui.R.raw.payment_approved);
        android.view.View findViewById = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_approved_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.getHighSpeedVideoSizes = textView;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setAccessibilityLiveRegion(2);
        android.widget.TextView textView2 = this.getHighSpeedVideoSizes;
        if (textView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView2 = null;
        }
        com.zettle.sdk.commons.accessibility.SpeechTextUtilsKt.requestAccessibilityFocus$default(textView2, false, 1, null);
        android.media.MediaPlayer mediaPlayer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        android.media.MediaPlayer mediaPlayer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }
}
