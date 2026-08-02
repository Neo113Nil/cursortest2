package androidx.view.viewmodel.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "createViewModelScope", "()Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "asCloseable", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "", "VIEW_MODEL_SCOPE_KEY", "Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CloseableCoroutineScopeKt {
    public static final java.lang.String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final androidx.view.viewmodel.internal.CloseableCoroutineScope createViewModelScope() {
        kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext;
        try {
            emptyCoroutineContext = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        } catch (java.lang.IllegalStateException unused) {
            emptyCoroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        } catch (kotlin.NotImplementedError unused2) {
            emptyCoroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return new androidx.view.viewmodel.internal.CloseableCoroutineScope(emptyCoroutineContext.plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
    }

    public static final androidx.view.viewmodel.internal.CloseableCoroutineScope asCloseable(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        return new androidx.view.viewmodel.internal.CloseableCoroutineScope(coroutineScope);
    }
}
