package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzbp extends com.google.android.gms.internal.auth.zzbd {
    final /* synthetic */ com.google.android.gms.internal.auth.zzbq zza;

    zzbp(com.google.android.gms.internal.auth.zzbq zzbqVar) {
        this.zza = zzbqVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(com.google.android.gms.auth.api.proxy.ProxyResponse proxyResponse) {
        this.zza.setResult((com.google.android.gms.internal.auth.zzbq) new com.google.android.gms.internal.auth.zzbu(proxyResponse));
    }
}
