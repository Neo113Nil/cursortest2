package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "ThreeDsChallengeProgressView", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThreeDsChallengeProgressViewKt {
    public static final void ThreeDsChallengeProgressView(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-471153376);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-471153376, i, -1, "com.paypal.android.threeds.ui.ThreeDsChallengeProgressView (ThreeDsChallengeProgressView.kt:26)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.ui.ThreeDsChallengeProgressViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.window.AndroidDialog_androidKt.Dialog((kotlin.jvm.functions.Function0) rememberedValue, new androidx.compose.ui.window.DialogProperties(false, false, false, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.paypal.android.threeds.ui.ComposableSingletons$ThreeDsChallengeProgressViewKt.INSTANCE.m10990getLambda$1057723977$three_ds_release(), startRestartGroup, 438, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ThreeDsChallengeProgressViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.ThreeDsChallengeProgressViewKt.$r8$lambda$eHsUuc9V0yW3bJzRbLV1GiclvDY(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eHsUuc9V0yW3bJzRbLV1GiclvDY(int i, androidx.compose.runtime.Composer composer, int i2) {
        ThreeDsChallengeProgressView(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
