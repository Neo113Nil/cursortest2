package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/mock/PurchaseRepositoryFake;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/PurchaseRepository;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/PurchaseRepositoryImpl;", "delegate", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/PurchaseRepositoryImpl;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;", "paymentRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/PurchaseError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/PurchaseCreated;", "createPurchase", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "purchaseId", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/UpdatePurchaseData;", "updateData", "", "patchPurchase", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/UpdatePurchaseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedPurchase;", "getPurchaseDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toEmail", "sendReceipt", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refundPurchase", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/PurchaseRepositoryImpl;", "getHighSpeedVideoFpsRanges", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PurchaseRepositoryFake implements com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PurchaseRepositoryFake(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl purchaseRepositoryImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseRepositoryImpl, "");
        this.getHighSpeedVideoFpsRanges = purchaseRepositoryImpl;
        this.getHighSpeedVideoSizes = com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.DemoPurchaseDataKt.buildDemoPurchases();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createPurchase(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$createPurchase$1 purchaseRepositoryFake$createPurchase$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$createPurchase$1) {
            purchaseRepositoryFake$createPurchase$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$createPurchase$1) continuation;
            if ((purchaseRepositoryFake$createPurchase$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                purchaseRepositoryFake$createPurchase$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = purchaseRepositoryFake$createPurchase$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purchaseRepositoryFake$createPurchase$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    purchaseRepositoryFake$createPurchase$1.getHighSpeedVideoSizes = paymentRequest;
                    purchaseRepositoryFake$createPurchase$1.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, purchaseRepositoryFake$createPurchase$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    paymentRequest = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest) purchaseRepositoryFake$createPurchase$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                long longAmount$default = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequestKt.toLongAmount$default(paymentRequest, null, 1, null);
                java.lang.String obj2 = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                return arrow.core.EitherKt.right(new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated(obj2, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequestKt.asCurrency(longAmount$default, paymentRequest.getCurrencyCode()), paymentRequest.getCurrencyCode())));
            }
        }
        purchaseRepositoryFake$createPurchase$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$createPurchase$1(this, continuation);
        java.lang.Object obj3 = purchaseRepositoryFake$createPurchase$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseRepositoryFake$createPurchase$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        long longAmount$default2 = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequestKt.toLongAmount$default(paymentRequest, null, 1, null);
        java.lang.String obj22 = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj22, "");
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated(obj22, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequestKt.asCurrency(longAmount$default2, paymentRequest.getCurrencyCode()), paymentRequest.getCurrencyCode())));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object patchPurchase(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.UpdatePurchaseData updatePurchaseData, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$patchPurchase$1 purchaseRepositoryFake$patchPurchase$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$patchPurchase$1) {
            purchaseRepositoryFake$patchPurchase$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$patchPurchase$1) continuation;
            if ((purchaseRepositoryFake$patchPurchase$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                purchaseRepositoryFake$patchPurchase$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = purchaseRepositoryFake$patchPurchase$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purchaseRepositoryFake$patchPurchase$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    purchaseRepositoryFake$patchPurchase$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    purchaseRepositoryFake$patchPurchase$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePurchaseData);
                    purchaseRepositoryFake$patchPurchase$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, purchaseRepositoryFake$patchPurchase$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
            }
        }
        purchaseRepositoryFake$patchPurchase$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$patchPurchase$1(this, continuation);
        java.lang.Object obj2 = purchaseRepositoryFake$patchPurchase$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseRepositoryFake$patchPurchase$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPurchaseDetails(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$getPurchaseDetails$1 purchaseRepositoryFake$getPurchaseDetails$1;
        int i;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase fetchedPurchase;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$getPurchaseDetails$1) {
            purchaseRepositoryFake$getPurchaseDetails$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$getPurchaseDetails$1) continuation;
            if ((purchaseRepositoryFake$getPurchaseDetails$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                purchaseRepositoryFake$getPurchaseDetails$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = purchaseRepositoryFake$getPurchaseDetails$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purchaseRepositoryFake$getPurchaseDetails$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase fetchedPurchase2 = this.getHighSpeedVideoSizes.get(str);
                    if (fetchedPurchase2 != null) {
                        purchaseRepositoryFake$getPurchaseDetails$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        purchaseRepositoryFake$getPurchaseDetails$1.getHighResolutionOutputSizeshNQ4ISI = fetchedPurchase2;
                        purchaseRepositoryFake$getPurchaseDetails$1.Camera2StreamConfigurationMap = 1;
                        if (kotlinx.coroutines.DelayKt.delay(500L, purchaseRepositoryFake$getPurchaseDetails$1) != coroutine_suspended) {
                            fetchedPurchase = fetchedPurchase2;
                        }
                    } else {
                        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl purchaseRepositoryImpl = this.getHighSpeedVideoFpsRanges;
                        purchaseRepositoryFake$getPurchaseDetails$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        purchaseRepositoryFake$getPurchaseDetails$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchedPurchase2);
                        purchaseRepositoryFake$getPurchaseDetails$1.Camera2StreamConfigurationMap = 2;
                        java.lang.Object purchaseDetails = purchaseRepositoryImpl.getPurchaseDetails(str, purchaseRepositoryFake$getPurchaseDetails$1);
                        if (purchaseDetails != coroutine_suspended) {
                            return purchaseDetails;
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
                fetchedPurchase = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase) purchaseRepositoryFake$getPurchaseDetails$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                if (!com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.PurchaseMockController.INSTANCE.getSimulateLoadError()) {
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.NetworkError("Simulated load error", null, 2, null));
                }
                return arrow.core.EitherKt.right(fetchedPurchase);
            }
        }
        purchaseRepositoryFake$getPurchaseDetails$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$getPurchaseDetails$1(this, continuation);
        java.lang.Object obj2 = purchaseRepositoryFake$getPurchaseDetails$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseRepositoryFake$getPurchaseDetails$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        if (!com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.PurchaseMockController.INSTANCE.getSimulateLoadError()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendReceipt(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$sendReceipt$1 purchaseRepositoryFake$sendReceipt$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$sendReceipt$1) {
            purchaseRepositoryFake$sendReceipt$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$sendReceipt$1) continuation;
            if ((purchaseRepositoryFake$sendReceipt$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                purchaseRepositoryFake$sendReceipt$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = purchaseRepositoryFake$sendReceipt$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purchaseRepositoryFake$sendReceipt$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    purchaseRepositoryFake$sendReceipt$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    purchaseRepositoryFake$sendReceipt$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    purchaseRepositoryFake$sendReceipt$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, purchaseRepositoryFake$sendReceipt$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.PurchaseMockController.INSTANCE.getSimulateSendReceiptError()) {
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.NetworkError("Simulated send receipt error", null, 2, null));
                }
                return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
            }
        }
        purchaseRepositoryFake$sendReceipt$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$sendReceipt$1(this, continuation);
        java.lang.Object obj2 = purchaseRepositoryFake$sendReceipt$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseRepositoryFake$sendReceipt$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (!com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.PurchaseMockController.INSTANCE.getSimulateSendReceiptError()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(500, r2) != r3) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object refundPurchase(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$refundPurchase$1 purchaseRepositoryFake$refundPurchase$1;
        int i;
        java.lang.String str2;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase fetchedPurchase;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$refundPurchase$1) {
            purchaseRepositoryFake$refundPurchase$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$refundPurchase$1) continuation;
            if ((purchaseRepositoryFake$refundPurchase$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                purchaseRepositoryFake$refundPurchase$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = purchaseRepositoryFake$refundPurchase$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purchaseRepositoryFake$refundPurchase$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = str;
                    purchaseRepositoryFake$refundPurchase$1.getHighSpeedVideoFpsRangesFor = str2;
                    purchaseRepositoryFake$refundPurchase$1.getHighSpeedVideoSizes = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    java.lang.String str3 = (java.lang.String) purchaseRepositoryFake$refundPurchase$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = str3;
                }
                fetchedPurchase = this.getHighSpeedVideoSizes.get(str2);
                if (fetchedPurchase == null) {
                    if (com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.PurchaseMockController.INSTANCE.getSimulateRefundError()) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.NetworkError("Simulated refund error", null, 2, null));
                    }
                    return arrow.core.EitherKt.right(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase.copy$default(fetchedPurchase, null, null, null, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.REFUNDED, null, null, null, 119, null));
                }
                com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl purchaseRepositoryImpl = this.getHighSpeedVideoFpsRanges;
                purchaseRepositoryFake$refundPurchase$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                purchaseRepositoryFake$refundPurchase$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchedPurchase);
                purchaseRepositoryFake$refundPurchase$1.getHighSpeedVideoSizes = 2;
                java.lang.Object refundPurchase = purchaseRepositoryImpl.refundPurchase(str2, purchaseRepositoryFake$refundPurchase$1);
                return refundPurchase == coroutine_suspended ? coroutine_suspended : refundPurchase;
            }
        }
        purchaseRepositoryFake$refundPurchase$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake$refundPurchase$1(this, continuation);
        java.lang.Object obj2 = purchaseRepositoryFake$refundPurchase$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseRepositoryFake$refundPurchase$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        fetchedPurchase = this.getHighSpeedVideoSizes.get(str2);
        if (fetchedPurchase == null) {
        }
    }
}
