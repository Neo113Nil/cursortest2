package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0848w;
import com.google.android.gms.common.api.internal.InterfaceC0834h;
import com.google.android.gms.common.internal.C0860b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
final class zzo extends InterfaceC0834h.a {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0834h
    public final void onResult(Status status) {
        if (status.a == 6) {
            this.zza.trySetException(C0860b.a(status));
        } else {
            C0848w.a(status, null, this.zza);
        }
    }
}
