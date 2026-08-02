package org.betup.ui.dialogs.webgame;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.dialogs.webgame.compose.WebGameWinVideoOfferScreenKt;

/* compiled from: WebGameWinVideoOfferDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WebGameWinVideoOfferDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ WebGameWinVideoOfferDialogFragment this$0;

    WebGameWinVideoOfferDialogFragment$onCreateView$1$1(WebGameWinVideoOfferDialogFragment webGameWinVideoOfferDialogFragment) {
        this.this$0 = webGameWinVideoOfferDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(505433249, i, -1, "org.betup.ui.dialogs.webgame.WebGameWinVideoOfferDialogFragment.onCreateView.<anonymous>.<anonymous> (WebGameWinVideoOfferDialogFragment.kt:73)");
        }
        mutableStateFlow = this.this$0._isVideoAvailable;
        State collectAsState = SnapshotStateKt.collectAsState(mutableStateFlow, null, composer, 0, 1);
        mutableStateFlow2 = this.this$0._videoRewardAmount;
        State collectAsState2 = SnapshotStateKt.collectAsState(mutableStateFlow2, null, composer, 0, 1);
        mutableStateFlow3 = this.this$0._winAmount;
        long invoke$lambda$2 = invoke$lambda$2(SnapshotStateKt.collectAsState(mutableStateFlow3, null, composer, 0, 1));
        long invoke$lambda$1 = invoke$lambda$1(collectAsState2);
        boolean invoke$lambda$0 = invoke$lambda$0(collectAsState);
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final WebGameWinVideoOfferDialogFragment webGameWinVideoOfferDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.webgame.WebGameWinVideoOfferDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = WebGameWinVideoOfferDialogFragment$onCreateView$1$1.invoke$lambda$4$lambda$3(WebGameWinVideoOfferDialogFragment.this);
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final WebGameWinVideoOfferDialogFragment webGameWinVideoOfferDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.webgame.WebGameWinVideoOfferDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$6$lambda$5;
                    invoke$lambda$6$lambda$5 = WebGameWinVideoOfferDialogFragment$onCreateView$1$1.invoke$lambda$6$lambda$5(WebGameWinVideoOfferDialogFragment.this);
                    return invoke$lambda$6$lambda$5;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final WebGameWinVideoOfferDialogFragment webGameWinVideoOfferDialogFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.webgame.WebGameWinVideoOfferDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = WebGameWinVideoOfferDialogFragment$onCreateView$1$1.invoke$lambda$8$lambda$7(WebGameWinVideoOfferDialogFragment.this);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        WebGameWinVideoOfferScreenKt.WebGameWinVideoOfferScreen(invoke$lambda$2, invoke$lambda$1, invoke$lambda$0, function0, function02, (Function0) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(WebGameWinVideoOfferDialogFragment webGameWinVideoOfferDialogFragment) {
        webGameWinVideoOfferDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(WebGameWinVideoOfferDialogFragment webGameWinVideoOfferDialogFragment) {
        PromoService.PromoPlacement promoPlacement;
        long j;
        VideoRewardService videoRewardService = webGameWinVideoOfferDialogFragment.getVideoRewardService();
        promoPlacement = webGameWinVideoOfferDialogFragment.placement;
        j = webGameWinVideoOfferDialogFragment.referencedValue;
        videoRewardService.redeemReward(promoPlacement, Long.valueOf(j), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(WebGameWinVideoOfferDialogFragment webGameWinVideoOfferDialogFragment) {
        webGameWinVideoOfferDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    private static final boolean invoke$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final long invoke$lambda$1(State<Long> state) {
        return state.getValue().longValue();
    }

    private static final long invoke$lambda$2(State<Long> state) {
        return state.getValue().longValue();
    }
}
