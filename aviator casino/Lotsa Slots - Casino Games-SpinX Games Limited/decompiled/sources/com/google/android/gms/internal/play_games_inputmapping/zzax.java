package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzax {
    private static final long zza;
    private static final com.google.android.gms.internal.play_games_inputmapping.zzax zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
        }
        zza = j;
        zzb = new com.google.android.gms.internal.play_games_inputmapping.zzax(0, -1, -1);
    }

    private zzax(int i, int i2, int i3) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzax zza() {
        return zzb;
    }

    static int zzc(java.lang.String str, boolean z) {
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int zzm = zzm(str.charAt(i2));
            if (zzm < 0) {
                throw new java.lang.IllegalArgumentException(str.length() != 0 ? "invalid flags: ".concat(str) : new java.lang.String("invalid flags: "));
            }
            i |= 1 << zzm;
        }
        return i;
    }

    private static int zzm(char c) {
        return ((int) ((zza >>> ((c - ' ') * 3)) & 7)) - 1;
    }

    private static int zzn(java.lang.String str, int i, int i2) throws com.google.android.gms.internal.play_games_inputmapping.zzdp {
        if (i == i2) {
            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzb("missing precision", str, i - 1);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char charAt = (char) (str.charAt(i4) - '0');
            if (charAt >= '\n') {
                throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzb("invalid precision character", str, i4);
            }
            i3 = (i3 * 10) + charAt;
            if (i3 > 999999) {
                throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zza("precision too large", str, i, i2);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zza("invalid precision", str, i, i2);
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzax) {
            com.google.android.gms.internal.play_games_inputmapping.zzax zzaxVar = (com.google.android.gms.internal.play_games_inputmapping.zzax) obj;
            if (zzaxVar.zzc == this.zzc && zzaxVar.zzd == this.zzd && zzaxVar.zze == this.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzc * 31) + this.zzd) * 31) + this.zze;
    }

    public final com.google.android.gms.internal.play_games_inputmapping.zzax zzd(int i, boolean z, boolean z2) {
        if (zze()) {
            return this;
        }
        int i2 = this.zzc;
        int i3 = i2 & 128;
        return i3 != 0 ? (i3 == i2 && this.zzd == -1 && this.zze == -1) ? this : new com.google.android.gms.internal.play_games_inputmapping.zzax(i3, -1, -1) : zzb;
    }

    public final boolean zze() {
        return this == zzb;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final int zzg() {
        return this.zze;
    }

    public final boolean zzh(int i, boolean z) {
        int i2;
        if (zze()) {
            return true;
        }
        int i3 = this.zzc;
        if (((~i) & i3) != 0) {
            return false;
        }
        if (z || this.zze == -1) {
            return ((i3 & 9) == 9 || (i2 = i3 & 96) == 96 || (i2 != 0 && this.zzd == -1)) ? false : true;
        }
        return false;
    }

    public final boolean zzi(com.google.android.gms.internal.play_games_inputmapping.zzaw zzawVar) {
        return zzh(zzawVar.zzd(), zzawVar.zzc().zza());
    }

    public final int zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        return (this.zzc & 128) != 0;
    }

    public final java.lang.StringBuilder zzl(java.lang.StringBuilder sb) {
        if (!zze()) {
            int i = this.zzc & (-129);
            int i2 = 0;
            while (true) {
                int i3 = 1 << i2;
                if (i3 > i) {
                    break;
                }
                if ((i3 & i) != 0) {
                    sb.append(" #(+,-0".charAt(i2));
                }
                i2++;
            }
            int i4 = this.zzd;
            if (i4 != -1) {
                sb.append(i4);
            }
            if (this.zze != -1) {
                sb.append('.');
                sb.append(this.zze);
            }
        }
        return sb;
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzax zzb(java.lang.String str, int i, int i2, boolean z) throws com.google.android.gms.internal.play_games_inputmapping.zzdp {
        if (i == i2 && !z) {
            return zzb;
        }
        int i3 = true != z ? 0 : 128;
        while (i != i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '0') {
                if (charAt > '9') {
                    throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzb("invalid flag", str, i);
                }
                int i5 = charAt - '0';
                while (i4 != i2) {
                    int i6 = i4 + 1;
                    char charAt2 = str.charAt(i4);
                    if (charAt2 == '.') {
                        return new com.google.android.gms.internal.play_games_inputmapping.zzax(i3, i5, zzn(str, i6, i2));
                    }
                    char c = (char) (charAt2 - '0');
                    if (c >= '\n') {
                        throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzb("invalid width character", str, i4);
                    }
                    i5 = (i5 * 10) + c;
                    if (i5 > 999999) {
                        throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zza("width too large", str, i, i2);
                    }
                    i4 = i6;
                }
                return new com.google.android.gms.internal.play_games_inputmapping.zzax(i3, i5, -1);
            }
            int zzm = zzm(charAt);
            if (zzm < 0) {
                if (charAt == '.') {
                    return new com.google.android.gms.internal.play_games_inputmapping.zzax(i3, -1, zzn(str, i4, i2));
                }
                throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzb("invalid flag", str, i);
            }
            int i7 = 1 << zzm;
            if ((i3 & i7) != 0) {
                throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzb("repeated flag", str, i);
            }
            i3 |= i7;
            i = i4;
        }
        return new com.google.android.gms.internal.play_games_inputmapping.zzax(i3, -1, -1);
    }
}
