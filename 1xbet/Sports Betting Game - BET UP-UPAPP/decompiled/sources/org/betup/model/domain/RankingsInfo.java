package org.betup.model.domain;

import java.util.List;
import org.betup.model.remote.entity.rank.RankUserModel;

/* loaded from: classes2.dex */
public class RankingsInfo {
    private RankUserModel firstUser;

    /* renamed from: me, reason: collision with root package name */
    private RankUserModel f3861me;
    private List<RankUserModel> ranks;
    private RankUserModel secondUser;
    private RankUserModel thirdUser;

    public List<RankUserModel> getRanks() {
        return this.ranks;
    }

    public void setRanks(List<RankUserModel> ranks) {
        this.ranks = ranks;
    }

    public RankUserModel getMe() {
        return this.f3861me;
    }

    public void setMe(RankUserModel me2) {
        this.f3861me = me2;
    }

    public RankUserModel getFirstUser() {
        return this.firstUser;
    }

    public void setFirstUser(RankUserModel firstUser) {
        this.firstUser = firstUser;
    }

    public RankUserModel getSecondUser() {
        return this.secondUser;
    }

    public void setSecondUser(RankUserModel secondUser) {
        this.secondUser = secondUser;
    }

    public RankUserModel getThirdUser() {
        return this.thirdUser;
    }

    public void setThirdUser(RankUserModel thirdUser) {
        this.thirdUser = thirdUser;
    }
}
