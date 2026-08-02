package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/compose/runtime/State;", "Landroidx/lifecycle/Lifecycle$State;", "currentStateAsState", "(Landroidx/lifecycle/Lifecycle;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LifecycleExtKt {
    public static final androidx.compose.runtime.State<androidx.lifecycle.Lifecycle.State> currentStateAsState(androidx.view.Lifecycle lifecycle, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1892357376, i, -1, "androidx.lifecycle.compose.currentStateAsState (LifecycleExt.kt:32)");
        }
        androidx.compose.runtime.State<androidx.lifecycle.Lifecycle.State> collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(lifecycle.getCurrentStateFlow(), null, composer, 0, 1);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return collectAsState;
    }
}
