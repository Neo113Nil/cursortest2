package org.betup.ui.fragment.competitions.details.controller;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.R;
import org.betup.bus.ShowNotEnoughBetcoinsVideoOfferMessage;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.competitions.CompetitionDetailsInteractor;
import org.betup.model.remote.api.rest.competitions.CompetitionDetailsWithParticipantInteractor;
import org.betup.model.remote.api.rest.competitions.PlaceBetInteractor;
import org.betup.model.remote.entity.competitions.CompetitionBetGroupModel;
import org.betup.model.remote.entity.competitions.CompetitionBetItemModel;
import org.betup.model.remote.entity.competitions.CompetitionDetailsWithParticipantModel;
import org.betup.model.remote.entity.competitions.CompetitionMatchWithBetsModel;
import org.betup.model.remote.entity.competitions.CompetitionSubMatchModel;
import org.betup.model.remote.entity.competitions.PlaceBetRequestModel;
import org.betup.model.remote.entity.competitions.PlaceBetResponseModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.betup.model.remote.entity.teams.NewTeam;
import org.betup.services.user.UserService;
import org.betup.ui.common.compose.HapticFeedbackEffect;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionDetailsController.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010R\u001a\u00020S2\u0006\u0010I\u001a\u00020\u0003J)\u0010R\u001a\u00020S2\u0006\u0010I\u001a\u00020\u00032\b\u0010J\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010L\u001a\u0004\u0018\u00010'¢\u0006\u0002\u0010TJ\u0006\u0010U\u001a\u00020SJ\u000e\u0010V\u001a\u00020S2\u0006\u0010W\u001a\u00020\u0003J\u000e\u0010X\u001a\u00020S2\u0006\u0010Y\u001a\u000200J\u0010\u0010Z\u001a\u00020S2\u0006\u0010W\u001a\u00020\u0003H\u0002J\u001e\u0010[\u001a\u00020S2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00032\u0006\u0010^\u001a\u000200J\b\u0010_\u001a\u00020SH\u0002J\u000e\u0010`\u001a\u00020S2\u0006\u0010]\u001a\u00020\u0003J\u000e\u0010a\u001a\u00020S2\u0006\u0010b\u001a\u00020'J\u0015\u0010c\u001a\u0004\u0018\u00010\u00032\u0006\u0010W\u001a\u00020\u0003¢\u0006\u0002\u0010dJ\u000e\u0010e\u001a\u00020'2\u0006\u0010f\u001a\u00020\u0003J\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u000304J\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000309J\u0006\u0010h\u001a\u00020'J\u0012\u0010i\u001a\u00020S2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u000e\u0010j\u001a\u0004\u0018\u00010k*\u00020\u0005H\u0002J\u0006\u0010l\u001a\u00020SJ\u000e\u0010m\u001a\u00020S2\u0006\u0010W\u001a\u00020\u0003J\u000e\u0010n\u001a\u00020S2\u0006\u0010o\u001a\u00020'J\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020q09J\u0006\u0010r\u001a\u00020SJ \u0010s\u001a\u00020S2\u0016\u0010t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030uH\u0016J4\u0010v\u001a\u00020S2\u0018\u0010w\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020S0x2\u0012\u0010y\u001a\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020S0zR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0#¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020'0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020'0#¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0016\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030#¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u0002000!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002000#¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205040!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205040#¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R \u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003090!X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003090#¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u001a\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030=0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030?0#¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%R \u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'090!X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'090#¢\u0006\b\n\u0000\u001a\u0004\bC\u0010%R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020'0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020'0#¢\u0006\b\n\u0000\u001a\u0004\bF\u0010%R\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020'0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020'0#¢\u0006\b\n\u0000\u001a\u0004\bH\u0010%R\u000e\u0010I\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010J\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010KR\u0012\u0010L\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0004\n\u0002\u0010MR\u0013\u0010N\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u000e\u0010P\u001a\u00020QX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006{"}, d2 = {"Lorg/betup/ui/fragment/competitions/details/controller/CompetitionDetailsController;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/competitions/CompetitionDetailsWithParticipantModel;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "competitionDetailsInteractor", "Lorg/betup/model/remote/api/rest/competitions/CompetitionDetailsInteractor;", "getCompetitionDetailsInteractor", "()Lorg/betup/model/remote/api/rest/competitions/CompetitionDetailsInteractor;", "setCompetitionDetailsInteractor", "(Lorg/betup/model/remote/api/rest/competitions/CompetitionDetailsInteractor;)V", "competitionDetailsWithParticipantInteractor", "Lorg/betup/model/remote/api/rest/competitions/CompetitionDetailsWithParticipantInteractor;", "getCompetitionDetailsWithParticipantInteractor", "()Lorg/betup/model/remote/api/rest/competitions/CompetitionDetailsWithParticipantInteractor;", "setCompetitionDetailsWithParticipantInteractor", "(Lorg/betup/model/remote/api/rest/competitions/CompetitionDetailsWithParticipantInteractor;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "placeBetInteractor", "Lorg/betup/model/remote/api/rest/competitions/PlaceBetInteractor;", "getPlaceBetInteractor", "()Lorg/betup/model/remote/api/rest/competitions/PlaceBetInteractor;", "setPlaceBetInteractor", "(Lorg/betup/model/remote/api/rest/competitions/PlaceBetInteractor;)V", "_competitionDetails", "Lkotlinx/coroutines/flow/MutableStateFlow;", "competitionDetails", "Lkotlinx/coroutines/flow/StateFlow;", "getCompetitionDetails", "()Lkotlinx/coroutines/flow/StateFlow;", "_isLoading", "", "isLoading", "_hasError", "hasError", "getHasError", "_selectedMatchId", "selectedMatchId", "getSelectedMatchId", "_currentMatchIndex", "", "currentMatchIndex", "getCurrentMatchIndex", "_betGroups", "", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupBetsModel;", "betGroups", "getBetGroups", "_selectedBetsPerMatch", "", "selectedBetsPerMatch", "getSelectedBetsPerMatch", "_selectedBetIds", "", "selectedBetIds", "", "getSelectedBetIds", "_expandedStates", "expandedStates", "getExpandedStates", "_autoNavigate", "autoNavigate", "getAutoNavigate", "_isPlacingBet", "isPlacingBet", "competitionId", "participantId", "Ljava/lang/Long;", "isWon", "Ljava/lang/Boolean;", "isWonValue", "()Ljava/lang/Boolean;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "initialize", "", "(JLjava/lang/Long;Ljava/lang/Boolean;)V", "loadCompetitionDetails", "selectMatch", "matchId", "selectMatchByIndex", "index", "loadBetGroupsForMatch", "onBetClick", "varietyId", "groupId", "betIndex", "navigateToNextMatch", "onExpandToggle", "setAllExpanded", "expanded", "getSelectedBetForMatch", "(J)Ljava/lang/Long;", "isBetSelectedForCurrentMatch", "betId", "getSelectedBets", "areAllMatchesSelected", "selectRandomBets", "findActivity", "Landroid/app/Activity;", "clearSelections", "clearSelectionForMatch", "setAutoNavigate", "enabled", "getSelectionSummary", "", "cleanup", "onFetched", "response", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "placeBet", "onSuccess", "Lkotlin/Function2;", "onError", "Lkotlin/Function1;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompetitionDetailsController implements BaseCachedSharedInteractor.OnFetchedListener<CompetitionDetailsWithParticipantModel, Long> {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _autoNavigate;
    private final MutableStateFlow<List<MatchVarietyGroupBetsModel>> _betGroups;
    private final MutableStateFlow<CompetitionDetailsWithParticipantModel> _competitionDetails;
    private final MutableStateFlow<Integer> _currentMatchIndex;
    private final MutableStateFlow<Map<Long, Boolean>> _expandedStates;
    private final MutableStateFlow<Boolean> _hasError;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isPlacingBet;
    private final MutableStateFlow<Set<Long>> _selectedBetIds;
    private final MutableStateFlow<Map<Long, Long>> _selectedBetsPerMatch;
    private final MutableStateFlow<Long> _selectedMatchId;
    private final StateFlow<Boolean> autoNavigate;
    private final StateFlow<List<MatchVarietyGroupBetsModel>> betGroups;
    private final StateFlow<CompetitionDetailsWithParticipantModel> competitionDetails;

    @Inject
    public CompetitionDetailsInteractor competitionDetailsInteractor;

    @Inject
    public CompetitionDetailsWithParticipantInteractor competitionDetailsWithParticipantInteractor;
    private long competitionId;
    private final Context context;
    private final CoroutineScope coroutineScope;
    private final StateFlow<Integer> currentMatchIndex;
    private final StateFlow<Map<Long, Boolean>> expandedStates;
    private final StateFlow<Boolean> hasError;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isPlacingBet;
    private Boolean isWon;
    private Long participantId;

    @Inject
    public PlaceBetInteractor placeBetInteractor;
    private final StateFlow<Set<Long>> selectedBetIds;
    private final StateFlow<Map<Long, Long>> selectedBetsPerMatch;
    private final StateFlow<Long> selectedMatchId;

    @Inject
    public UserService userService;

    @Inject
    public CompetitionDetailsController(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        MutableStateFlow<CompetitionDetailsWithParticipantModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._competitionDetails = MutableStateFlow;
        this.competitionDetails = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow2;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._hasError = MutableStateFlow3;
        this.hasError = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Long> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this._selectedMatchId = MutableStateFlow4;
        this.selectedMatchId = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Integer> MutableStateFlow5 = StateFlowKt.MutableStateFlow(0);
        this._currentMatchIndex = MutableStateFlow5;
        this.currentMatchIndex = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<List<MatchVarietyGroupBetsModel>> MutableStateFlow6 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._betGroups = MutableStateFlow6;
        this.betGroups = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<Map<Long, Long>> MutableStateFlow7 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this._selectedBetsPerMatch = MutableStateFlow7;
        this.selectedBetsPerMatch = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Set<Long>> MutableStateFlow8 = StateFlowKt.MutableStateFlow(new LinkedHashSet());
        this._selectedBetIds = MutableStateFlow8;
        this.selectedBetIds = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Map<Long, Boolean>> MutableStateFlow9 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this._expandedStates = MutableStateFlow9;
        this.expandedStates = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<Boolean> MutableStateFlow10 = StateFlowKt.MutableStateFlow(true);
        this._autoNavigate = MutableStateFlow10;
        this.autoNavigate = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<Boolean> MutableStateFlow11 = StateFlowKt.MutableStateFlow(false);
        this._isPlacingBet = MutableStateFlow11;
        this.isPlacingBet = FlowKt.asStateFlow(MutableStateFlow11);
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
    }

    public final CompetitionDetailsInteractor getCompetitionDetailsInteractor() {
        CompetitionDetailsInteractor competitionDetailsInteractor = this.competitionDetailsInteractor;
        if (competitionDetailsInteractor != null) {
            return competitionDetailsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("competitionDetailsInteractor");
        return null;
    }

    public final void setCompetitionDetailsInteractor(CompetitionDetailsInteractor competitionDetailsInteractor) {
        Intrinsics.checkNotNullParameter(competitionDetailsInteractor, "<set-?>");
        this.competitionDetailsInteractor = competitionDetailsInteractor;
    }

    public final CompetitionDetailsWithParticipantInteractor getCompetitionDetailsWithParticipantInteractor() {
        CompetitionDetailsWithParticipantInteractor competitionDetailsWithParticipantInteractor = this.competitionDetailsWithParticipantInteractor;
        if (competitionDetailsWithParticipantInteractor != null) {
            return competitionDetailsWithParticipantInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("competitionDetailsWithParticipantInteractor");
        return null;
    }

    public final void setCompetitionDetailsWithParticipantInteractor(CompetitionDetailsWithParticipantInteractor competitionDetailsWithParticipantInteractor) {
        Intrinsics.checkNotNullParameter(competitionDetailsWithParticipantInteractor, "<set-?>");
        this.competitionDetailsWithParticipantInteractor = competitionDetailsWithParticipantInteractor;
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

    public final PlaceBetInteractor getPlaceBetInteractor() {
        PlaceBetInteractor placeBetInteractor = this.placeBetInteractor;
        if (placeBetInteractor != null) {
            return placeBetInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("placeBetInteractor");
        return null;
    }

    public final void setPlaceBetInteractor(PlaceBetInteractor placeBetInteractor) {
        Intrinsics.checkNotNullParameter(placeBetInteractor, "<set-?>");
        this.placeBetInteractor = placeBetInteractor;
    }

    public final StateFlow<CompetitionDetailsWithParticipantModel> getCompetitionDetails() {
        return this.competitionDetails;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<Boolean> getHasError() {
        return this.hasError;
    }

    public final StateFlow<Long> getSelectedMatchId() {
        return this.selectedMatchId;
    }

    public final StateFlow<Integer> getCurrentMatchIndex() {
        return this.currentMatchIndex;
    }

    public final StateFlow<List<MatchVarietyGroupBetsModel>> getBetGroups() {
        return this.betGroups;
    }

    /* renamed from: getSelectedBetsPerMatch, reason: collision with other method in class */
    public final StateFlow<Map<Long, Long>> m13658getSelectedBetsPerMatch() {
        return this.selectedBetsPerMatch;
    }

    public final StateFlow<Set<Long>> getSelectedBetIds() {
        return this.selectedBetIds;
    }

    public final StateFlow<Map<Long, Boolean>> getExpandedStates() {
        return this.expandedStates;
    }

    public final StateFlow<Boolean> getAutoNavigate() {
        return this.autoNavigate;
    }

    public final StateFlow<Boolean> isPlacingBet() {
        return this.isPlacingBet;
    }

    /* renamed from: isWonValue, reason: from getter */
    public final Boolean getIsWon() {
        return this.isWon;
    }

    public final void initialize(long competitionId) {
        this.competitionId = competitionId;
        this.participantId = null;
        Log.d("CompetitionDetailsController", "Initialized with competition ID: " + competitionId);
    }

    public static /* synthetic */ void initialize$default(CompetitionDetailsController competitionDetailsController, long j, Long l, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        competitionDetailsController.initialize(j, l, bool);
    }

    public final void initialize(long competitionId, Long participantId, Boolean isWon) {
        this.competitionId = competitionId;
        this.participantId = participantId;
        this.isWon = isWon;
        Log.d("CompetitionDetailsController", "Initialized with competition ID: " + competitionId + ", participant ID: " + participantId);
    }

    public final void loadCompetitionDetails() {
        long j = this.competitionId;
        if (j == 0) {
            Log.e("CompetitionDetailsController", "Competition ID not set");
            return;
        }
        Log.d("CompetitionDetailsController", "Loading competition details for ID: " + j + ", participantId: " + this.participantId);
        this._isLoading.setValue(true);
        this._hasError.setValue(false);
        Long l = this.participantId;
        if (l != null && (l == null || l.longValue() != 0)) {
            Bundle bundle = new Bundle();
            Long l2 = this.participantId;
            Intrinsics.checkNotNull(l2);
            bundle.putLong("participantId", l2.longValue());
            getCompetitionDetailsWithParticipantInteractor().load(this, Long.valueOf(this.competitionId), bundle);
            return;
        }
        getCompetitionDetailsInteractor().load(this, Long.valueOf(this.competitionId), null);
    }

    public final void selectMatch(long matchId) {
        Log.d("CompetitionDetailsController", "Selecting match: " + matchId);
        this._selectedMatchId.setValue(Long.valueOf(matchId));
        CompetitionDetailsWithParticipantModel value = this._competitionDetails.getValue();
        if (value != null) {
            Iterator<CompetitionMatchWithBetsModel> it = value.getMatches().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (it.next().getMatchInfo().getId() == matchId) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                this._currentMatchIndex.setValue(Integer.valueOf(i));
            }
        }
        loadBetGroupsForMatch(matchId);
    }

    public final void selectMatchByIndex(int index) {
        CompetitionDetailsWithParticipantModel value = this._competitionDetails.getValue();
        if (value == null || index < 0 || index >= value.getMatches().size()) {
            return;
        }
        selectMatch(value.getMatches().get(index).getMatchInfo().getId());
    }

    private final void loadBetGroupsForMatch(long matchId) {
        Log.d("CompetitionDetailsController", "Loading bet groups for match: " + matchId);
        this._betGroups.setValue(CollectionsKt.emptyList());
    }

    public final void onBetClick(long varietyId, long groupId, int betIndex) {
        CompetitionBetItemModel competitionBetItemModel;
        Object obj;
        Log.d("CompetitionDetailsController", "Bet clicked - varietyId: " + varietyId + ", groupId: " + groupId + ", betIndex: " + betIndex);
        Long value = this._selectedMatchId.getValue();
        if (value == null) {
            Log.e("CompetitionDetailsController", "No match selected");
            return;
        }
        CompetitionDetailsWithParticipantModel value2 = this._competitionDetails.getValue();
        if (value2 == null) {
            Log.e("CompetitionDetailsController", "No competition loaded");
            return;
        }
        Iterator<T> it = value2.getMatches().iterator();
        while (true) {
            competitionBetItemModel = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long id = ((CompetitionMatchWithBetsModel) obj).getMatchInfo().getId();
            if (value != null && id == value.longValue()) {
                break;
            }
        }
        CompetitionMatchWithBetsModel competitionMatchWithBetsModel = (CompetitionMatchWithBetsModel) obj;
        if (competitionMatchWithBetsModel == null) {
            Log.e("CompetitionDetailsController", "Current match not found");
            return;
        }
        for (CompetitionSubMatchModel competitionSubMatchModel : competitionMatchWithBetsModel.getSubMatches()) {
            if (competitionSubMatchModel.getVariety().getId() == varietyId) {
                Iterator<CompetitionBetGroupModel> it2 = competitionSubMatchModel.getGroups().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CompetitionBetGroupModel next = it2.next();
                    if (next.getGroup().getId() == groupId) {
                        competitionBetItemModel = (CompetitionBetItemModel) CollectionsKt.getOrNull(next.getBets(), betIndex);
                        break;
                    }
                }
                if (competitionBetItemModel != null) {
                    break;
                }
            }
        }
        if (competitionBetItemModel == null) {
            Log.e("CompetitionDetailsController", "Bet not found");
            return;
        }
        long grabbedBetId = competitionBetItemModel.getGrabbedBetId();
        Map<Long, Long> mutableMap = MapsKt.toMutableMap(this._selectedBetsPerMatch.getValue());
        Set<Long> mutableSet = CollectionsKt.toMutableSet(this._selectedBetIds.getValue());
        Long l = mutableMap.get(value);
        if (l != null && l.longValue() == grabbedBetId) {
            mutableMap.remove(value);
            mutableSet.remove(Long.valueOf(grabbedBetId));
            Log.d("CompetitionDetailsController", "Deselected bet: " + grabbedBetId + " for match: " + value);
        } else {
            if (l != null) {
                mutableSet.remove(l);
            }
            mutableMap.put(value, Long.valueOf(grabbedBetId));
            mutableSet.add(Long.valueOf(grabbedBetId));
            Log.d("CompetitionDetailsController", "Selected bet: " + grabbedBetId + " for match: " + value);
            if (this._autoNavigate.getValue().booleanValue()) {
                navigateToNextMatch();
            }
        }
        this._selectedBetsPerMatch.setValue(mutableMap);
        this._selectedBetIds.setValue(mutableSet);
    }

    private final void navigateToNextMatch() {
        if (this._competitionDetails.getValue() == null) {
            return;
        }
        int intValue = this._currentMatchIndex.getValue().intValue();
        if (intValue < r0.getMatches().size() - 1) {
            int i = intValue + 1;
            Log.d("CompetitionDetailsController", "Auto-navigating to next match at index: " + i);
            selectMatchByIndex(i);
            return;
        }
        Log.d("CompetitionDetailsController", "Reached last match, no auto-navigation");
    }

    public final void onExpandToggle(long groupId) {
        Map<Long, Boolean> mutableMap = MapsKt.toMutableMap(this._expandedStates.getValue());
        mutableMap.put(Long.valueOf(groupId), Boolean.valueOf(!(mutableMap.get(Long.valueOf(groupId)) != null ? r2.booleanValue() : false)));
        this._expandedStates.setValue(mutableMap);
        Log.d("CompetitionDetailsController", "Toggled expansion for group: " + groupId);
    }

    public final void setAllExpanded(boolean expanded) {
        List<MatchVarietyGroupBetsModel> value = this._betGroups.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(value, 10)), 16));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            Pair pair = TuplesKt.to(Long.valueOf(((MatchVarietyGroupBetsModel) it.next()).getGroup().getId()), Boolean.valueOf(expanded));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this._expandedStates.setValue(linkedHashMap);
        Log.d("CompetitionDetailsController", "Set all groups expanded: " + expanded);
    }

    public final Long getSelectedBetForMatch(long matchId) {
        return this._selectedBetsPerMatch.getValue().get(Long.valueOf(matchId));
    }

    public final boolean isBetSelectedForCurrentMatch(long betId) {
        Long value = this._selectedMatchId.getValue();
        if (value == null) {
            return false;
        }
        Long l = this._selectedBetsPerMatch.getValue().get(Long.valueOf(value.longValue()));
        return l != null && l.longValue() == betId;
    }

    public final List<Long> getSelectedBets() {
        return CollectionsKt.toList(this._selectedBetIds.getValue());
    }

    public final Map<Long, Long> getSelectedBetsPerMatch() {
        return this._selectedBetsPerMatch.getValue();
    }

    public final boolean areAllMatchesSelected() {
        CompetitionDetailsWithParticipantModel value = this._competitionDetails.getValue();
        if (value == null || value.getMatches().isEmpty()) {
            return false;
        }
        List<CompetitionMatchWithBetsModel> matches = value.getMatches();
        if (!(matches instanceof Collection) || !matches.isEmpty()) {
            Iterator<T> it = matches.iterator();
            while (it.hasNext()) {
                if (!this._selectedBetsPerMatch.getValue().containsKey(Long.valueOf(((CompetitionMatchWithBetsModel) it.next()).getMatchInfo().getId()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static /* synthetic */ void selectRandomBets$default(CompetitionDetailsController competitionDetailsController, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        competitionDetailsController.selectRandomBets(context);
    }

    public final void selectRandomBets(Context context) {
        Activity findActivity;
        CompetitionDetailsWithParticipantModel value = this._competitionDetails.getValue();
        if (value == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CompetitionMatchWithBetsModel competitionMatchWithBetsModel : value.getMatches()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = competitionMatchWithBetsModel.getSubMatches().iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((CompetitionSubMatchModel) it.next()).getGroups().iterator();
                while (it2.hasNext()) {
                    for (CompetitionBetItemModel competitionBetItemModel : ((CompetitionBetGroupModel) it2.next()).getBets()) {
                        if (competitionBetItemModel.isAvailable()) {
                            arrayList.add(competitionBetItemModel);
                        }
                    }
                }
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                CompetitionBetItemModel competitionBetItemModel2 = (CompetitionBetItemModel) CollectionsKt.random(arrayList2, Random.INSTANCE);
                linkedHashMap.put(Long.valueOf(competitionMatchWithBetsModel.getMatchInfo().getId()), Long.valueOf(competitionBetItemModel2.getGrabbedBetId()));
                Log.d("CompetitionDetailsController", "Randomly selected bet " + competitionBetItemModel2.getBetName() + " (" + competitionBetItemModel2.getGrabbedBetId() + ") for match " + competitionMatchWithBetsModel.getMatchInfo().getId());
            }
        }
        this._selectedBetsPerMatch.setValue(linkedHashMap);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            linkedHashSet.add(Long.valueOf(((Number) it3.next()).longValue()));
        }
        this._selectedBetIds.setValue(linkedHashSet);
        Log.d("CompetitionDetailsController", "Random bets selected for " + linkedHashMap.size() + " matches");
        if (context != null) {
            SnackbarHelper.showShort(context, R.string.competition_random_bets_selected);
        }
        if (linkedHashMap.isEmpty() || context == null || (findActivity = findActivity(context)) == null) {
            return;
        }
        HapticFeedbackEffect.performBetSelectBurst(findActivity, linkedHashMap.size());
    }

    private final Activity findActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        return null;
    }

    public final void clearSelections() {
        this._selectedBetIds.setValue(new LinkedHashSet());
        this._selectedBetsPerMatch.setValue(MapsKt.emptyMap());
        Log.d("CompetitionDetailsController", "Cleared all bet selections");
    }

    public final void clearSelectionForMatch(long matchId) {
        Map<Long, Long> mutableMap = MapsKt.toMutableMap(this._selectedBetsPerMatch.getValue());
        Set<Long> mutableSet = CollectionsKt.toMutableSet(this._selectedBetIds.getValue());
        Long remove = mutableMap.remove(Long.valueOf(matchId));
        if (remove != null) {
            mutableSet.remove(remove);
            this._selectedBetsPerMatch.setValue(mutableMap);
            this._selectedBetIds.setValue(mutableSet);
            Log.d("CompetitionDetailsController", "Cleared selection for match: " + matchId);
        }
    }

    public final void setAutoNavigate(boolean enabled) {
        this._autoNavigate.setValue(Boolean.valueOf(enabled));
        Log.d("CompetitionDetailsController", "Auto-navigation set to: " + enabled);
    }

    public final Map<Long, String> getSelectionSummary() {
        Object obj;
        String str;
        String str2;
        Object obj2;
        CompetitionDetailsWithParticipantModel value = this._competitionDetails.getValue();
        if (value == null) {
            return MapsKt.emptyMap();
        }
        Map<Long, Long> value2 = this._selectedBetsPerMatch.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, Long> entry : value2.entrySet()) {
            long longValue = entry.getKey().longValue();
            long longValue2 = entry.getValue().longValue();
            Iterator<T> it = value.getMatches().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((CompetitionMatchWithBetsModel) obj).getMatchInfo().getId() == longValue) {
                    break;
                }
            }
            CompetitionMatchWithBetsModel competitionMatchWithBetsModel = (CompetitionMatchWithBetsModel) obj;
            if (competitionMatchWithBetsModel != null) {
                Iterator<CompetitionSubMatchModel> it2 = competitionMatchWithBetsModel.getSubMatches().iterator();
                String str3 = "Unknown Bet";
                while (it2.hasNext()) {
                    Iterator<CompetitionBetGroupModel> it3 = it2.next().getGroups().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Iterator<T> it4 = it3.next().getBets().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it4.next();
                            if (((CompetitionBetItemModel) obj2).getGrabbedBetId() == longValue2) {
                                break;
                            }
                        }
                        CompetitionBetItemModel competitionBetItemModel = (CompetitionBetItemModel) obj2;
                        if (competitionBetItemModel != null) {
                            str3 = competitionBetItemModel.getBetName();
                            break;
                        }
                    }
                    if (!Intrinsics.areEqual(str3, "Unknown Bet")) {
                        break;
                    }
                }
                Long valueOf = Long.valueOf(longValue);
                NewTeam homeTeam = competitionMatchWithBetsModel.getMatchInfo().getHomeTeam();
                if (homeTeam == null || (str = homeTeam.getName()) == null) {
                    str = "Home";
                }
                NewTeam awayTeam = competitionMatchWithBetsModel.getMatchInfo().getAwayTeam();
                if (awayTeam == null || (str2 = awayTeam.getName()) == null) {
                    str2 = "Away";
                }
                linkedHashMap.put(valueOf, str + " vs " + str2 + " - " + str3);
            }
        }
        return linkedHashMap;
    }

    public final void cleanup() {
        Log.d("CompetitionDetailsController", "Cleaning up controller");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<CompetitionDetailsWithParticipantModel, Long> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new CompetitionDetailsController$onFetched$1(this, response, null), 3, null);
    }

    public final void placeBet(final Function2<? super Long, ? super Long, Unit> onSuccess, final Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Map<Long, Long> value = this._selectedBetsPerMatch.getValue();
        if (value.isEmpty()) {
            onError.invoke("error_no_bets_selected");
            try {
                SnackbarHelper.showShort(this.context, R.string.error_no_bets_selected);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (this.competitionId == 0) {
            onError.invoke("error_missing_data");
            try {
                SnackbarHelper.showShort(this.context, R.string.error_missing_data);
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        CompetitionDetailsWithParticipantModel value2 = this._competitionDetails.getValue();
        long enterFee = value2 != null ? value2.getEnterFee() : 0L;
        long moneyBalance = getUserService().getShortProfile().getUserProgressModel().getMoneyBalance();
        if (moneyBalance >= enterFee) {
            Log.d("CompetitionDetailsController", "Placing bet with " + value.size() + " selected bets, enterFee=" + enterFee);
            this._isPlacingBet.setValue(true);
            getPlaceBetInteractor().placeBet(new BaseCachedSharedInteractor.OnFetchedListener<PlaceBetResponseModel, Long>() { // from class: org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController$placeBet$3
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public void onFetched(FetchedResponseMessage<PlaceBetResponseModel, Long> response) {
                    CoroutineScope coroutineScope;
                    Intrinsics.checkNotNullParameter(response, "response");
                    coroutineScope = CompetitionDetailsController.this.coroutineScope;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CompetitionDetailsController$placeBet$3$onFetched$1(CompetitionDetailsController.this, response, onSuccess, onError, null), 3, null);
                }
            }, this.competitionId, new PlaceBetRequestModel(CollectionsKt.toList(value.values())));
        } else {
            Log.w("CompetitionDetailsController", "Insufficient balance to enter competition: userBalance=" + moneyBalance + ", enterFee=" + enterFee);
            onError.invoke("not_enough_money");
            EventBus.getDefault().post(new ShowNotEnoughBetcoinsVideoOfferMessage());
        }
    }
}
