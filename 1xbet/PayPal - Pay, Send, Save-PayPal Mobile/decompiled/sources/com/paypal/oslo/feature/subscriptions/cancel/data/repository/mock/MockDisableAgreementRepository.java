package com.paypal.oslo.feature.subscriptions.cancel.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/cancel/data/repository/mock/MockDisableAgreementRepository;", "Lcom/paypal/oslo/feature/subscriptions/cancel/domain/repository/DisableAgreementRepository;", "<init>", "()V", "", "agreementId", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "", "disableConsumerAgreement", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MockDisableAgreementRepository implements com.paypal.oslo.feature.subscriptions.cancel.domain.repository.DisableAgreementRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockDisableAgreementRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.subscriptions.cancel.domain.repository.DisableAgreementRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object disableConsumerAgreement(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.subscriptions.cancel.data.repository.mock.MockDisableAgreementRepository$disableConsumerAgreement$1 mockDisableAgreementRepository$disableConsumerAgreement$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.cancel.data.repository.mock.MockDisableAgreementRepository$disableConsumerAgreement$1) {
            mockDisableAgreementRepository$disableConsumerAgreement$1 = (com.paypal.oslo.feature.subscriptions.cancel.data.repository.mock.MockDisableAgreementRepository$disableConsumerAgreement$1) continuation;
            if ((mockDisableAgreementRepository$disableConsumerAgreement$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mockDisableAgreementRepository$disableConsumerAgreement$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mockDisableAgreementRepository$disableConsumerAgreement$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockDisableAgreementRepository$disableConsumerAgreement$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockDisableAgreementRepository$disableConsumerAgreement$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockDisableAgreementRepository$disableConsumerAgreement$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(agreementType);
                    mockDisableAgreementRepository$disableConsumerAgreement$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockDisableAgreementRepository$disableConsumerAgreement$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            }
        }
        mockDisableAgreementRepository$disableConsumerAgreement$1 = new com.paypal.oslo.feature.subscriptions.cancel.data.repository.mock.MockDisableAgreementRepository$disableConsumerAgreement$1(this, continuation);
        java.lang.Object obj2 = mockDisableAgreementRepository$disableConsumerAgreement$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockDisableAgreementRepository$disableConsumerAgreement$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
    }
}
