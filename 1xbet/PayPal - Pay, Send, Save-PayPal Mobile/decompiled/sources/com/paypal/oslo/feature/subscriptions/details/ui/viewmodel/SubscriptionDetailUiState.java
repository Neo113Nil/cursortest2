package com.paypal.oslo.feature.subscriptions.details.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState;", "", "<init>", "()V", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState$Error;", "Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState$Initial;", "Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState$Loading;", "Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SubscriptionDetailUiState {
    public static final int $stable = 0;

    private SubscriptionDetailUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState$Initial;", "Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Initial INSTANCE = new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Initial();

        public final int hashCode() {
            return 968815478;
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
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState$Loading;", "Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Loading INSTANCE = new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Loading();

        public final int hashCode() {
            return -642876050;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState$Success;", "Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState;", "Lcom/paypal/oslo/feature/subscriptions/details/ui/model/SubscriptionDetailsUiModel;", "subscriptionDetails", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/details/ui/model/SubscriptionDetailsUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/details/ui/model/SubscriptionDetailsUiModel;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/details/ui/model/SubscriptionDetailsUiModel;)Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/details/ui/model/SubscriptionDetailsUiModel;", "getSubscriptionDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel subscriptionDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel subscriptionDetailsUiModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionDetailsUiModel, "");
            this.subscriptionDetails = subscriptionDetailsUiModel;
        }

        public final com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel getSubscriptionDetails() {
            return this.subscriptionDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel subscriptionDetailsUiModel = this.subscriptionDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(subscriptionDetails=");
            sb.append(subscriptionDetailsUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.subscriptionDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.subscriptionDetails, ((com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success) other).subscriptionDetails);
        }

        public final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success copy(com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel subscriptionDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionDetails, "");
            return new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success(subscriptionDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel getSubscriptionDetails() {
            return this.subscriptionDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success copy$default(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success success, com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel subscriptionDetailsUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                subscriptionDetailsUiModel = success.subscriptionDetails;
            }
            return success.copy(subscriptionDetailsUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState$Error;", "Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "errorContext", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getErrorContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            this.errorContext = errorContext;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.errorContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorContext=");
            sb.append(errorContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContext, ((com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Error) other).errorContext);
        }

        public final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Error copy(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            return new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Error(errorContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Error copy$default(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Error error, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorContext = error.errorContext;
            }
            return error.copy(errorContext);
        }
    }

    public /* synthetic */ SubscriptionDetailUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
