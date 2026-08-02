package com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/ProcessZettleResultUseCase;", "", "<init>", "()V", "", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult;", "invoke", "(ILandroid/content/Intent;)Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProcessZettleResultUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ProcessZettleResultUseCase() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult invoke(int resultCode, android.content.Intent data) {
        if (resultCode != -1) {
            return com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Cancelled.INSTANCE;
        }
        java.lang.String str = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        java.lang.Object[] objArr6 = 0;
        java.lang.Object[] objArr7 = 0;
        com.zettle.sdk.ui.ZettleResult zettleResult = data != null ? com.zettle.sdk.ui.ZettleResultKt.zettleResult(data) : null;
        int i = 3;
        if (zettleResult == null) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure(str, objArr7 == true ? 1 : 0, i, objArr6 == true ? 1 : 0);
        }
        if (zettleResult instanceof com.zettle.sdk.ui.ZettleResult.Completed) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Success(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload.INSTANCE.fromResultPayload(com.zettle.sdk.feature.taptopay.ui.TapToPayAction.INSTANCE.fromPaymentResult((com.zettle.sdk.ui.ZettleResult.Completed) zettleResult).getPayload()));
        }
        if (zettleResult instanceof com.zettle.sdk.ui.ZettleResult.Failed) {
            com.zettle.sdk.ui.ZettleResult.Failed failed = (com.zettle.sdk.ui.ZettleResult.Failed) zettleResult;
            com.zettle.sdk.ui.FailureReason reason = failed.getReason();
            com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason tapToPayFailureReason = reason instanceof com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason ? (com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason) reason : null;
            if (tapToPayFailureReason instanceof com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum) {
                return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure(((com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum) tapToPayFailureReason).toString(), com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.ABOVE_MAXIMUM);
            }
            if (tapToPayFailureReason instanceof com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.BelowMinimum) {
                return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure(((com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.BelowMinimum) tapToPayFailureReason).toString(), com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.BELOW_MINIMUM);
            }
            if (tapToPayFailureReason instanceof com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByUser) {
                return com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.CancelledByUser.INSTANCE;
            }
            return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure(failed.getReason().toString(), objArr5 == true ? 1 : 0, 2, objArr4 == true ? 1 : 0);
        }
        if (zettleResult instanceof com.zettle.sdk.ui.ZettleResult.Cancelled) {
            return com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Cancelled.INSTANCE;
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
    }
}
