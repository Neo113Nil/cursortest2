package org.betup.utils;

import android.content.Context;
import java.text.DecimalFormat;
import java.util.Locale;
import org.betup.R;
import org.betup.model.remote.entity.challenge.ChallengeState;
import org.betup.model.remote.entity.challenge.ChallengeUserState;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes4.dex */
public final class FormatHelper {
    private FormatHelper() {
    }

    public static String getFormattedMultiplierCoef(long base, long total) {
        double round = round((total * 1.0d) / base, 1);
        long j = (long) round;
        double d = (round - j) * 10.0d;
        if (d < 0.999d) {
            return String.valueOf(j);
        }
        return String.format(Locale.getDefault(), "%d.%d", Long.valueOf(j), Long.valueOf(Math.round(d)));
    }

    /* renamed from: org.betup.utils.FormatHelper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$model$remote$entity$challenge$ChallengeUserState;

        static {
            int[] iArr = new int[ChallengeUserState.values().length];
            $SwitchMap$org$betup$model$remote$entity$challenge$ChallengeUserState = iArr;
            try {
                iArr[ChallengeUserState.Won.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$challenge$ChallengeUserState[ChallengeUserState.Lost.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$challenge$ChallengeUserState[ChallengeUserState.Draw.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String formatUserChallengeState(Context context, ChallengeUserState state, ChallengeState challengeState) {
        int i;
        int i2 = AnonymousClass1.$SwitchMap$org$betup$model$remote$entity$challenge$ChallengeUserState[state.ordinal()];
        if (i2 == 1) {
            i = R.string.full_won;
        } else if (i2 != 2) {
            i = i2 != 3 ? challengeState.getStrRes() : R.string.draw;
        } else {
            i = R.string.full_lost;
        }
        return context.getString(i).replace(":", ".").toUpperCase();
    }

    public static String getDialogBetcoinsFormated(long betcoins) {
        if (betcoins < 100000000) {
            return getShopBetcoinsFormated(betcoins);
        }
        return getTextFormattedMoney(betcoins);
    }

    public static String getShopStringBetcoinsFormattedLabel(Context context, long betcoins) {
        return context.getString(R.string.formatted_betcoins, getShopBetcoinsFormated(betcoins));
    }

    public static String getShopBetcoinsFormated(long betcoins) {
        String valueOf = String.valueOf(betcoins);
        if (valueOf.length() < 3) {
            return valueOf;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int length = valueOf.length() - 1; length >= 0; length--) {
            if (i > 0 && i % 3 == 0) {
                sb.insert(0, ",");
            }
            sb.insert(0, valueOf.charAt(length));
            i++;
        }
        return sb.toString();
    }

    public static String formatStringResWithColon(Context context, int strRes) {
        return String.format(Locale.getDefault(), "%s:", context.getString(strRes));
    }

    public static String getHtmlScoreForMatch(MatchDetailsDataModel match) {
        return getCommonScore(match.getScoreHome().floatValue(), match.getScoreAway().floatValue(), false, ":");
    }

    public static String getCommonScore(float homeScore, float awayScore, boolean overtime, String splitter) {
        return (overtime ? "<sup>*</sup>" : "") + String.format(Locale.getDefault(), "%s %s %s", getScoreFormatted(homeScore), splitter, getScoreFormatted(awayScore));
    }

    public static String floatToFormattedPercents(float percents, boolean displaySign) {
        return ((!displaySign || percents <= 0.0f) ? "" : "+") + String.format(Locale.getDefault(), "%.0f%%", Float.valueOf(percents * 100.0f));
    }

    public static String getScoreFormatted(float score) {
        try {
            String valueOf = String.valueOf(score);
            int indexOf = valueOf.indexOf(46);
            if (valueOf.charAt(indexOf + 1) == '0') {
                return valueOf.substring(0, indexOf);
            }
            return valueOf.substring(0, indexOf + 2);
        } catch (Exception unused) {
            return "0";
        }
    }

    public static String getExpFormatted(long exp) {
        String valueOf = String.valueOf(exp);
        if (valueOf.length() < 5) {
            return String.valueOf(exp);
        }
        if (valueOf.length() < 8) {
            return (exp / 1000) + "k";
        }
        return (exp / 1000000) + "mln";
    }

    public static String getTextFormattedMoney(long money) {
        String valueOf = String.valueOf(money);
        if (valueOf.length() < 5) {
            return String.valueOf(money);
        }
        if (valueOf.length() < 7) {
            return (money / 1000) + "k";
        }
        return (money / 1000000) + "mln";
    }

    public static String getTextFormattedOdd(double odd) {
        if (odd < 99999.0d) {
            return new DecimalFormat("#.##").format(odd).replace(",", ".");
        }
        return getTextFormattedMoney(Math.round(odd));
    }

    private static double round(double value, int precision) {
        return Math.round(value * r0) / ((int) Math.pow(10.0d, precision));
    }
}
