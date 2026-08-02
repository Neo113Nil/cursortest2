package org.betup.model.remote.entity.challenge;

/* loaded from: classes2.dex */
public enum ChallengeUserState {
    Pending(1),
    Accepted(2),
    Rejected(3),
    Won(4),
    Lost(5),
    Draw(6),
    Return(7),
    NOT_SET(8),
    HIDDEN(9);

    private int value;

    ChallengeUserState(int value) {
        this.value = value;
    }
}
