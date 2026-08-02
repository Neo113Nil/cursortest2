package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class FragmentViewModelLazyKt$activityViewModels$6 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
    final /* synthetic */ androidx.fragment.app.Fragment $Camera2StreamConfigurationMap;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
        return this.$Camera2StreamConfigurationMap.requireActivity().getDefaultViewModelProviderFactory();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$activityViewModels$6(androidx.fragment.app.Fragment fragment) {
        super(0);
        this.$Camera2StreamConfigurationMap = fragment;
    }
}
