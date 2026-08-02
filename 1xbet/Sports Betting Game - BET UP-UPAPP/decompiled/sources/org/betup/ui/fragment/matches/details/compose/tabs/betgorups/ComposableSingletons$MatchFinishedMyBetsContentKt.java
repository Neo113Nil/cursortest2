package org.betup.ui.fragment.matches.details.compose.tabs.betgorups;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchFinishedMyBetsContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MatchFinishedMyBetsContentKt {
    public static final ComposableSingletons$MatchFinishedMyBetsContentKt INSTANCE = new ComposableSingletons$MatchFinishedMyBetsContentKt();

    /* renamed from: lambda$-1317151393, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f3811lambda$1317151393 = ComposableLambdaKt.composableLambdaInstance(-1317151393, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.ComposableSingletons$MatchFinishedMyBetsContentKt$lambda$-1317151393$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1317151393, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.ComposableSingletons$MatchFinishedMyBetsContentKt.lambda$-1317151393.<anonymous> (MatchFinishedMyBetsContent.kt:110)");
            }
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1451987686, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f3812lambda$1451987686 = ComposableLambdaKt.composableLambdaInstance(-1451987686, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.ComposableSingletons$MatchFinishedMyBetsContentKt$lambda$-1451987686$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1451987686, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.ComposableSingletons$MatchFinishedMyBetsContentKt.lambda$-1451987686.<anonymous> (MatchFinishedMyBetsContent.kt:125)");
            }
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1317151393$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14018getLambda$1317151393$app_release() {
        return f3811lambda$1317151393;
    }

    /* renamed from: getLambda$-1451987686$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14019getLambda$1451987686$app_release() {
        return f3812lambda$1451987686;
    }
}
