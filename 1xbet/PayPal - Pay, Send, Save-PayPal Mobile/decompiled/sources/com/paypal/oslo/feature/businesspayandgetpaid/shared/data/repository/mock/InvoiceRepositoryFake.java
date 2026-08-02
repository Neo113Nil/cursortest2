package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/mock/InvoiceRepositoryFake;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/InvoiceRepositoryImpl;", "delegate", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/InvoiceRepositoryImpl;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceError;", "", "sendInvoice", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoiceId", "updateInvoice", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;", "getInvoiceDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sendToInvoicer", "sendReminder", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelInvoice", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceConditionalRules;", "getInvoiceConditionalRules", "getHighSpeedVideoFpsRangesFor", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/InvoiceRepositoryImpl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceRepositoryFake implements com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public InvoiceRepositoryFake(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl invoiceRepositoryImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceRepositoryImpl, "");
        this.getHighSpeedVideoFpsRangesFor = invoiceRepositoryImpl;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository
    public final java.lang.Object sendInvoice(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, java.lang.String>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.sendInvoice(invoice, continuation);
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository
    public final java.lang.Object updateInvoice(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, java.lang.String>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.updateInvoice(str, invoice, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(500, r0) != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getInvoiceDetails(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$getInvoiceDetails$1 invoiceRepositoryFake$getInvoiceDetails$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$getInvoiceDetails$1) {
            invoiceRepositoryFake$getInvoiceDetails$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$getInvoiceDetails$1) continuation;
            if ((invoiceRepositoryFake$getInvoiceDetails$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                invoiceRepositoryFake$getInvoiceDetails$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = invoiceRepositoryFake$getInvoiceDetails$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = invoiceRepositoryFake$getInvoiceDetails$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.InvoiceMockController.DEMO_INVOICE_ID)) {
                        invoiceRepositoryFake$getInvoiceDetails$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        invoiceRepositoryFake$getInvoiceDetails$1.getHighSpeedVideoFpsRangesFor = 1;
                    } else {
                        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl invoiceRepositoryImpl = this.getHighSpeedVideoFpsRangesFor;
                        invoiceRepositoryFake$getInvoiceDetails$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        invoiceRepositoryFake$getInvoiceDetails$1.getHighSpeedVideoFpsRangesFor = 2;
                        java.lang.Object invoiceDetails = invoiceRepositoryImpl.getInvoiceDetails(str, invoiceRepositoryFake$getInvoiceDetails$1);
                        if (invoiceDetails != coroutine_suspended) {
                            return invoiceDetails;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return arrow.core.EitherKt.right(getHighSpeedVideoFpsRangesFor());
            }
        }
        invoiceRepositoryFake$getInvoiceDetails$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$getInvoiceDetails$1(this, continuation);
        java.lang.Object obj2 = invoiceRepositoryFake$getInvoiceDetails$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = invoiceRepositoryFake$getInvoiceDetails$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return arrow.core.EitherKt.right(getHighSpeedVideoFpsRangesFor());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(500, r0) != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendReminder(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$sendReminder$1 invoiceRepositoryFake$sendReminder$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$sendReminder$1) {
            invoiceRepositoryFake$sendReminder$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$sendReminder$1) continuation;
            if ((invoiceRepositoryFake$sendReminder$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                invoiceRepositoryFake$sendReminder$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = invoiceRepositoryFake$sendReminder$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = invoiceRepositoryFake$sendReminder$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.InvoiceMockController.DEMO_INVOICE_ID)) {
                        invoiceRepositoryFake$sendReminder$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        invoiceRepositoryFake$sendReminder$1.getHighResolutionOutputSizeshNQ4ISI = z;
                        invoiceRepositoryFake$sendReminder$1.getHighSpeedVideoFpsRangesFor = 1;
                    } else {
                        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl invoiceRepositoryImpl = this.getHighSpeedVideoFpsRangesFor;
                        invoiceRepositoryFake$sendReminder$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        invoiceRepositoryFake$sendReminder$1.getHighResolutionOutputSizeshNQ4ISI = z;
                        invoiceRepositoryFake$sendReminder$1.getHighSpeedVideoFpsRangesFor = 2;
                        java.lang.Object sendReminder = invoiceRepositoryImpl.sendReminder(str, z, invoiceRepositoryFake$sendReminder$1);
                        if (sendReminder != coroutine_suspended) {
                            return sendReminder;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = invoiceRepositoryFake$sendReminder$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                boolean z3 = invoiceRepositoryFake$sendReminder$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                return arrow.core.EitherKt.right(getHighSpeedVideoFpsRangesFor());
            }
        }
        invoiceRepositoryFake$sendReminder$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$sendReminder$1(this, continuation);
        java.lang.Object obj2 = invoiceRepositoryFake$sendReminder$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = invoiceRepositoryFake$sendReminder$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return arrow.core.EitherKt.right(getHighSpeedVideoFpsRangesFor());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(500, r0) != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object cancelInvoice(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$cancelInvoice$1 invoiceRepositoryFake$cancelInvoice$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$cancelInvoice$1) {
            invoiceRepositoryFake$cancelInvoice$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$cancelInvoice$1) continuation;
            if ((invoiceRepositoryFake$cancelInvoice$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                invoiceRepositoryFake$cancelInvoice$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = invoiceRepositoryFake$cancelInvoice$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = invoiceRepositoryFake$cancelInvoice$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.InvoiceMockController.DEMO_INVOICE_ID)) {
                        invoiceRepositoryFake$cancelInvoice$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        invoiceRepositoryFake$cancelInvoice$1.getHighSpeedVideoSizes = z;
                        invoiceRepositoryFake$cancelInvoice$1.Camera2StreamConfigurationMap = 1;
                    } else {
                        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl invoiceRepositoryImpl = this.getHighSpeedVideoFpsRangesFor;
                        invoiceRepositoryFake$cancelInvoice$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        invoiceRepositoryFake$cancelInvoice$1.getHighSpeedVideoSizes = z;
                        invoiceRepositoryFake$cancelInvoice$1.Camera2StreamConfigurationMap = 2;
                        java.lang.Object cancelInvoice = invoiceRepositoryImpl.cancelInvoice(str, z, invoiceRepositoryFake$cancelInvoice$1);
                        if (cancelInvoice != coroutine_suspended) {
                            return cancelInvoice;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = invoiceRepositoryFake$cancelInvoice$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                boolean z3 = invoiceRepositoryFake$cancelInvoice$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                return arrow.core.EitherKt.right(getHighSpeedVideoFpsRangesFor());
            }
        }
        invoiceRepositoryFake$cancelInvoice$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$cancelInvoice$1(this, continuation);
        java.lang.Object obj2 = invoiceRepositoryFake$cancelInvoice$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = invoiceRepositoryFake$cancelInvoice$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return arrow.core.EitherKt.right(getHighSpeedVideoFpsRangesFor());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(500, r0) != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getInvoiceConditionalRules(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConditionalRules>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$getInvoiceConditionalRules$1 invoiceRepositoryFake$getInvoiceConditionalRules$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$getInvoiceConditionalRules$1) {
            invoiceRepositoryFake$getInvoiceConditionalRules$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$getInvoiceConditionalRules$1) continuation;
            if ((invoiceRepositoryFake$getInvoiceConditionalRules$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                invoiceRepositoryFake$getInvoiceConditionalRules$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = invoiceRepositoryFake$getInvoiceConditionalRules$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = invoiceRepositoryFake$getInvoiceConditionalRules$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.InvoiceMockController.DEMO_INVOICE_ID)) {
                        invoiceRepositoryFake$getInvoiceConditionalRules$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        invoiceRepositoryFake$getInvoiceConditionalRules$1.getHighSpeedVideoFpsRanges = 1;
                    } else {
                        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl invoiceRepositoryImpl = this.getHighSpeedVideoFpsRangesFor;
                        invoiceRepositoryFake$getInvoiceConditionalRules$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        invoiceRepositoryFake$getInvoiceConditionalRules$1.getHighSpeedVideoFpsRanges = 2;
                        java.lang.Object invoiceConditionalRules = invoiceRepositoryImpl.getInvoiceConditionalRules(str, invoiceRepositoryFake$getInvoiceConditionalRules$1);
                        if (invoiceConditionalRules != coroutine_suspended) {
                            return invoiceConditionalRules;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.NetworkError.INSTANCE);
            }
        }
        invoiceRepositoryFake$getInvoiceConditionalRules$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake$getInvoiceConditionalRules$1(this, continuation);
        java.lang.Object obj2 = invoiceRepositoryFake$getInvoiceConditionalRules$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = invoiceRepositoryFake$getInvoiceConditionalRules$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.NetworkError.INSTANCE);
    }

    private static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice getHighSpeedVideoFpsRangesFor() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.FIRST_YEAR, 0, 15);
        java.util.Date time = calendar.getTime();
        calendar.add(5, 30);
        kotlin.Pair pair = kotlin.TuplesKt.to(time, calendar.getTime());
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice(com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.InvoiceMockController.DEMO_INVOICE_ID, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.SENT, new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount(new java.math.BigDecimal("3780.00"), "USD"), new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount(new java.math.BigDecimal("3780.00"), "USD"), new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount(new java.math.BigDecimal("3500.00"), "USD"), null, new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount(new java.math.BigDecimal("280.00"), "USD"), null, null), new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceDetail("USD", "INV-2025-001", (java.util.Date) pair.component1(), "Thank you for your business!", new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm((java.util.Date) pair.component2())), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName("Sarah", "Johnson"), "sarah.johnson@example.com", kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber("1", "(555) 123-4567"))))), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item[]{new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item("Website Design", "1", com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrThrow("2500.00", "USD"), null, null, null), new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item("Logo Design", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrThrow("500.00", "USD"), null, null, null)}), null, null, null, null, "https://www.paypal.com/invoice/p/#DEMO-INV-001");
    }
}
