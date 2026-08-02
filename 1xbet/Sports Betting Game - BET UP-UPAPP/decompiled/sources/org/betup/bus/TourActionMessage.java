package org.betup.bus;

/* loaded from: classes2.dex */
public class TourActionMessage {
    private Action action;
    private Long id;

    public enum Action {
        SPORT_BUTTON_CLICKED,
        SPORT_SELECTED,
        LEAGUE_SELECTED,
        MATCH_SELECTED,
        BET_SELECTED,
        BET_PLACED
    }

    public TourActionMessage(Action action, Long id) {
        this.action = action;
        this.id = id;
    }

    public Action getAction() {
        return this.action;
    }

    public Long getId() {
        return this.id;
    }
}
