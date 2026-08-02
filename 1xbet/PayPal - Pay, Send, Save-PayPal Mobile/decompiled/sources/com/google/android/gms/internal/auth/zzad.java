package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzad extends com.google.android.gms.internal.auth.zzah {
    final /* synthetic */ com.google.android.gms.internal.auth.zzae zza;

    zzad(com.google.android.gms.internal.auth.zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
    public final void zzb(android.accounts.Account account) {
        this.zza.setResult((com.google.android.gms.internal.auth.zzae) new com.google.android.gms.internal.auth.zzai(account != null ? com.google.android.gms.common.api.Status.RESULT_SUCCESS : com.google.android.gms.internal.auth.zzal.zza, account));
    }
}
