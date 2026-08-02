package com.paypal.oslo.feature.p2p.ui.review.models;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "getReceiverIdAndType", "(Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;)Lkotlin/Pair;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class P2PContactItemKt {
    public static final kotlin.Pair<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.ReceiverType> getReceiverIdAndType(com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PContactItem, "");
        java.lang.String email = p2PContactItem.getEmail();
        if (email != null && email.length() != 0) {
            return kotlin.TuplesKt.to(p2PContactItem.getEmail(), com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS);
        }
        java.lang.String phoneNumber = p2PContactItem.getPhoneNumber();
        return (phoneNumber == null || phoneNumber.length() == 0) ? kotlin.TuplesKt.to(p2PContactItem.getId(), com.paypal.oslo.feature.p2p.domain.model.ReceiverType.PEER_ID) : kotlin.TuplesKt.to(p2PContactItem.getPhoneNumber(), com.paypal.oslo.feature.p2p.domain.model.ReceiverType.PHONE_NUMBER);
    }
}
