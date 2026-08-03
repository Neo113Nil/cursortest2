package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfvc implements java.lang.Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfvd zzb;

    zzfvc(com.google.android.gms.internal.ads.zzfvd zzfvdVar, float f) {
        this.zza = f;
        java.util.Objects.requireNonNull(zzfvdVar);
        this.zzb = zzfvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
