package org.betup.services.betlist;

import java.util.List;

/* loaded from: classes2.dex */
public class BetMatchClickResult {
    private List<Long> replacedIds;
    private State state;

    public enum State {
        REMOVED,
        PUT,
        REPLACE
    }

    public BetMatchClickResult(State state, List<Long> replacedIds) {
        this.state = state;
        this.replacedIds = replacedIds;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Long> getReplacedIds() {
        return this.replacedIds;
    }

    public void setReplacedIds(List<Long> replacedIds) {
        if (replacedIds != null) {
            this.replacedIds = replacedIds;
        }
    }
}
