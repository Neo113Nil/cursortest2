package org.betup.ui.fragment.bets;

import android.content.Context;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.bets.SingleBetInteractor;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.services.user.UserService;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetsPlacedController.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003H\u0002J\u001e\u0010'\u001a\u00020\"2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010)H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u000e\u0010 \u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lorg/betup/ui/fragment/bets/BetsPlacedController;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "betsSingleBetInteractor", "Lorg/betup/model/remote/api/rest/user/bets/SingleBetInteractor;", "getBetsSingleBetInteractor", "()Lorg/betup/model/remote/api/rest/user/bets/SingleBetInteractor;", "setBetsSingleBetInteractor", "(Lorg/betup/model/remote/api/rest/user/bets/SingleBetInteractor;)V", "_oddType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/model/local/entity/OddType;", "oddType", "Lkotlinx/coroutines/flow/StateFlow;", "getOddType", "()Lkotlinx/coroutines/flow/StateFlow;", "_bet", "", "bet", "getBet", "_isLoading", "", "isLoading", "currentBetId", "bind", "", "betId", "context", "Landroid/content/Context;", "fetchBetInfo", "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetsPlacedController implements BaseCachedSharedInteractor.OnFetchedListener<BetsListModel, Integer> {
    public static final int $stable = 8;
    private final MutableStateFlow<List<BetsListModel>> _bet;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<OddType> _oddType;
    private final StateFlow<List<BetsListModel>> bet;

    @Inject
    public SingleBetInteractor betsSingleBetInteractor;
    private int currentBetId;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<OddType> oddType;

    @Inject
    public UserService userService;

    public BetsPlacedController() {
        MutableStateFlow<OddType> MutableStateFlow = StateFlowKt.MutableStateFlow(OddType.DECIMAL);
        this._oddType = MutableStateFlow;
        this.oddType = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<BetsListModel>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._bet = MutableStateFlow2;
        this.bet = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow3;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    public final SingleBetInteractor getBetsSingleBetInteractor() {
        SingleBetInteractor singleBetInteractor = this.betsSingleBetInteractor;
        if (singleBetInteractor != null) {
            return singleBetInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betsSingleBetInteractor");
        return null;
    }

    public final void setBetsSingleBetInteractor(SingleBetInteractor singleBetInteractor) {
        Intrinsics.checkNotNullParameter(singleBetInteractor, "<set-?>");
        this.betsSingleBetInteractor = singleBetInteractor;
    }

    public final StateFlow<OddType> getOddType() {
        return this.oddType;
    }

    public final StateFlow<List<BetsListModel>> getBet() {
        return this.bet;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final void bind(int betId, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentBetId = betId;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        MutableStateFlow<OddType> mutableStateFlow = this._oddType;
        OddType oddType = getUserService().getOddType();
        Intrinsics.checkNotNullExpressionValue(oddType, "getOddType(...)");
        mutableStateFlow.setValue(oddType);
        fetchBetInfo(betId);
    }

    private final void fetchBetInfo(int betId) {
        this._isLoading.setValue(true);
        this._bet.setValue(CollectionsKt.emptyList());
        getBetsSingleBetInteractor().load(this, Integer.valueOf(betId));
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<BetsListModel, Integer> responseMessage) {
        BetsListModel model;
        if (responseMessage != null && (model = responseMessage.getModel()) != null) {
            Integer id = model.getId();
            int i = this.currentBetId;
            if (id != null && id.intValue() == i) {
                this._bet.setValue(CollectionsKt.listOf(model));
            }
        }
        this._isLoading.setValue(false);
    }
}
