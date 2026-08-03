package androidx.compose.runtime;

/* compiled from: Composer.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/RememberManager;", "", "deactivating", "", com.ironsource.C3232q2.p, "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "forgetting", "Landroidx/compose/runtime/RememberObserver;", "releasing", "remembering", "sideEffect", "effect", "Lkotlin/Function0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RememberManager {
    void deactivating(androidx.compose.runtime.ComposeNodeLifecycleCallback instance);

    void forgetting(androidx.compose.runtime.RememberObserver instance);

    void releasing(androidx.compose.runtime.ComposeNodeLifecycleCallback instance);

    void remembering(androidx.compose.runtime.RememberObserver instance);

    void sideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> effect);
}
