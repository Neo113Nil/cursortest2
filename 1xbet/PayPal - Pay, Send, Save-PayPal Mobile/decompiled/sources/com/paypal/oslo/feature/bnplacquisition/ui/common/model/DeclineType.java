package com.paypal.oslo.feature.bnplacquisition.ui.common.model;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \u000e2\u00020\u0001:\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u000eB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\f\u001b\u001c\u001d\u001e\u001f !\"#$%&"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/ApplicationFailure;", "Lcom/paypal/pds/core/Icon;", "p0", "<init>", "(Lcom/paypal/pds/core/Icon;)V", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon", "()Lcom/paypal/pds/core/Icon;", "", "getCorrelationId", "()Ljava/lang/String;", "correlationId", "Companion", "RiskAssessment", "Fraud", "AddressVerification", "IneligibleAddress", "KycFailure", "AuthenticationFailure", "DownPaymentFailure", "AccountTakeoverDenied", "GeneralEligibilityDecline", "NoEligibleOffers", "TokenizationFailure", "Unknown", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$AccountTakeoverDenied;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$AddressVerification;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$AuthenticationFailure;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$DownPaymentFailure;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$Fraud;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$GeneralEligibilityDecline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$IneligibleAddress;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$KycFailure;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$NoEligibleOffers;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$RiskAssessment;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$TokenizationFailure;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DeclineType implements com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailure {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Companion(null);
    private final com.paypal.pds.core.Icon icon;

    public abstract java.lang.String getCorrelationId();

    private DeclineType(com.paypal.pds.core.Icon icon) {
        this.icon = icon;
    }

    public /* synthetic */ DeclineType(com.paypal.pds.core.Icon.Warning warning, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.pds.core.Icon.Warning.INSTANCE : warning, null);
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailure
    public com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$RiskAssessment;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$RiskAssessment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RiskAssessment extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: Multi-variable type inference failed */
        public RiskAssessment(java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.correlationId = str;
        }

        public /* synthetic */ RiskAssessment(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RiskAssessment(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.RiskAssessment) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.RiskAssessment) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.RiskAssessment copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.RiskAssessment(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.RiskAssessment copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.RiskAssessment riskAssessment, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = riskAssessment.correlationId;
            }
            return riskAssessment.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RiskAssessment() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$Fraud;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$Fraud;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Fraud extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: Multi-variable type inference failed */
        public Fraud(java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.correlationId = str;
        }

        public /* synthetic */ Fraud(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fraud(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Fraud) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Fraud) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Fraud copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Fraud(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Fraud copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Fraud fraud, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fraud.correlationId;
            }
            return fraud.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Fraud() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$AddressVerification;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$AddressVerification;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressVerification extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: Multi-variable type inference failed */
        public AddressVerification(java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.correlationId = str;
        }

        public /* synthetic */ AddressVerification(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressVerification(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AddressVerification) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AddressVerification) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AddressVerification copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AddressVerification(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AddressVerification copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AddressVerification addressVerification, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = addressVerification.correlationId;
            }
            return addressVerification.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AddressVerification() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$IneligibleAddress;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$IneligibleAddress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class IneligibleAddress extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: Multi-variable type inference failed */
        public IneligibleAddress(java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.correlationId = str;
        }

        public /* synthetic */ IneligibleAddress(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IneligibleAddress(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.IneligibleAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.IneligibleAddress) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.IneligibleAddress copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.IneligibleAddress(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.IneligibleAddress copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.IneligibleAddress ineligibleAddress, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = ineligibleAddress.correlationId;
            }
            return ineligibleAddress.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IneligibleAddress() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$KycFailure;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$KycFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KycFailure extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: Multi-variable type inference failed */
        public KycFailure(java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.correlationId = str;
        }

        public /* synthetic */ KycFailure(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("KycFailure(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.KycFailure) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.KycFailure) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.KycFailure copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.KycFailure(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.KycFailure copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.KycFailure kycFailure, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = kycFailure.correlationId;
            }
            return kycFailure.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public KycFailure() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$AuthenticationFailure;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$AuthenticationFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationFailure extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: Multi-variable type inference failed */
        public AuthenticationFailure(java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.correlationId = str;
        }

        public /* synthetic */ AuthenticationFailure(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationFailure(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AuthenticationFailure) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AuthenticationFailure) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AuthenticationFailure copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AuthenticationFailure(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AuthenticationFailure copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AuthenticationFailure authenticationFailure, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = authenticationFailure.correlationId;
            }
            return authenticationFailure.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AuthenticationFailure() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$DownPaymentFailure;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$DownPaymentFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownPaymentFailure extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: Multi-variable type inference failed */
        public DownPaymentFailure(java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.correlationId = str;
        }

        public /* synthetic */ DownPaymentFailure(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DownPaymentFailure(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.DownPaymentFailure) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.DownPaymentFailure) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.DownPaymentFailure copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.DownPaymentFailure(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.DownPaymentFailure copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.DownPaymentFailure downPaymentFailure, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = downPaymentFailure.correlationId;
            }
            return downPaymentFailure.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DownPaymentFailure() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$AccountTakeoverDenied;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$AccountTakeoverDenied;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AccountTakeoverDenied extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: Multi-variable type inference failed */
        public AccountTakeoverDenied(java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.correlationId = str;
        }

        public /* synthetic */ AccountTakeoverDenied(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountTakeoverDenied(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AccountTakeoverDenied) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AccountTakeoverDenied) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AccountTakeoverDenied copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AccountTakeoverDenied(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AccountTakeoverDenied copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AccountTakeoverDenied accountTakeoverDenied, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = accountTakeoverDenied.correlationId;
            }
            return accountTakeoverDenied.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AccountTakeoverDenied() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$GeneralEligibilityDecline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$GeneralEligibilityDecline;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GeneralEligibilityDecline extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: Multi-variable type inference failed */
        public GeneralEligibilityDecline(java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.correlationId = str;
        }

        public /* synthetic */ GeneralEligibilityDecline(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GeneralEligibilityDecline(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.GeneralEligibilityDecline) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.GeneralEligibilityDecline) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.GeneralEligibilityDecline copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.GeneralEligibilityDecline(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.GeneralEligibilityDecline copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.GeneralEligibilityDecline generalEligibilityDecline, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = generalEligibilityDecline.correlationId;
            }
            return generalEligibilityDecline.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public GeneralEligibilityDecline() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$NoEligibleOffers;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$NoEligibleOffers;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoEligibleOffers extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: Multi-variable type inference failed */
        public NoEligibleOffers(java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.correlationId = str;
        }

        public /* synthetic */ NoEligibleOffers(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoEligibleOffers(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.NoEligibleOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.NoEligibleOffers) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.NoEligibleOffers copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.NoEligibleOffers(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.NoEligibleOffers copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.NoEligibleOffers noEligibleOffers, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = noEligibleOffers.correlationId;
            }
            return noEligibleOffers.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoEligibleOffers() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$TokenizationFailure;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$TokenizationFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TokenizationFailure extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: Multi-variable type inference failed */
        public TokenizationFailure(java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.correlationId = str;
        }

        public /* synthetic */ TokenizationFailure(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenizationFailure(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.TokenizationFailure) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.TokenizationFailure) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.TokenizationFailure copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.TokenizationFailure(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.TokenizationFailure copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.TokenizationFailure tokenizationFailure, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = tokenizationFailure.correlationId;
            }
            return tokenizationFailure.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TokenizationFailure() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$Unknown;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown(java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.correlationId = str;
        }

        public /* synthetic */ Unknown(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Unknown) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Unknown copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Unknown(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Unknown copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Unknown unknown, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknown.correlationId;
            }
            return unknown.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType$Companion;", "", "<init>", "()V", "", "reason", "correlationId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "from", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason;", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Companion companion, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.from(str, str2);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from(java.lang.String reason, java.lang.String correlationId) {
            return from(com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.INSTANCE.fromString(reason), correlationId);
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Companion companion, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.from(declineReason, str);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from(com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason reason, java.lang.String correlationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            switch (com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Companion.WhenMappings.$EnumSwitchMapping$0[reason.ordinal()]) {
                case 1:
                    return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.RiskAssessment(correlationId);
                case 2:
                    return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Fraud(correlationId);
                case 3:
                    return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AddressVerification(correlationId);
                case 4:
                    return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.IneligibleAddress(correlationId);
                case 5:
                case 6:
                    return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.KycFailure(correlationId);
                case 7:
                    return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AuthenticationFailure(correlationId);
                case 8:
                    return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.DownPaymentFailure(correlationId);
                case 9:
                    return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AccountTakeoverDenied(correlationId);
                case 10:
                    return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.GeneralEligibilityDecline(correlationId);
                case 11:
                    return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.NoEligibleOffers(correlationId);
                case 12:
                    return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.TokenizationFailure(correlationId);
                case 13:
                    return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Unknown(correlationId);
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.values().length];
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.RISK_ASSESSMENT_FAILURE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.FRAUD_DETECTION.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.ADDRESS_NORMALIZATION_FAILURE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.INELIGIBLE_ADDRESS.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.KYC_THRESHOLD_REACHED.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.KYC_VERIFICATION_FAILURE.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.STRONG_CUSTOMER_AUTHENTICATION_FAILURE.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED.ordinal()] = 8;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.ACCOUNT_TAKEOVER_ASSESSMENT_DENIED.ordinal()] = 9;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.GENERAL_ELIGIBILITY_DECLINE.ordinal()] = 10;
                } catch (java.lang.NoSuchFieldError unused10) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.NO_ELIGIBLE_PRODUCT_OFFERS.ordinal()] = 11;
                } catch (java.lang.NoSuchFieldError unused11) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.TOKENIZATION_DECLINE.ordinal()] = 12;
                } catch (java.lang.NoSuchFieldError unused12) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.UNKNOWN.ordinal()] = 13;
                } catch (java.lang.NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DeclineType(com.paypal.pds.core.Icon icon, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon);
    }
}
