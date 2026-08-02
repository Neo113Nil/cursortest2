package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u008a\u0084\u0002"}, d2 = {"rememberPredictiveBackState", "Landroidx/compose/material3/internal/PredictiveBackState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/internal/PredictiveBackState;", "PredictiveBackStateHandler", "", "state", "enabled", "", "onBack", "Lkotlin/Function0;", "(Landroidx/compose/material3/internal/PredictiveBackState;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "material3", "currentOnBack"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BasicEdgeToEdgeDialogKt {
    public static final androidx.compose.material3.internal.PredictiveBackState rememberPredictiveBackState(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1883443352, i, -1, "androidx.compose.material3.internal.rememberPredictiveBackState (BasicEdgeToEdgeDialog.kt:77)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material3.internal.PredictiveBackStateImpl();
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material3.internal.PredictiveBackStateImpl predictiveBackStateImpl = (androidx.compose.material3.internal.PredictiveBackStateImpl) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return predictiveBackStateImpl;
    }

    public static final void PredictiveBackStateHandler(final androidx.compose.material3.internal.PredictiveBackState predictiveBackState, boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(698755635);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(predictiveBackState) : startRestartGroup.changedInstance(predictiveBackState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        boolean z2 = true;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                z = true;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(698755635, i3, -1, "androidx.compose.material3.internal.PredictiveBackStateHandler (BasicEdgeToEdgeDialog.kt:90)");
            }
            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 6) & 14);
            startRestartGroup.startMovableGroup(1489276985, predictiveBackState);
            kotlin.jvm.internal.Intrinsics.checkNotNull(predictiveBackState, "");
            boolean z3 = z && !(((androidx.compose.material3.internal.PredictiveBackStateImpl) predictiveBackState).getValue() instanceof androidx.compose.material3.internal.BackEventProgress.Completed);
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !startRestartGroup.changedInstance(predictiveBackState))) {
                z2 = false;
            }
            boolean changed = startRestartGroup.changed(rememberUpdatedState);
            androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(predictiveBackState, rememberUpdatedState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material3.internal.BackHandler_androidKt.PredictiveBackHandler(z3, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, 0, 0);
            startRestartGroup.endMovableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final boolean z4 = z;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt.m4286$r8$lambda$2vKQfULQsi8f8Ysjl8RlVLTNEA(androidx.compose.material3.internal.PredictiveBackState.this, z4, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$2vK-QfULQsi8f8Ysjl8RlVLTNEA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4286$r8$lambda$2vKQfULQsi8f8Ysjl8RlVLTNEA(androidx.compose.material3.internal.PredictiveBackState predictiveBackState, boolean z, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PredictiveBackStateHandler(predictiveBackState, z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$PredictiveBackStateHandler$lambda$1(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function0) state.getValue();
    }
}
