package com.paypal.oslo.feature.verificationcapture.ui.screens.deeplinkresult;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "onDone", "DeeplinkFailureScreen", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeeplinkFailureScreenKt {
    public static final void DeeplinkFailureScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1682652476);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1682652476, i2, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.deeplinkresult.DeeplinkFailureScreen (DeeplinkFailureScreen.kt:22)");
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.deeplinkresult.DeeplinkResultScreenKt.DeeplinkResultScreen("Something went wrong", "We couldn't verify your identity. Please try again.", function0, startRestartGroup, ((i2 << 6) & 896) | 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.deeplinkresult.DeeplinkFailureScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.deeplinkresult.DeeplinkFailureScreenKt.m20641$r8$lambda$n2DlbCEJzpC_sLnS2qwhPowQ0(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$n2Dlb-CEJzpC_sLnS2qwhPo-wQ0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20641$r8$lambda$n2DlbCEJzpC_sLnS2qwhPowQ0(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        DeeplinkFailureScreen(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
