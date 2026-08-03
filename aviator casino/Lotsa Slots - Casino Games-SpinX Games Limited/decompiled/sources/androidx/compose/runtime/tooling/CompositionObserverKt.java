package androidx.compose.runtime.tooling;

/* compiled from: CompositionObserver.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "Landroidx/compose/runtime/Composition;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionObserverKt {
    public static final androidx.compose.runtime.tooling.CompositionObserverHandle observe(androidx.compose.runtime.Composition composition, androidx.compose.runtime.tooling.CompositionObserver compositionObserver) {
        androidx.compose.runtime.CompositionImpl compositionImpl = (androidx.compose.runtime.CompositionImpl) androidx.compose.runtime.CompositionKt.getCompositionService(composition, androidx.compose.runtime.CompositionKt.getCompositionImplServiceKey());
        if (compositionImpl != null) {
            return compositionImpl.observe$runtime_release(compositionObserver);
        }
        return null;
    }

    public static final androidx.compose.runtime.tooling.CompositionObserverHandle observe(androidx.compose.runtime.RecomposeScope recomposeScope, androidx.compose.runtime.tooling.RecomposeScopeObserver recomposeScopeObserver) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(recomposeScope, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        return ((androidx.compose.runtime.RecomposeScopeImpl) recomposeScope).observe$runtime_release(recomposeScopeObserver);
    }
}
