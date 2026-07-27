package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaw {
    private final zzr zza = new zzr();

    static {
        zzr zzrVar = new zzr();
        zzrVar.zzb(16, 17, 18, 21, 22, 23, 28, 30);
        zzrVar.zzc();
        zzr zzrVar2 = new zzr();
        zzrVar2.zzb(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 31, 20, 24, 25, 33, 26, 34, 35, 27, 29, 32);
        zzrVar2.zzc();
    }

    public final zzaw zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzaw zzb(int i, boolean z) {
        if (z) {
            this.zza.zza(i);
        }
        return this;
    }

    public final zzaw zzc(int... iArr) {
        this.zza.zzb(iArr);
        return this;
    }

    public final zzaw zzd(zzax zzaxVar) {
        zzs zza = zzaxVar.zza();
        for (int i = 0; i < zza.zzb(); i++) {
            this.zza.zza(zza.zzc(i));
        }
        return this;
    }

    public final zzax zze() {
        return new zzax(this.zza.zzc(), null);
    }
}
