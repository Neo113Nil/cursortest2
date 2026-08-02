package com.zettle.sdk.feature.taptopay.core.attestation.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationResetCacheUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationResetCacheUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;)V", "", "invoke", "()V", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "getSoftspaceProxy", "()Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AttestationResetCacheUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationResetCacheUseCase {
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy;

    public AttestationResetCacheUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        this.softspaceProxy = softspaceProxy;
    }

    public final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getSoftspaceProxy() {
        return this.softspaceProxy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        invoke2();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationResetCacheUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.softspaceProxy.resetAttestationCache();
    }
}
