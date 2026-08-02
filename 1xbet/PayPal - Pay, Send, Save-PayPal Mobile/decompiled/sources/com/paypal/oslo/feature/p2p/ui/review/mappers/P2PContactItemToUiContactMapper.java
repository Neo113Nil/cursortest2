package com.paypal.oslo.feature.p2p.ui.review.mappers;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/mappers/P2PContactItemToUiContactMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/UiContact;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;)Lcom/paypal/oslo/feature/p2p/ui/success/state/UiContact;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class P2PContactItemToUiContactMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, com.paypal.oslo.feature.p2p.ui.success.state.UiContact> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public P2PContactItemToUiContactMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.ui.success.state.UiContact map(com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String id = input.getId();
        java.lang.String firstName = input.getFirstName();
        java.lang.String lastName = input.getLastName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (firstName == null) {
            firstName = "";
        }
        sb.append(kotlin.text.StringsKt.trim(firstName).toString());
        sb.append(" ");
        sb.append(kotlin.text.StringsKt.trim(lastName != null ? lastName : "").toString());
        return new com.paypal.oslo.feature.p2p.ui.success.state.UiContact(id, kotlin.text.StringsKt.trim(sb.toString()).toString(), null, input.getPhoneNumber(), input.getEmail(), input.getAvatarUrl(), false, com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ContactDisplayHelpersKt.getInitials(input.getFirstName(), input.getLastName()));
    }
}
