package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzdn {
    private final com.google.android.gms.internal.play_games_inputmapping.zzcf zza;
    private int zzb = 0;
    private int zzc = -1;

    public zzdn(com.google.android.gms.internal.play_games_inputmapping.zzcf zzcfVar) {
        com.google.android.gms.internal.play_games_inputmapping.zzds.zza(zzcfVar, "context");
        this.zza = zzcfVar;
    }

    protected abstract void zzb(int i, int i2, com.google.android.gms.internal.play_games_inputmapping.zzdi zzdiVar);

    protected abstract java.lang.Object zzg();

    public final com.google.android.gms.internal.play_games_inputmapping.zzdo zzh() {
        return this.zza.zza();
    }

    public final java.lang.String zzi() {
        return this.zza.zzb();
    }

    public final int zzj() {
        return this.zzc + 1;
    }

    public final void zzk(int i, int i2, com.google.android.gms.internal.play_games_inputmapping.zzdi zzdiVar) {
        if (zzdiVar.zzc() < 32) {
            this.zzb |= 1 << zzdiVar.zzc();
        }
        this.zzc = java.lang.Math.max(this.zzc, zzdiVar.zzc());
        zzb(i, i2, zzdiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object zzl() {
        int i;
        int i2;
        com.google.android.gms.internal.play_games_inputmapping.zzdi zza;
        java.lang.String zzb = this.zza.zzb();
        int zzc = com.google.android.gms.internal.play_games_inputmapping.zzdq.zzc(zzb, 0);
        int i3 = 0;
        int i4 = -1;
        while (true) {
            if (zzc < 0) {
                int i5 = this.zzb;
                if (((i5 + 1) & i5) != 0 || (this.zzc > 31 && i5 != -1)) {
                    throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzd(java.lang.String.format("unreferenced arguments [first missing index=%d]", java.lang.Integer.valueOf(java.lang.Integer.numberOfTrailingZeros(~i5))), this.zza.zzb());
                }
                return zzg();
            }
            int i6 = zzc + 1;
            int i7 = i6;
            int i8 = 0;
            while (i7 < zzb.length()) {
                int i9 = i7 + 1;
                char charAt = zzb.charAt(i7);
                char c = (char) (charAt - '0');
                if (c >= '\n') {
                    if (charAt == '$') {
                        if (i7 - i6 == 0) {
                            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zza("missing index", zzb, zzc, i9);
                        }
                        if (zzb.charAt(i6) == '0') {
                            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zza("index has leading zero", zzb, zzc, i9);
                        }
                        int i10 = i8 - 1;
                        if (i9 == zzb.length()) {
                            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzc("unterminated parameter", zzb, zzc);
                        }
                        i = i7 + 2;
                        zzb.charAt(i9);
                        i4 = i10;
                    } else {
                        if (charAt != '<') {
                            i4 = i3;
                            i3++;
                            for (i2 = i9 - 1; i2 < zzb.length(); i2++) {
                                if (((char) ((zzb.charAt(i2) & 65503) - 65)) < 26) {
                                    int i11 = i2 + 1;
                                    char charAt2 = zzb.charAt(i2);
                                    com.google.android.gms.internal.play_games_inputmapping.zzax zzb2 = com.google.android.gms.internal.play_games_inputmapping.zzax.zzb(zzb, i6, i2, (charAt2 & ' ') == 0);
                                    com.google.android.gms.internal.play_games_inputmapping.zzaw zza2 = com.google.android.gms.internal.play_games_inputmapping.zzaw.zza(charAt2);
                                    if (zza2 != null) {
                                        if (!zzb2.zzi(zza2)) {
                                            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zza("invalid format specifier", zzb, zzc, i11);
                                        }
                                        zza = com.google.android.gms.internal.play_games_inputmapping.zzdk.zza(i4, zza2, zzb2);
                                    } else if (charAt2 == 't' || charAt2 == 'T') {
                                        if (!zzb2.zzh(160, false)) {
                                            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zza("invalid format specification", zzb, zzc, i11);
                                        }
                                        int i12 = i2 + 2;
                                        if (i12 > zzb.length()) {
                                            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzb("truncated format specifier", zzb, zzc);
                                        }
                                        com.google.android.gms.internal.play_games_inputmapping.zzdg zza3 = com.google.android.gms.internal.play_games_inputmapping.zzdg.zza(zzb.charAt(i11));
                                        if (zza3 == null) {
                                            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzb("illegal date/time conversion", zzb, i11);
                                        }
                                        zza = com.google.android.gms.internal.play_games_inputmapping.zzdh.zza(zza3, zzb2, i4);
                                        i11 = i12;
                                    } else {
                                        if (charAt2 != 'h' && charAt2 != 'H') {
                                            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zza("invalid format specification", zzb, zzc, i11);
                                        }
                                        if (!zzb2.zzh(160, false)) {
                                            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zza("invalid format specification", zzb, zzc, i11);
                                        }
                                        zza = new com.google.android.gms.internal.play_games_inputmapping.zzdl(zzb2, i4, zzb2);
                                    }
                                    zzk(zzc, i11, zza);
                                    zzc = com.google.android.gms.internal.play_games_inputmapping.zzdq.zzc(zzb, i11);
                                }
                            }
                            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzc("unterminated parameter", zzb, zzc);
                        }
                        if (i4 == -1) {
                            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zza("invalid relative parameter", zzb, zzc, i9);
                        }
                        if (i9 == zzb.length()) {
                            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzc("unterminated parameter", zzb, zzc);
                        }
                        i = i7 + 2;
                        zzb.charAt(i9);
                    }
                    i6 = i9;
                    i9 = i;
                    while (i2 < zzb.length()) {
                    }
                    throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzc("unterminated parameter", zzb, zzc);
                }
                i8 = (i8 * 10) + c;
                if (i8 >= 1000000) {
                    throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zza("index too large", zzb, zzc, i9);
                }
                i7 = i9;
            }
            throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzc("unterminated parameter", zzb, zzc);
        }
    }
}
