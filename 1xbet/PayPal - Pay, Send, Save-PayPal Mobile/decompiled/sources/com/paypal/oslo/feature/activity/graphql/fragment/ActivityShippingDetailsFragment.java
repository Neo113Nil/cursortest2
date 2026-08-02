package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001f B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ8\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment$Recipient;", "recipients", "", "shippingMethodDescription", "shippingServiceDescription", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getRecipients", "Ljava/lang/String;", "getShippingMethodDescription", "getShippingServiceDescription", "Recipient", "Address"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityShippingDetailsFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient> recipients;
    private final java.lang.String shippingMethodDescription;
    private final java.lang.String shippingServiceDescription;

    public ActivityShippingDetailsFragment(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient> list, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.recipients = list;
        this.shippingMethodDescription = str;
        this.shippingServiceDescription = str2;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient> getRecipients() {
        return this.recipients;
    }

    public final java.lang.String getShippingMethodDescription() {
        return this.shippingMethodDescription;
    }

    public final java.lang.String getShippingServiceDescription() {
        return this.shippingServiceDescription;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment$Recipient;", "", "", "recipientName", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment$Address;", "address", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment$Address;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment$Address;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment$Address;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment$Recipient;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRecipientName", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment$Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Recipient {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address address;
        private final java.lang.String recipientName;

        public Recipient(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            this.recipientName = str;
            this.address = address;
        }

        public final java.lang.String getRecipientName() {
            return this.recipientName;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.recipientName;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address address = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Recipient(recipientName=");
            sb.append(str);
            sb.append(", address=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.recipientName;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient recipient = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.recipientName, recipient.recipientName) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, recipient.address);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient copy(java.lang.String recipientName, com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient(recipientName, address);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address getAddress() {
            return this.address;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRecipientName() {
            return this.recipientName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient recipient, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = recipient.recipientName;
            }
            if ((i & 2) != 0) {
                address = recipient.address;
            }
            return recipient.copy(str, address);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018Jz\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment$Address;", "", "", "addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", "adminArea3", "adminArea4", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressLine1", "getAddressLine2", "getAddressLine3", "getAdminArea1", "getAdminArea2", "getAdminArea3", "getAdminArea4", "getPostalCode", "Ljava/lang/Object;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        public static final int $stable = 8;
        private final java.lang.String addressLine1;
        private final java.lang.String addressLine2;
        private final java.lang.String addressLine3;
        private final java.lang.String adminArea1;
        private final java.lang.String adminArea2;
        private final java.lang.String adminArea3;
        private final java.lang.String adminArea4;
        private final java.lang.Object countryCode;
        private final java.lang.String postalCode;

        public Address(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.addressLine1 = str;
            this.addressLine2 = str2;
            this.addressLine3 = str3;
            this.adminArea1 = str4;
            this.adminArea2 = str5;
            this.adminArea3 = str6;
            this.adminArea4 = str7;
            this.postalCode = str8;
            this.countryCode = obj;
        }

        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        public final java.lang.String getAddressLine3() {
            return this.addressLine3;
        }

        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        public final java.lang.String getAdminArea3() {
            return this.adminArea3;
        }

        public final java.lang.String getAdminArea4() {
            return this.adminArea4;
        }

        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.addressLine1;
            java.lang.String str2 = this.addressLine2;
            java.lang.String str3 = this.addressLine3;
            java.lang.String str4 = this.adminArea1;
            java.lang.String str5 = this.adminArea2;
            java.lang.String str6 = this.adminArea3;
            java.lang.String str7 = this.adminArea4;
            java.lang.String str8 = this.postalCode;
            java.lang.Object obj = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(addressLine1=");
            sb.append(str);
            sb.append(", addressLine2=");
            sb.append(str2);
            sb.append(", addressLine3=");
            sb.append(str3);
            sb.append(", adminArea1=");
            sb.append(str4);
            sb.append(", adminArea2=");
            sb.append(str5);
            sb.append(", adminArea3=");
            sb.append(str6);
            sb.append(", adminArea4=");
            sb.append(str7);
            sb.append(", postalCode=");
            sb.append(str8);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.addressLine1;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.addressLine2;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.addressLine3;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.adminArea1;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.adminArea2;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.adminArea3;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.adminArea4;
            int hashCode7 = str7 == null ? 0 : str7.hashCode();
            java.lang.String str8 = this.postalCode;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str8 != null ? str8.hashCode() : 0)) * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address address = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, address.addressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine2, address.addressLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine3, address.addressLine3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, address.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, address.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea3, address.adminArea3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea4, address.adminArea4) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, address.postalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, address.countryCode);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address copy(java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String addressLine3, java.lang.String adminArea1, java.lang.String adminArea2, java.lang.String adminArea3, java.lang.String adminArea4, java.lang.String postalCode, java.lang.Object countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address(addressLine1, addressLine2, addressLine3, adminArea1, adminArea2, adminArea3, adminArea4, postalCode, countryCode);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getAdminArea4() {
            return this.adminArea4;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getAdminArea3() {
            return this.adminArea3;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAddressLine3() {
            return this.addressLine3;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient> list = this.recipients;
        java.lang.String str = this.shippingMethodDescription;
        java.lang.String str2 = this.shippingServiceDescription;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityShippingDetailsFragment(recipients=");
        sb.append(list);
        sb.append(", shippingMethodDescription=");
        sb.append(str);
        sb.append(", shippingServiceDescription=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.recipients.hashCode();
        java.lang.String str = this.shippingMethodDescription;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.shippingServiceDescription;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment activityShippingDetailsFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.recipients, activityShippingDetailsFragment.recipients) && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingMethodDescription, activityShippingDetailsFragment.shippingMethodDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingServiceDescription, activityShippingDetailsFragment.shippingServiceDescription);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment copy(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient> recipients, java.lang.String shippingMethodDescription, java.lang.String shippingServiceDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recipients, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment(recipients, shippingMethodDescription, shippingServiceDescription);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getShippingServiceDescription() {
        return this.shippingServiceDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getShippingMethodDescription() {
        return this.shippingMethodDescription;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient> component1() {
        return this.recipients;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment activityShippingDetailsFragment, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = activityShippingDetailsFragment.recipients;
        }
        if ((i & 2) != 0) {
            str = activityShippingDetailsFragment.shippingMethodDescription;
        }
        if ((i & 4) != 0) {
            str2 = activityShippingDetailsFragment.shippingServiceDescription;
        }
        return activityShippingDetailsFragment.copy(list, str, str2);
    }
}
