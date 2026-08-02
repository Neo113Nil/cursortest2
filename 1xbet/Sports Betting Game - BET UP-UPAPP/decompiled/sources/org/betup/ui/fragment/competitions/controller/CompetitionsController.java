package org.betup.ui.fragment.competitions.controller;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.competitions.CompetitionHistoryCountInteractor;
import org.betup.model.remote.api.rest.competitions.NewActiveCompetitionsInteractor;
import org.betup.model.remote.api.rest.competitions.NewCompetitionsHistoryInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.entity.competitions.CompetitionHistoryCountModel;
import org.betup.model.remote.entity.competitions.CompetitionHistoryItemModel;
import org.betup.model.remote.entity.competitions.CompetitionHistoryResponseModel;
import org.betup.model.remote.entity.competitions.NewCompetitionModel;
import org.betup.model.remote.entity.competitions.NewCompetitionsResponseModel;
import org.betup.model.remote.entity.sports.NewSport;
import org.betup.ui.fragment.competitions.compose.history.model.CompetitionHistoryFilterState;
import org.betup.ui.fragment.competitions.compose.history.model.CompetitionHistoryItemUiModel;
import org.betup.ui.fragment.competitions.compose.items.NewCompetitionUiItem;
import org.betup.ui.fragment.competitions.compose.items.NewCompetitionUiItemKt;
import org.betup.ui.fragment.matches.FavoriteSaver;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionsController.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 `2\u00020\u0001:\u0001`B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000202J\u0006\u0010D\u001a\u00020\u0001J\u000e\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020GJ\u0006\u0010H\u001a\u00020BJ\u0006\u0010I\u001a\u00020BJ\u0006\u0010N\u001a\u00020BJ\u0006\u0010O\u001a\u00020BJ\u000e\u0010P\u001a\u00020B2\u0006\u0010Q\u001a\u000202J\u0010\u0010R\u001a\u0002022\b\u0010Q\u001a\u0004\u0018\u00010SJ\u0006\u0010V\u001a\u00020BJ\u0006\u0010X\u001a\u00020BJ*\u0010Y\u001a\u00020B2\f\u0010Z\u001a\b\u0012\u0004\u0012\u0002020\u00182\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020B0\\H\u0016J8\u0010]\u001a\u00020B2\f\u0010^\u001a\b\u0012\u0004\u0012\u0002020\u00182\f\u0010_\u001a\b\u0012\u0004\u0012\u0002020\u00182\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020B0\\H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00180\u001b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0014\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002020\u001b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001dR\u0016\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u001b¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001dR\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001dR\u000e\u0010;\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u000202X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u0002020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u0002020\u001b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u001dR\u001a\u0010J\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020M0KX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010T\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020M0KX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010W\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020M0KX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lorg/betup/ui/fragment/competitions/controller/CompetitionsController;", "Lorg/betup/ui/fragment/matches/FavoriteSaver;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "newActiveCompetitionsInteractor", "Lorg/betup/model/remote/api/rest/competitions/NewActiveCompetitionsInteractor;", "getNewActiveCompetitionsInteractor", "()Lorg/betup/model/remote/api/rest/competitions/NewActiveCompetitionsInteractor;", "setNewActiveCompetitionsInteractor", "(Lorg/betup/model/remote/api/rest/competitions/NewActiveCompetitionsInteractor;)V", "newCompetitionsHistoryInteractor", "Lorg/betup/model/remote/api/rest/competitions/NewCompetitionsHistoryInteractor;", "getNewCompetitionsHistoryInteractor", "()Lorg/betup/model/remote/api/rest/competitions/NewCompetitionsHistoryInteractor;", "setNewCompetitionsHistoryInteractor", "(Lorg/betup/model/remote/api/rest/competitions/NewCompetitionsHistoryInteractor;)V", "competitionHistoryCountInteractor", "Lorg/betup/model/remote/api/rest/competitions/CompetitionHistoryCountInteractor;", "getCompetitionHistoryCountInteractor", "()Lorg/betup/model/remote/api/rest/competitions/CompetitionHistoryCountInteractor;", "setCompetitionHistoryCountInteractor", "(Lorg/betup/model/remote/api/rest/competitions/CompetitionHistoryCountInteractor;)V", "_activeCompetitions", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/betup/ui/fragment/competitions/compose/items/NewCompetitionUiItem;", "activeCompetitions", "Lkotlinx/coroutines/flow/StateFlow;", "getActiveCompetitions", "()Lkotlinx/coroutines/flow/StateFlow;", "_isActiveCompetitionsLoading", "", "isActiveCompetitionsLoading", "_hasMoreActiveCompetitions", "hasMoreActiveCompetitions", "getHasMoreActiveCompetitions", "_isLoadMoreActiveCompetitions", "isLoadMoreActiveCompetitions", "_historyCompetitions", "Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryItemUiModel;", "historyCompetitions", "getHistoryCompetitions", "_isHistoryCompetitionsLoading", "isHistoryCompetitionsLoading", "_hasMoreHistoryCompetitions", "hasMoreHistoryCompetitions", "getHasMoreHistoryCompetitions", "_isLoadMoreHistoryCompetitions", "isLoadMoreHistoryCompetitions", "_historyFilterState", "", "historyFilterState", "getHistoryFilterState", "_historyCount", "Lorg/betup/model/remote/entity/competitions/CompetitionHistoryCountModel;", "historyCount", "getHistoryCount", "_isHistoryCountLoading", "isHistoryCountLoading", "activeCompetitionsOffset", "historyCompetitionsOffset", "competitionsLimit", "_currentTab", "currentTab", "getCurrentTab", "setCurrentTab", "", "tab", "getFavoriteSaver", "initialize", "context", "Landroid/content/Context;", "loadActiveCompetitions", "loadMoreActiveCompetitions", "activeCompetitionsListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/competitions/NewCompetitionsResponseModel;", "", "loadHistoryCompetitions", "loadMoreHistoryCompetitions", "setHistoryFilterState", "filterState", "getFilterStateInt", "Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryFilterState;", "historyCompetitionsListener", "Lorg/betup/model/remote/entity/competitions/CompetitionHistoryResponseModel;", "loadHistoryCount", "historyCountListener", "refreshAllCompetitions", "saveFavorites", "ids", "onResult", "Lkotlin/Function1;", "saveFavoritesWithDeleteAndPut", "initialIds", "newIds", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompetitionsController implements FavoriteSaver {
    public static final int COMPETITION_WIN_THRESHOLD = 7;
    private final MutableStateFlow<List<NewCompetitionUiItem>> _activeCompetitions;
    private final MutableStateFlow<Integer> _currentTab;
    private final MutableStateFlow<Boolean> _hasMoreActiveCompetitions;
    private final MutableStateFlow<Boolean> _hasMoreHistoryCompetitions;
    private final MutableStateFlow<List<CompetitionHistoryItemUiModel>> _historyCompetitions;
    private final MutableStateFlow<CompetitionHistoryCountModel> _historyCount;
    private final MutableStateFlow<Integer> _historyFilterState;
    private final MutableStateFlow<Boolean> _isActiveCompetitionsLoading;
    private final MutableStateFlow<Boolean> _isHistoryCompetitionsLoading;
    private final MutableStateFlow<Boolean> _isHistoryCountLoading;
    private final MutableStateFlow<Boolean> _isLoadMoreActiveCompetitions;
    private final MutableStateFlow<Boolean> _isLoadMoreHistoryCompetitions;
    private final StateFlow<List<NewCompetitionUiItem>> activeCompetitions;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewCompetitionsResponseModel, Long> activeCompetitionsListener;
    private int activeCompetitionsOffset;

    @Inject
    public CompetitionHistoryCountInteractor competitionHistoryCountInteractor;
    private final int competitionsLimit;
    private final StateFlow<Integer> currentTab;
    private final StateFlow<Boolean> hasMoreActiveCompetitions;
    private final StateFlow<Boolean> hasMoreHistoryCompetitions;
    private final StateFlow<List<CompetitionHistoryItemUiModel>> historyCompetitions;
    private final BaseCachedSharedInteractor.OnFetchedListener<CompetitionHistoryResponseModel, Long> historyCompetitionsListener;
    private int historyCompetitionsOffset;
    private final StateFlow<CompetitionHistoryCountModel> historyCount;
    private final BaseCachedSharedInteractor.OnFetchedListener<CompetitionHistoryCountModel, Long> historyCountListener;
    private final StateFlow<Integer> historyFilterState;
    private final StateFlow<Boolean> isActiveCompetitionsLoading;
    private final StateFlow<Boolean> isHistoryCompetitionsLoading;
    private final StateFlow<Boolean> isHistoryCountLoading;
    private final StateFlow<Boolean> isLoadMoreActiveCompetitions;
    private final StateFlow<Boolean> isLoadMoreHistoryCompetitions;

    @Inject
    public NewActiveCompetitionsInteractor newActiveCompetitionsInteractor;

    @Inject
    public NewCompetitionsHistoryInteractor newCompetitionsHistoryInteractor;
    public static final int $stable = 8;

    /* compiled from: CompetitionsController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CompetitionHistoryFilterState.values().length];
            try {
                iArr[CompetitionHistoryFilterState.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CompetitionHistoryFilterState.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CompetitionHistoryFilterState.NOT_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public CompetitionsController() {
        MutableStateFlow<List<NewCompetitionUiItem>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._activeCompetitions = MutableStateFlow;
        this.activeCompetitions = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isActiveCompetitionsLoading = MutableStateFlow2;
        this.isActiveCompetitionsLoading = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreActiveCompetitions = MutableStateFlow3;
        this.hasMoreActiveCompetitions = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(false);
        this._isLoadMoreActiveCompetitions = MutableStateFlow4;
        this.isLoadMoreActiveCompetitions = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<List<CompetitionHistoryItemUiModel>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._historyCompetitions = MutableStateFlow5;
        this.historyCompetitions = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(false);
        this._isHistoryCompetitionsLoading = MutableStateFlow6;
        this.isHistoryCompetitionsLoading = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<Boolean> MutableStateFlow7 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreHistoryCompetitions = MutableStateFlow7;
        this.hasMoreHistoryCompetitions = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(false);
        this._isLoadMoreHistoryCompetitions = MutableStateFlow8;
        this.isLoadMoreHistoryCompetitions = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Integer> MutableStateFlow9 = StateFlowKt.MutableStateFlow(0);
        this._historyFilterState = MutableStateFlow9;
        this.historyFilterState = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<CompetitionHistoryCountModel> MutableStateFlow10 = StateFlowKt.MutableStateFlow(null);
        this._historyCount = MutableStateFlow10;
        this.historyCount = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<Boolean> MutableStateFlow11 = StateFlowKt.MutableStateFlow(false);
        this._isHistoryCountLoading = MutableStateFlow11;
        this.isHistoryCountLoading = FlowKt.asStateFlow(MutableStateFlow11);
        this.competitionsLimit = 20;
        MutableStateFlow<Integer> MutableStateFlow12 = StateFlowKt.MutableStateFlow(0);
        this._currentTab = MutableStateFlow12;
        this.currentTab = FlowKt.asStateFlow(MutableStateFlow12);
        this.activeCompetitionsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.competitions.controller.CompetitionsController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                CompetitionsController.activeCompetitionsListener$lambda$2(CompetitionsController.this, fetchedResponseMessage);
            }
        };
        this.historyCompetitionsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.competitions.controller.CompetitionsController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                CompetitionsController.historyCompetitionsListener$lambda$5(CompetitionsController.this, fetchedResponseMessage);
            }
        };
        this.historyCountListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.competitions.controller.CompetitionsController$$ExternalSyntheticLambda2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                CompetitionsController.historyCountListener$lambda$6(CompetitionsController.this, fetchedResponseMessage);
            }
        };
    }

    public final NewActiveCompetitionsInteractor getNewActiveCompetitionsInteractor() {
        NewActiveCompetitionsInteractor newActiveCompetitionsInteractor = this.newActiveCompetitionsInteractor;
        if (newActiveCompetitionsInteractor != null) {
            return newActiveCompetitionsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newActiveCompetitionsInteractor");
        return null;
    }

    public final void setNewActiveCompetitionsInteractor(NewActiveCompetitionsInteractor newActiveCompetitionsInteractor) {
        Intrinsics.checkNotNullParameter(newActiveCompetitionsInteractor, "<set-?>");
        this.newActiveCompetitionsInteractor = newActiveCompetitionsInteractor;
    }

    public final NewCompetitionsHistoryInteractor getNewCompetitionsHistoryInteractor() {
        NewCompetitionsHistoryInteractor newCompetitionsHistoryInteractor = this.newCompetitionsHistoryInteractor;
        if (newCompetitionsHistoryInteractor != null) {
            return newCompetitionsHistoryInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newCompetitionsHistoryInteractor");
        return null;
    }

    public final void setNewCompetitionsHistoryInteractor(NewCompetitionsHistoryInteractor newCompetitionsHistoryInteractor) {
        Intrinsics.checkNotNullParameter(newCompetitionsHistoryInteractor, "<set-?>");
        this.newCompetitionsHistoryInteractor = newCompetitionsHistoryInteractor;
    }

    public final CompetitionHistoryCountInteractor getCompetitionHistoryCountInteractor() {
        CompetitionHistoryCountInteractor competitionHistoryCountInteractor = this.competitionHistoryCountInteractor;
        if (competitionHistoryCountInteractor != null) {
            return competitionHistoryCountInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("competitionHistoryCountInteractor");
        return null;
    }

    public final void setCompetitionHistoryCountInteractor(CompetitionHistoryCountInteractor competitionHistoryCountInteractor) {
        Intrinsics.checkNotNullParameter(competitionHistoryCountInteractor, "<set-?>");
        this.competitionHistoryCountInteractor = competitionHistoryCountInteractor;
    }

    public final StateFlow<List<NewCompetitionUiItem>> getActiveCompetitions() {
        return this.activeCompetitions;
    }

    public final StateFlow<Boolean> isActiveCompetitionsLoading() {
        return this.isActiveCompetitionsLoading;
    }

    public final StateFlow<Boolean> getHasMoreActiveCompetitions() {
        return this.hasMoreActiveCompetitions;
    }

    public final StateFlow<Boolean> isLoadMoreActiveCompetitions() {
        return this.isLoadMoreActiveCompetitions;
    }

    public final StateFlow<List<CompetitionHistoryItemUiModel>> getHistoryCompetitions() {
        return this.historyCompetitions;
    }

    public final StateFlow<Boolean> isHistoryCompetitionsLoading() {
        return this.isHistoryCompetitionsLoading;
    }

    public final StateFlow<Boolean> getHasMoreHistoryCompetitions() {
        return this.hasMoreHistoryCompetitions;
    }

    public final StateFlow<Boolean> isLoadMoreHistoryCompetitions() {
        return this.isLoadMoreHistoryCompetitions;
    }

    public final StateFlow<Integer> getHistoryFilterState() {
        return this.historyFilterState;
    }

    public final StateFlow<CompetitionHistoryCountModel> getHistoryCount() {
        return this.historyCount;
    }

    public final StateFlow<Boolean> isHistoryCountLoading() {
        return this.isHistoryCountLoading;
    }

    public final StateFlow<Integer> getCurrentTab() {
        return this.currentTab;
    }

    public final void setCurrentTab(int tab) {
        this._currentTab.setValue(Integer.valueOf(tab));
    }

    public final FavoriteSaver getFavoriteSaver() {
        return this;
    }

    public final void initialize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    public final void loadActiveCompetitions() {
        if (this._isActiveCompetitionsLoading.getValue().booleanValue()) {
            return;
        }
        this._isActiveCompetitionsLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.activeCompetitionsOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.competitionsLimit);
        getNewActiveCompetitionsInteractor().load(this.activeCompetitionsListener, 0L, bundle);
    }

    public final void loadMoreActiveCompetitions() {
        Log.d("CompetitionsController", "loadMoreActiveCompetitions called - isLoading: " + this._isActiveCompetitionsLoading.getValue() + ", hasMore: " + this._hasMoreActiveCompetitions.getValue());
        if (this._isActiveCompetitionsLoading.getValue().booleanValue() || !this._hasMoreActiveCompetitions.getValue().booleanValue()) {
            Log.d("CompetitionsController", "loadMoreActiveCompetitions skipped - isLoading: " + this._isActiveCompetitionsLoading.getValue() + ", hasMore: " + this._hasMoreActiveCompetitions.getValue());
        } else {
            this._isLoadMoreActiveCompetitions.setValue(true);
            int i = this.activeCompetitionsOffset + 1;
            this.activeCompetitionsOffset = i;
            Log.d("CompetitionsController", "loadMoreActiveCompetitions - new offset: " + i);
            loadActiveCompetitions();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activeCompetitionsListener$lambda$2(CompetitionsController competitionsController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        FetchStat stat;
        FetchStat stat2;
        competitionsController._isLoadMoreActiveCompetitions.setValue(false);
        competitionsController._isActiveCompetitionsLoading.setValue(false);
        if (Intrinsics.areEqual((fetchedResponseMessage == null || (stat2 = fetchedResponseMessage.getStat()) == null) ? null : stat2.name(), "SUCCESS") && fetchedResponseMessage.getModel() != null) {
            List<NewCompetitionModel> items = ((NewCompetitionsResponseModel) fetchedResponseMessage.getModel()).getItems();
            List<NewCompetitionModel> list = items;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(NewCompetitionUiItemKt.toUiItem((NewCompetitionModel) it.next()));
            }
            ArrayList arrayList2 = arrayList;
            if (competitionsController.activeCompetitionsOffset == 0) {
                competitionsController._activeCompetitions.setValue(arrayList2);
            } else {
                MutableStateFlow<List<NewCompetitionUiItem>> mutableStateFlow = competitionsController._activeCompetitions;
                mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) arrayList2));
            }
            int size = competitionsController._activeCompetitions.getValue().size();
            int totalItems = ((NewCompetitionsResponseModel) fetchedResponseMessage.getModel()).getTotalItems();
            competitionsController._hasMoreActiveCompetitions.setValue(Boolean.valueOf(size < totalItems));
            Log.d("CompetitionsController", "Active competitions loaded: " + items.size() + ", totalLoaded: " + size + ", totalItems: " + totalItems + ", hasMore: " + competitionsController._hasMoreActiveCompetitions.getValue() + ", current offset: " + competitionsController.activeCompetitionsOffset);
            return;
        }
        if (fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null || (str = stat.name()) == null) {
            str = "Unknown error";
        }
        Log.w("CompetitionsController", "Failed to load active competitions: " + str);
    }

    public final void loadHistoryCompetitions() {
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.historyCompetitionsOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.competitionsLimit);
        bundle.putInt("filterState", this._historyFilterState.getValue().intValue());
        getNewCompetitionsHistoryInteractor().load(this.historyCompetitionsListener, 0L, bundle);
    }

    public final void loadMoreHistoryCompetitions() {
        Log.d("CompetitionsController", "loadMoreHistoryCompetitions called - isLoading: " + this._isLoadMoreHistoryCompetitions.getValue() + ", hasMore: " + this._hasMoreHistoryCompetitions.getValue());
        if (this._isLoadMoreHistoryCompetitions.getValue().booleanValue() || !this._hasMoreHistoryCompetitions.getValue().booleanValue()) {
            Log.d("CompetitionsController", "loadMoreHistoryCompetitions skipped - isLoading: " + this._isLoadMoreHistoryCompetitions.getValue() + ", hasMore: " + this._hasMoreHistoryCompetitions.getValue());
        } else {
            this._isLoadMoreHistoryCompetitions.setValue(true);
            int i = this.historyCompetitionsOffset + 1;
            this.historyCompetitionsOffset = i;
            Log.d("CompetitionsController", "loadMoreHistoryCompetitions - new offset: " + i);
            loadHistoryCompetitions();
        }
    }

    public final void setHistoryFilterState(int filterState) {
        if (this._historyFilterState.getValue().intValue() != filterState) {
            this._historyFilterState.setValue(Integer.valueOf(filterState));
            this.historyCompetitionsOffset = 0;
            this._historyCompetitions.setValue(CollectionsKt.emptyList());
            this._hasMoreHistoryCompetitions.setValue(true);
            loadHistoryCompetitions();
        }
    }

    public final int getFilterStateInt(CompetitionHistoryFilterState filterState) {
        int i = filterState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[filterState.ordinal()];
        if (i == -1) {
            return 0;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void historyCompetitionsListener$lambda$5(CompetitionsController competitionsController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        FetchStat stat;
        String str2;
        FetchStat stat2;
        competitionsController._isLoadMoreHistoryCompetitions.setValue(false);
        String str3 = null;
        String str4 = "CompetitionsController";
        if (Intrinsics.areEqual((fetchedResponseMessage == null || (stat2 = fetchedResponseMessage.getStat()) == null) ? null : stat2.name(), "SUCCESS") && fetchedResponseMessage.getModel() != null) {
            List<CompetitionHistoryItemModel> items = ((CompetitionHistoryResponseModel) fetchedResponseMessage.getModel()).getItems();
            List<CompetitionHistoryItemModel> list = items;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                CompetitionHistoryItemModel competitionHistoryItemModel = (CompetitionHistoryItemModel) next;
                long participantId = competitionHistoryItemModel.getParticipantId();
                long id = competitionHistoryItemModel.getId();
                String substringBefore$default = StringsKt.substringBefore$default(competitionHistoryItemModel.getDate(), " ", str3, 2, str3);
                String str5 = substringBefore$default == null ? "" : substringBefore$default;
                String substringAfter$default = StringsKt.substringAfter$default(competitionHistoryItemModel.getDate(), " ", str3, 2, str3);
                if (substringAfter$default == null) {
                    substringAfter$default = "";
                }
                NewSport sport = competitionHistoryItemModel.getSport();
                if (sport == null || (str2 = sport.getName()) == null) {
                    str2 = "";
                }
                String str6 = str4;
                Iterator it2 = it;
                arrayList.add(new CompetitionHistoryItemUiModel(participantId, id, str5, substringAfter$default, str2, (int) competitionHistoryItemModel.getWonBetsCount(), (int) competitionHistoryItemModel.getTotalBetsCount(), competitionHistoryItemModel.getWonBetsCount() >= 7, (int) competitionHistoryItemModel.getCompetitionState()));
                i = i2;
                str4 = str6;
                it = it2;
                str3 = null;
            }
            String str7 = str4;
            ArrayList arrayList2 = arrayList;
            if (competitionsController.historyCompetitionsOffset == 0) {
                competitionsController._historyCompetitions.setValue(arrayList2);
            } else {
                MutableStateFlow<List<CompetitionHistoryItemUiModel>> mutableStateFlow = competitionsController._historyCompetitions;
                mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) arrayList2));
            }
            int size = competitionsController._historyCompetitions.getValue().size();
            int totalItems = ((CompetitionHistoryResponseModel) fetchedResponseMessage.getModel()).getTotalItems();
            competitionsController._hasMoreHistoryCompetitions.setValue(Boolean.valueOf(size < totalItems));
            Log.d(str7, "History competitions loaded: " + items.size() + ", totalLoaded: " + size + ", totalItems: " + totalItems + ", hasMore: " + competitionsController._hasMoreHistoryCompetitions.getValue() + ", current offset: " + competitionsController.historyCompetitionsOffset);
            return;
        }
        if (fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null || (str = stat.name()) == null) {
            str = "Unknown error";
        }
        Log.w("CompetitionsController", "Failed to load history competitions: " + str);
    }

    public final void loadHistoryCount() {
        if (this._isHistoryCountLoading.getValue().booleanValue()) {
            return;
        }
        this._isHistoryCountLoading.setValue(true);
        getCompetitionHistoryCountInteractor().load(this.historyCountListener, 0L, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void historyCountListener$lambda$6(CompetitionsController competitionsController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        FetchStat stat;
        FetchStat stat2;
        competitionsController._isHistoryCountLoading.setValue(false);
        if (Intrinsics.areEqual((fetchedResponseMessage == null || (stat2 = fetchedResponseMessage.getStat()) == null) ? null : stat2.name(), "SUCCESS") && fetchedResponseMessage.getModel() != null) {
            competitionsController._historyCount.setValue(fetchedResponseMessage.getModel());
            Log.d("CompetitionsController", "History count loaded: all=" + ((CompetitionHistoryCountModel) fetchedResponseMessage.getModel()).getAll() + ", failed(lost)=" + ((CompetitionHistoryCountModel) fetchedResponseMessage.getModel()).getFailed() + ", jackpot(won)=" + ((CompetitionHistoryCountModel) fetchedResponseMessage.getModel()).getJackpot() + ", notStarted=" + ((CompetitionHistoryCountModel) fetchedResponseMessage.getModel()).getNotStarted());
            return;
        }
        if (fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null || (str = stat.name()) == null) {
            str = "Unknown error";
        }
        Log.w("CompetitionsController", "Failed to load history count: " + str);
    }

    public final void refreshAllCompetitions() {
        Log.d("CompetitionsController", "refreshAllCompetitions called");
        this.activeCompetitionsOffset = 0;
        this.historyCompetitionsOffset = 0;
        this._hasMoreActiveCompetitions.setValue(true);
        this._hasMoreHistoryCompetitions.setValue(true);
        this._activeCompetitions.setValue(CollectionsKt.emptyList());
        this._historyCompetitions.setValue(CollectionsKt.emptyList());
        getNewActiveCompetitionsInteractor().invalidate();
        getNewCompetitionsHistoryInteractor().invalidate();
        getCompetitionHistoryCountInteractor().invalidate();
        this._isActiveCompetitionsLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.activeCompetitionsOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.competitionsLimit);
        getNewActiveCompetitionsInteractor().load(this.activeCompetitionsListener, 0L, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("offset", this.historyCompetitionsOffset);
        bundle2.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.competitionsLimit);
        bundle2.putInt("filterState", this._historyFilterState.getValue().intValue());
        getNewCompetitionsHistoryInteractor().load(this.historyCompetitionsListener, 0L, bundle2);
        loadHistoryCount();
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavorites(List<Integer> ids, Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        onResult.invoke(true);
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavoritesWithDeleteAndPut(List<Integer> initialIds, List<Integer> newIds, Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(initialIds, "initialIds");
        Intrinsics.checkNotNullParameter(newIds, "newIds");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        onResult.invoke(true);
    }
}
