package com.paypal.oslo.feature.businesscustomers.ui.utils;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u000f*\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameInputState;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;", "toName", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameInputState;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerName;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressInputState;", "", "countryCode", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;", "addressType", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "toAddress", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressInputState;Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "", "isEmpty", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressInputState;)Z", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "toCustomer", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormError;", "collectErrors", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;Ljava/lang/String;)Ljava/util/List;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CreateCustomerInput;", "toFormInputState", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CreateCustomerInput;)Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerFormStateExtensionsKt {
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName toName(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameInputState, "");
        java.lang.String firstName = nameInputState.getName().getFirstName();
        java.lang.String str = null;
        if (firstName == null || firstName.length() == 0) {
            firstName = null;
        }
        java.lang.String lastName = nameInputState.getName().getLastName();
        if (lastName == null || lastName.length() == 0) {
            lastName = null;
        }
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName customerPersonName = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName(firstName, lastName, null, null);
        java.lang.String businessName = nameInputState.getName().getBusinessName();
        if (businessName != null && businessName.length() != 0) {
            str = businessName;
        }
        return new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName(customerPersonName, str);
    }

    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress toAddress(com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState addressInputState, java.lang.String str, com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressInputState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressType, "");
        if (isEmpty(addressInputState)) {
            return null;
        }
        java.lang.String line1 = addressInputState.getAddress().getLine1();
        java.lang.String str2 = (line1 == null || line1.length() == 0) ? null : line1;
        java.lang.String line2 = addressInputState.getAddress().getLine2();
        java.lang.String str3 = (line2 == null || line2.length() == 0) ? null : line2;
        java.lang.String state = addressInputState.getAddress().getState();
        java.lang.String str4 = (state == null || state.length() == 0) ? null : state;
        java.lang.String city = addressInputState.getAddress().getCity();
        java.lang.String str5 = (city == null || city.length() == 0) ? null : city;
        java.lang.String zipCode = addressInputState.getAddress().getZipCode();
        java.lang.String str6 = (zipCode == null || zipCode.length() == 0) ? null : zipCode;
        java.lang.String countryCode = addressInputState.getAddress().getCountryCode();
        return new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress(str2, str3, str4, str5, str6, countryCode != null ? countryCode : str, addressType, null);
    }

    public static final boolean isEmpty(com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState addressInputState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressInputState, "");
        java.lang.String countryCode = addressInputState.getAddress().getCountryCode();
        if (countryCode != null && countryCode.length() != 0) {
            return false;
        }
        java.lang.String line1 = addressInputState.getAddress().getLine1();
        if (line1 != null && line1.length() != 0) {
            return false;
        }
        java.lang.String line2 = addressInputState.getAddress().getLine2();
        if (line2 != null && line2.length() != 0) {
            return false;
        }
        java.lang.String state = addressInputState.getAddress().getState();
        if (state != null && state.length() != 0) {
            return false;
        }
        java.lang.String city = addressInputState.getAddress().getCity();
        if (city != null && city.length() != 0) {
            return false;
        }
        java.lang.String zipCode = addressInputState.getAddress().getZipCode();
        return zipCode == null || zipCode.length() == 0;
    }

    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer toCustomer(com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState customerFormInputState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerFormInputState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer("", com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.EXTERNAL_CONTACT, null, null, toName(customerFormInputState.getNameState()), null, kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress[]{toAddress(customerFormInputState.getAddressContainerState().getBillingAddressState(), str, com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.BILLING), customerFormInputState.getAddressContainerState().isSameShippingAsBilling() ? null : toAddress(customerFormInputState.getAddressContainerState().getShippingAddressState(), str, com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.SHIPPING)}), kotlin.collections.CollectionsKt.listOfNotNull(customerFormInputState.getContactState().getEmailAddress()), kotlin.collections.CollectionsKt.listOfNotNull(com.paypal.oslo.feature.businesscustomers.ui.utils.PhoneUtilsKt.parseInternationalPhone(customerFormInputState.getContactState().getPhoneNumber(), str)), null, false);
    }

    public static final java.util.List<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError> collectErrors(com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState customerFormInputState, java.lang.String str) {
        java.lang.String lastName;
        java.lang.String businessName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerFormInputState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String firstName = customerFormInputState.getNameState().getName().getFirstName();
        if ((firstName == null || kotlin.text.StringsKt.isBlank(firstName)) && (((lastName = customerFormInputState.getNameState().getName().getLastName()) == null || kotlin.text.StringsKt.isBlank(lastName)) && ((businessName = customerFormInputState.getNameState().getName().getBusinessName()) == null || kotlin.text.StringsKt.isBlank(businessName)))) {
            arrayList.add(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.EmptyName);
        }
        java.lang.String emailAddress = customerFormInputState.getContactState().getEmailAddress();
        if (emailAddress == null || kotlin.text.StringsKt.isBlank(emailAddress)) {
            arrayList.add(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.EmptyEmail);
        } else if (!com.paypal.oslo.feature.businesscustomers.ui.utils.EmailUtilsKt.isValidEmail(customerFormInputState.getContactState().getEmailAddress())) {
            arrayList.add(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.InvalidEmail);
        }
        java.lang.String phoneNumber = customerFormInputState.getContactState().getPhoneNumber();
        if (phoneNumber != null && !kotlin.text.StringsKt.isBlank(phoneNumber) && !com.paypal.oslo.feature.businesscustomers.ui.utils.PhoneUtilsKt.isValidPhone(customerFormInputState.getContactState().getPhoneNumber(), str)) {
            arrayList.add(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.InvalidPhone);
        }
        if (customerFormInputState.getNotesState().getNotes().length() > 1000) {
            arrayList.add(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.InvalidLengthInCustomerNotes);
        }
        return arrayList;
    }

    public static final com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState toFormInputState(com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput createCustomerInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCustomerInput, "");
        return new com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState(new com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState(new com.paypal.oslo.feature.businesscustomers.ui.model.NameFields(createCustomerInput.getFirstName(), createCustomerInput.getLastName(), null, 4, null)), new com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState(createCustomerInput.getEmail(), createCustomerInput.getPhone()), null, null, 12, null);
    }
}
