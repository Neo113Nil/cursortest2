package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "getViewModelScope", "(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;", "viewModelScope", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewModelKt {
    private static final androidx.view.viewmodel.internal.SynchronizedObject Camera2StreamConfigurationMap = new androidx.view.viewmodel.internal.SynchronizedObject();

    public static final kotlinx.coroutines.CoroutineScope getViewModelScope(androidx.view.ViewModel viewModel) {
        androidx.view.viewmodel.internal.CloseableCoroutineScope closeableCoroutineScope;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        synchronized (Camera2StreamConfigurationMap) {
            closeableCoroutineScope = (androidx.view.viewmodel.internal.CloseableCoroutineScope) viewModel.getCloseable(androidx.view.viewmodel.internal.CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY);
            if (closeableCoroutineScope == null) {
                closeableCoroutineScope = androidx.view.viewmodel.internal.CloseableCoroutineScopeKt.createViewModelScope();
                viewModel.addCloseable(androidx.view.viewmodel.internal.CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, closeableCoroutineScope);
            }
        }
        return closeableCoroutineScope;
    }
}
