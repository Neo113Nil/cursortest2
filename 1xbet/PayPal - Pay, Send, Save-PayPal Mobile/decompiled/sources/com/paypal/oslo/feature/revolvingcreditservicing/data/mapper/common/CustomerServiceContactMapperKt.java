package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0015\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$CustomerService;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "toCustomerServiceContact", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$CustomerService;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceSummaryFragment;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceSummaryFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPhoneFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPhoneFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CustomerServiceContactMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact toCustomerServiceContact(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService customerService) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerService, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.PhoneNumber phoneNumber = customerService.getRevolvingCreditCustomerServiceFragment().getPhoneNumber();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber domain = (phoneNumber == null || (revolvingCreditPhoneFragment = phoneNumber.getRevolvingCreditPhoneFragment()) == null) ? null : toDomain(revolvingCreditPhoneFragment);
        java.lang.String operationHours = customerService.getRevolvingCreditCustomerServiceFragment().getOperationHours();
        java.lang.String str = operationHours == null ? "" : operationHours;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.MailingAddress mailingAddress = customerService.getRevolvingCreditCustomerServiceFragment().getMailingAddress();
        java.lang.String addressLine1 = mailingAddress != null ? mailingAddress.getAddressLine1() : null;
        java.lang.String str2 = addressLine1 == null ? "" : addressLine1;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.MailingAddress mailingAddress2 = customerService.getRevolvingCreditCustomerServiceFragment().getMailingAddress();
        java.lang.String addressLine2 = mailingAddress2 != null ? mailingAddress2.getAddressLine2() : null;
        java.lang.String str3 = addressLine2 == null ? "" : addressLine2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.MailingAddress mailingAddress3 = customerService.getRevolvingCreditCustomerServiceFragment().getMailingAddress();
        java.lang.String addressLine3 = mailingAddress3 != null ? mailingAddress3.getAddressLine3() : null;
        java.lang.String str4 = addressLine3 == null ? "" : addressLine3;
        java.lang.String payableTo = customerService.getRevolvingCreditCustomerServiceFragment().getPayableTo();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact(domain, str, null, str2, str3, str4, payableTo == null ? "" : payableTo);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact toCustomerServiceContact(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceSummaryFragment revolvingCreditCustomerServiceSummaryFragment) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditCustomerServiceSummaryFragment, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceSummaryFragment.CustomerService customerService = revolvingCreditCustomerServiceSummaryFragment.getCustomerService();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber = null;
        if (customerService == null) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceSummaryFragment.PhoneNumber phoneNumber2 = customerService.getPhoneNumber();
        if (phoneNumber2 != null && (revolvingCreditPhoneFragment = phoneNumber2.getRevolvingCreditPhoneFragment()) != null) {
            phoneNumber = toDomain(revolvingCreditPhoneFragment);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber3 = phoneNumber;
        java.lang.String operationHours = customerService.getOperationHours();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact(phoneNumber3, operationHours == null ? "" : operationHours, null, "", "", "", "");
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment) {
        java.lang.String countryCode;
        java.lang.String nationalNumber = revolvingCreditPhoneFragment != null ? revolvingCreditPhoneFragment.getNationalNumber() : null;
        if (nationalNumber == null) {
            nationalNumber = "";
        }
        java.lang.Integer intOrNull = (revolvingCreditPhoneFragment == null || (countryCode = revolvingCreditPhoneFragment.getCountryCode()) == null) ? null : kotlin.text.StringsKt.toIntOrNull(countryCode);
        java.lang.String extensionNumber = revolvingCreditPhoneFragment != null ? revolvingCreditPhoneFragment.getExtensionNumber() : null;
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber(nationalNumber, intOrNull, extensionNumber != null ? extensionNumber : "");
    }
}
