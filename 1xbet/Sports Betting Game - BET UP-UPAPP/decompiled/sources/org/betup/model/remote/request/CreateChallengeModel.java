package org.betup.model.remote.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;

/* loaded from: classes2.dex */
public class CreateChallengeModel {
    private BetModel betModel;

    @SerializedName("grabbed_bet_ids")
    @Expose
    private long[] grabbedBetIds;

    @SerializedName("invited_users")
    @Expose
    private int[] invitedUsers;

    @SerializedName("isPrivate")
    @Expose
    private boolean isPrivate;

    @SerializedName("moneyPlaced")
    @Expose
    private long moneyPlaced;

    public static CreateChallengeModel createPublicChallenge(long betId, long moneyPlaced) {
        CreateChallengeModel createChallengeModel = new CreateChallengeModel();
        createChallengeModel.setInvitedUsers(new int[0]);
        createChallengeModel.setGrabbedBetIds(new long[]{betId});
        createChallengeModel.setMoneyPlaced(moneyPlaced);
        createChallengeModel.setPrivate(false);
        return createChallengeModel;
    }

    public static CreateChallengeModel createPrivateChallenge(int userId, BetModel betModel) {
        CreateChallengeModel createChallengeModel = new CreateChallengeModel();
        createChallengeModel.setInvitedUsers(new int[]{userId});
        createChallengeModel.setGrabbedBetIds(new long[]{betModel.getBet().getGrabbedBetId().longValue()});
        createChallengeModel.setMoneyPlaced(0L);
        createChallengeModel.setPrivate(true);
        createChallengeModel.betModel = betModel;
        return createChallengeModel;
    }

    public long getMoneyPlaced() {
        return this.moneyPlaced;
    }

    public void setMoneyPlaced(long moneyPlaced) {
        this.moneyPlaced = moneyPlaced;
    }

    public long[] getGrabbedBetIds() {
        return this.grabbedBetIds;
    }

    public void setGrabbedBetIds(long[] grabbedBetIds) {
        this.grabbedBetIds = grabbedBetIds;
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        this.isPrivate = aPrivate;
    }

    public int[] getInvitedUsers() {
        return this.invitedUsers;
    }

    public void setInvitedUsers(int[] invitedUsers) {
        this.invitedUsers = invitedUsers;
    }

    public BetModel getBetModel() {
        return this.betModel;
    }

    public void setBetModel(BetModel betModel) {
        this.betModel = betModel;
    }
}
