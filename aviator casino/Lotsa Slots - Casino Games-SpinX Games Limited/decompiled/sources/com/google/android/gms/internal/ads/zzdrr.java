package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdrr implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdrt zza;

    zzdrr(com.google.android.gms.internal.ads.zzdrt zzdrtVar) {
        java.util.Objects.requireNonNull(zzdrtVar);
        this.zza = zzdrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgs)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(java.util.List list) {
        try {
            com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) list.get(0);
            if (zzckuVar != null) {
                this.zza.zza(zzckuVar);
            }
        } catch (java.lang.ClassCastException | java.lang.IndexOutOfBoundsException e) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgs)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "omid native display exp");
            }
        }
    }
}
