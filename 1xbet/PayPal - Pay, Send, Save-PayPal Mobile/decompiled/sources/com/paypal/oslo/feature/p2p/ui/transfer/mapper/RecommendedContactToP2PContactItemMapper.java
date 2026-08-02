package com.paypal.oslo.feature.p2p.ui.transfer.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/mapper/RecommendedContactToP2PContactItemMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/domain/model/RecommendedContact;", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/domain/model/RecommendedContact;)Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RecommendedContactToP2PContactItemMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.domain.model.RecommendedContact, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RecommendedContactToP2PContactItemMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem map(com.paypal.oslo.feature.p2p.domain.model.RecommendedContact input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String firstName = input.getFirstName();
        if (firstName == null) {
            firstName = input.getDisplayName();
        }
        return new com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem(input.getId(), firstName, input.getLastName(), null, null, input.getProfilePhotoUrl(), false, null, null, com.paypal.oslo.feature.contacts.api.ContactActionType.Info, input.isPersonal() ? com.paypal.oslo.feature.contacts.api.ContactNameType.PERSON : com.paypal.oslo.feature.contacts.api.ContactNameType.BUSINESS, null, null, null, input.isBlocked(), input.isFavorite(), false, 0, input.getAccountId(), 211392, null);
    }
}
