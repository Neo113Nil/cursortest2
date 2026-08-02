package com.paypal.oslo.feature.wallet.banks.ui.search;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState;", "", "InitialLoading", "InitialError", "PopularBanks", "EmptySearch", "SearchResults", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$EmptySearch;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$InitialError;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$InitialLoading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$PopularBanks;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SearchScreenState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$InitialLoading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitialLoading implements com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.InitialLoading INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.InitialLoading();

        public final int hashCode() {
            return -1974350416;
        }

        private InitialLoading() {
        }

        public final java.lang.String toString() {
            return "InitialLoading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.InitialLoading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$InitialError;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$InitialError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitialError implements com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState {
        public static final int $stable = 0;
        private final java.lang.String message;

        public InitialError(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitialError(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.InitialError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.InitialError) other).message);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.InitialError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.InitialError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.InitialError copy$default(com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.InitialError initialError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialError.message;
            }
            return initialError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$PopularBanks;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FinancialInstitution;", "institutions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$PopularBanks;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getInstitutions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PopularBanks implements com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> institutions;

        public PopularBanks(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.institutions = list;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> getInstitutions() {
            return this.institutions;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> list = this.institutions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PopularBanks(institutions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.institutions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.PopularBanks) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutions, ((com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.PopularBanks) other).institutions);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.PopularBanks copy(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> institutions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(institutions, "");
            return new com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.PopularBanks(institutions);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> component1() {
            return this.institutions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.PopularBanks copy$default(com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.PopularBanks popularBanks, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = popularBanks.institutions;
            }
            return popularBanks.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$EmptySearch;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptySearch implements com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.EmptySearch INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.EmptySearch();

        public final int hashCode() {
            return -996939779;
        }

        private EmptySearch() {
        }

        public final java.lang.String toString() {
            return "EmptySearch";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.EmptySearch)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState;", "Loading", "Success", "NoResults", "Error", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults$Loading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults$NoResults;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface SearchResults extends com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState {

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults$Loading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults;", "", "query", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FinancialInstitution;", "previousResults", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQuery", "Ljava/util/List;", "getPreviousResults"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading implements com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> previousResults;
            private final java.lang.String query;

            public Loading(java.lang.String str, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> list) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.query = str;
                this.previousResults = list;
            }

            public /* synthetic */ Loading(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : list);
            }

            public final java.lang.String getQuery() {
                return this.query;
            }

            public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> getPreviousResults() {
                return this.previousResults;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.query;
                java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> list = this.previousResults;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(query=");
                sb.append(str);
                sb.append(", previousResults=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.query.hashCode();
                java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> list = this.previousResults;
                return (hashCode * 31) + (list == null ? 0 : list.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Loading)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Loading loading = (com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Loading) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.query, loading.query) && kotlin.jvm.internal.Intrinsics.areEqual(this.previousResults, loading.previousResults);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Loading copy(java.lang.String query, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> previousResults) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Loading(query, previousResults);
            }

            public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> component2() {
                return this.previousResults;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getQuery() {
                return this.query;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Loading copy$default(com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Loading loading, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = loading.query;
                }
                if ((i & 2) != 0) {
                    list = loading.previousResults;
                }
                return loading.copy(str, list);
            }
        }

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults$Success;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults;", "", "query", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FinancialInstitution;", "institutions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQuery", "Ljava/util/List;", "getInstitutions"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success implements com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> institutions;
            private final java.lang.String query;

            public Success(java.lang.String str, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> list) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.query = str;
                this.institutions = list;
            }

            public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> getInstitutions() {
                return this.institutions;
            }

            public final java.lang.String getQuery() {
                return this.query;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.query;
                java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> list = this.institutions;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(query=");
                sb.append(str);
                sb.append(", institutions=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.query.hashCode() * 31) + this.institutions.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Success)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Success success = (com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Success) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.query, success.query) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutions, success.institutions);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Success copy(java.lang.String query, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> institutions) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(institutions, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Success(query, institutions);
            }

            public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution> component2() {
                return this.institutions;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getQuery() {
                return this.query;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Success copy$default(com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Success success, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = success.query;
                }
                if ((i & 2) != 0) {
                    list = success.institutions;
                }
                return success.copy(str, list);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults$NoResults;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults;", "", "query", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults$NoResults;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQuery"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoResults implements com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults {
            public static final int $stable = 0;
            private final java.lang.String query;

            public NoResults(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.query = str;
            }

            public final java.lang.String getQuery() {
                return this.query;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.query;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NoResults(query=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.query.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.NoResults) && kotlin.jvm.internal.Intrinsics.areEqual(this.query, ((com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.NoResults) other).query);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.NoResults copy(java.lang.String query) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.NoResults(query);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getQuery() {
                return this.query;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.NoResults copy$default(com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.NoResults noResults, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = noResults.query;
                }
                return noResults.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults;", "", "query", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/search/SearchScreenState$SearchResults$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQuery", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error implements com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults {
            public static final int $stable = 0;
            private final java.lang.String message;
            private final java.lang.String query;

            public Error(java.lang.String str, java.lang.String str2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.query = str;
                this.message = str2;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String getQuery() {
                return this.query;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.query;
                java.lang.String str2 = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(query=");
                sb.append(str);
                sb.append(", message=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.query.hashCode() * 31) + this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Error)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Error error = (com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Error) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.query, error.query) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Error copy(java.lang.String query, java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Error(query, message);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getQuery() {
                return this.query;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Error copy$default(com.paypal.oslo.feature.wallet.banks.ui.search.SearchScreenState.SearchResults.Error error, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.query;
                }
                if ((i & 2) != 0) {
                    str2 = error.message;
                }
                return error.copy(str, str2);
            }
        }
    }
}
