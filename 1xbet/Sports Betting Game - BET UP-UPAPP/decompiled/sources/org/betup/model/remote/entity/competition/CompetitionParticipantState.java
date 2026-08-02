package org.betup.model.remote.entity.competition;

/* loaded from: classes2.dex */
public enum CompetitionParticipantState {
    RETURNED,
    PENDING,
    WON,
    LOST,
    CANCELED;

    public static CompetitionParticipantState fromInt(int value) {
        if (value == 4) {
            return WON;
        }
        if (value == 8) {
            return LOST;
        }
        if (value == 32) {
            return CANCELED;
        }
        return PENDING;
    }
}
