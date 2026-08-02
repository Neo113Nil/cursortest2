package org.betup.ui.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.bus.NavigateMessage;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractorExtKt;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt;
import org.greenrobot.eventbus.EventBus;

/* compiled from: BetPlacedDialog.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BetPlacedDialog$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BetPlacedDialog this$0;

    BetPlacedDialog$onCreateView$1$1(BetPlacedDialog betPlacedDialog) {
        this.this$0 = betPlacedDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final void invoke(Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1015172437, i, -1, "org.betup.ui.dialogs.BetPlacedDialog.onCreateView.<anonymous>.<anonymous> (BetPlacedDialog.kt:138)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getBetsPlacedController().getBet(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getBetsPlacedController().isLoading(), null, composer, 0, 1);
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composer);
        View view = (View) consume;
        i2 = this.this$0.betId;
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(i2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceGroup();
        List<BetsListModel> invoke$lambda$0 = invoke$lambda$0(collectAsState);
        Boolean valueOf = Boolean.valueOf(invoke$lambda$1(collectAsState2));
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance = composer.changedInstance(this.this$0) | composer.changed(collectAsState2);
        BetPlacedDialog betPlacedDialog = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function2) new BetPlacedDialog$onCreateView$1$1$1$1(betPlacedDialog, collectAsState2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(invoke$lambda$0, valueOf, (Function2) rememberedValue2, composer, 0);
        Boolean valueOf2 = Boolean.valueOf(invoke$lambda$1(collectAsState2));
        List<BetsListModel> invoke$lambda$02 = invoke$lambda$0(collectAsState);
        i3 = this.this$0.betId;
        Integer valueOf3 = Integer.valueOf(i3);
        composer.startReplaceGroup(-1224400529);
        boolean changed2 = composer.changed(mutableState) | composer.changed(collectAsState2) | composer.changed(collectAsState) | composer.changedInstance(this.this$0) | composer.changedInstance(view);
        BetPlacedDialog betPlacedDialog2 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (Function2) new BetPlacedDialog$onCreateView$1$1$2$1(betPlacedDialog2, view, mutableState, collectAsState2, collectAsState, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf2, invoke$lambda$02, valueOf3, (Function2) rememberedValue3, composer, 0);
        if (!invoke$lambda$1(collectAsState2) && !invoke$lambda$0(collectAsState).isEmpty()) {
            BetsListModel betsListModel = (BetsListModel) CollectionsKt.first((List) invoke$lambda$0(collectAsState));
            Integer id = betsListModel.getId();
            i4 = this.this$0.betId;
            if (id != null && id.intValue() == i4) {
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                StateFlow<List<BetsListModel>> bet = this.this$0.getBetsPlacedController().getBet();
                Integer id2 = betsListModel.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                int intValue = id2.intValue();
                StateFlow<OddType> oddType = this.this$0.getBetsPlacedController().getOddType();
                MutableStateFlow<Boolean> isVideoRewardAvailable = this.this$0.isVideoRewardAvailable();
                MutableStateFlow<Long> videoRewardAmount = this.this$0.getVideoRewardAmount();
                composer.startReplaceGroup(5004770);
                boolean changedInstance2 = composer.changedInstance(this.this$0);
                final BetPlacedDialog betPlacedDialog3 = this.this$0;
                Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.BetPlacedDialog$onCreateView$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$8$lambda$7;
                            invoke$lambda$8$lambda$7 = BetPlacedDialog$onCreateView$1$1.invoke$lambda$8$lambda$7(BetPlacedDialog.this);
                            return invoke$lambda$8$lambda$7;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                Function0 function0 = (Function0) rememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean changedInstance3 = composer.changedInstance(this.this$0);
                final BetPlacedDialog betPlacedDialog4 = this.this$0;
                Object rememberedValue5 = composer.rememberedValue();
                if (changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: org.betup.ui.dialogs.BetPlacedDialog$onCreateView$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$10$lambda$9;
                            invoke$lambda$10$lambda$9 = BetPlacedDialog$onCreateView$1$1.invoke$lambda$10$lambda$9(BetPlacedDialog.this, ((Integer) obj).intValue());
                            return invoke$lambda$10$lambda$9;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue5);
                }
                Function1 function1 = (Function1) rememberedValue5;
                composer.endReplaceGroup();
                MutableStateFlow<Boolean> mutableStateFlow = isVideoRewardAvailable;
                MutableStateFlow<Long> mutableStateFlow2 = videoRewardAmount;
                composer.startReplaceGroup(5004770);
                boolean changedInstance4 = composer.changedInstance(this.this$0);
                final BetPlacedDialog betPlacedDialog5 = this.this$0;
                Object rememberedValue6 = composer.rememberedValue();
                if (changedInstance4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function2() { // from class: org.betup.ui.dialogs.BetPlacedDialog$onCreateView$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit invoke$lambda$13$lambda$12;
                            invoke$lambda$13$lambda$12 = BetPlacedDialog$onCreateView$1$1.invoke$lambda$13$lambda$12(BetPlacedDialog.this, ((Integer) obj).intValue(), (MatchState) obj2);
                            return invoke$lambda$13$lambda$12;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue6);
                }
                Function2 function2 = (Function2) rememberedValue6;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean changedInstance5 = composer.changedInstance(this.this$0);
                final BetPlacedDialog betPlacedDialog6 = this.this$0;
                Object rememberedValue7 = composer.rememberedValue();
                if (changedInstance5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.BetPlacedDialog$onCreateView$1$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Window invoke$lambda$15$lambda$14;
                            invoke$lambda$15$lambda$14 = BetPlacedDialog$onCreateView$1$1.invoke$lambda$15$lambda$14(BetPlacedDialog.this);
                            return invoke$lambda$15$lambda$14;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue7);
                }
                Function0 function02 = (Function0) rememberedValue7;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean changedInstance6 = composer.changedInstance(this.this$0);
                final BetPlacedDialog betPlacedDialog7 = this.this$0;
                Object rememberedValue8 = composer.rememberedValue();
                if (changedInstance6 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new Function2() { // from class: org.betup.ui.dialogs.BetPlacedDialog$onCreateView$1$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit invoke$lambda$18$lambda$17;
                            invoke$lambda$18$lambda$17 = BetPlacedDialog$onCreateView$1$1.invoke$lambda$18$lambda$17(BetPlacedDialog.this, ((Long) obj).longValue(), (Function1) obj2);
                            return invoke$lambda$18$lambda$17;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue8);
                }
                composer.endReplaceGroup();
                BetListDetailsScreenKt.BetListDetailsScreen(fillMaxSize$default, bet, function0, intValue, oddType, function1, mutableStateFlow, mutableStateFlow2, false, function2, null, null, null, null, null, null, function02, (Function2) rememberedValue8, composer, 6, 0, 64768);
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Window invoke$lambda$15$lambda$14(BetPlacedDialog betPlacedDialog) {
        Dialog dialog = betPlacedDialog.getDialog();
        if (dialog != null) {
            return dialog.getWindow();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17(final BetPlacedDialog betPlacedDialog, long j, Function1 cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        GetBetShareInstallLinkInteractorExtKt.fetchBetInstallUrl(betPlacedDialog.getGetBetShareInstallLinkInteractor(), j, new Function1() { // from class: org.betup.ui.dialogs.BetPlacedDialog$onCreateView$1$1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$18$lambda$17$lambda$16;
                invoke$lambda$18$lambda$17$lambda$16 = BetPlacedDialog$onCreateView$1$1.invoke$lambda$18$lambda$17$lambda$16(BetPlacedDialog.this, (Runnable) obj);
                return invoke$lambda$18$lambda$17$lambda$16;
            }
        }, cb);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17$lambda$16(BetPlacedDialog betPlacedDialog, Runnable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        betPlacedDialog.requireActivity().runOnUiThread(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(BetPlacedDialog betPlacedDialog) {
        betPlacedDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9(BetPlacedDialog betPlacedDialog, int i) {
        PromoService.PromoPlacement promoPlacement;
        VideoRewardService videoRewardService = betPlacedDialog.getVideoRewardService();
        promoPlacement = betPlacedDialog.placement;
        videoRewardService.redeemReward(promoPlacement, null, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12(BetPlacedDialog betPlacedDialog, int i, MatchState matchState) {
        Intrinsics.checkNotNullParameter(matchState, "matchState");
        Bundle bundle = new Bundle();
        bundle.putInt("matchId", i);
        bundle.putBoolean("isLive", matchState == MatchState.LIVE);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
        betPlacedDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<BetsListModel> invoke$lambda$0(State<? extends List<? extends BetsListModel>> state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
