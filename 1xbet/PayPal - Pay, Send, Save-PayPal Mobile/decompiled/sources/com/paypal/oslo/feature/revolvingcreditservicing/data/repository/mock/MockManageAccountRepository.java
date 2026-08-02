package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockManageAccountRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ManageAccountRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "creditInstrumentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;", "status", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/CardLockUnlockError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/CreditInstrumentUpdateResponse;", "updateCreditInstrumentStatus", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enrollInPaper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;", "updateStatementDeliveryPreference", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockManageAccountRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository.Companion(null);

    @javax.inject.Inject
    public MockManageAccountRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateCreditInstrumentStatus(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CardLockUnlockError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository$updateCreditInstrumentStatus$1 mockManageAccountRepository$updateCreditInstrumentStatus$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository$updateCreditInstrumentStatus$1) {
            mockManageAccountRepository$updateCreditInstrumentStatus$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository$updateCreditInstrumentStatus$1) continuation;
            if ((mockManageAccountRepository$updateCreditInstrumentStatus$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockManageAccountRepository$updateCreditInstrumentStatus$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockManageAccountRepository$updateCreditInstrumentStatus$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockManageAccountRepository$updateCreditInstrumentStatus$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockManageAccountRepository$updateCreditInstrumentStatus$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    mockManageAccountRepository$updateCreditInstrumentStatus$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockManageAccountRepository$updateCreditInstrumentStatus$1.getHighSpeedVideoFpsRangesFor = str2;
                    mockManageAccountRepository$updateCreditInstrumentStatus$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditInstrumentStatus);
                    mockManageAccountRepository$updateCreditInstrumentStatus$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, mockManageAccountRepository$updateCreditInstrumentStatus$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) mockManageAccountRepository$updateCreditInstrumentStatus$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse(str2));
            }
        }
        mockManageAccountRepository$updateCreditInstrumentStatus$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository$updateCreditInstrumentStatus$1(this, continuation);
        java.lang.Object obj2 = mockManageAccountRepository$updateCreditInstrumentStatus$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockManageAccountRepository$updateCreditInstrumentStatus$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse(str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateStatementDeliveryPreference(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository$updateStatementDeliveryPreference$1 mockManageAccountRepository$updateStatementDeliveryPreference$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository$updateStatementDeliveryPreference$1) {
            mockManageAccountRepository$updateStatementDeliveryPreference$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository$updateStatementDeliveryPreference$1) continuation;
            if ((mockManageAccountRepository$updateStatementDeliveryPreference$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                mockManageAccountRepository$updateStatementDeliveryPreference$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = mockManageAccountRepository$updateStatementDeliveryPreference$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockManageAccountRepository$updateStatementDeliveryPreference$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockManageAccountRepository$updateStatementDeliveryPreference$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    mockManageAccountRepository$updateStatementDeliveryPreference$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockManageAccountRepository$updateStatementDeliveryPreference$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    mockManageAccountRepository$updateStatementDeliveryPreference$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, mockManageAccountRepository$updateStatementDeliveryPreference$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = mockManageAccountRepository$updateStatementDeliveryPreference$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
            }
        }
        mockManageAccountRepository$updateStatementDeliveryPreference$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository$updateStatementDeliveryPreference$1(this, continuation);
        java.lang.Object obj2 = mockManageAccountRepository$updateStatementDeliveryPreference$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockManageAccountRepository$updateStatementDeliveryPreference$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockManageAccountRepository$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
