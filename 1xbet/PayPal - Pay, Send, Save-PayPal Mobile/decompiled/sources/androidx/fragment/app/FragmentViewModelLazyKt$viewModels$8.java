package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class FragmentViewModelLazyKt$viewModels$8 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
    final /* synthetic */ androidx.fragment.app.Fragment $Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.Lazy<androidx.view.ViewModelStoreOwner> $getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
        androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory;
        androidx.view.ViewModelStoreOwner m9158access$viewModels$lambda1 = androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(this.$getHighResolutionOutputSizeshNQ4ISI);
        androidx.view.HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m9158access$viewModels$lambda1 instanceof androidx.view.HasDefaultViewModelProviderFactory ? (androidx.view.HasDefaultViewModelProviderFactory) m9158access$viewModels$lambda1 : null;
        return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.$Camera2StreamConfigurationMap.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$8(androidx.fragment.app.Fragment fragment, kotlin.Lazy<? extends androidx.view.ViewModelStoreOwner> lazy) {
        super(0);
        this.$Camera2StreamConfigurationMap = fragment;
        this.$getHighResolutionOutputSizeshNQ4ISI = lazy;
    }
}
