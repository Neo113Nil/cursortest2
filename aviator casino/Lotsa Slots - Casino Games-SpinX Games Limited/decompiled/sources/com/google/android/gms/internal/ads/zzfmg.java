package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfmg implements com.google.android.gms.internal.ads.zzdcu {
    private final java.util.HashSet zza = new java.util.HashSet();
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzcfi zzc;

    public zzfmg(android.content.Context context, com.google.android.gms.internal.ads.zzcfi zzcfiVar) {
        this.zzb = context;
        this.zzc = zzcfiVar;
    }

    public final synchronized void zzb(java.util.HashSet hashSet) {
        java.util.HashSet hashSet2 = this.zza;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final android.os.Bundle zzc() {
        return this.zzc.zzn(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final synchronized void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzc(this.zza);
        }
    }
}
