package com.paypal.oslo.feature.businesscustomers.data.utils;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u000e\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u000e\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateContactInput;", "toCreateGraphQLInput", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/api/graphql/schema/type/CreateContactInput;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;", "Lcom/paypal/oslo/api/graphql/schema/type/CustomerNameInput;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;)Lcom/paypal/oslo/api/graphql/schema/type/CustomerNameInput;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPersonName;", "Lcom/paypal/oslo/api/graphql/schema/type/PersonNameInput;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPersonName;)Lcom/paypal/oslo/api/graphql/schema/type/PersonNameInput;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPhoneNumber;", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPhoneNumber;)Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "Lcom/paypal/oslo/api/graphql/schema/type/ContactAddressInput;", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;)Lcom/paypal/oslo/api/graphql/schema/type/ContactAddressInput;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateContactInput;", "toUpdateGraphQLInput", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateContactInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContactGraphQLInputMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.CreateContactInput toCreateGraphQLInput(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        com.apollographql.apollo.api.Optional.Absent absent;
        com.apollographql.apollo.api.Optional.Absent absent2;
        com.apollographql.apollo.api.Optional.Absent absent3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name2 = customer.getName();
        java.lang.String str = null;
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(name2 != null ? getHighSpeedVideoFpsRanges(name2) : null);
        if (!customer.getEmails().isEmpty()) {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.present(customer.getEmails());
        } else {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        com.apollographql.apollo.api.Optional optional = absent;
        if (!customer.getPhoneNumbers().isEmpty()) {
            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
            java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber> phoneNumbers = customer.getPhoneNumbers();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers, 10));
            java.util.Iterator<T> it = phoneNumbers.iterator();
            while (it.hasNext()) {
                arrayList.add(toGraphQLInput((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber) it.next()));
            }
            absent2 = companion2.present(arrayList);
        } else {
            absent2 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        com.apollographql.apollo.api.Optional optional2 = absent2;
        if (!customer.getAddresses().isEmpty()) {
            com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
            java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress> addresses = customer.getAddresses();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(addresses, 10));
            java.util.Iterator<T> it2 = addresses.iterator();
            while (it2.hasNext()) {
                arrayList2.add(toGraphQLInput((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress) it2.next()));
            }
            absent3 = companion3.present(arrayList2);
        } else {
            absent3 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        com.apollographql.apollo.api.Optional optional3 = absent3;
        com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String description = customer.getDescription();
        if (description != null && description.length() > 0) {
            str = description;
        }
        return new com.paypal.oslo.api.graphql.schema.type.CreateContactInput(presentIfNotNull, optional, optional2, optional3, companion4.presentIfNotNull(str), null, com.paypal.oslo.api.graphql.schema.type.ContactType.EXTERNAL_CONTACT, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.INVOICING, 32, null);
    }

    private static final com.paypal.oslo.api.graphql.schema.type.CustomerNameInput getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName) {
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName personName = customerName.getPersonName();
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(personName != null ? getHighSpeedVideoSizes(personName) : null);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String businessName = customerName.getBusinessName();
        return new com.paypal.oslo.api.graphql.schema.type.CustomerNameInput(presentIfNotNull, companion2.presentIfNotNull(businessName != null ? new com.paypal.oslo.api.graphql.schema.type.BusinessNameInput(businessName) : null));
    }

    private static final com.paypal.oslo.api.graphql.schema.type.PersonNameInput getHighSpeedVideoSizes(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName customerPersonName) {
        return new com.paypal.oslo.api.graphql.schema.type.PersonNameInput(null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(customerPersonName.getGivenName()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(customerPersonName.getSurname()), null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(customerPersonName.getMiddleName()), null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(customerPersonName.getFullName()), 41, null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.PhoneInput toGraphQLInput(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber customerPhoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerPhoneNumber, "");
        return new com.paypal.oslo.api.graphql.schema.type.PhoneInput(customerPhoneNumber.getCountryCode(), customerPhoneNumber.getNationalNumber(), null, 4, null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.ContactAddressInput toGraphQLInput(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress customerAddress) {
        com.paypal.oslo.api.graphql.schema.type.ContactAddressType contactAddressType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerAddress, "");
        com.paypal.oslo.api.graphql.schema.type.AddressInput addressInput = new com.paypal.oslo.api.graphql.schema.type.AddressInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(customerAddress.getAddressLine1()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(customerAddress.getAddressLine2()), null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(customerAddress.getAdminArea1()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(customerAddress.getAdminArea2()), null, null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(customerAddress.getPostalCode()), customerAddress.getCountryCode(), 100, null);
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName recipientName = customerAddress.getRecipientName();
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(recipientName != null ? getHighSpeedVideoFpsRanges(recipientName) : null);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        int i = com.paypal.oslo.feature.businesscustomers.data.utils.ContactGraphQLInputMapperKt.WhenMappings.$EnumSwitchMapping$0[customerAddress.getAddressType().ordinal()];
        if (i == 1) {
            contactAddressType = com.paypal.oslo.api.graphql.schema.type.ContactAddressType.SHIPPING;
        } else if (i == 2) {
            contactAddressType = com.paypal.oslo.api.graphql.schema.type.ContactAddressType.BILLING;
        } else if (i == 3) {
            contactAddressType = com.paypal.oslo.api.graphql.schema.type.ContactAddressType.PRIMARY;
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            contactAddressType = com.paypal.oslo.api.graphql.schema.type.ContactAddressType.UNKNOWN__;
        }
        return new com.paypal.oslo.api.graphql.schema.type.ContactAddressInput(addressInput, companion2.present(contactAddressType), presentIfNotNull);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.UpdateContactInput toUpdateGraphQLInput(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        com.apollographql.apollo.api.Optional.Absent absent;
        com.apollographql.apollo.api.Optional.Absent absent2;
        com.apollographql.apollo.api.Optional.Absent absent3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        java.lang.String id = customer.getId();
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name2 = customer.getName();
        java.lang.String str = null;
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(name2 != null ? getHighSpeedVideoFpsRanges(name2) : null);
        if (!customer.getEmails().isEmpty()) {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.present(customer.getEmails());
        } else {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        com.apollographql.apollo.api.Optional optional = absent;
        if (!customer.getPhoneNumbers().isEmpty()) {
            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
            java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber> phoneNumbers = customer.getPhoneNumbers();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers, 10));
            java.util.Iterator<T> it = phoneNumbers.iterator();
            while (it.hasNext()) {
                arrayList.add(toGraphQLInput((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber) it.next()));
            }
            absent2 = companion2.present(arrayList);
        } else {
            absent2 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        com.apollographql.apollo.api.Optional optional2 = absent2;
        if (!customer.getAddresses().isEmpty()) {
            com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
            java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress> addresses = customer.getAddresses();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(addresses, 10));
            java.util.Iterator<T> it2 = addresses.iterator();
            while (it2.hasNext()) {
                arrayList2.add(toGraphQLInput((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress) it2.next()));
            }
            absent3 = companion3.present(arrayList2);
        } else {
            absent3 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        com.apollographql.apollo.api.Optional optional3 = absent3;
        com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String description = customer.getDescription();
        if (description != null && description.length() > 0) {
            str = description;
        }
        return new com.paypal.oslo.api.graphql.schema.type.UpdateContactInput(id, presentIfNotNull, optional, optional2, optional3, companion4.presentIfNotNull(str), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.ContactType.EXTERNAL_CONTACT), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.INVOICING));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.SHIPPING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.BILLING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.PRIMARY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
