package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public enum zzdg {
    TIME_HOUR_OF_DAY_PADDED('H'),
    TIME_HOUR_OF_DAY('k'),
    TIME_HOUR_12H_PADDED('I'),
    TIME_HOUR_12H('l'),
    TIME_MINUTE_OF_HOUR_PADDED(io.ktor.util.date.GMTDateParser.MONTH),
    TIME_SECONDS_OF_MINUTE_PADDED('S'),
    TIME_MILLIS_OF_SECOND_PADDED('L'),
    TIME_NANOS_OF_SECOND_PADDED('N'),
    TIME_AM_PM('p'),
    TIME_TZ_NUMERIC(io.ktor.util.date.GMTDateParser.ZONE),
    TIME_TZ_SHORT('Z'),
    TIME_EPOCH_SECONDS(io.ktor.util.date.GMTDateParser.SECONDS),
    TIME_EPOCH_MILLIS('Q'),
    DATE_MONTH_FULL('B'),
    DATE_MONTH_SHORT('b'),
    DATE_MONTH_SHORT_ALT(io.ktor.util.date.GMTDateParser.HOURS),
    DATE_DAY_FULL('A'),
    DATE_DAY_SHORT('a'),
    DATE_CENTURY_PADDED('C'),
    DATE_YEAR_PADDED(io.ktor.util.date.GMTDateParser.YEAR),
    DATE_YEAR_OF_CENTURY_PADDED('y'),
    DATE_DAY_OF_YEAR_PADDED('j'),
    DATE_MONTH_PADDED(io.ktor.util.date.GMTDateParser.MINUTES),
    DATE_DAY_OF_MONTH_PADDED(io.ktor.util.date.GMTDateParser.DAY_OF_MONTH),
    DATE_DAY_OF_MONTH('e'),
    DATETIME_HOURS_MINUTES('R'),
    DATETIME_HOURS_MINUTES_SECONDS('T'),
    DATETIME_HOURS_MINUTES_SECONDS_12H('r'),
    DATETIME_MONTH_DAY_YEAR('D'),
    DATETIME_YEAR_MONTH_DAY('F'),
    DATETIME_FULL('c');

    private static final java.util.Map zzF;
    private final char zzG;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.google.android.gms.internal.play_games_inputmapping.zzdg zzdgVar : values()) {
            if (hashMap.put(java.lang.Character.valueOf(zzdgVar.zzG), zzdgVar) != null) {
                java.lang.String valueOf = java.lang.String.valueOf(zzdgVar);
                java.lang.String.valueOf(valueOf).length();
                throw new java.lang.IllegalStateException("duplicate format character: ".concat(java.lang.String.valueOf(valueOf)));
            }
        }
        zzF = java.util.Collections.unmodifiableMap(hashMap);
    }

    zzdg(char c) {
        this.zzG = c;
    }

    public static final com.google.android.gms.internal.play_games_inputmapping.zzdg zza(char c) {
        return (com.google.android.gms.internal.play_games_inputmapping.zzdg) zzF.get(java.lang.Character.valueOf(c));
    }

    public final char zzb() {
        return this.zzG;
    }
}
