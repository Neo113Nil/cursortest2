package org.betup.model.remote.entity.user.converters;

import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.details.UserBetStatsModel;

/* loaded from: classes2.dex */
public class UserBetStatsConverter {
    public static UserBetStatsModel fromNewModel(NewUserBetStatisticsModel newModel) {
        if (newModel == null) {
            return null;
        }
        UserBetStatsModel userBetStatsModel = new UserBetStatsModel();
        userBetStatsModel.setAll(newModel.getAllBets());
        userBetStatsModel.setReturned(newModel.getReturned());
        userBetStatsModel.setPending(newModel.getPending());
        userBetStatsModel.setWon(newModel.getWon());
        userBetStatsModel.setLost(newModel.getLost());
        userBetStatsModel.setHighscore(newModel.getHighScore());
        return userBetStatsModel;
    }
}
