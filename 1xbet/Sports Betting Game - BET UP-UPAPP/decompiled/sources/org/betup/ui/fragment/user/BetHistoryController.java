package org.betup.ui.fragment.user;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.user.bets.BetsListInteractor;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.api.rest.user.bets.models.BetsResponseModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.ui.MainActivity;
import org.betup.ui.fragment.bets.betlist.details.BetDetailDialog;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserDetailsController.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"J\u001e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"J\u0018\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010)J\u001a\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010)H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\rR\u000e\u0010\u001c\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0006\u0012\u0004\u0018\u00010\u00160-X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lorg/betup/ui/fragment/user/BetHistoryController;", "", "isViewingOtherUserBets", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Z)V", "currentOffset", "", AppLovinMediationProvider.MAX, "_isLoadingBetsHistory", "Lkotlinx/coroutines/flow/MutableStateFlow;", "isLoadingBetsHistory", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_isLoadMoreHistoryBets", "isLoadMoreHistoryBets", "_betList", "", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "betList", "getBetList", "_betFilterState", "Lorg/betup/model/remote/entity/bets/BetState;", "betFilterState", "getBetFilterState", "_hasMoreHistoryBets", "hasMoreHistoryBets", "getHasMoreHistoryBets", "DEFAULT_OFFSET_HISTORY_ITEMS", "DEFAULT_LIMIT_HISTORY_ITEMS", "reloadBetsHistory", "", "userId", "betsListInteractor", "Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;", "loadBetsHistory", "setFilterState", "selectedState", "onBetClick", "betModel", "context", "Landroid/content/Context;", "showBetDetailDialog", "selectedBetId", "betHistoryListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsResponseModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetHistoryController {
    public static final int $stable = 8;
    private final int DEFAULT_LIMIT_HISTORY_ITEMS;
    private final int DEFAULT_OFFSET_HISTORY_ITEMS;
    private MutableStateFlow<BetState> _betFilterState;
    private final MutableStateFlow<List<BetsListModel>> _betList;
    private final MutableStateFlow<Boolean> _hasMoreHistoryBets;
    private final MutableStateFlow<Boolean> _isLoadMoreHistoryBets;
    private final MutableStateFlow<Boolean> _isLoadingBetsHistory;
    private final StateFlow<BetState> betFilterState;
    private final BaseCachedSharedInteractor.OnFetchedListener<BetsResponseModel, BetState> betHistoryListener;
    private final StateFlow<List<BetsListModel>> betList;
    private int currentOffset;
    private final StateFlow<Boolean> hasMoreHistoryBets;
    private final StateFlow<Boolean> isLoadMoreHistoryBets;
    private final StateFlow<Boolean> isLoadingBetsHistory;
    private final boolean isViewingOtherUserBets;
    private boolean max;

    public BetHistoryController() {
        this(false, 1, null);
    }

    public BetHistoryController(boolean z) {
        this.isViewingOtherUserBets = z;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isLoadingBetsHistory = MutableStateFlow;
        this.isLoadingBetsHistory = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isLoadMoreHistoryBets = MutableStateFlow2;
        this.isLoadMoreHistoryBets = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<BetsListModel>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._betList = MutableStateFlow3;
        this.betList = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<BetState> MutableStateFlow4 = StateFlowKt.MutableStateFlow(BetState.ALL);
        this._betFilterState = MutableStateFlow4;
        this.betFilterState = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreHistoryBets = MutableStateFlow5;
        this.hasMoreHistoryBets = FlowKt.asStateFlow(MutableStateFlow5);
        this.DEFAULT_LIMIT_HISTORY_ITEMS = 15;
        this.betHistoryListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.BetHistoryController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                BetHistoryController.betHistoryListener$lambda$5(BetHistoryController.this, fetchedResponseMessage);
            }
        };
    }

    public /* synthetic */ BetHistoryController(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final StateFlow<Boolean> isLoadingBetsHistory() {
        return this.isLoadingBetsHistory;
    }

    public final StateFlow<Boolean> isLoadMoreHistoryBets() {
        return this.isLoadMoreHistoryBets;
    }

    public final StateFlow<List<BetsListModel>> getBetList() {
        return this.betList;
    }

    public final StateFlow<BetState> getBetFilterState() {
        return this.betFilterState;
    }

    public final StateFlow<Boolean> getHasMoreHistoryBets() {
        return this.hasMoreHistoryBets;
    }

    public final void reloadBetsHistory(int userId, BetsListInteractor betsListInteractor) {
        Intrinsics.checkNotNullParameter(betsListInteractor, "betsListInteractor");
        Log.d("BetHistoryController", "Reloading bet history, currentOffset: " + this.currentOffset + ", userId: " + userId);
        this.currentOffset = this.DEFAULT_OFFSET_HISTORY_ITEMS;
        this.max = false;
        this._hasMoreHistoryBets.setValue(true);
        betsListInteractor.invalidate();
        loadBetsHistory(userId, betsListInteractor);
    }

    public final void loadBetsHistory(int userId, BetsListInteractor betsListInteractor) {
        Intrinsics.checkNotNullParameter(betsListInteractor, "betsListInteractor");
        if (this.max || this._isLoadingBetsHistory.getValue().booleanValue() || this._isLoadMoreHistoryBets.getValue().booleanValue()) {
            Log.d("BetHistoryController", "Skipping loadBetsHistory - max: " + this.max + ", isLoading: " + this._isLoadingBetsHistory.getValue() + ", isLoadMore: " + this._isLoadMoreHistoryBets.getValue());
            return;
        }
        Log.d("BetHistoryController", "Loading more bet history - currentOffset: " + this.currentOffset + ", max: " + this.max);
        if (this.currentOffset == this.DEFAULT_OFFSET_HISTORY_ITEMS) {
            this._isLoadingBetsHistory.setValue(true);
        } else {
            this._isLoadMoreHistoryBets.setValue(true);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.currentOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.DEFAULT_LIMIT_HISTORY_ITEMS);
        bundle.putInt("userId", userId);
        Log.d("BetHistoryController", "Loading bet history with params: offset=" + this.currentOffset + ", limit=" + this.DEFAULT_LIMIT_HISTORY_ITEMS + ", userId=" + userId);
        betsListInteractor.load(this.betHistoryListener, this.betFilterState.getValue(), bundle);
    }

    public final void setFilterState(BetState selectedState, int userId, BetsListInteractor betsListInteractor) {
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        Intrinsics.checkNotNullParameter(betsListInteractor, "betsListInteractor");
        if (this._betFilterState.getValue() != selectedState) {
            this._betFilterState.setValue(selectedState);
            this.currentOffset = this.DEFAULT_OFFSET_HISTORY_ITEMS;
            this.max = false;
            this._hasMoreHistoryBets.setValue(true);
            this._betList.setValue(CollectionsKt.emptyList());
            reloadBetsHistory(userId, betsListInteractor);
        }
    }

    public final void onBetClick(BetsListModel betModel, Context context) {
        Intrinsics.checkNotNullParameter(betModel, "betModel");
        Integer id = betModel.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        showBetDetailDialog(id.intValue(), context);
    }

    private final void showBetDetailDialog(int selectedBetId, Context context) {
        if (context == null || !(context instanceof MainActivity)) {
            return;
        }
        BetDetailDialog betDetailDialog = new BetDetailDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("betId", selectedBetId);
        betDetailDialog.setArguments(bundle);
        betDetailDialog.setCustomBetListProvider(new Function0() { // from class: org.betup.ui.fragment.user.BetHistoryController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List showBetDetailDialog$lambda$4$lambda$3$lambda$2;
                showBetDetailDialog$lambda$4$lambda$3$lambda$2 = BetHistoryController.showBetDetailDialog$lambda$4$lambda$3$lambda$2(BetHistoryController.this);
                return showBetDetailDialog$lambda$4$lambda$3$lambda$2;
            }
        });
        betDetailDialog.setIsViewingOtherUserBets(this.isViewingOtherUserBets);
        betDetailDialog.show(((MainActivity) context).getSupportFragmentManager(), "BetDetailDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List showBetDetailDialog$lambda$4$lambda$3$lambda$2(BetHistoryController betHistoryController) {
        return betHistoryController._betList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void betHistoryListener$lambda$5(BetHistoryController betHistoryController, FetchedResponseMessage fetchedResponseMessage) {
        betHistoryController._isLoadingBetsHistory.setValue(false);
        betHistoryController._isLoadMoreHistoryBets.setValue(false);
        Log.d("BetHistoryController", "Bet history response received: " + (fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null));
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS) {
            Log.d("BetHistoryController", "Bet history fetch failed: " + (fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null));
            return;
        }
        BetsResponseModel betsResponseModel = (BetsResponseModel) fetchedResponseMessage.getModel();
        if (betsResponseModel == null) {
            return;
        }
        List<BetsListModel> betlists = betsResponseModel.getBetlists();
        if (betlists == null) {
            betlists = CollectionsKt.emptyList();
        }
        Log.d("BetHistoryController", "Received " + betlists.size() + " bet items");
        if (betHistoryController.currentOffset == betHistoryController.DEFAULT_OFFSET_HISTORY_ITEMS) {
            betHistoryController._betList.setValue(CollectionsKt.emptyList());
        }
        betHistoryController.currentOffset += betHistoryController.DEFAULT_LIMIT_HISTORY_ITEMS;
        boolean z = betlists.isEmpty() || betlists.size() < betHistoryController.DEFAULT_LIMIT_HISTORY_ITEMS;
        betHistoryController.max = z;
        betHistoryController._hasMoreHistoryBets.setValue(Boolean.valueOf(!z));
        Log.d("BetHistoryController", "Received " + betlists.size() + " bet items, total in list: " + (betHistoryController._betList.getValue().size() + betlists.size()));
        MutableStateFlow<List<BetsListModel>> mutableStateFlow = betHistoryController._betList;
        mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) betlists));
    }
}
