package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
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
