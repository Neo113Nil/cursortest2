package org.betup.ui.fragment.home.compose.matches;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.OddType;
import org.betup.ui.fragment.home.compose.HomeMatchItem;
import org.betup.ui.fragment.home.compose.HomeMatchOddUi;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: HomeMatchCardsPreview.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1521422871$1, reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1 INSTANCE = new ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1();

    ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1() {
    }

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
            ComposerKt.traceEventStart(-1521422871, i, -1, "org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt.lambda$-1521422871.<anonymous> (HomeMatchCardsPreview.kt:257)");
        }
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(10));
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1521422871$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1.invoke$lambda$8$lambda$7((LazyListScope) obj);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyRow(null, null, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer, 805330944, 495);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(LazyListScope LazyRow) {
        HomeMatchItem homeMatchItem;
        HomeMatchItem homeMatchItem2;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        homeMatchItem = HomeMatchCardsPreviewKt.previewLiveMatch;
        homeMatchItem2 = HomeMatchCardsPreviewKt.previewMoreMatch;
        final List listOf = CollectionsKt.listOf((Object[]) new HomeMatchItem[]{homeMatchItem, homeMatchItem2});
        final Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1521422871$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object invoke$lambda$8$lambda$7$lambda$0;
                invoke$lambda$8$lambda$7$lambda$0 = ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1.invoke$lambda$8$lambda$7$lambda$0((HomeMatchItem) obj);
                return invoke$lambda$8$lambda$7$lambda$0;
            }
        };
        final ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1$invoke$lambda$8$lambda$7$$inlined$items$default$1 composableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1$invoke$lambda$8$lambda$7$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1521422871$1$invoke$lambda$8$lambda$7$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(HomeMatchItem homeMatchItem3) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((HomeMatchItem) obj);
            }
        };
        LazyRow.items(listOf.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1521422871$1$invoke$lambda$8$lambda$7$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(listOf.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1521422871$1$invoke$lambda$8$lambda$7$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(listOf.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1521422871$1$invoke$lambda$8$lambda$7$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                HomeMatchItem homeMatchItem3 = (HomeMatchItem) listOf.get(i);
                composer.startReplaceGroup(-1072846580);
                composer.startReplaceGroup(1849434622);
                ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1$1$1$2$1$1 rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0<Unit>() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1521422871$1$1$1$2$1$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                composer.endReplaceGroup();
                OddType oddType = OddType.DECIMAL;
                composer.startReplaceGroup(1849434622);
                ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1$1$1$2$2$1 rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1<Long, Boolean>() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1521422871$1$1$1$2$2$1
                        public final Boolean invoke(long j) {
                            return false;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Long l) {
                            return invoke(l.longValue());
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                Function1 function12 = (Function1) rememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1$1$1$2$3$1 rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1<Long, Boolean>() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1521422871$1$1$1$2$3$1
                        public final Boolean invoke(long j) {
                            return false;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Long l) {
                            return invoke(l.longValue());
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                Function1 function13 = (Function1) rememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1$1$1$2$4$1 rememberedValue4 = composer.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function1<HomeMatchOddUi, Boolean>() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1521422871$1$1$1$2$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(HomeMatchOddUi it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return false;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                Function1 function14 = (Function1) rememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1$1$1$2$5$1 rememberedValue5 = composer.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function1<HomeMatchOddUi, Unit>() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$-1521422871$1$1$1$2$5$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(HomeMatchOddUi it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(HomeMatchOddUi homeMatchOddUi) {
                            invoke2(homeMatchOddUi);
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue5);
                }
                composer.endReplaceGroup();
                HomeMatchCardKt.HomeMatchCard(homeMatchItem3, function0, oddType, function12, function13, function14, (Function1) rememberedValue5, null, composer, 1797552, 128);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$8$lambda$7$lambda$0(HomeMatchItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getMatchId());
    }
}
