package com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState;", "", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState$Error;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState$Initial;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState$Loading;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface LinkAgreementsState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState$Initial;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Initial INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Initial();

        public final int hashCode() {
            return -1833268923;
        }

        private Initial() {
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState$Loading;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Loading INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Loading();

        public final int hashCode() {
            return 850006845;
        }

        private Loading() {
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState$Success;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState;", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "merchants", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getMerchants"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> merchants;

        public Success(java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.merchants = list;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> getMerchants() {
            return this.merchants;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> list = this.merchants;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(merchants=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.merchants.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchants, ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Success) other).merchants);
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Success copy(java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> merchants) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchants, "");
            return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Success(merchants);
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> component1() {
            return this.merchants;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Success copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Success success, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.merchants;
            }
            return success.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState$Error;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "errorContext", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getErrorContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState {
        public static final int $stable = 0;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext;

        public Error(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
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
            return (other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContext, ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Error) other).errorContext);
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Error copy(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Error(errorContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Error copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Error error, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorContext = error.errorContext;
            }
            return error.copy(errorContext);
        }
    }
}
