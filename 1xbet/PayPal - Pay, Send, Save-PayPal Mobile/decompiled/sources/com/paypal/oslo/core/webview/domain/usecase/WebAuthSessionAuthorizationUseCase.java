package com.paypal.oslo.core.webview.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/webview/domain/usecase/WebAuthSessionAuthorizationUseCase;", "", "Lcom/paypal/oslo/core/webview/domain/usecase/ValidateURLUseCase;", "validateUrlUseCase", "Lcom/paypal/oslo/core/webview/domain/repository/WebAuthSessionRepository;", "webAuthSessionRepository", "<init>", "(Lcom/paypal/oslo/core/webview/domain/usecase/ValidateURLUseCase;Lcom/paypal/oslo/core/webview/domain/repository/WebAuthSessionRepository;)V", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthContext;", "webAuthContext", "", "url", "Larrow/core/Either;", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionAuthorizationError;", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSession;", "invoke", "(Lcom/paypal/oslo/core/webview/domain/models/WebAuthContext;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/webview/domain/usecase/ValidateURLUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/webview/domain/repository/WebAuthSessionRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WebAuthSessionAuthorizationUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.domain.repository.WebAuthSessionRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public WebAuthSessionAuthorizationUseCase(com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase validateURLUseCase, com.paypal.oslo.core.webview.domain.repository.WebAuthSessionRepository webAuthSessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateURLUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webAuthSessionRepository, "");
        this.Camera2StreamConfigurationMap = validateURLUseCase;
        this.getHighSpeedVideoFpsRangesFor = webAuthSessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7 A[Catch: all -> 0x0047, RaiseCancellationException -> 0x004a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x004a, all -> 0x0047, blocks: (B:11:0x0042, B:12:0x00c1, B:15:0x00c7, B:16:0x00ee, B:21:0x00e0, B:22:0x00ff, B:23:0x0104), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.core.webview.domain.models.WebAuthContext webAuthContext, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError, com.paypal.oslo.core.webview.domain.models.WebAuthSession>> continuation) {
        com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase$invoke$1 webAuthSessionAuthorizationUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.Either right;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        arrow.core.Either right2;
        if (continuation instanceof com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase$invoke$1) {
            webAuthSessionAuthorizationUseCase$invoke$1 = (com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase$invoke$1) continuation;
            if ((webAuthSessionAuthorizationUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                webAuthSessionAuthorizationUseCase$invoke$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = webAuthSessionAuthorizationUseCase$invoke$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webAuthSessionAuthorizationUseCase$invoke$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.Either<com.paypal.oslo.core.webview.domain.models.ValidateURLError, kotlin.Unit> invoke = this.Camera2StreamConfigurationMap.invoke(str);
                        if (invoke instanceof arrow.core.Either.Left) {
                            right = new arrow.core.Either.Left(new com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.UrlValidationError((com.paypal.oslo.core.webview.domain.models.ValidateURLError) ((arrow.core.Either.Left) invoke).getValue()));
                        } else {
                            if (!(invoke instanceof arrow.core.Either.Right)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            right = new arrow.core.Either.Right(((arrow.core.Either.Right) invoke).getValue());
                        }
                        defaultRaise3.bind(right);
                        com.paypal.oslo.core.webview.domain.repository.WebAuthSessionRepository webAuthSessionRepository = this.getHighSpeedVideoFpsRangesFor;
                        webAuthSessionAuthorizationUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(webAuthContext);
                        webAuthSessionAuthorizationUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        webAuthSessionAuthorizationUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise;
                        webAuthSessionAuthorizationUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        webAuthSessionAuthorizationUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise3;
                        webAuthSessionAuthorizationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        webAuthSessionAuthorizationUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        webAuthSessionAuthorizationUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        webAuthSessionAuthorizationUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        webAuthSessionAuthorizationUseCase$invoke$1.getOutputFormats = 1;
                        java.lang.Object transferNativeAuthSessionToWeb = webAuthSessionRepository.transferNativeAuthSessionToWeb(str, webAuthContext, webAuthSessionAuthorizationUseCase$invoke$1);
                        if (transferNativeAuthSessionToWeb == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = transferNativeAuthSessionToWeb;
                        raise = defaultRaise3;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = webAuthSessionAuthorizationUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i3 = webAuthSessionAuthorizationUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i4 = webAuthSessionAuthorizationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i5 = webAuthSessionAuthorizationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) webAuthSessionAuthorizationUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) webAuthSessionAuthorizationUseCase$invoke$1.getInputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right2 = new arrow.core.Either.Left(new com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.SessionAuthorizationFailure((com.paypal.oslo.core.webview.domain.models.WebAuthSessionError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right2 = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.core.webview.domain.models.WebAuthSession webAuthSession = (com.paypal.oslo.core.webview.domain.models.WebAuthSession) raise.bind(right2);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(webAuthSession);
            }
        }
        webAuthSessionAuthorizationUseCase$invoke$1 = new com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = webAuthSessionAuthorizationUseCase$invoke$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webAuthSessionAuthorizationUseCase$invoke$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.core.webview.domain.models.WebAuthSession webAuthSession2 = (com.paypal.oslo.core.webview.domain.models.WebAuthSession) raise.bind(right2);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(webAuthSession2);
    }
}
