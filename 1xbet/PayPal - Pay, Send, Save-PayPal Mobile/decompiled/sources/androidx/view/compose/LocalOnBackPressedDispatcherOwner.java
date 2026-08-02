package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;", "", "<init>", "()V", "Landroidx/activity/OnBackPressedDispatcherOwner;", "dispatcherOwner", "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Landroidx/activity/OnBackPressedDispatcherOwner;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getHighSpeedVideoFpsRangesFor", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/OnBackPressedDispatcherOwner;", "current"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalOnBackPressedDispatcherOwner {
    public static final int $stable = 0;
    public static final androidx.view.compose.LocalOnBackPressedDispatcherOwner INSTANCE = new androidx.view.compose.LocalOnBackPressedDispatcherOwner();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.view.OnBackPressedDispatcherOwner> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.activity.compose.LocalOnBackPressedDispatcherOwner$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.view.compose.LocalOnBackPressedDispatcherOwner.m17$r8$lambda$Rl8XqmM9xvRKsFiHyJMmCCg3M();
        }
    }, 1, null);

    /* renamed from: $r8$lambda$Rl8-XqmM9xvRKsFiHyJMmC-Cg3M, reason: not valid java name */
    public static /* synthetic */ androidx.view.OnBackPressedDispatcherOwner m17$r8$lambda$Rl8XqmM9xvRKsFiHyJMmCCg3M() {
        return null;
    }

    private LocalOnBackPressedDispatcherOwner() {
    }

    public final androidx.view.OnBackPressedDispatcherOwner getCurrent(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2068013981, i, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:59)");
        }
        androidx.view.OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (androidx.view.OnBackPressedDispatcherOwner) composer.consume(getHighSpeedVideoFpsRangesFor);
        if (onBackPressedDispatcherOwner == null) {
            composer.startReplaceGroup(1208426157);
            onBackPressedDispatcherOwner = androidx.view.C0271ViewTreeOnBackPressedDispatcherOwner.get((android.view.View) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView()));
        } else {
            composer.startReplaceGroup(1208423708);
        }
        composer.endReplaceGroup();
        if (onBackPressedDispatcherOwner == null) {
            composer.startReplaceGroup(1208428160);
            java.lang.Object obj = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(obj instanceof android.content.ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof androidx.view.OnBackPressedDispatcherOwner) {
                    break;
                }
                obj = ((android.content.ContextWrapper) obj).getBaseContext();
            }
            onBackPressedDispatcherOwner = (androidx.view.OnBackPressedDispatcherOwner) obj;
        } else {
            composer.startReplaceGroup(1208423789);
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return onBackPressedDispatcherOwner;
    }

    public final androidx.compose.runtime.ProvidedValue<androidx.view.OnBackPressedDispatcherOwner> provides(androidx.view.OnBackPressedDispatcherOwner dispatcherOwner) {
        return getHighSpeedVideoFpsRangesFor.provides(dispatcherOwner);
    }
}
