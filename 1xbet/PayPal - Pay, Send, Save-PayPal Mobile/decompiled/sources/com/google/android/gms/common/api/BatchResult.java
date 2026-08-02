package com.google.android.gms.common.api;

/* loaded from: classes8.dex */
public final class BatchResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zaa;
    private final com.google.android.gms.common.api.PendingResult[] zab;

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final <R extends com.google.android.gms.common.api.Result> R take(com.google.android.gms.common.api.BatchResultToken<R> batchResultToken) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(batchResultToken.mId < this.zab.length, "The result token does not belong to this batch");
        return (R) this.zab[batchResultToken.mId].await(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zaa;
    }

    BatchResult(com.google.android.gms.common.api.Status status, com.google.android.gms.common.api.PendingResult[] pendingResultArr) {
        this.zaa = status;
        this.zab = pendingResultArr;
    }
}
