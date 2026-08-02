package com.paypal.oslo.feature.bnplacquisition.ui.common.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \n2\u00020\u0001:\f\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f "}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/ApplicationFailure;", "Lcom/paypal/pds/core/Icon;", "p0", "<init>", "(Lcom/paypal/pds/core/Icon;)V", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon", "()Lcom/paypal/pds/core/Icon;", "Companion", "NoInternet", "Generic", "NetworkError", "VccGenericError", "DeviceTokenPendingActive", "IssuerDigitizationNotFound", "FetchVccFailed", "AddCardFailed", "NFCCardProvisioningRetryableError", "NFCCardProvisioningError", "PayLaterNotAvailable", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$AddCardFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$DeviceTokenPendingActive;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$FetchVccFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$Generic;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$IssuerDigitizationNotFound;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$NFCCardProvisioningError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$NFCCardProvisioningRetryableError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$NetworkError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$NoInternet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$PayLaterNotAvailable;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$VccGenericError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class FullscreenErrorType implements com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailure {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Companion(null);
    private final com.paypal.pds.core.Icon icon;

    private FullscreenErrorType(com.paypal.pds.core.Icon icon) {
        this.icon = icon;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailure
    public com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$NoInternet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$NoInternet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoInternet extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        public /* synthetic */ NoInternet(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public NoInternet(java.lang.String str) {
            super(com.paypal.pds.core.Icon.ArrowUUpLeft.INSTANCE, null);
            this.correlationId = str;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoInternet(correlationId=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NoInternet) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NoInternet) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NoInternet copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NoInternet(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NoInternet copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NoInternet noInternet, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = noInternet.correlationId;
            }
            return noInternet.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoInternet() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$Generic;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$Generic;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Generic extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        public /* synthetic */ Generic(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public Generic(java.lang.String str) {
            super(com.paypal.pds.core.Icon.ArrowUUpLeft.INSTANCE, null);
            this.correlationId = str;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Generic(correlationId=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic generic, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = generic.correlationId;
            }
            return generic.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Generic() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$NetworkError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "", "httpCode", "", "correlationId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Integer;", "getHttpCode", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;
        private final java.lang.Integer httpCode;

        public /* synthetic */ NetworkError(java.lang.Integer num, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
        }

        public final java.lang.Integer getHttpCode() {
            return this.httpCode;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public NetworkError(java.lang.Integer num, java.lang.String str) {
            super(com.paypal.pds.core.Icon.ArrowUUpLeft.INSTANCE, null);
            this.httpCode = num;
            this.correlationId = str;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.httpCode;
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(httpCode=");
            sb.append(num);
            sb.append(", correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.httpCode;
            int hashCode = num == null ? 0 : num.hashCode();
            java.lang.String str = this.correlationId;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NetworkError)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NetworkError networkError = (com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NetworkError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.httpCode, networkError.httpCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, networkError.correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NetworkError copy(java.lang.Integer httpCode, java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NetworkError(httpCode, correlationId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getHttpCode() {
            return this.httpCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NetworkError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NetworkError networkError, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = networkError.httpCode;
            }
            if ((i & 2) != 0) {
                str = networkError.correlationId;
            }
            return networkError.copy(num, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NetworkError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$VccGenericError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$VccGenericError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VccGenericError extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        public /* synthetic */ VccGenericError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public VccGenericError(java.lang.String str) {
            super(com.paypal.pds.core.Icon.ArrowUUpLeft.INSTANCE, null);
            this.correlationId = str;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VccGenericError(correlationId=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.VccGenericError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.VccGenericError) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.VccGenericError copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.VccGenericError(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.VccGenericError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.VccGenericError vccGenericError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = vccGenericError.correlationId;
            }
            return vccGenericError.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public VccGenericError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$DeviceTokenPendingActive;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$DeviceTokenPendingActive;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeviceTokenPendingActive extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        public /* synthetic */ DeviceTokenPendingActive(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public DeviceTokenPendingActive(java.lang.String str) {
            super(com.paypal.pds.core.Icon.Wallet.INSTANCE, null);
            this.correlationId = str;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceTokenPendingActive(correlationId=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.DeviceTokenPendingActive) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.DeviceTokenPendingActive) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.DeviceTokenPendingActive copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.DeviceTokenPendingActive(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.DeviceTokenPendingActive copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.DeviceTokenPendingActive deviceTokenPendingActive, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deviceTokenPendingActive.correlationId;
            }
            return deviceTokenPendingActive.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DeviceTokenPendingActive() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$IssuerDigitizationNotFound;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$IssuerDigitizationNotFound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class IssuerDigitizationNotFound extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        public /* synthetic */ IssuerDigitizationNotFound(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public IssuerDigitizationNotFound(java.lang.String str) {
            super(com.paypal.pds.core.Icon.ArrowUUpLeft.INSTANCE, null);
            this.correlationId = str;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IssuerDigitizationNotFound(correlationId=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.IssuerDigitizationNotFound) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.IssuerDigitizationNotFound) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.IssuerDigitizationNotFound copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.IssuerDigitizationNotFound(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.IssuerDigitizationNotFound copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.IssuerDigitizationNotFound issuerDigitizationNotFound, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuerDigitizationNotFound.correlationId;
            }
            return issuerDigitizationNotFound.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IssuerDigitizationNotFound() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$FetchVccFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "", "creditAccountId", "correlationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$FetchVccFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchVccFailed extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType {
        public static final int $stable = 0;
        private final java.lang.String correlationId;
        private final java.lang.String creditAccountId;

        public /* synthetic */ FetchVccFailed(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public FetchVccFailed(java.lang.String str, java.lang.String str2) {
            super(com.paypal.pds.core.Icon.ArrowUUpLeft.INSTANCE, null);
            this.creditAccountId = str;
            this.correlationId = str2;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            java.lang.String str2 = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchVccFailed(creditAccountId=");
            sb.append(str);
            sb.append(", correlationId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.creditAccountId;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.correlationId;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.FetchVccFailed)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.FetchVccFailed fetchVccFailed = (com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.FetchVccFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, fetchVccFailed.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, fetchVccFailed.correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.FetchVccFailed copy(java.lang.String creditAccountId, java.lang.String correlationId) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.FetchVccFailed(creditAccountId, correlationId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.FetchVccFailed copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.FetchVccFailed fetchVccFailed, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fetchVccFailed.creditAccountId;
            }
            if ((i & 2) != 0) {
                str2 = fetchVccFailed.correlationId;
            }
            return fetchVccFailed.copy(str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FetchVccFailed() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$AddCardFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddCardFailed extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.AddCardFailed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.AddCardFailed();

        public final int hashCode() {
            return 1402336895;
        }

        private AddCardFailed() {
            super(com.paypal.pds.core.Icon.ArrowUUpLeft.INSTANCE, null);
        }

        public final java.lang.String toString() {
            return "AddCardFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.AddCardFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$NFCCardProvisioningRetryableError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NFCCardProvisioningRetryableError extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningRetryableError INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningRetryableError();

        public final int hashCode() {
            return -1545775041;
        }

        private NFCCardProvisioningRetryableError() {
            super(com.paypal.pds.core.Icon.Card.INSTANCE, null);
        }

        public final java.lang.String toString() {
            return "NFCCardProvisioningRetryableError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningRetryableError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$NFCCardProvisioningError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NFCCardProvisioningError extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningError INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningError();

        public final int hashCode() {
            return 1343035599;
        }

        private NFCCardProvisioningError() {
            super(com.paypal.pds.core.Icon.Card.INSTANCE, null);
        }

        public final java.lang.String toString() {
            return "NFCCardProvisioningError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$PayLaterNotAvailable;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PayLaterNotAvailable extends com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.PayLaterNotAvailable INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.PayLaterNotAvailable();

        public final int hashCode() {
            return -832841367;
        }

        private PayLaterNotAvailable() {
            super(com.paypal.pds.core.Icon.Wallet.INSTANCE, null);
        }

        public final java.lang.String toString() {
            return "PayLaterNotAvailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.PayLaterNotAvailable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "error", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "from", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "fromVcc"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType from(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.HttpError) {
                com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.HttpError httpError = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.HttpError) error;
                int code = httpError.getCode();
                return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NetworkError(java.lang.Integer.valueOf(code), httpError.getCorrelationId());
            }
            if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.NoInternet) {
                return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NoInternet(null);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic generic = new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(error.getCorrelationId());
            com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "UseCaseResult.Error type: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(error.getClass()).getSimpleName())));
            return generic;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType fromVcc(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DeviceTokenPendingActiveError) {
                return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.DeviceTokenPendingActive(error.getCorrelationId());
            }
            if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.IssuerDigitizationDataNotFoundError) {
                return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.IssuerDigitizationNotFound(error.getCorrelationId());
            }
            if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FetchVccFailedError) {
                return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.FetchVccFailed(((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FetchVccFailedError) error).getCreditAccountId(), error.getCorrelationId());
            }
            if (error instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidVirtualCardError) {
                return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.VccGenericError(error.getCorrelationId());
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.VccGenericError vccGenericError = new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.VccGenericError(error.getCorrelationId());
            com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "UseCaseResult.Error VCC type: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(error.getClass()).getSimpleName())));
            return vccGenericError;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FullscreenErrorType(com.paypal.pds.core.Icon icon, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon);
    }
}
