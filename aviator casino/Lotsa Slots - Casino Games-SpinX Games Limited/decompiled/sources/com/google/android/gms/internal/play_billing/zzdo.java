package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzdo extends com.google.android.gms.internal.play_billing.zzdq {
    private zzdo() {
        throw null;
    }

    /* synthetic */ zzdo(com.google.android.gms.internal.play_billing.zzdn zzdnVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    final void zza(java.lang.Object obj, long j) {
        ((com.google.android.gms.internal.play_billing.zzcz) com.google.android.gms.internal.play_billing.zzfp.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    final void zzb(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.play_billing.zzcz zzczVar = (com.google.android.gms.internal.play_billing.zzcz) com.google.android.gms.internal.play_billing.zzfp.zzf(obj, j);
        com.google.android.gms.internal.play_billing.zzcz zzczVar2 = (com.google.android.gms.internal.play_billing.zzcz) com.google.android.gms.internal.play_billing.zzfp.zzf(obj2, j);
        int size = zzczVar.size();
        int size2 = zzczVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzczVar.zzc()) {
                zzczVar = zzczVar.zzd(size2 + size);
            }
            zzczVar.addAll(zzczVar2);
        }
        if (size > 0) {
            zzczVar2 = zzczVar;
        }
        com.google.android.gms.internal.play_billing.zzfp.zzs(obj, j, zzczVar2);
    }
}
