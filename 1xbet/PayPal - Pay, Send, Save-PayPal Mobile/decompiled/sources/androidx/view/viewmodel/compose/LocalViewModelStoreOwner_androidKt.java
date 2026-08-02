package androidx.view.viewmodel.compose;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelStoreOwner;", "findDefaultViewModelStoreOwner", "(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalViewModelStoreOwner_androidKt {
    public static final androidx.view.ViewModelStoreOwner findDefaultViewModelStoreOwner(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(927641011, i, -1, "androidx.lifecycle.viewmodel.compose.findDefaultViewModelStoreOwner (LocalViewModelStoreOwner.android.kt:25)");
        }
        androidx.view.ViewModelStoreOwner viewModelStoreOwner = androidx.view.C0278ViewTreeViewModelStoreOwner.get((android.view.View) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return viewModelStoreOwner;
    }
}
