package org.betup.ui.common.compose;

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
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: TicketDark.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$TicketDarkKt {
    public static final ComposableSingletons$TicketDarkKt INSTANCE = new ComposableSingletons$TicketDarkKt();

    /* renamed from: lambda$-2039175627, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3772lambda$2039175627 = ComposableLambdaKt.composableLambdaInstance(-2039175627, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.ComposableSingletons$TicketDarkKt$lambda$-2039175627$1
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
                ComposerKt.traceEventStart(-2039175627, i, -1, "org.betup.ui.common.compose.ComposableSingletons$TicketDarkKt.lambda$-2039175627.<anonymous> (TicketDark.kt:387)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, null, null, null, false, false, false, false, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1727426068 = ComposableLambdaKt.composableLambdaInstance(1727426068, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.ComposableSingletons$TicketDarkKt$lambda$1727426068$1
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
                ComposerKt.traceEventStart(1727426068, i, -1, "org.betup.ui.common.compose.ComposableSingletons$TicketDarkKt.lambda$1727426068.<anonymous> (TicketDark.kt:397)");
            }
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(100)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1199060467 = ComposableLambdaKt.composableLambdaInstance(1199060467, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.ComposableSingletons$TicketDarkKt$lambda$1199060467$1
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
                ComposerKt.traceEventStart(1199060467, i, -1, "org.betup.ui.common.compose.ComposableSingletons$TicketDarkKt.lambda$1199060467.<anonymous> (TicketDark.kt:390)");
            }
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(100)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2039175627$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12921getLambda$2039175627$app_release() {
        return f3772lambda$2039175627;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1199060467$app_release() {
        return lambda$1199060467;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1727426068$app_release() {
        return lambda$1727426068;
    }
}
