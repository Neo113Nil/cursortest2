package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzepp implements com.google.android.gms.internal.ads.zzdno {
    final /* synthetic */ com.google.android.gms.internal.ads.zzelv zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfkf zzb;

    zzepp(com.google.android.gms.internal.ads.zzepq zzepqVar, com.google.android.gms.internal.ads.zzelv zzelvVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        this.zza = zzelvVar;
        this.zzb = zzfkfVar;
        java.util.Objects.requireNonNull(zzepqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzdde zzddeVar) throws com.google.android.gms.internal.ads.zzdnn {
        try {
            com.google.android.gms.internal.ads.zzflw zzflwVar = (com.google.android.gms.internal.ads.zzflw) this.zza.zzb;
            zzflwVar.zzs(z);
            zzflwVar.zzw(context);
        } catch (com.google.android.gms.internal.ads.zzflf e) {
            throw new com.google.android.gms.internal.ads.zzdnn(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final com.google.android.gms.internal.ads.zzfkf zzb() {
        return this.zzb;
    }
}
