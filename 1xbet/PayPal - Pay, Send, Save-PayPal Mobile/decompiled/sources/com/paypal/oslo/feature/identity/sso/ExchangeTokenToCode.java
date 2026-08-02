package com.paypal.oslo.feature.identity.sso;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B1\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/ExchangeTokenToCode;", "Lcom/paypal/oslo/feature/identity/api/TokenToCodeExchange;", "Lcom/paypal/oslo/feature/identity/sso/domain/usecase/TokenToCodeUseCase;", "tokenToCodeUseCase", "Lcom/paypal/oslo/feature/identity/shared/domain/PKCEGenerator;", "pkceGenerator", "Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;", "authConfigProvider", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "identityTokenStorage", "Lcom/paypal/oslo/feature/identity/sso/domain/repository/checkout/CheckoutWebSSOIntentStore;", "checkoutWebSSOIntentStore", "<init>", "(Lcom/paypal/oslo/feature/identity/sso/domain/usecase/TokenToCodeUseCase;Lcom/paypal/oslo/feature/identity/shared/domain/PKCEGenerator;Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;Lcom/paypal/oslo/feature/identity/sso/domain/repository/checkout/CheckoutWebSSOIntentStore;)V", "Lcom/paypal/oslo/feature/identity/api/model/TokenToCodeExchangeAuthenticationContext;", "authContext", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferError;", "Lcom/paypal/oslo/feature/identity/api/model/TokenToCodeExchangeData;", "exchangeTokenToCode", "(Lcom/paypal/oslo/feature/identity/api/model/TokenToCodeExchangeAuthenticationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/sso/domain/usecase/TokenToCodeUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/shared/domain/PKCEGenerator;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "Lcom/paypal/oslo/feature/identity/sso/domain/repository/checkout/CheckoutWebSSOIntentStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExchangeTokenToCode implements com.paypal.oslo.feature.identity.api.TokenToCodeExchange {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.config.AuthConfigProvider getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ExchangeTokenToCode(com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase tokenToCodeUseCase, com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator pKCEGenerator, com.paypal.oslo.core.identity.config.AuthConfigProvider authConfigProvider, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore checkoutWebSSOIntentStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenToCodeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pKCEGenerator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfigProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutWebSSOIntentStore, "");
        this.getHighResolutionOutputSizeshNQ4ISI = tokenToCodeUseCase;
        this.getHighSpeedVideoFpsRangesFor = pKCEGenerator;
        this.getHighSpeedVideoSizes = authConfigProvider;
        this.getHighSpeedVideoFpsRanges = identityTokenStorage;
        this.Camera2StreamConfigurationMap = checkoutWebSSOIntentStore;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c9, code lost:
    
        if (r11.getIntent() != com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x020d, code lost:
    
        if (r11.getIntent() != com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0296, code lost:
    
        r19.Camera2StreamConfigurationMap.setCheckoutWebSSOIntent(null);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Reset checkout WebSSO intent after exchange completion", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", r11.getIntent().name())), null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0294, code lost:
    
        if (r11.getIntent() != com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0251, code lost:
    
        if (r11.getIntent() != com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // com.paypal.oslo.feature.identity.api.TokenToCodeExchange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object exchangeTokenToCode(com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext tokenToCodeExchangeAuthenticationContext, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.WebSessionTransferError, com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeData>> continuation) {
        com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode$exchangeTokenToCode$1 exchangeTokenToCode$exchangeTokenToCode$1;
        int i;
        com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext tokenToCodeExchangeAuthenticationContext2;
        arrow.core.Either.Left left;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext tokenToCodeExchangeAuthenticationContext3;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext tokenToCodeExchangeAuthenticationContext4;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode$exchangeTokenToCode$1) {
                    exchangeTokenToCode$exchangeTokenToCode$1 = (com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode$exchangeTokenToCode$1) continuation;
                    if ((exchangeTokenToCode$exchangeTokenToCode$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                        exchangeTokenToCode$exchangeTokenToCode$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                        java.lang.Object obj = exchangeTokenToCode$exchangeTokenToCode$1.getOutputStallDuration;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = exchangeTokenToCode$exchangeTokenToCode$1.getOutputMinFrameDurationlomOqCM;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Starting token to code exchange", null, null, 6, null);
                            try {
                                defaultRaise = new arrow.core.raise.DefaultRaise(false);
                                try {
                                    arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                                    if (tokenToCodeExchangeAuthenticationContext.getIntent() == com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON) {
                                        this.getHighSpeedVideoFpsRanges.clearUserAccessTokenSilently();
                                        this.Camera2StreamConfigurationMap.setCheckoutWebSSOIntent(tokenToCodeExchangeAuthenticationContext.getIntent());
                                    }
                                    com.paypal.oslo.feature.identity.shared.domain.model.PKCEPair generate = this.getHighSpeedVideoFpsRangesFor.generate();
                                    java.lang.String challenge = generate.getChallenge();
                                    com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent = com.paypal.oslo.feature.identity.sso.data.mapper.SessionTransferIntentMapperKt.toAccessTokenExchangeIntent(tokenToCodeExchangeAuthenticationContext.getIntent());
                                    com.paypal.oslo.feature.identity.sso.domain.model.TokenToCodeRequest tokenToCodeRequest = new com.paypal.oslo.feature.identity.sso.domain.model.TokenToCodeRequest(tokenToCodeExchangeAuthenticationContext.getContext(), null, this.getHighSpeedVideoSizes.getConfig().getProxyClientId(), challenge, com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod.S256, accessTokenExchangeIntent);
                                    com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase tokenToCodeUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                                    tokenToCodeExchangeAuthenticationContext3 = tokenToCodeExchangeAuthenticationContext;
                                    try {
                                        exchangeTokenToCode$exchangeTokenToCode$1.getHighResolutionOutputSizeshNQ4ISI = tokenToCodeExchangeAuthenticationContext3;
                                        exchangeTokenToCode$exchangeTokenToCode$1.getOutputFormats = defaultRaise;
                                        exchangeTokenToCode$exchangeTokenToCode$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                                        exchangeTokenToCode$exchangeTokenToCode$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(generate);
                                        exchangeTokenToCode$exchangeTokenToCode$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(challenge);
                                        exchangeTokenToCode$exchangeTokenToCode$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accessTokenExchangeIntent);
                                        exchangeTokenToCode$exchangeTokenToCode$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenToCodeRequest);
                                        exchangeTokenToCode$exchangeTokenToCode$1.getOutputSizeshNQ4ISI = defaultRaise2;
                                        exchangeTokenToCode$exchangeTokenToCode$1.getHighSpeedVideoFpsRangesFor = 0;
                                        exchangeTokenToCode$exchangeTokenToCode$1.getHighSpeedVideoFpsRanges = 0;
                                        exchangeTokenToCode$exchangeTokenToCode$1.getHighSpeedVideoSizes = 0;
                                        exchangeTokenToCode$exchangeTokenToCode$1.Camera2StreamConfigurationMap = 0;
                                        exchangeTokenToCode$exchangeTokenToCode$1.getOutputMinFrameDurationlomOqCM = 1;
                                        java.lang.Object invoke = tokenToCodeUseCase.invoke(tokenToCodeRequest, exchangeTokenToCode$exchangeTokenToCode$1);
                                        if (invoke == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        raise = defaultRaise2;
                                        obj = invoke;
                                        tokenToCodeExchangeAuthenticationContext4 = tokenToCodeExchangeAuthenticationContext3;
                                    } catch (arrow.core.raise.RaiseCancellationException e) {
                                        e = e;
                                        defaultRaise.complete();
                                        left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                                        tokenToCodeExchangeAuthenticationContext4 = tokenToCodeExchangeAuthenticationContext3;
                                        if (tokenToCodeExchangeAuthenticationContext4.getIntent() == com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON) {
                                        }
                                        return left;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        defaultRaise.complete();
                                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                    }
                                } catch (arrow.core.raise.RaiseCancellationException e2) {
                                    e = e2;
                                    tokenToCodeExchangeAuthenticationContext3 = tokenToCodeExchangeAuthenticationContext;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                }
                            } catch (java.io.IOException e3) {
                                e = e3;
                                tokenToCodeExchangeAuthenticationContext2 = tokenToCodeExchangeAuthenticationContext;
                                com.paypal.oslo.feature.identity.LoggerKt.log.e("Network error:", e);
                                arrow.core.raise.DefaultRaise defaultRaise3 = new arrow.core.raise.DefaultRaise(false);
                                try {
                                    defaultRaise3.raise(com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.NetworkError.INSTANCE);
                                    throw new kotlin.KotlinNothingValueException();
                                } catch (arrow.core.raise.RaiseCancellationException e4) {
                                    defaultRaise3.complete();
                                    left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e4, defaultRaise3));
                                } catch (java.lang.Throwable th3) {
                                    defaultRaise3.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th3);
                                }
                            } catch (java.lang.IllegalArgumentException e5) {
                                e = e5;
                                tokenToCodeExchangeAuthenticationContext2 = tokenToCodeExchangeAuthenticationContext;
                                com.paypal.oslo.feature.identity.LoggerKt.log.e("Invalid redirect URI:", e);
                                arrow.core.raise.DefaultRaise defaultRaise4 = new arrow.core.raise.DefaultRaise(false);
                                try {
                                    defaultRaise4.raise(com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.InvalidRedirectUri.INSTANCE);
                                    throw new kotlin.KotlinNothingValueException();
                                } catch (arrow.core.raise.RaiseCancellationException e6) {
                                    defaultRaise4.complete();
                                    left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e6, defaultRaise4));
                                } catch (java.lang.Throwable th4) {
                                    defaultRaise4.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th4);
                                }
                            } catch (java.lang.SecurityException e7) {
                                e = e7;
                                tokenToCodeExchangeAuthenticationContext2 = tokenToCodeExchangeAuthenticationContext;
                                com.paypal.oslo.feature.identity.LoggerKt.log.e("Authentication failed:", e);
                                arrow.core.raise.DefaultRaise defaultRaise5 = new arrow.core.raise.DefaultRaise(false);
                                try {
                                    defaultRaise5.raise(com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.AuthenticationFailed.INSTANCE);
                                    throw new kotlin.KotlinNothingValueException();
                                } catch (arrow.core.raise.RaiseCancellationException e8) {
                                    defaultRaise5.complete();
                                    left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e8, defaultRaise5));
                                } catch (java.lang.Throwable th5) {
                                    defaultRaise5.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th5);
                                }
                            } catch (java.lang.Exception e9) {
                                e = e9;
                                tokenToCodeExchangeAuthenticationContext2 = tokenToCodeExchangeAuthenticationContext;
                                java.lang.String message = e.getMessage();
                                com.paypal.oslo.feature.identity.LoggerKt.log.e("Unknown error during token to code exchange:", e);
                                arrow.core.raise.DefaultRaise defaultRaise6 = new arrow.core.raise.DefaultRaise(false);
                                try {
                                    arrow.core.raise.DefaultRaise defaultRaise7 = defaultRaise6;
                                    if (message == null) {
                                        message = "Unknown error occurred";
                                    }
                                    defaultRaise7.raise(new com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown(message));
                                    throw new kotlin.KotlinNothingValueException();
                                } catch (arrow.core.raise.RaiseCancellationException e10) {
                                    defaultRaise6.complete();
                                    left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e10, defaultRaise6));
                                } catch (java.lang.Throwable th6) {
                                    defaultRaise6.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th6);
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                tokenToCodeExchangeAuthenticationContext2 = tokenToCodeExchangeAuthenticationContext;
                                if (tokenToCodeExchangeAuthenticationContext2.getIntent() == com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON) {
                                    this.Camera2StreamConfigurationMap.setCheckoutWebSSOIntent(null);
                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Reset checkout WebSSO intent after exchange completion", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", tokenToCodeExchangeAuthenticationContext2.getIntent().name())), null, 4, null);
                                }
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i2 = exchangeTokenToCode$exchangeTokenToCode$1.Camera2StreamConfigurationMap;
                            int i3 = exchangeTokenToCode$exchangeTokenToCode$1.getHighSpeedVideoSizes;
                            int i4 = exchangeTokenToCode$exchangeTokenToCode$1.getHighSpeedVideoFpsRanges;
                            int i5 = exchangeTokenToCode$exchangeTokenToCode$1.getHighSpeedVideoFpsRangesFor;
                            raise = (arrow.core.raise.Raise) exchangeTokenToCode$exchangeTokenToCode$1.getOutputSizeshNQ4ISI;
                            defaultRaise = (arrow.core.raise.DefaultRaise) exchangeTokenToCode$exchangeTokenToCode$1.getOutputFormats;
                            tokenToCodeExchangeAuthenticationContext4 = (com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext) exchangeTokenToCode$exchangeTokenToCode$1.getHighResolutionOutputSizeshNQ4ISI;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                            } catch (arrow.core.raise.RaiseCancellationException e11) {
                                e = e11;
                                tokenToCodeExchangeAuthenticationContext3 = tokenToCodeExchangeAuthenticationContext4;
                                defaultRaise.complete();
                                left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                                tokenToCodeExchangeAuthenticationContext4 = tokenToCodeExchangeAuthenticationContext3;
                                if (tokenToCodeExchangeAuthenticationContext4.getIntent() == com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON) {
                                }
                                return left;
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                defaultRaise.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                        }
                        com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeData tokenToCodeExchangeData = new com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeData(((com.paypal.oslo.core.identity.domain.model.SessionTransferData) raise.bind((arrow.core.Either) obj)).getAuthorizationCode());
                        defaultRaise.complete();
                        left = new arrow.core.Either.Right(tokenToCodeExchangeData);
                        if (tokenToCodeExchangeAuthenticationContext4.getIntent() == com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON) {
                            this.Camera2StreamConfigurationMap.setCheckoutWebSSOIntent(null);
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Reset checkout WebSSO intent after exchange completion", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", tokenToCodeExchangeAuthenticationContext4.getIntent().name())), null, 4, null);
                        }
                        return left;
                    }
                }
                if (i != 0) {
                }
                com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeData tokenToCodeExchangeData2 = new com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeData(((com.paypal.oslo.core.identity.domain.model.SessionTransferData) raise.bind((arrow.core.Either) obj)).getAuthorizationCode());
                defaultRaise.complete();
                left = new arrow.core.Either.Right(tokenToCodeExchangeData2);
                if (tokenToCodeExchangeAuthenticationContext4.getIntent() == com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON) {
                }
                return left;
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
        } catch (java.io.IOException e12) {
            e = e12;
        } catch (java.lang.IllegalArgumentException e13) {
            e = e13;
        } catch (java.lang.SecurityException e14) {
            e = e14;
        } catch (java.lang.Exception e15) {
            e = e15;
        }
        exchangeTokenToCode$exchangeTokenToCode$1 = new com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode$exchangeTokenToCode$1(this, continuation);
        java.lang.Object obj2 = exchangeTokenToCode$exchangeTokenToCode$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = exchangeTokenToCode$exchangeTokenToCode$1.getOutputMinFrameDurationlomOqCM;
    }
}
