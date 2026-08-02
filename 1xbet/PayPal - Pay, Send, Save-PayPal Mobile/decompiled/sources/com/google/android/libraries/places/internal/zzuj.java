package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzuj {
    STRING(io.ktor.util.date.GMTDateParser.SECONDS, com.google.android.libraries.places.internal.zzul.GENERAL, "-#", true),
    BOOLEAN('b', com.google.android.libraries.places.internal.zzul.BOOLEAN, "-", true),
    CHAR('c', com.google.android.libraries.places.internal.zzul.CHARACTER, "-", true),
    DECIMAL(io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, com.google.android.libraries.places.internal.zzul.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', com.google.android.libraries.places.internal.zzul.INTEGRAL, "-#0(", false),
    HEX('x', com.google.android.libraries.places.internal.zzul.INTEGRAL, "-#0(", true),
    FLOAT('f', com.google.android.libraries.places.internal.zzul.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', com.google.android.libraries.places.internal.zzul.FLOAT, "-#0+ (", true),
    GENERAL('g', com.google.android.libraries.places.internal.zzul.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', com.google.android.libraries.places.internal.zzul.FLOAT, "-#0+ ", true);

    private static final com.google.android.libraries.places.internal.zzuj[] zzk = new com.google.android.libraries.places.internal.zzuj[26];
    private final char zzl;
    private final com.google.android.libraries.places.internal.zzul zzm;
    private final int zzn;
    private final java.lang.String zzo;

    static {
        for (com.google.android.libraries.places.internal.zzuj zzujVar : values()) {
            zzk[zzf(zzujVar.zzl)] = zzujVar;
        }
    }

    zzuj(char c, com.google.android.libraries.places.internal.zzul zzulVar, java.lang.String str, boolean z) {
        this.zzl = c;
        this.zzm = zzulVar;
        this.zzn = com.google.android.libraries.places.internal.zzuk.zzc(str, z);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(c).length() + 1);
        sb.append("%");
        sb.append(c);
        this.zzo = sb.toString();
    }

    public static com.google.android.libraries.places.internal.zzuj zza(char c) {
        com.google.android.libraries.places.internal.zzuj zzujVar = zzk[zzf(c)];
        if ((c & ' ') == 0 && (zzujVar == null || (zzujVar.zzn & 128) == 0)) {
            return null;
        }
        return zzujVar;
    }

    private static int zzf(char c) {
        return (c | ' ') - 97;
    }

    public final java.lang.String zze() {
        return this.zzo;
    }

    final int zzd() {
        return this.zzn;
    }

    public final com.google.android.libraries.places.internal.zzul zzc() {
        return this.zzm;
    }

    public final char zzb() {
        return this.zzl;
    }
}
