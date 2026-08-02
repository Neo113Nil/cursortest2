package com.paypal.oslo.feature.businesscustomers.ui.utils;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "", "subtitle", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPhoneNumber;", "format", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPhoneNumber;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerDisplayName;", "getCustomerDisplayName", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerDisplayName;", "ppmehandle", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "getBillingAddress", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "getShippingAddress", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;", "toFormInputState", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;", "formData", "accountCountryCode", "applyFormData", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;", "toPayAndGetPaidCustomer", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;", "name", "createCustomerForPreview", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerExtensionsKt {
    public static final java.lang.String subtitle(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        java.lang.String externalId = customer.getExternalId();
        if (externalId != null || (externalId = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer.getEmails())) != null) {
            return externalId;
        }
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber customerPhoneNumber = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer.getPhoneNumbers());
        if (customerPhoneNumber != null) {
            return format(customerPhoneNumber);
        }
        return null;
    }

    public static final java.lang.String format(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber customerPhoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerPhoneNumber, "");
        return com.paypal.oslo.feature.businesscustomers.ui.utils.PhoneUtilsKt.formatNumber(kotlin.text.StringsKt.toIntOrNull(customerPhoneNumber.getCountryCode()), kotlin.text.StringsKt.toLongOrNull(customerPhoneNumber.getNationalNumber()));
    }

    public static final com.paypal.oslo.feature.businesscustomers.ui.model.CustomerDisplayName getCustomerDisplayName(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        java.lang.String fullName = com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerExtensionsKt.fullName(customer);
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name2 = customer.getName();
        java.lang.String str2 = null;
        java.lang.String businessName = name2 != null ? name2.getBusinessName() : null;
        java.lang.String externalId = customer.getExternalId();
        if ((externalId == null || (str = "@".concat(java.lang.String.valueOf(externalId))) == null) && (str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer.getEmails())) == null) {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber customerPhoneNumber = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer.getPhoneNumbers());
            str = customerPhoneNumber != null ? format(customerPhoneNumber) : null;
        }
        java.lang.String str3 = fullName;
        if (str3 == null || str3.length() == 0) {
            java.lang.String str4 = businessName;
            if (str4 != null && str4.length() != 0) {
                fullName = businessName;
            }
            return new com.paypal.oslo.feature.businesscustomers.ui.model.CustomerDisplayName(str, str2, businessName);
        }
        str2 = businessName;
        businessName = str2;
        str2 = str;
        str = fullName;
        return new com.paypal.oslo.feature.businesscustomers.ui.model.CustomerDisplayName(str, str2, businessName);
    }

    public static final java.lang.String ppmehandle(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        java.lang.String externalId = customer.getExternalId();
        if (externalId != null) {
            return "@".concat(java.lang.String.valueOf(externalId));
        }
        return null;
    }

    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress getBillingAddress(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        java.util.Iterator<T> it = customer.getAddresses().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress) obj).getAddressType() == com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.BILLING) {
                break;
            }
        }
        return (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress) obj;
    }

    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress getShippingAddress(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        java.util.Iterator<T> it = customer.getAddresses().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress) obj).getAddressType() == com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.SHIPPING) {
                break;
            }
        }
        return (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress) obj;
    }

    public static final com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState toFormInputState(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState addressInputState;
        com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState addressInputState2;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName personName;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName personName2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress billingAddress = getBillingAddress(customer);
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress shippingAddress = getShippingAddress(customer);
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name2 = customer.getName();
        java.lang.String givenName = (name2 == null || (personName2 = name2.getPersonName()) == null) ? null : personName2.getGivenName();
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name3 = customer.getName();
        java.lang.String surname = (name3 == null || (personName = name3.getPersonName()) == null) ? null : personName.getSurname();
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name4 = customer.getName();
        com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState = new com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState(new com.paypal.oslo.feature.businesscustomers.ui.model.NameFields(givenName, surname, name4 != null ? name4.getBusinessName() : null));
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber customerPhoneNumber = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer.getPhoneNumbers());
        com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactMeansInputState = new com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState((java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer.getEmails()), customerPhoneNumber != null ? format(customerPhoneNumber) : null);
        boolean z = true;
        if (billingAddress == null || (addressInputState = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerAddressExtensionsKt.toInputState(billingAddress)) == null) {
            addressInputState = new com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState(null, 1, null);
        }
        if (shippingAddress == null || (addressInputState2 = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerAddressExtensionsKt.toInputState(shippingAddress)) == null) {
            addressInputState2 = new com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState(null, 1, null);
        }
        if (billingAddress != null && !com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerAddressExtensionsKt.isEmpty(billingAddress) && shippingAddress != null) {
            z = false;
        }
        com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState addressContainerState = new com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState(addressInputState, addressInputState2, z);
        java.lang.String description = customer.getDescription();
        return new com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState(nameInputState, contactMeansInputState, addressContainerState, new com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState(description != null ? description : ""));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer applyFormData(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState customerFormInputState, java.lang.String str) {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress address;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name2;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer copy;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName personName;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName personName2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerFormInputState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState billingAddressState = customerFormInputState.getAddressContainerState().getBillingAddressState();
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress billingAddress = getBillingAddress(customer);
        if (billingAddress == null || (address = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerAddressExtensionsKt.applyFormData(billingAddress, billingAddressState)) == null) {
            address = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerFormStateExtensionsKt.toAddress(billingAddressState, str, com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.BILLING);
        }
        com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState addressContainerState = customerFormInputState.getAddressContainerState();
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress customerAddress = null;
        if (addressContainerState.isSameShippingAsBilling()) {
            addressContainerState = null;
        }
        if (addressContainerState != null) {
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState shippingAddressState = addressContainerState.getShippingAddressState();
            com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress shippingAddress = getShippingAddress(customer);
            if (shippingAddress == null || (customerAddress = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerAddressExtensionsKt.applyFormData(shippingAddress, shippingAddressState)) == null) {
                customerAddress = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerFormStateExtensionsKt.toAddress(shippingAddressState, str, com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.SHIPPING);
            }
        }
        java.util.List listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress[]{address, customerAddress});
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name3 = customer.getName();
        if (name3 != null) {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name4 = customer.getName();
            if (name4 == null || (personName2 = name4.getPersonName()) == null || (personName = com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName.copy$default(personName2, customerFormInputState.getNameState().getName().getFirstName(), customerFormInputState.getNameState().getName().getLastName(), null, null, 12, null)) == null) {
                personName = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerFormStateExtensionsKt.toName(customerFormInputState.getNameState()).getPersonName();
            }
            name2 = name3.copy(personName, customerFormInputState.getNameState().getName().getBusinessName());
        }
        name2 = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerFormStateExtensionsKt.toName(customerFormInputState.getNameState());
        copy = customer.copy((r24 & 1) != 0 ? customer.id : null, (r24 & 2) != 0 ? customer.type : null, (r24 & 4) != 0 ? customer.accountId : null, (r24 & 8) != 0 ? customer.externalId : null, (r24 & 16) != 0 ? customer.name : name2, (r24 & 32) != 0 ? customer.photoUrl : null, (r24 & 64) != 0 ? customer.addresses : listOfNotNull, (r24 & 128) != 0 ? customer.emails : kotlin.collections.CollectionsKt.listOfNotNull(customerFormInputState.getContactState().getEmailAddress()), (r24 & 256) != 0 ? customer.phoneNumbers : kotlin.collections.CollectionsKt.listOfNotNull(com.paypal.oslo.feature.businesscustomers.ui.utils.PhoneUtilsKt.parseInternationalPhone(customerFormInputState.getContactState().getPhoneNumber(), str)), (r24 & 512) != 0 ? customer.description : customerFormInputState.getNotesState().getNotes(), (r24 & 1024) != 0 ? customer.isFavorite : false);
        return copy;
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer toPayAndGetPaidCustomer(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        if (customer.getEmails().isEmpty()) {
            throw new java.lang.IllegalArgumentException("Customer.emails must not be empty when converting to PayAndGetPaidCustomer".toString());
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer(customer.getPhotoUrl(), com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerExtensionsKt.fullName(customer), (java.lang.String) kotlin.collections.CollectionsKt.first((java.util.List) customer.getEmails()), (java.lang.String) null, (java.lang.String) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer createCustomerForPreview(java.lang.String str) {
        java.lang.String str2;
        java.util.List listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(lowerCase, " ", "_", false, 4, (java.lang.Object) null);
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType customerType = com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.USER;
        java.lang.String lowerCase2 = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        java.lang.String replace$default2 = kotlin.text.StringsKt.replace$default(lowerCase2, " ", "_", false, 4, (java.lang.Object) null);
        java.lang.String str3 = null;
        if (str.length() > 12) {
            java.lang.String lowerCase3 = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            str2 = kotlin.text.StringsKt.replace$default(lowerCase3, " ", "_", false, 4, (java.lang.Object) null);
        } else {
            str2 = null;
        }
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName customerPersonName = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName(str.length() < 5 ? null : (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null), 0), str.length() < 5 ? null : (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null), 1), null, null);
        if (str.length() > 13) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" Biz");
            str3 = sb.toString();
        }
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName(customerPersonName, str3);
        java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
        int length = str.length();
        if (6 <= length && length < 12) {
            listOf = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.lang.String lowerCase4 = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
            java.lang.String replace$default3 = kotlin.text.StringsKt.replace$default(lowerCase4, " ", ".", false, 4, (java.lang.Object) null);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(replace$default3);
            sb2.append("@example.com");
            listOf = kotlin.collections.CollectionsKt.listOf(sb2.toString());
        }
        return new com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer(replace$default, customerType, replace$default2, str2, customerName, null, emptyList, listOf, kotlin.collections.CollectionsKt.emptyList(), com.paypal.oslo.feature.businesscustomers.ui.customerform.components.EditNotesItemKt.getCustomerNotesLoremIpsum(), false);
    }
}
