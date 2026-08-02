package org.betup.model.remote.entity.user.converters;

import java.util.ArrayList;
import java.util.Iterator;
import org.betup.model.remote.entity.leagues.LeaguesDataModel;
import org.betup.model.remote.entity.matches.championship.specific.NewTeamModel;
import org.betup.model.remote.entity.sports.NewSport;
import org.betup.model.remote.entity.sports.SportsDataModel;
import org.betup.model.remote.entity.teams.TeamsDataModel;
import org.betup.model.remote.entity.user.NewLeagueSimple;
import org.betup.model.remote.entity.user.NewUserFavouritesModel;
import org.betup.model.remote.entity.user.UserFavouritesInfoModel;

/* loaded from: classes2.dex */
public class UserFavouritesConverter {
    public static UserFavouritesInfoModel fromNewModel(NewUserFavouritesModel newModel) {
        if (newModel == null) {
            return null;
        }
        UserFavouritesInfoModel userFavouritesInfoModel = new UserFavouritesInfoModel();
        ArrayList arrayList = new ArrayList();
        Iterator<NewSport> it = newModel.getFavouriteSports().iterator();
        while (it.hasNext()) {
            arrayList.add(convertSport(it.next()));
        }
        userFavouritesInfoModel.setFavouriteSports(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<NewLeagueSimple> it2 = newModel.getFavouriteLeagues().iterator();
        while (it2.hasNext()) {
            arrayList2.add(convertLeague(it2.next()));
        }
        userFavouritesInfoModel.setFavouriteLeagues(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator<NewTeamModel> it3 = newModel.getFavouriteTeams().iterator();
        while (it3.hasNext()) {
            arrayList3.add(convertTeam(it3.next()));
        }
        userFavouritesInfoModel.setFavouriteTeams(arrayList3);
        return userFavouritesInfoModel;
    }

    private static SportsDataModel convertSport(NewSport newSport) {
        SportsDataModel sportsDataModel = new SportsDataModel();
        sportsDataModel.setId(Integer.valueOf(newSport.getId()));
        sportsDataModel.setName(newSport.getName());
        sportsDataModel.setPhotoUrl(newSport.getPhotoUrl());
        sportsDataModel.setFavorite(newSport.isFavorite());
        return sportsDataModel;
    }

    private static LeaguesDataModel convertLeague(NewLeagueSimple newLeague) {
        LeaguesDataModel leaguesDataModel = new LeaguesDataModel();
        leaguesDataModel.setId(Integer.valueOf(newLeague.getId()));
        leaguesDataModel.setName(newLeague.getName());
        leaguesDataModel.setPhotoUrl(newLeague.getPhotoUrl());
        leaguesDataModel.setSport(null);
        return leaguesDataModel;
    }

    private static TeamsDataModel convertTeam(NewTeamModel newTeam) {
        TeamsDataModel teamsDataModel = new TeamsDataModel();
        teamsDataModel.setId(Integer.valueOf(newTeam.getId()));
        teamsDataModel.setName(newTeam.getName());
        teamsDataModel.setPhotoURL(newTeam.getPhotoUrl());
        teamsDataModel.setSport(null);
        teamsDataModel.setLastActions(null);
        return teamsDataModel;
    }
}
