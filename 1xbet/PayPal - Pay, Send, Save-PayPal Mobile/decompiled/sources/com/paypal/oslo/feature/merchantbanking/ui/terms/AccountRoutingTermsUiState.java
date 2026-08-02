package com.paypal.oslo.feature.merchantbanking.ui.terms;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState;", "", "<init>", "()V", "Initial", "EnrollmentSuccess", "EnrollmentError", "Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState$EnrollmentError;", "Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState$EnrollmentSuccess;", "Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState$Initial;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AccountRoutingTermsUiState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState$Initial;", "Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.Initial INSTANCE = new com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.Initial();

        public final int hashCode() {
            return 243026469;
        }

        private Initial() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private AccountRoutingTermsUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState$EnrollmentSuccess;", "Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState;", "Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;)V", "component1", "()Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;", "copy", "(Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;)Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState$EnrollmentSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnrollmentSuccess extends com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnrollmentSuccess(com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData accountRoutingInfoData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountRoutingInfoData, "");
            this.data = accountRoutingInfoData;
        }

        public final com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData accountRoutingInfoData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrollmentSuccess(data=");
            sb.append(accountRoutingInfoData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentSuccess) other).data);
        }

        public final com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentSuccess copy(com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentSuccess(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentSuccess copy$default(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentSuccess enrollmentSuccess, com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData accountRoutingInfoData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                accountRoutingInfoData = enrollmentSuccess.data;
            }
            return enrollmentSuccess.copy(accountRoutingInfoData);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState$EnrollmentError;", "Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState;", "Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;", "errorType", "", "timestamp", "<init>", "(Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;J)V", "component1", "()Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;", "component2", "()J", "copy", "(Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;J)Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState$EnrollmentError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;", "getErrorType", "J", "getTimestamp"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnrollmentError extends com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorType;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnrollmentError(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum, long j) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenTypeEnum, "");
            this.errorType = errorScreenTypeEnum;
            this.timestamp = j;
        }

        public final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum getErrorType() {
            return this.errorType;
        }

        public /* synthetic */ EnrollmentError(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(errorScreenTypeEnum, (i & 2) != 0 ? java.lang.System.currentTimeMillis() : j);
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum = this.errorType;
            long j = this.timestamp;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrollmentError(errorType=");
            sb.append(errorScreenTypeEnum);
            sb.append(", timestamp=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorType.hashCode() * 31) + java.lang.Long.hashCode(this.timestamp);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError)) {
                return false;
            }
            com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError enrollmentError = (com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError) other;
            return this.errorType == enrollmentError.errorType && this.timestamp == enrollmentError.timestamp;
        }

        public final com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError copy(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorType, long timestamp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError(errorType, timestamp);
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError copy$default(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError enrollmentError, com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorScreenTypeEnum = enrollmentError.errorType;
            }
            if ((i & 2) != 0) {
                j = enrollmentError.timestamp;
            }
            return enrollmentError.copy(errorScreenTypeEnum, j);
        }
    }

    public /* synthetic */ AccountRoutingTermsUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
