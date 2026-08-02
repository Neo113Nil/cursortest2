package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 implements kotlin.jvm.functions.Function0<androidx.view.ViewModelStore> {
    final /* synthetic */ kotlin.Lazy<androidx.view.NavBackStackEntry> getHighSpeedVideoSizes;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.view.ViewModelStore invoke() {
        return androidx.view.NavGraphViewModelLazyKt.m9191access$navGraphViewModels$lambda0(this.getHighSpeedVideoSizes).getGetHighSpeedVideoSizes();
    }

    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(kotlin.Lazy<androidx.view.NavBackStackEntry> lazy) {
        this.getHighSpeedVideoSizes = lazy;
    }
}
