package org.betup.bus;

/* loaded from: classes2.dex */
public class BettingSheetStateMessage {
    private State state;

    public enum State {
        SHOW,
        HIDE
    }

    public BettingSheetStateMessage(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}
