package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/PurchaseRepositoryImpl;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/PurchaseRepository;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/api/UprPurchaseService;", "uprPurchaseService", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/api/UprPurchaseService;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;", "paymentRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/PurchaseError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/PurchaseCreated;", "createPurchase", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "purchaseId", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/UpdatePurchaseData;", "updateData", "", "patchPurchase", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/UpdatePurchaseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedPurchase;", "getPurchaseDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toEmail", "sendReceipt", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refundPurchase", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "p0", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/PurchaseError;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/api/UprPurchaseService;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PurchaseRepositoryImpl implements com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository {

    @java.lang.Deprecated
    public static final int HTTP_STATUS_BAD_REQUEST = 400;

    @java.lang.Deprecated
    public static final int HTTP_STATUS_FORBIDDEN = 403;

    @java.lang.Deprecated
    public static final int HTTP_STATUS_NOT_FOUND = 404;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public PurchaseRepositoryImpl(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService uprPurchaseService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uprPurchaseService, "");
        this.getHighSpeedVideoSizes = uprPurchaseService;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/PurchaseRepositoryImpl$Companion;", "", "<init>", "()V", "", "HTTP_STATUS_BAD_REQUEST", com.visa.cbp.getEncExpo.warmup, "HTTP_STATUS_NOT_FOUND", "HTTP_STATUS_FORBIDDEN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createPurchase(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$createPurchase$1 purchaseRepositoryImpl$createPurchase$1;
        int i;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$createPurchase$1) {
            purchaseRepositoryImpl$createPurchase$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$createPurchase$1) continuation;
            if ((purchaseRepositoryImpl$createPurchase$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                purchaseRepositoryImpl$createPurchase$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = purchaseRepositoryImpl$createPurchase$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purchaseRepositoryImpl$createPurchase$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items = paymentRequest.getItems();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
                    for (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem : items) {
                        java.lang.String obj2 = java.util.UUID.randomUUID().toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                        java.lang.String name2 = lineItem.getName();
                        java.math.BigDecimal quantity = lineItem.getQuantity();
                        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto amountDto = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto(paymentRequest.getCurrencyCode(), new java.math.BigDecimal(lineItem.getUnitPrice().formatAsNumberUnsigned()));
                        java.lang.String description = lineItem.getDescription();
                        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax = lineItem.getTax();
                        arrayList.add(new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.ItemDto(obj2, name2, quantity, amountDto, description, (java.lang.String) null, (java.lang.String) null, tax != null ? new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.TaxDto(tax.getValue(), tax.getId(), lineItem.getUnitPrice().getCurrencyCode()) : null, (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.DiscountDto) null, 352, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    }
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.CreatePurchaseRequest createPurchaseRequest = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.CreatePurchaseRequest(new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseDetailsDto(arrayList, paymentRequest.getCurrencyCode(), paymentRequest.getTaxSettings().isTaxCalculatedAfterDiscount(), paymentRequest.getTaxSettings().isTaxInclusive(), paymentRequest.getCountryId(), (java.lang.String) null, 32, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService uprPurchaseService = this.getHighSpeedVideoSizes;
                    purchaseRepositoryImpl$createPurchase$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRequest);
                    purchaseRepositoryImpl$createPurchase$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createPurchaseRequest);
                    purchaseRepositoryImpl$createPurchase$1.getHighSpeedVideoSizes = 1;
                    obj = uprPurchaseService.createPurchase(createPurchaseRequest, purchaseRepositoryImpl$createPurchase$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                right = (arrow.core.Either) obj;
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.CreatePurchaseResponse createPurchaseResponse = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.CreatePurchaseResponse) ((arrow.core.Either.Right) right).getValue();
                    right = new arrow.core.Either.Right(new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated(createPurchaseResponse.getPurchaseUuid(), new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price(createPurchaseResponse.getPurchaseDetails().getTotalAmount().getAmount(), createPurchaseResponse.getPurchaseDetails().getTotalAmount().getCurrency())));
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!(right instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(getHighSpeedVideoSizes((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) right).getValue()));
                }
                if (right instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) right).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        purchaseRepositoryImpl$createPurchase$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$createPurchase$1(this, continuation);
        java.lang.Object obj3 = purchaseRepositoryImpl$createPurchase$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseRepositoryImpl$createPurchase$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        right = (arrow.core.Either) obj3;
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        if (!(right instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object patchPurchase(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.UpdatePurchaseData updatePurchaseData, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$patchPurchase$1 purchaseRepositoryImpl$patchPurchase$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$patchPurchase$1) {
            purchaseRepositoryImpl$patchPurchase$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$patchPurchase$1) continuation;
            if ((purchaseRepositoryImpl$patchPurchase$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                purchaseRepositoryImpl$patchPurchase$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = purchaseRepositoryImpl$patchPurchase$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purchaseRepositoryImpl$patchPurchase$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.UpdatePurchaseRequest updatePurchaseRequest = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.UpdatePurchaseRequest(updatePurchaseData.getPaymentUuid(), updatePurchaseData.getOriginalPurchaseUuid(), new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto(updatePurchaseData.getCurrencyCode(), updatePurchaseData.getAmount()), updatePurchaseData.getCardType(), updatePurchaseData.getCardPaymentEntryMode(), updatePurchaseData.getApplicationName(), updatePurchaseData.getApplicationIdentifier(), updatePurchaseData.getReferenceId());
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService uprPurchaseService = this.getHighSpeedVideoSizes;
                    purchaseRepositoryImpl$patchPurchase$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    purchaseRepositoryImpl$patchPurchase$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePurchaseData);
                    purchaseRepositoryImpl$patchPurchase$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePurchaseRequest);
                    purchaseRepositoryImpl$patchPurchase$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = uprPurchaseService.patchPurchase(str, updatePurchaseRequest, purchaseRepositoryImpl$patchPurchase$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(getHighSpeedVideoSizes((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        purchaseRepositoryImpl$patchPurchase$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$patchPurchase$1(this, continuation);
        java.lang.Object obj2 = purchaseRepositoryImpl$patchPurchase$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseRepositoryImpl$patchPurchase$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPurchaseDetails(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$getPurchaseDetails$1 purchaseRepositoryImpl$getPurchaseDetails$1;
        int i;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$getPurchaseDetails$1) {
            purchaseRepositoryImpl$getPurchaseDetails$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$getPurchaseDetails$1) continuation;
            if ((purchaseRepositoryImpl$getPurchaseDetails$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                purchaseRepositoryImpl$getPurchaseDetails$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = purchaseRepositoryImpl$getPurchaseDetails$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purchaseRepositoryImpl$getPurchaseDetails$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService uprPurchaseService = this.getHighSpeedVideoSizes;
                    purchaseRepositoryImpl$getPurchaseDetails$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    purchaseRepositoryImpl$getPurchaseDetails$1.getHighSpeedVideoSizes = 1;
                    obj = uprPurchaseService.getPurchase(str, purchaseRepositoryImpl$getPurchaseDetails$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                right = (arrow.core.Either) obj;
                if (!(right instanceof arrow.core.Either.Right)) {
                    right = new arrow.core.Either.Right(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImplKt.access$toDomainItem((com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseResponse) ((arrow.core.Either.Right) right).getValue()));
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!(right instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(getHighSpeedVideoSizes((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) right).getValue()));
                }
                if (right instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) right).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        purchaseRepositoryImpl$getPurchaseDetails$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$getPurchaseDetails$1(this, continuation);
        java.lang.Object obj2 = purchaseRepositoryImpl$getPurchaseDetails$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseRepositoryImpl$getPurchaseDetails$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        right = (arrow.core.Either) obj2;
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        if (!(right instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendReceipt(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$sendReceipt$1 purchaseRepositoryImpl$sendReceipt$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$sendReceipt$1) {
            purchaseRepositoryImpl$sendReceipt$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$sendReceipt$1) continuation;
            if ((purchaseRepositoryImpl$sendReceipt$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                purchaseRepositoryImpl$sendReceipt$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = purchaseRepositoryImpl$sendReceipt$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purchaseRepositoryImpl$sendReceipt$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService uprPurchaseService = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.SendReceiptRequest sendReceiptRequest = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.SendReceiptRequest(str2);
                    purchaseRepositoryImpl$sendReceipt$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    purchaseRepositoryImpl$sendReceipt$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    purchaseRepositoryImpl$sendReceipt$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = uprPurchaseService.sendEmailReceipt(str, sendReceiptRequest, purchaseRepositoryImpl$sendReceipt$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(getHighSpeedVideoSizes((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        purchaseRepositoryImpl$sendReceipt$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$sendReceipt$1(this, continuation);
        java.lang.Object obj2 = purchaseRepositoryImpl$sendReceipt$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseRepositoryImpl$sendReceipt$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object refundPurchase(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$refundPurchase$1 purchaseRepositoryImpl$refundPurchase$1;
        int i;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$refundPurchase$1) {
            purchaseRepositoryImpl$refundPurchase$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$refundPurchase$1) continuation;
            if ((purchaseRepositoryImpl$refundPurchase$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                purchaseRepositoryImpl$refundPurchase$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = purchaseRepositoryImpl$refundPurchase$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purchaseRepositoryImpl$refundPurchase$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.RefundPurchaseRequest refundPurchaseRequest = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.RefundPurchaseRequest(str);
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService uprPurchaseService = this.getHighSpeedVideoSizes;
                    purchaseRepositoryImpl$refundPurchase$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    purchaseRepositoryImpl$refundPurchase$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(refundPurchaseRequest);
                    purchaseRepositoryImpl$refundPurchase$1.getHighSpeedVideoSizes = 1;
                    obj = uprPurchaseService.refundPurchase(refundPurchaseRequest, purchaseRepositoryImpl$refundPurchase$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                right = (arrow.core.Either) obj;
                if (!(right instanceof arrow.core.Either.Right)) {
                    right = new arrow.core.Either.Right(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImplKt.access$toDomainItem((com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseResponse) ((arrow.core.Either.Right) right).getValue()));
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!(right instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(getHighSpeedVideoSizes((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) right).getValue()));
                }
                if (right instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) right).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        purchaseRepositoryImpl$refundPurchase$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl$refundPurchase$1(this, continuation);
        java.lang.Object obj2 = purchaseRepositoryImpl$refundPurchase$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseRepositoryImpl$refundPurchase$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        right = (arrow.core.Either) obj2;
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        if (!(right instanceof arrow.core.Either.Left)) {
        }
    }

    private static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError getHighSpeedVideoSizes(com.paypal.oslo.core.network.http.error.NetworkError p0) {
        if (p0 instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            int code = ((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) p0).getCode();
            if (code == 400) {
                return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.ValidationError("Invalid purchase request", null, 2, null);
            }
            if (code == 403) {
                return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.PermissionError.INSTANCE;
            }
            if (code == 404) {
                return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.NotFoundError.INSTANCE;
            }
            return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.ServerError.INSTANCE;
        }
        if (p0 instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.NetworkError(com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR, ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) p0).getCause());
        }
        if (!(p0 instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.http.error.NetworkError.UnknownError unknownError = (com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) p0;
        java.lang.String message = unknownError.getCause().getMessage();
        if (message == null) {
            message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.UnknownError(message, unknownError.getCause());
    }
}
