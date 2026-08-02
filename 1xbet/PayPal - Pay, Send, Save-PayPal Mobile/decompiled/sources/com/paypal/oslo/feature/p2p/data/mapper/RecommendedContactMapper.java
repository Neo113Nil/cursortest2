package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/RecommendedContactMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptAmountAndIntentMutation$RecommendedContact;", "Lcom/paypal/oslo/feature/p2p/domain/model/RecommendedContact;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptAmountAndIntentMutation$RecommendedContact;)Lcom/paypal/oslo/feature/p2p/domain/model/RecommendedContact;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RecommendedContactMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.RecommendedContact, com.paypal.oslo.feature.p2p.domain.model.RecommendedContact> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RecommendedContactMapper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.p2p.domain.model.RecommendedContact map(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.RecommendedContact input) {
        java.lang.String str;
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.OnBusinessName onBusinessName;
        com.paypal.oslo.api.graphql.schema.type.Orthography orthography;
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.OnPersonName onPersonName;
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.OnPersonName onPersonName2;
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.OnPersonName onPersonName3;
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.OnPersonName onPersonName4;
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.OnPersonName onPersonName5;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.Name name2 = input.getName();
        boolean z = (name2 != null ? name2.getOnPersonName() : null) != null;
        if ((name2 != null ? name2.getOnPersonName() : null) != null) {
            java.lang.String fullName = name2.getOnPersonName().getFullName();
            if (fullName == null) {
                java.lang.String prefix = name2.getOnPersonName().getPrefix();
                java.lang.String givenName = name2.getOnPersonName().getGivenName();
                java.lang.String middleName = name2.getOnPersonName().getMiddleName();
                java.lang.String surname = name2.getOnPersonName().getSurname();
                java.lang.String suffix = name2.getOnPersonName().getSuffix();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (prefix != null) {
                    arrayList.add(prefix);
                }
                if (givenName != null) {
                    arrayList.add(givenName);
                }
                if (middleName != null) {
                    arrayList.add(middleName);
                }
                if (surname != null) {
                    arrayList.add(surname);
                }
                java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, null, 62, null);
                java.lang.String str3 = joinToString$default;
                if (str3.length() > 0 && suffix != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(joinToString$default);
                    sb.append(", ");
                    sb.append(suffix);
                    str2 = sb.toString();
                } else if (str3.length() > 0) {
                    str2 = joinToString$default;
                }
            } else {
                str = fullName;
                java.lang.String givenName2 = (name2 != null || (onPersonName5 = name2.getOnPersonName()) == null) ? null : onPersonName5.getGivenName();
                java.lang.String surname2 = (name2 != null || (onPersonName4 = name2.getOnPersonName()) == null) ? null : onPersonName4.getSurname();
                java.lang.String prefix2 = (name2 != null || (onPersonName3 = name2.getOnPersonName()) == null) ? null : onPersonName3.getPrefix();
                java.lang.String middleName2 = (name2 != null || (onPersonName2 = name2.getOnPersonName()) == null) ? null : onPersonName2.getMiddleName();
                java.lang.String suffix2 = (name2 != null || (onPersonName = name2.getOnPersonName()) == null) ? null : onPersonName.getSuffix();
                java.lang.String name3 = (name2 != null || (onBusinessName = name2.getOnBusinessName()) == null || (orthography = onBusinessName.getOrthography()) == null) ? null : orthography.name();
                java.lang.String id = input.getId();
                java.lang.String accountId = input.getAccountId();
                java.lang.String obj = accountId == null ? accountId.toString() : null;
                java.lang.Object profilePhotoUrl = input.getProfilePhotoUrl();
                return new com.paypal.oslo.feature.p2p.domain.model.RecommendedContact(id, obj, str, givenName2, surname2, prefix2, middleName2, suffix2, name3, profilePhotoUrl != null ? profilePhotoUrl.toString() : null, z, input.getFavorite(), input.getBlocked());
            }
        } else {
            if ((name2 != null ? name2.getOnBusinessName() : null) != null) {
                str2 = name2.getOnBusinessName().getBusinessName();
            }
        }
        str = str2;
        if (name2 != null) {
        }
        if (name2 != null) {
        }
        if (name2 != null) {
        }
        if (name2 != null) {
        }
        if (name2 != null) {
        }
        if (name2 != null) {
        }
        java.lang.String id2 = input.getId();
        java.lang.String accountId2 = input.getAccountId();
        if (accountId2 == null) {
        }
        java.lang.Object profilePhotoUrl2 = input.getProfilePhotoUrl();
        return new com.paypal.oslo.feature.p2p.domain.model.RecommendedContact(id2, obj, str, givenName2, surname2, prefix2, middleName2, suffix2, name3, profilePhotoUrl2 != null ? profilePhotoUrl2.toString() : null, z, input.getFavorite(), input.getBlocked());
    }
}
