package org.betup.ui.dialogs;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.bus.BettingSheetStateMessage;
import org.betup.bus.NavigateMessage;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.dialogs.ShopDialogFragment;
import org.betup.ui.dialogs.compose.NotEnoughBetcoinsVideoOfferScreenKt;
import org.greenrobot.eventbus.EventBus;

/* compiled from: NotEnoughBetcoinsVideoOfferDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NotEnoughBetcoinsVideoOfferDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ NotEnoughBetcoinsVideoOfferDialogFragment this$0;

    NotEnoughBetcoinsVideoOfferDialogFragment$onCreateView$1$1(NotEnoughBetcoinsVideoOfferDialogFragment notEnoughBetcoinsVideoOfferDialogFragment) {
        this.this$0 = notEnoughBetcoinsVideoOfferDialogFragment;
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
            ComposerKt.traceEventStart(1213466877, i, -1, "org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialogFragment.onCreateView.<anonymous>.<anonymous> (NotEnoughBetcoinsVideoOfferDialogFragment.kt:77)");
        }
        mutableStateFlow = this.this$0._amount;
        State collectAsState = SnapshotStateKt.collectAsState(mutableStateFlow, null, composer, 0, 1);
        mutableStateFlow2 = this.this$0._isVideoAvailable;
        State collectAsState2 = SnapshotStateKt.collectAsState(mutableStateFlow2, null, composer, 0, 1);
        mutableStateFlow3 = this.this$0._oneClickQuickBetStake;
        State collectAsState3 = SnapshotStateKt.collectAsState(mutableStateFlow3, null, composer, 0, 1);
        long invoke$lambda$0 = invoke$lambda$0(collectAsState);
        long invoke$lambda$2 = invoke$lambda$2(collectAsState3);
        boolean invoke$lambda$1 = invoke$lambda$1(collectAsState2);
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final NotEnoughBetcoinsVideoOfferDialogFragment notEnoughBetcoinsVideoOfferDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = NotEnoughBetcoinsVideoOfferDialogFragment$onCreateView$1$1.invoke$lambda$4$lambda$3(NotEnoughBetcoinsVideoOfferDialogFragment.this);
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final NotEnoughBetcoinsVideoOfferDialogFragment notEnoughBetcoinsVideoOfferDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = NotEnoughBetcoinsVideoOfferDialogFragment$onCreateView$1$1.invoke$lambda$7$lambda$6(NotEnoughBetcoinsVideoOfferDialogFragment.this);
                    return invoke$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final NotEnoughBetcoinsVideoOfferDialogFragment notEnoughBetcoinsVideoOfferDialogFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$9$lambda$8;
                    invoke$lambda$9$lambda$8 = NotEnoughBetcoinsVideoOfferDialogFragment$onCreateView$1$1.invoke$lambda$9$lambda$8(NotEnoughBetcoinsVideoOfferDialogFragment.this);
                    return invoke$lambda$9$lambda$8;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        NotEnoughBetcoinsVideoOfferScreenKt.NotEnoughBetcoinsVideoOfferScreen(invoke$lambda$0, invoke$lambda$2, invoke$lambda$1, function0, function02, (Function0) rememberedValue3, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(NotEnoughBetcoinsVideoOfferDialogFragment notEnoughBetcoinsVideoOfferDialogFragment) {
        PromoService.PromoPlacement promoPlacement;
        VideoRewardService videoRewardService = notEnoughBetcoinsVideoOfferDialogFragment.getVideoRewardService();
        promoPlacement = notEnoughBetcoinsVideoOfferDialogFragment.placement;
        videoRewardService.redeemReward(promoPlacement, null, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(NotEnoughBetcoinsVideoOfferDialogFragment notEnoughBetcoinsVideoOfferDialogFragment) {
        notEnoughBetcoinsVideoOfferDialogFragment.navigatingToShop = true;
        EventBus.getDefault().post(new BettingSheetStateMessage(BettingSheetStateMessage.State.HIDE));
        notEnoughBetcoinsVideoOfferDialogFragment.dismiss();
        Bundle bundle = new Bundle();
        bundle.putSerializable("tab", ShopDialogFragment.Tab.PACKS);
        bundle.putBoolean("restore_betting_sheet", true);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.SHOP, bundle));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(NotEnoughBetcoinsVideoOfferDialogFragment notEnoughBetcoinsVideoOfferDialogFragment) {
        notEnoughBetcoinsVideoOfferDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    private static final long invoke$lambda$0(State<Long> state) {
        return state.getValue().longValue();
    }

    private static final boolean invoke$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final long invoke$lambda$2(State<Long> state) {
        return state.getValue().longValue();
    }
}
