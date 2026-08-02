package org.betup.ui.tour;

/* loaded from: classes4.dex */
public enum Tour {
    MENU_LIVE_MATCHES(1),
    LIVE_MATCHES_SPORT_SELECT(2),
    LIVE_MATCHES_LEAGUE_SELECT(3),
    LIVE_MATCHES_MATCH_SELECT(4),
    LIVE_MATCHES_BET(5),
    NUMBER_TOP(6),
    PLACE_BET_BUTTON(7),
    MY_BETS(8),
    TOUR_COMPLETED(9),
    BETCOINS(10),
    TICKETS(11);

    private int id;

    Tour(int id) {
        this.id = id;
    }

    public int getTutorialId() {
        return this.id;
    }
}
