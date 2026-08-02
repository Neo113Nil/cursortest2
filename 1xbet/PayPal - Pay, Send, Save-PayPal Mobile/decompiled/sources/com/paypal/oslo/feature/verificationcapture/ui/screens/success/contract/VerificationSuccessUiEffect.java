package com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/contract/VerificationSuccessUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ExitFlow", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/contract/VerificationSuccessUiEffect$ExitFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class VerificationSuccessUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private VerificationSuccessUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/contract/VerificationSuccessUiEffect$ExitFlow;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/contract/VerificationSuccessUiEffect;", "", "verificationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/success/contract/VerificationSuccessUiEffect$ExitFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getVerificationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExitFlow extends com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiEffect {
        public static final int $stable = 0;
        private final java.lang.String verificationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExitFlow(java.lang.String str) {
            super("VerificationSuccessUiEffect.ExitFlow", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.verificationId = str;
        }

        public final java.lang.String getVerificationId() {
            return this.verificationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.verificationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExitFlow(verificationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.verificationId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiEffect.ExitFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.verificationId, ((com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiEffect.ExitFlow) other).verificationId);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiEffect.ExitFlow copy(java.lang.String verificationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationId, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiEffect.ExitFlow(verificationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getVerificationId() {
            return this.verificationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiEffect.ExitFlow copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.success.contract.VerificationSuccessUiEffect.ExitFlow exitFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = exitFlow.verificationId;
            }
            return exitFlow.copy(str);
        }
    }

    public /* synthetic */ VerificationSuccessUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
