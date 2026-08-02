package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
final class zzy extends com.google.android.gms.internal.safetynet.zzd {
    final /* synthetic */ com.google.android.gms.internal.safetynet.zzz zza;

    zzy(com.google.android.gms.internal.safetynet.zzz zzzVar) {
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzj(com.google.android.gms.common.api.Status status, com.google.android.gms.safetynet.SafeBrowsingData safeBrowsingData) {
        this.zza.setResult((com.google.android.gms.internal.safetynet.zzz) new com.google.android.gms.internal.safetynet.zzac(status, safeBrowsingData));
    }
}
