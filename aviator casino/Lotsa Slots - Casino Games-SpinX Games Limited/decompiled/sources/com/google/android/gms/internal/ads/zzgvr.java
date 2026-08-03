package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgvr extends com.google.android.gms.internal.ads.zzgvd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvt zza;
    private final java.lang.Object zzb;
    private int zzc;

    zzgvr(com.google.android.gms.internal.ads.zzgvt zzgvtVar, int i) {
        java.util.Objects.requireNonNull(zzgvtVar);
        this.zza = zzgvtVar;
        this.zzb = zzgvtVar.zzo(i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i != -1) {
            com.google.android.gms.internal.ads.zzgvt zzgvtVar = this.zza;
            if (i < zzgvtVar.size() && java.util.Objects.equals(this.zzb, zzgvtVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, java.util.Map.Entry
    public final java.lang.Object getValue() {
        com.google.android.gms.internal.ads.zzgvt zzgvtVar = this.zza;
        java.util.Map zzc = zzgvtVar.zzc();
        if (zzc != null) {
            return zzc.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzgvtVar.zzp(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzgvt zzgvtVar = this.zza;
        java.util.Map zzc = zzgvtVar.zzc();
        if (zzc != null) {
            return zzc.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzgvtVar.put(this.zzb, obj);
            return null;
        }
        java.lang.Object zzp = zzgvtVar.zzp(i);
        zzgvtVar.zzq(this.zzc, obj);
        return zzp;
    }
}
