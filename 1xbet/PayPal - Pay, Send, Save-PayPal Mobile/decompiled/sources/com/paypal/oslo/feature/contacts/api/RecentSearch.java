package com.paypal.oslo.feature.contacts.api;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "", "<init>", "()V", "SearchString", "ContactItem", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch$ContactItem;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch$SearchString;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class RecentSearch {
    public static final int $stable = 0;

    private RecentSearch() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/RecentSearch$SearchString;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "", "id", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "networkType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/NetworkType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/NetworkType;)Lcom/paypal/oslo/feature/contacts/api/RecentSearch$SearchString;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getValue", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "getNetworkType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchString extends com.paypal.oslo.feature.contacts.api.RecentSearch {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.contacts.api.NetworkType networkType;
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchString(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            this.id = str;
            this.value = str2;
            this.networkType = networkType;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final com.paypal.oslo.feature.contacts.api.NetworkType getNetworkType() {
            return this.networkType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.value;
            com.paypal.oslo.feature.contacts.api.NetworkType networkType = this.networkType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchString(id=");
            sb.append(str);
            sb.append(", value=");
            sb.append(str2);
            sb.append(", networkType=");
            sb.append(networkType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.value.hashCode()) * 31) + this.networkType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString searchString = (com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, searchString.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, searchString.value) && this.networkType == searchString.networkType;
        }

        public final com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString copy(java.lang.String id, java.lang.String value, com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            return new com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString(id, value, networkType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.NetworkType getNetworkType() {
            return this.networkType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString copy$default(com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString searchString, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.contacts.api.NetworkType networkType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = searchString.id;
            }
            if ((i & 2) != 0) {
                str2 = searchString.value;
            }
            if ((i & 4) != 0) {
                networkType = searchString.networkType;
            }
            return searchString.copy(str, str2, networkType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/RecentSearch$ContactItem;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "", "id", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "contact", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)Lcom/paypal/oslo/feature/contacts/api/RecentSearch$ContactItem;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "getContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactItem extends com.paypal.oslo.feature.contacts.api.RecentSearch {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact;
        private final java.lang.String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactItem(java.lang.String str, com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchContactItem, "");
            this.id = str;
            this.contact = contactSearchContactItem;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem getContact() {
            return this.contact;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem = this.contact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactItem(id=");
            sb.append(str);
            sb.append(", contact=");
            sb.append(contactSearchContactItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.contact.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem contactItem = (com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, contactItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.contact, contactItem.contact);
        }

        public final com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem copy(java.lang.String id, com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "");
            return new com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem(id, contact);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem getContact() {
            return this.contact;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem copy$default(com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem contactItem, java.lang.String str, com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = contactItem.id;
            }
            if ((i & 2) != 0) {
                contactSearchContactItem = contactItem.contact;
            }
            return contactItem.copy(str, contactSearchContactItem);
        }
    }

    public /* synthetic */ RecentSearch(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
