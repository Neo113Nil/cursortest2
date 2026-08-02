package com.paypal.oslo.feature.p2p.ui.review.mappers;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/mappers/PaymentTransferResultToSuccessDestinationMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;", "result", "Lcom/paypal/oslo/feature/p2p/ui/success/state/UiContact;", "uiContact", "", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "Lcom/paypal/oslo/feature/p2p/navigation/SuccessDestination;", "map", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;Lcom/paypal/oslo/feature/p2p/ui/success/state/UiContact;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/navigation/SuccessDestination;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentTransferResultToSuccessDestinationMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PaymentTransferResultToSuccessDestinationMapper() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.navigation.SuccessDestination map$default(com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTransferResultToSuccessDestinationMapper paymentTransferResultToSuccessDestinationMapper, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult paymentTransferResult, com.paypal.oslo.feature.p2p.ui.success.state.UiContact uiContact, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return paymentTransferResultToSuccessDestinationMapper.map(paymentTransferResult, uiContact, str);
    }

    public final com.paypal.oslo.feature.p2p.navigation.SuccessDestination map(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult result, com.paypal.oslo.feature.p2p.ui.success.state.UiContact uiContact, java.lang.String note) {
        com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink uiPaymentLink;
        com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink uiPaymentLink2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (!(result instanceof com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send)) {
            if (!(result instanceof com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request request = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request) result;
            com.paypal.oslo.feature.p2p.ui.success.state.FlowType flowType = request.getPaymentLink() != null ? com.paypal.oslo.feature.p2p.ui.success.state.FlowType.PAYPAL_LINK : com.paypal.oslo.feature.p2p.ui.success.state.FlowType.REQUEST_MONEY;
            com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink = request.getPaymentLink();
            if (paymentLink != null) {
                java.lang.String url = paymentLink.getUrl();
                java.lang.String instant = paymentLink.getExpirationTime().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(instant, "");
                uiPaymentLink = new com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink(url, instant, false);
            } else {
                uiPaymentLink = null;
            }
            return new com.paypal.oslo.feature.p2p.navigation.SuccessDestination(flowType, request.getAmount().getAmount(), request.getAmount().getCurrency(), null, uiContact, null, note, uiPaymentLink);
        }
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send send = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send) result;
        com.paypal.oslo.feature.p2p.ui.success.state.FlowType flowType2 = send.getPaymentLink() != null ? com.paypal.oslo.feature.p2p.ui.success.state.FlowType.PAYPAL_LINK : com.paypal.oslo.feature.p2p.ui.success.state.FlowType.SEND_MONEY;
        com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink2 = send.getPaymentLink();
        if (paymentLink2 != null) {
            java.lang.String url2 = paymentLink2.getUrl();
            java.lang.String instant2 = paymentLink2.getExpirationTime().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(instant2, "");
            uiPaymentLink2 = new com.paypal.oslo.feature.p2p.ui.success.state.UiPaymentLink(url2, instant2, true);
        } else {
            uiPaymentLink2 = null;
        }
        return new com.paypal.oslo.feature.p2p.navigation.SuccessDestination(flowType2, send.getAmount().getAmount(), send.getAmount().getCurrency(), uiContact, (com.paypal.oslo.feature.p2p.ui.success.state.UiContact) null, (com.paypal.oslo.feature.p2p.ui.success.state.MediaState) null, note, uiPaymentLink2, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
