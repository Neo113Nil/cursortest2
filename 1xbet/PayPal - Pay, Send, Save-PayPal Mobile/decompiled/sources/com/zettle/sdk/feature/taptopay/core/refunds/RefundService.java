package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bJ?\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n0\u0006H&¢\u0006\u0004\b\f\u0010\rJG\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n0\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n0\u0006H&¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundService;", "", "Lcom/zettle/sdk/commons/network/NetworkClient;", "networkClient", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "cardPayload", "Lkotlin/Function1;", "Lcom/izettle/android/core/data/result/Result;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/CheckRefundableResult;", "", "", com.sun.jna.Callback.METHOD_NAME, "checkRefundable", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;Lkotlin/jvm/functions/Function1;)V", "", "request", "", "amount", "Lcom/zettle/sdk/feature/taptopay/core/refunds/DoRefundResult;", "refund", "(Lcom/zettle/sdk/commons/network/NetworkClient;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V", "paymentReferenceId", "Ljava/util/Currency;", "currency", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RetrievePaymentResult;", "retrievePayment", "(Lcom/zettle/sdk/commons/network/NetworkClient;Ljava/lang/String;Ljava/util/Currency;Lkotlin/jvm/functions/Function1;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RefundService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.refunds.RefundService.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.refunds.RefundService.Companion.getHighSpeedVideoFpsRanges;

    void checkRefundable(com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPayload, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult, ? extends java.lang.Throwable>, kotlin.Unit> callback);

    void refund(com.zettle.sdk.commons.network.NetworkClient networkClient, java.lang.String request, long amount, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult, ? extends java.lang.Throwable>, kotlin.Unit> callback);

    void retrievePayment(com.zettle.sdk.commons.network.NetworkClient networkClient, java.lang.String paymentReferenceId, java.util.Currency currency, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult, ? extends java.lang.Throwable>, kotlin.Unit> callback);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundService$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.RefundService.Companion getHighSpeedVideoFpsRanges = new com.zettle.sdk.feature.taptopay.core.refunds.RefundService.Companion();

        private Companion() {
        }
    }
}
