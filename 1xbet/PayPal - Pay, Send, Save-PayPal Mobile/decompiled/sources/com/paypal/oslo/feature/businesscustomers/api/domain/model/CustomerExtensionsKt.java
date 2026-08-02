package com.paypal.oslo.feature.businesscustomers.api.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "", "fullName", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerExtensionsKt {
    public static final java.lang.String fullName(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName personName;
        java.lang.String surname;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName name2 = customer.getName();
        if (name2 == null || (personName = name2.getPersonName()) == null) {
            return null;
        }
        java.lang.String givenName = personName.getGivenName();
        if ((givenName == null || givenName.length() == 0) && ((surname = personName.getSurname()) == null || surname.length() == 0)) {
            return null;
        }
        java.lang.String givenName2 = personName.getGivenName();
        if (givenName2 == null || givenName2.length() == 0) {
            return personName.getSurname();
        }
        java.lang.String surname2 = personName.getSurname();
        if (surname2 == null || surname2.length() == 0) {
            return personName.getGivenName();
        }
        java.lang.String givenName3 = personName.getGivenName();
        java.lang.String surname3 = personName.getSurname();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(givenName3);
        sb.append(" ");
        sb.append(surname3);
        return sb.toString();
    }
}
