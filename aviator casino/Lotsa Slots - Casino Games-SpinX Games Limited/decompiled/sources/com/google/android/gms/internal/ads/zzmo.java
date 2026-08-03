package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzmo implements com.google.android.gms.internal.ads.zzmg {
    public final com.google.android.gms.internal.ads.zzxf zza;
    public int zzd;
    public boolean zze;
    public final java.util.List zzc = new java.util.ArrayList();
    public final java.lang.Object zzb = new java.lang.Object();

    public zzmo(com.google.android.gms.internal.ads.zzxm zzxmVar, boolean z) {
        this.zza = new com.google.android.gms.internal.ads.zzxf(zzxmVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final java.lang.Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final com.google.android.gms.internal.ads.zzbf zzb() {
        return this.zza.zzz();
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
