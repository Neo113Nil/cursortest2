package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zznv implements com.google.android.gms.internal.measurement.zzni {
    private final com.google.android.gms.internal.measurement.zznl zza;
    private final java.lang.String zzb;
    private final java.lang.Object[] zzc;
    private final int zzd;

    zznv(com.google.android.gms.internal.measurement.zznl zznlVar, java.lang.String str, java.lang.Object[] objArr) {
        this.zza = zznlVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i3);
                return;
            } else {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final boolean zza() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final com.google.android.gms.internal.measurement.zznl zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final int zzc() {
        int i = this.zzd;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    final java.lang.String zzd() {
        return this.zzb;
    }

    final java.lang.Object[] zze() {
        return this.zzc;
    }
}
