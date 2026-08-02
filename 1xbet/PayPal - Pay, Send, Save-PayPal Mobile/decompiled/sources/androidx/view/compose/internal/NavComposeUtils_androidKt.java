package androidx.view.compose.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001aT\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052;\u0010\u0006\u001a7\b\u0001\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060\u0001j\u0002`\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007H\u0001¢\u0006\u0002\u0010\u000f\u001a\b\u0010\u0010\u001a\u00020\u0011H\u0000*\f\b\u0000\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0012"}, d2 = {"BackEventCompat", "Landroidx/activity/BackEventCompat;", "PredictiveBackHandler", "", "enabled", "", "onBack", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/navigation/compose/internal/BackEventCompat;", "Lkotlin/ParameterName;", "name", "progress", "Lkotlin/coroutines/Continuation;", "", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "randomUUID", "", "navigation-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavComposeUtils_androidKt {
    public static final void PredictiveBackHandler(final boolean z, final kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.Flow<androidx.view.BackEventCompat>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1818896922);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                z = true;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1818896922, i3, -1, "androidx.navigation.compose.internal.PredictiveBackHandler (NavComposeUtils.android.kt:30)");
            }
            androidx.view.compose.PredictiveBackHandlerKt.PredictiveBackHandler(z, function2, startRestartGroup, i3 & 126, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigation.compose.internal.NavComposeUtils_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.compose.internal.NavComposeUtils_androidKt.$r8$lambda$Mz8bFxs_MDw1P5rFfnOfEyEIgVw(z, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final java.lang.String randomUUID() {
        return java.util.UUID.randomUUID().toString();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Mz8bFxs_MDw1P5rFfnOfEyEIgVw(boolean z, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PredictiveBackHandler(z, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
