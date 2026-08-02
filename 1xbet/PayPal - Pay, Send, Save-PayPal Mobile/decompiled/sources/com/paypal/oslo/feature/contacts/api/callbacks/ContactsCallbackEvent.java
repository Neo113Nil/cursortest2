package com.paypal.oslo.feature.contacts.api.callbacks;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "", "SearchEvent", "ContactEvent", "UnilateralContactEvent", "CustomActionEvent", "HeaderActionEvent", "BackPressed", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$BackPressed;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$ContactEvent;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$CustomActionEvent;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$HeaderActionEvent;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$SearchEvent;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$UnilateralContactEvent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ContactsCallbackEvent {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$SearchEvent;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "TextChanged", "SearchBarClicked", "Cleared", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$SearchEvent$Cleared;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$SearchEvent$SearchBarClicked;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$SearchEvent$TextChanged;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface SearchEvent extends com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent {

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$SearchEvent$TextChanged;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$SearchEvent;", "", "query", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$SearchEvent$TextChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQuery"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TextChanged implements com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent {
            public static final int $stable = 0;
            private final java.lang.String query;

            public TextChanged(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.query = str;
            }

            public final java.lang.String getQuery() {
                return this.query;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.query;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TextChanged(query=");
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
                return (other instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.TextChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.query, ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.TextChanged) other).query);
            }

            public final com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.TextChanged copy(java.lang.String query) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
                return new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.TextChanged(query);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getQuery() {
                return this.query;
            }

            public static /* synthetic */ com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.TextChanged copy$default(com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.TextChanged textChanged, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = textChanged.query;
                }
                return textChanged.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$SearchEvent$SearchBarClicked;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$SearchEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SearchBarClicked implements com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.SearchBarClicked INSTANCE = new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.SearchBarClicked();

            public final int hashCode() {
                return 272189346;
            }

            private SearchBarClicked() {
            }

            public final java.lang.String toString() {
                return "SearchBarClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.SearchBarClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$SearchEvent$Cleared;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$SearchEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Cleared implements com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.Cleared INSTANCE = new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.Cleared();

            public final int hashCode() {
                return -1612610138;
            }

            private Cleared() {
            }

            public final java.lang.String toString() {
                return "Cleared";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.Cleared)) {
                    return false;
                }
                return true;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$ContactEvent;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "ContactClicked", "ActionClicked", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$ContactEvent$ActionClicked;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$ContactEvent$ContactClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface ContactEvent extends com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent {

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$ContactEvent$ContactClicked;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$ContactEvent;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "item", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$ContactEvent$ContactClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ContactClicked implements com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem item;

            public ContactClicked(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchContactItem, "");
                this.item = contactSearchContactItem;
            }

            public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem getItem() {
                return this.item;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem = this.item;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactClicked(item=");
                sb.append(contactSearchContactItem);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.item.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked) other).item);
            }

            public final com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked copy(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem item) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
                return new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked(item);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem getItem() {
                return this.item;
            }

            public static /* synthetic */ com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked copy$default(com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked contactClicked, com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    contactSearchContactItem = contactClicked.item;
                }
                return contactClicked.copy(contactSearchContactItem);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$ContactEvent$ActionClicked;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$ContactEvent;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "contact", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$ContactEvent$ActionClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "getContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ActionClicked implements com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact;

            public ActionClicked(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchContactItem, "");
                this.contact = contactSearchContactItem;
            }

            public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem getContact() {
                return this.contact;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem = this.contact;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ActionClicked(contact=");
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
                return (other instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ActionClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.contact, ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ActionClicked) other).contact);
            }

            public final com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ActionClicked copy(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "");
                return new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ActionClicked(contact);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem getContact() {
                return this.contact;
            }

            public static /* synthetic */ com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ActionClicked copy$default(com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ActionClicked actionClicked, com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    contactSearchContactItem = actionClicked.contact;
                }
                return actionClicked.copy(contactSearchContactItem);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$UnilateralContactEvent;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "CardClicked", "InfoIconClicked", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$UnilateralContactEvent$CardClicked;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$UnilateralContactEvent$InfoIconClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface UnilateralContactEvent extends com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent {

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$UnilateralContactEvent$CardClicked;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$UnilateralContactEvent;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchUnilateralItem;", "item", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchUnilateralItem;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/ContactSearchUnilateralItem;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchUnilateralItem;)Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$UnilateralContactEvent$CardClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchUnilateralItem;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CardClicked implements com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem item;

            public CardClicked(com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem contactSearchUnilateralItem) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchUnilateralItem, "");
                this.item = contactSearchUnilateralItem;
            }

            public final com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem getItem() {
                return this.item;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem contactSearchUnilateralItem = this.item;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CardClicked(item=");
                sb.append(contactSearchUnilateralItem);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.item.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.CardClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.CardClicked) other).item);
            }

            public final com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.CardClicked copy(com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem item) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
                return new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.CardClicked(item);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem getItem() {
                return this.item;
            }

            public static /* synthetic */ com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.CardClicked copy$default(com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.CardClicked cardClicked, com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem contactSearchUnilateralItem, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    contactSearchUnilateralItem = cardClicked.item;
                }
                return cardClicked.copy(contactSearchUnilateralItem);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$UnilateralContactEvent$InfoIconClicked;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$UnilateralContactEvent;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchUnilateralItem;", "item", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchUnilateralItem;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/ContactSearchUnilateralItem;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchUnilateralItem;)Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$UnilateralContactEvent$InfoIconClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchUnilateralItem;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InfoIconClicked implements com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem item;

            public InfoIconClicked(com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem contactSearchUnilateralItem) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchUnilateralItem, "");
                this.item = contactSearchUnilateralItem;
            }

            public final com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem getItem() {
                return this.item;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem contactSearchUnilateralItem = this.item;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InfoIconClicked(item=");
                sb.append(contactSearchUnilateralItem);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.item.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.InfoIconClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.InfoIconClicked) other).item);
            }

            public final com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.InfoIconClicked copy(com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem item) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
                return new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.InfoIconClicked(item);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem getItem() {
                return this.item;
            }

            public static /* synthetic */ com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.InfoIconClicked copy$default(com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.InfoIconClicked infoIconClicked, com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem contactSearchUnilateralItem, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    contactSearchUnilateralItem = infoIconClicked.item;
                }
                return infoIconClicked.copy(contactSearchUnilateralItem);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$CustomActionEvent;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "CardClicked", "InfoIconClicked", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$CustomActionEvent$CardClicked;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$CustomActionEvent$InfoIconClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface CustomActionEvent extends com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent {

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$CustomActionEvent$CardClicked;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$CustomActionEvent;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;", "type", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;)Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$CustomActionEvent$CardClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CardClicked implements com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType type;

            public CardClicked(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType contactsCTAType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsCTAType, "");
                this.type = contactsCTAType;
            }

            public final com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType getType() {
                return this.type;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType contactsCTAType = this.type;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CardClicked(type=");
                sb.append(contactsCTAType);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.type.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked) other).type);
            }

            public final com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked copy(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType type) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                return new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked(type);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType getType() {
                return this.type;
            }

            public static /* synthetic */ com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked copy$default(com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked cardClicked, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType contactsCTAType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    contactsCTAType = cardClicked.type;
                }
                return cardClicked.copy(contactsCTAType);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$CustomActionEvent$InfoIconClicked;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$CustomActionEvent;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;", "type", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;)Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$CustomActionEvent$InfoIconClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InfoIconClicked implements com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType type;

            public InfoIconClicked(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType contactsCTAType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsCTAType, "");
                this.type = contactsCTAType;
            }

            public final com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType getType() {
                return this.type;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType contactsCTAType = this.type;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InfoIconClicked(type=");
                sb.append(contactsCTAType);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.type.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked) other).type);
            }

            public final com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked copy(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType type) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                return new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked(type);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType getType() {
                return this.type;
            }

            public static /* synthetic */ com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked copy$default(com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked infoIconClicked, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType contactsCTAType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    contactsCTAType = infoIconClicked.type;
                }
                return infoIconClicked.copy(contactsCTAType);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$HeaderActionEvent;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "ActionClicked", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$HeaderActionEvent$ActionClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface HeaderActionEvent extends com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent {

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$HeaderActionEvent$ActionClicked;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$HeaderActionEvent;", "Lcom/paypal/oslo/feature/contacts/api/HeaderActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "<init>", "(Lcom/paypal/oslo/feature/contacts/api/HeaderActionType;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/HeaderActionType;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/HeaderActionType;)Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$HeaderActionEvent$ActionClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/HeaderActionType;", "getActionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ActionClicked implements com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.HeaderActionEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.contacts.api.HeaderActionType actionType;

            public ActionClicked(com.paypal.oslo.feature.contacts.api.HeaderActionType headerActionType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerActionType, "");
                this.actionType = headerActionType;
            }

            public final com.paypal.oslo.feature.contacts.api.HeaderActionType getActionType() {
                return this.actionType;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.contacts.api.HeaderActionType headerActionType = this.actionType;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ActionClicked(actionType=");
                sb.append(headerActionType);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.actionType.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.HeaderActionEvent.ActionClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionType, ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.HeaderActionEvent.ActionClicked) other).actionType);
            }

            public final com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.HeaderActionEvent.ActionClicked copy(com.paypal.oslo.feature.contacts.api.HeaderActionType actionType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
                return new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.HeaderActionEvent.ActionClicked(actionType);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.contacts.api.HeaderActionType getActionType() {
                return this.actionType;
            }

            public static /* synthetic */ com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.HeaderActionEvent.ActionClicked copy$default(com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.HeaderActionEvent.ActionClicked actionClicked, com.paypal.oslo.feature.contacts.api.HeaderActionType headerActionType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    headerActionType = actionClicked.actionType;
                }
                return actionClicked.copy(headerActionType);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$BackPressed;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackPressed implements com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.BackPressed INSTANCE = new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.BackPressed();

        public final int hashCode() {
            return 384227697;
        }

        private BackPressed() {
        }

        public final java.lang.String toString() {
            return "BackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.BackPressed)) {
                return false;
            }
            return true;
        }
    }
}
