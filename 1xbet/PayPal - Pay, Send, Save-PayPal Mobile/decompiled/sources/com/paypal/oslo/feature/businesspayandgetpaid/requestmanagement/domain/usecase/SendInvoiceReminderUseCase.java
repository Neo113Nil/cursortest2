package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/SendInvoiceReminderUseCase;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;", "invoiceRepository", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;)V", "", "invoiceId", "", "sendToInvoicer", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;", "invoke", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SendInvoiceReminderUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SendInvoiceReminderUseCase(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository invoiceRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceRepository, "");
        this.Camera2StreamConfigurationMap = invoiceRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice>> continuation) {
        if (kotlin.text.StringsKt.isBlank(str)) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.ValidationError("Purchase ID must not be blank", "invoiceId"));
        }
        return this.Camera2StreamConfigurationMap.sendReminder(str, z, continuation);
    }
}
