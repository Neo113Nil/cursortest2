package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdbp implements com.google.android.gms.internal.ads.zzdef, com.google.android.gms.internal.ads.zzddm {
    private final com.google.android.gms.internal.ads.zzfkf zza;

    public zzdbp(android.content.Context context, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzbzg zzbzgVar) {
        this.zza = zzfkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zza(android.content.Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzb(android.content.Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzc(android.content.Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        com.google.android.gms.internal.ads.zzbzh zzbzhVar = this.zza.zzad;
        if (zzbzhVar == null || !zzbzhVar.zza) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = zzbzhVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }
}
