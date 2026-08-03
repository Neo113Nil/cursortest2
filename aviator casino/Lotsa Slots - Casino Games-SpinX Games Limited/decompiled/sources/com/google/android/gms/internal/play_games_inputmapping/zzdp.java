package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzdp extends java.lang.RuntimeException {
    private zzdp(java.lang.String str, java.lang.String str2) {
        super(str);
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzdp zza(java.lang.String str, java.lang.String str2, int i, int i2) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzdp(zze(str, str2, i, i2), str2);
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzdp zzb(java.lang.String str, java.lang.String str2, int i) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzdp(zze(str, str2, i, i + 1), str2);
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzdp zzc(java.lang.String str, java.lang.String str2, int i) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzdp(zze(str, str2, i, -1), str2);
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzdp zzd(java.lang.String str, java.lang.String str2) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzdp(str, str2);
    }

    private static java.lang.String zze(java.lang.String str, java.lang.String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((java.lang.CharSequence) str2, i - 5, i);
        } else {
            sb.append((java.lang.CharSequence) str2, 0, i);
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(str2.substring(i, i2));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        if (str2.length() - i2 > 8) {
            sb.append((java.lang.CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((java.lang.CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
