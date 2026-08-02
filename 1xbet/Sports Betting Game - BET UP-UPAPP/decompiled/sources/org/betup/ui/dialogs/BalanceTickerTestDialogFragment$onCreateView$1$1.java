package org.betup.ui.dialogs;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.betup.ui.dialogs.compose.BalanceTickerTestScreenKt;
import org.betup.utils.SharedPrefs;

/* compiled from: BalanceTickerTestDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BalanceTickerTestDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BalanceTickerTestDialogFragment this$0;

    BalanceTickerTestDialogFragment$onCreateView$1$1(BalanceTickerTestDialogFragment balanceTickerTestDialogFragment) {
        this.this$0 = balanceTickerTestDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final int invoke$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(514266807, i, -1, "org.betup.ui.dialogs.BalanceTickerTestDialogFragment.onCreateView.<anonymous>.<anonymous> (BalanceTickerTestDialogFragment.kt:24)");
        }
        final Context applicationContext = this.this$0.requireContext().getApplicationContext();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotIntStateKt.mutableIntStateOf(SharedPrefs.getBalanceAnimationMode(applicationContext));
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableIntState mutableIntState = (MutableIntState) rememberedValue;
        composer.endReplaceGroup();
        int invoke$lambda$1 = invoke$lambda$1(mutableIntState);
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance = composer.changedInstance(applicationContext);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.dialogs.BalanceTickerTestDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = BalanceTickerTestDialogFragment$onCreateView$1$1.invoke$lambda$4$lambda$3(applicationContext, mutableIntState, ((Integer) obj).intValue());
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function1 function1 = (Function1) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final BalanceTickerTestDialogFragment balanceTickerTestDialogFragment = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.BalanceTickerTestDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$6$lambda$5;
                    invoke$lambda$6$lambda$5 = BalanceTickerTestDialogFragment$onCreateView$1$1.invoke$lambda$6$lambda$5(BalanceTickerTestDialogFragment.this);
                    return invoke$lambda$6$lambda$5;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        BalanceTickerTestScreenKt.BalanceTickerTestScreen(invoke$lambda$1, function1, (Function0) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(Context context, MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        SharedPrefs.setBalanceAnimationMode(context, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(BalanceTickerTestDialogFragment balanceTickerTestDialogFragment) {
        balanceTickerTestDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
