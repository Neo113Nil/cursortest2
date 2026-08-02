package org.betup.ui.fragment.matches.details;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.bus.TourActionMessage;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.betup.ui.MainActivity;
import org.betup.ui.tour.compose.TourBetSelectionDialogFragment;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourStep;
import org.greenrobot.eventbus.EventBus;

/* compiled from: MatchDetailsFragmentK.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.MatchDetailsFragmentK$onCreateView$1$1$3$1", f = "MatchDetailsFragmentK.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchDetailsFragmentK$onCreateView$1$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TourStep $currentStep;
    final /* synthetic */ boolean $isBetSectionReady;
    final /* synthetic */ boolean $isTourActive;
    int label;
    final /* synthetic */ MatchDetailsFragmentK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchDetailsFragmentK$onCreateView$1$1$3$1(boolean z, TourStep tourStep, boolean z2, MatchDetailsFragmentK matchDetailsFragmentK, Continuation<? super MatchDetailsFragmentK$onCreateView$1$1$3$1> continuation) {
        super(2, continuation);
        this.$isTourActive = z;
        this.$currentStep = tourStep;
        this.$isBetSectionReady = z2;
        this.this$0 = matchDetailsFragmentK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchDetailsFragmentK$onCreateView$1$1$3$1(this.$isTourActive, this.$currentStep, this.$isBetSectionReady, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchDetailsFragmentK$onCreateView$1$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isTourActive && this.$currentStep == TourStep.SELECT_BET && this.$isBetSectionReady) {
            Fragment findFragmentByTag = this.this$0.getChildFragmentManager().findFragmentByTag("tour_bet_selection_dialog");
            if ((findFragmentByTag instanceof TourBetSelectionDialogFragment ? (TourBetSelectionDialogFragment) findFragmentByTag : null) == null) {
                Log.d("TourFlow", "MatchDetailsFragmentK - Showing TourBetSelectionDialog");
                TourBetSelectionDialogFragment newInstance = TourBetSelectionDialogFragment.INSTANCE.newInstance();
                final MatchDetailsFragmentK matchDetailsFragmentK = this.this$0;
                Function2<? super Long, ? super Integer, Unit> function2 = new Function2() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsFragmentK$onCreateView$1$1$3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit invokeSuspend$lambda$2;
                        invokeSuspend$lambda$2 = MatchDetailsFragmentK$onCreateView$1$1$3$1.invokeSuspend$lambda$2(MatchDetailsFragmentK.this, ((Long) obj2).longValue(), ((Integer) obj3).intValue());
                        return invokeSuspend$lambda$2;
                    }
                };
                final MatchDetailsFragmentK matchDetailsFragmentK2 = this.this$0;
                newInstance.setCallbacks(function2, new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsFragmentK$onCreateView$1$1$3$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invokeSuspend$lambda$3;
                        invokeSuspend$lambda$3 = MatchDetailsFragmentK$onCreateView$1$1$3$1.invokeSuspend$lambda$3(MatchDetailsFragmentK.this);
                        return invokeSuspend$lambda$3;
                    }
                });
                if (!this.this$0.getChildFragmentManager().isStateSaved()) {
                    newInstance.show(this.this$0.getChildFragmentManager(), "tour_bet_selection_dialog");
                }
            }
        } else {
            Fragment findFragmentByTag2 = this.this$0.getChildFragmentManager().findFragmentByTag("tour_bet_selection_dialog");
            TourBetSelectionDialogFragment tourBetSelectionDialogFragment = findFragmentByTag2 instanceof TourBetSelectionDialogFragment ? (TourBetSelectionDialogFragment) findFragmentByTag2 : null;
            if (tourBetSelectionDialogFragment != null) {
                Log.d("TourFlow", "MatchDetailsFragmentK - Dismissing TourBetSelectionDialog");
                tourBetSelectionDialogFragment.dismissAllowingStateLoss();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(MatchDetailsFragmentK matchDetailsFragmentK, long j, int i) {
        Object obj;
        List<MatchVarietyBetOptionModel> bets;
        matchDetailsFragmentK.getController().onBetClick(j, i);
        FragmentActivity activity = matchDetailsFragmentK.getActivity();
        MatchVarietyBetOptionModel matchVarietyBetOptionModel = null;
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        TourComposeHelper tourComposeHelper = mainActivity != null ? mainActivity.tourComposeHelper : null;
        if (tourComposeHelper != null && tourComposeHelper.isTourActive()) {
            Iterator<T> it = matchDetailsFragmentK.getController().getBetGroups().getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((MatchVarietyGroupBetsModel) obj).getGroup().getId() == j) {
                    break;
                }
            }
            MatchVarietyGroupBetsModel matchVarietyGroupBetsModel = (MatchVarietyGroupBetsModel) obj;
            if (matchVarietyGroupBetsModel != null && (bets = matchVarietyGroupBetsModel.getBets()) != null) {
                matchVarietyBetOptionModel = (MatchVarietyBetOptionModel) CollectionsKt.getOrNull(bets, i);
            }
            if (matchVarietyBetOptionModel != null) {
                long grabbedBetId = matchVarietyBetOptionModel.getGrabbedBetId();
                EventBus.getDefault().post(new TourActionMessage(TourActionMessage.Action.BET_SELECTED, Long.valueOf(grabbedBetId)));
                Log.d("TourFlow", "MatchDetailsFragmentK - Posted TourActionMessage(BET_SELECTED) for bet ID: " + grabbedBetId);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(MatchDetailsFragmentK matchDetailsFragmentK) {
        TourComposeHelper tourComposeHelper;
        FragmentActivity activity = matchDetailsFragmentK.getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        if (mainActivity != null && (tourComposeHelper = mainActivity.tourComposeHelper) != null) {
            tourComposeHelper.skipTour();
        }
        return Unit.INSTANCE;
    }
}
