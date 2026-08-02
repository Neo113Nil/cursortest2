package com.paypal.oslo.feature.identity.unifiedalert.data;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState;", "", "<init>", "()V", "Idle", "Checking", "Presenting", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState$Checking;", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState$Idle;", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState$Presenting;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AlertsFlowState {
    public static final int $stable = 0;

    private AlertsFlowState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState$Idle;", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Idle INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Idle();

        public final int hashCode() {
            return -1087240107;
        }

        private Idle() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState$Checking;", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "source", "", "previousDocumentId", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState$Checking;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "getSource", "Ljava/lang/String;", "getPreviousDocumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Checking extends com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState {
        public static final int $stable = 0;
        private final java.lang.String previousDocumentId;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Checking(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlertSource, "");
            this.source = unifiedAlertSource;
            this.previousDocumentId = str;
        }

        public /* synthetic */ Checking(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(unifiedAlertSource, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource getSource() {
            return this.source;
        }

        public final java.lang.String getPreviousDocumentId() {
            return this.previousDocumentId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource = this.source;
            java.lang.String str = this.previousDocumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Checking(source=");
            sb.append(unifiedAlertSource);
            sb.append(", previousDocumentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.source.hashCode();
            java.lang.String str = this.previousDocumentId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking)) {
                return false;
            }
            com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking checking = (com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking) other;
            return this.source == checking.source && kotlin.jvm.internal.Intrinsics.areEqual(this.previousDocumentId, checking.previousDocumentId);
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source, java.lang.String previousDocumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking(source, previousDocumentId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPreviousDocumentId() {
            return this.previousDocumentId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource getSource() {
            return this.source;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking copy$default(com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking checking, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unifiedAlertSource = checking.source;
            }
            if ((i & 2) != 0) {
                str = checking.previousDocumentId;
            }
            return checking.copy(unifiedAlertSource, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState$Presenting;", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState;", "", "documentId", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "source", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;)Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState$Presenting;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDocumentId", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Presenting extends com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState {
        public static final int $stable = 0;
        private final java.lang.String documentId;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Presenting(java.lang.String str, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlertSource, "");
            this.documentId = str;
            this.source = unifiedAlertSource;
        }

        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.documentId;
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Presenting(documentId=");
            sb.append(str);
            sb.append(", source=");
            sb.append(unifiedAlertSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.documentId.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting)) {
                return false;
            }
            com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting presenting = (com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, presenting.documentId) && this.source == presenting.source;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting copy(java.lang.String documentId, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting(documentId, source);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting copy$default(com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting presenting, java.lang.String str, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = presenting.documentId;
            }
            if ((i & 2) != 0) {
                unifiedAlertSource = presenting.source;
            }
            return presenting.copy(str, unifiedAlertSource);
        }
    }

    public /* synthetic */ AlertsFlowState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
