package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt$viewModels$4 implements kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> {
    final /* synthetic */ kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.ComponentActivity getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.view.viewmodel.CreationExtras invoke() {
        androidx.view.viewmodel.CreationExtras invoke;
        kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> function0 = this.Camera2StreamConfigurationMap;
        return (function0 == null || (invoke = function0.invoke()) == null) ? this.getHighSpeedVideoFpsRangesFor.getDefaultViewModelCreationExtras() : invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityViewModelLazyKt$viewModels$4(kotlin.jvm.functions.Function0<? extends androidx.view.viewmodel.CreationExtras> function0, androidx.view.ComponentActivity componentActivity) {
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoFpsRangesFor = componentActivity;
    }
}
