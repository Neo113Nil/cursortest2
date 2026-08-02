package com.zettle.sdk.feature.taptopay.core.attestation.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/FullAttestationUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/FullAttestationUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;)V", "Landroid/content/Context;", "context", "", "fullProvisioning", "fullAttestation", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResultListener;", "attestationResult", "", "invoke", "(Landroid/content/Context;ZZLcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResultListener;)V", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FullAttestationUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.attestation.usecase.FullAttestationUseCase {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getHighResolutionOutputSizeshNQ4ISI;

    public FullAttestationUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = softspaceProxy;
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ kotlin.Unit invoke(android.content.Context context, java.lang.Boolean bool, java.lang.Boolean bool2, com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener attestationResultListener) {
        invoke(context, bool.booleanValue(), bool2.booleanValue(), attestationResultListener);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.attestation.usecase.FullAttestationUseCase
    public final void invoke(android.content.Context context, boolean fullProvisioning, boolean fullAttestation, com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener attestationResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationResult, "");
        this.getHighResolutionOutputSizeshNQ4ISI.attestFull(context, true, true, attestationResult);
    }
}
