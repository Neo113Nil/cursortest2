package com.paypal.oslo.feature.identity.sso;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/IdentitySessionTransferImpl;", "Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;", "Lcom/paypal/oslo/feature/identity/sso/domain/usecase/TokenToCodeUseCase;", "tokenToCodeUseCase", "Lcom/paypal/oslo/feature/identity/shared/domain/PKCEGenerator;", "pkceGenerator", "Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;", "authConfigProvider", "<init>", "(Lcom/paypal/oslo/feature/identity/sso/domain/usecase/TokenToCodeUseCase;Lcom/paypal/oslo/feature/identity/shared/domain/PKCEGenerator;Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;)V", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferAuthenticationContext;", "authenticationContext", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferError;", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferData;", "transferSessionToWeb", "(Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferAuthenticationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/sso/domain/usecase/TokenToCodeUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/shared/domain/PKCEGenerator;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdentitySessionTransferImpl implements com.paypal.oslo.core.identity.domain.IdentitySessionTransfer {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.config.AuthConfigProvider getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public IdentitySessionTransferImpl(com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase tokenToCodeUseCase, com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator pKCEGenerator, com.paypal.oslo.core.identity.config.AuthConfigProvider authConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenToCodeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pKCEGenerator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfigProvider, "");
        this.Camera2StreamConfigurationMap = tokenToCodeUseCase;
        this.getHighSpeedVideoFpsRanges = pKCEGenerator;
        this.getHighResolutionOutputSizeshNQ4ISI = authConfigProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0102 A[Catch: all -> 0x0058, RaiseCancellationException -> 0x005b, TRY_ENTER, TryCatch #14 {RaiseCancellationException -> 0x005b, all -> 0x0058, blocks: (B:11:0x0053, B:12:0x00f6, B:15:0x0102, B:18:0x0120, B:19:0x012f), top: B:10:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0120 A[Catch: all -> 0x0058, RaiseCancellationException -> 0x005b, TryCatch #14 {RaiseCancellationException -> 0x005b, all -> 0x0058, blocks: (B:11:0x0053, B:12:0x00f6, B:15:0x0102, B:18:0x0120, B:19:0x012f), top: B:10:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.core.identity.domain.IdentitySessionTransfer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object transferSessionToWeb(com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext webSessionTransferAuthenticationContext, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.WebSessionTransferError, com.paypal.oslo.core.identity.domain.model.WebSessionTransferData>> continuation) {
        com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl$transferSessionToWeb$1 identitySessionTransferImpl$transferSessionToWeb$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        com.paypal.oslo.core.identity.domain.model.SessionTransferData sessionTransferData;
        if (continuation instanceof com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl$transferSessionToWeb$1) {
            identitySessionTransferImpl$transferSessionToWeb$1 = (com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl$transferSessionToWeb$1) continuation;
            if ((identitySessionTransferImpl$transferSessionToWeb$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                identitySessionTransferImpl$transferSessionToWeb$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = identitySessionTransferImpl$transferSessionToWeb$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identitySessionTransferImpl$transferSessionToWeb$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Starting native to web session transfer for tenant: ".concat(java.lang.String.valueOf(webSessionTransferAuthenticationContext.getTenant())), null, null, 6, null);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise2;
                            com.paypal.oslo.feature.identity.shared.domain.model.PKCEPair generate = this.getHighSpeedVideoFpsRanges.generate();
                            java.lang.String challenge = generate.getChallenge();
                            com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent = com.paypal.oslo.feature.identity.sso.data.mapper.SessionTransferIntentMapperKt.toAccessTokenExchangeIntent(webSessionTransferAuthenticationContext.getIntent());
                            com.paypal.oslo.feature.identity.sso.domain.model.TokenToCodeRequest tokenToCodeRequest = new com.paypal.oslo.feature.identity.sso.domain.model.TokenToCodeRequest(webSessionTransferAuthenticationContext.getContext(), webSessionTransferAuthenticationContext.getRedirectUri(), this.getHighResolutionOutputSizeshNQ4ISI.getConfig().getProxyClientId(), challenge, com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod.S256, accessTokenExchangeIntent);
                            com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase tokenToCodeUseCase = this.Camera2StreamConfigurationMap;
                            identitySessionTransferImpl$transferSessionToWeb$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(webSessionTransferAuthenticationContext);
                            identitySessionTransferImpl$transferSessionToWeb$1.getInputFormats = defaultRaise2;
                            identitySessionTransferImpl$transferSessionToWeb$1.getHighSpeedVideoSizesFor = defaultRaise3;
                            identitySessionTransferImpl$transferSessionToWeb$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(generate);
                            identitySessionTransferImpl$transferSessionToWeb$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(challenge);
                            identitySessionTransferImpl$transferSessionToWeb$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accessTokenExchangeIntent);
                            identitySessionTransferImpl$transferSessionToWeb$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenToCodeRequest);
                            identitySessionTransferImpl$transferSessionToWeb$1.getOutputSizes = defaultRaise3;
                            identitySessionTransferImpl$transferSessionToWeb$1.Camera2StreamConfigurationMap = 0;
                            identitySessionTransferImpl$transferSessionToWeb$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            identitySessionTransferImpl$transferSessionToWeb$1.getHighSpeedVideoFpsRangesFor = 0;
                            identitySessionTransferImpl$transferSessionToWeb$1.getHighSpeedVideoFpsRanges = 0;
                            identitySessionTransferImpl$transferSessionToWeb$1.getOutputStallDurationlomOqCM = 1;
                            java.lang.Object invoke = tokenToCodeUseCase.invoke(tokenToCodeRequest, identitySessionTransferImpl$transferSessionToWeb$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            raise = defaultRaise3;
                            defaultRaise = defaultRaise2;
                            raise2 = raise;
                            obj = invoke;
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } catch (java.io.IOException unused) {
                        arrow.core.raise.DefaultRaise defaultRaise4 = new arrow.core.raise.DefaultRaise(false);
                        try {
                            defaultRaise4.raise(com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.NetworkError.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        } catch (arrow.core.raise.RaiseCancellationException e2) {
                            defaultRaise4.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise4));
                        } catch (java.lang.Throwable th2) {
                            defaultRaise4.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
                        }
                    } catch (java.lang.IllegalArgumentException unused2) {
                        arrow.core.raise.DefaultRaise defaultRaise5 = new arrow.core.raise.DefaultRaise(false);
                        try {
                            defaultRaise5.raise(com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.InvalidRedirectUri.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        } catch (arrow.core.raise.RaiseCancellationException e3) {
                            defaultRaise5.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e3, defaultRaise5));
                        } catch (java.lang.Throwable th3) {
                            defaultRaise5.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th3);
                        }
                    } catch (java.lang.SecurityException unused3) {
                        arrow.core.raise.DefaultRaise defaultRaise6 = new arrow.core.raise.DefaultRaise(false);
                        try {
                            defaultRaise6.raise(com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.AuthenticationFailed.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        } catch (arrow.core.raise.RaiseCancellationException e4) {
                            defaultRaise6.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e4, defaultRaise6));
                        } catch (java.lang.Throwable th4) {
                            defaultRaise6.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th4);
                        }
                    } catch (java.lang.Exception e5) {
                        java.lang.String message = e5.getMessage();
                        arrow.core.raise.DefaultRaise defaultRaise7 = new arrow.core.raise.DefaultRaise(false);
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise8 = defaultRaise7;
                            if (message == null) {
                                message = "Unknown error occurred";
                            }
                            defaultRaise8.raise(new com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown(message));
                            throw new kotlin.KotlinNothingValueException();
                        } catch (arrow.core.raise.RaiseCancellationException e6) {
                            defaultRaise7.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e6, defaultRaise7));
                        } catch (java.lang.Throwable th5) {
                            defaultRaise7.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th5);
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = identitySessionTransferImpl$transferSessionToWeb$1.getHighSpeedVideoFpsRanges;
                    int i3 = identitySessionTransferImpl$transferSessionToWeb$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = identitySessionTransferImpl$transferSessionToWeb$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = identitySessionTransferImpl$transferSessionToWeb$1.Camera2StreamConfigurationMap;
                    raise = (arrow.core.raise.Raise) identitySessionTransferImpl$transferSessionToWeb$1.getOutputSizes;
                    raise2 = (arrow.core.raise.Raise) identitySessionTransferImpl$transferSessionToWeb$1.getHighSpeedVideoSizesFor;
                    defaultRaise = (arrow.core.raise.DefaultRaise) identitySessionTransferImpl$transferSessionToWeb$1.getInputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e7) {
                        e = e7;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                sessionTransferData = (com.paypal.oslo.core.identity.domain.model.SessionTransferData) raise.bind((arrow.core.Either) obj);
                if (!(sessionTransferData instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferData)) {
                    com.paypal.oslo.core.identity.domain.model.WebSessionTransferData webSessionTransferData = new com.paypal.oslo.core.identity.domain.model.WebSessionTransferData(((com.paypal.oslo.core.identity.domain.model.WebSessionTransferData) sessionTransferData).getRedirectUrl(), ((com.paypal.oslo.core.identity.domain.model.WebSessionTransferData) sessionTransferData).getAuthorizationCode());
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(webSessionTransferData);
                }
                raise2.raise(new com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown("Session transfer data type mismatch"));
                throw new kotlin.KotlinNothingValueException();
            }
        }
        identitySessionTransferImpl$transferSessionToWeb$1 = new com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl$transferSessionToWeb$1(this, continuation);
        java.lang.Object obj2 = identitySessionTransferImpl$transferSessionToWeb$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identitySessionTransferImpl$transferSessionToWeb$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        sessionTransferData = (com.paypal.oslo.core.identity.domain.model.SessionTransferData) raise.bind((arrow.core.Either) obj2);
        if (!(sessionTransferData instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferData)) {
        }
    }
}
