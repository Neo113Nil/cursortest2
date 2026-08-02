package org.betup.ui.fragment.dailybonus.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
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
import org.betup.ui.fragment.dailybonus.model.DailyBonusData;
import org.betup.ui.fragment.dailybonus.model.DailyBonusDay;
import org.betup.ui.fragment.dailybonus.model.DailyBonusState;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: DailyBonusDialog.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DailyBonusDialogKt$DailyBonusDialog$1$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ DailyBonusData $bonusData;
    final /* synthetic */ boolean $hasClaimableNow;
    final /* synthetic */ Integer $nextClaimableDayId;
    final /* synthetic */ long $nextRewardAfterMs;
    final /* synthetic */ Function1<DailyBonusDay, Unit> $onDayClick;

    /* JADX WARN: Multi-variable type inference failed */
    DailyBonusDialogKt$DailyBonusDialog$1$3(DailyBonusData dailyBonusData, boolean z, Integer num, long j, Function1<? super DailyBonusDay, Unit> function1) {
        this.$bonusData = dailyBonusData;
        this.$hasClaimableNow = z;
        this.$nextClaimableDayId = num;
        this.$nextRewardAfterMs = j;
        this.$onDayClick = function1;
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
            ComposerKt.traceEventStart(463647558, i, -1, "org.betup.ui.fragment.dailybonus.compose.DailyBonusDialog.<anonymous>.<anonymous> (DailyBonusDialog.kt:86)");
        }
        GridCells.Fixed fixed = new GridCells.Fixed(2);
        float f = 12;
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
        Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f));
        PaddingValues m1513PaddingValuesa9UjIt4$default = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f), 7, null);
        GridCells.Fixed fixed2 = fixed;
        Arrangement.HorizontalOrVertical horizontalOrVertical = m1397spacedBy0680j_42;
        Arrangement.HorizontalOrVertical horizontalOrVertical2 = m1397spacedBy0680j_4;
        composer.startReplaceGroup(-1224400529);
        boolean changedInstance = composer.changedInstance(this.$bonusData) | composer.changed(this.$hasClaimableNow) | composer.changed(this.$nextClaimableDayId) | composer.changed(this.$nextRewardAfterMs) | composer.changed(this.$onDayClick);
        final DailyBonusData dailyBonusData = this.$bonusData;
        final boolean z = this.$hasClaimableNow;
        final Integer num = this.$nextClaimableDayId;
        final long j = this.$nextRewardAfterMs;
        final Function1<DailyBonusDay, Unit> function1 = this.$onDayClick;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.dailybonus.compose.DailyBonusDialogKt$DailyBonusDialog$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = DailyBonusDialogKt$DailyBonusDialog$1$3.invoke$lambda$3$lambda$2(DailyBonusData.this, z, num, j, function1, (LazyGridScope) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        LazyGridDslKt.LazyVerticalGrid(fixed2, m1516padding3ABfNKs, null, m1513PaddingValuesa9UjIt4$default, false, horizontalOrVertical, horizontalOrVertical2, null, false, null, (Function1) rememberedValue, composer, 1772592, 0, 916);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(DailyBonusData dailyBonusData, final boolean z, final Integer num, final long j, final Function1 function1, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final List<DailyBonusDay> bonuses = dailyBonusData.getBonuses();
        final DailyBonusDialogKt$DailyBonusDialog$1$3$invoke$lambda$3$lambda$2$$inlined$items$default$1 dailyBonusDialogKt$DailyBonusDialog$1$3$invoke$lambda$3$lambda$2$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.dailybonus.compose.DailyBonusDialogKt$DailyBonusDialog$1$3$invoke$lambda$3$lambda$2$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(DailyBonusDay dailyBonusDay) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((DailyBonusDay) obj);
            }
        };
        LazyVerticalGrid.items(bonuses.size(), null, null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.dailybonus.compose.DailyBonusDialogKt$DailyBonusDialog$1$3$invoke$lambda$3$lambda$2$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num2) {
                return invoke(num2.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(bonuses.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.dailybonus.compose.DailyBonusDialogKt$DailyBonusDialog$1$3$invoke$lambda$3$lambda$2$$inlined$items$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num2, Composer composer, Integer num3) {
                invoke(lazyGridItemScope, num2.intValue(), composer, num3.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
            /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
                int i3;
                boolean z2;
                boolean changed;
                Object rememberedValue;
                ComposerKt.sourceInformation(composer, "C542@23993L22:LazyGridDsl.kt#7791vq");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i2;
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
                    ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                final DailyBonusDay dailyBonusDay = (DailyBonusDay) bonuses.get(i);
                composer.startReplaceGroup(-778761940);
                if (!z) {
                    int id = dailyBonusDay.getId();
                    Integer num2 = num;
                    if (num2 != null && id == num2.intValue() && dailyBonusDay.getState() == DailyBonusState.LOCKED) {
                        z2 = true;
                        boolean z3 = dailyBonusDay.getState() != DailyBonusState.AVAILABLE;
                        Long valueOf = !z2 ? Long.valueOf(j) : null;
                        composer.startReplaceGroup(-1633490746);
                        changed = composer.changed(dailyBonusDay) | composer.changed(function1);
                        rememberedValue = composer.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Function1 function12 = function1;
                            rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.dailybonus.compose.DailyBonusDialogKt$DailyBonusDialog$1$3$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (DailyBonusDay.this.getState() == DailyBonusState.AVAILABLE) {
                                        function12.invoke(DailyBonusDay.this);
                                    }
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        composer.endReplaceGroup();
                        DailyBonusItemKt.DailyBonusItem(dailyBonusDay, z3, z2, valueOf, (Function0) rememberedValue, null, composer, 0, 32);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            return;
                        }
                        ComposerKt.traceEventEnd();
                        return;
                    }
                }
                z2 = false;
                if (dailyBonusDay.getState() != DailyBonusState.AVAILABLE) {
                }
                if (!z2) {
                }
                composer.startReplaceGroup(-1633490746);
                changed = composer.changed(dailyBonusDay) | composer.changed(function1);
                rememberedValue = composer.rememberedValue();
                if (!changed) {
                }
                final Function1<? super DailyBonusDay, Unit> function122 = function1;
                rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.dailybonus.compose.DailyBonusDialogKt$DailyBonusDialog$1$3$1$1$1$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (DailyBonusDay.this.getState() == DailyBonusState.AVAILABLE) {
                            function122.invoke(DailyBonusDay.this);
                        }
                    }
                };
                composer.updateRememberedValue(rememberedValue);
                composer.endReplaceGroup();
                DailyBonusItemKt.DailyBonusItem(dailyBonusDay, z3, z2, valueOf, (Function0) rememberedValue, null, composer, 0, 32);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
