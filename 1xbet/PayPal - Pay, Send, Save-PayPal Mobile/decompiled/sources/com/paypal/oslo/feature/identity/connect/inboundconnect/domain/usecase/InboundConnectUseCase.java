package com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/usecase/InboundConnectUseCase;", "", "Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;", "identitySessionTransfer", "<init>", "(Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;)V", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectError;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectResult;", "invoke", "(Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InboundConnectUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.domain.IdentitySessionTransfer Camera2StreamConfigurationMap;

    public InboundConnectUseCase(com.paypal.oslo.core.identity.domain.IdentitySessionTransfer identitySessionTransfer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identitySessionTransfer, "");
        this.Camera2StreamConfigurationMap = identitySessionTransfer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectError, com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectResult>> continuation) {
        com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase$invoke$1 inboundConnectUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectError.Unknown unknown;
        if (continuation instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase$invoke$1) {
            inboundConnectUseCase$invoke$1 = (com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase$invoke$1) continuation;
            if ((inboundConnectUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                inboundConnectUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = inboundConnectUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inboundConnectUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "InboundConnectUseCase invoked - starting session transfer", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("clientId", inboundConnectRequest.getClientId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, inboundConnectRequest.getScope())), 2, null);
                    com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext buildWebSessionTransferContext = com.paypal.oslo.feature.identity.connect.inboundconnect.utils.InboundConnectMapperExtensionsKt.buildWebSessionTransferContext(inboundConnectRequest);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "WebSession context built", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("contextType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(buildWebSessionTransferContext.getClass()).getSimpleName())), null, 4, null);
                    com.paypal.oslo.core.identity.domain.IdentitySessionTransfer identitySessionTransfer = this.Camera2StreamConfigurationMap;
                    inboundConnectUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(inboundConnectRequest);
                    inboundConnectUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildWebSessionTransferContext);
                    inboundConnectUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = identitySessionTransfer.transferSessionToWeb(buildWebSessionTransferContext, inboundConnectUseCase$invoke$1);
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
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.core.identity.domain.model.WebSessionTransferData webSessionTransferData = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferData) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect session transfer completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasConnectUrl", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(webSessionTransferData.getRedirectUrl().length() > 0))), null, 4, null);
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectResult(webSessionTransferData.getRedirectUrl()));
                }
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.core.identity.domain.model.WebSessionTransferError webSessionTransferError = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferError) ((arrow.core.Either.Left) either).getValue();
                if (webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.InvalidRedirectUri) {
                    unknown = com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectError.InvalidRedirectUri.INSTANCE;
                } else if (webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.AuthenticationFailed) {
                    unknown = com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectError.AuthenticationFailed.INSTANCE;
                } else if (webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.NetworkError) {
                    unknown = com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectError.NetworkError.INSTANCE;
                } else if (webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.UserCancelled) {
                    unknown = com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectError.UserCancelled.INSTANCE;
                } else {
                    if (!(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    unknown = new com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectError.Unknown(((com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown) webSessionTransferError).getMessage());
                }
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect session transfer failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(webSessionTransferError.getClass()).getSimpleName()), kotlin.TuplesKt.to("mappedErrorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(unknown.getClass()).getSimpleName())), null, 4, null);
                return arrow.core.EitherKt.left(unknown);
            }
        }
        inboundConnectUseCase$invoke$1 = new com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = inboundConnectUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inboundConnectUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
