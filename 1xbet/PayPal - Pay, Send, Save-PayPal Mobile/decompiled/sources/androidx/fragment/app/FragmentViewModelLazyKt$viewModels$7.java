package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class FragmentViewModelLazyKt$viewModels$7 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> {
    final /* synthetic */ kotlin.Lazy<androidx.view.ViewModelStoreOwner> $Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> $getHighSpeedVideoFpsRanges;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.view.viewmodel.CreationExtras invoke() {
        androidx.view.viewmodel.CreationExtras invoke;
        kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> function0 = this.$getHighSpeedVideoFpsRanges;
        if (function0 != null && (invoke = function0.invoke()) != null) {
            return invoke;
        }
        androidx.view.ViewModelStoreOwner m9158access$viewModels$lambda1 = androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(this.$Camera2StreamConfigurationMap);
        androidx.view.HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m9158access$viewModels$lambda1 instanceof androidx.view.HasDefaultViewModelProviderFactory ? (androidx.view.HasDefaultViewModelProviderFactory) m9158access$viewModels$lambda1 : null;
        return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$7(kotlin.jvm.functions.Function0<? extends androidx.view.viewmodel.CreationExtras> function0, kotlin.Lazy<? extends androidx.view.ViewModelStoreOwner> lazy) {
        super(0);
        this.$getHighSpeedVideoFpsRanges = function0;
        this.$Camera2StreamConfigurationMap = lazy;
    }
}
