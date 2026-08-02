package com.zettle.sdk.feature.taptopay.core.attestation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResultListener;", "", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;", "attestationResult", "", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedActions", "", "onAttestationFinished", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;Ljava/util/List;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AttestationResultListener {
    void onAttestationFinished(com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult attestationResult, java.util.List<com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction> recommendedActions);
}
