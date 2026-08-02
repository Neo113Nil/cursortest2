package org.betup.bus;

/* loaded from: classes2.dex */
public class OddsDialogVisibilityMessage {
    private State state;

    public enum State {
        VISIBLE,
        HIDDEN
    }

    public OddsDialogVisibilityMessage(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}
