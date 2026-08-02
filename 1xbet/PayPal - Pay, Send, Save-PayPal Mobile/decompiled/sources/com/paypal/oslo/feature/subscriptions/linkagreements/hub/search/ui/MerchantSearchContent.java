package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent;", "", "Idle", "Loading", "PopularMerchants", "SearchResults", "Error", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$Error;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$Idle;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$Loading;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$PopularMerchants;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$SearchResults;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MerchantSearchContent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$Idle;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Idle INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Idle();

        public final int hashCode() {
            return 1094936872;
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
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$Loading;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Loading INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Loading();

        public final int hashCode() {
            return 1955088232;
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
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$PopularMerchants;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent;", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "merchants", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$PopularMerchants;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getMerchants"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PopularMerchants implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> merchants;

        public PopularMerchants(java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.merchants = list;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> getMerchants() {
            return this.merchants;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> list = this.merchants;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PopularMerchants(merchants=");
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
            return (other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchants, ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants) other).merchants);
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants copy(java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> merchants) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchants, "");
            return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants(merchants);
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> component1() {
            return this.merchants;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants popularMerchants, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = popularMerchants.merchants;
            }
            return popularMerchants.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$SearchResults;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent;", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "suggestions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$SearchResults;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSuggestions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchResults implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> suggestions;

        public SearchResults(java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.suggestions = list;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> getSuggestions() {
            return this.suggestions;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> list = this.suggestions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchResults(suggestions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.suggestions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.SearchResults) && kotlin.jvm.internal.Intrinsics.areEqual(this.suggestions, ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.SearchResults) other).suggestions);
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.SearchResults copy(java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> suggestions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suggestions, "");
            return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.SearchResults(suggestions);
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> component1() {
            return this.suggestions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.SearchResults copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.SearchResults searchResults, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = searchResults.suggestions;
            }
            return searchResults.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$Error;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchErrorType;", "type", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "errorContext", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchErrorType;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchErrorType;", "component2", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchErrorType;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchErrorType;", "getType", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getErrorContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent {
        public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext.$stable;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext;
        private final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType type;

        public Error(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType merchantSearchErrorType, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantSearchErrorType, "");
            this.type = merchantSearchErrorType;
            this.errorContext = errorContext;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType merchantSearchErrorType, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(merchantSearchErrorType, (i & 2) != 0 ? null : errorContext);
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType getType() {
            return this.type;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType merchantSearchErrorType = this.type;
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.errorContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(type=");
            sb.append(merchantSearchErrorType);
            sb.append(", errorContext=");
            sb.append(errorContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode();
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.errorContext;
            return (hashCode * 31) + (errorContext == null ? 0 : errorContext.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error error = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error) other;
            return this.type == error.type && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContext, error.errorContext);
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error copy(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType type, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error(type, errorContext);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error error, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType merchantSearchErrorType, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                merchantSearchErrorType = error.type;
            }
            if ((i & 2) != 0) {
                errorContext = error.errorContext;
            }
            return error.copy(merchantSearchErrorType, errorContext);
        }
    }
}
