package com.zettle.sdk.feature.taptopay.core.attestation;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class AttestationImpl$state$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State, com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State state, com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State state2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state2, "");
        com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl.getHighResolutionOutputSizeshNQ4ISI((com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl) this.receiver, state, state2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State state, com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State state2) {
        getHighSpeedVideoSizes(state, state2);
        return kotlin.Unit.INSTANCE;
    }

    AttestationImpl$state$1(java.lang.Object obj) {
        super(2, obj, com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl.class, "onMutate", "onMutate(Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;)V", 0);
    }
}
