package org.betup.utils;

import java.util.ArrayList;
import java.util.List;
import org.betup.model.domain.RankingsInfo;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.entity.rank.RankType;
import org.betup.model.remote.entity.rank.RankUserModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.model.remote.entity.user.UserRankInfoModel;

/* loaded from: classes4.dex */
public final class RankingsInfoAggregator {
    private RankingsInfoAggregator() {
    }

    public static RankingsInfo aggregateRankInfo(List<RankUserModel> users, FullUserProfileModel userProfile, RankType rankType) {
        int rankMonth;
        double changeMonth;
        double changeMonth2;
        RankUserModel rankUserModel;
        RankingsInfo rankingsInfo = new RankingsInfo();
        ArrayList arrayList = new ArrayList(users);
        UserRankInfoModel userRankInfoModel = userProfile.getUserRankInfoModel();
        if (rankType == RankType.DAY) {
            rankMonth = userRankInfoModel.getRankDay();
            changeMonth = userRankInfoModel.getChangeDay();
            changeMonth2 = userRankInfoModel.getRoiDay();
        } else if (rankType == RankType.WEEK) {
            rankMonth = userRankInfoModel.getRankWeek();
            changeMonth = userRankInfoModel.getChangeWeek();
            changeMonth2 = userRankInfoModel.getRoiWeek();
        } else {
            rankMonth = userRankInfoModel.getRankMonth();
            changeMonth = userRankInfoModel.getChangeMonth();
            changeMonth2 = userRankInfoModel.getChangeMonth();
        }
        if (rankMonth <= users.size()) {
            rankUserModel = arrayList.get(rankMonth - 1);
            rankUserModel.setItemType(RankUserModel.ItemType.ME);
        } else {
            UserProgressModel userProgressModel = userProfile.getUserProgressModel();
            BaseUserModel userModel = userProfile.getUserModel();
            RankUserModel rankUserModel2 = new RankUserModel();
            rankUserModel2.setId(userProfile.getUserModel().getId().intValue());
            rankUserModel2.setItemType(RankUserModel.ItemType.ME);
            rankUserModel2.setChange(changeMonth);
            rankUserModel2.setRoi(changeMonth2);
            rankUserModel2.setLevel(userProgressModel.getLevel());
            rankUserModel2.setRank(rankMonth);
            rankUserModel2.setName(userModel.getName());
            rankUserModel2.setPhotoUrl(userModel.getPhotoUrl());
            rankUserModel2.setCountry(userModel.getCountry());
            rankUserModel = rankUserModel2;
        }
        RankUserModel remove = arrayList.remove(0);
        RankUserModel remove2 = arrayList.remove(0);
        RankUserModel remove3 = arrayList.remove(0);
        rankingsInfo.setMe(rankUserModel);
        rankingsInfo.setFirstUser(remove);
        rankingsInfo.setSecondUser(remove2);
        rankingsInfo.setThirdUser(remove3);
        rankingsInfo.setRanks(arrayList);
        return rankingsInfo;
    }
}
