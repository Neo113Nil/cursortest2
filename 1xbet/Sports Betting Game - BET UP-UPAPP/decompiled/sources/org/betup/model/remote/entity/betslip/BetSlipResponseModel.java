package org.betup.model.remote.entity.betslip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class BetSlipResponseModel {
    public static final int BETS_LIMIT_ACHIEVED = 40;
    public static final int BET_REMOVED = 4;
    public static final int NOT_ENOUGH_MONEY = 32;
    public static final int NOT_ENOUGH_TICKETS = 5;
    public static final int OK = 0;
    public static final int ONLY_ONE_BET_PER_MATCH = 8;

    @SerializedName("betlist")
    @Expose
    private BetListModel betListModel;

    @SerializedName("error_codes")
    @Expose
    private List<Integer> errors;

    @SerializedName("grabbed_bets")
    @Expose
    private List<GrabbedBetModel> grabbedBets;

    public BetListModel getBetListModel() {
        return this.betListModel;
    }

    public void setBetListModel(BetListModel betListModel) {
        this.betListModel = betListModel;
    }

    public List<GrabbedBetModel> getGrabbedBets() {
        return this.grabbedBets;
    }

    public List<Integer> getErrors() {
        return this.errors;
    }

    public void setErrors(List<Integer> errors) {
        this.errors = errors;
    }

    public int getError() {
        List<Integer> list = this.errors;
        if (list == null || list.size() == 0) {
            return 0;
        }
        return this.errors.get(0).intValue();
    }
}
