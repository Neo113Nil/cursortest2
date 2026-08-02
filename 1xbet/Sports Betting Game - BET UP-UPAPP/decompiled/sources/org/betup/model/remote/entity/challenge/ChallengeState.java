package org.betup.model.remote.entity.challenge;

import org.betup.R;

/* loaded from: classes2.dex */
public enum ChallengeState {
    PENDING(1, R.string.toto_pending),
    ACCEPTED(2, R.string.accepted),
    REJECTED(3, R.string.rejected),
    STARTED(4, R.string.started),
    FINISHED(5, R.string.finished),
    CANCELED(6, R.string.toto_canceled);

    private int strRes;

    ChallengeState(int value, int strRes) {
        this.strRes = strRes;
    }

    public int getStrRes() {
        return this.strRes;
    }
}
