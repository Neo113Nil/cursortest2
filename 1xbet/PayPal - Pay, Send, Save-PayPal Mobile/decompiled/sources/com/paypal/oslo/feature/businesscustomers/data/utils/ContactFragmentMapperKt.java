package com.paypal.oslo.feature.businesscustomers.data.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactFragment;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "toCustomer", "(Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactFragment;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContactFragmentMapperKt {
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer toCustomer(com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment) {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType customerType;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName;
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment contactNameFragment;
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName onBusinessName;
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment contactNameFragment2;
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName onPersonName;
        java.util.ArrayList emptyList;
        java.util.List emptyList2;
        java.util.List emptyList3;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName2;
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment contactNameFragment3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactFragment, "");
        java.lang.String obj = contactFragment.getId().toString();
        java.lang.String accountId = contactFragment.getAccountId();
        int i = com.paypal.oslo.feature.businesscustomers.data.utils.ContactFragmentMapperKt.WhenMappings.$EnumSwitchMapping$1[contactFragment.getType().ordinal()];
        int i2 = 3;
        if (i == 1) {
            customerType = com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.USER;
        } else if (i == 2) {
            customerType = com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.EXTERNAL_CONTACT;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            customerType = com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.UNKNOWN;
        }
        if (contactFragment.getName() == null && contactFragment.getOwnerName() == null) {
            customerName = null;
        } else {
            com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment.OwnerName ownerName = contactFragment.getOwnerName();
            com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName customerPersonName = (ownerName == null || (contactNameFragment2 = ownerName.getContactNameFragment()) == null || (onPersonName = contactNameFragment2.getOnPersonName()) == null) ? null : new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName(onPersonName.getGivenName(), onPersonName.getSurname(), null, null);
            com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment.Name name2 = contactFragment.getName();
            customerName = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName(customerPersonName, (name2 == null || (contactNameFragment = name2.getContactNameFragment()) == null || (onBusinessName = contactNameFragment.getOnBusinessName()) == null) ? null : onBusinessName.getBusinessName());
        }
        java.lang.Object profilePhotoUrl = contactFragment.getProfilePhotoUrl();
        java.lang.String obj2 = profilePhotoUrl != null ? profilePhotoUrl.toString() : null;
        java.util.List<com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment.SecondaryAddress> secondaryAddresses = contactFragment.getSecondaryAddresses();
        if (secondaryAddresses == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment.SecondaryAddress> list = secondaryAddresses;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactAddressFragment contactAddressFragment = ((com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment.SecondaryAddress) it.next()).getContactAddressFragment();
                java.lang.String addressLine1 = contactAddressFragment.getAddress().getAddressLine1();
                java.lang.String addressLine2 = contactAddressFragment.getAddress().getAddressLine2();
                java.lang.String adminArea1 = contactAddressFragment.getAddress().getAdminArea1();
                java.lang.String adminArea2 = contactAddressFragment.getAddress().getAdminArea2();
                java.lang.String postalCode = contactAddressFragment.getAddress().getPostalCode();
                java.lang.String obj3 = contactAddressFragment.getAddress().getCountryCode().toString();
                int i3 = com.paypal.oslo.feature.businesscustomers.data.utils.ContactFragmentMapperKt.WhenMappings.$EnumSwitchMapping$0[contactAddressFragment.getType().ordinal()];
                if (i3 == 1) {
                    addressType = com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.BILLING;
                } else if (i3 == 2) {
                    addressType = com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.SHIPPING;
                } else if (i3 == i2) {
                    addressType = com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.PRIMARY;
                } else {
                    if (i3 != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    addressType = com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.UNKNOWN;
                }
                com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType2 = addressType;
                com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactAddressFragment.RecipientName recipientName = contactAddressFragment.getRecipientName();
                if (recipientName == null || (contactNameFragment3 = recipientName.getContactNameFragment()) == null) {
                    customerName2 = null;
                } else {
                    com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName onPersonName2 = contactNameFragment3.getOnPersonName();
                    com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName customerPersonName2 = onPersonName2 != null ? new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName(onPersonName2.getGivenName(), onPersonName2.getSurname(), null, null) : null;
                    com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName onBusinessName2 = contactNameFragment3.getOnBusinessName();
                    customerName2 = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName(customerPersonName2, onBusinessName2 != null ? onBusinessName2.getBusinessName() : null);
                }
                arrayList.add(new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress(addressLine1, addressLine2, adminArea1, adminArea2, postalCode, obj3, addressType2, customerName2));
                i2 = 3;
            }
            emptyList = arrayList;
        }
        java.util.List<java.lang.Object> emails = contactFragment.getEmails();
        if (emails == null) {
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<java.lang.Object> list2 = emails;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().toString());
            }
            emptyList2 = arrayList2;
        }
        java.util.List<com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment.PhoneNumber> phoneNumbers = contactFragment.getPhoneNumbers();
        if (phoneNumbers == null) {
            emptyList3 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it3 = phoneNumbers.iterator();
            while (it3.hasNext()) {
                com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactPhoneNumberFragment contactPhoneNumberFragment = ((com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment.PhoneNumber) it3.next()).getContactPhoneNumberFragment();
                com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber customerPhoneNumber = (contactPhoneNumberFragment.getCountryCode() == null || contactPhoneNumberFragment.getNationalNumber() == null) ? null : new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber(contactPhoneNumberFragment.getCountryCode(), contactPhoneNumberFragment.getNationalNumber(), (com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                if (customerPhoneNumber != null) {
                    arrayList3.add(customerPhoneNumber);
                }
            }
            emptyList3 = arrayList3;
        }
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment.Relationship relationship = contactFragment.getRelationship();
        return new com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer(obj, customerType, accountId, null, customerName, obj2, emptyList, emptyList2, emptyList3, contactFragment.getDescription(), relationship != null ? relationship.isFavorited() : false);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ContactAddressType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactAddressType.BILLING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactAddressType.SHIPPING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactAddressType.PRIMARY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactAddressType.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.ContactType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ContactType.USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ContactType.EXTERNAL_CONTACT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ContactType.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
