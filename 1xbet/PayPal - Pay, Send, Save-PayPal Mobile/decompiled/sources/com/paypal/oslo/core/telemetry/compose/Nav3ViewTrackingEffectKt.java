package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\f\u0010\t\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002"}, d2 = {"Nav3ViewTrackingEffect", "", "backStack", "", "Landroidx/navigation3/runtime/NavKey;", "nav3ViewTracker", "Lcom/paypal/oslo/core/telemetry/compose/Nav3ViewTracker;", "(Ljava/util/List;Lcom/paypal/oslo/core/telemetry/compose/Nav3ViewTracker;Landroidx/compose/runtime/Composer;I)V", "telemetry_release", "lastKey"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Nav3ViewTrackingEffectKt {
    public static final void Nav3ViewTrackingEffect(final java.util.List<? extends androidx.navigation3.runtime.NavKey> list, final com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker nav3ViewTracker, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nav3ViewTracker, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1557564860);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(nav3ViewTracker) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1557564860, i2, -1, "com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffect (Nav3ViewTrackingEffect.kt:61)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            androidx.navigation3.runtime.NavKey navKey = (androidx.navigation3.runtime.NavKey) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) list);
            boolean changedInstance = startRestartGroup.changedInstance(navKey);
            boolean z = (i2 & 112) == 32;
            com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt$Nav3ViewTrackingEffect$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt$Nav3ViewTrackingEffect$1$1(navKey, nav3ViewTracker, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(navKey, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt.$r8$lambda$7cnvWqJ0VzFc2xbNrI3ZBfzIHsI(list, nav3ViewTracker, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7cnvWqJ0VzFc2xbNrI3ZBfzIHsI(java.util.List list, com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker nav3ViewTracker, int i, androidx.compose.runtime.Composer composer, int i2) {
        Nav3ViewTrackingEffect(list, nav3ViewTracker, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ androidx.navigation3.runtime.NavKey access$Nav3ViewTrackingEffect$lambda$1(androidx.compose.runtime.MutableState mutableState) {
        return (androidx.navigation3.runtime.NavKey) mutableState.getValue();
    }
}
