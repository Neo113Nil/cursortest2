package com.paypal.oslo.feature.userprofile.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0006¢\u0006\u0004\b\u0002\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "toProfileDataItem", "(Lcom/paypal/oslo/core/userstore/model/ProfileEmail;)Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "(Lcom/paypal/oslo/core/userstore/model/ProfilePhone;)Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "(Lcom/paypal/oslo/core/userstore/model/ProfileAddress;)Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProfileDataItemExtensionsKt {
    public static final com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileEmail> toProfileDataItem(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileEmail, "");
        return new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<>(profileEmail.getId(), profileEmail.getEmailAddress(), null, profileEmail.getPrimary(), profileEmail.getConfirmed(), com.paypal.pds.core.Icon.Envelope.INSTANCE, null, profileEmail, 64, null);
    }

    public static final com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfilePhone> toProfileDataItem(com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilePhone, "");
        return new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<>(profilePhone.getId(), profilePhone.getMaskedPhoneNumber(), profilePhone.getType().name(), profilePhone.getPrimary(), profilePhone.getConfirmed(), com.paypal.pds.core.Icon.Phone.INSTANCE, null, profilePhone, 64, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileAddress> toProfileDataItem(com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress) {
        java.lang.String str;
        java.lang.String addressLine2;
        java.lang.String str2;
        java.lang.String adminArea2;
        java.lang.String str3;
        java.lang.String adminArea1;
        java.lang.String str4;
        java.lang.String postalCode;
        java.lang.String str5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileAddress, "");
        java.lang.String id = profileAddress.getId();
        java.lang.String[] strArr = new java.lang.String[2];
        java.lang.String addressLine1 = profileAddress.getAddress().getAddressLine1();
        if (addressLine1 != null) {
            if (kotlin.text.StringsKt.isBlank(addressLine1)) {
                addressLine1 = null;
            }
            if (addressLine1 != null) {
                str = kotlin.text.StringsKt.trim(addressLine1).toString();
                strArr[0] = str;
                addressLine2 = profileAddress.getAddress().getAddressLine2();
                if (addressLine2 != null) {
                    if (kotlin.text.StringsKt.isBlank(addressLine2)) {
                        addressLine2 = null;
                    }
                    if (addressLine2 != null) {
                        str2 = kotlin.text.StringsKt.trim(addressLine2).toString();
                        strArr[1] = str2;
                        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) strArr), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null);
                        adminArea2 = profileAddress.getAddress().getAdminArea2();
                        if (adminArea2 != null) {
                            if (kotlin.text.StringsKt.isBlank(adminArea2)) {
                                adminArea2 = null;
                            }
                            if (adminArea2 != null) {
                                str3 = kotlin.text.StringsKt.trim(adminArea2).toString();
                                adminArea1 = profileAddress.getAddress().getAdminArea1();
                                if (adminArea1 != null) {
                                    if (kotlin.text.StringsKt.isBlank(adminArea1)) {
                                        adminArea1 = null;
                                    }
                                    if (adminArea1 != null) {
                                        str4 = kotlin.text.StringsKt.trim(adminArea1).toString();
                                        postalCode = profileAddress.getAddress().getPostalCode();
                                        if (postalCode != null) {
                                            if (kotlin.text.StringsKt.isBlank(postalCode)) {
                                                postalCode = null;
                                            }
                                            if (postalCode != null) {
                                                str5 = kotlin.text.StringsKt.trim(postalCode).toString();
                                                java.lang.String joinToString$default2 = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str4, str5}), " ", null, null, 0, null, null, 62, null);
                                                return new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<>(id, joinToString$default, kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str3, kotlin.text.StringsKt.isBlank(joinToString$default2) ? null : joinToString$default2}), ", ", null, null, 0, null, null, 62, null), profileAddress.getPrimary(), profileAddress.getConfirmed(), com.paypal.pds.core.Icon.MapPin.INSTANCE, null, profileAddress, 64, null);
                                            }
                                        }
                                        str5 = null;
                                        java.lang.String joinToString$default22 = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str4, str5}), " ", null, null, 0, null, null, 62, null);
                                        return new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<>(id, joinToString$default, kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str3, kotlin.text.StringsKt.isBlank(joinToString$default22) ? null : joinToString$default22}), ", ", null, null, 0, null, null, 62, null), profileAddress.getPrimary(), profileAddress.getConfirmed(), com.paypal.pds.core.Icon.MapPin.INSTANCE, null, profileAddress, 64, null);
                                    }
                                }
                                str4 = null;
                                postalCode = profileAddress.getAddress().getPostalCode();
                                if (postalCode != null) {
                                }
                                str5 = null;
                                java.lang.String joinToString$default222 = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str4, str5}), " ", null, null, 0, null, null, 62, null);
                                return new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<>(id, joinToString$default, kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str3, kotlin.text.StringsKt.isBlank(joinToString$default222) ? null : joinToString$default222}), ", ", null, null, 0, null, null, 62, null), profileAddress.getPrimary(), profileAddress.getConfirmed(), com.paypal.pds.core.Icon.MapPin.INSTANCE, null, profileAddress, 64, null);
                            }
                        }
                        str3 = null;
                        adminArea1 = profileAddress.getAddress().getAdminArea1();
                        if (adminArea1 != null) {
                        }
                        str4 = null;
                        postalCode = profileAddress.getAddress().getPostalCode();
                        if (postalCode != null) {
                        }
                        str5 = null;
                        java.lang.String joinToString$default2222 = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str4, str5}), " ", null, null, 0, null, null, 62, null);
                        return new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<>(id, joinToString$default, kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str3, kotlin.text.StringsKt.isBlank(joinToString$default2222) ? null : joinToString$default2222}), ", ", null, null, 0, null, null, 62, null), profileAddress.getPrimary(), profileAddress.getConfirmed(), com.paypal.pds.core.Icon.MapPin.INSTANCE, null, profileAddress, 64, null);
                    }
                }
                str2 = null;
                strArr[1] = str2;
                java.lang.String joinToString$default3 = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) strArr), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null);
                adminArea2 = profileAddress.getAddress().getAdminArea2();
                if (adminArea2 != null) {
                }
                str3 = null;
                adminArea1 = profileAddress.getAddress().getAdminArea1();
                if (adminArea1 != null) {
                }
                str4 = null;
                postalCode = profileAddress.getAddress().getPostalCode();
                if (postalCode != null) {
                }
                str5 = null;
                java.lang.String joinToString$default22222 = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str4, str5}), " ", null, null, 0, null, null, 62, null);
                return new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<>(id, joinToString$default3, kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str3, kotlin.text.StringsKt.isBlank(joinToString$default22222) ? null : joinToString$default22222}), ", ", null, null, 0, null, null, 62, null), profileAddress.getPrimary(), profileAddress.getConfirmed(), com.paypal.pds.core.Icon.MapPin.INSTANCE, null, profileAddress, 64, null);
            }
        }
        str = null;
        strArr[0] = str;
        addressLine2 = profileAddress.getAddress().getAddressLine2();
        if (addressLine2 != null) {
        }
        str2 = null;
        strArr[1] = str2;
        java.lang.String joinToString$default32 = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) strArr), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null);
        adminArea2 = profileAddress.getAddress().getAdminArea2();
        if (adminArea2 != null) {
        }
        str3 = null;
        adminArea1 = profileAddress.getAddress().getAdminArea1();
        if (adminArea1 != null) {
        }
        str4 = null;
        postalCode = profileAddress.getAddress().getPostalCode();
        if (postalCode != null) {
        }
        str5 = null;
        java.lang.String joinToString$default222222 = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str4, str5}), " ", null, null, 0, null, null, 62, null);
        return new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<>(id, joinToString$default32, kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{str3, kotlin.text.StringsKt.isBlank(joinToString$default222222) ? null : joinToString$default222222}), ", ", null, null, 0, null, null, 62, null), profileAddress.getPrimary(), profileAddress.getConfirmed(), com.paypal.pds.core.Icon.MapPin.INSTANCE, null, profileAddress, 64, null);
    }
}
