package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;

/* loaded from: classes.dex */
final class zzbu implements s {
    private final Status zza;
    private ProxyResponse zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public final ProxyResponse getResponse() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.zza;
    }

    public zzbu(ProxyResponse proxyResponse) {
        this.zzb = proxyResponse;
        this.zza = Status.f11077e;
    }
}
