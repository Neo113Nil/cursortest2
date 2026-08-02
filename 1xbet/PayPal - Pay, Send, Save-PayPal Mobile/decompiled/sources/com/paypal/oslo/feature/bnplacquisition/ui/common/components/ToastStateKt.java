package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToastState;", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "", "Landroidx/compose/runtime/Composable;", com.sun.jna.Callback.METHOD_NAME, "OnVisible", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToastState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "rememberToastState", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToastState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ToastStateKt {
    public static final void OnVisible(final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState, final kotlin.jvm.functions.Function3<? super com.paypal.oslo.core.commonui.utils.RefText, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-695467282);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(toastState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-695467282, i2, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.OnVisible (ToastState.kt:56)");
            }
            com.paypal.oslo.core.commonui.utils.RefText message = toastState.getMessage();
            if (message == null) {
                startRestartGroup.startReplaceGroup(256520737);
            } else {
                startRestartGroup.startReplaceGroup(256520738);
                if (toastState.getShow()) {
                    startRestartGroup.startReplaceGroup(-1304384688);
                    function3.invoke(message, startRestartGroup, java.lang.Integer.valueOf((i2 & 112) | com.paypal.oslo.core.commonui.utils.RefText.$stable));
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1304345287);
                    startRestartGroup.endReplaceGroup();
                }
            }
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastStateKt.$r8$lambda$IT738pfSRfLIWmN7hkiLxx7QAo8(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState.this, function3, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState rememberToastState(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(626492434, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.rememberToastState (ToastState.kt:68)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState();
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return toastState;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IT738pfSRfLIWmN7hkiLxx7QAo8(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState, kotlin.jvm.functions.Function3 function3, int i, androidx.compose.runtime.Composer composer, int i2) {
        OnVisible(toastState, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
