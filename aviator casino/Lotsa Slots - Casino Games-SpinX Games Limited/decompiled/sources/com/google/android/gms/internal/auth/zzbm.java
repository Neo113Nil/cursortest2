package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzbm extends com.google.android.gms.internal.auth.zzbd {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzbm(com.google.android.gms.internal.auth.zzbo zzboVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(com.google.android.gms.auth.api.proxy.ProxyResponse proxyResponse) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(new com.google.android.gms.common.api.Status(proxyResponse.googlePlayServicesStatusCode), proxyResponse, this.zza);
    }
}
