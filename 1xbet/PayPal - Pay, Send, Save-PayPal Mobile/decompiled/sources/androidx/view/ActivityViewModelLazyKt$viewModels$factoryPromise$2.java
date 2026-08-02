package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt$viewModels$factoryPromise$2 implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
    final /* synthetic */ androidx.view.ComponentActivity getHighSpeedVideoSizes;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
        return this.getHighSpeedVideoSizes.getDefaultViewModelProviderFactory();
    }

    public ActivityViewModelLazyKt$viewModels$factoryPromise$2(androidx.view.ComponentActivity componentActivity) {
        this.getHighSpeedVideoSizes = componentActivity;
    }
}
