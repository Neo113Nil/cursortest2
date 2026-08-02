package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/usecase/SendInvoiceUseCase;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;", "invoiceRepository", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceError;", "invoke", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SendInvoiceUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SendInvoiceUseCase(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository invoiceRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = invoiceRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase$invoke$1 sendInvoiceUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice copy;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase$invoke$1) {
            sendInvoiceUseCase$invoke$1 = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase$invoke$1) continuation;
            if ((sendInvoiceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                sendInvoiceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = sendInvoiceUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sendInvoiceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository invoiceRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    sendInvoiceUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = invoice;
                    sendInvoiceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = invoiceRepository.sendInvoice(invoice, sendInvoiceUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    invoice = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice) sendInvoiceUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice2 = invoice;
                either = (arrow.core.Either) obj;
                if (either instanceof arrow.core.Either.Right) {
                    if (either instanceof arrow.core.Either.Left) {
                        return either;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                copy = invoice2.copy((r18 & 1) != 0 ? invoice2.id : null, (r18 & 2) != 0 ? invoice2.currency : null, (r18 & 4) != 0 ? invoice2.customer : null, (r18 & 8) != 0 ? invoice2.status : null, (r18 & 16) != 0 ? invoice2.items : null, (r18 & 32) != 0 ? invoice2.note : null, (r18 & 64) != 0 ? invoice2.configuration : null, (r18 & 128) != 0 ? invoice2.shareUrl : (java.lang.String) ((arrow.core.Either.Right) either).getValue());
                return new arrow.core.Either.Right(copy);
            }
        }
        sendInvoiceUseCase$invoke$1 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = sendInvoiceUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sendInvoiceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice22 = invoice;
        either = (arrow.core.Either) obj2;
        if (either instanceof arrow.core.Either.Right) {
        }
    }
}
