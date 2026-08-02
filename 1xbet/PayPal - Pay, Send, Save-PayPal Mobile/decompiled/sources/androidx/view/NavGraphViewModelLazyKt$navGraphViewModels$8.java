package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$8 implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
    final /* synthetic */ kotlin.Lazy<androidx.view.NavBackStackEntry> Camera2StreamConfigurationMap;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
        return androidx.view.NavGraphViewModelLazyKt.m9194access$navGraphViewModels$lambda3(this.Camera2StreamConfigurationMap).getDefaultViewModelProviderFactory();
    }

    public NavGraphViewModelLazyKt$navGraphViewModels$8(kotlin.Lazy<androidx.view.NavBackStackEntry> lazy) {
        this.Camera2StreamConfigurationMap = lazy;
    }
}
