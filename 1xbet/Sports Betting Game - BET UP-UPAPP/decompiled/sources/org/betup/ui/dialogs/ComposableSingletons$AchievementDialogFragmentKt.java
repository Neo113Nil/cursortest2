package org.betup.ui.dialogs;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AchievementDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$AchievementDialogFragmentKt {
    public static final ComposableSingletons$AchievementDialogFragmentKt INSTANCE = new ComposableSingletons$AchievementDialogFragmentKt();
    private static Function2<Composer, Integer, Unit> lambda$1726338704 = ComposableLambdaKt.composableLambdaInstance(1726338704, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$AchievementDialogFragmentKt$lambda$1726338704$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1726338704, i, -1, "org.betup.ui.dialogs.ComposableSingletons$AchievementDialogFragmentKt.lambda$1726338704.<anonymous> (AchievementDialogFragment.kt:271)");
            }
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(28)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1726338704$app_release() {
        return lambda$1726338704;
    }
}
