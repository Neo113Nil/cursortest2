package com.paypal.oslo.core.userstore.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000e\u001a\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/User;", "getMockUser", "()Lcom/paypal/oslo/core/userstore/model/User;", "Lcom/paypal/oslo/core/userstore/model/ProfileName;", "mockProfileName", "()Lcom/paypal/oslo/core/userstore/model/ProfileName;", "Lcom/paypal/oslo/core/userstore/model/ProfileName$PersonName;", "mockPersonName", "()Lcom/paypal/oslo/core/userstore/model/ProfileName$PersonName;", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "mockProfileEmail", "()Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "mockProfilePhone", "()Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "mockSecondaryProfilePhone", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone$PhoneNumber;", "mockPhoneNumber", "()Lcom/paypal/oslo/core/userstore/model/ProfilePhone$PhoneNumber;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "mockProfileAddress", "()Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress$Address;", "mockAddress", "()Lcom/paypal/oslo/core/userstore/model/ProfileAddress$Address;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MockDataKt {
    public static final com.paypal.oslo.core.userstore.model.User getMockUser() {
        return new com.paypal.oslo.core.userstore.model.User("XDDJMMEZE7EW2", "US", "USD", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UserProfileConstants.KEY_ACCOUNT_TYPE_PERSONAL, "_sys_aquarium-6025747776379502@paypal.com", true, "Ursula Robert", "(8**) ***-0741", "0891 Maple Court #8, Bowman, SC 29018", "https://pics.msmaster.qa.paypal.com/00/p/NTQ5ZjA3YzAtMDVlNi00MjZkLTk0N2EtM2ZjNjc2YTllMjI3/image_12.JPG", null, "US", "US", mockProfileName(), mockProfileEmail(), kotlin.collections.CollectionsKt.listOf(mockProfileEmail()), mockProfilePhone(), mockProfilePhone(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.userstore.model.ProfilePhone[]{mockProfilePhone(), mockSecondaryProfilePhone()}), mockProfileAddress(), kotlin.collections.CollectionsKt.listOf(mockProfileAddress()), new java.util.Date(1764665936000L), null, 4194304, null);
    }

    public static final com.paypal.oslo.core.userstore.model.ProfileName mockProfileName() {
        return new com.paypal.oslo.core.userstore.model.ProfileName(com.paypal.oslo.core.userstore.model.Orthography.ZZZZ, mockPersonName());
    }

    public static final com.paypal.oslo.core.userstore.model.ProfileName.PersonName mockPersonName() {
        return new com.paypal.oslo.core.userstore.model.ProfileName.PersonName(null, "Ursula", null, null, "Robert", null, "Ursula Robert");
    }

    public static final com.paypal.oslo.core.userstore.model.ProfileEmail mockProfileEmail() {
        return new com.paypal.oslo.core.userstore.model.ProfileEmail("7PKPK9KB73LL2", "_sys_aquarium-6025747776379502@paypal.com", true, true, new java.util.Date(1764665936000L));
    }

    public static final com.paypal.oslo.core.userstore.model.ProfilePhone mockProfilePhone() {
        return new com.paypal.oslo.core.userstore.model.ProfilePhone("G5S9NPLJTJ96W", com.paypal.oslo.core.userstore.model.PhoneType.MOBILE, mockPhoneNumber(), "(8**) ***-0741", true, true, new java.util.Date(1764665936000L));
    }

    public static final com.paypal.oslo.core.userstore.model.ProfilePhone mockSecondaryProfilePhone() {
        return new com.paypal.oslo.core.userstore.model.ProfilePhone("RZVNZA56KC5MQ", com.paypal.oslo.core.userstore.model.PhoneType.MOBILE, new com.paypal.oslo.core.userstore.model.ProfilePhone.PhoneNumber(null, "1", "8435486245"), "(8**) ***-6245", false, true, new java.util.Date(1764665936000L));
    }

    public static final com.paypal.oslo.core.userstore.model.ProfilePhone.PhoneNumber mockPhoneNumber() {
        return new com.paypal.oslo.core.userstore.model.ProfilePhone.PhoneNumber(null, "1", "8437360741");
    }

    public static final com.paypal.oslo.core.userstore.model.ProfileAddress mockProfileAddress() {
        return new com.paypal.oslo.core.userstore.model.ProfileAddress("4THAE6NELNZ2W", true, false, "Ursula Robert", true, com.paypal.oslo.core.userstore.model.AddressConfirmationAuthority.NONE, mockAddress());
    }

    public static final com.paypal.oslo.core.userstore.model.ProfileAddress.Address mockAddress() {
        return new com.paypal.oslo.core.userstore.model.ProfileAddress.Address("0891 Maple Court #8", null, null, "SC", "Bowman", null, null, "US", "29018");
    }
}
