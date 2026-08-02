package org.betup.model.remote.entity.matches.championship.specific;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.bets.BetGroupModel;
import org.betup.model.remote.entity.bets.BetGroupSectionModel;
import org.betup.model.remote.entity.bets.BetSectionModel;
import org.betup.model.remote.entity.bets.SubMatchModel;
import org.betup.model.remote.entity.leagues.LeaguesDataModel;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.details.MatchDetailsAwayTeamModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetGroupModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsHomeTeamModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsLeagueModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsSportModel;
import org.betup.model.remote.entity.matches.topmatches.HotMatchesResponseModel;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.utils.BetGroupsSortingUtils;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewToOldModelConverter.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020!H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001eH\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020+H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u0010-\u001a\u000200H\u0002J\u001c\u00101\u001a\b\u0012\u0004\u0012\u0002020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002030\u001eH\u0002J\u0010\u00104\u001a\u0002022\u0006\u00105\u001a\u000203H\u0002J&\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u0002032\u0006\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020'J\u000e\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020>¨\u0006?"}, d2 = {"Lorg/betup/model/remote/entity/matches/championship/specific/NewToOldModelConverter;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "convertNewMatchesToOld", "Lorg/betup/model/remote/entity/matches/championship/specific/MatchesForLeagueModel;", "newMatches", "Lorg/betup/model/remote/entity/matches/championship/specific/NewMatchesForLeagueModel;", "convertNewMatchToOld", "Lorg/betup/model/remote/entity/matches/championship/specific/ListedMatchModel;", "newMatch", "Lorg/betup/model/remote/entity/matches/championship/specific/NewListedMatchModel;", "convertNewMatchDetailsToOld", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsDataModel;", "Lorg/betup/model/remote/entity/matches/championship/specific/NewMatchDetailsDataModel;", "convertNewLeagueToOld", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsLeagueModel;", "newLeague", "Lorg/betup/model/remote/entity/matches/championship/specific/NewLeagueModel;", "convertNewTeamToOldAway", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsAwayTeamModel;", "newTeam", "Lorg/betup/model/remote/entity/matches/championship/specific/NewTeamModel;", "convertNewTeamToOldHome", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsHomeTeamModel;", "convertNewSportToOld", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsSportModel;", "newSport", "Lorg/betup/model/remote/entity/matches/championship/specific/NewSportModel;", "convertNewBetsToOld", "", "Lorg/betup/model/remote/entity/bets/BetSectionModel;", "newBets", "Lorg/betup/model/remote/entity/matches/championship/specific/NewBetSectionModel;", "convertNewBetSectionToOld", "newBetSection", "convertNewVarietyToOldSubMatch", "Lorg/betup/model/remote/entity/bets/SubMatchModel;", "newVariety", "Lorg/betup/model/remote/entity/matches/championship/specific/NewVarietyModel;", "convertNewGroupsToOld", "Lorg/betup/model/remote/entity/bets/BetGroupSectionModel;", "newGroups", "Lorg/betup/model/remote/entity/matches/championship/specific/NewBetGroupModel;", "convertNewGroupToOld", "newGroup", "convertNewGroupToOldGroup", "Lorg/betup/model/remote/entity/bets/BetGroupModel;", "Lorg/betup/model/remote/entity/matches/championship/specific/NewGroupModel;", "convertNewBetsToOldBets", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsBetDataModel;", "Lorg/betup/model/remote/entity/matches/championship/specific/NewBetModel;", "convertNewBetToOld", "newBet", "buildBetModelForClick", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", "listedMatch", "bet", "group", "variety", "convertHotMatchesToOld", "hotMatches", "Lorg/betup/model/remote/entity/matches/topmatches/HotMatchesResponseModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewToOldModelConverter {
    public static final int $stable = 0;
    public static final NewToOldModelConverter INSTANCE = new NewToOldModelConverter();

    private NewToOldModelConverter() {
    }

    public final MatchesForLeagueModel convertNewMatchesToOld(NewMatchesForLeagueModel newMatches) {
        NewMatchDetailsDataModel match;
        Intrinsics.checkNotNullParameter(newMatches, "newMatches");
        List<NewListedMatchModel> items = newMatches.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convertNewMatchToOld((NewListedMatchModel) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        NewListedMatchModel newListedMatchModel = (NewListedMatchModel) CollectionsKt.firstOrNull((List) newMatches.getItems());
        NewLeagueModel league = (newListedMatchModel == null || (match = newListedMatchModel.getMatch()) == null) ? null : match.getLeague();
        SpecificChampResponseModel specificChampResponseModel = new SpecificChampResponseModel();
        specificChampResponseModel.setMatches(arrayList2);
        LeaguesDataModel leaguesDataModel = new LeaguesDataModel();
        if (league != null) {
            leaguesDataModel.setId(Integer.valueOf(league.getId()));
            leaguesDataModel.setName(league.getName());
            leaguesDataModel.setPhotoUrl(league.getPhotoUrl());
        } else {
            leaguesDataModel.setId(0);
            leaguesDataModel.setName("Unknown League");
            leaguesDataModel.setPhotoUrl("https://www.betup.org/uploads_api/league/default.png");
        }
        specificChampResponseModel.setLeague(leaguesDataModel);
        MatchesForLeagueModel matchesForLeagueModel = new MatchesForLeagueModel();
        matchesForLeagueModel.setResponse(specificChampResponseModel);
        matchesForLeagueModel.setMeta(null);
        return matchesForLeagueModel;
    }

    private final ListedMatchModel convertNewMatchToOld(NewListedMatchModel newMatch) {
        ListedMatchModel listedMatchModel = new ListedMatchModel();
        NewToOldModelConverter newToOldModelConverter = INSTANCE;
        listedMatchModel.setMatch(newToOldModelConverter.convertNewMatchDetailsToOld(newMatch.getMatch()));
        listedMatchModel.setBetSections(newToOldModelConverter.convertNewBetsToOld(newMatch.getBets()));
        return listedMatchModel;
    }

    private final MatchDetailsDataModel convertNewMatchDetailsToOld(NewMatchDetailsDataModel newMatch) {
        MatchState matchState;
        MatchDetailsDataModel matchDetailsDataModel = new MatchDetailsDataModel();
        matchDetailsDataModel.setId(Integer.valueOf((int) newMatch.getId()));
        NewToOldModelConverter newToOldModelConverter = INSTANCE;
        matchDetailsDataModel.setLeague(newToOldModelConverter.convertNewLeagueToOld(newMatch.getLeague()));
        matchDetailsDataModel.setAwayTeam(newToOldModelConverter.convertNewTeamToOldAway(newMatch.getAwayTeam()));
        matchDetailsDataModel.setHomeTeam(newToOldModelConverter.convertNewTeamToOldHome(newMatch.getHomeTeam()));
        matchDetailsDataModel.setSport(newToOldModelConverter.convertNewSportToOld(newMatch.getSport()));
        matchDetailsDataModel.setScoreAway(Float.valueOf(newMatch.getScoreAway()));
        matchDetailsDataModel.setScoreHome(Float.valueOf(newMatch.getScoreHome()));
        matchDetailsDataModel.setDate(newMatch.getDate());
        int matchState2 = newMatch.getMatchState();
        if (matchState2 == 1) {
            matchState = MatchState.SCHEDULED;
        } else if (matchState2 == 2) {
            matchState = MatchState.LIVE;
        } else if (matchState2 == 3) {
            matchState = MatchState.FINISHED;
        } else {
            matchState = MatchState.SCHEDULED;
        }
        matchDetailsDataModel.setState(matchState);
        matchDetailsDataModel.setCurrentPeriod(newMatch.getCurrentPeriod());
        matchDetailsDataModel.setCurrentTime(newMatch.getCurrentTime());
        return matchDetailsDataModel;
    }

    private final MatchDetailsLeagueModel convertNewLeagueToOld(NewLeagueModel newLeague) {
        MatchDetailsLeagueModel matchDetailsLeagueModel = new MatchDetailsLeagueModel();
        matchDetailsLeagueModel.setId(Integer.valueOf(newLeague.getId()));
        matchDetailsLeagueModel.setName(newLeague.getName());
        matchDetailsLeagueModel.setPhotoUrl(newLeague.getPhotoUrl());
        return matchDetailsLeagueModel;
    }

    private final MatchDetailsAwayTeamModel convertNewTeamToOldAway(NewTeamModel newTeam) {
        MatchDetailsAwayTeamModel matchDetailsAwayTeamModel = new MatchDetailsAwayTeamModel();
        matchDetailsAwayTeamModel.setId(Integer.valueOf(newTeam.getId()));
        matchDetailsAwayTeamModel.setName(newTeam.getName());
        matchDetailsAwayTeamModel.setPhotoUrl(newTeam.getPhotoUrl());
        return matchDetailsAwayTeamModel;
    }

    private final MatchDetailsHomeTeamModel convertNewTeamToOldHome(NewTeamModel newTeam) {
        MatchDetailsHomeTeamModel matchDetailsHomeTeamModel = new MatchDetailsHomeTeamModel();
        matchDetailsHomeTeamModel.setId(Integer.valueOf(newTeam.getId()));
        matchDetailsHomeTeamModel.setName(newTeam.getName());
        matchDetailsHomeTeamModel.setPhotoUrl(newTeam.getPhotoUrl());
        return matchDetailsHomeTeamModel;
    }

    private final MatchDetailsSportModel convertNewSportToOld(NewSportModel newSport) {
        MatchDetailsSportModel matchDetailsSportModel = new MatchDetailsSportModel();
        matchDetailsSportModel.setId(Integer.valueOf(newSport.getId()));
        matchDetailsSportModel.setName(newSport.getName());
        matchDetailsSportModel.setPhotoUrl(newSport.getPhotoUrl());
        return matchDetailsSportModel;
    }

    private final List<BetSectionModel> convertNewBetsToOld(List<NewBetSectionModel> newBets) {
        List<NewBetSectionModel> list = newBets;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convertNewBetSectionToOld((NewBetSectionModel) it.next()));
        }
        return arrayList;
    }

    private final BetSectionModel convertNewBetSectionToOld(NewBetSectionModel newBetSection) {
        BetSectionModel betSectionModel = new BetSectionModel();
        NewToOldModelConverter newToOldModelConverter = INSTANCE;
        betSectionModel.setSection(newToOldModelConverter.convertNewVarietyToOldSubMatch(newBetSection.getVariety()));
        betSectionModel.setGroups(newToOldModelConverter.convertNewGroupsToOld(BetGroupsSortingUtils.INSTANCE.sortNewBetGroups(newBetSection.getGroups())));
        return betSectionModel;
    }

    private final SubMatchModel convertNewVarietyToOldSubMatch(NewVarietyModel newVariety) {
        SubMatchModel subMatchModel = new SubMatchModel();
        subMatchModel.setId((int) newVariety.getId());
        subMatchModel.setScoreAway(newVariety.getScoreAway());
        subMatchModel.setScoreHome(newVariety.getScoreHome());
        subMatchModel.setName(newVariety.getBetsGameType());
        return subMatchModel;
    }

    private final List<BetGroupSectionModel> convertNewGroupsToOld(List<NewBetGroupModel> newGroups) {
        List<NewBetGroupModel> list = newGroups;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convertNewGroupToOld((NewBetGroupModel) it.next()));
        }
        return arrayList;
    }

    private final BetGroupSectionModel convertNewGroupToOld(NewBetGroupModel newGroup) {
        BetGroupSectionModel betGroupSectionModel = new BetGroupSectionModel();
        NewToOldModelConverter newToOldModelConverter = INSTANCE;
        betGroupSectionModel.setGroup(newToOldModelConverter.convertNewGroupToOldGroup(newGroup.getGroup()));
        betGroupSectionModel.setBets(newToOldModelConverter.convertNewBetsToOldBets(newGroup.getBets()));
        return betGroupSectionModel;
    }

    private final BetGroupModel convertNewGroupToOldGroup(NewGroupModel newGroup) {
        BetGroupModel betGroupModel = new BetGroupModel();
        betGroupModel.setId(newGroup.getId());
        betGroupModel.setLevel(newGroup.getLevel());
        betGroupModel.setName(newGroup.getName());
        betGroupModel.setAvailable(newGroup.getUserAvailable());
        betGroupModel.setDisplayColumns(newGroup.getDisplayColumns());
        betGroupModel.setExpToNextLevel(newGroup.getExpToNextLevel());
        betGroupModel.setLevelStartExp(newGroup.getLevelStartExp());
        return betGroupModel;
    }

    private final List<MatchDetailsBetDataModel> convertNewBetsToOldBets(List<NewBetModel> newBets) {
        List<NewBetModel> list = newBets;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convertNewBetToOld((NewBetModel) it.next()));
        }
        return arrayList;
    }

    private final MatchDetailsBetDataModel convertNewBetToOld(NewBetModel newBet) {
        MatchDetailsBetDataModel matchDetailsBetDataModel = new MatchDetailsBetDataModel();
        matchDetailsBetDataModel.setGrabbedBetId(Long.valueOf(newBet.getGrabbedBetId()));
        matchDetailsBetDataModel.setGrabbedCoeficient(newBet.getGrabbedCoeficient());
        matchDetailsBetDataModel.setBetTypeId(Integer.valueOf(newBet.getBetTypeId()));
        matchDetailsBetDataModel.setIsAvailable(Boolean.valueOf(newBet.isAvailable()));
        matchDetailsBetDataModel.setBetName(newBet.getBetName());
        return matchDetailsBetDataModel;
    }

    public final BetModel buildBetModelForClick(NewListedMatchModel listedMatch, NewBetModel bet, NewGroupModel group, NewVarietyModel variety) {
        Intrinsics.checkNotNullParameter(listedMatch, "listedMatch");
        Intrinsics.checkNotNullParameter(bet, "bet");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(variety, "variety");
        MatchDetailsDataModel convertNewMatchDetailsToOld = convertNewMatchDetailsToOld(listedMatch.getMatch());
        SubMatchModel convertNewVarietyToOldSubMatch = convertNewVarietyToOldSubMatch(variety);
        MatchDetailsBetDataModel convertNewBetToOld = convertNewBetToOld(bet);
        MatchDetailsBetGroupModel matchDetailsBetGroupModel = new MatchDetailsBetGroupModel();
        matchDetailsBetGroupModel.setId(Integer.valueOf(group.getId()));
        matchDetailsBetGroupModel.setName(group.getName());
        matchDetailsBetGroupModel.setAvailable(group.getUserAvailable());
        matchDetailsBetGroupModel.setDisplayColumns(group.getDisplayColumns());
        convertNewBetToOld.setBetGroup(matchDetailsBetGroupModel);
        convertNewBetToOld.setSubMatch(convertNewVarietyToOldSubMatch);
        return new BetModel(convertNewBetToOld, convertNewMatchDetailsToOld, convertNewVarietyToOldSubMatch);
    }

    public final MatchesForLeagueModel convertHotMatchesToOld(HotMatchesResponseModel hotMatches) {
        Intrinsics.checkNotNullParameter(hotMatches, "hotMatches");
        List<NewListedMatchModel> items = hotMatches.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convertNewMatchToOld((NewListedMatchModel) it.next()));
        }
        SpecificChampResponseModel specificChampResponseModel = new SpecificChampResponseModel();
        specificChampResponseModel.setMatches(arrayList);
        LeaguesDataModel leaguesDataModel = new LeaguesDataModel();
        leaguesDataModel.setId(0);
        leaguesDataModel.setName("Top Matches");
        leaguesDataModel.setPhotoUrl("https://www.betup.org/uploads_api/league/default.png");
        specificChampResponseModel.setLeague(leaguesDataModel);
        MatchesForLeagueModel matchesForLeagueModel = new MatchesForLeagueModel();
        matchesForLeagueModel.setResponse(specificChampResponseModel);
        matchesForLeagueModel.setMeta(null);
        return matchesForLeagueModel;
    }
}
