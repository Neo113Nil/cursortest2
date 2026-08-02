package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class zas {
    final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult zaa;

    protected final void finalize() throws java.lang.Throwable {
        com.google.android.gms.common.api.Result result;
        result = this.zaa.zaj;
        com.google.android.gms.common.api.internal.BasePendingResult.zal(result);
        super.finalize();
    }

    /* synthetic */ zas(com.google.android.gms.common.api.internal.BasePendingResult basePendingResult, com.google.android.gms.common.api.internal.zar zarVar) {
        this.zaa = basePendingResult;
    }
}
