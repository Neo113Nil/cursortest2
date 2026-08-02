package com.paypal.oslo.feature.contacts.api;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\fR\u0014\u0010 \u001a\u00020\u001d8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u0004\u0018\u00010\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\fR\u0016\u0010$\u001a\u0004\u0018\u00010\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\fR\u0014\u0010%\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0018R\u0014\u0010&\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0018R\u0014\u0010'\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0018R\u0014\u0010+\u001a\u00020(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u0004\u0018\u00010\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchItem;", "Lcom/paypal/oslo/feature/contacts/api/ContactType;", "getType", "()Lcom/paypal/oslo/feature/contacts/api/ContactType;", "type", "Lcom/paypal/oslo/feature/contacts/api/ContactNameType;", "getContactNameType", "()Lcom/paypal/oslo/feature/contacts/api/ContactNameType;", "contactNameType", "", "getFirstName", "()Ljava/lang/String;", "firstName", "getLastName", "lastName", "getPhoneNumber", "phoneNumber", "getEmail", "email", "getAvatarUrl", "avatarUrl", "", "isExternalWallet", "()Z", "getExternalWalletName", "externalWalletName", "getExternalWalletLogoUrl", "externalWalletLogoUrl", "Lcom/paypal/oslo/feature/contacts/api/ContactActionType;", "getActionType", "()Lcom/paypal/oslo/feature/contacts/api/ContactActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "getHandle", "handle", "getLocation", "location", "isBlocked", "isFavorite", "isMobile", "", "getTotalCompletedPayments", "()I", "totalCompletedPayments", "getAccountId", "accountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ContactSearchContactItem extends com.paypal.oslo.feature.contacts.api.ContactSearchItem {
    default java.lang.String getAccountId() {
        return null;
    }

    com.paypal.oslo.feature.contacts.api.ContactActionType getActionType();

    java.lang.String getAvatarUrl();

    java.lang.String getEmail();

    java.lang.String getExternalWalletLogoUrl();

    java.lang.String getExternalWalletName();

    java.lang.String getFirstName();

    default java.lang.String getHandle() {
        return null;
    }

    java.lang.String getLastName();

    default java.lang.String getLocation() {
        return null;
    }

    java.lang.String getPhoneNumber();

    default int getTotalCompletedPayments() {
        return 0;
    }

    default com.paypal.oslo.feature.contacts.api.ContactType getType() {
        return null;
    }

    default boolean isBlocked() {
        return false;
    }

    boolean isExternalWallet();

    default boolean isFavorite() {
        return false;
    }

    default boolean isMobile() {
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.paypal.oslo.feature.contacts.api.ContactType getType(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            return com.paypal.oslo.feature.contacts.api.ContactSearchContactItem.super.getType();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.contacts.api.ContactNameType getContactNameType(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            return com.paypal.oslo.feature.contacts.api.ContactSearchContactItem.super.getContactNameType();
        }

        @java.lang.Deprecated
        public static java.lang.String getHandle(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            return com.paypal.oslo.feature.contacts.api.ContactSearchContactItem.super.getHandle();
        }

        @java.lang.Deprecated
        public static java.lang.String getLocation(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            return com.paypal.oslo.feature.contacts.api.ContactSearchContactItem.super.getLocation();
        }

        @java.lang.Deprecated
        public static boolean isBlocked(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            return com.paypal.oslo.feature.contacts.api.ContactSearchContactItem.super.isBlocked();
        }

        @java.lang.Deprecated
        public static boolean isFavorite(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            return com.paypal.oslo.feature.contacts.api.ContactSearchContactItem.super.isFavorite();
        }

        @java.lang.Deprecated
        public static boolean isMobile(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            return com.paypal.oslo.feature.contacts.api.ContactSearchContactItem.super.isMobile();
        }

        @java.lang.Deprecated
        public static int getTotalCompletedPayments(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            return com.paypal.oslo.feature.contacts.api.ContactSearchContactItem.super.getTotalCompletedPayments();
        }

        @java.lang.Deprecated
        public static java.lang.String getAccountId(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
            return com.paypal.oslo.feature.contacts.api.ContactSearchContactItem.super.getAccountId();
        }
    }

    default com.paypal.oslo.feature.contacts.api.ContactNameType getContactNameType() {
        return com.paypal.oslo.feature.contacts.api.ContactNameType.PERSON;
    }
}
