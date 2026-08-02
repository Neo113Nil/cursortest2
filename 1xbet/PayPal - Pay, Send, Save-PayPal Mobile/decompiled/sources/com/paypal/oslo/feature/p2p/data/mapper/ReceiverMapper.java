package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/ReceiverMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Receiver;", "Lcom/paypal/oslo/feature/p2p/domain/model/Receiver;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Receiver;)Lcom/paypal/oslo/feature/p2p/domain/model/Receiver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReceiverMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver, com.paypal.oslo.feature.p2p.domain.model.Receiver> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ReceiverMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.Receiver map(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver input) {
        com.paypal.oslo.feature.p2p.domain.model.ReceiverName.Unknown unknown;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 name2 = input.getName();
        if ((name2 != null ? name2.getOnPersonName() : null) != null) {
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 onPersonName = name2.getOnPersonName();
            unknown = new com.paypal.oslo.feature.p2p.domain.model.ReceiverName.PersonName(onPersonName.getGivenName(), onPersonName.getSurname(), onPersonName.getPrefix(), onPersonName.getMiddleName(), onPersonName.getSuffix(), onPersonName.getFullName());
        } else {
            if ((name2 != null ? name2.getOnBusinessName() : null) != null) {
                java.lang.String businessName = name2.getOnBusinessName().getBusinessName();
                com.paypal.oslo.api.graphql.schema.type.Orthography orthography = name2.getOnBusinessName().getOrthography();
                unknown = new com.paypal.oslo.feature.p2p.domain.model.ReceiverName.BusinessName(businessName, orthography != null ? orthography.name() : null);
            } else {
                unknown = com.paypal.oslo.feature.p2p.domain.model.ReceiverName.Unknown.INSTANCE;
            }
        }
        java.lang.String obj = input.getId().toString();
        java.lang.String accountId = input.getAccountId();
        java.lang.String obj2 = accountId != null ? accountId.toString() : null;
        java.lang.Object profilePhotoUrl = input.getProfilePhotoUrl();
        return new com.paypal.oslo.feature.p2p.domain.model.Receiver(obj, obj2, unknown, profilePhotoUrl != null ? profilePhotoUrl.toString() : null);
    }
}
