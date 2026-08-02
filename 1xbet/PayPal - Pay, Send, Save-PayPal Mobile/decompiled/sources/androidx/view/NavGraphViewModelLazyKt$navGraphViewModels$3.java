package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$3 implements kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> {
    final /* synthetic */ kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.Lazy<androidx.view.NavBackStackEntry> getHighSpeedVideoSizes;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.view.viewmodel.CreationExtras invoke() {
        androidx.view.viewmodel.CreationExtras invoke;
        kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> function0 = this.getHighSpeedVideoFpsRangesFor;
        return (function0 == null || (invoke = function0.invoke()) == null) ? androidx.view.NavGraphViewModelLazyKt.m9192access$navGraphViewModels$lambda1(this.getHighSpeedVideoSizes).getDefaultViewModelCreationExtras() : invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavGraphViewModelLazyKt$navGraphViewModels$3(kotlin.jvm.functions.Function0<? extends androidx.view.viewmodel.CreationExtras> function0, kotlin.Lazy<androidx.view.NavBackStackEntry> lazy) {
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighSpeedVideoSizes = lazy;
    }
}
