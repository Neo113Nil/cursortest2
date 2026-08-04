package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzalt implements zzala {
    private final zzalc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzalt(zzalc zzalcVar, String str, Object[] objArr) {
        this.zza = zzalcVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.zzd = i7 | (cCharAt2 << i8);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzala
    public final zzalc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzala
    public final zzalo zzb() {
        int i7 = this.zzd;
        if ((i7 & 1) != 0) {
            return zzalo.PROTO2;
        }
        return (i7 & 4) == 4 ? zzalo.EDITIONS : zzalo.PROTO3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzala
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
