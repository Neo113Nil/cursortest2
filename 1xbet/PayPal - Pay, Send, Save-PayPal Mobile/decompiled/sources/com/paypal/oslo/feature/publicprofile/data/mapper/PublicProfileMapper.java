package com.paypal.oslo.feature.publicprofile.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/data/mapper/PublicProfileMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Data;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;", "toPublicProfile", "(Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Data;Ljava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/domain/model/PublicProfile;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PublicProfileMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.publicprofile.data.mapper.PublicProfileMapper INSTANCE = new com.paypal.oslo.feature.publicprofile.data.mapper.PublicProfileMapper();

    private PublicProfileMapper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r9 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010c, code lost:
    
        if (r0 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile toPublicProfile(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data data, java.lang.String str) {
        java.lang.String str2;
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 name2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object profilePhotoUrl;
        java.lang.String obj;
        java.lang.String str5;
        java.lang.String adminArea2;
        java.lang.Object joinedDate;
        java.lang.Integer num;
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship;
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship2;
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship3;
        java.lang.Integer mutualConnectionCount;
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship4;
        java.lang.Object profilePhotoUrl2;
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name name3;
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress primaryAddress;
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address address;
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location location;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile publicProfile = data.getPublicProfile();
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile onPersonalPublicProfile = publicProfile.getOnPersonalPublicProfile();
        com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields = (onPersonalPublicProfile == null || (location = onPersonalPublicProfile.getLocation()) == null) ? null : location.getAddressPortableFields();
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact = data.getContact();
        com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields2 = (contact == null || (primaryAddress = contact.getPrimaryAddress()) == null || (address = primaryAddress.getAddress()) == null) ? null : address.getAddressPortableFields();
        java.lang.String handle = publicProfile.getHandle();
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile onPersonalPublicProfile2 = publicProfile.getOnPersonalPublicProfile();
        if (onPersonalPublicProfile2 != null && (name3 = onPersonalPublicProfile2.getName()) != null) {
            com.paypal.oslo.feature.publicprofile.graphql.fragment.PersonNameFields personNameFields = name3.getCustomerNameFields().getPersonNameFields();
            if (personNameFields == null || (str2 = personNameFields.getFullName()) == null) {
                com.paypal.oslo.feature.publicprofile.graphql.fragment.BusinessNameFields businessNameFields = name3.getCustomerNameFields().getBusinessNameFields();
                str2 = businessNameFields != null ? businessNameFields.getBusinessName() : null;
            }
        }
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact2 = data.getContact();
        if (contact2 == null || (name2 = contact2.getName()) == null) {
            str2 = null;
        } else {
            com.paypal.oslo.feature.publicprofile.graphql.fragment.PersonNameFields personNameFields2 = name2.getCustomerNameFields().getPersonNameFields();
            if (personNameFields2 != null) {
                java.lang.String givenName = personNameFields2.getGivenName();
                if (givenName == null) {
                    givenName = "";
                }
                java.lang.String surname = personNameFields2.getSurname();
                if (surname == null) {
                    surname = "";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(givenName);
                sb.append(" ");
                sb.append(surname);
                str3 = kotlin.text.StringsKt.trim(sb.toString()).toString();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str6 = str3;
            if (str6.length() == 0) {
                com.paypal.oslo.feature.publicprofile.graphql.fragment.BusinessNameFields businessNameFields2 = name2.getCustomerNameFields().getBusinessNameFields();
                java.lang.String businessName = businessNameFields2 != null ? businessNameFields2.getBusinessName() : null;
                str6 = businessName == null ? "" : businessName;
            }
            str2 = str6;
        }
        if (str2 == null) {
            str2 = "";
        }
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile onPersonalPublicProfile3 = publicProfile.getOnPersonalPublicProfile();
        if (onPersonalPublicProfile3 == null || (profilePhotoUrl2 = onPersonalPublicProfile3.getProfilePhotoUrl()) == null || (obj = profilePhotoUrl2.toString()) == null) {
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact3 = data.getContact();
            if (contact3 == null || (profilePhotoUrl = contact3.getProfilePhotoUrl()) == null) {
                str4 = null;
                if (addressPortableFields != null) {
                    adminArea2 = addressPortableFields.getAdminArea2();
                    if (adminArea2 == null) {
                        adminArea2 = addressPortableFields.getAdminArea1();
                    }
                }
                if (addressPortableFields2 != null) {
                    str5 = null;
                    joinedDate = publicProfile.getJoinedDate();
                    if (joinedDate != null) {
                    }
                    java.lang.Integer num2 = r5;
                    com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact4 = data.getContact();
                    if (contact4 != null) {
                    }
                    com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact5 = data.getContact();
                    if (contact5 != null) {
                    }
                    if (publicProfile.getOnPersonalPublicProfile() != null) {
                    }
                    com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact6 = data.getContact();
                    if (contact6 != null) {
                    }
                    com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact7 = data.getContact();
                    return new com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile(handle, str2, str, str4, str5, num2, r11, r12, r13, r14, (contact7 != null || (relationship = contact7.getRelationship()) == null) ? false : relationship.isBlocked());
                }
                adminArea2 = addressPortableFields2.getAdminArea2();
                if (adminArea2 == null) {
                    adminArea2 = addressPortableFields2.getAdminArea1();
                }
                str5 = adminArea2;
                joinedDate = publicProfile.getJoinedDate();
                if (joinedDate != null) {
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        num = kotlin.Result.m23436constructorimpl(java.lang.Integer.valueOf(java.time.LocalDate.parse(joinedDate.toString()).getYear()));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        num = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    r5 = kotlin.Result.m23441isFailureimpl(num) ? null : num;
                }
                java.lang.Integer num22 = r5;
                com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact42 = data.getContact();
                boolean z = (contact42 != null || (relationship4 = contact42.getRelationship()) == null || relationship4.isExternalContact()) ? false : true;
                com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact52 = data.getContact();
                int intValue = (contact52 != null || (relationship3 = contact52.getRelationship()) == null || (mutualConnectionCount = relationship3.getMutualConnectionCount()) == null) ? 0 : mutualConnectionCount.intValue();
                boolean z2 = publicProfile.getOnPersonalPublicProfile() != null;
                com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact62 = data.getContact();
                boolean isFavorited = (contact62 != null || (relationship2 = contact62.getRelationship()) == null) ? false : relationship2.isFavorited();
                com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact72 = data.getContact();
                return new com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile(handle, str2, str, str4, str5, num22, z, intValue, z2, isFavorited, (contact72 != null || (relationship = contact72.getRelationship()) == null) ? false : relationship.isBlocked());
            }
            obj = profilePhotoUrl.toString();
        }
        str4 = obj;
        if (addressPortableFields != null) {
        }
        if (addressPortableFields2 != null) {
        }
    }
}
