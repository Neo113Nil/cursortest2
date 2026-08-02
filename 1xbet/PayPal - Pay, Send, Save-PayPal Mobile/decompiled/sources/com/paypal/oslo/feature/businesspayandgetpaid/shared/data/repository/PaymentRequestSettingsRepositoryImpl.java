package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/PaymentRequestSettingsRepositoryImpl;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/PaymentRequestSettingsRepository;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;", "getTaxSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isTaxInclusive", "isTaxCalculatedAfterDiscount", "", "updateTaxSettings", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeTaxSettings", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentRequestSettingsRepositoryImpl implements com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository {

    @java.lang.Deprecated
    public static final boolean DEFAULT_IS_TAX_CALCULATED_AFTER_DISCOUNT = true;

    @java.lang.Deprecated
    public static final boolean DEFAULT_IS_TAX_INCLUSIVE = false;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getHighSpeedVideoSizes = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("is_tax_inclusive");
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted Camera2StreamConfigurationMap = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("is_tax_calculated_after_discount");

    @javax.inject.Inject
    public PaymentRequestSettingsRepositoryImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.getHighSpeedVideoSizes = appStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTaxSettings(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$getTaxSettings$1 paymentRequestSettingsRepositoryImpl$getTaxSettings$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Object obj;
        boolean z;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$getTaxSettings$1) {
            paymentRequestSettingsRepositoryImpl$getTaxSettings$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$getTaxSettings$1) continuation;
            if ((paymentRequestSettingsRepositoryImpl$getTaxSettings$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                paymentRequestSettingsRepositoryImpl$getTaxSettings$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj2 = paymentRequestSettingsRepositoryImpl$getTaxSettings$1.getHighResolutionOutputSizeshNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentRequestSettingsRepositoryImpl$getTaxSettings$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    paymentRequestSettingsRepositoryImpl$getTaxSettings$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj2 = this.getHighSpeedVideoSizes.getBoolean(getHighSpeedVideoSizes, false, paymentRequestSettingsRepositoryImpl$getTaxSettings$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = paymentRequestSettingsRepositoryImpl$getTaxSettings$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings(z, ((java.lang.Boolean) obj2).booleanValue());
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                paymentRequestSettingsRepositoryImpl$getTaxSettings$1.getHighSpeedVideoSizes = booleanValue;
                paymentRequestSettingsRepositoryImpl$getTaxSettings$1.getHighSpeedVideoFpsRangesFor = 2;
                obj = this.getHighSpeedVideoSizes.getBoolean(Camera2StreamConfigurationMap, true, paymentRequestSettingsRepositoryImpl$getTaxSettings$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = booleanValue;
                obj2 = obj;
                return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings(z, ((java.lang.Boolean) obj2).booleanValue());
            }
        }
        paymentRequestSettingsRepositoryImpl$getTaxSettings$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$getTaxSettings$1(this, continuation);
        java.lang.Object obj22 = paymentRequestSettingsRepositoryImpl$getTaxSettings$1.getHighResolutionOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentRequestSettingsRepositoryImpl$getTaxSettings$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        boolean booleanValue2 = ((java.lang.Boolean) obj22).booleanValue();
        paymentRequestSettingsRepositoryImpl$getTaxSettings$1.getHighSpeedVideoSizes = booleanValue2;
        paymentRequestSettingsRepositoryImpl$getTaxSettings$1.getHighSpeedVideoFpsRangesFor = 2;
        obj = this.getHighSpeedVideoSizes.getBoolean(Camera2StreamConfigurationMap, true, paymentRequestSettingsRepositoryImpl$getTaxSettings$1);
        if (obj != coroutine_suspended) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r8.setBoolean(r2, r7, r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r8.setBoolean(r2, r6, r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateTaxSettings(boolean z, boolean z2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$updateTaxSettings$1 paymentRequestSettingsRepositoryImpl$updateTaxSettings$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$updateTaxSettings$1) {
            paymentRequestSettingsRepositoryImpl$updateTaxSettings$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$updateTaxSettings$1) continuation;
            if ((paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = getHighSpeedVideoSizes;
                    paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.getHighSpeedVideoFpsRangesFor = z;
                    paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.getHighResolutionOutputSizeshNQ4ISI = z2;
                    paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.Camera2StreamConfigurationMap = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z3 = paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.getHighResolutionOutputSizeshNQ4ISI;
                        boolean z4 = paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    z2 = paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.getHighResolutionOutputSizeshNQ4ISI;
                    z = paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted2 = Camera2StreamConfigurationMap;
                paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.getHighSpeedVideoFpsRangesFor = z;
                paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.getHighResolutionOutputSizeshNQ4ISI = z2;
                paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.Camera2StreamConfigurationMap = 2;
            }
        }
        paymentRequestSettingsRepositoryImpl$updateTaxSettings$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$updateTaxSettings$1(this, continuation);
        java.lang.Object obj2 = paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage22 = this.getHighSpeedVideoSizes;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted22 = Camera2StreamConfigurationMap;
        paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.getHighSpeedVideoFpsRangesFor = z;
        paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.getHighResolutionOutputSizeshNQ4ISI = z2;
        paymentRequestSettingsRepositoryImpl$updateTaxSettings$1.Camera2StreamConfigurationMap = 2;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings> observeTaxSettings() {
        return kotlinx.coroutines.flow.FlowKt.combine(this.getHighSpeedVideoSizes.getBooleanFlow(getHighSpeedVideoSizes), this.getHighSpeedVideoSizes.getBooleanFlow(Camera2StreamConfigurationMap), new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PaymentRequestSettingsRepositoryImpl$observeTaxSettings$1(null));
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/PaymentRequestSettingsRepositoryImpl$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "", "DEFAULT_IS_TAX_INCLUSIVE", "Z", "DEFAULT_IS_TAX_CALCULATED_AFTER_DISCOUNT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
