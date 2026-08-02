package org.betup.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import androidx.preference.PreferenceManager;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.betup.model.remote.entity.notifications.NotificationTask;
import org.betup.services.offer.PromoInterstitialSettings;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;

/* loaded from: classes4.dex */
public final class SharedPrefs {
    private static final String ANONYMOUS_USER_UID = "anonymous_user_uid";
    private static final String BALANCE_ANIMATION_MODE = "balance_animation_mode";
    public static final int BALANCE_ANIMATION_MODE_COUNTER = 2;
    public static final int BALANCE_ANIMATION_MODE_TICKER = 1;
    private static final String BET_TUTORIAL_GUIDE = "bet_tutorial_guide";
    private static final String CASINO_ACCEPTED = "casino_accepted";
    private static final String CHALLENGE_TOUR = "challenge_tour";
    private static final String HAPTIC_FEEDBACK_ENABLED = "haptic_feedback_enabled";
    private static final String IN_APP_MESSAGES_ENABLED = "in_app_messages_enabled";
    private static final String IS_BET_DEFAULTS = "IS_DEFAULTS_BETS_AMOUNT_SELECTED";
    private static final String KEY_BETSLIP = "betslip";
    private static final String KEY_BET_LINK_ID = "bet_link_id";
    private static final String KEY_BET_LINK_OWNER_USER_ID = "bet_link_owner_user_id";
    private static final String KEY_LAST_BET_WON_CLOSE_INTERSTITIAL_AT_MS = "lastBetWonCloseInterstitialAtMs";
    private static final String LAST_BET_AMOUNT_BOMB_GAME = "last_bet_amount_bomb_game";
    private static final String LAST_SESSION_ID_DOUBLE_GAME = "last_sid_dg";
    private static final String LAST_SESSION_STARTED = "last_session_started";
    private static final String LAST_SESSION_STARTED_PREFIX = "last_session_started_";
    private static final String LEADERBOARD_DIALOG = "leaderboard_dialog";
    private static final String NOTIFICATION_TASKS = "notification_tasks";
    private static final String PLAYER_STATS_MIN_BANNER_DISMISSED = "player_stats_min_banner_dismissed";
    private static final String PUSH_TOKEN = "push_token";
    private static final String QUIZ_TOUR = "quiz_tour";
    private static final String SESSION_SCOPE_GLOBAL = "global";
    private static final long SESSION_VALID_TIMEOUT = 10800000;
    private static final String TICKET_INFO_SHOWN = "ticket_info_shown";
    private static final String VISUAL_EFFECTS_ENABLED = "visual_effects_enabled";

    public static long getSessionValidTimeoutMs() {
        return SESSION_VALID_TIMEOUT;
    }

    private SharedPrefs() {
    }

    public static boolean shouldShowChallengeTour(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(CHALLENGE_TOUR, true);
    }

    public static void saveChallengeTourShown(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(CHALLENGE_TOUR, false).apply();
    }

    public static boolean shouldShowQuizTour(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(QUIZ_TOUR, true);
    }

    public static void saveQuizTourShown(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(QUIZ_TOUR, false).apply();
    }

    public static void saveBetTutorialGuideShown(Context context, boolean isDialogOpened) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (isDialogOpened) {
            defaultSharedPreferences.edit().putInt(BET_TUTORIAL_GUIDE, 10).apply();
        } else {
            defaultSharedPreferences.edit().putInt(BET_TUTORIAL_GUIDE, defaultSharedPreferences.getInt(BET_TUTORIAL_GUIDE, 0) + 1).apply();
        }
    }

    public static boolean shouldBetTutorialGuideShown(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(BET_TUTORIAL_GUIDE, 0) < 10;
    }

    public static boolean shouldShowLeaderboardDialog(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(LEADERBOARD_DIALOG, true);
    }

    public static void saveLeaderboardDialogShown(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(LEADERBOARD_DIALOG, false).apply();
    }

    public static void setProfilerEnabled(Context context, boolean enabled) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("profiler", enabled).apply();
    }

    public static boolean getProfilerEnabled(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("profiler", false);
    }

    public static boolean getIntroShown(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("introShown", false);
    }

    public static void setTermsAccepted(Context context, boolean accepted) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("termsAccepted", accepted).apply();
    }

    public static boolean getTermsAccepted(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("termsAccepted", false);
    }

    public static void saveMatchLink(Context context, int matchId) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("matchId", matchId).apply();
    }

    public static int getMatchId(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("matchId", 0);
    }

    public static void saveBetLinkId(Context context, int betId) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(KEY_BET_LINK_ID, betId).apply();
    }

    public static int getBetLinkId(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(KEY_BET_LINK_ID, 0);
    }

    public static void saveBetLinkOwnerUserId(Context context, int userId) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(KEY_BET_LINK_OWNER_USER_ID, Math.max(0, userId)).apply();
    }

    public static int getBetLinkOwnerUserId(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(KEY_BET_LINK_OWNER_USER_ID, 0);
    }

    public static void saveBetLinkOwnerUserIdFromUri(Context context, Uri uri) {
        int i = 0;
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("userId");
            if (queryParameter == null) {
                queryParameter = uri.getQueryParameter("uid");
            }
            if (queryParameter != null) {
                try {
                    int parseInt = Integer.parseInt(queryParameter);
                    if (parseInt > 0) {
                        i = parseInt;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        saveBetLinkOwnerUserId(context, i);
    }

    public static void setBetslip(Context context, List<BetModel> betslip) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(KEY_BETSLIP, new GsonBuilder().create().toJson(betslip)).apply();
    }

    public static ArrayList<BetModel> getBetslip(Context context) {
        ArrayList<BetModel> arrayList = (ArrayList) new GsonBuilder().create().fromJson(PreferenceManager.getDefaultSharedPreferences(context).getString(KEY_BETSLIP, ""), new TypeToken<ArrayList<BetModel>>() { // from class: org.betup.utils.SharedPrefs.1
        }.getType());
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public static int getCurrentMiniGamesWins(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("currentMiniGamesWinCounter", 0);
    }

    public static int getCurrentMiniGamesPlayed(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("currentMiniGamesCounter", 0);
    }

    public static void trackMiniGamePlayed(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("currentMiniGamesWinCounter", getCurrentMiniGamesWins(context) + (z ? 1 : 0)).putInt("currentMiniGamesCounter", getCurrentMiniGamesPlayed(context) + 1).apply();
    }

    public static void resetCurrentMiniGamesWinsCounter(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("currentMiniGamesWinCounter", 0).apply();
    }

    public static void resetCurrentMiniGamesPlayedCounter(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("currentMiniGamesCounter", 0).apply();
    }

    public static int getWebGameWinDoubleDialogWins(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("webGameWinDoubleDialogCounter", 0);
    }

    public static void trackWebGameWinForDoubleDialog(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("webGameWinDoubleDialogCounter", getWebGameWinDoubleDialogWins(context) + 1).apply();
    }

    public static void resetWebGameWinDoubleDialogCounter(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("webGameWinDoubleDialogCounter", 0).apply();
    }

    public static long getLastBetWonCloseInterstitialAtMs(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong(KEY_LAST_BET_WON_CLOSE_INTERSTITIAL_AT_MS, 0L);
    }

    public static boolean canShowBetWonCloseInterstitial(Context context) {
        long betWonCloseCooldownMinutes = PromoInterstitialSettings.getBetWonCloseCooldownMinutes();
        if (betWonCloseCooldownMinutes <= 0) {
            return true;
        }
        return System.currentTimeMillis() - PreferenceManager.getDefaultSharedPreferences(context).getLong(KEY_LAST_BET_WON_CLOSE_INTERSTITIAL_AT_MS, 0L) >= betWonCloseCooldownMinutes * 60000;
    }

    public static void markBetWonCloseInterstitialShown(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(KEY_LAST_BET_WON_CLOSE_INTERSTITIAL_AT_MS, System.currentTimeMillis()).apply();
    }

    public static synchronized List<NotificationTask> getNotificationTasks(Context context) {
        synchronized (SharedPrefs.class) {
            List<NotificationTask> list = (List) new GsonBuilder().create().fromJson(PreferenceManager.getDefaultSharedPreferences(context).getString(NOTIFICATION_TASKS, ""), new TypeToken<List<NotificationTask>>() { // from class: org.betup.utils.SharedPrefs.2
            }.getType());
            if (list != null) {
                return list;
            }
            return new ArrayList();
        }
    }

    public static synchronized void saveNotificationTasks(Context context, List<NotificationTask> notificationTasks, boolean immediately) {
        synchronized (SharedPrefs.class) {
            String json = new GsonBuilder().create().toJson(notificationTasks);
            Log.d("BetUpSYNC", "SAVED LIST = " + json);
            if (immediately) {
                PreferenceManager.getDefaultSharedPreferences(context).edit().putString(NOTIFICATION_TASKS, json).apply();
            } else {
                PreferenceManager.getDefaultSharedPreferences(context).edit().putString(NOTIFICATION_TASKS, json).commit();
            }
        }
    }

    public static void saveFavoriteSports(Context context, Collection<Integer> ids) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        HashSet hashSet = new HashSet();
        if (ids != null) {
            Iterator<Integer> it = ids.iterator();
            while (it.hasNext()) {
                hashSet.add(String.valueOf(it.next().intValue()));
            }
        }
        defaultSharedPreferences.edit().putStringSet("favoriteSports", hashSet).apply();
    }

    public static int[] getFavoriteSports(Context context) {
        Set<String> stringSet = PreferenceManager.getDefaultSharedPreferences(context).getStringSet("favoriteSports", new HashSet());
        if (stringSet.size() == 0) {
            return null;
        }
        int[] iArr = new int[stringSet.size()];
        Iterator<String> it = stringSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = Integer.parseInt(it.next());
            i++;
        }
        return iArr;
    }

    public static boolean isCasinoAccepted(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(CASINO_ACCEPTED, false);
    }

    public static void saveCasinoAccepted(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(CASINO_ACCEPTED, true).apply();
    }

    public static boolean isSelectedDefaultsBetsAmounts(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(IS_BET_DEFAULTS, true);
    }

    public static void setIsSelectedDefaultsBetsAmounts(Context context, boolean value) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(IS_BET_DEFAULTS, value).apply();
    }

    public static boolean isTicketInfoShown(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(TICKET_INFO_SHOWN, false);
    }

    public static void saveTicketInfoShown(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(TICKET_INFO_SHOWN, true).apply();
    }

    public static void setAreVisualEffectsEnabled(Context context, boolean value) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(VISUAL_EFFECTS_ENABLED, value).apply();
    }

    public static boolean areVisualEffectsEnabled(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(VISUAL_EFFECTS_ENABLED, true);
    }

    public static void setHapticEffectsEnabled(Context context, boolean value) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(HAPTIC_FEEDBACK_ENABLED, value).apply();
    }

    public static boolean areHapticEffectsEnabled(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(HAPTIC_FEEDBACK_ENABLED, true);
    }

    public static void setAreInAppMessagesEnabled(Context context, boolean value) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(IN_APP_MESSAGES_ENABLED, value).apply();
    }

    public static boolean areInAppMessagesEnabled(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(IN_APP_MESSAGES_ENABLED, true);
    }

    public static void setBalanceAnimationMode(Context context, int mode) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(BALANCE_ANIMATION_MODE, mode != 2 ? 1 : 2).commit();
    }

    public static int getBalanceAnimationMode(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(BALANCE_ANIMATION_MODE, 1) == 2 ? 2 : 1;
    }

    public static void saveAnonymousUserUid(Context context, String uid) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(ANONYMOUS_USER_UID, uid).apply();
    }

    public static String getAnonymousUserUid(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(ANONYMOUS_USER_UID, null);
    }

    public static void clearAnonymousUserUid(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().remove(ANONYMOUS_USER_UID).apply();
    }

    public static boolean isNeedToStartSession(Context context) {
        return isNeedToStartSession(context, null);
    }

    public static boolean isNeedToStartSession(Context context, String sessionScopeKey) {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String sessionStartedStorageKey = getSessionStartedStorageKey(sessionScopeKey);
        long j = defaultSharedPreferences.getLong(sessionStartedStorageKey, 0L);
        if (j != 0 && currentTimeMillis - j <= SESSION_VALID_TIMEOUT) {
            return false;
        }
        defaultSharedPreferences.edit().putLong(sessionStartedStorageKey, currentTimeMillis).apply();
        return true;
    }

    public static long getLastSessionStarted(Context context) {
        return getLastSessionStarted(context, null);
    }

    public static long getLastSessionStarted(Context context, String sessionScopeKey) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong(getSessionStartedStorageKey(sessionScopeKey), 0L);
    }

    private static String getSessionStartedStorageKey(String sessionScopeKey) {
        if (sessionScopeKey == null || sessionScopeKey.trim().isEmpty()) {
            return LAST_SESSION_STARTED;
        }
        return LAST_SESSION_STARTED_PREFIX + sessionScopeKey.trim();
    }

    public static boolean shouldExpandAllBetGroups(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("expandBets", false);
    }

    public static void setShouldExpandAllBetGroups(Context context, boolean value) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("expandBets", value).apply();
    }

    public static Long getCustomBetAmount(Context context) {
        return Long.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getLong("customBetAmount", 100L));
    }

    public static void saveCustomBetAmount(Context context, long value) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("customBetAmount", value).apply();
    }

    public static synchronized String getLastSessionIdDoubleGame(Context context) {
        String string;
        synchronized (SharedPrefs.class) {
            string = PreferenceManager.getDefaultSharedPreferences(context).getString(LAST_SESSION_ID_DOUBLE_GAME, null);
        }
        return string;
    }

    public static synchronized void saveLastSessionIdDoubleGame(Context context, String sessionId) {
        synchronized (SharedPrefs.class) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(LAST_SESSION_ID_DOUBLE_GAME, sessionId).apply();
        }
    }

    public static Long getLastBetAmountBombGame(Context context) {
        long j = PreferenceManager.getDefaultSharedPreferences(context).getLong(LAST_BET_AMOUNT_BOMB_GAME, 0L);
        Log.d("BombGame", "getLastBetAmountBombGame: reading saved amount = " + j);
        return Long.valueOf(j);
    }

    public static void saveLastBetAmountBombGame(Context context, long betAmount) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Log.d("BombGame", "saveLastBetAmountBombGame: saving bet amount = " + betAmount);
        defaultSharedPreferences.edit().putLong(LAST_BET_AMOUNT_BOMB_GAME, betAmount).apply();
        Log.d("BombGame", "saveLastBetAmountBombGame: saved successfully");
    }

    public static boolean isPlayerStatsMinBannerDismissed(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(PLAYER_STATS_MIN_BANNER_DISMISSED, false);
    }

    public static void setPlayerStatsMinBannerDismissed(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(PLAYER_STATS_MIN_BANNER_DISMISSED, true).apply();
    }
}
