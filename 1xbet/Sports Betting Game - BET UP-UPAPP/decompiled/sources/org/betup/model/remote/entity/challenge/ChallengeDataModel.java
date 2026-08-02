package org.betup.model.remote.entity.challenge;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.user.details.UserDetailsDataModel;

/* loaded from: classes2.dex */
public class ChallengeDataModel implements Serializable {

    @SerializedName("created_at")
    private String date;

    @SerializedName("enter_fee")
    private long enterFee;

    @SerializedName("id")
    private int id;

    @SerializedName("isPrivate")
    private boolean isPrivate;

    @SerializedName("matches")
    private List<MatchDetailsDataModel> matches;

    @SerializedName("max_participants")
    private int maxParticipants;

    @SerializedName("money_accept")
    private long moneyAccept;

    @SerializedName("money_to_win")
    private long moneyToWin;

    @SerializedName("participants")
    private List<ChallengeParticipant> participants;

    @SerializedName("state")
    private ChallengeState state;

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        this.isPrivate = aPrivate;
    }

    public UserDetailsDataModel getFirstUser() {
        List<ChallengeParticipant> list = this.participants;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.participants.get(0).getUser();
    }

    public UserDetailsDataModel getSecondUser() {
        List<ChallengeParticipant> list = this.participants;
        if (list == null || list.size() < 2) {
            return null;
        }
        return this.participants.get(1).getUser();
    }

    public ChallengeParticipant getCurrentParticipant(int userId) {
        UserDetailsDataModel firstUser = getFirstUser();
        if (firstUser != null && firstUser.getId().equals(Integer.valueOf(userId))) {
            return this.participants.get(0);
        }
        UserDetailsDataModel secondUser = getSecondUser();
        if (secondUser == null || !secondUser.getId().equals(Integer.valueOf(userId))) {
            return null;
        }
        return this.participants.get(1);
    }

    public ChallengeParticipant getOpponentForUser(int userId) {
        UserDetailsDataModel firstUser = getFirstUser();
        if (firstUser != null && !firstUser.getId().equals(Integer.valueOf(userId))) {
            return this.participants.get(0);
        }
        UserDetailsDataModel secondUser = getSecondUser();
        if (secondUser == null || secondUser.getId().equals(Integer.valueOf(userId))) {
            return null;
        }
        return this.participants.get(1);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMoneyAccept() {
        return this.moneyAccept;
    }

    public void setMoneyAccept(long moneyAccept) {
        this.moneyAccept = moneyAccept;
    }

    public long getEnterFee() {
        return this.enterFee;
    }

    public void setEnterFee(long enterFee) {
        this.enterFee = enterFee;
    }

    public long getMoneyToWin() {
        return this.moneyToWin;
    }

    public void setMoneyToWin(long moneyToWin) {
        this.moneyToWin = moneyToWin;
    }

    public ChallengeState getState() {
        return this.state;
    }

    public void setState(ChallengeState state) {
        this.state = state;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMaxParticipants() {
        return this.maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public List<ChallengeParticipant> getParticipants() {
        return this.participants;
    }

    public void setParticipants(List<ChallengeParticipant> participants) {
        this.participants = participants;
    }

    public List<MatchDetailsDataModel> getMatches() {
        return this.matches;
    }

    public void setMatches(List<MatchDetailsDataModel> matches) {
        this.matches = matches;
    }
}
