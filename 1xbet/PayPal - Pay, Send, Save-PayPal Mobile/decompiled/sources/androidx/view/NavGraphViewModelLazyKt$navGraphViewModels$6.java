package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$6 implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
    final /* synthetic */ kotlin.Lazy<androidx.view.NavBackStackEntry> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
        return androidx.view.NavGraphViewModelLazyKt.m9193access$navGraphViewModels$lambda2(this.getHighSpeedVideoFpsRangesFor).getDefaultViewModelProviderFactory();
    }

    public NavGraphViewModelLazyKt$navGraphViewModels$6(kotlin.Lazy<androidx.view.NavBackStackEntry> lazy) {
        this.getHighSpeedVideoFpsRangesFor = lazy;
    }
}
