package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0832i;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzx extends AbstractBinderC0832i {
    final /* synthetic */ TaskCompletionSource zza;

    public zzx(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0833j
    public final void onResult(Status status) {
        zzab.zzf(status, null, this.zza);
    }
}
