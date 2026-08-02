package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/CancelTransactionUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/CancelTransactionUseCase;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;)V", "", "invoke", "()V", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "getSoftspaceProxy", "()Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CancelTransactionUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.transaction.usecase.CancelTransactionUseCase, com.zettle.sdk.core.log.Loggable {
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy;

    public CancelTransactionUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        this.softspaceProxy = softspaceProxy;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    public final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getSoftspaceProxy() {
        return this.softspaceProxy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        invoke2();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.usecase.CancelTransactionUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.softspaceProxy.cancelTransaction();
    }
}
