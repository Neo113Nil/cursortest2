package com.paypal.oslo.feature.subscriptions.hub.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState;", "", "Idle", "Loading", "Error", "Success", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState$Error;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState$Idle;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState$Loading;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SubscriptionsHubUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState$Idle;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle implements com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Idle INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Idle();

        public final int hashCode() {
            return -436602960;
        }

        private Idle() {
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState$Loading;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Loading INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Loading();

        public final int hashCode() {
            return 1289538528;
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
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState$Error;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "errorContext", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getErrorContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState {
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
            return (other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContext, ((com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Error) other).errorContext);
        }

        public final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Error copy(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            return new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Error(errorContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Error copy$default(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Error error, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorContext = error.errorContext;
            }
            return error.copy(errorContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u001d\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState$Success;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState;", "", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "subscriptions", "", "shouldShowLinkEntryPoints", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSubscriptions", "Z", "getShouldShowLinkEntryPoints", "isEmpty"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState {
        public static final int $stable = 0;
        private final boolean shouldShowLinkEntryPoints;
        private final java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> subscriptions;

        public Success(java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> list, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.subscriptions = list;
            this.shouldShowLinkEntryPoints = z;
        }

        public /* synthetic */ Success(java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z);
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> getSubscriptions() {
            return this.subscriptions;
        }

        public final boolean getShouldShowLinkEntryPoints() {
            return this.shouldShowLinkEntryPoints;
        }

        public final boolean isEmpty() {
            return this.subscriptions.isEmpty();
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> list = this.subscriptions;
            boolean z = this.shouldShowLinkEntryPoints;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(subscriptions=");
            sb.append(list);
            sb.append(", shouldShowLinkEntryPoints=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.subscriptions.hashCode() * 31) + java.lang.Boolean.hashCode(this.shouldShowLinkEntryPoints);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success success = (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.subscriptions, success.subscriptions) && this.shouldShowLinkEntryPoints == success.shouldShowLinkEntryPoints;
        }

        public final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success copy(java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> subscriptions, boolean shouldShowLinkEntryPoints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptions, "");
            return new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success(subscriptions, shouldShowLinkEntryPoints);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldShowLinkEntryPoints() {
            return this.shouldShowLinkEntryPoints;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> component1() {
            return this.subscriptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success copy$default(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success success, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.subscriptions;
            }
            if ((i & 2) != 0) {
                z = success.shouldShowLinkEntryPoints;
            }
            return success.copy(list, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Success() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }
    }
}
