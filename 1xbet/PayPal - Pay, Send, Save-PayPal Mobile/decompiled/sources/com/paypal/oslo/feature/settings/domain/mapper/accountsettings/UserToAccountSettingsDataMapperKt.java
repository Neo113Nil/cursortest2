package com.paypal.oslo.feature.settings.domain.mapper.accountsettings;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/User;", "Lcom/paypal/oslo/feature/settings/domain/model/AccountSettingsData;", "toAccountSettingsData", "(Lcom/paypal/oslo/core/userstore/model/User;)Lcom/paypal/oslo/feature/settings/domain/model/AccountSettingsData;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "toI18nAddress", "(Lcom/paypal/oslo/core/userstore/model/ProfileAddress;)Lcom/paypal/oslo/core/i18n/domain/model/Address;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UserToAccountSettingsDataMapperKt {
    public static final com.paypal.oslo.feature.settings.domain.model.AccountSettingsData toAccountSettingsData(com.paypal.oslo.core.userstore.model.User user) {
        java.lang.String fullName;
        com.paypal.oslo.core.i18n.domain.model.NameInput.Person person;
        java.lang.String primaryEmail;
        java.lang.String phone;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        com.paypal.oslo.core.userstore.model.ProfileName legalName = user.getLegalName();
        if ((legalName == null || (personName2 = legalName.getPersonName()) == null || (fullName = personName2.getFullName()) == null) && (fullName = user.getFullName()) == null) {
            fullName = "";
        }
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemData(fullName, null, 2, null);
        com.paypal.oslo.core.userstore.model.ProfileName legalName2 = user.getLegalName();
        if (legalName2 == null || (personName = legalName2.getPersonName()) == null) {
            person = null;
        } else {
            java.lang.String givenName = personName.getGivenName();
            java.lang.String m11414constructorimpl = givenName != null ? com.paypal.oslo.core.i18n.domain.model.GivenName.m11414constructorimpl(givenName) : null;
            java.lang.String middleName = personName.getMiddleName();
            java.lang.String m11429constructorimpl = middleName != null ? com.paypal.oslo.core.i18n.domain.model.MiddleName.m11429constructorimpl(middleName) : null;
            java.lang.String surname = personName.getSurname();
            java.lang.String m11523constructorimpl = surname != null ? com.paypal.oslo.core.i18n.domain.model.Surname.m11523constructorimpl(surname) : null;
            java.lang.String secondSurname = personName.getSecondSurname();
            person = new com.paypal.oslo.core.i18n.domain.model.NameInput.Person(new com.paypal.oslo.core.i18n.domain.model.PersonName(m11414constructorimpl, m11429constructorimpl, m11523constructorimpl, secondSurname != null ? com.paypal.oslo.core.i18n.domain.model.SecondSurname.m11478constructorimpl(secondSurname) : null, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        com.paypal.oslo.core.userstore.model.ProfileEmail primaryEmailAddress = user.getPrimaryEmailAddress();
        boolean confirmed = primaryEmailAddress != null ? primaryEmailAddress.getConfirmed() : false;
        com.paypal.oslo.core.userstore.model.ProfileEmail primaryEmailAddress2 = user.getPrimaryEmailAddress();
        if ((primaryEmailAddress2 == null || (primaryEmail = primaryEmailAddress2.getEmailAddress()) == null) && (primaryEmail = user.getPrimaryEmail()) == null) {
            primaryEmail = "";
        }
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2 = new com.paypal.oslo.feature.settings.domain.model.SettingsItemData(primaryEmail, !confirmed ? new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge(com.paypal.oslo.feature.settings.domain.model.BadgeType.Negative) : null);
        com.paypal.oslo.core.userstore.model.ProfilePhone primaryMobilePhone = user.getPrimaryMobilePhone();
        if (primaryMobilePhone == null) {
            primaryMobilePhone = user.getProfilePrimaryPhone();
        }
        if ((primaryMobilePhone == null || (phone = primaryMobilePhone.getMaskedPhoneNumber()) == null) && (phone = user.getPhone()) == null) {
            phone = "";
        }
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3 = new com.paypal.oslo.feature.settings.domain.model.SettingsItemData(phone, (primaryMobilePhone == null || primaryMobilePhone.getConfirmed()) ? null : new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge(com.paypal.oslo.feature.settings.domain.model.BadgeType.Negative));
        com.paypal.oslo.core.userstore.model.ProfileAddress homeAddress = user.getHomeAddress();
        return new com.paypal.oslo.feature.settings.domain.model.AccountSettingsData(settingsItemData, settingsItemData2, settingsItemData3, homeAddress != null ? toI18nAddress(homeAddress) : null, person, new com.paypal.oslo.feature.settings.domain.model.SettingsItemData("", null, 2, null), new com.paypal.oslo.feature.settings.domain.model.SettingsItemData("", null, 2, null));
    }

    public static final com.paypal.oslo.core.i18n.domain.model.Address toI18nAddress(com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileAddress, "");
        java.lang.String addressLine1 = profileAddress.getAddress().getAddressLine1();
        java.lang.String m11273constructorimpl = addressLine1 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(addressLine1) : null;
        java.lang.String addressLine2 = profileAddress.getAddress().getAddressLine2();
        java.lang.String m11282constructorimpl = addressLine2 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(addressLine2) : null;
        java.lang.String addressLine3 = profileAddress.getAddress().getAddressLine3();
        java.lang.String m11291constructorimpl = addressLine3 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11291constructorimpl(addressLine3) : null;
        java.lang.String adminArea1 = profileAddress.getAddress().getAdminArea1();
        java.lang.String m11300constructorimpl = adminArea1 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(adminArea1) : null;
        java.lang.String adminArea2 = profileAddress.getAddress().getAdminArea2();
        java.lang.String m11309constructorimpl = adminArea2 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(adminArea2) : null;
        java.lang.String adminArea3 = profileAddress.getAddress().getAdminArea3();
        java.lang.String m11318constructorimpl = adminArea3 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11318constructorimpl(adminArea3) : null;
        java.lang.String adminArea4 = profileAddress.getAddress().getAdminArea4();
        java.lang.String m11327constructorimpl = adminArea4 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea4.m11327constructorimpl(adminArea4) : null;
        java.lang.String postalCode = profileAddress.getAddress().getPostalCode();
        return new com.paypal.oslo.core.i18n.domain.model.Address(m11273constructorimpl, m11282constructorimpl, m11291constructorimpl, m11327constructorimpl, m11318constructorimpl, m11309constructorimpl, m11300constructorimpl, postalCode != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(postalCode) : null, com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(profileAddress.getAddress().getCountryCode()), null, 512, null);
    }
}
