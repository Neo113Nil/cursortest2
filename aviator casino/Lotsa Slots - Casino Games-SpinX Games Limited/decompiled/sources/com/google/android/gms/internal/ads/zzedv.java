package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzedv {
    private final android.content.Context zza;
    private com.google.android.gms.internal.ads.zzarx zzb;

    zzedv(android.content.Context context) {
        this.zza = context;
    }

    public final void zza() {
        this.zzb = com.google.android.gms.internal.ads.zzarw.zza(this.zza);
    }

    public final void zzb(com.google.android.gms.internal.ads.zzasa zzasaVar) {
        this.zzb.zzb(zzasaVar);
    }

    public final void zzc() {
        this.zzb.zzc();
    }

    public final com.google.android.gms.internal.ads.zzasb zzd() {
        try {
            com.google.android.gms.internal.ads.zzarx zzarxVar = this.zzb;
            if (zzarxVar == null || !zzarxVar.zza()) {
                return null;
            }
            return zzarxVar.zzd();
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }
}
