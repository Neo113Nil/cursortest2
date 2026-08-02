package org.betup.services.offer;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class PromoInterstitialSettings {
    private static final long DEFAULT_BET_WON_CLOSE_COOLDOWN_MINUTES = 5;
    private static final long DEFAULT_MINI_GAMES_INTERSTITIAL_INTERVAL = 5;
    private static volatile Set<String> excludedTags = Collections.emptySet();
    private static volatile long betWonCloseCooldownMinutes = 5;
    private static volatile long miniGamesInterstitialInterval = 5;

    private PromoInterstitialSettings() {
    }

    public static Set<String> getExcludedTags() {
        return excludedTags;
    }

    public static long getBetWonCloseCooldownMinutes() {
        return betWonCloseCooldownMinutes;
    }

    public static long getMiniGamesInterstitialInterval() {
        return miniGamesInterstitialInterval;
    }

    public static void apply(long betWonCloseCooldownMinutesValue, long miniGamesInterstitialIntervalValue, Collection<String> rawExcludedTags) {
        betWonCloseCooldownMinutes = betWonCloseCooldownMinutesValue;
        miniGamesInterstitialInterval = miniGamesInterstitialIntervalValue;
        HashSet hashSet = new HashSet();
        for (String str : rawExcludedTags) {
            if (str != null) {
                String lowerCase = str.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    hashSet.add(lowerCase);
                }
            }
        }
        excludedTags = hashSet;
    }

    public static void clear() {
        excludedTags = Collections.emptySet();
        betWonCloseCooldownMinutes = 5L;
        miniGamesInterstitialInterval = 5L;
    }
}
