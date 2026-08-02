package org.betup.ui.fragment.support.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
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
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: SupportFaqScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SupportFaqScreenKt$SupportFaqContent$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotStateMap<String, Boolean> $expandedStates;
    final /* synthetic */ SupportFaqState $state;

    SupportFaqScreenKt$SupportFaqContent$3(SupportFaqState supportFaqState, SnapshotStateMap<String, Boolean> snapshotStateMap) {
        this.$state = supportFaqState;
        this.$expandedStates = snapshotStateMap;
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
            ComposerKt.traceEventStart(-1809295962, i, -1, "org.betup.ui.fragment.support.compose.SupportFaqContent.<anonymous> (SupportFaqScreen.kt:77)");
        }
        Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(this.$state) | composer.changed(this.$expandedStates);
        final SupportFaqState supportFaqState = this.$state;
        final SnapshotStateMap<String, Boolean> snapshotStateMap = this.$expandedStates;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportFaqScreenKt$SupportFaqContent$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = SupportFaqScreenKt$SupportFaqContent$3.invoke$lambda$4$lambda$3(SupportFaqState.this, snapshotStateMap, (LazyListScope) obj);
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(m1518paddingVpY3zN4$default, null, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer, 24582, 494);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(SupportFaqState supportFaqState, final SnapshotStateMap snapshotStateMap, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List<SupportFaqItem> items = supportFaqState.getItems();
        final Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportFaqScreenKt$SupportFaqContent$3$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object invoke$lambda$4$lambda$3$lambda$0;
                invoke$lambda$4$lambda$3$lambda$0 = SupportFaqScreenKt$SupportFaqContent$3.invoke$lambda$4$lambda$3$lambda$0((SupportFaqItem) obj);
                return invoke$lambda$4$lambda$3$lambda$0;
            }
        };
        final SupportFaqScreenKt$SupportFaqContent$3$invoke$lambda$4$lambda$3$$inlined$items$default$1 supportFaqScreenKt$SupportFaqContent$3$invoke$lambda$4$lambda$3$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportFaqScreenKt$SupportFaqContent$3$invoke$lambda$4$lambda$3$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(SupportFaqItem supportFaqItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((SupportFaqItem) obj);
            }
        };
        LazyColumn.items(items.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.support.compose.SupportFaqScreenKt$SupportFaqContent$3$invoke$lambda$4$lambda$3$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(items.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.support.compose.SupportFaqScreenKt$SupportFaqContent$3$invoke$lambda$4$lambda$3$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(items.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.support.compose.SupportFaqScreenKt$SupportFaqContent$3$invoke$lambda$4$lambda$3$$inlined$items$default$4
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
                final SupportFaqItem supportFaqItem = (SupportFaqItem) items.get(i);
                composer.startReplaceGroup(-933888011);
                Boolean bool = (Boolean) snapshotStateMap.get(supportFaqItem.getId());
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                composer.startReplaceGroup(-1633490746);
                boolean changed = composer.changed(snapshotStateMap) | composer.changed(supportFaqItem);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final SnapshotStateMap snapshotStateMap2 = snapshotStateMap;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.support.compose.SupportFaqScreenKt$SupportFaqContent$3$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            snapshotStateMap2.put(supportFaqItem.getId(), Boolean.valueOf(!(snapshotStateMap2.get(supportFaqItem.getId()) != null ? r2.booleanValue() : false)));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                SupportFaqScreenKt.SupportFaqItemCard(supportFaqItem, booleanValue, (Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$4$lambda$3$lambda$0(SupportFaqItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }
}
