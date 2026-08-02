package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "onRemembered", "()V", "onForgotten", "onAbandoned", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositionScopedCoroutineScopeCanceller implements androidx.compose.runtime.RememberObserver {
    public static final int $stable = 8;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }

    public CompositionScopedCoroutineScopeCanceller(kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.coroutineScope = coroutineScope;
    }

    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        kotlinx.coroutines.CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope instanceof androidx.compose.runtime.RememberedCoroutineScope) {
            ((androidx.compose.runtime.RememberedCoroutineScope) coroutineScope).cancelIfCreated();
        } else {
            kotlinx.coroutines.CoroutineScopeKt.cancel(coroutineScope, new androidx.compose.runtime.LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        kotlinx.coroutines.CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope instanceof androidx.compose.runtime.RememberedCoroutineScope) {
            ((androidx.compose.runtime.RememberedCoroutineScope) coroutineScope).cancelIfCreated();
        } else {
            kotlinx.coroutines.CoroutineScopeKt.cancel(coroutineScope, new androidx.compose.runtime.LeftCompositionCancellationException());
        }
    }
}
