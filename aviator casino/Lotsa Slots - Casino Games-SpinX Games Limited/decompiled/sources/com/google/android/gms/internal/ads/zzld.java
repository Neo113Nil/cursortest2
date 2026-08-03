package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzld implements com.google.android.gms.internal.ads.zzmg {
    private final java.lang.Object zza;
    private com.google.android.gms.internal.ads.zzbf zzb;

    public zzld(java.lang.Object obj, com.google.android.gms.internal.ads.zzxf zzxfVar) {
        this.zza = obj;
        this.zzb = zzxfVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final java.lang.Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final com.google.android.gms.internal.ads.zzbf zzb() {
        return this.zzb;
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbf zzbfVar) {
        this.zzb = zzbfVar;
    }
}
