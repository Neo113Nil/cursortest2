package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/navigationevent/compose/LocalNavigationEventDispatcherOwner;", "", "<init>", "()V", "Landroidx/navigationevent/NavigationEventDispatcherOwner;", "navigationEventDispatcherOwner", "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Landroidx/navigationevent/NavigationEventDispatcherOwner;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/navigationevent/NavigationEventDispatcherOwner;", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalNavigationEventDispatcherOwner {
    public static final int $stable = 0;
    public static final androidx.view.compose.LocalNavigationEventDispatcherOwner INSTANCE = new androidx.view.compose.LocalNavigationEventDispatcherOwner();
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.view.NavigationEventDispatcherOwner> Camera2StreamConfigurationMap = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.view.compose.LocalNavigationEventDispatcherOwner.m9241$r8$lambda$41FuFHPma0ud5TUZbEtH92bJZQ();
        }
    }, 1, null);

    /* renamed from: $r8$lambda$41-FuFHPma0ud5TUZbEtH92bJZQ, reason: not valid java name */
    public static /* synthetic */ androidx.view.NavigationEventDispatcherOwner m9241$r8$lambda$41FuFHPma0ud5TUZbEtH92bJZQ() {
        return null;
    }

    private LocalNavigationEventDispatcherOwner() {
    }

    public final androidx.view.NavigationEventDispatcherOwner getCurrent(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-942026292, i, -1, "androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner.<get-current> (LocalNavigationEventDispatcherOwner.kt:38)");
        }
        androidx.view.NavigationEventDispatcherOwner navigationEventDispatcherOwner = (androidx.view.NavigationEventDispatcherOwner) composer.consume(Camera2StreamConfigurationMap);
        if (navigationEventDispatcherOwner != null) {
            composer.startReplaceGroup(950834231);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(950836184);
            navigationEventDispatcherOwner = androidx.view.compose.LocalNavigationEventDispatcherOwner_androidKt.findViewTreeNavigationEventDispatcherOwner(composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return navigationEventDispatcherOwner;
    }

    public final androidx.compose.runtime.ProvidedValue<androidx.view.NavigationEventDispatcherOwner> provides(androidx.view.NavigationEventDispatcherOwner navigationEventDispatcherOwner) {
        return Camera2StreamConfigurationMap.provides(navigationEventDispatcherOwner);
    }
}
