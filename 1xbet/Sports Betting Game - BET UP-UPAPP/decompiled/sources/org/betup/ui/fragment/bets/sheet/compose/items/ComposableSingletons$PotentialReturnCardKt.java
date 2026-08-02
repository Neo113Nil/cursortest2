package org.betup.ui.fragment.bets.sheet.compose.items;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PotentialReturnCard.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PotentialReturnCardKt {
    public static final ComposableSingletons$PotentialReturnCardKt INSTANCE = new ComposableSingletons$PotentialReturnCardKt();

    /* renamed from: lambda$-1723483215, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3800lambda$1723483215 = ComposableLambdaKt.composableLambdaInstance(-1723483215, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.ComposableSingletons$PotentialReturnCardKt$lambda$-1723483215$1
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
                ComposerKt.traceEventStart(-1723483215, i, -1, "org.betup.ui.fragment.bets.sheet.compose.items.ComposableSingletons$PotentialReturnCardKt.lambda$-1723483215.<anonymous> (PotentialReturnCard.kt:116)");
            }
            PotentialReturnCardKt.PotentialReturnCard(3800L, null, 2800L, composer, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1723483215$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13600getLambda$1723483215$app_release() {
        return f3800lambda$1723483215;
    }
}
