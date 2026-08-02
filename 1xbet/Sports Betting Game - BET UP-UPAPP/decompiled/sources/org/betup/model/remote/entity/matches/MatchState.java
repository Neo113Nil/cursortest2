package org.betup.model.remote.entity.matches;

/* loaded from: classes2.dex */
public enum MatchState {
    SCHEDULED(1),
    LIVE(2),
    FINISHED(3),
    PROCESSING(4),
    CANCELED(5);

    private int val;

    public int getVal() {
        return this.val;
    }

    MatchState(int val) {
        this.val = val;
    }

    public static MatchState fromInt(int val) {
        if (val == 1) {
            return SCHEDULED;
        }
        if (val == 2) {
            return LIVE;
        }
        if (val == 3) {
            return FINISHED;
        }
        if (val == 5) {
            return CANCELED;
        }
        return PROCESSING;
    }
}
