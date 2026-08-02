package com.paypal.oslo.feature.identity.accountswitch.data.mapper;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0000¢\u0006\u0004\b\u0002\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$LinkedAuthenticationProfiles;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccountSwitchResponse;", "toDomain", "(Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$LinkedAuthenticationProfiles;)Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccountSwitchResponse;", "Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Item;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;", "(Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Item;)Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;", "Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileOptionType;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/ProfileOptionType;", "(Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileOptionType;)Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/ProfileOptionType;", "Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileContentType;", "Lcom/paypal/oslo/feature/identity/api/accountswitch/domain/model/LinkProfileOptionType;", "(Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileContentType;)Lcom/paypal/oslo/feature/identity/api/accountswitch/domain/model/LinkProfileOptionType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserAccountSwitchMapperKt {
    public static final com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse toDomain(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedAuthenticationProfiles, "");
        java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item> items = linkedAuthenticationProfiles.getPage().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain((com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption> profileOptions = linkedAuthenticationProfiles.getProfileOptions();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it2 = profileOptions.iterator();
        while (it2.hasNext()) {
            com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType domain = toDomain(((com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption) it2.next()).getType());
            if (domain != null) {
                arrayList3.add(domain);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption> linkProfileOptions = linkedAuthenticationProfiles.getLinkProfileOptions();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator<T> it3 = linkProfileOptions.iterator();
        while (it3.hasNext()) {
            com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType type = ((com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption) it3.next()).getType();
            com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType domain2 = type != null ? toDomain(type) : null;
            if (domain2 != null) {
                arrayList5.add(domain2);
            }
        }
        return new com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse(arrayList2, arrayList4, arrayList5);
    }

    public static final com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount toDomain(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        java.lang.String partyId = item.getPartyId();
        java.lang.String fullName = item.getFullName();
        java.lang.String str = fullName == null ? "" : fullName;
        java.lang.String emailAddress = item.getEmailAddress();
        java.lang.String str2 = emailAddress == null ? "" : emailAddress;
        java.lang.Object profilePicture = item.getProfilePicture();
        return new com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount(partyId, str, str2, profilePicture != null ? profilePicture.toString() : null, item.isBusinessProfile(), item.isActive());
    }

    public static final com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType toDomain(com.paypal.oslo.api.graphql.schema.type.LinkedProfileOptionType linkedProfileOptionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedProfileOptionType, "");
        int i = com.paypal.oslo.feature.identity.accountswitch.data.mapper.UserAccountSwitchMapperKt.WhenMappings.$EnumSwitchMapping$0[linkedProfileOptionType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType.ADD_PROFILE;
        }
        if (i != 2) {
            return null;
        }
        return com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType.UNLINK_PROFILE;
    }

    public static final com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType toDomain(com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType linkedProfileContentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedProfileContentType, "");
        int i = com.paypal.oslo.feature.identity.accountswitch.data.mapper.UserAccountSwitchMapperKt.WhenMappings.$EnumSwitchMapping$1[linkedProfileContentType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType.LINK_PERSONAL;
        }
        if (i != 2) {
            return null;
        }
        return com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType.LINK_BUSINESS;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.LinkedProfileOptionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.LinkedProfileOptionType.ADD_PROFILE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.LinkedProfileOptionType.UNLINK_PROFILE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType.LINK_PERSONAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType.LINK_BUSINESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
