package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TourState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b'\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lorg/betup/ui/tour/compose/TourStep;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "WELCOME_INTRO_V2", "CHOOSE_FAVORITE_SPORTS", "CHOOSE_ODDS_FORMAT", "DEMO_MATCH", "DEMO_BET_CONFIRM", "DEMO_MATCH_SIMULATION", "DEMO_MATCH_WON", "CLICK_HOME_WIN_RATE", "CLICK_HOME_GLOBAL_RANK", "CLICK_HOME_BEST_STREAK", "CLICK_SPECIAL_OFFER", "CLICK_VIDEO_REWARD", "CLICK_DAILY_QUESTS", "CLICK_BATTLES", "CLICK_COMPETITIONS", "CLICK_RANKING", "CLICK_TV_BET", "CLICK_MINIGAMES", "CLICK_LIVE_ARENA", "CLICK_TOP_MATCHES", "CLICK_FLASH_BET", "CLICK_BOTTOM_SPORTS", "CLICK_BOTTOM_MY_BETS", "CLICK_BOTTOM_SHOP", "CLICK_BOTTOM_MENU", "WELCOME_1", "WELCOME_2", "CLICK_SPORT", "SELECT_SPORT", "SELECT_LEAGUE", "SELECT_MATCH", "SELECT_BET", "PLACE_BET", "BET_PLACED", "BET_WON", "COMPLETED", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourStep {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TourStep[] $VALUES;
    public static final TourStep WELCOME_INTRO_V2 = new TourStep("WELCOME_INTRO_V2", 0);
    public static final TourStep CHOOSE_FAVORITE_SPORTS = new TourStep("CHOOSE_FAVORITE_SPORTS", 1);
    public static final TourStep CHOOSE_ODDS_FORMAT = new TourStep("CHOOSE_ODDS_FORMAT", 2);
    public static final TourStep DEMO_MATCH = new TourStep("DEMO_MATCH", 3);
    public static final TourStep DEMO_BET_CONFIRM = new TourStep("DEMO_BET_CONFIRM", 4);
    public static final TourStep DEMO_MATCH_SIMULATION = new TourStep("DEMO_MATCH_SIMULATION", 5);
    public static final TourStep DEMO_MATCH_WON = new TourStep("DEMO_MATCH_WON", 6);
    public static final TourStep CLICK_HOME_WIN_RATE = new TourStep("CLICK_HOME_WIN_RATE", 7);
    public static final TourStep CLICK_HOME_GLOBAL_RANK = new TourStep("CLICK_HOME_GLOBAL_RANK", 8);
    public static final TourStep CLICK_HOME_BEST_STREAK = new TourStep("CLICK_HOME_BEST_STREAK", 9);
    public static final TourStep CLICK_SPECIAL_OFFER = new TourStep("CLICK_SPECIAL_OFFER", 10);
    public static final TourStep CLICK_VIDEO_REWARD = new TourStep("CLICK_VIDEO_REWARD", 11);
    public static final TourStep CLICK_DAILY_QUESTS = new TourStep("CLICK_DAILY_QUESTS", 12);
    public static final TourStep CLICK_BATTLES = new TourStep("CLICK_BATTLES", 13);
    public static final TourStep CLICK_COMPETITIONS = new TourStep("CLICK_COMPETITIONS", 14);
    public static final TourStep CLICK_RANKING = new TourStep("CLICK_RANKING", 15);
    public static final TourStep CLICK_TV_BET = new TourStep("CLICK_TV_BET", 16);
    public static final TourStep CLICK_MINIGAMES = new TourStep("CLICK_MINIGAMES", 17);
    public static final TourStep CLICK_LIVE_ARENA = new TourStep("CLICK_LIVE_ARENA", 18);
    public static final TourStep CLICK_TOP_MATCHES = new TourStep("CLICK_TOP_MATCHES", 19);
    public static final TourStep CLICK_FLASH_BET = new TourStep("CLICK_FLASH_BET", 20);
    public static final TourStep CLICK_BOTTOM_SPORTS = new TourStep("CLICK_BOTTOM_SPORTS", 21);
    public static final TourStep CLICK_BOTTOM_MY_BETS = new TourStep("CLICK_BOTTOM_MY_BETS", 22);
    public static final TourStep CLICK_BOTTOM_SHOP = new TourStep("CLICK_BOTTOM_SHOP", 23);
    public static final TourStep CLICK_BOTTOM_MENU = new TourStep("CLICK_BOTTOM_MENU", 24);
    public static final TourStep WELCOME_1 = new TourStep("WELCOME_1", 25);
    public static final TourStep WELCOME_2 = new TourStep("WELCOME_2", 26);
    public static final TourStep CLICK_SPORT = new TourStep("CLICK_SPORT", 27);
    public static final TourStep SELECT_SPORT = new TourStep("SELECT_SPORT", 28);
    public static final TourStep SELECT_LEAGUE = new TourStep("SELECT_LEAGUE", 29);
    public static final TourStep SELECT_MATCH = new TourStep("SELECT_MATCH", 30);
    public static final TourStep SELECT_BET = new TourStep("SELECT_BET", 31);
    public static final TourStep PLACE_BET = new TourStep("PLACE_BET", 32);
    public static final TourStep BET_PLACED = new TourStep("BET_PLACED", 33);
    public static final TourStep BET_WON = new TourStep("BET_WON", 34);
    public static final TourStep COMPLETED = new TourStep("COMPLETED", 35);

    private static final /* synthetic */ TourStep[] $values() {
        return new TourStep[]{WELCOME_INTRO_V2, CHOOSE_FAVORITE_SPORTS, CHOOSE_ODDS_FORMAT, DEMO_MATCH, DEMO_BET_CONFIRM, DEMO_MATCH_SIMULATION, DEMO_MATCH_WON, CLICK_HOME_WIN_RATE, CLICK_HOME_GLOBAL_RANK, CLICK_HOME_BEST_STREAK, CLICK_SPECIAL_OFFER, CLICK_VIDEO_REWARD, CLICK_DAILY_QUESTS, CLICK_BATTLES, CLICK_COMPETITIONS, CLICK_RANKING, CLICK_TV_BET, CLICK_MINIGAMES, CLICK_LIVE_ARENA, CLICK_TOP_MATCHES, CLICK_FLASH_BET, CLICK_BOTTOM_SPORTS, CLICK_BOTTOM_MY_BETS, CLICK_BOTTOM_SHOP, CLICK_BOTTOM_MENU, WELCOME_1, WELCOME_2, CLICK_SPORT, SELECT_SPORT, SELECT_LEAGUE, SELECT_MATCH, SELECT_BET, PLACE_BET, BET_PLACED, BET_WON, COMPLETED};
    }

    public static EnumEntries<TourStep> getEntries() {
        return $ENTRIES;
    }

    private TourStep(String str, int i) {
    }

    static {
        TourStep[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TourStep valueOf(String str) {
        return (TourStep) Enum.valueOf(TourStep.class, str);
    }

    public static TourStep[] values() {
        return (TourStep[]) $VALUES.clone();
    }
}
