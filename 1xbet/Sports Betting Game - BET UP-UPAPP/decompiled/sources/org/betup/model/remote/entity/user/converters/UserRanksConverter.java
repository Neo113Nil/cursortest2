package org.betup.model.remote.entity.user.converters;

import org.betup.model.remote.entity.user.NewUserRanksModel;
import org.betup.model.remote.entity.user.UserRankInfoModel;

/* loaded from: classes2.dex */
public class UserRanksConverter {
    public static UserRankInfoModel fromNewModel(NewUserRanksModel newModel) {
        if (newModel == null) {
            return null;
        }
        UserRankInfoModel userRankInfoModel = new UserRankInfoModel();
        userRankInfoModel.setRankDay(newModel.getRankDay() != null ? newModel.getRankDay().intValue() : 0);
        userRankInfoModel.setRankMonth(newModel.getRankMonth() != null ? newModel.getRankMonth().intValue() : 0);
        userRankInfoModel.setRoiDay(newModel.getWinningRateDay());
        userRankInfoModel.setRoiMonth(newModel.getWinningRateMonth());
        userRankInfoModel.setRank(0);
        userRankInfoModel.setRoi(0.0d);
        userRankInfoModel.setChange(0.0d);
        userRankInfoModel.setChangeDay(0.0d);
        userRankInfoModel.setChangeMonth(0.0d);
        userRankInfoModel.setRankWeek(0);
        userRankInfoModel.setRoiWeek(0.0d);
        userRankInfoModel.setChangeWeek(0.0d);
        return userRankInfoModel;
    }
}
