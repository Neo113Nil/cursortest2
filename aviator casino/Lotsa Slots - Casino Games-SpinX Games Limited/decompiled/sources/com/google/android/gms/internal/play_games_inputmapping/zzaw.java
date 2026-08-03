package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public enum zzaw {
    STRING(io.ktor.util.date.GMTDateParser.SECONDS, com.google.android.gms.internal.play_games_inputmapping.zzay.GENERAL, "-#", true),
    BOOLEAN('b', com.google.android.gms.internal.play_games_inputmapping.zzay.BOOLEAN, "-", true),
    CHAR('c', com.google.android.gms.internal.play_games_inputmapping.zzay.CHARACTER, "-", true),
    DECIMAL(io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, com.google.android.gms.internal.play_games_inputmapping.zzay.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', com.google.android.gms.internal.play_games_inputmapping.zzay.INTEGRAL, "-#0(", false),
    HEX('x', com.google.android.gms.internal.play_games_inputmapping.zzay.INTEGRAL, "-#0(", true),
    FLOAT('f', com.google.android.gms.internal.play_games_inputmapping.zzay.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', com.google.android.gms.internal.play_games_inputmapping.zzay.FLOAT, "-#0+ (", true),
    GENERAL('g', com.google.android.gms.internal.play_games_inputmapping.zzay.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', com.google.android.gms.internal.play_games_inputmapping.zzay.FLOAT, "-#0+ ", true);

    private static final com.google.android.gms.internal.play_games_inputmapping.zzaw[] zzk = new com.google.android.gms.internal.play_games_inputmapping.zzaw[26];
    private final char zzl;
    private final com.google.android.gms.internal.play_games_inputmapping.zzay zzm;
    private final int zzn;
    private final java.lang.String zzo;

    static {
        for (com.google.android.gms.internal.play_games_inputmapping.zzaw zzawVar : values()) {
            zzk[zzf(zzawVar.zzl)] = zzawVar;
        }
    }

    zzaw(char c, com.google.android.gms.internal.play_games_inputmapping.zzay zzayVar, java.lang.String str, boolean z) {
        this.zzl = c;
        this.zzm = zzayVar;
        this.zzn = com.google.android.gms.internal.play_games_inputmapping.zzax.zzc(str, z);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(2);
        sb.append("%");
        sb.append(c);
        this.zzo = sb.toString();
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzaw zza(char c) {
        com.google.android.gms.internal.play_games_inputmapping.zzaw zzawVar = zzk[zzf(c)];
        if ((c & ' ') != 0) {
            return zzawVar;
        }
        if (zzawVar == null || (zzawVar.zzn & 128) == 0) {
            return null;
        }
        return zzawVar;
    }

    private static int zzf(char c) {
        return (c | ' ') - 97;
    }

    public final char zzb() {
        return this.zzl;
    }

    public final com.google.android.gms.internal.play_games_inputmapping.zzay zzc() {
        return this.zzm;
    }

    final int zzd() {
        return this.zzn;
    }

    public final java.lang.String zze() {
        return this.zzo;
    }
}
