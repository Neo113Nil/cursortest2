package org.betup.ui.fragment.support.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: SupportTicketListScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SupportTicketListScreenKt$SupportTicketListContent$3$5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<String, Unit> $onTicketClick;
    final /* synthetic */ SupportTicketListState $state;

    /* JADX WARN: Multi-variable type inference failed */
    SupportTicketListScreenKt$SupportTicketListContent$3$5(SupportTicketListState supportTicketListState, Function1<? super String, Unit> function1) {
        this.$state = supportTicketListState;
        this.$onTicketClick = function1;
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
            ComposerKt.traceEventStart(212836565, i, -1, "org.betup.ui.fragment.support.compose.SupportTicketListContent.<anonymous>.<anonymous> (SupportTicketListScreen.kt:113)");
        }
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(this.$state) | composer.changed(this.$onTicketClick);
        final SupportTicketListState supportTicketListState = this.$state;
        final Function1<String, Unit> function1 = this.$onTicketClick;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportTicketListScreenKt$SupportTicketListContent$3$5$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = SupportTicketListScreenKt$SupportTicketListContent$3$5.invoke$lambda$4$lambda$3(SupportTicketListState.this, function1, (LazyListScope) obj);
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(fillMaxSize$default, null, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer, 24582, 494);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(SupportTicketListState supportTicketListState, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List<SupportTicketItem> tickets = supportTicketListState.getTickets();
        final Function1 function12 = new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportTicketListScreenKt$SupportTicketListContent$3$5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object invoke$lambda$4$lambda$3$lambda$0;
                invoke$lambda$4$lambda$3$lambda$0 = SupportTicketListScreenKt$SupportTicketListContent$3$5.invoke$lambda$4$lambda$3$lambda$0((SupportTicketItem) obj);
                return invoke$lambda$4$lambda$3$lambda$0;
            }
        };
        final SupportTicketListScreenKt$SupportTicketListContent$3$5$invoke$lambda$4$lambda$3$$inlined$items$default$1 supportTicketListScreenKt$SupportTicketListContent$3$5$invoke$lambda$4$lambda$3$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportTicketListScreenKt$SupportTicketListContent$3$5$invoke$lambda$4$lambda$3$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(SupportTicketItem supportTicketItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((SupportTicketItem) obj);
            }
        };
        LazyColumn.items(tickets.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.support.compose.SupportTicketListScreenKt$SupportTicketListContent$3$5$invoke$lambda$4$lambda$3$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(tickets.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.support.compose.SupportTicketListScreenKt$SupportTicketListContent$3$5$invoke$lambda$4$lambda$3$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(tickets.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.support.compose.SupportTicketListScreenKt$SupportTicketListContent$3$5$invoke$lambda$4$lambda$3$$inlined$items$default$4
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
                final SupportTicketItem supportTicketItem = (SupportTicketItem) tickets.get(i);
                composer.startReplaceGroup(-1523490674);
                composer.startReplaceGroup(-1633490746);
                boolean changed = composer.changed(supportTicketItem) | composer.changed(function1);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function13 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.support.compose.SupportTicketListScreenKt$SupportTicketListContent$3$5$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (StringsKt.isBlank(SupportTicketItem.this.getChatId())) {
                                return;
                            }
                            function13.invoke(SupportTicketItem.this.getChatId());
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                SupportTicketListScreenKt.SupportTicketItemRow(supportTicketItem, (Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$4$lambda$3$lambda$0(SupportTicketItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getChatId();
    }
}
