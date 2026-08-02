package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$UserProfile;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/UserInfo;", "toUserInfo", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$UserProfile;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/UserInfo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserProfileMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserInfo toUserInfo(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile userProfile) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileAnnualIncome userProfileAnnualIncome;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.AnnualIncome annualIncome;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.DateOfBirth dateOfBirth;
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification nationalIdentification;
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth dateOfBirth2;
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome annualIncome2;
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone phone;
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress billingAddress;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address> addresses;
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name name2;
        com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileName userProfileName = (userProfile == null || (name2 = userProfile.getName()) == null) ? null : new com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileName(name2.getFullName(), name2.getGivenName(), name2.getSurname());
        if (userProfile == null || (addresses = userProfile.getAddresses()) == null) {
            arrayList = null;
        } else {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address> list = addresses;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address) it.next()).getBnplAcquisitionAddressFragment());
            }
            arrayList = arrayList3;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment = (userProfile == null || (billingAddress = userProfile.getBillingAddress()) == null) ? null : billingAddress.getBnplAcquisitionAddressFragment();
        com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfilePhone userProfilePhone = (userProfile == null || (phone = userProfile.getPhone()) == null) ? null : new com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfilePhone(phone.getType().name(), phone.getValue());
        if (userProfile == null || (annualIncome2 = userProfile.getAnnualIncome()) == null) {
            userProfileAnnualIncome = null;
        } else {
            boolean isRequired = annualIncome2.isRequired();
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount amount = annualIncome2.getAmount();
            userProfileAnnualIncome = new com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileAnnualIncome(isRequired, amount != null ? amount.getBnplAcquisitionMoneyFragment() : null);
        }
        com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileDateOfBirth userProfileDateOfBirth = (userProfile == null || (dateOfBirth2 = userProfile.getDateOfBirth()) == null) ? null : new com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileDateOfBirth(dateOfBirth2.isRequired(), dateOfBirth2.getBirthDate());
        com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileNationalIdentification userProfileNationalIdentification = (userProfile == null || (nationalIdentification = userProfile.getNationalIdentification()) == null) ? null : new com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileNationalIdentification(nationalIdentification.isRequired(), nationalIdentification.getValueShortMasked());
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName userName = new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName(userProfileName != null ? userProfileName.getFullName() : null, userProfileName != null ? userProfileName.getGivenName() : null, userProfileName != null ? userProfileName.getSurname() : null);
        if (arrayList != null) {
            java.util.ArrayList arrayList4 = arrayList;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            java.util.Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(com.paypal.oslo.feature.bnplacquisition.data.mapper.AddressMapperKt.toAddress((com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment) it2.next()));
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address = bnplAcquisitionAddressFragment != null ? com.paypal.oslo.feature.bnplacquisition.data.mapper.AddressMapperKt.toAddress(bnplAcquisitionAddressFragment) : null;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneNumber phoneNumber = userProfilePhone != null ? new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneNumber(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.PhoneType.INSTANCE.from(userProfilePhone.getTypeName()), userProfilePhone.getValue()) : null;
        if (userProfileAnnualIncome != null) {
            boolean isRequired2 = userProfileAnnualIncome.isRequired();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment amount2 = userProfileAnnualIncome.getAmount();
            annualIncome = new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.AnnualIncome(isRequired2, amount2 != null ? com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(amount2) : null);
        } else {
            annualIncome = null;
        }
        if (userProfileDateOfBirth != null) {
            boolean isRequired3 = userProfileDateOfBirth.isRequired();
            java.lang.Object birthDate = userProfileDateOfBirth.getBirthDate();
            dateOfBirth = new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.DateOfBirth(isRequired3, birthDate instanceof java.lang.String ? (java.lang.String) birthDate : null);
        } else {
            dateOfBirth = null;
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserInfo(userName, arrayList2, address, phoneNumber, annualIncome, dateOfBirth, userProfileNationalIdentification != null ? new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.NationalIdentification(userProfileNationalIdentification.isRequired(), userProfileNationalIdentification.getValueShortMasked()) : null);
    }
}
