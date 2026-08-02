package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class FragmentViewModelLazyKt$activityViewModels$5 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> {
    final /* synthetic */ androidx.fragment.app.Fragment $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> $getHighSpeedVideoSizes;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.view.viewmodel.CreationExtras invoke() {
        androidx.view.viewmodel.CreationExtras invoke;
        kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> function0 = this.$getHighSpeedVideoSizes;
        return (function0 == null || (invoke = function0.invoke()) == null) ? this.$getHighSpeedVideoFpsRangesFor.requireActivity().getDefaultViewModelCreationExtras() : invoke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$activityViewModels$5(kotlin.jvm.functions.Function0<? extends androidx.view.viewmodel.CreationExtras> function0, androidx.fragment.app.Fragment fragment) {
        super(0);
        this.$getHighSpeedVideoSizes = function0;
        this.$getHighSpeedVideoFpsRangesFor = fragment;
    }
}
