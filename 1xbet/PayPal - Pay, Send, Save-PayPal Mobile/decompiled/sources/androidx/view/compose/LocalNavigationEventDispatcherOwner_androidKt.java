package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/navigationevent/NavigationEventDispatcherOwner;", "findViewTreeNavigationEventDispatcherOwner", "(Landroidx/compose/runtime/Composer;I)Landroidx/navigationevent/NavigationEventDispatcherOwner;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalNavigationEventDispatcherOwner_androidKt {
    public static final androidx.view.NavigationEventDispatcherOwner findViewTreeNavigationEventDispatcherOwner(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-334864187, i, -1, "androidx.navigationevent.compose.findViewTreeNavigationEventDispatcherOwner (LocalNavigationEventDispatcherOwner.android.kt:25)");
        }
        androidx.view.NavigationEventDispatcherOwner navigationEventDispatcherOwner = androidx.view.C0285ViewTreeNavigationEventDispatcherOwner.get((android.view.View) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return navigationEventDispatcherOwner;
    }
}
