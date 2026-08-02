package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8 implements kotlin.jvm.functions.Function0<androidx.view.NavBackStackEntry> {
    final /* synthetic */ androidx.fragment.app.Fragment getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.view.NavBackStackEntry invoke() {
        return androidx.view.fragment.FragmentKt.findNavController(this.getHighSpeedVideoFpsRanges).getBackStackEntry(this.getHighSpeedVideoSizes);
    }

    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(androidx.fragment.app.Fragment fragment, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = fragment;
        this.getHighSpeedVideoSizes = str;
    }
}
