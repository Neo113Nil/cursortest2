package org.betup.ui.fragment.flashbet.controller;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.bus.NavigateMessage;
import org.betup.games.flashbet.model.FlashBetGameMatchTeamDetailsDto;
import org.betup.games.flashbet.model.FlashBetGameResult;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.games.flashbet.model.FlashBetSessionHistoryItemDto;
import org.betup.games.flashbet.model.FlashBetSessionHistoryPageDto;
import org.betup.games.flashbet.model.FlashBetSportDto;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.flashbet.FlashBetStatsParams;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSportsInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetStatsInteractor;
import org.betup.model.remote.api.rest.flashbet.GetPendingFlashBetSessionInteractor;
import org.betup.ui.fragment.flashbet.compose.FlashBetCategoryItem;
import org.betup.ui.fragment.flashbet.compose.FlashBetStatsItem;
import org.betup.ui.fragment.flashbet.controller.FlashBetSportsState;
import org.betup.ui.fragment.flashbet.controller.FlashBetStatsState;
import org.betup.utils.UiExtensionsKt;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetController.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0016J\u0010\u0010#\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0016J\b\u0010$\u001a\u00020 H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lorg/betup/ui/fragment/flashbet/controller/FlashBetController;", "", "getFlashBetSportsInteractor", "Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetSportsInteractor;", "getFlashBetStatsInteractor", "Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetStatsInteractor;", "getPendingFlashBetSessionInteractor", "Lorg/betup/model/remote/api/rest/flashbet/GetPendingFlashBetSessionInteractor;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetSportsInteractor;Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetStatsInteractor;Lorg/betup/model/remote/api/rest/flashbet/GetPendingFlashBetSessionInteractor;)V", "_sportsState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetSportsState;", "sportsState", "Lkotlinx/coroutines/flow/StateFlow;", "getSportsState", "()Lkotlinx/coroutines/flow/StateFlow;", "_statsState", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetStatsState;", "statsState", "getStatsState", "_isSportsRefreshing", "", "isSportsRefreshing", "_isStatsRefreshing", "isStatsRefreshing", "_pendingSessionForAbandonedDialog", "Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", "pendingSessionForAbandonedDialog", "getPendingSessionForAbandonedDialog", "hasCheckedPendingSession", "clearPendingAbandonedSession", "", "loadSports", "forceRefresh", "loadStats", "checkPendingSession", "mapToCategoryItem", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetCategoryItem;", "sport", "Lorg/betup/games/flashbet/model/FlashBetSportDto;", "mapToStatsItem", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetStatsItem;", "dto", "Lorg/betup/games/flashbet/model/FlashBetSessionHistoryItemDto;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetController {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _isSportsRefreshing;
    private final MutableStateFlow<Boolean> _isStatsRefreshing;
    private final MutableStateFlow<FlashBetGameSessionDto> _pendingSessionForAbandonedDialog;
    private final MutableStateFlow<FlashBetSportsState> _sportsState;
    private final MutableStateFlow<FlashBetStatsState> _statsState;
    private final GetFlashBetSportsInteractor getFlashBetSportsInteractor;
    private final GetFlashBetStatsInteractor getFlashBetStatsInteractor;
    private final GetPendingFlashBetSessionInteractor getPendingFlashBetSessionInteractor;
    private boolean hasCheckedPendingSession;
    private final StateFlow<Boolean> isSportsRefreshing;
    private final StateFlow<Boolean> isStatsRefreshing;
    private final StateFlow<FlashBetGameSessionDto> pendingSessionForAbandonedDialog;
    private final StateFlow<FlashBetSportsState> sportsState;
    private final StateFlow<FlashBetStatsState> statsState;

    @Inject
    public FlashBetController(GetFlashBetSportsInteractor getFlashBetSportsInteractor, GetFlashBetStatsInteractor getFlashBetStatsInteractor, GetPendingFlashBetSessionInteractor getPendingFlashBetSessionInteractor) {
        Intrinsics.checkNotNullParameter(getFlashBetSportsInteractor, "getFlashBetSportsInteractor");
        Intrinsics.checkNotNullParameter(getFlashBetStatsInteractor, "getFlashBetStatsInteractor");
        Intrinsics.checkNotNullParameter(getPendingFlashBetSessionInteractor, "getPendingFlashBetSessionInteractor");
        this.getFlashBetSportsInteractor = getFlashBetSportsInteractor;
        this.getFlashBetStatsInteractor = getFlashBetStatsInteractor;
        this.getPendingFlashBetSessionInteractor = getPendingFlashBetSessionInteractor;
        MutableStateFlow<FlashBetSportsState> MutableStateFlow = StateFlowKt.MutableStateFlow(FlashBetSportsState.Loading.INSTANCE);
        this._sportsState = MutableStateFlow;
        this.sportsState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<FlashBetStatsState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(FlashBetStatsState.Loading.INSTANCE);
        this._statsState = MutableStateFlow2;
        this.statsState = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._isSportsRefreshing = MutableStateFlow3;
        this.isSportsRefreshing = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(false);
        this._isStatsRefreshing = MutableStateFlow4;
        this.isStatsRefreshing = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<FlashBetGameSessionDto> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._pendingSessionForAbandonedDialog = MutableStateFlow5;
        this.pendingSessionForAbandonedDialog = FlowKt.asStateFlow(MutableStateFlow5);
    }

    public final StateFlow<FlashBetSportsState> getSportsState() {
        return this.sportsState;
    }

    public final StateFlow<FlashBetStatsState> getStatsState() {
        return this.statsState;
    }

    public final StateFlow<Boolean> isSportsRefreshing() {
        return this.isSportsRefreshing;
    }

    public final StateFlow<Boolean> isStatsRefreshing() {
        return this.isStatsRefreshing;
    }

    public final StateFlow<FlashBetGameSessionDto> getPendingSessionForAbandonedDialog() {
        return this.pendingSessionForAbandonedDialog;
    }

    public final void clearPendingAbandonedSession() {
        this._pendingSessionForAbandonedDialog.setValue(null);
    }

    public static /* synthetic */ void loadSports$default(FlashBetController flashBetController, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        flashBetController.loadSports(z);
    }

    public final void loadSports(boolean forceRefresh) {
        if (forceRefresh) {
            this.getFlashBetSportsInteractor.invalidate();
        }
        FlashBetSportsState value = this._sportsState.getValue();
        boolean z = (value instanceof FlashBetSportsState.Success) && !((FlashBetSportsState.Success) value).getItems().isEmpty();
        if (!forceRefresh || !z) {
            this._sportsState.setValue(FlashBetSportsState.Loading.INSTANCE);
        } else {
            this._isSportsRefreshing.setValue(true);
        }
        this.getFlashBetSportsInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<List<? extends FlashBetSportDto>, Unit>() { // from class: org.betup.ui.fragment.flashbet.controller.FlashBetController$loadSports$1

            /* compiled from: FlashBetController.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FetchStat.values().length];
                    try {
                        iArr[FetchStat.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<List<? extends FlashBetSportDto>, Unit> response) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                MutableStateFlow mutableStateFlow3;
                FlashBetCategoryItem mapToCategoryItem;
                Intrinsics.checkNotNullParameter(response, "response");
                mutableStateFlow = FlashBetController.this._isSportsRefreshing;
                mutableStateFlow.setValue(false);
                FetchStat stat = response.getStat();
                if ((stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()]) != 1) {
                    mutableStateFlow2 = FlashBetController.this._sportsState;
                    mutableStateFlow2.setValue(FlashBetSportsState.Error.INSTANCE);
                    return;
                }
                List<? extends FlashBetSportDto> model = response.getModel();
                if (model == null) {
                    model = CollectionsKt.emptyList();
                }
                mutableStateFlow3 = FlashBetController.this._sportsState;
                List<? extends FlashBetSportDto> list = model;
                FlashBetController flashBetController = FlashBetController.this;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    mapToCategoryItem = flashBetController.mapToCategoryItem((FlashBetSportDto) it.next());
                    arrayList.add(mapToCategoryItem);
                }
                mutableStateFlow3.setValue(new FlashBetSportsState.Success(arrayList));
            }
        }, null);
        this.getPendingFlashBetSessionInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<FlashBetGameSessionDto, Unit>() { // from class: org.betup.ui.fragment.flashbet.controller.FlashBetController$loadSports$2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<FlashBetGameSessionDto, Unit> response) {
                MutableStateFlow mutableStateFlow;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.getStat() != FetchStat.SUCCESS || response.getModel() == null) {
                    return;
                }
                mutableStateFlow = FlashBetController.this._pendingSessionForAbandonedDialog;
                mutableStateFlow.setValue(response.getModel());
            }
        }, Unit.INSTANCE, null);
    }

    public static /* synthetic */ void loadStats$default(FlashBetController flashBetController, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        flashBetController.loadStats(z);
    }

    public final void loadStats(boolean forceRefresh) {
        if (forceRefresh) {
            this.getFlashBetStatsInteractor.invalidate();
        }
        FlashBetStatsState value = this._statsState.getValue();
        boolean z = (value instanceof FlashBetStatsState.Success) && !((FlashBetStatsState.Success) value).getItems().isEmpty();
        if (!forceRefresh || !z) {
            this._statsState.setValue(FlashBetStatsState.Loading.INSTANCE);
        } else {
            this._isStatsRefreshing.setValue(true);
        }
        this.getFlashBetStatsInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<FlashBetSessionHistoryPageDto, FlashBetStatsParams>() { // from class: org.betup.ui.fragment.flashbet.controller.FlashBetController$loadStats$1

            /* compiled from: FlashBetController.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FetchStat.values().length];
                    try {
                        iArr[FetchStat.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<FlashBetSessionHistoryPageDto, FlashBetStatsParams> response) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                ArrayList emptyList;
                MutableStateFlow mutableStateFlow3;
                List<FlashBetSessionHistoryItemDto> content;
                FlashBetStatsItem mapToStatsItem;
                Intrinsics.checkNotNullParameter(response, "response");
                mutableStateFlow = FlashBetController.this._isStatsRefreshing;
                mutableStateFlow.setValue(false);
                FetchStat stat = response.getStat();
                if ((stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()]) != 1) {
                    mutableStateFlow2 = FlashBetController.this._statsState;
                    mutableStateFlow2.setValue(new FlashBetStatsState.Success(CollectionsKt.emptyList()));
                    return;
                }
                FlashBetSessionHistoryPageDto model = response.getModel();
                if (model == null || (content = model.getContent()) == null) {
                    emptyList = CollectionsKt.emptyList();
                } else {
                    List<FlashBetSessionHistoryItemDto> list = content;
                    FlashBetController flashBetController = FlashBetController.this;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        mapToStatsItem = flashBetController.mapToStatsItem((FlashBetSessionHistoryItemDto) it.next());
                        arrayList.add(mapToStatsItem);
                    }
                    emptyList = arrayList;
                }
                mutableStateFlow3 = FlashBetController.this._statsState;
                mutableStateFlow3.setValue(new FlashBetStatsState.Success(emptyList));
            }
        }, new FlashBetStatsParams(0, 50));
    }

    private final void checkPendingSession() {
        this.getPendingFlashBetSessionInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<FlashBetGameSessionDto, Unit>() { // from class: org.betup.ui.fragment.flashbet.controller.FlashBetController$checkPendingSession$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<FlashBetGameSessionDto, Unit> response) {
                String str;
                String str2;
                String homeTeamLogoUrl;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.getStat() != FetchStat.SUCCESS || response.getModel() == null) {
                    return;
                }
                FlashBetGameSessionDto model = response.getModel();
                Intrinsics.checkNotNull(model);
                FlashBetGameSessionDto flashBetGameSessionDto = model;
                Bundle bundle = new Bundle();
                bundle.putString("sessionId", flashBetGameSessionDto.getId());
                FlashBetGameMatchTeamDetailsDto teamDetails = flashBetGameSessionDto.getTeamDetails();
                String str3 = "";
                if (teamDetails == null || (str = teamDetails.getHomeTeam()) == null) {
                    str = "";
                }
                bundle.putString("categoryName", str);
                FlashBetGameMatchTeamDetailsDto teamDetails2 = flashBetGameSessionDto.getTeamDetails();
                if (teamDetails2 == null || (str2 = teamDetails2.getHomeTeamLogoUrl()) == null) {
                    str2 = "";
                }
                bundle.putString("categoryLogoUrl", str2);
                FlashBetGameMatchTeamDetailsDto teamDetails3 = flashBetGameSessionDto.getTeamDetails();
                if (teamDetails3 != null && (homeTeamLogoUrl = teamDetails3.getHomeTeamLogoUrl()) != null) {
                    str3 = homeTeamLogoUrl;
                }
                bundle.putString("categoryPhotoUrl", str3);
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.FLASH_BET_GAME, bundle));
            }
        }, Unit.INSTANCE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FlashBetCategoryItem mapToCategoryItem(FlashBetSportDto sport) {
        String valueOf = String.valueOf(sport.getId());
        String upperCase = sport.getName().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new FlashBetCategoryItem(valueOf, upperCase, sport.getPhotoUrl(), sport.getPlayedMatches(), sport.getTotalmatches(), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FlashBetStatsItem mapToStatsItem(FlashBetSessionHistoryItemDto dto) {
        long amount;
        double betAmount;
        double d;
        long j = 0;
        if (!Intrinsics.areEqual(dto.getResult(), FlashBetGameResult.EXPIRED) || dto.getReturnAmount() != 0 || dto.getBetAmount() <= 0) {
            if (dto.getBetAmount() > 0) {
                int correctAnswers = dto.getCorrectAnswers();
                if (correctAnswers == 1) {
                    betAmount = dto.getBetAmount();
                    d = 0.5d;
                } else if (correctAnswers == 2) {
                    betAmount = dto.getBetAmount();
                    d = 1.5d;
                } else if (correctAnswers == 3) {
                    amount = dto.getBetAmount();
                    j = amount * 3;
                }
                j = (long) (betAmount * d);
            } else {
                int correctAnswers2 = dto.getCorrectAnswers();
                if (1 <= correctAnswers2 && correctAnswers2 < 4 && dto.getAmount() != 0) {
                    int correctAnswers3 = dto.getCorrectAnswers();
                    if (correctAnswers3 == 1) {
                        j = -dto.getAmount();
                    } else if (correctAnswers3 == 2) {
                        amount = dto.getAmount();
                        j = amount * 3;
                    } else if (correctAnswers3 == 3) {
                        j = (dto.getAmount() * 3) / 2;
                    }
                } else if (dto.getCorrectAnswers() != 0) {
                    j = dto.getAmount();
                }
            }
        }
        long j2 = j;
        String id = dto.getId();
        String sessionId = dto.getSessionId();
        String formattedTime = UiExtensionsKt.getFormattedTime(dto.getCreatedAt());
        String formattedDateWithYear = UiExtensionsKt.getFormattedDateWithYear(dto.getCreatedAt());
        String upperCase = dto.getSportName().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new FlashBetStatsItem(id, sessionId, formattedTime, formattedDateWithYear, upperCase, dto.getSportPhotoUrl(), dto.getCategoryName(), dto.isWin(), dto.getTotalQuestions() > 0 && dto.getCorrectAnswers() == dto.getTotalQuestions(), dto.getCorrectAnswers() == 0, j2, dto.getCorrectAnswers() + "/" + dto.getTotalQuestions(), dto.getCategoryPhotoUrl(), null, 8192, null);
    }
}
