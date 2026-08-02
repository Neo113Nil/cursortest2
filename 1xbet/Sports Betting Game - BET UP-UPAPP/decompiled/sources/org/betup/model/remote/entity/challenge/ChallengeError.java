package org.betup.model.remote.entity.challenge;

/* loaded from: classes2.dex */
public enum ChallengeError {
    OddsChanged(1),
    BetNotAvailable(2),
    UserNotAvailable(3),
    BetRemoved(4),
    OneBetTypePerMatchAllowed(5),
    MatchIsNotFuture(6),
    NotEnoughMoney(7),
    BetLimitAchieved(8),
    ChallengeLimitAchieved(9),
    MatchLimitAchieved(10),
    UserLimitAchieved(11);

    private int value;

    ChallengeError(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
