package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.PublishedApi;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlinx/coroutines/K;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/K;)V", "", "onRemembered", "()V", "onForgotten", "onAbandoned", "Lkotlinx/coroutines/K;", "getCoroutineScope", "()Lkotlinx/coroutines/K;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    public static final int $stable = 8;
    private final kotlinx.coroutines.K coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(kotlinx.coroutines.K k) {
        this.coroutineScope = k;
    }

    public final kotlinx.coroutines.K getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        kotlinx.coroutines.K k = this.coroutineScope;
        if (k instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) k).cancelIfCreated();
        } else {
            kotlinx.coroutines.L.b(k, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        kotlinx.coroutines.K k = this.coroutineScope;
        if (k instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) k).cancelIfCreated();
        } else {
            kotlinx.coroutines.L.b(k, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
