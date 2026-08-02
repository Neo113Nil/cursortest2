package org.betup.model.local.entity;

import org.betup.model.remote.entity.challenge.ChallengeInfoModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.UserFavouritesInfoModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.model.remote.entity.user.UserRankInfoModel;
import org.betup.model.remote.entity.user.details.UserBetStatsModel;

/* loaded from: classes2.dex */
public class FullUserProfileModel {
    private ChallengeInfoModel challengeInfoModel;
    private UserBetStatsModel userBetStatsModel;
    private UserFavouritesInfoModel userFavouritesInfoModel;
    private BaseUserModel userModel;
    private UserProgressModel userProgressModel;
    private UserRankInfoModel userRankInfoModel;

    public boolean hasFavoriteLeagues() {
        return this.userFavouritesInfoModel.getFavouriteLeagues() != null && this.userFavouritesInfoModel.getFavouriteLeagues().size() > 0;
    }

    public boolean hasFavoriteSports() {
        return this.userFavouritesInfoModel.getFavouriteSports() != null && this.userFavouritesInfoModel.getFavouriteSports().size() > 0;
    }

    public boolean hasFavoriteTeams() {
        return this.userFavouritesInfoModel.getFavouriteTeams() != null && this.userFavouritesInfoModel.getFavouriteTeams().size() > 0;
    }

    public BaseUserModel getUserModel() {
        return this.userModel;
    }

    public void setUserModel(BaseUserModel userModel) {
        this.userModel = userModel;
    }

    public UserProgressModel getUserProgressModel() {
        return this.userProgressModel;
    }

    public void setUserProgressModel(UserProgressModel userProgressModel) {
        this.userProgressModel = userProgressModel;
    }

    public UserRankInfoModel getUserRankInfoModel() {
        return this.userRankInfoModel;
    }

    public void setUserRankInfoModel(UserRankInfoModel userRankInfoModel) {
        this.userRankInfoModel = userRankInfoModel;
    }

    public ChallengeInfoModel getChallengeInfoModel() {
        return this.challengeInfoModel;
    }

    public void setChallengeInfoModel(ChallengeInfoModel challengeInfoModel) {
        this.challengeInfoModel = challengeInfoModel;
    }

    public UserBetStatsModel getUserBetStatsModel() {
        return this.userBetStatsModel;
    }

    public void setUserBetStatsModel(UserBetStatsModel userBetStatsModel) {
        this.userBetStatsModel = userBetStatsModel;
    }

    public UserFavouritesInfoModel getUserFavouritesInfoModel() {
        return this.userFavouritesInfoModel;
    }

    public void setUserFavouritesInfoModel(UserFavouritesInfoModel userFavouritesInfoModel) {
        this.userFavouritesInfoModel = userFavouritesInfoModel;
    }
}
