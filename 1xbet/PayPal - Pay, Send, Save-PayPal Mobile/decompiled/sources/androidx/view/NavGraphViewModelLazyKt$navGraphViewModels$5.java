package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$5 implements kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> {
    final /* synthetic */ kotlin.Lazy<androidx.view.NavBackStackEntry> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.view.viewmodel.CreationExtras invoke() {
        return androidx.view.NavGraphViewModelLazyKt.m9193access$navGraphViewModels$lambda2(this.getHighSpeedVideoFpsRanges).getDefaultViewModelCreationExtras();
    }

    public NavGraphViewModelLazyKt$navGraphViewModels$5(kotlin.Lazy<androidx.view.NavBackStackEntry> lazy) {
        this.getHighSpeedVideoFpsRanges = lazy;
    }
}
