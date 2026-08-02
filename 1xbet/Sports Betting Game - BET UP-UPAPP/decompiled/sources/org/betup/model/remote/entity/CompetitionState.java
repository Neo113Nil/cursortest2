package org.betup.model.remote.entity;

/* loaded from: classes2.dex */
public enum CompetitionState {
    PENDING(1),
    PROCESSING(2),
    STARTED(3),
    FINISHED(4),
    CANCELED(5);

    private final int state;

    CompetitionState(int state) {
        this.state = state;
    }

    public int getState() {
        return this.state;
    }
}
