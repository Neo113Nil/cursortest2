package org.betup.utils;

/* loaded from: classes4.dex */
public final class RankingFormatter {
    private RankingFormatter() {
    }

    public static String formatRanking(int position) {
        String valueOf = String.valueOf(position);
        return valueOf.length() < 4 ? valueOf : String.valueOf(position / 1000) + "k";
    }
}
