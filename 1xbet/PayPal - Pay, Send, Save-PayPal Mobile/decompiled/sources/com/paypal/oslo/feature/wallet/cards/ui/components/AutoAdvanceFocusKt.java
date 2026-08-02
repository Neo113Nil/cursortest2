package com.paypal.oslo.feature.wallet.cards.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "maxLength", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "", "AutoAdvanceFocus", "(Ljava/lang/String;ILandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoAdvanceFocusKt {
    public static final void AutoAdvanceFocus(final java.lang.String str, final int i, final androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusRequester, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(974395589);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(focusRequester) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(974395589, i3, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.AutoAdvanceFocus (AutoAdvanceFocus.kt:32)");
            }
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            boolean z2 = (i3 & 112) == 32;
            boolean z3 = (i3 & 896) == 256;
            com.paypal.oslo.feature.wallet.cards.ui.components.AutoAdvanceFocusKt$AutoAdvanceFocus$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.wallet.cards.ui.components.AutoAdvanceFocusKt$AutoAdvanceFocus$1$1(str, i, focusRequester, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.AutoAdvanceFocusKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.components.AutoAdvanceFocusKt.$r8$lambda$YP8kjAaLItZQulFOTHCYARwCPy0(str, i, focusRequester, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YP8kjAaLItZQulFOTHCYARwCPy0(java.lang.String str, int i, androidx.compose.ui.focus.FocusRequester focusRequester, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AutoAdvanceFocus(str, i, focusRequester, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
