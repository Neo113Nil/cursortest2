package com.paypal.oslo.feature.p2p.domain.contacts;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/contacts/ReceiverTypeResolver;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "contact", "Lcom/paypal/oslo/feature/p2p/domain/contacts/ReceiverInfo;", "resolveFromContact", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)Lcom/paypal/oslo/feature/p2p/domain/contacts/ReceiverInfo;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReceiverTypeResolver {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ReceiverTypeResolver() {
    }

    public final com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo resolveFromContact(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "");
        java.lang.String email = contact.getEmail();
        if (email == null || kotlin.text.StringsKt.isBlank(email)) {
            java.lang.String phoneNumber = contact.getPhoneNumber();
            pair = (phoneNumber == null || kotlin.text.StringsKt.isBlank(phoneNumber)) ? kotlin.TuplesKt.to(contact.getId(), com.paypal.oslo.feature.p2p.domain.model.ReceiverType.PEER_ID) : kotlin.TuplesKt.to(contact.getPhoneNumber(), com.paypal.oslo.feature.p2p.domain.model.ReceiverType.PHONE_NUMBER);
        } else {
            pair = kotlin.TuplesKt.to(contact.getEmail(), com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS);
        }
        java.lang.String str = (java.lang.String) pair.component1();
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType = (com.paypal.oslo.feature.p2p.domain.model.ReceiverType) pair.component2();
        java.lang.String str2 = str != null ? str : "";
        if (kotlin.text.StringsKt.isBlank(str2)) {
            java.lang.String id = contact.getId();
            java.lang.String email2 = contact.getEmail();
            java.lang.String phoneNumber2 = contact.getPhoneNumber();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Contact identifier cannot be blank. Contact ID: '");
            sb.append(id);
            sb.append("', email: '");
            sb.append(email2);
            sb.append("', phone: '");
            sb.append(phoneNumber2);
            sb.append("'");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        return new com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo(str2, receiverType);
    }
}
