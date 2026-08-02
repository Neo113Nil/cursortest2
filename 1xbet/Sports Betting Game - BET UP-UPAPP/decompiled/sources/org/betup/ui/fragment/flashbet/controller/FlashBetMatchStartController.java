package org.betup.ui.fragment.flashbet.controller;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.flashbet.StartFlashBetGameInteractor;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.entity.teams.TeamImageUrlModel;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartUiState;
import org.betup.utils.RewardSyncHelper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetMatchStartController.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013J\u0006\u0010\u001c\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/fragment/flashbet/controller/FlashBetMatchStartController;", "", "startFlashBetGameInteractor", "Lorg/betup/model/remote/api/rest/flashbet/StartFlashBetGameInteractor;", "getRandomTeamImagesInteractor", "Lorg/betup/model/remote/api/rest/matches/GetRandomTeamImagesInteractor;", "userService", "Lorg/betup/services/user/UserService;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/flashbet/StartFlashBetGameInteractor;Lorg/betup/model/remote/api/rest/matches/GetRandomTeamImagesInteractor;Lorg/betup/services/user/UserService;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_randomTeamImageUrlsTeam1", "", "", "randomTeamImageUrlsTeam1", "getRandomTeamImageUrlsTeam1", "_randomTeamImageUrlsTeam2", "randomTeamImageUrlsTeam2", "getRandomTeamImageUrlsTeam2", "loadRandomTeamImages", "", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "acknowledgeGameStarted", "startGame", "categoryId", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetMatchStartController {
    public static final int $stable = 8;
    private final MutableStateFlow<List<String>> _randomTeamImageUrlsTeam1;
    private final MutableStateFlow<List<String>> _randomTeamImageUrlsTeam2;
    private final MutableStateFlow<FlashBetMatchStartUiState> _uiState;
    private final GetRandomTeamImagesInteractor getRandomTeamImagesInteractor;
    private final StateFlow<List<String>> randomTeamImageUrlsTeam1;
    private final StateFlow<List<String>> randomTeamImageUrlsTeam2;
    private final StartFlashBetGameInteractor startFlashBetGameInteractor;
    private final StateFlow<FlashBetMatchStartUiState> uiState;
    private final UserService userService;

    @Inject
    public FlashBetMatchStartController(StartFlashBetGameInteractor startFlashBetGameInteractor, GetRandomTeamImagesInteractor getRandomTeamImagesInteractor, UserService userService) {
        List list;
        List list2;
        Intrinsics.checkNotNullParameter(startFlashBetGameInteractor, "startFlashBetGameInteractor");
        Intrinsics.checkNotNullParameter(getRandomTeamImagesInteractor, "getRandomTeamImagesInteractor");
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.startFlashBetGameInteractor = startFlashBetGameInteractor;
        this.getRandomTeamImagesInteractor = getRandomTeamImagesInteractor;
        this.userService = userService;
        MutableStateFlow<FlashBetMatchStartUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(FlashBetMatchStartUiState.Idle.INSTANCE);
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        list = FlashBetMatchStartControllerKt.FALLBACK_CAROUSEL_IMAGE_URLS;
        MutableStateFlow<List<String>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(list);
        this._randomTeamImageUrlsTeam1 = MutableStateFlow2;
        this.randomTeamImageUrlsTeam1 = FlowKt.asStateFlow(MutableStateFlow2);
        list2 = FlashBetMatchStartControllerKt.FALLBACK_CAROUSEL_IMAGE_URLS;
        MutableStateFlow<List<String>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(list2);
        this._randomTeamImageUrlsTeam2 = MutableStateFlow3;
        this.randomTeamImageUrlsTeam2 = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public final StateFlow<FlashBetMatchStartUiState> getUiState() {
        return this.uiState;
    }

    public final StateFlow<List<String>> getRandomTeamImageUrlsTeam1() {
        return this.randomTeamImageUrlsTeam1;
    }

    public final StateFlow<List<String>> getRandomTeamImageUrlsTeam2() {
        return this.randomTeamImageUrlsTeam2;
    }

    public final void loadRandomTeamImages(String sportId) {
        Intrinsics.checkNotNullParameter(sportId, "sportId");
        Long longOrNull = StringsKt.toLongOrNull(sportId);
        if (longOrNull == null || longOrNull.longValue() <= 0) {
            longOrNull = null;
        }
        Bundle bundle = new Bundle();
        if (longOrNull != null) {
            bundle.putLong(GetRandomTeamImagesInteractor.KEY_SPORT_ID, longOrNull.longValue());
        }
        bundle.putString(GetRandomTeamImagesInteractor.KEY_SLOT, "team1");
        this.getRandomTeamImagesInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<List<? extends TeamImageUrlModel>, Integer>() { // from class: org.betup.ui.fragment.flashbet.controller.FlashBetMatchStartController$loadRandomTeamImages$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<List<? extends TeamImageUrlModel>, Integer> response) {
                List list;
                MutableStateFlow mutableStateFlow;
                List<? extends TeamImageUrlModel> model;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.getStat() != FetchStat.SUCCESS || (model = response.getModel()) == null || model.isEmpty()) {
                    list = FlashBetMatchStartControllerKt.FALLBACK_CAROUSEL_IMAGE_URLS;
                } else {
                    List<? extends TeamImageUrlModel> model2 = response.getModel();
                    Intrinsics.checkNotNull(model2);
                    List<? extends TeamImageUrlModel> list2 = model2;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((TeamImageUrlModel) it.next()).getPhotoUrl());
                    }
                    list = FlashBetMatchStartControllerKt.filterRealTeamUrls(arrayList);
                }
                mutableStateFlow = FlashBetMatchStartController.this._randomTeamImageUrlsTeam1;
                mutableStateFlow.setValue(list);
            }
        }, 10, bundle);
        Bundle bundle2 = new Bundle();
        if (longOrNull != null) {
            bundle2.putLong(GetRandomTeamImagesInteractor.KEY_SPORT_ID, longOrNull.longValue());
        }
        bundle2.putString(GetRandomTeamImagesInteractor.KEY_SLOT, "team2");
        this.getRandomTeamImagesInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<List<? extends TeamImageUrlModel>, Integer>() { // from class: org.betup.ui.fragment.flashbet.controller.FlashBetMatchStartController$loadRandomTeamImages$2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<List<? extends TeamImageUrlModel>, Integer> response) {
                List list;
                MutableStateFlow mutableStateFlow;
                List<? extends TeamImageUrlModel> model;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.getStat() != FetchStat.SUCCESS || (model = response.getModel()) == null || model.isEmpty()) {
                    list = FlashBetMatchStartControllerKt.FALLBACK_CAROUSEL_IMAGE_URLS;
                } else {
                    List<? extends TeamImageUrlModel> model2 = response.getModel();
                    Intrinsics.checkNotNull(model2);
                    List<? extends TeamImageUrlModel> list2 = model2;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((TeamImageUrlModel) it.next()).getPhotoUrl());
                    }
                    list = FlashBetMatchStartControllerKt.filterRealTeamUrls(arrayList);
                }
                mutableStateFlow = FlashBetMatchStartController.this._randomTeamImageUrlsTeam2;
                mutableStateFlow.setValue(list);
            }
        }, 10, bundle2);
    }

    public final void acknowledgeGameStarted() {
        this._uiState.setValue(FlashBetMatchStartUiState.Idle.INSTANCE);
    }

    public final void startGame(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        if (StringsKt.isBlank(categoryId)) {
            return;
        }
        this._uiState.setValue(FlashBetMatchStartUiState.Loading.INSTANCE);
        this.startFlashBetGameInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<FlashBetGameSessionDto, String>() { // from class: org.betup.ui.fragment.flashbet.controller.FlashBetMatchStartController$startGame$1

            /* compiled from: FlashBetMatchStartController.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FetchStat.values().length];
                    try {
                        iArr[FetchStat.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FetchStat.NOT_FOUND.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<FlashBetGameSessionDto, String> response) {
                UserService userService;
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                MutableStateFlow mutableStateFlow3;
                String str;
                Intrinsics.checkNotNullParameter(response, "response");
                FetchStat stat = response.getStat();
                int i = stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()];
                if (i == 1) {
                    RewardSyncHelper rewardSyncHelper = RewardSyncHelper.INSTANCE;
                    userService = FlashBetMatchStartController.this.userService;
                    RewardSyncHelper.syncProfileAndNotify$default(rewardSyncHelper, userService, 0L, 2, null);
                    mutableStateFlow = FlashBetMatchStartController.this._uiState;
                    mutableStateFlow.setValue(new FlashBetMatchStartUiState.StartSuccess(response.getModel()));
                    return;
                }
                if (i != 2) {
                    mutableStateFlow3 = FlashBetMatchStartController.this._uiState;
                    FetchStat stat2 = response.getStat();
                    if (stat2 == null || (str = stat2.name()) == null) {
                        str = "Unknown error";
                    }
                    mutableStateFlow3.setValue(new FlashBetMatchStartUiState.Error(str));
                    return;
                }
                mutableStateFlow2 = FlashBetMatchStartController.this._uiState;
                mutableStateFlow2.setValue(FlashBetMatchStartUiState.NoAvailableMatches.INSTANCE);
            }
        }, categoryId, null);
    }
}
