package com.zettle.sdk.feature.taptopay.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/TapToPaySettingsFragment$doOnPause$1;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "", "onPause", "(Landroidx/lifecycle/LifecycleOwner;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TapToPaySettingsFragment$doOnPause$1 implements androidx.view.DefaultLifecycleObserver {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    public TapToPaySettingsFragment$doOnPause$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoFpsRangesFor = function0;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final void onPause(androidx.view.LifecycleOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        this.getHighSpeedVideoFpsRangesFor.invoke();
    }
}
