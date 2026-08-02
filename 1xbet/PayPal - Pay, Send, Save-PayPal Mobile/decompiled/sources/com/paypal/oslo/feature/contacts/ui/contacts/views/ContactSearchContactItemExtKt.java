package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "", "contactInitials", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)Ljava/lang/String;", "contactPrimaryText", "Lcom/paypal/oslo/feature/contacts/ui/contacts/views/ContactDescriptionTextStrings;", "strings", "Lcom/paypal/oslo/feature/contacts/ui/contacts/views/ContactItemDescription;", "contactDescription", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;Lcom/paypal/oslo/feature/contacts/ui/contacts/views/ContactDescriptionTextStrings;)Lcom/paypal/oslo/feature/contacts/ui/contacts/views/ContactItemDescription;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactSearchContactItemExtKt {
    public static final java.lang.String contactInitials(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchContactItem, "");
        java.lang.String firstName = contactSearchContactItem.getFirstName();
        if (firstName == null) {
            firstName = "";
        }
        java.lang.String take = kotlin.text.StringsKt.take(kotlin.text.StringsKt.trim(firstName).toString(), 1);
        java.lang.String lastName = contactSearchContactItem.getLastName();
        java.lang.String take2 = kotlin.text.StringsKt.take(kotlin.text.StringsKt.trim(lastName != null ? lastName : "").toString(), 1);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(take);
        sb.append(take2);
        return sb.toString();
    }

    public static final java.lang.String contactPrimaryText(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchContactItem, "");
        if (contactSearchContactItem.getContactNameType() == com.paypal.oslo.feature.contacts.api.ContactNameType.BUSINESS) {
            java.lang.String firstName = contactSearchContactItem.getFirstName();
            return kotlin.text.StringsKt.trim(firstName != null ? firstName : "").toString();
        }
        java.lang.String firstName2 = contactSearchContactItem.getFirstName();
        if (firstName2 == null) {
            firstName2 = "";
        }
        java.lang.String lastName = contactSearchContactItem.getLastName();
        java.lang.String str = lastName != null ? lastName : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(firstName2);
        sb.append(" ");
        sb.append(str);
        return kotlin.text.StringsKt.trim(sb.toString()).toString();
    }

    public static final com.paypal.oslo.feature.contacts.ui.contacts.views.ContactItemDescription contactDescription(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem, com.paypal.oslo.feature.contacts.ui.contacts.views.ContactDescriptionTextStrings contactDescriptionTextStrings) {
        java.lang.String inYourContacts;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchContactItem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactDescriptionTextStrings, "");
        if (contactSearchContactItem.isExternalWallet()) {
            java.lang.String externalWalletName = contactSearchContactItem.getExternalWalletName();
            if (externalWalletName != null) {
                return new com.paypal.oslo.feature.contacts.ui.contacts.views.ContactItemDescription(externalWalletName, null, null);
            }
            return null;
        }
        if (contactSearchContactItem.getTotalCompletedPayments() <= 0) {
            inYourContacts = contactSearchContactItem.isMobile() ? contactDescriptionTextStrings.getInYourContacts() : null;
        } else if (contactSearchContactItem.getTotalCompletedPayments() == 1) {
            inYourContacts = java.lang.String.format(contactDescriptionTextStrings.getCompletedTransactionSingular(), java.util.Arrays.copyOf(new java.lang.Object[]{"1"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inYourContacts, "");
        } else if (contactSearchContactItem.getTotalCompletedPayments() > 10) {
            inYourContacts = contactDescriptionTextStrings.getCompletedTransactions10Plus();
        } else {
            inYourContacts = java.lang.String.format(contactDescriptionTextStrings.getCompletedTransactions(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(contactSearchContactItem.getTotalCompletedPayments())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inYourContacts, "");
        }
        if (inYourContacts == null) {
            java.lang.String handle = contactSearchContactItem.getHandle();
            if (handle != null) {
                if (kotlin.text.StringsKt.isBlank(handle)) {
                    handle = null;
                }
                if (handle != null) {
                    str = "@".concat(java.lang.String.valueOf(handle));
                }
            }
            str = null;
        } else {
            str = inYourContacts;
        }
        java.lang.String location = contactSearchContactItem.getLocation();
        if (inYourContacts != null) {
            location = null;
        }
        if (str == null && location == null) {
            return null;
        }
        return new com.paypal.oslo.feature.contacts.ui.contacts.views.ContactItemDescription(str, location != null ? com.paypal.pds.core.Icon.MapPin.INSTANCE : null, location);
    }
}
