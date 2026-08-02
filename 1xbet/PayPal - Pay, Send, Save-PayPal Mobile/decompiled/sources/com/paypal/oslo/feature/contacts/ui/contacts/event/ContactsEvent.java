package com.paypal.oslo.feature.contacts.ui.contacts.event;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u001b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u001b%&'()*+,-./0123456789:;<=>?"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnContactClicked", "SearchQueryChanged", "ShowCountryPickerChanged", "CountrySelected", "UpdateFormattingResult", "UpdateRecentCountries", "SearchTriggered", "SearchStarted", "SearchLoadingMore", "SearchCompleted", "SearchFailed", "SearchCleared", "LoadRecentSearches", "RecentSearchesSuccess", "RecentSearchesError", "OnRecentSearchClicked", "DeleteAllRecentSearches", "DeleteARecentSearch", "CreateContactRecentSearch", "CreateStringRecentSearch", "DeleteAllRecentSearchesSuccess", "DeleteAllRecentSearchesError", "DeleteARecentSearchSuccess", "DeleteARecentSearchError", "CreateRecentSearchSuccess", "CreateRecentSearchError", "RecentContactSearchAdded", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CountrySelected;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CreateContactRecentSearch;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CreateRecentSearchError;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CreateRecentSearchSuccess;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CreateStringRecentSearch;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteARecentSearch;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteARecentSearchError;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteARecentSearchSuccess;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteAllRecentSearches;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteAllRecentSearchesError;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteAllRecentSearchesSuccess;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$LoadRecentSearches;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$OnContactClicked;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$OnRecentSearchClicked;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$RecentContactSearchAdded;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$RecentSearchesError;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$RecentSearchesSuccess;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchCleared;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchCompleted;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchFailed;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchLoadingMore;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchQueryChanged;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchStarted;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchTriggered;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$ShowCountryPickerChanged;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$UpdateFormattingResult;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$UpdateRecentCountries;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ContactsEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ContactsEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$OnContactClicked;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "contact", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$OnContactClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "getContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnContactClicked extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnContactClicked(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            super("OnContactClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchContactItem, "");
            this.contact = contactSearchContactItem;
        }

        public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem getContact() {
            return this.contact;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem = this.contact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnContactClicked(contact=");
            sb.append(contactSearchContactItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contact.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnContactClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.contact, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnContactClicked) other).contact);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnContactClicked copy(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnContactClicked(contact);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem getContact() {
            return this.contact;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnContactClicked copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnContactClicked onContactClicked, com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contactSearchContactItem = onContactClicked.contact;
            }
            return onContactClicked.copy(contactSearchContactItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchQueryChanged;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "query", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchQueryChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQuery"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchQueryChanged extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final java.lang.String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchQueryChanged(java.lang.String str) {
            super("SearchQueryChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.query = str;
        }

        public final java.lang.String getQuery() {
            return this.query;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.query;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchQueryChanged(query=");
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
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.query, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged) other).query);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged copy(java.lang.String query) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged(query);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getQuery() {
            return this.query;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged searchQueryChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = searchQueryChanged.query;
            }
            return searchQueryChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$ShowCountryPickerChanged;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "show", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$ShowCountryPickerChanged;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShow"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCountryPickerChanged extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final boolean show;

        public ShowCountryPickerChanged(boolean z) {
            super("ShowCountryPickerChanged", null);
            this.show = z;
        }

        public final boolean getShow() {
            return this.show;
        }

        public final java.lang.String toString() {
            boolean z = this.show;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowCountryPickerChanged(show=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.show);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.ShowCountryPickerChanged) && this.show == ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.ShowCountryPickerChanged) other).show;
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.ShowCountryPickerChanged copy(boolean show) {
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.ShowCountryPickerChanged(show);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShow() {
            return this.show;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.ShowCountryPickerChanged copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.ShowCountryPickerChanged showCountryPickerChanged, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = showCountryPickerChanged.show;
            }
            return showCountryPickerChanged.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CountrySelected;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "", "searchQuery", "", "recentCountries", "<init>", "(Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CountrySelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;", "getCountry", "Ljava/lang/String;", "getSearchQuery", "Ljava/util/List;", "getRecentCountries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CountrySelected extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi country;
        private final java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> recentCountries;
        private final java.lang.String searchQuery;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountrySelected(com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi, java.lang.String str, java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> list) {
            super("CountrySelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryUi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.country = countryUi;
            this.searchQuery = str;
            this.recentCountries = list;
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi getCountry() {
            return this.country;
        }

        public final java.lang.String getSearchQuery() {
            return this.searchQuery;
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> getRecentCountries() {
            return this.recentCountries;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi = this.country;
            java.lang.String str = this.searchQuery;
            java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> list = this.recentCountries;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CountrySelected(country=");
            sb.append(countryUi);
            sb.append(", searchQuery=");
            sb.append(str);
            sb.append(", recentCountries=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.country.hashCode() * 31) + this.searchQuery.hashCode()) * 31) + this.recentCountries.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CountrySelected)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CountrySelected countrySelected = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CountrySelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.country, countrySelected.country) && kotlin.jvm.internal.Intrinsics.areEqual(this.searchQuery, countrySelected.searchQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.recentCountries, countrySelected.recentCountries);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CountrySelected copy(com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi country, java.lang.String searchQuery, java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> recentCountries) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchQuery, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentCountries, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CountrySelected(country, searchQuery, recentCountries);
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> component3() {
            return this.recentCountries;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSearchQuery() {
            return this.searchQuery;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi getCountry() {
            return this.country;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CountrySelected copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CountrySelected countrySelected, com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                countryUi = countrySelected.country;
            }
            if ((i & 2) != 0) {
                str = countrySelected.searchQuery;
            }
            if ((i & 4) != 0) {
                list = countrySelected.recentCountries;
            }
            return countrySelected.copy(countryUi, str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$UpdateFormattingResult;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "countryCode", "displayText", "normalizedQuery", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;", "searchQueryType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$UpdateFormattingResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "getDisplayText", "getNormalizedQuery", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;", "getSearchQueryType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateFormattingResult extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final java.lang.String displayText;
        private final java.lang.String normalizedQuery;
        private final com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateFormattingResult(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType) {
            super("UpdateFormattingResult", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchQueryType, "");
            this.countryCode = str;
            this.displayText = str2;
            this.normalizedQuery = str3;
            this.searchQueryType = searchQueryType;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getDisplayText() {
            return this.displayText;
        }

        public final java.lang.String getNormalizedQuery() {
            return this.normalizedQuery;
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType getSearchQueryType() {
            return this.searchQueryType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            java.lang.String str2 = this.displayText;
            java.lang.String str3 = this.normalizedQuery;
            com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType = this.searchQueryType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateFormattingResult(countryCode=");
            sb.append(str);
            sb.append(", displayText=");
            sb.append(str2);
            sb.append(", normalizedQuery=");
            sb.append(str3);
            sb.append(", searchQueryType=");
            sb.append(searchQueryType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.countryCode;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.displayText;
            return (((((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.normalizedQuery.hashCode()) * 31) + this.searchQueryType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateFormattingResult)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateFormattingResult updateFormattingResult = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateFormattingResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, updateFormattingResult.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayText, updateFormattingResult.displayText) && kotlin.jvm.internal.Intrinsics.areEqual(this.normalizedQuery, updateFormattingResult.normalizedQuery) && this.searchQueryType == updateFormattingResult.searchQueryType;
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateFormattingResult copy(java.lang.String countryCode, java.lang.String displayText, java.lang.String normalizedQuery, com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(normalizedQuery, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchQueryType, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateFormattingResult(countryCode, displayText, normalizedQuery, searchQueryType);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType getSearchQueryType() {
            return this.searchQueryType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNormalizedQuery() {
            return this.normalizedQuery;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDisplayText() {
            return this.displayText;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateFormattingResult copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateFormattingResult updateFormattingResult, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateFormattingResult.countryCode;
            }
            if ((i & 2) != 0) {
                str2 = updateFormattingResult.displayText;
            }
            if ((i & 4) != 0) {
                str3 = updateFormattingResult.normalizedQuery;
            }
            if ((i & 8) != 0) {
                searchQueryType = updateFormattingResult.searchQueryType;
            }
            return updateFormattingResult.copy(str, str2, str3, searchQueryType);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$UpdateRecentCountries;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;", "recentCountries", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$UpdateRecentCountries;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRecentCountries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateRecentCountries extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> recentCountries;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateRecentCountries(java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> list) {
            super("UpdateRecentCountries", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.recentCountries = list;
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> getRecentCountries() {
            return this.recentCountries;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> list = this.recentCountries;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateRecentCountries(recentCountries=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.recentCountries.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateRecentCountries) && kotlin.jvm.internal.Intrinsics.areEqual(this.recentCountries, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateRecentCountries) other).recentCountries);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateRecentCountries copy(java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> recentCountries) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentCountries, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateRecentCountries(recentCountries);
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi> component1() {
            return this.recentCountries;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateRecentCountries copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateRecentCountries updateRecentCountries, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = updateRecentCountries.recentCountries;
            }
            return updateRecentCountries.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchTriggered;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "query", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchTriggered;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQuery"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchTriggered extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final java.lang.String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchTriggered(java.lang.String str) {
            super("SearchTriggered", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.query = str;
        }

        public final java.lang.String getQuery() {
            return this.query;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.query;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchTriggered(query=");
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
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchTriggered) && kotlin.jvm.internal.Intrinsics.areEqual(this.query, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchTriggered) other).query);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchTriggered copy(java.lang.String query) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchTriggered(query);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getQuery() {
            return this.query;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchTriggered copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchTriggered searchTriggered, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = searchTriggered.query;
            }
            return searchTriggered.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchStarted;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchStarted extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchStarted INSTANCE = new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchStarted();

        public final int hashCode() {
            return 1446056531;
        }

        private SearchStarted() {
            super("SearchStarted", null);
        }

        public final java.lang.String toString() {
            return "SearchStarted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchStarted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchLoadingMore;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "partialContacts", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchLoadingMore;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPartialContacts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchLoadingMore extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> partialContacts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SearchLoadingMore(java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list) {
            super("SearchLoadingMore", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.partialContacts = list;
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> getPartialContacts() {
            return this.partialContacts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list = this.partialContacts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchLoadingMore(partialContacts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.partialContacts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchLoadingMore) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialContacts, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchLoadingMore) other).partialContacts);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchLoadingMore copy(java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> partialContacts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partialContacts, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchLoadingMore(partialContacts);
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> component1() {
            return this.partialContacts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchLoadingMore copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchLoadingMore searchLoadingMore, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = searchLoadingMore.partialContacts;
            }
            return searchLoadingMore.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchCompleted;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "contacts", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getContacts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchCompleted extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> contacts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SearchCompleted(java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list) {
            super("SearchCompleted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.contacts = list;
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> getContacts() {
            return this.contacts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list = this.contacts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchCompleted(contacts=");
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
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCompleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.contacts, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCompleted) other).contacts);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCompleted copy(java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> contacts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contacts, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCompleted(contacts);
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> component1() {
            return this.contacts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCompleted copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCompleted searchCompleted, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = searchCompleted.contacts;
            }
            return searchCompleted.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchFailed;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;", "error", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchFailed extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.api.domain.ContactSearchError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchFailed(com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError) {
            super("SearchFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchError, "");
            this.error = contactSearchError;
        }

        public final com.paypal.oslo.feature.contacts.api.domain.ContactSearchError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchFailed(error=");
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
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchFailed) other).error);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchFailed copy(com.paypal.oslo.feature.contacts.api.domain.ContactSearchError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.domain.ContactSearchError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchFailed copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchFailed searchFailed, com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contactSearchError = searchFailed.error;
            }
            return searchFailed.copy(contactSearchError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$SearchCleared;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchCleared extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCleared INSTANCE = new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCleared();

        public final int hashCode() {
            return -94947970;
        }

        private SearchCleared() {
            super("SearchCleared", null);
        }

        public final java.lang.String toString() {
            return "SearchCleared";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCleared)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$LoadRecentSearches;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "networkType", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/NetworkType;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/NetworkType;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$LoadRecentSearches;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "getNetworkType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadRecentSearches extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.contacts.api.NetworkType networkType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadRecentSearches(com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
            super("LoadRecentSearches", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            this.networkType = networkType;
        }

        public final com.paypal.oslo.feature.contacts.api.NetworkType getNetworkType() {
            return this.networkType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.api.NetworkType networkType = this.networkType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadRecentSearches(networkType=");
            sb.append(networkType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.networkType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches) && this.networkType == ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches) other).networkType;
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches copy(com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches(networkType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.NetworkType getNetworkType() {
            return this.networkType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches loadRecentSearches, com.paypal.oslo.feature.contacts.api.NetworkType networkType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                networkType = loadRecentSearches.networkType;
            }
            return loadRecentSearches.copy(networkType);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$RecentSearchesSuccess;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "recentSearches", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$RecentSearchesSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRecentSearches"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecentSearchesSuccess extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.contacts.api.RecentSearch> recentSearches;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RecentSearchesSuccess(java.util.List<? extends com.paypal.oslo.feature.contacts.api.RecentSearch> list) {
            super("RecentSearchesSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.recentSearches = list;
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.api.RecentSearch> getRecentSearches() {
            return this.recentSearches;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.contacts.api.RecentSearch> list = this.recentSearches;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecentSearchesSuccess(recentSearches=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.recentSearches.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.recentSearches, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesSuccess) other).recentSearches);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesSuccess copy(java.util.List<? extends com.paypal.oslo.feature.contacts.api.RecentSearch> recentSearches) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearches, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesSuccess(recentSearches);
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.api.RecentSearch> component1() {
            return this.recentSearches;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesSuccess copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesSuccess recentSearchesSuccess, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = recentSearchesSuccess.recentSearches;
            }
            return recentSearchesSuccess.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$RecentSearchesError;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$RecentSearchesError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecentSearchesError extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecentSearchesError(java.lang.String str) {
            super("RecentSearchesError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecentSearchesError(error=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesError) other).error);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesError copy(java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesError copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesError recentSearchesError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = recentSearchesError.error;
            }
            return recentSearchesError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$OnRecentSearchClicked;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "recentSearch", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/RecentSearch;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/RecentSearch;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$OnRecentSearchClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "getRecentSearch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRecentSearchClicked extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = com.paypal.oslo.feature.contacts.api.RecentSearch.$stable;
        private final com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRecentSearchClicked(com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch) {
            super("OnRecentSearchClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearch, "");
            this.recentSearch = recentSearch;
        }

        public final com.paypal.oslo.feature.contacts.api.RecentSearch getRecentSearch() {
            return this.recentSearch;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch = this.recentSearch;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRecentSearchClicked(recentSearch=");
            sb.append(recentSearch);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.recentSearch.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnRecentSearchClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.recentSearch, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnRecentSearchClicked) other).recentSearch);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnRecentSearchClicked copy(com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearch, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnRecentSearchClicked(recentSearch);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.RecentSearch getRecentSearch() {
            return this.recentSearch;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnRecentSearchClicked copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnRecentSearchClicked onRecentSearchClicked, com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                recentSearch = onRecentSearchClicked.recentSearch;
            }
            return onRecentSearchClicked.copy(recentSearch);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteAllRecentSearches;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "networkType", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/NetworkType;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/NetworkType;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteAllRecentSearches;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "getNetworkType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteAllRecentSearches extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.contacts.api.NetworkType networkType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteAllRecentSearches(com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
            super("DeleteAllRecentSearches", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            this.networkType = networkType;
        }

        public final com.paypal.oslo.feature.contacts.api.NetworkType getNetworkType() {
            return this.networkType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.api.NetworkType networkType = this.networkType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteAllRecentSearches(networkType=");
            sb.append(networkType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.networkType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearches) && this.networkType == ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearches) other).networkType;
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearches copy(com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearches(networkType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.NetworkType getNetworkType() {
            return this.networkType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearches copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearches deleteAllRecentSearches, com.paypal.oslo.feature.contacts.api.NetworkType networkType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                networkType = deleteAllRecentSearches.networkType;
            }
            return deleteAllRecentSearches.copy(networkType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteARecentSearch;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteARecentSearch;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteARecentSearch extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final java.lang.String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteARecentSearch(java.lang.String str) {
            super("DeleteARecentSearch", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteARecentSearch(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch) other).id);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch deleteARecentSearch, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deleteARecentSearch.id;
            }
            return deleteARecentSearch.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CreateContactRecentSearch;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "networkType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/NetworkType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/NetworkType;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CreateContactRecentSearch;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContactId", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "getNetworkType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateContactRecentSearch extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final java.lang.String contactId;
        private final com.paypal.oslo.feature.contacts.api.NetworkType networkType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateContactRecentSearch(java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
            super("CreateContactRecentSearch", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            this.contactId = str;
            this.networkType = networkType;
        }

        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public final com.paypal.oslo.feature.contacts.api.NetworkType getNetworkType() {
            return this.networkType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contactId;
            com.paypal.oslo.feature.contacts.api.NetworkType networkType = this.networkType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateContactRecentSearch(contactId=");
            sb.append(str);
            sb.append(", networkType=");
            sb.append(networkType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.contactId.hashCode() * 31) + this.networkType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateContactRecentSearch)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateContactRecentSearch createContactRecentSearch = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateContactRecentSearch) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, createContactRecentSearch.contactId) && this.networkType == createContactRecentSearch.networkType;
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateContactRecentSearch copy(java.lang.String contactId, com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateContactRecentSearch(contactId, networkType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.NetworkType getNetworkType() {
            return this.networkType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateContactRecentSearch copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateContactRecentSearch createContactRecentSearch, java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = createContactRecentSearch.contactId;
            }
            if ((i & 2) != 0) {
                networkType = createContactRecentSearch.networkType;
            }
            return createContactRecentSearch.copy(str, networkType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CreateStringRecentSearch;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "networkType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/NetworkType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/NetworkType;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CreateStringRecentSearch;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "getNetworkType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateStringRecentSearch extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.contacts.api.NetworkType networkType;
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateStringRecentSearch(java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
            super("CreateStringRecentSearch", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            this.value = str;
            this.networkType = networkType;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final com.paypal.oslo.feature.contacts.api.NetworkType getNetworkType() {
            return this.networkType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            com.paypal.oslo.feature.contacts.api.NetworkType networkType = this.networkType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateStringRecentSearch(value=");
            sb.append(str);
            sb.append(", networkType=");
            sb.append(networkType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.networkType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateStringRecentSearch)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateStringRecentSearch createStringRecentSearch = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateStringRecentSearch) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, createStringRecentSearch.value) && this.networkType == createStringRecentSearch.networkType;
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateStringRecentSearch copy(java.lang.String value, com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateStringRecentSearch(value, networkType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.NetworkType getNetworkType() {
            return this.networkType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateStringRecentSearch copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateStringRecentSearch createStringRecentSearch, java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = createStringRecentSearch.value;
            }
            if ((i & 2) != 0) {
                networkType = createStringRecentSearch.networkType;
            }
            return createStringRecentSearch.copy(str, networkType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteAllRecentSearchesSuccess;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteAllRecentSearchesSuccess extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearchesSuccess INSTANCE = new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearchesSuccess();

        public final int hashCode() {
            return 1129216834;
        }

        private DeleteAllRecentSearchesSuccess() {
            super("DeleteAllRecentSearchesSuccess", null);
        }

        public final java.lang.String toString() {
            return "DeleteAllRecentSearchesSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearchesSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteAllRecentSearchesError;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteAllRecentSearchesError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteAllRecentSearchesError extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteAllRecentSearchesError(java.lang.String str) {
            super("DeleteAllRecentSearchesError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteAllRecentSearchesError(error=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearchesError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearchesError) other).error);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearchesError copy(java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearchesError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearchesError copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearchesError deleteAllRecentSearchesError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deleteAllRecentSearchesError.error;
            }
            return deleteAllRecentSearchesError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteARecentSearchSuccess;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteARecentSearchSuccess extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearchSuccess INSTANCE = new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearchSuccess();

        public final int hashCode() {
            return 1838207088;
        }

        private DeleteARecentSearchSuccess() {
            super("DeleteARecentSearchSuccess", null);
        }

        public final java.lang.String toString() {
            return "DeleteARecentSearchSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearchSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteARecentSearchError;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$DeleteARecentSearchError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteARecentSearchError extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteARecentSearchError(java.lang.String str) {
            super("DeleteARecentSearchError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteARecentSearchError(error=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearchError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearchError) other).error);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearchError copy(java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearchError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearchError copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearchError deleteARecentSearchError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deleteARecentSearchError.error;
            }
            return deleteARecentSearchError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CreateRecentSearchSuccess;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateRecentSearchSuccess extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateRecentSearchSuccess INSTANCE = new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateRecentSearchSuccess();

        public final int hashCode() {
            return -519733858;
        }

        private CreateRecentSearchSuccess() {
            super("CreateRecentSearchSuccess", null);
        }

        public final java.lang.String toString() {
            return "CreateRecentSearchSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateRecentSearchSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CreateRecentSearchError;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$CreateRecentSearchError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateRecentSearchError extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 0;
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateRecentSearchError(java.lang.String str) {
            super("CreateRecentSearchError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateRecentSearchError(error=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateRecentSearchError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateRecentSearchError) other).error);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateRecentSearchError copy(java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateRecentSearchError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateRecentSearchError copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateRecentSearchError createRecentSearchError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = createRecentSearchError.error;
            }
            return createRecentSearchError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$RecentContactSearchAdded;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "contact", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent$RecentContactSearchAdded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "getContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecentContactSearchAdded extends com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecentContactSearchAdded(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            super("RecentContactSearchAdded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchContactItem, "");
            this.contact = contactSearchContactItem;
        }

        public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem getContact() {
            return this.contact;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem = this.contact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecentContactSearchAdded(contact=");
            sb.append(contactSearchContactItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contact.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentContactSearchAdded) && kotlin.jvm.internal.Intrinsics.areEqual(this.contact, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentContactSearchAdded) other).contact);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentContactSearchAdded copy(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentContactSearchAdded(contact);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem getContact() {
            return this.contact;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentContactSearchAdded copy$default(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentContactSearchAdded recentContactSearchAdded, com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contactSearchContactItem = recentContactSearchAdded.contact;
            }
            return recentContactSearchAdded.copy(contactSearchContactItem);
        }
    }

    public /* synthetic */ ContactsEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
