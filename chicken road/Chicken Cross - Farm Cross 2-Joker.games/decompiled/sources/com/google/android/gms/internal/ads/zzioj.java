package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzioj implements zziof {
    private static final Object zza = new Object();
    private volatile zziof zzb;
    private volatile Object zzc = zza;

    private zzioj(zziof zziofVar) {
        this.zzb = zziofVar;
    }

    public static zziof zza(zziof zziofVar) {
        return ((zziofVar instanceof zzioj) || (zziofVar instanceof zzinv)) ? zziofVar : new zzioj(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zziof zziofVar = this.zzb;
        if (zziofVar == null) {
            return this.zzc;
        }
        Object zzb = zziofVar.zzb();
        this.zzc = zzb;
        this.zzb = null;
        return zzb;
    }
}
