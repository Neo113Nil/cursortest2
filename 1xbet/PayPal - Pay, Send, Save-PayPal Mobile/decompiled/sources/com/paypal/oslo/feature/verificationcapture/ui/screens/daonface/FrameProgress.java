package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameProgress;", "", "", "collected", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY, "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameProgress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCollected", "getRequired", "isComplete", "Z", "()Z", "remaining", "getRemaining"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FrameProgress {
    public static final int $stable = 0;
    private final int collected;
    private final boolean isComplete;
    private final int remaining;
    private final int required;

    public FrameProgress(int i, int i2) {
        this.collected = i;
        this.required = i2;
        this.isComplete = i >= i2;
        this.remaining = java.lang.Math.max(0, i2 - i);
    }

    public final int getCollected() {
        return this.collected;
    }

    public final int getRequired() {
        return this.required;
    }

    /* renamed from: isComplete, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    public final int getRemaining() {
        return this.remaining;
    }

    public final java.lang.String toString() {
        int i = this.collected;
        int i2 = this.required;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrameProgress(collected=");
        sb.append(i);
        sb.append(", required=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.collected) * 31) + java.lang.Integer.hashCode(this.required);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameProgress)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameProgress frameProgress = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameProgress) other;
        return this.collected == frameProgress.collected && this.required == frameProgress.required;
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameProgress copy(int collected, int required) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameProgress(collected, required);
    }

    /* renamed from: component2, reason: from getter */
    public final int getRequired() {
        return this.required;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCollected() {
        return this.collected;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameProgress copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameProgress frameProgress, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = frameProgress.collected;
        }
        if ((i3 & 2) != 0) {
            i2 = frameProgress.required;
        }
        return frameProgress.copy(i, i2);
    }
}
