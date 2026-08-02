package com.zettle.sdk.feature.taptopay.core.attestation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "AttestationOK", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult$AttestationOK;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AttestationResult {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    private AttestationResult(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    /* renamed from: toString, reason: from getter */
    public java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult$AttestationOK;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AttestationOK extends com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult.AttestationOK INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult.AttestationOK();

        private AttestationOK() {
            super("AttestationOK", null);
        }
    }

    public /* synthetic */ AttestationResult(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
