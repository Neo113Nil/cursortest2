package org.betup.bus;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class NavigateMessage<T> {
    private Bundle bundle;
    private T target;

    public enum Target {
        MATCH_DETAILS,
        USER_DETAILS,
        FOREIGN_USER_DETAILS,
        TEAM_DETAILS,
        LEAGUES,
        HOME,
        MATCHES,
        TOP_MATCHES,
        ACHIEVEMENTS,
        SETTINGS,
        RANKINGS,
        SCORES,
        SCORE_LEAGUES,
        SCORE_MATCHES,
        LEAGUE_MATCHES,
        BALANCE_HISTORY,
        SUPPORT,
        COMMENTS_MATCH,
        PROMO_LIST,
        BETS,
        FAQ,
        SHOP,
        EVENTS,
        MATCH_STATS,
        GET_COINS,
        MESSAGES,
        PRIVATE_MESSAGING,
        COMMENTS,
        BATTLES,
        SUPPORT_CHAT,
        CASINO,
        SEARCH,
        SEARCH_MATCHES,
        SEARCH_LEAGUES,
        SEARCH_TEAMS,
        DAILY_COMPETITIONS,
        COMPETITION_DETAILS,
        MINI_GAMES_HOME_ACTIVITY,
        TVBET,
        OFFERS,
        TASKS,
        VIP_TIPS,
        FOLLOWERS,
        DELETE_ACCOUNT,
        DRAWER,
        BATTLE_NEW,
        FLASH_BET,
        FLASH_BET_CATEGORIES,
        FLASH_BET_MATCH_START,
        FLASH_BET_GAME
    }

    public enum TargetGame {
        MINI_GAMES_HOME_ACTIVITY,
        DICE,
        HIGHER_LOWER,
        WAR_GAME,
        LUCKY_CELLS,
        DOUBLE
    }

    public NavigateMessage(T target, Bundle bundle) {
        this.bundle = bundle;
        this.target = target;
    }

    public Bundle getBundle() {
        return this.bundle;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public T getTarget() {
        return this.target;
    }

    public void setTarget(T target) {
        this.target = target;
    }

    public void setTargetGame(T target) {
        this.target = target;
    }
}
