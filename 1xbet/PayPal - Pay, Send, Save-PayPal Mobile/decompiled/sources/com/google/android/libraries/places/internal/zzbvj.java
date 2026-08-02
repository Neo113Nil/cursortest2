package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvk zza;

    zzbvj(com.google.android.libraries.places.internal.zzbvk zzbvkVar) {
        java.util.Objects.requireNonNull(zzbvkVar);
        this.zza = zzbvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbvk zzbvkVar = this.zza;
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = zzbvkVar.zzd.zza;
        if (zzbvrVar.zzI() != null) {
            zzbvrVar.zzI().remove(zzbvkVar);
            if (zzbvrVar.zzI().isEmpty()) {
                zzbvrVar.zzf.zza(zzbvrVar.zzK(), false);
                zzbvrVar.zzJ(null);
                if (zzbvrVar.zzN().get()) {
                    zzbvrVar.zzM().zza(com.google.android.libraries.places.internal.zzbvr.zzc);
                }
            }
        }
    }
}
