package org.betup.ui.fragment.dailybonus;

import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.dailybonus.compose.DailyBonusDialogKt;
import org.betup.ui.fragment.dailybonus.model.DailyBonusData;
import org.betup.ui.fragment.dailybonus.model.DailyBonusDay;

/* compiled from: DailyBonusDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DailyBonusDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ DailyBonusDialogFragment this$0;

    DailyBonusDialogFragment$onCreateView$1$1(DailyBonusDialogFragment dailyBonusDialogFragment) {
        this.this$0 = dailyBonusDialogFragment;
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
            ComposerKt.traceEventStart(486532896, i, -1, "org.betup.ui.fragment.dailybonus.DailyBonusDialogFragment.onCreateView.<anonymous>.<anonymous> (DailyBonusDialogFragment.kt:82)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getController().getData(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getController().isLoading(), null, composer, 0, 1);
        final DailyBonusData invoke$lambda$0 = invoke$lambda$0(collectAsState);
        if (invoke$lambda$0 != null) {
            final DailyBonusDialogFragment dailyBonusDialogFragment = this.this$0;
            boolean invoke$lambda$1 = invoke$lambda$1(collectAsState2);
            composer.startReplaceGroup(5004770);
            boolean changedInstance = composer.changedInstance(dailyBonusDialogFragment);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.dailybonus.DailyBonusDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$8$lambda$3$lambda$2;
                        invoke$lambda$8$lambda$3$lambda$2 = DailyBonusDialogFragment$onCreateView$1$1.invoke$lambda$8$lambda$3$lambda$2(DailyBonusDialogFragment.this);
                        return invoke$lambda$8$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changedInstance2 = composer.changedInstance(dailyBonusDialogFragment);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.dailybonus.DailyBonusDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$8$lambda$5$lambda$4;
                        invoke$lambda$8$lambda$5$lambda$4 = DailyBonusDialogFragment$onCreateView$1$1.invoke$lambda$8$lambda$5$lambda$4(DailyBonusDialogFragment.this);
                        return invoke$lambda$8$lambda$5$lambda$4;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Function0 function02 = (Function0) rememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean changedInstance3 = composer.changedInstance(dailyBonusDialogFragment) | composer.changedInstance(invoke$lambda$0);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.dailybonus.DailyBonusDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$8$lambda$7$lambda$6;
                        invoke$lambda$8$lambda$7$lambda$6 = DailyBonusDialogFragment$onCreateView$1$1.invoke$lambda$8$lambda$7$lambda$6(DailyBonusDialogFragment.this, invoke$lambda$0, (DailyBonusDay) obj);
                        return invoke$lambda$8$lambda$7$lambda$6;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceGroup();
            DailyBonusDialogKt.DailyBonusDialog(invoke$lambda$0, invoke$lambda$1, function0, function02, (Function1) rememberedValue3, composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$3$lambda$2(DailyBonusDialogFragment dailyBonusDialogFragment) {
        dailyBonusDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$5$lambda$4(DailyBonusDialogFragment dailyBonusDialogFragment) {
        Log.d("DailyBonusDialog", "onRefresh - Invalidating and reloading data");
        dailyBonusDialogFragment.getController().invalidate();
        dailyBonusDialogFragment.getController().load();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$6(DailyBonusDialogFragment dailyBonusDialogFragment, DailyBonusData dailyBonusData, DailyBonusDay bonus) {
        Intrinsics.checkNotNullParameter(bonus, "bonus");
        dailyBonusDialogFragment.openWheelOfFortune(bonus.getId(), Integer.valueOf(bonus.getBetcoinBonus()), dailyBonusData.getMultiplier());
        return Unit.INSTANCE;
    }

    private static final DailyBonusData invoke$lambda$0(State<DailyBonusData> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
