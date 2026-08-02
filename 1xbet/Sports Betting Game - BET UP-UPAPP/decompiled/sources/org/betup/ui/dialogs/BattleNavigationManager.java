package org.betup.ui.dialogs;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.ChallengeAcceptDialogFragment;
import org.betup.ui.dialogs.events.BattleBackToBetSelectionEvent;
import org.betup.ui.dialogs.events.BattleBackToBetsEvent;
import org.betup.ui.dialogs.events.BattleBackToLeaguesEvent;
import org.betup.ui.dialogs.events.BattleBackToMatchesEvent;
import org.betup.ui.dialogs.events.BattleBackToSportsEvent;
import org.betup.ui.dialogs.events.BattleCreateEvent;
import org.betup.ui.dialogs.events.BattleLeagueSelectedEvent;
import org.betup.ui.dialogs.events.BattleMatchSelectedEvent;
import org.betup.ui.dialogs.events.BattleSportSelectedEvent;
import org.betup.ui.dialogs.events.FollowerSelectedForBattleEvent;
import org.betup.ui.dialogs.events.OpenBetSelectionEvent;
import org.betup.ui.dialogs.events.OpenChallengeAcceptDialogEvent;
import org.betup.ui.dialogs.events.OpenChallengePreviewDialog;
import org.betup.ui.dialogs.events.OpenCreateBattleDialogEvent;
import org.betup.ui.dialogs.events.OpenFollowersDialogForBattleEvent;
import org.betup.ui.fragment.bets.sheet.BettingSheetDialog;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleNavigationManager.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\nH\u0002J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020#H\u0002J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020#H\u0002J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020#H\u0002J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0007H\u0002J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0007H\u0002J\u0010\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\nH\u0002J\u0017\u00101\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u00102J\b\u00103\u001a\u00020\u0012H\u0002J\b\u00104\u001a\u00020\u0012H\u0002J\b\u00105\u001a\u00020\u0012H\u0002J\u0010\u00106\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u000207H\u0007J\u0010\u00108\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u000209H\u0007J\u0010\u0010:\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020;H\u0007J\u0010\u0010<\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020=H\u0007J\u0010\u0010>\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020?H\u0007J\u0010\u0010@\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020AH\u0007J\b\u0010B\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lorg/betup/ui/dialogs/BattleNavigationManager;", "", "activity", "Lorg/betup/ui/MainActivity;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/MainActivity;)V", "selectedSportId", "", "selectedLeagueId", "selectedMatchId", "", "userId", "Ljava/lang/Long;", "followerPhoto", "", "dialogStack", "", "destroy", "", "onOpenCreateBattleDialog", "event", "Lorg/betup/ui/dialogs/events/OpenCreateBattleDialogEvent;", "onOpenFollowersDialogForBattle", "Lorg/betup/ui/dialogs/events/OpenFollowersDialogForBattleEvent;", "onOpenChallengeAcceptDialog", "Lorg/betup/ui/dialogs/events/OpenChallengeAcceptDialogEvent;", "onOpenChallengePreviewDialog", "Lorg/betup/ui/dialogs/events/OpenChallengePreviewDialog;", "onSportSelected", "Lorg/betup/ui/dialogs/events/BattleSportSelectedEvent;", "onLeagueSelected", "Lorg/betup/ui/dialogs/events/BattleLeagueSelectedEvent;", "onMatchSelected", "Lorg/betup/ui/dialogs/events/BattleMatchSelectedEvent;", "onBattleCreate", "Lorg/betup/ui/dialogs/events/BattleCreateEvent;", "onFollowerSelectedForBattle", "Lorg/betup/ui/dialogs/events/FollowerSelectedForBattleEvent;", "openCreateBattleDialogWithUserId", "selectedUserId", "handleBattleAcceptance", "handlePrivateChallengeCreation", "handlePublicChallengeCreation", "setSelectedSportId", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "setSelectedLeagueId", "leagueId", "setSelectedMatchId", "matchId", "setUserId", "(Ljava/lang/Long;)V", "openLeagueSelection", "openMatchSelection", "openBetSelection", "onBattleBackToSports", "Lorg/betup/ui/dialogs/events/BattleBackToSportsEvent;", "onBattleBackToLeagues", "Lorg/betup/ui/dialogs/events/BattleBackToLeaguesEvent;", "onBattleBackToMatches", "Lorg/betup/ui/dialogs/events/BattleBackToMatchesEvent;", "onBattleBackToBets", "Lorg/betup/ui/dialogs/events/BattleBackToBetsEvent;", "onBattleBackToBetSelection", "Lorg/betup/ui/dialogs/events/BattleBackToBetSelectionEvent;", "onOpenBetSelection", "Lorg/betup/ui/dialogs/events/OpenBetSelectionEvent;", "closeCurrentDialog", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BattleNavigationManager {
    public static final int $stable = 8;
    private final MainActivity activity;
    private final List<String> dialogStack;
    private String followerPhoto;
    private int selectedLeagueId;
    private long selectedMatchId;
    private int selectedSportId;
    private Long userId;

    public BattleNavigationManager(MainActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.dialogStack = new ArrayList();
        EventBus.getDefault().register(this);
    }

    public final void destroy() {
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onOpenCreateBattleDialog(OpenCreateBattleDialogEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Opening CreateBattleDialogFragment with userId: " + event.getUserId());
        Long userId = event.getUserId();
        if (userId != null) {
            this.userId = Long.valueOf(userId.longValue());
        }
        this.followerPhoto = event.getFollowerPhotoUrl();
        CreateBattleDialogFragment.INSTANCE.newInstance(event.getUserId()).show(this.activity.getSupportFragmentManager(), "createBattleDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onOpenFollowersDialogForBattle(OpenFollowersDialogForBattleEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Opening FollowersDialog for battle with userId: " + event.getUserId());
        FollowersDialog.INSTANCE.newInstance((int) event.getUserId(), 0, true).show(this.activity.getSupportFragmentManager(), "followersDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onOpenChallengeAcceptDialog(OpenChallengeAcceptDialogEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Opening ChallengeAcceptDialogFragment: challengeId=" + event.getChallengeId() + ", matchId=" + event.getMatchId() + ", userId=" + event.getUserId());
        if (event.getUserId() == null) {
            Log.d("BattleNavigationManager", "Resetting userId and followerPhoto for new battle (no user selected)");
            this.userId = null;
            this.followerPhoto = null;
        } else {
            this.userId = event.getUserId();
        }
        ChallengeAcceptDialogFragment.Companion companion = ChallengeAcceptDialogFragment.INSTANCE;
        long matchId = event.getMatchId();
        Long userId = event.getUserId();
        long betId = event.getBetId();
        ChallengeAcceptDialogFragment newInstance = companion.newInstance(Long.valueOf(matchId), userId, Long.valueOf(betId), event.getBetName(), event.getGroupName(), event.getVarietyName(), event.getUserId() != null ? this.followerPhoto : null, event.getAmount(), Double.valueOf(event.getCoefficient()));
        Bundle arguments = newInstance.getArguments();
        if (arguments != null) {
            arguments.putInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, this.selectedSportId);
            arguments.putInt("leagueId", this.selectedLeagueId);
        }
        newInstance.show(this.activity.getSupportFragmentManager(), "challengeAcceptDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onOpenChallengePreviewDialog(OpenChallengePreviewDialog event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ChallengePreviewNewDialogFragment.INSTANCE.newInstance(event.getChallengeId(), event.getChallengeIds()).show(this.activity.getSupportFragmentManager(), "challengePreviewDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onSportSelected(BattleSportSelectedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Sport selected: " + event.getSportId() + ", userId: " + event.getUserId());
        setSelectedSportId(event.getSportId());
        setUserId(event.getUserId());
        Log.d("BattleNavigationManager", "Calling openLeagueSelection()");
        openLeagueSelection();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onLeagueSelected(BattleLeagueSelectedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "League selected: " + event.getLeagueId() + ", userId: " + event.getUserId());
        setSelectedLeagueId(event.getLeagueId());
        setUserId(event.getUserId());
        openMatchSelection();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMatchSelected(BattleMatchSelectedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Match selected: " + event.getMatchId() + ", userId: " + event.getUserId());
        setSelectedMatchId(event.getMatchId());
        setUserId(event.getUserId());
        openBetSelection();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onBattleCreate(BattleCreateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Battle creation completed with " + event.getSelectedBetIds().size() + " selected bets, matchId: " + event.getMatchId() + ", battleId: " + event.getBattleId() + ", userId: " + event.getUserId());
        if (event.getBattleId() != null) {
            handleBattleAcceptance(event);
        } else if (event.getUserId() != null) {
            handlePrivateChallengeCreation(event);
        } else {
            handlePublicChallengeCreation(event);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onFollowerSelectedForBattle(FollowerSelectedForBattleEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Received FollowerSelectedForBattleEvent: " + event);
        this.userId = Long.valueOf(event.getFollowerId());
        this.followerPhoto = event.getFollowerPhotoUrl();
        Fragment findFragmentByTag = this.activity.getSupportFragmentManager().findFragmentByTag("followersDialog");
        if (findFragmentByTag != null && (findFragmentByTag instanceof FollowersDialog)) {
            ((FollowersDialog) findFragmentByTag).dismiss();
        }
        Fragment findFragmentByTag2 = this.activity.getSupportFragmentManager().findFragmentByTag("challengeAcceptDialog");
        if (findFragmentByTag2 != null && (findFragmentByTag2 instanceof ChallengeAcceptDialogFragment)) {
            Log.d("BattleNavigationManager", "ChallengeAcceptDialogFragment already open, userId will be updated via event");
            return;
        }
        if (this.activity.getSupportFragmentManager().findFragmentByTag("BettingSheetDialog") != null || this.activity.getSupportFragmentManager().findFragmentByTag("bettingSheetDialog") != null) {
            Log.d("BattleNavigationManager", "BettingSheetDialog open, opponent handled by Quick Bet sheet");
            return;
        }
        Long l = this.userId;
        if (l != null) {
            long longValue = l.longValue();
            Log.d("BattleNavigationManager", "Opening CreateBattleDialog after follower selection: " + longValue);
            openCreateBattleDialogWithUserId(longValue);
        }
    }

    private final void openCreateBattleDialogWithUserId(long selectedUserId) {
        Log.d("BattleNavigationManager", "Opening CreateBattleDialogFragment with selected userId: " + selectedUserId);
        CreateBattleDialogFragment.INSTANCE.newInstance(Long.valueOf(selectedUserId)).show(this.activity.getSupportFragmentManager(), "createBattleDialog");
    }

    private final void handleBattleAcceptance(BattleCreateEvent event) {
        Log.d("BattleNavigationManager", "Accepting battle: " + event.getBattleId());
    }

    private final void handlePrivateChallengeCreation(BattleCreateEvent event) {
        Log.d("BattleNavigationManager", "Creating private challenge for user: " + event.getUserId());
    }

    private final void handlePublicChallengeCreation(BattleCreateEvent event) {
        Log.d("BattleNavigationManager", "Creating public challenge");
        new BettingSheetDialog().show(this.activity.getSupportFragmentManager(), "bettingSheetDialog");
    }

    private final void setSelectedSportId(int sportId) {
        this.selectedSportId = sportId;
    }

    private final void setSelectedLeagueId(int leagueId) {
        this.selectedLeagueId = leagueId;
    }

    private final void setSelectedMatchId(long matchId) {
        this.selectedMatchId = matchId;
    }

    private final void setUserId(Long userId) {
        this.userId = userId;
    }

    private final void openLeagueSelection() {
        Log.d("BattleNavigationManager", "Opening league selection for sport: " + this.selectedSportId + ", userId: " + this.userId);
        SelectLeagueDialogFragment selectLeagueDialogFragment = new SelectLeagueDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, this.selectedSportId);
        Long l = this.userId;
        if (l != null) {
            bundle.putLong("userId", l.longValue());
        }
        bundle.putBoolean("forChallenges", true);
        selectLeagueDialogFragment.setArguments(bundle);
        Log.d("BattleNavigationManager", "Showing SelectLeagueDialogFragment");
        selectLeagueDialogFragment.show(this.activity.getSupportFragmentManager(), "selectLeagueDialog");
    }

    private final void openMatchSelection() {
        Log.d("BattleNavigationManager", "Opening match selection for league: " + this.selectedLeagueId + ", sportId: " + this.selectedSportId + ", userId: " + this.userId);
        SelectMatchDialogFragment selectMatchDialogFragment = new SelectMatchDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("leagueId", this.selectedLeagueId);
        bundle.putInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, this.selectedSportId);
        Long l = this.userId;
        if (l != null) {
            bundle.putLong("userId", l.longValue());
        }
        selectMatchDialogFragment.setArguments(bundle);
        selectMatchDialogFragment.show(this.activity.getSupportFragmentManager(), "selectMatchDialog");
    }

    private final void openBetSelection() {
        Log.d("BattleNavigationManager", "Opening bet selection for match: " + this.selectedMatchId + ", leagueId: " + this.selectedLeagueId + ", sportId: " + this.selectedSportId + ", userId: " + this.userId);
        SelectBetDialogFragment selectBetDialogFragment = new SelectBetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("matchId", this.selectedMatchId);
        bundle.putInt("leagueId", this.selectedLeagueId);
        bundle.putInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, this.selectedSportId);
        Long l = this.userId;
        if (l != null) {
            bundle.putLong("userId", l.longValue());
        }
        selectBetDialogFragment.setArguments(bundle);
        selectBetDialogFragment.show(this.activity.getSupportFragmentManager(), "selectBetDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onBattleBackToSports(BattleBackToSportsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Navigating back to sports selection");
        closeCurrentDialog();
        CreateBattleDialogFragment.INSTANCE.newInstance(event.getUserId()).show(this.activity.getSupportFragmentManager(), "createBattleDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onBattleBackToLeagues(BattleBackToLeaguesEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Navigating back to league selection");
        closeCurrentDialog();
        SelectLeagueDialogFragment selectLeagueDialogFragment = new SelectLeagueDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, event.getSportId());
        Long userId = event.getUserId();
        if (userId != null) {
            bundle.putLong("userId", userId.longValue());
        }
        selectLeagueDialogFragment.setArguments(bundle);
        selectLeagueDialogFragment.show(this.activity.getSupportFragmentManager(), "selectLeagueDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onBattleBackToMatches(BattleBackToMatchesEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Navigating back to match selection");
        closeCurrentDialog();
        SelectMatchDialogFragment selectMatchDialogFragment = new SelectMatchDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("leagueId", event.getLeagueId());
        bundle.putInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, event.getSportId());
        Long userId = event.getUserId();
        if (userId != null) {
            bundle.putLong("userId", userId.longValue());
        }
        selectMatchDialogFragment.setArguments(bundle);
        selectMatchDialogFragment.show(this.activity.getSupportFragmentManager(), "selectMatchDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onBattleBackToBets(BattleBackToBetsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Navigating back to bet selection");
        closeCurrentDialog();
        SelectBetDialogFragment selectBetDialogFragment = new SelectBetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("matchId", event.getMatchId());
        bundle.putInt("leagueId", event.getLeagueId());
        bundle.putInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, event.getSportId());
        Long userId = event.getUserId();
        if (userId != null) {
            bundle.putLong("userId", userId.longValue());
        }
        selectBetDialogFragment.setArguments(bundle);
        selectBetDialogFragment.show(this.activity.getSupportFragmentManager(), "selectBetDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onBattleBackToBetSelection(BattleBackToBetSelectionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Navigating back to bet selection from challenge accept");
        closeCurrentDialog();
        SelectBetDialogFragment selectBetDialogFragment = new SelectBetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("matchId", event.getMatchId());
        bundle.putInt("leagueId", event.getLeagueId());
        bundle.putInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, event.getSportId());
        Long userId = event.getUserId();
        if (userId != null) {
            bundle.putLong("userId", userId.longValue());
        }
        selectBetDialogFragment.setArguments(bundle);
        selectBetDialogFragment.show(this.activity.getSupportFragmentManager(), "selectBetDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onOpenBetSelection(OpenBetSelectionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("BattleNavigationManager", "Opening bet selection from MatchDetails: matchId=" + event.getMatchId() + ", battleId=" + event.getBattleId() + ", userId=" + event.getUserId());
        this.selectedMatchId = event.getMatchId();
        Long userId = event.getUserId();
        if (userId != null) {
            this.userId = Long.valueOf(userId.longValue());
        }
        String followerPhotoUrl = event.getFollowerPhotoUrl();
        if (followerPhotoUrl != null) {
            this.followerPhoto = followerPhotoUrl;
        }
        SelectBetDialogFragment selectBetDialogFragment = new SelectBetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("matchId", event.getMatchId());
        Long battleId = event.getBattleId();
        if (battleId != null) {
            bundle.putLong("battleId", battleId.longValue());
        }
        Long userId2 = event.getUserId();
        if (userId2 != null) {
            bundle.putLong("userId", userId2.longValue());
        }
        String followerPhotoUrl2 = event.getFollowerPhotoUrl();
        if (followerPhotoUrl2 != null) {
            bundle.putString("followerPhotoUrl", followerPhotoUrl2);
        }
        Long rematchBuyIn = event.getRematchBuyIn();
        if (rematchBuyIn != null) {
            bundle.putLong("rematchBuyIn", rematchBuyIn.longValue());
        }
        selectBetDialogFragment.setArguments(bundle);
        Log.d("BattleNavigationManager", "Showing SelectBetDialogFragment");
        selectBetDialogFragment.show(this.activity.getSupportFragmentManager(), "selectBetDialog");
    }

    private final void closeCurrentDialog() {
        Fragment findFragmentByTag = this.activity.getSupportFragmentManager().findFragmentByTag("selectBetDialog");
        if (findFragmentByTag != null && (findFragmentByTag instanceof SelectBetDialogFragment)) {
            ((SelectBetDialogFragment) findFragmentByTag).dismiss();
        }
        Fragment findFragmentByTag2 = this.activity.getSupportFragmentManager().findFragmentByTag("selectMatchDialog");
        if (findFragmentByTag2 != null && (findFragmentByTag2 instanceof SelectMatchDialogFragment)) {
            ((SelectMatchDialogFragment) findFragmentByTag2).dismiss();
        }
        Fragment findFragmentByTag3 = this.activity.getSupportFragmentManager().findFragmentByTag("selectLeagueDialog");
        if (findFragmentByTag3 != null && (findFragmentByTag3 instanceof SelectLeagueDialogFragment)) {
            ((SelectLeagueDialogFragment) findFragmentByTag3).dismiss();
        }
        Fragment findFragmentByTag4 = this.activity.getSupportFragmentManager().findFragmentByTag("createBattleDialog");
        if (findFragmentByTag4 == null || !(findFragmentByTag4 instanceof CreateBattleDialogFragment)) {
            return;
        }
        ((CreateBattleDialogFragment) findFragmentByTag4).dismiss();
    }
}
