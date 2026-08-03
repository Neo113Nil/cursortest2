package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
final class zzp implements android.os.Handler.Callback {
    final /* synthetic */ com.google.android.gms.common.internal.zzq zza;

    /* synthetic */ zzp(com.google.android.gms.common.internal.zzq zzqVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzqVar);
        this.zza = zzqVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 0) {
            com.google.android.gms.common.internal.zzq zzqVar = this.zza;
            synchronized (zzqVar.zzf()) {
                com.google.android.gms.common.internal.zzn zznVar = (com.google.android.gms.common.internal.zzn) message.obj;
                com.google.android.gms.common.internal.zzo zzoVar = (com.google.android.gms.common.internal.zzo) zzqVar.zzf().get(zznVar);
                if (zzoVar != null && zzoVar.zzg()) {
                    if (zzoVar.zzd()) {
                        zzoVar.zza("GmsClientSupervisor");
                    }
                    zzqVar.zzf().remove(zznVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.internal.zzq zzqVar2 = this.zza;
        synchronized (zzqVar2.zzf()) {
            com.google.android.gms.common.internal.zzn zznVar2 = (com.google.android.gms.common.internal.zzn) message.obj;
            com.google.android.gms.common.internal.zzo zzoVar2 = (com.google.android.gms.common.internal.zzo) zzqVar2.zzf().get(zznVar2);
            if (zzoVar2 != null && zzoVar2.zze() == 3) {
                java.lang.String valueOf = java.lang.String.valueOf(zznVar2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(valueOf);
                android.util.Log.e("GmsClientSupervisor", sb.toString(), new java.lang.Exception());
                android.content.ComponentName zzi = zzoVar2.zzi();
                if (zzi == null) {
                    zzi = zznVar2.zzc();
                }
                if (zzi == null) {
                    java.lang.String zzb = zznVar2.zzb();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb);
                    java.lang.String str = zzb;
                    zzi = new android.content.ComponentName(zzb, "unknown");
                }
                zzoVar2.onServiceDisconnected(zzi);
            }
        }
        return true;
    }
}
