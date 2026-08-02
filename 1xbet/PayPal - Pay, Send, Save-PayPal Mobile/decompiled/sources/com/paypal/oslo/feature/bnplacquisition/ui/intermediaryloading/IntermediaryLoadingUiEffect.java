package com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToVirtualCardOverview", "NavigateToEnterAmount", "NavigateToRequireScreenLock", "CloseAcquisition", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect$NavigateToEnterAmount;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect$NavigateToRequireScreenLock;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect$NavigateToVirtualCardOverview;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class IntermediaryLoadingUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private IntermediaryLoadingUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect$NavigateToVirtualCardOverview;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect;", "", "creditAccountId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect$NavigateToVirtualCardOverview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToVirtualCardOverview extends com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToVirtualCardOverview(java.lang.String str) {
            super("NavigateToVirtualCardOverview", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.creditAccountId = str;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToVirtualCardOverview(creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.creditAccountId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToVirtualCardOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ((com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToVirtualCardOverview) other).creditAccountId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToVirtualCardOverview copy(java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToVirtualCardOverview(creditAccountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToVirtualCardOverview copy$default(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToVirtualCardOverview navigateToVirtualCardOverview, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToVirtualCardOverview.creditAccountId;
            }
            return navigateToVirtualCardOverview.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect$NavigateToEnterAmount;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToEnterAmount extends com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToEnterAmount INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToEnterAmount();

        public final int hashCode() {
            return 2001230919;
        }

        private NavigateToEnterAmount() {
            super("NavigateToEnterAmount", null);
        }

        public final java.lang.String toString() {
            return "NavigateToEnterAmount";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToEnterAmount)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect$NavigateToRequireScreenLock;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToRequireScreenLock extends com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToRequireScreenLock INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToRequireScreenLock();

        public final int hashCode() {
            return 137514163;
        }

        private NavigateToRequireScreenLock() {
            super("NavigateToRequireScreenLock", null);
        }

        public final java.lang.String toString() {
            return "NavigateToRequireScreenLock";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToRequireScreenLock)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseAcquisition extends com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.CloseAcquisition INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.CloseAcquisition();

        public final int hashCode() {
            return -1194083790;
        }

        private CloseAcquisition() {
            super("CloseAcquisition", null);
        }

        public final java.lang.String toString() {
            return "CloseAcquisition";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.CloseAcquisition)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ IntermediaryLoadingUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
