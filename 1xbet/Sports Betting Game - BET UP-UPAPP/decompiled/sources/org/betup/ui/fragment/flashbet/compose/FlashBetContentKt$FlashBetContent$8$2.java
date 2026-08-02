package org.betup.ui.fragment.flashbet.compose;

import android.os.Bundle;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.fragment.flashbet.controller.FlashBetController;
import org.betup.ui.fragment.flashbet.controller.FlashBetSportsState;
import org.betup.ui.fragment.flashbet.controller.FlashBetStatsState;
import org.greenrobot.eventbus.EventBus;

/* compiled from: FlashBetContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlashBetContentKt$FlashBetContent$8$2 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ FlashBetController $controller;
    final /* synthetic */ State<Boolean> $isSportsRefreshing$delegate;
    final /* synthetic */ State<Boolean> $isStatsRefreshing$delegate;
    final /* synthetic */ Function1<String, Unit> $onStatsItemClick;
    final /* synthetic */ Function0<Unit> $playClick;
    final /* synthetic */ State<FlashBetSportsState> $sportsState$delegate;
    final /* synthetic */ State<FlashBetStatsState> $statsState$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    FlashBetContentKt$FlashBetContent$8$2(FlashBetController flashBetController, Function0<Unit> function0, Function1<? super String, Unit> function1, State<? extends FlashBetSportsState> state, State<Boolean> state2, State<? extends FlashBetStatsState> state3, State<Boolean> state4) {
        this.$controller = flashBetController;
        this.$playClick = function0;
        this.$onStatsItemClick = function1;
        this.$sportsState$delegate = state;
        this.$isSportsRefreshing$delegate = state2;
        this.$statsState$delegate = state3;
        this.$isStatsRefreshing$delegate = state4;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(FlashBetController flashBetController) {
        flashBetController.loadSports(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(Function0 function0, FlashBetCategoryItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        function0.invoke();
        Bundle bundle = new Bundle();
        bundle.putString(GetRandomTeamImagesInteractor.KEY_SPORT_ID, item.getId());
        bundle.putString("sportName", item.getName());
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.FLASH_BET_CATEGORIES, bundle));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(FlashBetController flashBetController) {
        flashBetController.loadStats(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(Function0 function0, Function1 function1, String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        function0.invoke();
        function1.invoke(sessionId);
        return Unit.INSTANCE;
    }

    public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
        FlashBetSportsState FlashBetContent$lambda$13;
        boolean FlashBetContent$lambda$15;
        FlashBetStatsState FlashBetContent$lambda$14;
        boolean FlashBetContent$lambda$16;
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-443942569, i2, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetContent.<anonymous>.<anonymous> (FlashBetContent.kt:108)");
        }
        if (i == 0) {
            composer.startReplaceGroup(-1427043944);
            FlashBetContent$lambda$13 = FlashBetContentKt.FlashBetContent$lambda$13(this.$sportsState$delegate);
            FlashBetContent$lambda$15 = FlashBetContentKt.FlashBetContent$lambda$15(this.$isSportsRefreshing$delegate);
            composer.startReplaceGroup(5004770);
            boolean changedInstance = composer.changedInstance(this.$controller);
            final FlashBetController flashBetController = this.$controller;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetContent$8$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = FlashBetContentKt$FlashBetContent$8$2.invoke$lambda$1$lambda$0(FlashBetController.this);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changed = composer.changed(this.$playClick);
            final Function0<Unit> function02 = this.$playClick;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetContent$8$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$4$lambda$3;
                        invoke$lambda$4$lambda$3 = FlashBetContentKt$FlashBetContent$8$2.invoke$lambda$4$lambda$3(Function0.this, (FlashBetCategoryItem) obj);
                        return invoke$lambda$4$lambda$3;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            FlashBetContentKt.FlashBetsListContent(FlashBetContent$lambda$13, FlashBetContent$lambda$15, function0, (Function1) rememberedValue2, composer, 0, 0);
            composer.endReplaceGroup();
        } else if (i == 1) {
            composer.startReplaceGroup(-1427020007);
            FlashBetContent$lambda$14 = FlashBetContentKt.FlashBetContent$lambda$14(this.$statsState$delegate);
            FlashBetContent$lambda$16 = FlashBetContentKt.FlashBetContent$lambda$16(this.$isStatsRefreshing$delegate);
            composer.startReplaceGroup(5004770);
            boolean changedInstance2 = composer.changedInstance(this.$controller);
            final FlashBetController flashBetController2 = this.$controller;
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetContent$8$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$6$lambda$5;
                        invoke$lambda$6$lambda$5 = FlashBetContentKt$FlashBetContent$8$2.invoke$lambda$6$lambda$5(FlashBetController.this);
                        return invoke$lambda$6$lambda$5;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            Function0 function03 = (Function0) rememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean changed2 = composer.changed(this.$playClick) | composer.changed(this.$onStatsItemClick);
            final Function0<Unit> function04 = this.$playClick;
            final Function1<String, Unit> function1 = this.$onStatsItemClick;
            Object rememberedValue4 = composer.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetContent$8$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$8$lambda$7;
                        invoke$lambda$8$lambda$7 = FlashBetContentKt$FlashBetContent$8$2.invoke$lambda$8$lambda$7(Function0.this, function1, (String) obj);
                        return invoke$lambda$8$lambda$7;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceGroup();
            FlashBetContentKt.FlashBetStatsListContent(FlashBetContent$lambda$14, FlashBetContent$lambda$16, function03, (Function1) rememberedValue4, composer, 0, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1287562421);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
