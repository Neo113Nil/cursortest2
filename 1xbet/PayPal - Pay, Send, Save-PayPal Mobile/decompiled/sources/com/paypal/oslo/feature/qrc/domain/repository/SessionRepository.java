package com.paypal.oslo.feature.qrc.domain.repository;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/repository/SessionRepository;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;", "sessionInfo", "", "isLastPollCall", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;", "pollForSession", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/qrc/domain/model/scanner/ScannedData;", "request", "scanQrCode", "(Lcom/paypal/oslo/feature/qrc/domain/model/scanner/ScannedData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface SessionRepository {
    java.lang.Object pollForSession(com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError, com.paypal.oslo.feature.qrc.domain.model.session.QrcSession>> continuation);

    java.lang.Object scanQrCode(com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData scannedData, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError, com.paypal.oslo.feature.qrc.domain.model.session.QrcSession>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object pollForSession$default(com.paypal.oslo.feature.qrc.domain.repository.SessionRepository sessionRepository, com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pollForSession");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return sessionRepository.pollForSession(pollingSessionInfo, z, continuation);
    }
}
