package org.betup.ui.fragment.home.compose.matches;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.OddType;
import org.betup.ui.fragment.home.compose.HomeMatchItem;
import org.betup.ui.fragment.home.compose.HomeMatchOddUi;

/* compiled from: HomeMatchCardsPreview.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1750551499$1, reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1750551499$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1750551499$1 INSTANCE = new ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1750551499$1();

    ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1750551499$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$3$lambda$2(long j) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$5$lambda$4(long j) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$7$lambda$6(HomeMatchOddUi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        HomeMatchItem homeMatchItem;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1750551499, i, -1, "org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt.lambda$-1750551499.<anonymous> (HomeMatchCardsPreview.kt:102)");
        }
        homeMatchItem = HomeMatchCardsPreviewKt.previewLiveMatch;
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1750551499$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        OddType oddType = OddType.DECIMAL;
        composer.startReplaceGroup(1849434622);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1750551499$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1750551499$1.invoke$lambda$3$lambda$2(((Long) obj).longValue());
                    return Boolean.valueOf(invoke$lambda$3$lambda$2);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function1 function1 = (Function1) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1750551499$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1750551499$1.invoke$lambda$5$lambda$4(((Long) obj).longValue());
                    return Boolean.valueOf(invoke$lambda$5$lambda$4);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function1 function12 = (Function1) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1750551499$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1750551499$1.invoke$lambda$7$lambda$6((HomeMatchOddUi) obj);
                    return Boolean.valueOf(invoke$lambda$7$lambda$6);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function1 function13 = (Function1) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1750551499$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$9$lambda$8;
                    invoke$lambda$9$lambda$8 = ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1750551499$1.invoke$lambda$9$lambda$8((HomeMatchOddUi) obj);
                    return invoke$lambda$9$lambda$8;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        HomeMatchCardKt.HomeMatchCard(homeMatchItem, function0, oddType, function1, function12, function13, (Function1) rememberedValue5, null, composer, 1797552, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(HomeMatchOddUi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
