package com.paypal.oslo.feature.contacts.ui.contacts.state;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent;", "", "LoadingRecents", "ShowingRecents", "Searching", "SearchResults", "SearchError", "Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent$LoadingRecents;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent$SearchError;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent$SearchResults;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent$Searching;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent$ShowingRecents;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ContactsContent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent$LoadingRecents;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadingRecents implements com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.LoadingRecents INSTANCE = new com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.LoadingRecents();

        public final int hashCode() {
            return 1323144748;
        }

        private LoadingRecents() {
        }

        public final java.lang.String toString() {
            return "LoadingRecents";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.LoadingRecents)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent$ShowingRecents;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowingRecents implements com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.ShowingRecents INSTANCE = new com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.ShowingRecents();

        public final int hashCode() {
            return 1862876035;
        }

        private ShowingRecents() {
        }

        public final java.lang.String toString() {
            return "ShowingRecents";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.ShowingRecents)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent$Searching;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Searching implements com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.Searching INSTANCE = new com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.Searching();

        public final int hashCode() {
            return -811449942;
        }

        private Searching() {
        }

        public final java.lang.String toString() {
            return "Searching";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.Searching)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent$SearchResults;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch;", "contacts", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext;", "ctaDisplayContext", "", "showNoResults", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext;Z)V", "component1", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "component2", "()Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext;", "component3", "()Z", "copy", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext;Z)Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent$SearchResults;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getContacts", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext;", "getCtaDisplayContext", "Z", "getShowNoResults"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchResults implements com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent {
        public static final int $stable = 8;
        private final androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch> contacts;
        private final com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext ctaDisplayContext;
        private final boolean showNoResults;

        public SearchResults(androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch> snapshotStateList, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext contactsCTAContext, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snapshotStateList, "");
            this.contacts = snapshotStateList;
            this.ctaDisplayContext = contactsCTAContext;
            this.showNoResults = z;
        }

        public /* synthetic */ SearchResults(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext contactsCTAContext, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? androidx.compose.runtime.SnapshotStateKt.mutableStateListOf() : snapshotStateList, (i & 2) != 0 ? null : contactsCTAContext, (i & 4) != 0 ? false : z);
        }

        public final androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch> getContacts() {
            return this.contacts;
        }

        public final com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext getCtaDisplayContext() {
            return this.ctaDisplayContext;
        }

        public final boolean getShowNoResults() {
            return this.showNoResults;
        }

        public final java.lang.String toString() {
            androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch> snapshotStateList = this.contacts;
            com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext contactsCTAContext = this.ctaDisplayContext;
            boolean z = this.showNoResults;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchResults(contacts=");
            sb.append(snapshotStateList);
            sb.append(", ctaDisplayContext=");
            sb.append(contactsCTAContext);
            sb.append(", showNoResults=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.contacts.hashCode();
            com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext contactsCTAContext = this.ctaDisplayContext;
            return (((hashCode * 31) + (contactsCTAContext == null ? 0 : contactsCTAContext.hashCode())) * 31) + java.lang.Boolean.hashCode(this.showNoResults);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchResults)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchResults searchResults = (com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchResults) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contacts, searchResults.contacts) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctaDisplayContext, searchResults.ctaDisplayContext) && this.showNoResults == searchResults.showNoResults;
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchResults copy(androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch> contacts, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext ctaDisplayContext, boolean showNoResults) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contacts, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchResults(contacts, ctaDisplayContext, showNoResults);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowNoResults() {
            return this.showNoResults;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext getCtaDisplayContext() {
            return this.ctaDisplayContext;
        }

        public final androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch> component1() {
            return this.contacts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchResults copy$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchResults searchResults, androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext contactsCTAContext, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                snapshotStateList = searchResults.contacts;
            }
            if ((i & 2) != 0) {
                contactsCTAContext = searchResults.ctaDisplayContext;
            }
            if ((i & 4) != 0) {
                z = searchResults.showNoResults;
            }
            return searchResults.copy(snapshotStateList, contactsCTAContext, z);
        }

        public SearchResults() {
            this(null, null, false, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent$SearchError;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent;", "Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;", "error", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;)Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsContent$SearchError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchError implements com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.api.domain.ContactSearchError error;

        public SearchError(com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchError, "");
            this.error = contactSearchError;
        }

        public final com.paypal.oslo.feature.contacts.api.domain.ContactSearchError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchError(error=");
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
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchError) other).error);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchError copy(com.paypal.oslo.feature.contacts.api.domain.ContactSearchError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.domain.ContactSearchError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchError copy$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchError searchError, com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contactSearchError = searchError.error;
            }
            return searchError.copy(contactSearchError);
        }
    }
}
