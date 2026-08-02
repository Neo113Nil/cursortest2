package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import org.betup.model.remote.entity.Entity;
import org.betup.model.remote.entity.leagues.LeaguesDataModel;
import org.betup.model.remote.entity.sports.SportsDataModel;
import org.betup.model.remote.entity.teams.TeamsDataModel;
import org.betup.utils.EntityUtils;

/* loaded from: classes2.dex */
public class UserFavouritesInfoModel {

    @SerializedName("favourite_leagues")
    private List<LeaguesDataModel> favouriteLeagues;

    @SerializedName("favourite_sports")
    private List<SportsDataModel> favouriteSports;

    @SerializedName("favourite_teams")
    private List<TeamsDataModel> favouriteTeams;

    public List<SportsDataModel> getFavouriteSports() {
        return this.favouriteSports;
    }

    public void setFavouriteSports(List<SportsDataModel> favouriteSports) {
        this.favouriteSports = favouriteSports;
    }

    public List<LeaguesDataModel> getFavouriteLeagues() {
        return this.favouriteLeagues;
    }

    public void setFavouriteLeagues(List<LeaguesDataModel> favouriteLeagues) {
        this.favouriteLeagues = favouriteLeagues;
    }

    public List<TeamsDataModel> getFavouriteTeams() {
        return this.favouriteTeams;
    }

    public void setFavouriteTeams(List<TeamsDataModel> favouriteTeams) {
        this.favouriteTeams = favouriteTeams;
    }

    public List<Integer> getFavouriteTeamsIds() {
        return EntityUtils.getEntityIds(this.favouriteTeams);
    }

    public List<Integer> getFavouriteLeaguesIds() {
        return EntityUtils.getEntityIds(this.favouriteLeagues);
    }

    public List<Integer> getFavouriteSportsIds() {
        return EntityUtils.getEntityIds(this.favouriteSports);
    }

    public boolean isFavouriteSport(int id) {
        return idPresentInEntityCollection(id, this.favouriteSports);
    }

    public boolean isFavouriteTeam(int id) {
        return idPresentInEntityCollection(id, this.favouriteTeams);
    }

    public boolean isFavouriteLeague(int id) {
        return idPresentInEntityCollection(id, this.favouriteLeagues);
    }

    private boolean idPresentInEntityCollection(int id, List<? extends Entity> entities) {
        if (entities == null) {
            return false;
        }
        Iterator<? extends Entity> it = entities.iterator();
        while (it.hasNext()) {
            if (it.next().getId().intValue() == id) {
                return true;
            }
        }
        return false;
    }
}
