package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "url", "expirationTime", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;", "mapPaymentLink", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentLinkMappingKt {
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentLink mapPaymentLink(java.lang.Object obj, java.lang.Object obj2) {
        java.time.Instant parse;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        if (obj2 instanceof java.time.Instant) {
            parse = (java.time.Instant) obj2;
        } else {
            parse = obj2 instanceof java.lang.String ? java.time.Instant.parse((java.lang.CharSequence) obj2) : java.time.Instant.parse(obj2.toString());
        }
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(parse);
        return new com.paypal.oslo.feature.p2p.domain.model.PaymentLink(str, parse);
    }
}
