package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzbr extends com.google.android.gms.internal.auth.zzbd {
    final /* synthetic */ com.google.android.gms.internal.auth.zzbs zza;

    zzbr(com.google.android.gms.internal.auth.zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzc(java.lang.String str) {
        if (str != null) {
            this.zza.setResult((com.google.android.gms.internal.auth.zzbs) new com.google.android.gms.internal.auth.zzbv(str));
        } else {
            this.zza.setResult((com.google.android.gms.internal.auth.zzbs) new com.google.android.gms.internal.auth.zzbv(new com.google.android.gms.common.api.Status(com.google.android.gms.auth.api.proxy.AuthApiStatusCodes.AUTH_APP_CERT_ERROR)));
        }
    }
}
