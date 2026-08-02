package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 implements kotlin.jvm.functions.Function0<androidx.view.ViewModelStore> {
    final /* synthetic */ kotlin.Lazy<androidx.view.NavBackStackEntry> Camera2StreamConfigurationMap;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.view.ViewModelStore invoke() {
        return androidx.view.NavGraphViewModelLazyKt.m9194access$navGraphViewModels$lambda3(this.Camera2StreamConfigurationMap).getGetHighSpeedVideoSizes();
    }

    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(kotlin.Lazy<androidx.view.NavBackStackEntry> lazy) {
        this.Camera2StreamConfigurationMap = lazy;
    }
}
