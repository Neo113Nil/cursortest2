package org.betup.model.domain;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class SelectBetForChallengeModel implements Serializable {
    private long buyIn;
    private int challengeId;
    private String firstUserName;
    private String firstUserPhotoUrl;
    private int matchId;
    private long prize;
    private String secondUserName;
    private String secondUserPhotoUrl;

    public int getChallengeId() {
        return this.challengeId;
    }

    public void setChallengeId(int challengeId) {
        this.challengeId = challengeId;
    }

    public long getBuyIn() {
        return this.buyIn;
    }

    public void setBuyIn(long buyIn) {
        this.buyIn = buyIn;
    }

    public long getPrize() {
        return this.prize;
    }

    public void setPrize(long prize) {
        this.prize = prize;
    }

    public int getMatchId() {
        return this.matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getFirstUserName() {
        return this.firstUserName;
    }

    public void setFirstUserName(String firstUserName) {
        this.firstUserName = firstUserName;
    }

    public String getSecondUserName() {
        return this.secondUserName;
    }

    public void setSecondUserName(String secondUserName) {
        this.secondUserName = secondUserName;
    }

    public String getFirstUserPhotoUrl() {
        return this.firstUserPhotoUrl;
    }

    public void setFirstUserPhotoUrl(String firstUserPhotoUrl) {
        this.firstUserPhotoUrl = firstUserPhotoUrl;
    }

    public String getSecondUserPhotoUrl() {
        return this.secondUserPhotoUrl;
    }

    public void setSecondUserPhotoUrl(String secondUserPhotoUrl) {
        this.secondUserPhotoUrl = secondUserPhotoUrl;
    }
}
