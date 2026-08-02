package com.paypal.oslo.feature.debitcard.shared.ui.util;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"CycleDurationMs", "", "FrameDelayMs", "AnimateProgressValue", "", "isLoading", "", "currentProgress", "Landroidx/compose/runtime/MutableFloatState;", "finalValue", "", "(ZLandroidx/compose/runtime/MutableFloatState;FLandroidx/compose/runtime/Composer;II)V", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProgressBarUtilKt {
    public static final void AnimateProgressValue(final boolean z, final androidx.compose.runtime.MutableFloatState mutableFloatState, float f, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableFloatState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(8420858);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(mutableFloatState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                f = 1.0f;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(8420858, i3, -1, "com.paypal.oslo.feature.debitcard.shared.ui.util.AnimateProgressValue (ProgressBarUtil.kt:54)");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean z2 = (i3 & 14) == 4;
            boolean z3 = (i3 & 112) == 32;
            boolean z4 = (i3 & 896) == 256;
            com.paypal.oslo.feature.debitcard.shared.ui.util.ProgressBarUtilKt$AnimateProgressValue$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | z3 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.debitcard.shared.ui.util.ProgressBarUtilKt$AnimateProgressValue$1$1(z, mutableFloatState, f, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final float f2 = f;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.util.ProgressBarUtilKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.util.ProgressBarUtilKt.$r8$lambda$fPDTHSz1hWxYA53nM12pMPibb3o(z, mutableFloatState, f2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fPDTHSz1hWxYA53nM12pMPibb3o(boolean z, androidx.compose.runtime.MutableFloatState mutableFloatState, float f, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AnimateProgressValue(z, mutableFloatState, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
