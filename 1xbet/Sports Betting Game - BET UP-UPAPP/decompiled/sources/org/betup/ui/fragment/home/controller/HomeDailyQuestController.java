package org.betup.ui.fragment.home.controller;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.R;
import org.betup.domain.quest.DailyQuest;
import org.betup.domain.quest.DailyQuestMapper;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.ClaimDailyQuestInteractor;
import org.betup.model.remote.api.rest.user.GetDailyQuestsInteractor;
import org.betup.model.remote.entity.quest.UserClaimDailyQuestResponseDto;
import org.betup.model.remote.entity.quest.UserDailyQuestInstanceDto;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.home.controller.HomeDailyQuestEvent;
import org.betup.ui.fragment.home.controller.HomeDailyQuestUiState;
import org.betup.utils.RewardSyncHelper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeDailyQuestController.kt */
@Singleton
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010!\u001a\u00020\u0019J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 J\u0012\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeDailyQuestController;", "", "getDailyQuestsInteractor", "Lorg/betup/model/remote/api/rest/user/GetDailyQuestsInteractor;", "claimDailyQuestInteractor", "Lorg/betup/model/remote/api/rest/user/ClaimDailyQuestInteractor;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/user/GetDailyQuestsInteractor;Lorg/betup/model/remote/api/rest/user/ClaimDailyQuestInteractor;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestEvent;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "claimInFlight", "", "load", "", "userService", "Lorg/betup/services/user/UserService;", "onFinished", "Lkotlin/Function0;", "claim", "questId", "", "clear", "isQuestClaimable", "applyQuestDto", "dto", "Lorg/betup/model/remote/entity/quest/UserDailyQuestInstanceDto;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeDailyQuestController {
    public static final int $stable = 8;
    private final MutableSharedFlow<HomeDailyQuestEvent> _events;
    private final MutableStateFlow<HomeDailyQuestUiState> _uiState;
    private final ClaimDailyQuestInteractor claimDailyQuestInteractor;
    private boolean claimInFlight;
    private final SharedFlow<HomeDailyQuestEvent> events;
    private final GetDailyQuestsInteractor getDailyQuestsInteractor;
    private final StateFlow<HomeDailyQuestUiState> uiState;

    @Inject
    public HomeDailyQuestController(GetDailyQuestsInteractor getDailyQuestsInteractor, ClaimDailyQuestInteractor claimDailyQuestInteractor) {
        Intrinsics.checkNotNullParameter(getDailyQuestsInteractor, "getDailyQuestsInteractor");
        Intrinsics.checkNotNullParameter(claimDailyQuestInteractor, "claimDailyQuestInteractor");
        this.getDailyQuestsInteractor = getDailyQuestsInteractor;
        this.claimDailyQuestInteractor = claimDailyQuestInteractor;
        MutableStateFlow<HomeDailyQuestUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(HomeDailyQuestUiState.Hidden.INSTANCE);
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<HomeDailyQuestEvent> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 8, null, 5, null);
        this._events = MutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final StateFlow<HomeDailyQuestUiState> getUiState() {
        return this.uiState;
    }

    public final SharedFlow<HomeDailyQuestEvent> getEvents() {
        return this.events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void load$default(HomeDailyQuestController homeDailyQuestController, UserService userService, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        homeDailyQuestController.load(userService, function0);
    }

    public final void load(UserService userService, final Function0<Unit> onFinished) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        if (!userService.isRegistered()) {
            this._uiState.setValue(HomeDailyQuestUiState.Hidden.INSTANCE);
            if (onFinished != null) {
                onFinished.invoke();
                return;
            }
            return;
        }
        if (!(this._uiState.getValue() instanceof HomeDailyQuestUiState.Active)) {
            this._uiState.setValue(HomeDailyQuestUiState.Loading.INSTANCE);
        }
        this.getDailyQuestsInteractor.invalidate(null);
        this.getDailyQuestsInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.home.controller.HomeDailyQuestController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                HomeDailyQuestController.load$lambda$0(HomeDailyQuestController.this, onFinished, fetchedResponseMessage);
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$0(HomeDailyQuestController homeDailyQuestController, Function0 function0, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
            if (homeDailyQuestController._uiState.getValue() instanceof HomeDailyQuestUiState.Loading) {
                homeDailyQuestController._uiState.setValue(HomeDailyQuestUiState.Hidden.INSTANCE);
            }
        } else {
            homeDailyQuestController.applyQuestDto((UserDailyQuestInstanceDto) fetchedResponseMessage.getModel());
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void claim(String questId, final UserService userService) {
        Intrinsics.checkNotNullParameter(questId, "questId");
        Intrinsics.checkNotNullParameter(userService, "userService");
        if (this.claimInFlight) {
            return;
        }
        this.claimInFlight = true;
        this.claimDailyQuestInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.home.controller.HomeDailyQuestController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                HomeDailyQuestController.claim$lambda$1(HomeDailyQuestController.this, userService, fetchedResponseMessage);
            }
        }, questId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void claim$lambda$1(HomeDailyQuestController homeDailyQuestController, UserService userService, FetchedResponseMessage fetchedResponseMessage) {
        homeDailyQuestController.claimInFlight = false;
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            RewardSyncHelper.syncProfileAndNotify$default(RewardSyncHelper.INSTANCE, userService, 0L, 2, null);
            homeDailyQuestController.applyQuestDto(((UserClaimDailyQuestResponseDto) fetchedResponseMessage.getModel()).getQuest());
            homeDailyQuestController.getDailyQuestsInteractor.invalidate(null);
            load$default(homeDailyQuestController, userService, null, 2, null);
            return;
        }
        homeDailyQuestController._events.tryEmit(new HomeDailyQuestEvent.ShowError(R.string.home_daily_quests_claim_error));
    }

    public final void clear() {
        this._uiState.setValue(HomeDailyQuestUiState.Hidden.INSTANCE);
    }

    public final boolean isQuestClaimable(String questId) {
        Intrinsics.checkNotNullParameter(questId, "questId");
        HomeDailyQuestUiState value = this._uiState.getValue();
        if (value instanceof HomeDailyQuestUiState.Active) {
            HomeDailyQuestUiState.Active active = (HomeDailyQuestUiState.Active) value;
            if (Intrinsics.areEqual(active.getQuest().getId(), questId) && active.getQuest().isClaimable()) {
                return true;
            }
        }
        return false;
    }

    private final void applyQuestDto(UserDailyQuestInstanceDto dto) {
        DailyQuest quest;
        HomeDailyQuestUiState value = this._uiState.getValue();
        HomeDailyQuestUiState.Active active = value instanceof HomeDailyQuestUiState.Active ? (HomeDailyQuestUiState.Active) value : null;
        boolean z = false;
        if (active != null && (quest = active.getQuest()) != null && quest.isClaimable()) {
            z = true;
        }
        if (dto == null || dto.getTasks().isEmpty()) {
            this._uiState.setValue(HomeDailyQuestUiState.Hidden.INSTANCE);
            return;
        }
        DailyQuest domain = DailyQuestMapper.INSTANCE.toDomain(dto);
        MutableStateFlow<HomeDailyQuestUiState> mutableStateFlow = this._uiState;
        do {
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), domain.isVisible() ? new HomeDailyQuestUiState.Active(domain) : HomeDailyQuestUiState.Hidden.INSTANCE));
        if (!domain.isClaimable() || z) {
            return;
        }
        this._events.tryEmit(new HomeDailyQuestEvent.ShowClaimableNotification(domain.getId()));
    }
}
