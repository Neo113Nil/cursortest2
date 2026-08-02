package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000623\u0010\r\u001a/\b\u0001\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086B¢\u0006\u0004\b\u000e\u0010\u000fJ_\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0011\u001a\u00020\u001023\u0010\u0012\u001a/\b\u0001\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/ExecuteWithAuthRetryUseCase;", "", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "tokenProvider", "<init>", "(Lcom/paypal/oslo/core/identity/domain/TokenProvider;)V", "T", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError;", "action", "invoke", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "p0", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ExecuteWithAuthRetryUseCase {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.domain.TokenProvider getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase.Companion Companion = new com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public ExecuteWithAuthRetryUseCase(com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "");
        this.getHighSpeedVideoFpsRangesFor = tokenProvider;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/ExecuteWithAuthRetryUseCase$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        if (r13 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        if (r13 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object invoke(kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, ? extends T>>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, ? extends T>> continuation) {
        com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase$invoke$1 executeWithAuthRetryUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase$invoke$1) {
            executeWithAuthRetryUseCase$invoke$1 = (com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase$invoke$1) continuation;
            if ((executeWithAuthRetryUseCase$invoke$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                executeWithAuthRetryUseCase$invoke$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = executeWithAuthRetryUseCase$invoke$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = executeWithAuthRetryUseCase$invoke$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState = com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED;
                    executeWithAuthRetryUseCase$invoke$1.getHighSpeedVideoSizes = function2;
                    executeWithAuthRetryUseCase$invoke$1.getOutputMinFrameDuration = 1;
                    obj = getHighSpeedVideoSizes(authenticationState, function2, executeWithAuthRetryUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = executeWithAuthRetryUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i3 = executeWithAuthRetryUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (arrow.core.Either) obj;
                    }
                    function2 = (kotlin.jvm.functions.Function2) executeWithAuthRetryUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return arrow.core.EitherKt.right(((arrow.core.Either.Right) either).getValue());
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.xoom.domain.model.UserError userError = (com.paypal.oslo.feature.xoom.domain.model.UserError) ((arrow.core.Either.Left) either).getValue();
                    if (userError instanceof com.paypal.oslo.feature.xoom.domain.model.UserError.UnauthorizedError) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.xoom.LoggerKt.log, "Received 401, retrying with LOGGED_IN authentication", null, null, 6, null);
                        com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState2 = com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN;
                        executeWithAuthRetryUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function2);
                        executeWithAuthRetryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        executeWithAuthRetryUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        executeWithAuthRetryUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userError);
                        executeWithAuthRetryUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        executeWithAuthRetryUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        executeWithAuthRetryUseCase$invoke$1.getOutputMinFrameDuration = 2;
                        obj = getHighSpeedVideoSizes(authenticationState2, function2, executeWithAuthRetryUseCase$invoke$1);
                    } else {
                        return arrow.core.EitherKt.left(userError);
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        executeWithAuthRetryUseCase$invoke$1 = new com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = executeWithAuthRetryUseCase$invoke$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = executeWithAuthRetryUseCase$invoke$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9 A[Catch: all -> 0x0083, RaiseCancellationException -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0086, all -> 0x0083, blocks: (B:29:0x007c, B:31:0x00d3, B:34:0x00d9, B:35:0x00fc, B:41:0x00ef, B:42:0x014a, B:43:0x014f, B:45:0x0092), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r10v6, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r9v4, types: [arrow.core.raise.Raise] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState, kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, ? extends T>>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, ? extends T>> continuation) {
        com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase$executeWith$1 executeWithAuthRetryUseCase$executeWith$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        int i2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        int i3;
        int i4;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, ? extends T>>, ? extends java.lang.Object> function22;
        com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState2;
        int i5;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.Either either;
        arrow.core.Either right;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise4;
        try {
            if (continuation instanceof com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase$executeWith$1) {
                executeWithAuthRetryUseCase$executeWith$1 = (com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase$executeWith$1) continuation;
                if ((executeWithAuthRetryUseCase$executeWith$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    executeWithAuthRetryUseCase$executeWith$1.getOutputStallDurationlomOqCM -= 2147483648;
                    obj = executeWithAuthRetryUseCase$executeWith$1.getOutputSizeshNQ4ISI;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = executeWithAuthRetryUseCase$executeWith$1.getOutputStallDurationlomOqCM;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = 0;
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider = this.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType = new com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(authenticationState, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("xoom_api", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                        executeWithAuthRetryUseCase$executeWith$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationState);
                        executeWithAuthRetryUseCase$executeWith$1.getOutputMinFrameDuration = function2;
                        executeWithAuthRetryUseCase$executeWith$1.getInputFormats = defaultRaise;
                        executeWithAuthRetryUseCase$executeWith$1.getOutputFormats = defaultRaise2;
                        executeWithAuthRetryUseCase$executeWith$1.getInputSizeshNQ4ISI = defaultRaise2;
                        executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoSizes = 0;
                        executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoFpsRangesFor = 0;
                        executeWithAuthRetryUseCase$executeWith$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoFpsRanges = 0;
                        executeWithAuthRetryUseCase$executeWith$1.getOutputStallDurationlomOqCM = 1;
                        obj = tokenProvider.getToken(userAccessTokenType, executeWithAuthRetryUseCase$executeWith$1);
                        if (obj != coroutine_suspended) {
                            i3 = 0;
                            i4 = 0;
                            function22 = function2;
                            authenticationState2 = authenticationState;
                            i5 = 0;
                            defaultRaise3 = defaultRaise2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoFpsRanges;
                        int i7 = executeWithAuthRetryUseCase$executeWith$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i8 = executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoFpsRangesFor;
                        int i9 = executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoSizes;
                        raise = (arrow.core.raise.Raise) executeWithAuthRetryUseCase$executeWith$1.getInputSizeshNQ4ISI;
                        defaultRaise4 = (arrow.core.raise.DefaultRaise) executeWithAuthRetryUseCase$executeWith$1.getInputFormats;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            java.lang.Object bind = raise.bind((arrow.core.Either<? extends Error, ? extends java.lang.Object>) obj);
                            defaultRaise4.complete();
                            return new arrow.core.Either.Right(bind);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise4;
                            defaultRaise5.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise5));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            arrow.core.raise.DefaultRaise defaultRaise6 = defaultRaise4;
                            defaultRaise6.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    i2 = executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoFpsRanges;
                    i3 = executeWithAuthRetryUseCase$executeWith$1.getHighResolutionOutputSizeshNQ4ISI;
                    i4 = executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoFpsRangesFor;
                    i5 = executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoSizes;
                    ?? r9 = (arrow.core.raise.Raise) executeWithAuthRetryUseCase$executeWith$1.getInputSizeshNQ4ISI;
                    ?? r10 = (arrow.core.raise.Raise) executeWithAuthRetryUseCase$executeWith$1.getOutputFormats;
                    defaultRaise = (arrow.core.raise.DefaultRaise) executeWithAuthRetryUseCase$executeWith$1.getInputFormats;
                    function22 = (kotlin.jvm.functions.Function2) executeWithAuthRetryUseCase$executeWith$1.getOutputMinFrameDuration;
                    authenticationState2 = (com.paypal.oslo.core.identity.domain.model.AuthenticationState) executeWithAuthRetryUseCase$executeWith$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise3 = r9;
                    defaultRaise2 = r10;
                    either = (arrow.core.Either) obj;
                    if (!(either instanceof arrow.core.Either.Left)) {
                        right = new arrow.core.Either.Left(com.paypal.oslo.feature.xoom.domain.model.UserError.NetworkError.INSTANCE);
                    } else {
                        if (!(either instanceof arrow.core.Either.Right)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                    }
                    com.paypal.oslo.core.identity.domain.model.Token token = (com.paypal.oslo.core.identity.domain.model.Token) defaultRaise3.bind(right);
                    java.lang.String value = token.getValue();
                    executeWithAuthRetryUseCase$executeWith$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationState2);
                    executeWithAuthRetryUseCase$executeWith$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function22);
                    executeWithAuthRetryUseCase$executeWith$1.getInputFormats = defaultRaise;
                    executeWithAuthRetryUseCase$executeWith$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                    executeWithAuthRetryUseCase$executeWith$1.getInputSizeshNQ4ISI = defaultRaise2;
                    executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(token);
                    executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoSizes = i5;
                    executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoFpsRangesFor = i4;
                    executeWithAuthRetryUseCase$executeWith$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                    executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoFpsRanges = i2;
                    executeWithAuthRetryUseCase$executeWith$1.getOutputStallDurationlomOqCM = 2;
                    obj = function22.invoke(value, executeWithAuthRetryUseCase$executeWith$1);
                    if (obj != coroutine_suspended) {
                        raise = defaultRaise2;
                        defaultRaise4 = defaultRaise;
                        java.lang.Object bind2 = raise.bind((arrow.core.Either<? extends Error, ? extends java.lang.Object>) obj);
                        defaultRaise4.complete();
                        return new arrow.core.Either.Right(bind2);
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            either = (arrow.core.Either) obj;
            if (!(either instanceof arrow.core.Either.Left)) {
            }
            com.paypal.oslo.core.identity.domain.model.Token token2 = (com.paypal.oslo.core.identity.domain.model.Token) defaultRaise3.bind(right);
            java.lang.String value2 = token2.getValue();
            executeWithAuthRetryUseCase$executeWith$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationState2);
            executeWithAuthRetryUseCase$executeWith$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function22);
            executeWithAuthRetryUseCase$executeWith$1.getInputFormats = defaultRaise;
            executeWithAuthRetryUseCase$executeWith$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
            executeWithAuthRetryUseCase$executeWith$1.getInputSizeshNQ4ISI = defaultRaise2;
            executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(token2);
            executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoSizes = i5;
            executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoFpsRangesFor = i4;
            executeWithAuthRetryUseCase$executeWith$1.getHighResolutionOutputSizeshNQ4ISI = i3;
            executeWithAuthRetryUseCase$executeWith$1.getHighSpeedVideoFpsRanges = i2;
            executeWithAuthRetryUseCase$executeWith$1.getOutputStallDurationlomOqCM = 2;
            obj = function22.invoke(value2, executeWithAuthRetryUseCase$executeWith$1);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        executeWithAuthRetryUseCase$executeWith$1 = new com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase$executeWith$1(this, continuation);
        obj = executeWithAuthRetryUseCase$executeWith$1.getOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = executeWithAuthRetryUseCase$executeWith$1.getOutputStallDurationlomOqCM;
    }
}
