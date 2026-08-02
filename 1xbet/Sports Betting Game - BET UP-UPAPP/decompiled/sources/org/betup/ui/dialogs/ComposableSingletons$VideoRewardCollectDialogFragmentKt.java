package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: VideoRewardCollectDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$VideoRewardCollectDialogFragmentKt {
    public static final ComposableSingletons$VideoRewardCollectDialogFragmentKt INSTANCE = new ComposableSingletons$VideoRewardCollectDialogFragmentKt();

    /* renamed from: lambda$-1657785078, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3780lambda$1657785078 = ComposableLambdaKt.composableLambdaInstance(-1657785078, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$VideoRewardCollectDialogFragmentKt$lambda$-1657785078$1
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
                ComposerKt.traceEventStart(-1657785078, i, -1, "org.betup.ui.dialogs.ComposableSingletons$VideoRewardCollectDialogFragmentKt.lambda$-1657785078.<anonymous> (VideoRewardCollectDialogFragment.kt:192)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, "", null, null, false, false, false, false, composer, 48, 253);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1657785078$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13025getLambda$1657785078$app_release() {
        return f3780lambda$1657785078;
    }
}
