package com.zettle.sdk.feature.taptopay.core.attestation.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;)V", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResultListener;", "attestationResult", "", "invoke", "(Landroid/content/Context;Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResultListener;)V", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AttestationUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getHighResolutionOutputSizeshNQ4ISI;

    public AttestationUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = softspaceProxy;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(android.content.Context context, com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener attestationResultListener) {
        invoke2(context, attestationResultListener);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(android.content.Context context, com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener attestationResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationResult, "");
        this.getHighResolutionOutputSizeshNQ4ISI.attest(context, attestationResult);
    }
}
