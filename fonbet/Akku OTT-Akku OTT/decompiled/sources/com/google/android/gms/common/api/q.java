package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.l;

/* loaded from: classes4.dex */
public final class q<R extends l> extends BasePendingResult<R> {
    public final Status a;

    public q(Status status) {
        super((h) null);
        this.a = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return this.a;
    }
}
