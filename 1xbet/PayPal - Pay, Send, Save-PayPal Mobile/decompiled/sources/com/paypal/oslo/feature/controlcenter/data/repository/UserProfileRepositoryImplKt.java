package com.paypal.oslo.feature.controlcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserProfileRepositoryImplKt {
    public static final /* synthetic */ com.paypal.oslo.feature.controlcenter.domain.model.UserProfile access$toUserProfile(com.paypal.oslo.core.userstore.model.User user) {
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName2;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName3;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName4;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName5;
        java.lang.String id = user.getId();
        com.paypal.oslo.core.userstore.model.ProfileName legalName = user.getLegalName();
        java.lang.String fullName = (legalName == null || (personName5 = legalName.getPersonName()) == null) ? null : personName5.getFullName();
        com.paypal.oslo.core.userstore.model.ProfileName legalName2 = user.getLegalName();
        java.lang.String givenName = (legalName2 == null || (personName4 = legalName2.getPersonName()) == null) ? null : personName4.getGivenName();
        com.paypal.oslo.core.userstore.model.ProfileName legalName3 = user.getLegalName();
        java.lang.String middleName = (legalName3 == null || (personName3 = legalName3.getPersonName()) == null) ? null : personName3.getMiddleName();
        com.paypal.oslo.core.userstore.model.ProfileName legalName4 = user.getLegalName();
        java.lang.String surname = (legalName4 == null || (personName2 = legalName4.getPersonName()) == null) ? null : personName2.getSurname();
        com.paypal.oslo.core.userstore.model.ProfileName legalName5 = user.getLegalName();
        return new com.paypal.oslo.feature.controlcenter.domain.model.UserProfile(id, fullName, givenName, middleName, surname, (legalName5 == null || (personName = legalName5.getPersonName()) == null) ? null : personName.getSecondSurname(), user.getAccountCountryCode(), user.getProfileImageURL(), com.paypal.oslo.feature.controlcenter.domain.model.AccountType.INSTANCE.fromString(user.getAccountType()));
    }
}
