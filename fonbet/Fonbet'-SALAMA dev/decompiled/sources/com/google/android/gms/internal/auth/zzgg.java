package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzgg implements zzft {
    private final zzfw zza;
    private final String zzb = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
    private final Object[] zzc;
    private final int zzd;

    public zzgg(zzfw zzfwVar, String str, Object[] objArr) {
        this.zza = zzfwVar;
        this.zzc = objArr;
        char charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i9);
            if (charAt2 < 55296) {
                this.zzd = (charAt2 << i8) | i7;
                return;
            } else {
                i7 |= (charAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.zzft
    public final zzfw zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzft
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.auth.zzft
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
