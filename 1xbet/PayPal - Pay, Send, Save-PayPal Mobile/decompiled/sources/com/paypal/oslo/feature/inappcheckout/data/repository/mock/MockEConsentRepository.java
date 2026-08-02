package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockEConsentRepository;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/EConsentRepository;", "<init>", "()V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EConsentXOResponse;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OPERATION_NAME, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockEConsentRepository implements com.paypal.oslo.feature.inappcheckout.domain.repository.EConsentRepository {
    public static final int $stable = 0;

    @java.lang.Deprecated
    public static final long CONSENT_APPROVAL_DELAY_MILLIS = 1000;
    private static final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository.Companion Companion = new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository.Companion(null);

    @javax.inject.Inject
    public MockEConsentRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.EConsentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object approveElectronicConsent(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository$approveElectronicConsent$1 mockEConsentRepository$approveElectronicConsent$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository$approveElectronicConsent$1) {
            mockEConsentRepository$approveElectronicConsent$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository$approveElectronicConsent$1) continuation;
            if ((mockEConsentRepository$approveElectronicConsent$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                mockEConsentRepository$approveElectronicConsent$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = mockEConsentRepository$approveElectronicConsent$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockEConsentRepository$approveElectronicConsent$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockEConsentRepository$approveElectronicConsent$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockEConsentRepository$approveElectronicConsent$1.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1000L, mockEConsentRepository$approveElectronicConsent$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse(true, null));
            }
        }
        mockEConsentRepository$approveElectronicConsent$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository$approveElectronicConsent$1(this, continuation);
        java.lang.Object obj2 = mockEConsentRepository$approveElectronicConsent$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockEConsentRepository$approveElectronicConsent$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse(true, null));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockEConsentRepository$Companion;", "", "<init>", "()V", "", "CONSENT_APPROVAL_DELAY_MILLIS", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
