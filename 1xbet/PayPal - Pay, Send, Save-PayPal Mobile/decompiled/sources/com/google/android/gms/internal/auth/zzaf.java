package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzaf extends com.google.android.gms.internal.auth.zzah {
    final /* synthetic */ com.google.android.gms.internal.auth.zzag zza;

    zzaf(com.google.android.gms.internal.auth.zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
    public final void zzc(boolean z) {
        this.zza.setResult((com.google.android.gms.internal.auth.zzag) new com.google.android.gms.internal.auth.zzak(z ? com.google.android.gms.common.api.Status.RESULT_SUCCESS : com.google.android.gms.internal.auth.zzal.zza));
    }
}
