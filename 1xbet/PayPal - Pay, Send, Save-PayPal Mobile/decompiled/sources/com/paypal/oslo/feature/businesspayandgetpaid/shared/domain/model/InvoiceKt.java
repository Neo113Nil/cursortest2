package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Recipient;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;", "toCustomer", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Recipient;)Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerRecipient;", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerRecipient;)Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer toCustomer(com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient recipient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recipient, "");
        if (recipient instanceof com.paypal.oslo.feature.businesscustomers.api.domain.model.EmailRecipient) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer((java.lang.String) null, (java.lang.String) null, ((com.paypal.oslo.feature.businesscustomers.api.domain.model.EmailRecipient) recipient).getEmail(), (java.lang.String) null, (java.lang.String) null, 27, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        if (recipient instanceof com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient) {
            return toCustomer((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient) recipient);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer toCustomer(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient customerRecipient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerRecipient, "");
        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customerRecipient.getCustomer().getEmails());
        if (str == null) {
            return null;
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer(customerRecipient.getCustomer().getPhotoUrl(), com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerExtensionsKt.fullName(customerRecipient.getCustomer()), str, (java.lang.String) null, (java.lang.String) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
