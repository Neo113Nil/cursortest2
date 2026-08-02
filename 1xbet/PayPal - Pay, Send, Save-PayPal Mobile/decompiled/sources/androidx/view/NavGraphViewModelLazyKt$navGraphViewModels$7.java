package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$7 implements kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> {
    final /* synthetic */ kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.Lazy<androidx.view.NavBackStackEntry> getHighSpeedVideoSizes;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.view.viewmodel.CreationExtras invoke() {
        androidx.view.viewmodel.CreationExtras invoke;
        kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> function0 = this.getHighResolutionOutputSizeshNQ4ISI;
        return (function0 == null || (invoke = function0.invoke()) == null) ? androidx.view.NavGraphViewModelLazyKt.m9194access$navGraphViewModels$lambda3(this.getHighSpeedVideoSizes).getDefaultViewModelCreationExtras() : invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavGraphViewModelLazyKt$navGraphViewModels$7(kotlin.jvm.functions.Function0<? extends androidx.view.viewmodel.CreationExtras> function0, kotlin.Lazy<androidx.view.NavBackStackEntry> lazy) {
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoSizes = lazy;
    }
}
