package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt$viewModels$factoryPromise$1 implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
    final /* synthetic */ androidx.view.ComponentActivity getHighSpeedVideoFpsRanges;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
        return this.getHighSpeedVideoFpsRanges.getDefaultViewModelProviderFactory();
    }

    public ActivityViewModelLazyKt$viewModels$factoryPromise$1(androidx.view.ComponentActivity componentActivity) {
        this.getHighSpeedVideoFpsRanges = componentActivity;
    }
}
