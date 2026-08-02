package com.paypal.oslo.feature.identity.unifiedalert.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "AlertAction", "Processing", "Approved", "Denied", "Expired", "Error", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$AlertAction;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Approved;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Denied;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Error;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Expired;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Loading;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Processing;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class UnifiedAlertUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private UnifiedAlertUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Loading;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Loading();

        public final int hashCode() {
            return 544261036;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$AlertAction;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alertData", "", "source", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$AlertAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getAlertData", "Ljava/lang/String;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AlertAction extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlertAction(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, java.lang.String str) {
            super("AlertAction", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlert, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.alertData = unifiedAlert;
            this.source = str;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = this.alertData;
            java.lang.String str = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AlertAction(alertData=");
            sb.append(unifiedAlert);
            sb.append(", source=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.alertData.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction)) {
                return false;
            }
            com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction alertAction = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.alertData, alertAction.alertData) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, alertAction.source);
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction(alertData, source);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction copy$default(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction alertAction, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unifiedAlert = alertAction.alertData;
            }
            if ((i & 2) != 0) {
                str = alertAction.source;
            }
            return alertAction.copy(unifiedAlert, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Processing;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alertData", "", "source", "", "isApproval", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Ljava/lang/String;Z)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Processing;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getAlertData", "Ljava/lang/String;", "getSource", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Processing extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData;
        private final boolean isApproval;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Processing(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, java.lang.String str, boolean z) {
            super("Processing", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlert, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.alertData = unifiedAlert;
            this.source = str;
            this.isApproval = z;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final boolean isApproval() {
            return this.isApproval;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = this.alertData;
            java.lang.String str = this.source;
            boolean z = this.isApproval;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Processing(alertData=");
            sb.append(unifiedAlert);
            sb.append(", source=");
            sb.append(str);
            sb.append(", isApproval=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.alertData.hashCode() * 31) + this.source.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isApproval);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing)) {
                return false;
            }
            com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing processing = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.alertData, processing.alertData) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, processing.source) && this.isApproval == processing.isApproval;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData, java.lang.String source, boolean isApproval) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing(alertData, source, isApproval);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsApproval() {
            return this.isApproval;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing copy$default(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing processing, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unifiedAlert = processing.alertData;
            }
            if ((i & 2) != 0) {
                str = processing.source;
            }
            if ((i & 4) != 0) {
                z = processing.isApproval;
            }
            return processing.copy(unifiedAlert, str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Approved;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alertData", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;)Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Approved;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getAlertData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Approved extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Approved(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert) {
            super("Approved", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlert, "");
            this.alertData = unifiedAlert;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = this.alertData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Approved(alertData=");
            sb.append(unifiedAlert);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.alertData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Approved) && kotlin.jvm.internal.Intrinsics.areEqual(this.alertData, ((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Approved) other).alertData);
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Approved copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertData, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Approved(alertData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Approved copy$default(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Approved approved, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unifiedAlert = approved.alertData;
            }
            return approved.copy(unifiedAlert);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Denied;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alertData", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;)Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Denied;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getAlertData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Denied extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Denied(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert) {
            super("Denied", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlert, "");
            this.alertData = unifiedAlert;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = this.alertData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Denied(alertData=");
            sb.append(unifiedAlert);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.alertData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Denied) && kotlin.jvm.internal.Intrinsics.areEqual(this.alertData, ((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Denied) other).alertData);
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Denied copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertData, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Denied(alertData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Denied copy$default(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Denied denied, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unifiedAlert = denied.alertData;
            }
            return denied.copy(unifiedAlert);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Expired;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alertData", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;)Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Expired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getAlertData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Expired extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Expired(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert) {
            super("Expired", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlert, "");
            this.alertData = unifiedAlert;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = this.alertData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expired(alertData=");
            sb.append(unifiedAlert);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.alertData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Expired) && kotlin.jvm.internal.Intrinsics.areEqual(this.alertData, ((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Expired) other).alertData);
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Expired copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertData, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Expired(alertData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Expired copy$default(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Expired expired, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unifiedAlert = expired.alertData;
            }
            return expired.copy(unifiedAlert);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Error;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alertData", "", "source", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getAlertData", "Ljava/lang/String;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, java.lang.String str) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.alertData = unifiedAlert;
            this.source = str;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = this.alertData;
            java.lang.String str = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(alertData=");
            sb.append(unifiedAlert);
            sb.append(", source=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = this.alertData;
            return ((unifiedAlert == null ? 0 : unifiedAlert.hashCode()) * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error error = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.alertData, error.alertData) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, error.source);
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error(alertData, source);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error copy$default(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error error, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unifiedAlert = error.alertData;
            }
            if ((i & 2) != 0) {
                str = error.source;
            }
            return error.copy(unifiedAlert, str);
        }
    }

    public /* synthetic */ UnifiedAlertUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
