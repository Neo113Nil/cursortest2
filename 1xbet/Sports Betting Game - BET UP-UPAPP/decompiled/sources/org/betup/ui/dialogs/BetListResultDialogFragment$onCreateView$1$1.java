package org.betup.ui.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.bus.NavigateMessage;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractorExtKt;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.services.offer.PromoService;
import org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt;
import org.greenrobot.eventbus.EventBus;

/* compiled from: BetListResultDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BetListResultDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BetListResultDialogFragment this$0;

    BetListResultDialogFragment$onCreateView$1$1(BetListResultDialogFragment betListResultDialogFragment) {
        this.this$0 = betListResultDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BetState betState;
        int i2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1113929969, i, -1, "org.betup.ui.dialogs.BetListResultDialogFragment.onCreateView.<anonymous>.<anonymous> (BetListResultDialogFragment.kt:208)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getBet(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.isLoading(), null, composer, 0, 1);
        betState = this.this$0.state;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        BetListResultDialogFragment betListResultDialogFragment = this.this$0;
        BetListResultDialogFragment$onCreateView$1$1$1$1 rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new BetListResultDialogFragment$onCreateView$1$1$1$1(betListResultDialogFragment, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(betState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, composer, 0);
        if (!invoke$lambda$1(collectAsState2) && !invoke$lambda$0(collectAsState).isEmpty()) {
            BetsListModel betsListModel = (BetsListModel) CollectionsKt.first((List) invoke$lambda$0(collectAsState));
            Integer id = betsListModel.getId();
            i2 = this.this$0.betlistId;
            if (id != null && id.intValue() == i2) {
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                MutableStateFlow<List<BetsListModel>> bet = this.this$0.getBet();
                Integer id2 = betsListModel.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                int intValue = id2.intValue();
                MutableStateFlow<OddType> oddType = this.this$0.getOddType();
                StateFlow<Boolean> isVideoRewardAvailable = this.this$0.isVideoRewardAvailable();
                StateFlow<Long> videoRewardAmount = this.this$0.getVideoRewardAmount();
                MutableStateFlow<List<BetsListModel>> mutableStateFlow = bet;
                composer.startReplaceGroup(5004770);
                boolean changedInstance2 = composer.changedInstance(this.this$0);
                final BetListResultDialogFragment betListResultDialogFragment2 = this.this$0;
                Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.BetListResultDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$4$lambda$3;
                            invoke$lambda$4$lambda$3 = BetListResultDialogFragment$onCreateView$1$1.invoke$lambda$4$lambda$3(BetListResultDialogFragment.this);
                            return invoke$lambda$4$lambda$3;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                Function0 function0 = (Function0) rememberedValue2;
                composer.endReplaceGroup();
                MutableStateFlow<OddType> mutableStateFlow2 = oddType;
                composer.startReplaceGroup(5004770);
                boolean changedInstance3 = composer.changedInstance(this.this$0);
                final BetListResultDialogFragment betListResultDialogFragment3 = this.this$0;
                Object rememberedValue3 = composer.rememberedValue();
                if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: org.betup.ui.dialogs.BetListResultDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$7$lambda$6;
                            invoke$lambda$7$lambda$6 = BetListResultDialogFragment$onCreateView$1$1.invoke$lambda$7$lambda$6(BetListResultDialogFragment.this, ((Integer) obj).intValue());
                            return invoke$lambda$7$lambda$6;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                Function1 function1 = (Function1) rememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean changedInstance4 = composer.changedInstance(this.this$0);
                final BetListResultDialogFragment betListResultDialogFragment4 = this.this$0;
                Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function2() { // from class: org.betup.ui.dialogs.BetListResultDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit invoke$lambda$10$lambda$9;
                            invoke$lambda$10$lambda$9 = BetListResultDialogFragment$onCreateView$1$1.invoke$lambda$10$lambda$9(BetListResultDialogFragment.this, ((Integer) obj).intValue(), (MatchState) obj2);
                            return invoke$lambda$10$lambda$9;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                Function2 function2 = (Function2) rememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                Object rememberedValue5 = composer.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: org.betup.ui.dialogs.BetListResultDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$12$lambda$11;
                            invoke$lambda$12$lambda$11 = BetListResultDialogFragment$onCreateView$1$1.invoke$lambda$12$lambda$11(((Integer) obj).intValue());
                            return invoke$lambda$12$lambda$11;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue5);
                }
                Function1 function12 = (Function1) rememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean changedInstance5 = composer.changedInstance(this.this$0);
                final BetListResultDialogFragment betListResultDialogFragment5 = this.this$0;
                Object rememberedValue6 = composer.rememberedValue();
                if (changedInstance5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function0() { // from class: org.betup.ui.dialogs.BetListResultDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Window invoke$lambda$14$lambda$13;
                            invoke$lambda$14$lambda$13 = BetListResultDialogFragment$onCreateView$1$1.invoke$lambda$14$lambda$13(BetListResultDialogFragment.this);
                            return invoke$lambda$14$lambda$13;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue6);
                }
                Function0 function02 = (Function0) rememberedValue6;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean changedInstance6 = composer.changedInstance(this.this$0);
                final BetListResultDialogFragment betListResultDialogFragment6 = this.this$0;
                Object rememberedValue7 = composer.rememberedValue();
                if (changedInstance6 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function2() { // from class: org.betup.ui.dialogs.BetListResultDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit invoke$lambda$17$lambda$16;
                            invoke$lambda$17$lambda$16 = BetListResultDialogFragment$onCreateView$1$1.invoke$lambda$17$lambda$16(BetListResultDialogFragment.this, ((Long) obj).longValue(), (Function1) obj2);
                            return invoke$lambda$17$lambda$16;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue7);
                }
                composer.endReplaceGroup();
                BetListDetailsScreenKt.BetListDetailsScreen(fillMaxSize$default, mutableStateFlow, function0, intValue, mutableStateFlow2, function1, isVideoRewardAvailable, videoRewardAmount, false, function2, function12, null, null, null, null, null, function02, (Function2) rememberedValue7, composer, 6, 6, 63744);
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Window invoke$lambda$14$lambda$13(BetListResultDialogFragment betListResultDialogFragment) {
        Dialog dialog = betListResultDialogFragment.getDialog();
        if (dialog != null) {
            return dialog.getWindow();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16(final BetListResultDialogFragment betListResultDialogFragment, long j, Function1 cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        GetBetShareInstallLinkInteractorExtKt.fetchBetInstallUrl(betListResultDialogFragment.getGetBetShareInstallLinkInteractor(), j, new Function1() { // from class: org.betup.ui.dialogs.BetListResultDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$17$lambda$16$lambda$15;
                invoke$lambda$17$lambda$16$lambda$15 = BetListResultDialogFragment$onCreateView$1$1.invoke$lambda$17$lambda$16$lambda$15(BetListResultDialogFragment.this, (Runnable) obj);
                return invoke$lambda$17$lambda$16$lambda$15;
            }
        }, cb);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16$lambda$15(BetListResultDialogFragment betListResultDialogFragment, Runnable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        betListResultDialogFragment.requireActivity().runOnUiThread(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(BetListResultDialogFragment betListResultDialogFragment) {
        betListResultDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(BetListResultDialogFragment betListResultDialogFragment, int i) {
        PromoService.PromoPlacement promoPlacement;
        Long l;
        long j;
        promoPlacement = betListResultDialogFragment.currentPlacement;
        if (promoPlacement != null) {
            if (promoPlacement == PromoService.PromoPlacement.BET_WON) {
                j = betListResultDialogFragment.currentReferencedValue;
                l = Long.valueOf(j);
            } else {
                l = null;
            }
            betListResultDialogFragment.getVideoRewardService().redeemReward(promoPlacement, l, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9(BetListResultDialogFragment betListResultDialogFragment, int i, MatchState matchState) {
        Intrinsics.checkNotNullParameter(matchState, "matchState");
        Bundle bundle = new Bundle();
        bundle.putInt("matchId", i);
        bundle.putBoolean("isLive", matchState == MatchState.LIVE);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
        betListResultDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(int i) {
        return Unit.INSTANCE;
    }

    private static final List<BetsListModel> invoke$lambda$0(State<? extends List<? extends BetsListModel>> state) {
        return (List) state.getValue();
    }

    private static final boolean invoke$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
