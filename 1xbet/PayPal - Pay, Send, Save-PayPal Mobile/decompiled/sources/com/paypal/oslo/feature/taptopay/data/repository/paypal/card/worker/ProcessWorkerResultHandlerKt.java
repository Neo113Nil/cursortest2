package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProcessWorkerResultHandlerKt {
    public static final /* synthetic */ java.lang.String access$toLogString(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessWorkerResultHandler processWorkerResultHandler) {
        if (processWorkerResultHandler instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyAddCardResultHandler) {
            return "ProcessNotifyAddCardResultHandler";
        }
        if (processWorkerResultHandler instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyDeleteCardResultHandler) {
            return "ProcessNotifyDeleteCardResultHandler";
        }
        if (processWorkerResultHandler instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifySuspendCardResultHandler) {
            return "ProcessNotifySuspendCardResultHandler";
        }
        if (processWorkerResultHandler instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyResumeCardResultHandler) {
            return "ProcessNotifyResumeCardResultHandler";
        }
        if (processWorkerResultHandler instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyUpdateCardResultHandler) {
            return "ProcessNotifyUpdateCardResultHandler";
        }
        if (processWorkerResultHandler instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessUploadTnCResultHandler) {
            return "ProcessUploadTnCResultHandler";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
