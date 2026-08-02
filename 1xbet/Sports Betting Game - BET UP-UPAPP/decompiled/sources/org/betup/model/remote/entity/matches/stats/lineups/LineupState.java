package org.betup.model.remote.entity.matches.stats.lineups;

/* loaded from: classes2.dex */
public enum LineupState {
    STARTING,
    SUBSTITUTION,
    MISSING;

    public static LineupState fromInt(int val) {
        if (val == 1) {
            return STARTING;
        }
        if (val != 2) {
            return MISSING;
        }
        return SUBSTITUTION;
    }
}
