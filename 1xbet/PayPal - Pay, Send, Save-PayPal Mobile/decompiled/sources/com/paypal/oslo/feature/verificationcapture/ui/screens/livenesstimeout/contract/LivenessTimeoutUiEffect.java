package com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.contract;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenesstimeout/contract/LivenessTimeoutUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToRetryLiveness", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenesstimeout/contract/LivenessTimeoutUiEffect$NavigateToRetryLiveness;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class LivenessTimeoutUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private LivenessTimeoutUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenesstimeout/contract/LivenessTimeoutUiEffect$NavigateToRetryLiveness;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenesstimeout/contract/LivenessTimeoutUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToRetryLiveness extends com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.contract.LivenessTimeoutUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.contract.LivenessTimeoutUiEffect.NavigateToRetryLiveness INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.contract.LivenessTimeoutUiEffect.NavigateToRetryLiveness();

        public final int hashCode() {
            return -729854859;
        }

        private NavigateToRetryLiveness() {
            super("LivenessTimeoutUiEffect.NavigateToRetryLiveness", null);
        }

        public final java.lang.String toString() {
            return "NavigateToRetryLiveness";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.contract.LivenessTimeoutUiEffect.NavigateToRetryLiveness)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ LivenessTimeoutUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
