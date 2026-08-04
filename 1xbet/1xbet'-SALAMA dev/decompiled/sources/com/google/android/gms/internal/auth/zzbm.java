package com.google.android.gms.internal.auth;

import Y4.D;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zzbm extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzbm(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(ProxyResponse proxyResponse) {
        D.U(new Status(proxyResponse.f11011a, null, null, null), proxyResponse, this.zza);
    }
}
