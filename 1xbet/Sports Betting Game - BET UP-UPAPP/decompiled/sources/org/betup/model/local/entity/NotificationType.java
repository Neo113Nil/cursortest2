package org.betup.model.local.entity;

/* loaded from: classes2.dex */
public enum NotificationType {
    ACHIEVEMENT,
    BET,
    LEVEL,
    CALLBACK,
    INFO,
    MATCH,
    MATCH_SCORE,
    REWARD,
    RATE,
    MESSAGE,
    PROMO,
    CHALLENGE,
    CHALLENGE_PRICE,
    MATCH_FINISHED,
    OFFER,
    INTERSTITIAL,
    REWARDED_PROMPT,
    CHALLENGE_PRIVATE,
    CHALLENGE_ACCEPT,
    FOLLOW,
    ENERGY_FULL,
    COMPETITION,
    SUPPORT;

    public static NotificationType fromString(String val) {
        if (val == null) {
            return INFO;
        }
        try {
            return valueOf(val.trim().toUpperCase());
        } catch (IllegalArgumentException unused) {
            return INFO;
        }
    }
}
