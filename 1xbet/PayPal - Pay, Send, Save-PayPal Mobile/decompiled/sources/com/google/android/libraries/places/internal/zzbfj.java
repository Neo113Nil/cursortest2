package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbfj implements com.google.android.libraries.places.internal.zzbeu {
    private final com.google.android.libraries.places.internal.zzbex zza;
    private final java.lang.String zzb;
    private final java.lang.Object[] zzc;
    private final int zzd;

    zzbfj(com.google.android.libraries.places.internal.zzbex zzbexVar, java.lang.String str, java.lang.Object[] objArr) {
        this.zza = zzbexVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i2);
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

    @Override // com.google.android.libraries.places.internal.zzbeu
    public final int zzc() {
        int i = this.zzd;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    @Override // com.google.android.libraries.places.internal.zzbeu
    public final com.google.android.libraries.places.internal.zzbex zzb() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbeu
    public final boolean zza() {
        return (this.zzd & 2) == 2;
    }
}
