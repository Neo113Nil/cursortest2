package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
final class zzs extends com.google.android.gms.internal.safetynet.zzd {
    final /* synthetic */ com.google.android.gms.internal.safetynet.zzt zza;

    zzs(com.google.android.gms.internal.safetynet.zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzb(com.google.android.gms.common.api.Status status, boolean z) {
        this.zza.setResult((com.google.android.gms.internal.safetynet.zzt) new com.google.android.gms.internal.safetynet.zzad(status, z));
    }
}
