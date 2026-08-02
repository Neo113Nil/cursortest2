package org.betup.model.remote.entity;

import org.betup.R;

/* loaded from: classes2.dex */
public final class SportsHelper {
    public static final int GREYHOUND_RACING_ID = 65;
    public static final int HORSE_RACING_ID = 64;
    public static final int LOTTERY_ID = 66;

    public static int getIconResForMatch(int sportId) {
        if (sportId == 64) {
            return R.drawable.horse_match_icon;
        }
        if (sportId != 65) {
            return 0;
        }
        return R.drawable.greyhound_match_icon;
    }

    public static boolean hasSpecificMatchItem(int sportId) {
        switch (sportId) {
            case 64:
            case 65:
            case 66:
                return true;
            default:
                return false;
        }
    }

    public static boolean shouldHideScoreForBet(int sportId) {
        switch (sportId) {
            case 64:
            case 65:
            case 66:
                return true;
            default:
                return false;
        }
    }
}
