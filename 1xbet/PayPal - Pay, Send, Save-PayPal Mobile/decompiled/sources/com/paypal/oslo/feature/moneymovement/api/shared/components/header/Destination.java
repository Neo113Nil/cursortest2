package com.paypal.oslo.feature.moneymovement.api.shared.components.header;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination;", "", "Contact", "Wallet", com.google.common.net.HttpHeaders.LINK, "Pool", "CryptoCurrency", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Contact;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$CryptoCurrency;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Link;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Pool;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Wallet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Destination {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Contact;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination;", "", "image", "name", "initials", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Contact;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getImage", "getName", "getInitials"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Contact implements com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination {
        public static final int $stable = 0;
        private final java.lang.String image;
        private final java.lang.String initials;
        private final java.lang.String name;

        public Contact(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.image = str;
            this.name = str2;
            this.initials = str3;
        }

        public final java.lang.String getImage() {
            return this.image;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getInitials() {
            return this.initials;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.image;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.initials;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Contact(image=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", initials=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.image;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.name.hashCode();
            java.lang.String str2 = this.initials;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact contact = (com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.image, contact.image) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, contact.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.initials, contact.initials);
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact copy(java.lang.String image, java.lang.String name2, java.lang.String initials) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact(image, name2, initials);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getInitials() {
            return this.initials;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getImage() {
            return this.image;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact copy$default(com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact contact, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = contact.image;
            }
            if ((i & 2) != 0) {
                str2 = contact.name;
            }
            if ((i & 4) != 0) {
                str3 = contact.initials;
            }
            return contact.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Wallet;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination;", "", "image", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Wallet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getImage", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Wallet implements com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination {
        public static final int $stable = 0;
        private final java.lang.String address;
        private final java.lang.String image;

        public Wallet(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.image = str;
            this.address = str2;
        }

        public final java.lang.String getImage() {
            return this.image;
        }

        public final java.lang.String getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.image;
            java.lang.String str2 = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wallet(image=");
            sb.append(str);
            sb.append(", address=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.image;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Wallet)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Wallet wallet = (com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Wallet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.image, wallet.image) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, wallet.address);
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Wallet copy(java.lang.String image, java.lang.String address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Wallet(image, address);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddress() {
            return this.address;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getImage() {
            return this.image;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Wallet copy$default(com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Wallet wallet, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = wallet.image;
            }
            if ((i & 2) != 0) {
                str2 = wallet.address;
            }
            return wallet.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Link;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination;", "", "image", "url", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Link;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getImage", "getUrl", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Link implements com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination {
        public static final int $stable = 0;
        private final java.lang.String image;
        private final java.lang.String name;
        private final java.lang.String url;

        public Link(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.image = str;
            this.url = str2;
            this.name = str3;
        }

        public final java.lang.String getImage() {
            return this.image;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.image;
            java.lang.String str2 = this.url;
            java.lang.String str3 = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Link(image=");
            sb.append(str);
            sb.append(", url=");
            sb.append(str2);
            sb.append(", name=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.image;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.url.hashCode()) * 31) + this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Link)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Link link = (com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Link) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.image, link.image) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, link.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, link.name);
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Link copy(java.lang.String image, java.lang.String url, java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Link(image, url, name2);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getImage() {
            return this.image;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Link copy$default(com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Link link, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = link.image;
            }
            if ((i & 2) != 0) {
                str2 = link.url;
            }
            if ((i & 4) != 0) {
                str3 = link.name;
            }
            return link.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Pool;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination;", "", "image", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Pool;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getImage", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Pool implements com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination {
        public static final int $stable = 0;
        private final java.lang.String image;
        private final java.lang.String name;

        public Pool(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.image = str;
            this.name = str2;
        }

        public final java.lang.String getImage() {
            return this.image;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.image;
            java.lang.String str2 = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pool(image=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.image;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Pool)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Pool pool = (com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Pool) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.image, pool.image) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, pool.name);
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Pool copy(java.lang.String image, java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Pool(image, name2);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getImage() {
            return this.image;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Pool copy$default(com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Pool pool, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pool.image;
            }
            if ((i & 2) != 0) {
                str2 = pool.name;
            }
            return pool.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$CryptoCurrency;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination;", "", "image", "symbol", "Ljava/math/BigDecimal;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/math/BigDecimal;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$CryptoCurrency;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getImage", "getSymbol", "Ljava/math/BigDecimal;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class CryptoCurrency implements com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination {
        public static final int $stable = 0;
        private final java.lang.String image;
        private final java.lang.String symbol;
        private final java.math.BigDecimal value;

        public CryptoCurrency(java.lang.String str, java.lang.String str2, java.math.BigDecimal bigDecimal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.image = str;
            this.symbol = str2;
            this.value = bigDecimal;
        }

        public final java.lang.String getImage() {
            return this.image;
        }

        public final java.lang.String getSymbol() {
            return this.symbol;
        }

        public final java.math.BigDecimal getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.image;
            java.lang.String str2 = this.symbol;
            java.math.BigDecimal bigDecimal = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoCurrency(image=");
            sb.append(str);
            sb.append(", symbol=");
            sb.append(str2);
            sb.append(", value=");
            sb.append(bigDecimal);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.image;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.CryptoCurrency)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.CryptoCurrency cryptoCurrency = (com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.CryptoCurrency) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.image, cryptoCurrency.image) && kotlin.jvm.internal.Intrinsics.areEqual(this.symbol, cryptoCurrency.symbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, cryptoCurrency.value);
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.CryptoCurrency copy(java.lang.String image, java.lang.String symbol, java.math.BigDecimal value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(symbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.CryptoCurrency(image, symbol, value);
        }

        /* renamed from: component3, reason: from getter */
        public final java.math.BigDecimal getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getImage() {
            return this.image;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.CryptoCurrency copy$default(com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.CryptoCurrency cryptoCurrency, java.lang.String str, java.lang.String str2, java.math.BigDecimal bigDecimal, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cryptoCurrency.image;
            }
            if ((i & 2) != 0) {
                str2 = cryptoCurrency.symbol;
            }
            if ((i & 4) != 0) {
                bigDecimal = cryptoCurrency.value;
            }
            return cryptoCurrency.copy(str, str2, bigDecimal);
        }
    }
}
