package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState;", "", "Initial", "Loading", "ZeroState", "LinkedBusinessesList", "Error", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$Error;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$Initial;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$LinkedBusinessesList;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$Loading;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$ZeroState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BusinessHubState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$Initial;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial implements com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Initial INSTANCE = new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Initial();

        public final int hashCode() {
            return 1397742588;
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
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$Loading;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Loading INSTANCE = new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Loading();

        public final int hashCode() {
            return -213948940;
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
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$ZeroState;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState;", "", "shouldShowLinkEntryPoints", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$ZeroState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShouldShowLinkEntryPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ZeroState implements com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState {
        public static final int $stable = 0;
        private final boolean shouldShowLinkEntryPoints;

        public ZeroState(boolean z) {
            this.shouldShowLinkEntryPoints = z;
        }

        public /* synthetic */ ZeroState(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getShouldShowLinkEntryPoints() {
            return this.shouldShowLinkEntryPoints;
        }

        public final java.lang.String toString() {
            boolean z = this.shouldShowLinkEntryPoints;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ZeroState(shouldShowLinkEntryPoints=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.shouldShowLinkEntryPoints);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.ZeroState) && this.shouldShowLinkEntryPoints == ((com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.ZeroState) other).shouldShowLinkEntryPoints;
        }

        public final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.ZeroState copy(boolean shouldShowLinkEntryPoints) {
            return new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.ZeroState(shouldShowLinkEntryPoints);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldShowLinkEntryPoints() {
            return this.shouldShowLinkEntryPoints;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.ZeroState copy$default(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.ZeroState zeroState, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = zeroState.shouldShowLinkEntryPoints;
            }
            return zeroState.copy(z);
        }

        public ZeroState() {
            this(false, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$LinkedBusinessesList;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState;", "", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/LinkedBusinessAgreementItemUiModel;", "list", "", "shouldShowLinkEntryPoints", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$LinkedBusinessesList;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getList", "Z", "getShouldShowLinkEntryPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkedBusinessesList implements com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState {
        public static final int $stable = 0;
        private final java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel> list;
        private final boolean shouldShowLinkEntryPoints;

        public LinkedBusinessesList(java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel> list, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.list = list;
            this.shouldShowLinkEntryPoints = z;
        }

        public /* synthetic */ LinkedBusinessesList(java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z);
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel> getList() {
            return this.list;
        }

        public final boolean getShouldShowLinkEntryPoints() {
            return this.shouldShowLinkEntryPoints;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel> list = this.list;
            boolean z = this.shouldShowLinkEntryPoints;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkedBusinessesList(list=");
            sb.append(list);
            sb.append(", shouldShowLinkEntryPoints=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.list.hashCode() * 31) + java.lang.Boolean.hashCode(this.shouldShowLinkEntryPoints);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList linkedBusinessesList = (com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.list, linkedBusinessesList.list) && this.shouldShowLinkEntryPoints == linkedBusinessesList.shouldShowLinkEntryPoints;
        }

        public final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList copy(java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel> list, boolean shouldShowLinkEntryPoints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            return new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList(list, shouldShowLinkEntryPoints);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldShowLinkEntryPoints() {
            return this.shouldShowLinkEntryPoints;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel> component1() {
            return this.list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList copy$default(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList linkedBusinessesList, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = linkedBusinessesList.list;
            }
            if ((i & 2) != 0) {
                z = linkedBusinessesList.shouldShowLinkEntryPoints;
            }
            return linkedBusinessesList.copy(list, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$Error;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "errorContext", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getErrorContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState {
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
            return (other instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContext, ((com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Error) other).errorContext);
        }

        public final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Error copy(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            return new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Error(errorContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Error copy$default(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Error error, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorContext = error.errorContext;
            }
            return error.copy(errorContext);
        }
    }
}
