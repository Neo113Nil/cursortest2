package org.betup.ui.common.compose;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HapticFeedbackEffect.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberHapticFeedback", "Lkotlin/Function1;", "Lorg/betup/ui/common/compose/HapticFeedbackType;", "", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HapticFeedbackEffectKt {
    public static final Function1<HapticFeedbackType, Unit> rememberHapticFeedback(Composer composer, int i) {
        composer.startReplaceGroup(1720521530);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1720521530, i, -1, "org.betup.ui.common.compose.rememberHapticFeedback (HapticFeedbackEffect.kt:541)");
        }
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final View view = (View) consume;
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(view);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.HapticFeedbackEffectKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit rememberHapticFeedback$lambda$1$lambda$0;
                    rememberHapticFeedback$lambda$1$lambda$0 = HapticFeedbackEffectKt.rememberHapticFeedback$lambda$1$lambda$0(view, (HapticFeedbackType) obj);
                    return rememberHapticFeedback$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1<HapticFeedbackType, Unit> function1 = (Function1) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberHapticFeedback$lambda$1$lambda$0(View view, HapticFeedbackType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        HapticFeedbackEffect.perform(view, type);
        return Unit.INSTANCE;
    }
}
