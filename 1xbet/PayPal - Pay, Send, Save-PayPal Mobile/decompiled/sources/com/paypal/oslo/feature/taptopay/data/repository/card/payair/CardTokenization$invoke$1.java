package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1", f = "CardTokenization.kt", i = {0}, l = {71}, m = "invokeSuspend", n = {"$this$channelFlow"}, nl = {129}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class CardTokenization$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ byte[] getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Invoking CardTokenization", null, null, 6, null);
            coroutineDispatcher = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, producerScope, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1$1", f = "CardTokenization.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7}, l = {78, 82, 91, 100, 103, 111, 115, 125}, m = "invokeSuspend", n = {"encryptedCardForTokenization", "payairCardScheme", "encryptedCardForTokenization", "payairCardScheme", "result", "startTokenizeData", "encryptedCardForTokenization", "payairCardScheme", "result", "errorResult", "encryptedCardForTokenization", "payairCardScheme", "result", "errorResult", "encryptedCardForTokenization", "payairCardScheme", "result", "errorResult", "encryptedCardForTokenization", "payairCardScheme", "result", "errorResult", "retryResult", "startTokenizeData", "encryptedCardForTokenization", "payairCardScheme", "result", "errorResult", "retryResult", "retryErrorResult", "encryptedCardForTokenization", "payairCardScheme", "result", "errorResult"}, nl = {80, 83, 96, 101, 109, 113, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 100}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme getHighSpeedVideoFpsRanges;
        final /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> getHighSpeedVideoSizes;
        java.lang.Object getHighSpeedVideoSizesFor;
        java.lang.Object getInputFormats;
        java.lang.Object getInputSizeshNQ4ISI;
        java.lang.Object getOutputFormats;
        java.lang.Object getOutputMinFrameDuration;
        int getOutputMinFrameDurationlomOqCM;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization getOutputStallDuration;

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0231, code lost:
        
            if (com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization.access$processSuccessfulTokenization(r19.getOutputStallDuration, r3, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1.AnonymousClass1.AnonymousClass2(r19.getHighSpeedVideoSizes), r19) == r1) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x029b, code lost:
        
            if (r19.getHighSpeedVideoSizes.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Failed to digitize card after token refresh. Error code: ".concat(java.lang.String.valueOf(r5.getErrorCode())), null, 2, null), r19) == r1) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x01e4, code lost:
        
            if (r10 != r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x02dc, code lost:
        
            if (r19.getHighSpeedVideoSizes.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Authentication token refresh failed", null, 2, null), r19) == r1) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
        
            if (com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization.access$processSuccessfulTokenization(r19.getOutputStallDuration, r3, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1.AnonymousClass1.C01411(r19.getHighSpeedVideoSizes), r19) != r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x017e, code lost:
        
            if (r19.getHighSpeedVideoSizes.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("An unexpected error occurred. Error code: ".concat(java.lang.String.valueOf(r9.getErrorCode())), null, 2, null), r19) != r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
        
            if (r7 != r1) goto L17;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x029e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider hceConfigurationProvider;
            com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization;
            com.payair.model.CardScheme access$mapToPayairCardScheme;
            java.lang.Object startTokenize;
            com.payair.model.Response response;
            com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken;
            java.lang.Object refreshToken;
            com.payair.model.CardScheme cardScheme;
            com.payair.model.Response.Error error;
            com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization2;
            com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState tokenRefreshState;
            java.lang.Object startTokenize2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.getOutputMinFrameDurationlomOqCM) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str = new java.lang.String(this.getHighSpeedVideoFpsRangesFor, kotlin.text.Charsets.UTF_8);
                    hceConfigurationProvider = this.getOutputStallDuration.Camera2StreamConfigurationMap;
                    encryptedCardForTokenization = new com.payair.model.EncryptedCardForTokenization(str, hceConfigurationProvider.getPaymentAppProviderId());
                    access$mapToPayairCardScheme = com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization.access$mapToPayairCardScheme(this.getOutputStallDuration, this.getHighSpeedVideoFpsRanges);
                    com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization cardTokenization = this.getOutputStallDuration;
                    this.getHighResolutionOutputSizeshNQ4ISI = encryptedCardForTokenization;
                    this.getInputSizeshNQ4ISI = access$mapToPayairCardScheme;
                    this.getOutputMinFrameDurationlomOqCM = 1;
                    startTokenize = cardTokenization.getHighSpeedVideoFpsRanges.startTokenize(encryptedCardForTokenization, access$mapToPayairCardScheme, this.Camera2StreamConfigurationMap, this);
                    break;
                case 1:
                    access$mapToPayairCardScheme = (com.payair.model.CardScheme) this.getInputSizeshNQ4ISI;
                    com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization3 = (com.payair.model.EncryptedCardForTokenization) this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    encryptedCardForTokenization = encryptedCardForTokenization3;
                    startTokenize = obj;
                    response = (com.payair.model.Response) startTokenize;
                    if (response instanceof com.payair.model.Response.Success) {
                        java.lang.Object data = ((com.payair.model.Response.Success) response).getData();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
                        com.payair.model.StartTokenizeData startTokenizeData = (com.payair.model.StartTokenizeData) data;
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encryptedCardForTokenization);
                        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$mapToPayairCardScheme);
                        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(startTokenizeData);
                        this.getOutputMinFrameDurationlomOqCM = 2;
                        break;
                    } else {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(response, "");
                        com.payair.model.Response.Error error2 = (com.payair.model.Response.Error) response;
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "CardTokenization failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", kotlin.coroutines.jvm.internal.Boxing.boxInt(error2.getErrorCode()))), null, null, 12, null);
                        if (error2.getErrorCode() != 401) {
                            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encryptedCardForTokenization);
                            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$mapToPayairCardScheme);
                            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error2);
                            this.getOutputMinFrameDurationlomOqCM = 3;
                            break;
                        } else {
                            authToken = this.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI;
                            this.getHighResolutionOutputSizeshNQ4ISI = encryptedCardForTokenization;
                            this.getInputSizeshNQ4ISI = access$mapToPayairCardScheme;
                            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error2);
                            this.getOutputMinFrameDurationlomOqCM = 4;
                            refreshToken = authToken.refreshToken(this);
                            if (refreshToken != coroutine_suspended) {
                                com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization4 = encryptedCardForTokenization;
                                cardScheme = access$mapToPayairCardScheme;
                                error = error2;
                                encryptedCardForTokenization2 = encryptedCardForTokenization4;
                                tokenRefreshState = (com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState) refreshToken;
                                if (!(tokenRefreshState instanceof com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState.Success)) {
                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Token refresh succeeded, retrying tokenization", null, null, 6, null);
                                    com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization cardTokenization2 = this.getOutputStallDuration;
                                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encryptedCardForTokenization2);
                                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardScheme);
                                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error);
                                    this.getOutputMinFrameDurationlomOqCM = 5;
                                    startTokenize2 = cardTokenization2.getHighSpeedVideoFpsRanges.startTokenize(encryptedCardForTokenization2, cardScheme, this.Camera2StreamConfigurationMap, this);
                                    break;
                                } else {
                                    if (!(tokenRefreshState instanceof com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState.Failure)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Token refresh failed", null, null, null, 14, null);
                                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encryptedCardForTokenization2);
                                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardScheme);
                                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error);
                                    this.getOutputMinFrameDurationlomOqCM = 8;
                                    break;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 2:
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                case 3:
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                case 4:
                    error = (com.payair.model.Response.Error) this.getOutputMinFrameDuration;
                    response = (com.payair.model.Response) this.getInputFormats;
                    cardScheme = (com.payair.model.CardScheme) this.getInputSizeshNQ4ISI;
                    encryptedCardForTokenization2 = (com.payair.model.EncryptedCardForTokenization) this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    refreshToken = obj;
                    tokenRefreshState = (com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState) refreshToken;
                    if (!(tokenRefreshState instanceof com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState.Success)) {
                    }
                    return coroutine_suspended;
                case 5:
                    error = (com.payair.model.Response.Error) this.getOutputMinFrameDuration;
                    response = (com.payair.model.Response) this.getInputFormats;
                    cardScheme = (com.payair.model.CardScheme) this.getInputSizeshNQ4ISI;
                    encryptedCardForTokenization2 = (com.payair.model.EncryptedCardForTokenization) this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    startTokenize2 = obj;
                    com.payair.model.Response response2 = (com.payair.model.Response) startTokenize2;
                    if (!(response2 instanceof com.payair.model.Response.Success)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(response2, "");
                        com.payair.model.Response.Error error3 = (com.payair.model.Response.Error) response2;
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Retry CardTokenization failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", kotlin.coroutines.jvm.internal.Boxing.boxInt(error3.getErrorCode()))), null, null, 12, null);
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encryptedCardForTokenization2);
                        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardScheme);
                        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error);
                        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response2);
                        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error3);
                        this.getOutputMinFrameDurationlomOqCM = 7;
                        break;
                    } else {
                        java.lang.Object data2 = ((com.payair.model.Response.Success) response2).getData();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(data2, "");
                        com.payair.model.StartTokenizeData startTokenizeData2 = (com.payair.model.StartTokenizeData) data2;
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encryptedCardForTokenization2);
                        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardScheme);
                        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(error);
                        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response2);
                        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(startTokenizeData2);
                        this.getOutputMinFrameDurationlomOqCM = 6;
                        break;
                    }
                case 6:
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                case 7:
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                case 8:
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1$1$1, reason: invalid class name and collision with other inner class name */
        static final /* synthetic */ class C01411 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState addCardState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((kotlinx.coroutines.channels.ProducerScope) this.receiver).send(addCardState, continuation);
            }

            C01411(java.lang.Object obj) {
                super(2, obj, kotlinx.coroutines.channels.ProducerScope.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1$1$2, reason: invalid class name */
        static final /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState addCardState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((kotlinx.coroutines.channels.ProducerScope) this.receiver).send(addCardState, continuation);
            }

            AnonymousClass2(java.lang.Object obj) {
                super(2, obj, kotlinx.coroutines.channels.ProducerScope.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getOutputStallDuration, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(byte[] bArr, com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization cardTokenization, com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme, java.lang.String str, kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = bArr;
            this.getOutputStallDuration = cardTokenization;
            this.getHighSpeedVideoFpsRanges = cardScheme;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoSizes = producerScope;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1 cardTokenization$invoke$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        cardTokenization$invoke$1.getInputSizeshNQ4ISI = obj;
        return cardTokenization$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardTokenization$invoke$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization cardTokenization, byte[] bArr, com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardTokenization$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = cardTokenization;
        this.getHighSpeedVideoSizes = bArr;
        this.Camera2StreamConfigurationMap = cardScheme;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
