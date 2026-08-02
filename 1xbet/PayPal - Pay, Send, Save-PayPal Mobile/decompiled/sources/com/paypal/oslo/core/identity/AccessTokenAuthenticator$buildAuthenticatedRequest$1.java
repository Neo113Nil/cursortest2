package com.paypal.oslo.core.identity;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lokhttp3/Request;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.identity.AccessTokenAuthenticator$buildAuthenticatedRequest$1", f = "AccessTokenAuthenticator.kt", i = {0, 0, 1, 1, 1, 1}, l = {74, 75}, m = "invokeSuspend", n = {"originalRequest", "tokenType", "originalRequest", "tokenType", "it", "$i$a$-let-AccessTokenAuthenticator$buildAuthenticatedRequest$1$1"}, nl = {75, 75}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes4.dex */
final class AccessTokenAuthenticator$buildAuthenticatedRequest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super okhttp3.Request>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ okhttp3.Response getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.identity.AccessTokenAuthenticator getInputSizeshNQ4ISI;
    int getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r4.invalidateToken(r1, r6) != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        okhttp3.Request request;
        com.paypal.oslo.core.identity.domain.model.TokenType extractTokenType;
        com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider;
        com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider2;
        okhttp3.Request request2;
        arrow.core.Either either;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            request = this.getHighSpeedVideoFpsRanges.request();
            extractTokenType = com.paypal.oslo.core.identity.RequestExtensionsKt.extractTokenType(request);
            tokenProvider = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = request;
            this.getHighSpeedVideoSizes = extractTokenType;
            this.getOutputFormats = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                request2 = (okhttp3.Request) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return request2.newBuilder().header("Authorization", "Bearer ".concat(java.lang.String.valueOf(((com.paypal.oslo.core.identity.domain.model.Token) ((arrow.core.Either.Right) either).getValue()).getValue()))).build();
                }
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return null;
            }
            extractTokenType = (com.paypal.oslo.core.identity.domain.model.TokenType) this.getHighSpeedVideoSizes;
            okhttp3.Request request3 = (okhttp3.Request) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            request = request3;
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        tokenProvider2 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = request;
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(extractTokenType);
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getOutputFormats = 2;
        java.lang.Object token = tokenProvider2.getToken(extractTokenType, this);
        if (token != coroutine_suspended) {
            request2 = request;
            obj = token;
            either = (arrow.core.Either) obj;
            if (!(either instanceof arrow.core.Either.Right)) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super okhttp3.Request> continuation) {
        return ((com.paypal.oslo.core.identity.AccessTokenAuthenticator$buildAuthenticatedRequest$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.identity.AccessTokenAuthenticator$buildAuthenticatedRequest$1(this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessTokenAuthenticator$buildAuthenticatedRequest$1(okhttp3.Response response, com.paypal.oslo.core.identity.AccessTokenAuthenticator accessTokenAuthenticator, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.identity.AccessTokenAuthenticator$buildAuthenticatedRequest$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = response;
        this.getInputSizeshNQ4ISI = accessTokenAuthenticator;
    }
}
