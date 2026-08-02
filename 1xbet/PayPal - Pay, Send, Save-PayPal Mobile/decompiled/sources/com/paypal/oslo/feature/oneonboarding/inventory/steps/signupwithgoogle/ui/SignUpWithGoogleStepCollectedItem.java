package com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/ui/SignUpWithGoogleStepCollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "p0", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getComponentId-fHLlpbY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class SignUpWithGoogleStepCollectedItem implements com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem {
    private final java.lang.String getHighSpeedVideoSizes;

    private SignUpWithGoogleStepCollectedItem(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoSizes = str;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem
    /* renamed from: getComponentId-fHLlpbY, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.String m16613toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16613toStringimpl(this.getHighSpeedVideoSizes);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SignUpWithGoogleStepCollectedItem(getHighSpeedVideoSizes=");
        sb.append(m16613toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16612hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepCollectedItem) && com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16611equalsimpl0(this.getHighSpeedVideoSizes, ((com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepCollectedItem) p0).getHighSpeedVideoSizes);
    }

    public /* synthetic */ SignUpWithGoogleStepCollectedItem(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
