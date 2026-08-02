package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerProfileFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfilesOverview;", "toCustomerProfilesOverview", "(Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfilesOverview;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerProfileFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CustomerProfileMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview toCustomerProfilesOverview(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            if (((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment) obj).getRole() == com.paypal.oslo.api.graphql.schema.type.RevolvingCreditCustomerRole.PRIMARY) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment) it.next()));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            if (((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment) obj2).getRole() == com.paypal.oslo.api.graphql.schema.type.RevolvingCreditCustomerRole.SUPPLEMENTARY) {
                arrayList5.add(obj2);
            }
        }
        java.util.ArrayList arrayList6 = arrayList5;
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
        java.util.Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList7.add(getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment) it2.next()));
        }
        java.util.ArrayList arrayList8 = arrayList7;
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        if (arrayList8.isEmpty()) {
            arrayList8 = null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfilesOverview(arrayList4, arrayList8);
    }

    private static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment revolvingCreditCustomerProfileFragment) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerName customerName;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.Amount amount;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.Address> addresses = revolvingCreditCustomerProfileFragment.getAddresses();
        if (addresses != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.Address> list = addresses;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.Address address : list) {
                java.lang.String addressLine1 = address.getAddress().getAddressLine1();
                java.lang.String addressLine2 = address.getAddress().getAddressLine2();
                java.lang.String addressLine3 = address.getAddress().getAddressLine3();
                java.lang.String adminArea1 = address.getAddress().getAdminArea1();
                java.lang.String adminArea2 = address.getAddress().getAdminArea2();
                java.lang.String adminArea3 = address.getAddress().getAdminArea3();
                java.lang.String postalCode = address.getAddress().getPostalCode();
                java.lang.Object countryCode = address.getAddress().getCountryCode();
                arrayList5.add(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.Address(addressLine1, addressLine2, addressLine3, adminArea1, adminArea2, adminArea3, postalCode, countryCode instanceof java.lang.String ? (java.lang.String) countryCode : null));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.Address> addresses2 = revolvingCreditCustomerProfileFragment.getAddresses();
        if (addresses2 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.Address address2 : addresses2) {
                java.lang.String addressLine12 = address2.getAddress().getAddressLine1();
                java.lang.String addressLine22 = address2.getAddress().getAddressLine2();
                java.lang.String adminArea12 = address2.getAddress().getAdminArea1();
                java.lang.String adminArea32 = address2.getAddress().getAdminArea3();
                java.lang.Object countryCode2 = address2.getAddress().getCountryCode();
                arrayList6.add(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.AddressDetail(addressLine12, addressLine22, adminArea12, adminArea32, countryCode2 instanceof java.lang.String ? (java.lang.String) countryCode2 : null, address2.getAddress().getPostalCode()));
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.PhoneNumber> phoneNumbers = revolvingCreditCustomerProfileFragment.getPhoneNumbers();
        if (phoneNumbers != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.PhoneNumber> list2 = phoneNumbers;
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList7.add(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CustomerServiceContactMapperKt.toDomain(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.PhoneNumber) it.next()).getPhone().getRevolvingCreditPhoneFragment()));
            }
            arrayList3 = arrayList7;
        } else {
            arrayList3 = null;
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.PhoneNumber> phoneNumbers2 = revolvingCreditCustomerProfileFragment.getPhoneNumbers();
        if (phoneNumbers2 != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.PhoneNumber> list3 = phoneNumbers2;
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList8.add(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CustomerServiceContactMapperKt.toDomain(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.PhoneNumber) it2.next()).getPhone().getRevolvingCreditPhoneFragment()));
            }
            arrayList4 = arrayList8;
        } else {
            arrayList4 = null;
        }
        java.lang.Object email = revolvingCreditCustomerProfileFragment.getEmail();
        java.lang.String str = email instanceof java.lang.String ? (java.lang.String) email : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.Income income = revolvingCreditCustomerProfileFragment.getIncome();
        java.lang.String value = (income == null || (amount = income.getAmount()) == null) ? null : amount.getValue();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.Income income2 = revolvingCreditCustomerProfileFragment.getIncome();
        boolean z = (income2 != null ? income2.getRequiredAction() : null) == com.paypal.oslo.api.graphql.schema.type.RevolvingCreditIncomeRequiredAction.COLLECT_INCOME;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment.Name name2 = revolvingCreditCustomerProfileFragment.getName();
        if (name2 != null) {
            java.util.List listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{name2.getPrefix(), name2.getGivenName(), name2.getMiddleName(), name2.getSurname(), name2.getSuffix()});
            java.lang.String givenName = name2.getGivenName();
            java.lang.String surname = name2.getSurname();
            java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(listOfNotNull, " ", null, null, 0, null, null, 62, null);
            customerName = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerName(givenName, surname, kotlin.text.StringsKt.isBlank(joinToString$default) ? null : joinToString$default);
        } else {
            customerName = null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails(arrayList, arrayList2, arrayList3, arrayList4, str, value, java.lang.Boolean.valueOf(z), customerName);
    }
}
