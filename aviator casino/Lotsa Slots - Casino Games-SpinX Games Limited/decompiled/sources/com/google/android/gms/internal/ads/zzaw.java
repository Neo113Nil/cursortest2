package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaw {
    private final com.google.android.gms.internal.ads.zzr zza = new com.google.android.gms.internal.ads.zzr();

    public final com.google.android.gms.internal.ads.zzaw zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaw zzb(int i, boolean z) {
        if (z) {
            this.zza.zza(i);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaw zzc(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.zza.zza(iArr[i]);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaw zzd(com.google.android.gms.internal.ads.zzax zzaxVar) {
        com.google.android.gms.internal.ads.zzs zza = zzaxVar.zza();
        for (int i = 0; i < zza.zzb(); i++) {
            this.zza.zza(zza.zzc(i));
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzax zze() {
        return new com.google.android.gms.internal.ads.zzax(this.zza.zzb(), null);
    }
}
