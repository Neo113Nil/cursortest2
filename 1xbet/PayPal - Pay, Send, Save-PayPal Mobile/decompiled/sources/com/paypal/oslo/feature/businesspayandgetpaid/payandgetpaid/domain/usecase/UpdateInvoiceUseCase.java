package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/usecase/UpdateInvoiceUseCase;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;", "invoiceRepository", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;)V", "", "invoiceId", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceError;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpdateInvoiceUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public UpdateInvoiceUseCase(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository invoiceRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceRepository, "");
        this.getHighSpeedVideoFpsRanges = invoiceRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase$invoke$1 updateInvoiceUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice copy;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice2 = invoice;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase$invoke$1) {
            updateInvoiceUseCase$invoke$1 = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase$invoke$1) continuation;
            if ((updateInvoiceUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                updateInvoiceUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = updateInvoiceUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updateInvoiceUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository invoiceRepository = this.getHighSpeedVideoFpsRanges;
                    updateInvoiceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    updateInvoiceUseCase$invoke$1.Camera2StreamConfigurationMap = invoice2;
                    updateInvoiceUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = invoiceRepository.updateInvoice(str, invoice2, updateInvoiceUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    invoice2 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice) updateInvoiceUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice3 = invoice2;
                either = (arrow.core.Either) obj;
                if (either instanceof arrow.core.Either.Right) {
                    if (either instanceof arrow.core.Either.Left) {
                        return either;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                copy = invoice3.copy((r18 & 1) != 0 ? invoice3.id : null, (r18 & 2) != 0 ? invoice3.currency : null, (r18 & 4) != 0 ? invoice3.customer : null, (r18 & 8) != 0 ? invoice3.status : null, (r18 & 16) != 0 ? invoice3.items : null, (r18 & 32) != 0 ? invoice3.note : null, (r18 & 64) != 0 ? invoice3.configuration : null, (r18 & 128) != 0 ? invoice3.shareUrl : (java.lang.String) ((arrow.core.Either.Right) either).getValue());
                return new arrow.core.Either.Right(copy);
            }
        }
        updateInvoiceUseCase$invoke$1 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = updateInvoiceUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updateInvoiceUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice32 = invoice2;
        either = (arrow.core.Either) obj2;
        if (either instanceof arrow.core.Either.Right) {
        }
    }
}
