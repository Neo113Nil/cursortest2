package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt$viewModels$2 implements kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> {
    final /* synthetic */ androidx.view.ComponentActivity Camera2StreamConfigurationMap;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.view.viewmodel.CreationExtras invoke() {
        return this.Camera2StreamConfigurationMap.getDefaultViewModelCreationExtras();
    }

    public ActivityViewModelLazyKt$viewModels$2(androidx.view.ComponentActivity componentActivity) {
        this.Camera2StreamConfigurationMap = componentActivity;
    }
}
