package org.betup.ui.fragment.bets;

import android.util.Log;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.R;
import org.betup.bus.CoefficientUpdatedMessage;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.entity.betslip.GrabbedBetDataModel;
import org.betup.model.remote.entity.betslip.GrabbedBetModel;
import org.betup.model.remote.entity.betslip.V7GrabbedBetDto;
import org.betup.model.remote.entity.betslip.V7GrabbedBetsResponse;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.ui.MainActivity;
import org.greenrobot.eventbus.EventBus;

/* compiled from: BetsController.kt */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001J\"\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\bH\u0016¨\u0006\t"}, d2 = {"org/betup/ui/fragment/bets/BetsController$onGrabbetBetFetched$1", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/betslip/V7GrabbedBetsResponse;", "", "", "onFetched", "", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetsController$onGrabbetBetFetched$1 implements BaseCachedSharedInteractor.OnFetchedListener<V7GrabbedBetsResponse, List<? extends Long>> {
    final /* synthetic */ BetsController this$0;

    BetsController$onGrabbetBetFetched$1(BetsController betsController) {
        this.this$0 = betsController;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02fd  */
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onFetched(FetchedResponseMessage<V7GrabbedBetsResponse, List<? extends Long>> responseMessage) {
        MainActivity mainActivity;
        String str;
        MainActivity mainActivity2;
        MainActivity mainActivity3;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        GrabbedBetModel grabbedBetModel;
        MainActivity mainActivity4;
        List<V7GrabbedBetDto> grabbedBets;
        MutableStateFlow mutableStateFlow3;
        long j;
        MutableStateFlow mutableStateFlow4;
        UserProgressModel userProgressModel;
        MainActivity mainActivity5;
        MainActivity mainActivity6;
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        this.this$0.isRefreshingBetData = false;
        try {
            Log.d("BETSLIPTEST", "onGrabbetBetFetched called with stat: " + responseMessage.getStat());
        } catch (Exception e) {
            Log.e("BETSLIPTEST", "Critical error in onGrabbetBetFetched: " + e.getMessage(), e);
            mainActivity = this.this$0.activity;
            if (mainActivity != null) {
            }
            this.this$0.cancelPendingOneClickPlacement();
            this.this$0.hideProgress();
        }
        if (responseMessage.getStat() == FetchStat.SERVER_DOWN) {
            Log.e("BETSLIPTEST", "Server is down, showing toast");
            mainActivity6 = this.this$0.activity;
            if (mainActivity6 != null) {
                this.this$0.showMessage(R.string.works_in_progress);
            }
            this.this$0.cancelPendingOneClickPlacement();
            this.this$0.hideProgress();
            return;
        }
        if (responseMessage.getStat() == FetchStat.NO_CONNECTION) {
            Log.e("BETSLIPTEST", "No connection");
            mainActivity5 = this.this$0.activity;
            if (mainActivity5 != null) {
                this.this$0.showMessage(R.string.error);
            }
            this.this$0.cancelPendingOneClickPlacement();
            this.this$0.hideProgress();
            return;
        }
        if (responseMessage.getStat() != FetchStat.SUCCESS) {
            Log.d("BETSLIPTEST", "COEF RETURNED - not success, stat: " + responseMessage.getStat());
            if (responseMessage.getStat() != FetchStat.INVALID) {
                try {
                    mutableStateFlow3 = this.this$0.profileModel;
                    FullUserProfileModel fullUserProfileModel = (FullUserProfileModel) mutableStateFlow3.getValue();
                    long moneyBalance = (fullUserProfileModel == null || (userProgressModel = fullUserProfileModel.getUserProgressModel()) == null) ? 0L : userProgressModel.getMoneyBalance();
                    V7GrabbedBetsResponse model = responseMessage.getModel();
                    Long valueOf = model != null ? Long.valueOf(model.getMaxMoneyPlaced()) : null;
                    j = this.this$0.betLimit;
                    long coerceAtMost = RangesKt.coerceAtMost(Math.min(moneyBalance, j), valueOf != null ? valueOf.longValue() : 0L);
                    mutableStateFlow4 = this.this$0._userAmountFlow;
                    mutableStateFlow4.setValue(Long.valueOf(coerceAtMost));
                } catch (Exception e2) {
                    Log.e("BETSLIPTEST", "Error setting max amount: " + e2.getMessage(), e2);
                }
                this.this$0.cancelPendingOneClickPlacement();
                this.this$0.hideProgress();
                return;
            }
            Log.d("BETSLIPTEST", "Invalid request (probably empty IDs), skipping silently");
            this.this$0.cancelPendingOneClickPlacement();
            this.this$0.hideProgress();
            return;
        }
        Log.d("BETSLIPTEST", "SHEET COEF LOADED successfully");
        V7GrabbedBetsResponse model2 = responseMessage.getModel();
        if (model2 == null || (grabbedBets = model2.getGrabbedBets()) == null || (str = CollectionsKt.joinToString$default(grabbedBets, null, null, null, 0, null, new Function1() { // from class: org.betup.ui.fragment.bets.BetsController$onGrabbetBetFetched$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence onFetched$lambda$2;
                onFetched$lambda$2 = BetsController$onGrabbetBetFetched$1.onFetched$lambda$2((V7GrabbedBetDto) obj);
                return onFetched$lambda$2;
            }
        }, 31, null)) == null) {
            str = "none";
        }
        Log.d("FirstBetFlow", "BetsController [5b] onGrabbetBetFetched - coefficientsFromApi: [" + str + X3.j.e);
        V7GrabbedBetsResponse model3 = responseMessage.getModel();
        if (model3 != null) {
            BetsController betsController = this.this$0;
            try {
                mutableStateFlow = betsController._userAmountFlow;
                mutableStateFlow.setValue(Long.valueOf(model3.getMaxMoneyPlaced()));
                if (model3.getGrabbedBets().isEmpty()) {
                    Log.d("BETSLIPTEST", "Empty grabbed bets response - marking all bets as deleted");
                    boolean isEmpty = betsController.getBetsModel().getValue().isEmpty();
                    BetsController.processBetChangesAndCheckForUpdates$default(betsController, CollectionsKt.emptyList(), false, 2, null);
                    try {
                        EventBus.getDefault().post(new CoefficientUpdatedMessage());
                    } catch (Exception e3) {
                        Log.e("BETSLIPTEST", "Error posting CoefficientUpdatedMessage: " + e3.getMessage(), e3);
                    }
                    if (!isEmpty) {
                        mainActivity4 = betsController.activity;
                        if (mainActivity4 != null) {
                            betsController.showMessage(R.string.bet_deleted);
                        }
                    }
                    betsController.cancelPendingOneClickPlacement();
                    betsController.hideProgress();
                } else {
                    GrabbedBetDataModel grabbedBetDataModel = new GrabbedBetDataModel();
                    List<V7GrabbedBetDto> grabbedBets2 = model3.getGrabbedBets();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = grabbedBets2.iterator();
                    while (it.hasNext()) {
                        try {
                            grabbedBetModel = betsController.convertV7ToOldGrabbedBet((V7GrabbedBetDto) it.next());
                        } catch (Exception e4) {
                            Log.e("BETSLIPTEST", "Error converting bet: " + e4.getMessage(), e4);
                            grabbedBetModel = null;
                        }
                        if (grabbedBetModel != null) {
                            arrayList.add(grabbedBetModel);
                        }
                    }
                    grabbedBetDataModel.setGrabbedBets(arrayList);
                    grabbedBetDataModel.setMaxMoneyPlaced(model3.getMaxMoneyPlaced());
                    mutableStateFlow2 = betsController.betDataModel;
                    mutableStateFlow2.setValue(grabbedBetDataModel);
                    List<GrabbedBetModel> grabbedBets3 = grabbedBetDataModel.getGrabbedBets();
                    Intrinsics.checkNotNullExpressionValue(grabbedBets3, "getGrabbedBets(...)");
                    Log.d("BETSLIPTEST", "Bet changes processed, hasChanges: " + BetsController.processBetChangesAndCheckForUpdates$default(betsController, grabbedBets3, false, 2, null));
                    try {
                        EventBus.getDefault().post(new CoefficientUpdatedMessage());
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e5) {
                        Integer.valueOf(Log.e("BETSLIPTEST", "Error posting CoefficientUpdatedMessage: " + e5.getMessage(), e5));
                    }
                }
            } catch (Exception e6) {
                Log.e("BETSLIPTEST", "Error processing grabbed bets: " + e6.getMessage(), e6);
                mainActivity3 = betsController.activity;
                if (mainActivity3 != null) {
                    betsController.showMessage(R.string.error);
                }
                betsController.cancelPendingOneClickPlacement();
            }
        } else {
            BetsController betsController2 = this.this$0;
            BetsController$onGrabbetBetFetched$1 betsController$onGrabbetBetFetched$1 = this;
            Log.e("BETSLIPTEST", "Response model is null");
            mainActivity2 = betsController2.activity;
            if (mainActivity2 != null) {
                betsController2.showMessage(R.string.invalid_server_response);
            }
            betsController2.cancelPendingOneClickPlacement();
        }
        this.this$0.hideProgressAfterGrabbedBetFetch();
        return;
        Log.e("BETSLIPTEST", "Critical error in onGrabbetBetFetched: " + e.getMessage(), e);
        mainActivity = this.this$0.activity;
        if (mainActivity != null) {
            this.this$0.showMessage(R.string.error);
        }
        this.this$0.cancelPendingOneClickPlacement();
        this.this$0.hideProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onFetched$lambda$2(V7GrabbedBetDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "betId=" + it.getGrabbedBetId() + " coef=" + it.getGrabbedCoeficient();
    }
}
