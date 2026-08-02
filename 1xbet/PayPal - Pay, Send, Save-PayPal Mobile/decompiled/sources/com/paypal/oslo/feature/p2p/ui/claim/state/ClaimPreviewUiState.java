package com.paypal.oslo.feature.p2p.ui.claim.state;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "Content", "Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState$Content;", "Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ClaimPreviewUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ClaimPreviewUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState$Loading;", "Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Loading INSTANCE = new com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Loading();

        public final int hashCode() {
            return -1312913945;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState$Content;", "Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState;", "Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "transactionId", "", "isClaimInProgress", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;Ljava/lang/String;Z)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState$Content;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;", "getData", "Ljava/lang/String;", "getTransactionId", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData data;
        private final boolean isClaimInProgress;
        private final java.lang.String transactionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData claimPreviewData, java.lang.String str, boolean z) {
            super("Content", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimPreviewData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.data = claimPreviewData;
            this.transactionId = str;
            this.isClaimInProgress = z;
        }

        public final com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData getData() {
            return this.data;
        }

        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public final boolean isClaimInProgress() {
            return this.isClaimInProgress;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData claimPreviewData = this.data;
            java.lang.String str = this.transactionId;
            boolean z = this.isClaimInProgress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(data=");
            sb.append(claimPreviewData);
            sb.append(", transactionId=");
            sb.append(str);
            sb.append(", isClaimInProgress=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.data.hashCode() * 31) + this.transactionId.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isClaimInProgress);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content content = (com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, content.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, content.transactionId) && this.isClaimInProgress == content.isClaimInProgress;
        }

        public final com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content copy(com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData data, java.lang.String transactionId, boolean isClaimInProgress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
            return new com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content(data, transactionId, isClaimInProgress);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsClaimInProgress() {
            return this.isClaimInProgress;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content copy$default(com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content content, com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData claimPreviewData, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                claimPreviewData = content.data;
            }
            if ((i & 2) != 0) {
                str = content.transactionId;
            }
            if ((i & 4) != 0) {
                z = content.isClaimInProgress;
            }
            return content.copy(claimPreviewData, str, z);
        }
    }

    public /* synthetic */ ClaimPreviewUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
