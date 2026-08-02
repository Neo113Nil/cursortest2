package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth@@18.1.0 */
/* loaded from: classes2.dex */
final class zzai extends IStatusCallback.Stub {
    private final /* synthetic */ TaskCompletionSource zzbn;

    zzai(zzaf zzafVar, TaskCompletionSource taskCompletionSource) {
        this.zzbn = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) throws RemoteException {
        TaskUtil.setResultOrApiException(status, this.zzbn);
    }
}
