package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \u00042\u00020\u0001:\u0005\u0005\u0006\u0007\b\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState;", "", "<init>", "()V", "Companion", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Error;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Initial;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Loading;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class BulkUpdateFiUiState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Initial;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Initial INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Initial();

        public final int hashCode() {
            return 727911051;
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
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private BulkUpdateFiUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Loading;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Loading INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Loading();

        public final int hashCode() {
            return -883780477;
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
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Success;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState;", "", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiDataUiModel;", "bulkUpdateFiItems", "", "", "selectedAgreements", "<init>", "(Ljava/util/List;Ljava/util/Set;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Set;", "copy", "(Ljava/util/List;Ljava/util/Set;)Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getBulkUpdateFiItems", "Ljava/util/Set;", "getSelectedAgreements"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel> bulkUpdateFiItems;
        private final java.util.Set<java.lang.String> selectedAgreements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel> list, java.util.Set<java.lang.String> set) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.bulkUpdateFiItems = list;
            this.selectedAgreements = set;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel> getBulkUpdateFiItems() {
            return this.bulkUpdateFiItems;
        }

        public /* synthetic */ Success(java.util.List list, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? kotlin.collections.SetsKt.emptySet() : set);
        }

        public final java.util.Set<java.lang.String> getSelectedAgreements() {
            return this.selectedAgreements;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel> list = this.bulkUpdateFiItems;
            java.util.Set<java.lang.String> set = this.selectedAgreements;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(bulkUpdateFiItems=");
            sb.append(list);
            sb.append(", selectedAgreements=");
            sb.append(set);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.bulkUpdateFiItems.hashCode() * 31) + this.selectedAgreements.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success success = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bulkUpdateFiItems, success.bulkUpdateFiItems) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedAgreements, success.selectedAgreements);
        }

        public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success copy(java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel> bulkUpdateFiItems, java.util.Set<java.lang.String> selectedAgreements) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiItems, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedAgreements, "");
            return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success(bulkUpdateFiItems, selectedAgreements);
        }

        public final java.util.Set<java.lang.String> component2() {
            return this.selectedAgreements;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel> component1() {
            return this.bulkUpdateFiItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success copy$default(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success success, java.util.List list, java.util.Set set, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.bulkUpdateFiItems;
            }
            if ((i & 2) != 0) {
                set = success.selectedAgreements;
            }
            return success.copy(list, set);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Error;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "errorContext", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getErrorContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState {
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
            return (other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContext, ((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Error) other).errorContext);
        }

        public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Error copy(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Error(errorContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Error copy$default(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Error error, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorContext = error.errorContext;
            }
            return error.copy(errorContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Success;", "preview", "()Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success preview() {
            return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.SetsKt.emptySet());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BulkUpdateFiUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
