package org.betup.ui.dialogs;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: FollowersDialog.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$FollowersDialogKt {
    public static final ComposableSingletons$FollowersDialogKt INSTANCE = new ComposableSingletons$FollowersDialogKt();
    private static Function2<Composer, Integer, Unit> lambda$74976125 = ComposableLambdaKt.composableLambdaInstance(74976125, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$FollowersDialogKt$lambda$74976125$1
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
                ComposerKt.traceEventStart(74976125, i, -1, "org.betup.ui.dialogs.ComposableSingletons$FollowersDialogKt.lambda$74976125.<anonymous> (FollowersDialog.kt:224)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.my_followers, composer, 6), null, null, false, false, false, false, composer, 0, 253);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$758936831 = ComposableLambdaKt.composableLambdaInstance(758936831, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$FollowersDialogKt$lambda$758936831$1
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
                ComposerKt.traceEventStart(758936831, i, -1, "org.betup.ui.dialogs.ComposableSingletons$FollowersDialogKt.lambda$758936831.<anonymous> (FollowersDialog.kt:229)");
            }
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 0.0f, Dp.m7774constructorimpl(20), 5, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(44)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$74976125$app_release() {
        return lambda$74976125;
    }

    public final Function2<Composer, Integer, Unit> getLambda$758936831$app_release() {
        return lambda$758936831;
    }
}
