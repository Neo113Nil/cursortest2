package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$2 implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
    final /* synthetic */ kotlin.Lazy<androidx.view.NavBackStackEntry> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
        return androidx.view.NavGraphViewModelLazyKt.m9191access$navGraphViewModels$lambda0(this.getHighResolutionOutputSizeshNQ4ISI).getDefaultViewModelProviderFactory();
    }

    public NavGraphViewModelLazyKt$navGraphViewModels$2(kotlin.Lazy<androidx.view.NavBackStackEntry> lazy) {
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
    }
}
