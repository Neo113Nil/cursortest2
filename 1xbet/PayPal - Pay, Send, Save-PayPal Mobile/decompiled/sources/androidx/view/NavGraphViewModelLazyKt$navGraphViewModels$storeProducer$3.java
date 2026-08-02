package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 implements kotlin.jvm.functions.Function0<androidx.view.ViewModelStore> {
    final /* synthetic */ kotlin.Lazy<androidx.view.NavBackStackEntry> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.view.ViewModelStore invoke() {
        return androidx.view.NavGraphViewModelLazyKt.m9193access$navGraphViewModels$lambda2(this.getHighSpeedVideoFpsRangesFor).getGetHighSpeedVideoSizes();
    }

    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(kotlin.Lazy<androidx.view.NavBackStackEntry> lazy) {
        this.getHighSpeedVideoFpsRangesFor = lazy;
    }
}
