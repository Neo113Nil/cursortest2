package com.paypal.oslo.feature.pools.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/error/PoolsLoadException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError;", "poolError", "<init>", "(Lcom/paypal/oslo/feature/pools/domain/error/PoolError;)V", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError;", "getPoolError", "()Lcom/paypal/oslo/feature/pools/domain/error/PoolError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolsLoadException extends java.lang.Exception {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.pools.domain.error.PoolError poolError;

    public final com.paypal.oslo.feature.pools.domain.error.PoolError getPoolError() {
        return this.poolError;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PoolsLoadException(com.paypal.oslo.feature.pools.domain.error.PoolError poolError) {
        super(r1.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolError, "");
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(poolError.getClass()).getSimpleName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(simpleName);
        sb.append(": ");
        sb.append(poolError);
        this.poolError = poolError;
    }
}
