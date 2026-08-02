package com.paypal.oslo.feature.contacts.ui.contacts.effect;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/effect/ContactsEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "<init>", "()V", "ContactSelected", "RecentSearchSelected", "Lcom/paypal/oslo/feature/contacts/ui/contacts/effect/ContactsEffect$ContactSelected;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/effect/ContactsEffect$RecentSearchSelected;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ContactsEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;

    private ContactsEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/effect/ContactsEffect$ContactSelected;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/effect/ContactsEffect;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "contact", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)Lcom/paypal/oslo/feature/contacts/ui/contacts/effect/ContactsEffect$ContactSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "getContact", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactSelected extends com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactSelected(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchContactItem, "");
            this.contact = contactSearchContactItem;
            this.name = "ContactSelected";
        }

        public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem getContact() {
            return this.contact;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem = this.contact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactSelected(contact=");
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
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.ContactSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.contact, ((com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.ContactSelected) other).contact);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.ContactSelected copy(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.ContactSelected(contact);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem getContact() {
            return this.contact;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.ContactSelected copy$default(com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.ContactSelected contactSelected, com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contactSearchContactItem = contactSelected.contact;
            }
            return contactSelected.copy(contactSearchContactItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/effect/ContactsEffect$RecentSearchSelected;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/effect/ContactsEffect;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "recentSearch", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/RecentSearch;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/RecentSearch;)Lcom/paypal/oslo/feature/contacts/ui/contacts/effect/ContactsEffect$RecentSearchSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "getRecentSearch", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecentSearchSelected extends com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect {
        public static final int $stable = com.paypal.oslo.feature.contacts.api.RecentSearch.$stable;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecentSearchSelected(com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearch, "");
            this.recentSearch = recentSearch;
            this.name = "RecentSearchSelected";
        }

        public final com.paypal.oslo.feature.contacts.api.RecentSearch getRecentSearch() {
            return this.recentSearch;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch = this.recentSearch;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecentSearchSelected(recentSearch=");
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
            return (other instanceof com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.RecentSearchSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.recentSearch, ((com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.RecentSearchSelected) other).recentSearch);
        }

        public final com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.RecentSearchSelected copy(com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearch, "");
            return new com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.RecentSearchSelected(recentSearch);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.RecentSearch getRecentSearch() {
            return this.recentSearch;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.RecentSearchSelected copy$default(com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.RecentSearchSelected recentSearchSelected, com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                recentSearch = recentSearchSelected.recentSearch;
            }
            return recentSearchSelected.copy(recentSearch);
        }
    }

    public /* synthetic */ ContactsEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
