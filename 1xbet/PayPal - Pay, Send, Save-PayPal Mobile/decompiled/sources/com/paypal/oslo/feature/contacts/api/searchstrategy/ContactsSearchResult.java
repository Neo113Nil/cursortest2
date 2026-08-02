package com.paypal.oslo.feature.contacts.api.searchstrategy;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult;", "", "Loading", "LoadingMore", "Success", "Error", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult$Error;", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult$Loading;", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult$LoadingMore;", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ContactsSearchResult {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult$Loading;", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Loading INSTANCE = new com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Loading();

        public final int hashCode() {
            return 322183899;
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
            if (!(other instanceof com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult$LoadingMore;", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult;", "", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "contacts", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult$LoadingMore;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getContacts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadingMore implements com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> contacts;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadingMore(java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.contacts = list;
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> getContacts() {
            return this.contacts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list = this.contacts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadingMore(contacts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contacts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.LoadingMore) && kotlin.jvm.internal.Intrinsics.areEqual(this.contacts, ((com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.LoadingMore) other).contacts);
        }

        public final com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.LoadingMore copy(java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> contacts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contacts, "");
            return new com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.LoadingMore(contacts);
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> component1() {
            return this.contacts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.LoadingMore copy$default(com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.LoadingMore loadingMore, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = loadingMore.contacts;
            }
            return loadingMore.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult$Success;", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult;", "", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "contacts", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getContacts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> contacts;

        /* JADX WARN: Multi-variable type inference failed */
        public Success(java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.contacts = list;
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> getContacts() {
            return this.contacts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list = this.contacts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(contacts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contacts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.contacts, ((com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Success) other).contacts);
        }

        public final com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Success copy(java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> contacts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contacts, "");
            return new com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Success(contacts);
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> component1() {
            return this.contacts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Success copy$default(com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Success success, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.contacts;
            }
            return success.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult$Error;", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult;", "Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;", "error", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;)Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.api.domain.ContactSearchError error;

        public Error(com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchError, "");
            this.error = contactSearchError;
        }

        public final com.paypal.oslo.feature.contacts.api.domain.ContactSearchError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
            sb.append(contactSearchError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Error) other).error);
        }

        public final com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Error copy(com.paypal.oslo.feature.contacts.api.domain.ContactSearchError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Error(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.domain.ContactSearchError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Error copy$default(com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Error error, com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contactSearchError = error.error;
            }
            return error.copy(contactSearchError);
        }
    }
}
