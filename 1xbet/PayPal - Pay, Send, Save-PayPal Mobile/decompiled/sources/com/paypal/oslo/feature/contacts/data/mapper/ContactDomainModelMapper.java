package com.paypal.oslo.feature.contacts.data.mapper;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/contacts/data/mapper/ContactDomainModelMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/contacts/graphql/fragment/ContactFields;", "contact", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "mapToContactItem", "(Lcom/paypal/oslo/feature/contacts/graphql/fragment/ContactFields;)Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$RecentSearch;", "recentSearch", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "mapRecentSearch", "(Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$RecentSearch;)Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "Lcom/paypal/oslo/feature/contacts/graphql/type/ContactNetworkType;", "networkType", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "mapNetworkTypeToDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;)Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "mapNetworkTypeToGraphQL", "(Lcom/paypal/oslo/feature/contacts/api/NetworkType;)Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContactDomainModelMapper {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper.Companion Companion = new com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper.Companion(null);

    @javax.inject.Inject
    public ContactDomainModelMapper() {
    }

    public final com.paypal.oslo.feature.contacts.api.ContactSearchContactItem mapToContactItem(com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields contact) {
        kotlin.Triple triple;
        com.paypal.oslo.feature.contacts.api.ContactType contactType;
        java.lang.String str;
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.PaymentHistory paymentHistory;
        java.lang.String str2;
        java.lang.Object logoUrl;
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.PhoneNumber phoneNumber;
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.PhoneNumber phoneNumber2;
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.OnPersonName onPersonName;
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.OnPersonName onPersonName2;
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.OnBusinessName onBusinessName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "");
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.Name name2 = contact.getName();
        java.lang.String businessName = (name2 == null || (onBusinessName = name2.getOnBusinessName()) == null) ? null : onBusinessName.getBusinessName();
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.Name name3 = contact.getName();
        java.lang.String givenName = (name3 == null || (onPersonName2 = name3.getOnPersonName()) == null) ? null : onPersonName2.getGivenName();
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.Name name4 = contact.getName();
        java.lang.String surname = (name4 == null || (onPersonName = name4.getOnPersonName()) == null) ? null : onPersonName.getSurname();
        if (businessName == null || kotlin.text.StringsKt.isBlank(businessName)) {
            businessName = null;
        }
        if (businessName != null) {
            triple = new kotlin.Triple(businessName, null, com.paypal.oslo.feature.contacts.api.ContactNameType.BUSINESS);
        } else {
            triple = new kotlin.Triple(givenName, surname, com.paypal.oslo.feature.contacts.api.ContactNameType.PERSON);
        }
        java.lang.String str3 = (java.lang.String) triple.component1();
        java.lang.String str4 = (java.lang.String) triple.component2();
        com.paypal.oslo.feature.contacts.api.ContactNameType contactNameType = (com.paypal.oslo.feature.contacts.api.ContactNameType) triple.component3();
        java.lang.String obj = contact.getId().toString();
        java.lang.String accountId = contact.getAccountId();
        int i = com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper.WhenMappings.$EnumSwitchMapping$2[contact.getType().ordinal()];
        if (i == 1) {
            contactType = com.paypal.oslo.feature.contacts.api.ContactType.USER;
        } else if (i == 2) {
            contactType = com.paypal.oslo.feature.contacts.api.ContactType.EXTERNAL_CONTACT;
        } else {
            contactType = com.paypal.oslo.feature.contacts.api.ContactType.UNKNOWN;
        }
        com.paypal.oslo.feature.contacts.api.ContactType contactType2 = contactType;
        java.util.List<com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.PhoneNumber> phoneNumbers = contact.getPhoneNumbers();
        java.lang.String countryCode = (phoneNumbers == null || (phoneNumber2 = (com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) phoneNumbers)) == null) ? null : phoneNumber2.getCountryCode();
        java.util.List<com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.PhoneNumber> phoneNumbers2 = contact.getPhoneNumbers();
        java.lang.String nationalNumber = (phoneNumbers2 == null || (phoneNumber = (com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) phoneNumbers2)) == null) ? null : phoneNumber.getNationalNumber();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str5 = countryCode;
        if (str5 != null && str5.length() != 0) {
            sb.append(countryCode);
        }
        java.lang.String str6 = nationalNumber;
        if (str6 != null && str6.length() != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(nationalNumber);
        }
        java.lang.String obj2 = sb.toString();
        java.lang.String str7 = obj2.length() > 0 ? obj2 : null;
        java.util.List<java.lang.Object> emails = contact.getEmails();
        java.lang.Object firstOrNull = emails != null ? kotlin.collections.CollectionsKt.firstOrNull((java.util.List) emails) : null;
        java.lang.String str8 = firstOrNull instanceof java.lang.String ? (java.lang.String) firstOrNull : null;
        java.lang.Object profilePhotoUrl = contact.getProfilePhotoUrl();
        java.lang.String obj3 = profilePhotoUrl != null ? profilePhotoUrl.toString() : null;
        boolean z = contact.getExternalWallet() != null;
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.ExternalWallet externalWallet = contact.getExternalWallet();
        java.lang.String name5 = externalWallet != null ? externalWallet.getName() : null;
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.ExternalWallet externalWallet2 = contact.getExternalWallet();
        java.lang.String obj4 = (externalWallet2 == null || (logoUrl = externalWallet2.getLogoUrl()) == null) ? null : logoUrl.toString();
        java.lang.String handle = contact.getHandle();
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.PrimaryAddress primaryAddress = contact.getPrimaryAddress();
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.Address address = primaryAddress != null ? primaryAddress.getAddress() : null;
        java.lang.String adminArea2 = address != null ? address.getAdminArea2() : null;
        if (adminArea2 != null) {
            java.lang.String obj5 = address.getCountryCode().toString();
            java.lang.String adminArea1 = address.getAdminArea1();
            if (kotlin.jvm.internal.Intrinsics.areEqual(obj5, "US")) {
                str2 = adminArea1;
            } else {
                java.lang.String displayCountry = new java.util.Locale("", obj5).getDisplayCountry();
                kotlin.jvm.internal.Intrinsics.checkNotNull(displayCountry);
                str2 = displayCountry.length() > 0 ? displayCountry : null;
            }
            if (str2 != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(adminArea2);
                sb2.append(", ");
                sb2.append(str2);
                str = sb2.toString();
            } else {
                str = adminArea2;
            }
        } else {
            str = null;
        }
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.Relationship relationship = contact.getRelationship();
        boolean isBlocked = relationship != null ? relationship.isBlocked() : false;
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.Relationship relationship2 = contact.getRelationship();
        boolean isFavorited = relationship2 != null ? relationship2.isFavorited() : false;
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.Relationship relationship3 = contact.getRelationship();
        boolean isExternalContact = relationship3 != null ? relationship3.isExternalContact() : false;
        com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields.Relationship relationship4 = contact.getRelationship();
        return new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem(obj, str3, str4, contactType2, str7, str8, obj3, z, name5, obj4, com.paypal.oslo.feature.contacts.api.ContactActionType.Info, handle, str, isBlocked, isFavorited, isExternalContact, (relationship4 == null || (paymentHistory = relationship4.getPaymentHistory()) == null) ? 0 : paymentHistory.getTotalCompletedPayments(), contactNameType, accountId);
    }

    public final com.paypal.oslo.feature.contacts.api.RecentSearch mapRecentSearch(com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch recentSearch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearch, "");
        if (recentSearch.getOnRecentSearchString() != null) {
            return new com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString(recentSearch.getOnRecentSearchString().getId().toString(), recentSearch.getOnRecentSearchString().getValue(), mapNetworkTypeToDomain(recentSearch.getOnRecentSearchString().getNetworkType()));
        }
        if (recentSearch.getOnRecentContact() != null) {
            return new com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem(recentSearch.getOnRecentContact().getId().toString(), mapToContactItem(recentSearch.getOnRecentContact().getContact().getContactFields()));
        }
        return null;
    }

    public final com.paypal.oslo.feature.contacts.api.NetworkType mapNetworkTypeToDomain(com.paypal.oslo.api.graphql.schema.type.ContactNetworkType networkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        switch (com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper.WhenMappings.$EnumSwitchMapping$0[networkType.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.contacts.api.NetworkType.P2P;
            case 2:
                return com.paypal.oslo.feature.contacts.api.NetworkType.INVOICING;
            case 3:
                return com.paypal.oslo.feature.contacts.api.NetworkType.CRYPTO;
            case 4:
                return com.paypal.oslo.feature.contacts.api.NetworkType.UNKNOWN;
            case 5:
                return com.paypal.oslo.feature.contacts.api.NetworkType.P2P_SEND_MONEY;
            case 6:
                return com.paypal.oslo.feature.contacts.api.NetworkType.P2P_REQUEST_MONEY;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType mapNetworkTypeToGraphQL(com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        switch (com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper.WhenMappings.$EnumSwitchMapping$1[networkType.ordinal()]) {
            case 1:
                return com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.P2P;
            case 2:
                return com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.INVOICING;
            case 3:
                return com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.CRYPTO;
            case 4:
                return com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.UNKNOWN__;
            case 5:
                return com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.P2P_SEND_MONEY;
            case 6:
                return com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.P2P_REQUEST_MONEY;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/data/mapper/ContactDomainModelMapper$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.P2P.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.INVOICING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.CRYPTO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.P2P_SEND_MONEY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.P2P_REQUEST_MONEY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.contacts.api.NetworkType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.contacts.api.NetworkType.P2P.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.contacts.api.NetworkType.INVOICING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.contacts.api.NetworkType.CRYPTO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.contacts.api.NetworkType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.feature.contacts.api.NetworkType.P2P_SEND_MONEY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.feature.contacts.api.NetworkType.P2P_REQUEST_MONEY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.ContactType.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.ContactType.USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.ContactType.EXTERNAL_CONTACT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
