package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019B'\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\u0082\u0001\u0005\u001a\u001b\u001c\u001d\u001e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "p1", "", "p2", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;Z)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "lastFailedAction", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "getLastFailedAction", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "isRefreshEnabled", "Z", "()Z", "Loading", "Success", "Error", "Provisioning", "Decline", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Decline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Loading;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Provisioning;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class VirtualCardOverviewUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final boolean isRefreshEnabled;
    private final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction;
    private final java.lang.String name;

    private VirtualCardOverviewUiState(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, boolean z) {
        this.name = str;
        this.lastFailedAction = lastFailedAction;
        this.isRefreshEnabled = z;
    }

    public /* synthetic */ VirtualCardOverviewUiState(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : lastFailedAction, (i & 4) != 0 ? false : z, null);
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction getLastFailedAction() {
        return this.lastFailedAction;
    }

    /* renamed from: isRefreshEnabled, reason: from getter */
    public boolean getIsRefreshEnabled() {
        return this.isRefreshEnabled;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Loading;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "lastFailedAction", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;)Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "getLastFailedAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction;

        public Loading(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction) {
            super("Loading", lastFailedAction, false, 4, null);
            this.lastFailedAction = lastFailedAction;
        }

        public /* synthetic */ Loading(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : lastFailedAction);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState
        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction getLastFailedAction() {
            return this.lastFailedAction;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction = this.lastFailedAction;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(lastFailedAction=");
            sb.append(lastFailedAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction = this.lastFailedAction;
            if (lastFailedAction == null) {
                return 0;
            }
            return lastFailedAction.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading) && this.lastFailedAction == ((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading) other).lastFailedAction;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading copy(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading(lastFailedAction);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction getLastFailedAction() {
            return this.lastFailedAction;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading copy$default(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading loading, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                lastFailedAction = loading.lastFailedAction;
            }
            return loading.copy(lastFailedAction);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Success;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;", "uiModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "lastFailedAction", "", "isRefreshEnabled", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;Z)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "getLastFailedAction", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState {
        public static final int $stable = 8;
        private final boolean isRefreshEnabled;
        private final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction;
        private final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, boolean z) {
            super("Success", lastFailedAction, z, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCardOverviewUiModel, "");
            this.uiModel = virtualCardOverviewUiModel;
            this.lastFailedAction = lastFailedAction;
            this.isRefreshEnabled = z;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(virtualCardOverviewUiModel, (i & 2) != 0 ? null : lastFailedAction, (i & 4) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel getUiModel() {
            return this.uiModel;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState
        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction getLastFailedAction() {
            return this.lastFailedAction;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState
        /* renamed from: isRefreshEnabled */
        public final boolean getIsRefreshEnabled() {
            return this.isRefreshEnabled;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel = this.uiModel;
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction = this.lastFailedAction;
            boolean z = this.isRefreshEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(uiModel=");
            sb.append(virtualCardOverviewUiModel);
            sb.append(", lastFailedAction=");
            sb.append(lastFailedAction);
            sb.append(", isRefreshEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.uiModel.hashCode();
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction = this.lastFailedAction;
            return (((hashCode * 31) + (lastFailedAction == null ? 0 : lastFailedAction.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isRefreshEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, success.uiModel) && this.lastFailedAction == success.lastFailedAction && this.isRefreshEnabled == success.isRefreshEnabled;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success copy(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel uiModel, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, boolean isRefreshEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success(uiModel, lastFailedAction, isRefreshEnabled);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRefreshEnabled() {
            return this.isRefreshEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction getLastFailedAction() {
            return this.lastFailedAction;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success copy$default(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success success, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                virtualCardOverviewUiModel = success.uiModel;
            }
            if ((i & 2) != 0) {
                lastFailedAction = success.lastFailedAction;
            }
            if ((i & 4) != 0) {
                z = success.isRefreshEnabled;
            }
            return success.copy(virtualCardOverviewUiModel, lastFailedAction, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "errorType", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "lastFailedAction", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;", "previousModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "component4", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "getErrorType", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "getLastFailedAction", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;", "getPreviousModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType errorType;
        private final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction;
        private final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel previousModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType fullscreenErrorType, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel) {
            super("Error", lastFailedAction, false, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.errorType = fullscreenErrorType;
            this.errorContent = fullscreenErrorUiModel;
            this.lastFailedAction = lastFailedAction;
            this.previousModel = virtualCardOverviewUiModel;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType fullscreenErrorType, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(fullscreenErrorType, fullscreenErrorUiModel, lastFailedAction, (i & 8) != 0 ? null : virtualCardOverviewUiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType getErrorType() {
            return this.errorType;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState
        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction getLastFailedAction() {
            return this.lastFailedAction;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel getPreviousModel() {
            return this.previousModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType fullscreenErrorType = this.errorType;
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction = this.lastFailedAction;
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel = this.previousModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorType=");
            sb.append(fullscreenErrorType);
            sb.append(", errorContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(", lastFailedAction=");
            sb.append(lastFailedAction);
            sb.append(", previousModel=");
            sb.append(virtualCardOverviewUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorType.hashCode();
            int hashCode2 = this.errorContent.hashCode();
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction = this.lastFailedAction;
            int hashCode3 = lastFailedAction == null ? 0 : lastFailedAction.hashCode();
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel = this.previousModel;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (virtualCardOverviewUiModel != null ? virtualCardOverviewUiModel.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorType, error.errorType) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, error.errorContent) && this.lastFailedAction == error.lastFailedAction && kotlin.jvm.internal.Intrinsics.areEqual(this.previousModel, error.previousModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType errorType, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel previousModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error(errorType, errorContent, lastFailedAction, previousModel);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel getPreviousModel() {
            return this.previousModel;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction getLastFailedAction() {
            return this.lastFailedAction;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error copy$default(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error error, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType fullscreenErrorType, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorType = error.errorType;
            }
            if ((i & 2) != 0) {
                fullscreenErrorUiModel = error.errorContent;
            }
            if ((i & 4) != 0) {
                lastFailedAction = error.lastFailedAction;
            }
            if ((i & 8) != 0) {
                virtualCardOverviewUiModel = error.previousModel;
            }
            return error.copy(fullscreenErrorType, fullscreenErrorUiModel, lastFailedAction, virtualCardOverviewUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Provisioning;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;", "uiModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "lastFailedAction", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;)Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Provisioning;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "getLastFailedAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Provisioning extends com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction;
        private final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Provisioning(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction) {
            super("Provisioning", lastFailedAction, false, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCardOverviewUiModel, "");
            this.uiModel = virtualCardOverviewUiModel;
            this.lastFailedAction = lastFailedAction;
        }

        public /* synthetic */ Provisioning(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(virtualCardOverviewUiModel, (i & 2) != 0 ? null : lastFailedAction);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel getUiModel() {
            return this.uiModel;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState
        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction getLastFailedAction() {
            return this.lastFailedAction;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel = this.uiModel;
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction = this.lastFailedAction;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Provisioning(uiModel=");
            sb.append(virtualCardOverviewUiModel);
            sb.append(", lastFailedAction=");
            sb.append(lastFailedAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.uiModel.hashCode();
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction = this.lastFailedAction;
            return (hashCode * 31) + (lastFailedAction == null ? 0 : lastFailedAction.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Provisioning)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Provisioning provisioning = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Provisioning) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, provisioning.uiModel) && this.lastFailedAction == provisioning.lastFailedAction;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Provisioning copy(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel uiModel, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Provisioning(uiModel, lastFailedAction);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction getLastFailedAction() {
            return this.lastFailedAction;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Provisioning copy$default(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Provisioning provisioning, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel virtualCardOverviewUiModel, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                virtualCardOverviewUiModel = provisioning.uiModel;
            }
            if ((i & 2) != 0) {
                lastFailedAction = provisioning.lastFailedAction;
            }
            return provisioning.copy(virtualCardOverviewUiModel, lastFailedAction);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Decline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "declineContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState$Decline;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getDeclineContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Decline extends com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Decline(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("Decline", null, false, 6, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.declineContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.declineContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Decline(declineContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.declineContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Decline) && kotlin.jvm.internal.Intrinsics.areEqual(this.declineContent, ((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Decline) other).declineContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Decline copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Decline(declineContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Decline copy$default(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Decline decline, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = decline.declineContent;
            }
            return decline.copy(fullscreenErrorUiModel);
        }
    }

    public /* synthetic */ VirtualCardOverviewUiState(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, lastFailedAction, z);
    }
}
