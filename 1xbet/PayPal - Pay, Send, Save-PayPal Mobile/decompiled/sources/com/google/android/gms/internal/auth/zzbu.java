package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzbu implements com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult {
    private final com.google.android.gms.common.api.Status zza;
    private com.google.android.gms.auth.api.proxy.ProxyResponse zzb;

    public zzbu(com.google.android.gms.auth.api.proxy.ProxyResponse proxyResponse) {
        this.zzb = proxyResponse;
        this.zza = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult
    public final com.google.android.gms.auth.api.proxy.ProxyResponse getResponse() {
        return this.zzb;
    }

    public zzbu(com.google.android.gms.common.api.Status status) {
        this.zza = status;
    }
}
