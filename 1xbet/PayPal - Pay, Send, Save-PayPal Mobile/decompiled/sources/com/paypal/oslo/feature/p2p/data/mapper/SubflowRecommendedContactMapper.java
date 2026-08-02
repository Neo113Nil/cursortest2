package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowRecommendedContactMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$RecommendedContact;", "Lcom/paypal/oslo/feature/p2p/domain/model/RecommendedContact;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$RecommendedContact;)Lcom/paypal/oslo/feature/p2p/domain/model/RecommendedContact;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubflowRecommendedContactMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.RecommendedContact, com.paypal.oslo.feature.p2p.domain.model.RecommendedContact> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SubflowRecommendedContactMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.RecommendedContact map(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.RecommendedContact input) {
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBusinessName onBusinessName;
        com.paypal.oslo.api.graphql.schema.type.Orthography orthography;
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName onPersonName;
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName onPersonName2;
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName onPersonName3;
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName onPersonName4;
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName onPersonName5;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name name2 = input.getName();
        boolean z = (name2 != null ? name2.getOnPersonName() : null) != null;
        if ((name2 != null ? name2.getOnPersonName() : null) != null) {
            str = name2.getOnPersonName().getFullName();
            if (str == null) {
                str = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{name2.getOnPersonName().getPrefix(), name2.getOnPersonName().getGivenName(), name2.getOnPersonName().getMiddleName(), name2.getOnPersonName().getSurname()}), " ", null, null, 0, null, null, 62, null);
                java.lang.String suffix = name2.getOnPersonName().getSuffix();
                if (str.length() > 0 && suffix != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str);
                    sb.append(", ");
                    sb.append(suffix);
                    str = sb.toString();
                }
            }
        } else {
            if ((name2 != null ? name2.getOnBusinessName() : null) != null) {
                str = name2.getOnBusinessName().getBusinessName();
            }
        }
        java.lang.String str2 = str;
        java.lang.String id = input.getId();
        java.lang.String accountId = input.getAccountId();
        java.lang.String obj = accountId != null ? accountId.toString() : null;
        java.lang.String givenName = (name2 == null || (onPersonName5 = name2.getOnPersonName()) == null) ? null : onPersonName5.getGivenName();
        java.lang.String surname = (name2 == null || (onPersonName4 = name2.getOnPersonName()) == null) ? null : onPersonName4.getSurname();
        java.lang.String prefix = (name2 == null || (onPersonName3 = name2.getOnPersonName()) == null) ? null : onPersonName3.getPrefix();
        java.lang.String middleName = (name2 == null || (onPersonName2 = name2.getOnPersonName()) == null) ? null : onPersonName2.getMiddleName();
        java.lang.String suffix2 = (name2 == null || (onPersonName = name2.getOnPersonName()) == null) ? null : onPersonName.getSuffix();
        java.lang.String name3 = (name2 == null || (onBusinessName = name2.getOnBusinessName()) == null || (orthography = onBusinessName.getOrthography()) == null) ? null : orthography.name();
        java.lang.Object profilePhotoUrl = input.getProfilePhotoUrl();
        return new com.paypal.oslo.feature.p2p.domain.model.RecommendedContact(id, obj, str2, givenName, surname, prefix, middleName, suffix2, name3, profilePhotoUrl != null ? profilePhotoUrl.toString() : null, z, input.getFavorite(), input.getBlocked());
    }
}
