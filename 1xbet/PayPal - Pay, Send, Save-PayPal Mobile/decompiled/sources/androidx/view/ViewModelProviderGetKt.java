package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelProvider;", "get", "(Landroidx/lifecycle/ViewModelProvider;)Landroidx/lifecycle/ViewModel;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewModelProviderGetKt {
    public static final /* synthetic */ <VM extends androidx.view.ViewModel> VM get(androidx.view.ViewModelProvider viewModelProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelProvider, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) viewModelProvider.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class));
    }
}
