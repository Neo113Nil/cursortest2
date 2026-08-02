package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.ui.dialogs.compose.RewardedVideoOfferScreenKt;

/* compiled from: RewardedVideoOfferDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RewardedVideoOfferDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ RewardedVideoOfferDialogFragment this$0;

    RewardedVideoOfferDialogFragment$onCreateView$1$1(RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment) {
        this.this$0 = rewardedVideoOfferDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        boolean z;
        boolean changedInstance;
        Object rememberedValue;
        boolean changedInstance2;
        Object rememberedValue2;
        boolean z2;
        boolean z3;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1805214855, i, -1, "org.betup.ui.dialogs.RewardedVideoOfferDialogFragment.onCreateView.<anonymous>.<anonymous> (RewardedVideoOfferDialogFragment.kt:101)");
        }
        mutableStateFlow = this.this$0._prizeAmount;
        State collectAsState = SnapshotStateKt.collectAsState(mutableStateFlow, null, composer, 0, 1);
        mutableStateFlow2 = this.this$0._backendAvailable;
        State collectAsState2 = SnapshotStateKt.collectAsState(mutableStateFlow2, null, composer, 0, 1);
        mutableStateFlow3 = this.this$0._adReady;
        State collectAsState3 = SnapshotStateKt.collectAsState(mutableStateFlow3, null, composer, 0, 1);
        long invoke$lambda$0 = invoke$lambda$0(collectAsState);
        if (invoke$lambda$1(collectAsState2) && invoke$lambda$2(collectAsState3)) {
            z2 = this.this$0.redeemInFlight;
            if (!z2) {
                z3 = this.this$0.rewardCompleted;
                if (!z3) {
                    z = true;
                    composer.startReplaceGroup(5004770);
                    changedInstance = composer.changedInstance(this.this$0);
                    final RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment = this.this$0;
                    rememberedValue = composer.rememberedValue();
                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.RewardedVideoOfferDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$4$lambda$3;
                                invoke$lambda$4$lambda$3 = RewardedVideoOfferDialogFragment$onCreateView$1$1.invoke$lambda$4$lambda$3(RewardedVideoOfferDialogFragment.this);
                                return invoke$lambda$4$lambda$3;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    changedInstance2 = composer.changedInstance(this.this$0);
                    final RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment2 = this.this$0;
                    rememberedValue2 = composer.rememberedValue();
                    if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.RewardedVideoOfferDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$6$lambda$5;
                                invoke$lambda$6$lambda$5 = RewardedVideoOfferDialogFragment$onCreateView$1$1.invoke$lambda$6$lambda$5(RewardedVideoOfferDialogFragment.this);
                                return invoke$lambda$6$lambda$5;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceGroup();
                    RewardedVideoOfferScreenKt.RewardedVideoOfferScreen(invoke$lambda$0, z, function0, (Function0) rememberedValue2, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
            }
        }
        z = false;
        composer.startReplaceGroup(5004770);
        changedInstance = composer.changedInstance(this.this$0);
        final RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment3 = this.this$0;
        rememberedValue = composer.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.RewardedVideoOfferDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$4$lambda$3;
                invoke$lambda$4$lambda$3 = RewardedVideoOfferDialogFragment$onCreateView$1$1.invoke$lambda$4$lambda$3(RewardedVideoOfferDialogFragment.this);
                return invoke$lambda$4$lambda$3;
            }
        };
        composer.updateRememberedValue(rememberedValue);
        Function0 function02 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance2 = composer.changedInstance(this.this$0);
        final RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment22 = this.this$0;
        rememberedValue2 = composer.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.RewardedVideoOfferDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$6$lambda$5;
                invoke$lambda$6$lambda$5 = RewardedVideoOfferDialogFragment$onCreateView$1$1.invoke$lambda$6$lambda$5(RewardedVideoOfferDialogFragment.this);
                return invoke$lambda$6$lambda$5;
            }
        };
        composer.updateRememberedValue(rememberedValue2);
        composer.endReplaceGroup();
        RewardedVideoOfferScreenKt.RewardedVideoOfferScreen(invoke$lambda$0, z, function02, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment) {
        rewardedVideoOfferDialogFragment.onWatchClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment) {
        rewardedVideoOfferDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    private static final long invoke$lambda$0(State<Long> state) {
        return state.getValue().longValue();
    }

    private static final boolean invoke$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
