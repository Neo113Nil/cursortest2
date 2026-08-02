package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5 implements kotlin.jvm.functions.Function0<androidx.view.NavBackStackEntry> {
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.fragment.app.Fragment getHighSpeedVideoSizes;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.view.NavBackStackEntry invoke() {
        return androidx.view.fragment.FragmentKt.findNavController(this.getHighSpeedVideoSizes).getBackStackEntry(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5(androidx.fragment.app.Fragment fragment, int i) {
        this.getHighSpeedVideoSizes = fragment;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}
