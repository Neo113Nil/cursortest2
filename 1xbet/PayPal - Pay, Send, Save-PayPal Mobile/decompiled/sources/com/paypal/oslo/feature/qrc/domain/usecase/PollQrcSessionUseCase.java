package com.paypal.oslo.feature.qrc.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/usecase/PollQrcSessionUseCase;", "", "Lcom/paypal/oslo/feature/qrc/domain/repository/SessionRepository;", "sessionRepository", "Lcom/paypal/oslo/feature/qrc/domain/session/resolver/QrcSessionResultResolver;", "qrcSessionResultResolver", "Lcom/paypal/oslo/feature/qrc/domain/config/QrcSessionPollingConfig;", "configManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/repository/SessionRepository;Lcom/paypal/oslo/feature/qrc/domain/session/resolver/QrcSessionResultResolver;Lcom/paypal/oslo/feature/qrc/domain/config/QrcSessionPollingConfig;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;", "sessionInfo", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action;", "invoke", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/qrc/domain/repository/SessionRepository;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/qrc/domain/session/resolver/QrcSessionResultResolver;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/qrc/domain/config/QrcSessionPollingConfig;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PollQrcSessionUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.config.QrcSessionPollingConfig Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.repository.SessionRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PollQrcSessionUseCase(com.paypal.oslo.feature.qrc.domain.repository.SessionRepository sessionRepository, com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver qrcSessionResultResolver, com.paypal.oslo.feature.qrc.domain.config.QrcSessionPollingConfig qrcSessionPollingConfig, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionResultResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionPollingConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = sessionRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = qrcSessionResultResolver;
        this.Camera2StreamConfigurationMap = qrcSessionPollingConfig;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        if (r8 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$pollOnce(com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase pollQrcSessionUseCase, com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo, boolean z, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase$pollOnce$1 pollQrcSessionUseCase$pollOnce$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase$pollOnce$1) {
            pollQrcSessionUseCase$pollOnce$1 = (com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase$pollOnce$1) continuation;
            if ((pollQrcSessionUseCase$pollOnce$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                pollQrcSessionUseCase$pollOnce$1.getInputFormats -= 2147483648;
                java.lang.Object obj = pollQrcSessionUseCase$pollOnce$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pollQrcSessionUseCase$pollOnce$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.qrc.domain.repository.SessionRepository sessionRepository = pollQrcSessionUseCase.getHighSpeedVideoFpsRangesFor;
                    pollQrcSessionUseCase$pollOnce$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pollingSessionInfo);
                    pollQrcSessionUseCase$pollOnce$1.getOutputFormats = z;
                    pollQrcSessionUseCase$pollOnce$1.getInputFormats = 1;
                    obj = sessionRepository.pollForSession(pollingSessionInfo, z, pollQrcSessionUseCase$pollOnce$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = pollQrcSessionUseCase$pollOnce$1.getHighSpeedVideoSizes;
                        int i3 = pollQrcSessionUseCase$pollOnce$1.getHighResolutionOutputSizeshNQ4ISI;
                        boolean z2 = pollQrcSessionUseCase$pollOnce$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Either either2 = ((arrow.core.Ior) obj).toEither();
                        if (either2 instanceof arrow.core.Either.Right) {
                            return arrow.core.IorKt.rightIor((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action) ((arrow.core.Either.Right) either2).getValue());
                        }
                        if (either2 instanceof arrow.core.Either.Left) {
                            return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error) ((arrow.core.Either.Left) either2).getValue());
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    z = pollQrcSessionUseCase$pollOnce$1.getOutputFormats;
                    pollingSessionInfo = (com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo) pollQrcSessionUseCase$pollOnce$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.qrc.domain.model.session.QrcSession qrcSession = (com.paypal.oslo.feature.qrc.domain.model.session.QrcSession) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver qrcSessionResultResolver = pollQrcSessionUseCase.getHighResolutionOutputSizeshNQ4ISI;
                    pollQrcSessionUseCase$pollOnce$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pollingSessionInfo);
                    pollQrcSessionUseCase$pollOnce$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    pollQrcSessionUseCase$pollOnce$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(qrcSession);
                    pollQrcSessionUseCase$pollOnce$1.getOutputFormats = z;
                    pollQrcSessionUseCase$pollOnce$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    pollQrcSessionUseCase$pollOnce$1.getHighSpeedVideoSizes = 0;
                    pollQrcSessionUseCase$pollOnce$1.getInputFormats = 2;
                    obj = qrcSessionResultResolver.resolve(qrcSession, pollQrcSessionUseCase$pollOnce$1);
                } else {
                    if (either instanceof arrow.core.Either.Left) {
                        return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCaseKt.toQrcSessionResultActionError((com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError) ((arrow.core.Either.Left) either).getValue()));
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        pollQrcSessionUseCase$pollOnce$1 = new com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase$pollOnce$1(pollQrcSessionUseCase, continuation);
        java.lang.Object obj2 = pollQrcSessionUseCase$pollOnce$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pollQrcSessionUseCase$pollOnce$1.getInputFormats;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public /* synthetic */ PollQrcSessionUseCase(com.paypal.oslo.feature.qrc.domain.repository.SessionRepository sessionRepository, com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver qrcSessionResultResolver, com.paypal.oslo.feature.qrc.domain.config.QrcSessionPollingConfig qrcSessionPollingConfig, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionRepository, qrcSessionResultResolver, qrcSessionPollingConfig, (i & 8) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error, com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action>> invoke(com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo sessionInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionInfo, "");
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase$invoke$1(sessionInfo, this, null)), this.getHighSpeedVideoSizes);
    }

    public static final /* synthetic */ boolean access$hasReachedTimeout(com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase pollQrcSessionUseCase, long j, int i) {
        return java.lang.System.currentTimeMillis() - j >= ((long) i);
    }

    public static final /* synthetic */ boolean access$isLastPollCall(com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase pollQrcSessionUseCase, long j, int i, int i2) {
        return i2 <= 1 || ((long) i) - (java.lang.System.currentTimeMillis() - j) <= pollQrcSessionUseCase.Camera2StreamConfigurationMap.getPollingIntervalMs() * 2;
    }

    public static final /* synthetic */ boolean access$shouldStopPolling(com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase pollQrcSessionUseCase, arrow.core.Ior ior) {
        arrow.core.Either either = ior.toEither();
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action action = (com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action) ((arrow.core.Either.Right) either).getValue();
            if (action instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.PollForQrcSessionAction) {
                return false;
            }
            if ((action instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.ProcessPaymentAction) || (action instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.LaunchEnrolmentFlow) || kotlin.jvm.internal.Intrinsics.areEqual(action, com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.Redirect.INSTANCE)) {
                return true;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (either instanceof arrow.core.Either.Left) {
            return ((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error) ((arrow.core.Either.Left) either).getValue()) instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.ValidationError;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
