package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0832i;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzu extends AbstractBinderC0832i {
    final /* synthetic */ TaskCompletionSource zza;

    public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0833j
    public final void onResult(Status status) {
        if (status.f11082a == 6) {
            this.zza.trySetException(D.n(status));
        } else {
            Y4.D.U(status, null, this.zza);
        }
    }
}
