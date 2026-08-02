package org.betup.bus;

/* loaded from: classes2.dex */
public class RefreshLeagueMatchesMessage {
    private final int leagueId;

    public RefreshLeagueMatchesMessage(int leagueId) {
        this.leagueId = leagueId;
    }

    public int getLeagueId() {
        return this.leagueId;
    }
}
