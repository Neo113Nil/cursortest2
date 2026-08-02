package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-auth@@18.1.0 */
/* loaded from: classes2.dex */
final class zzp extends zzh {
    private BaseImplementation.ResultHolder<Status> zzaq;

    zzp(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zzaq = resultHolder;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzh, com.google.android.gms.internal.p000authapi.zzv
    public final void zzd(Status status) {
        this.zzaq.setResult(status);
    }
}
