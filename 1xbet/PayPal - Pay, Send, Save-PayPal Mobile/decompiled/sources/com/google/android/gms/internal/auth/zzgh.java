package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzgh implements com.google.android.gms.internal.auth.zzfu {
    private final com.google.android.gms.internal.auth.zzfx zza;
    private final java.lang.String zzb = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
    private final java.lang.Object[] zzc;
    private final int zzd;

    zzgh(com.google.android.gms.internal.auth.zzfx zzfxVar, java.lang.String str, java.lang.Object[] objArr) {
        this.zza = zzfxVar;
        this.zzc = objArr;
        char charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i3);
            if (charAt2 < 55296) {
                this.zzd = (charAt2 << i2) | i;
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3++;
            }
        }
    }

    final java.lang.Object[] zze() {
        return this.zzc;
    }

    final java.lang.String zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final int zzc() {
        return (this.zzd & 1) != 0 ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final com.google.android.gms.internal.auth.zzfx zza() {
        return this.zza;
    }
}
