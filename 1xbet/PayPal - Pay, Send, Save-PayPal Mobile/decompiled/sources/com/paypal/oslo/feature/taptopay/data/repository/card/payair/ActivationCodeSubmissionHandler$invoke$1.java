package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1", f = "ActivationCodeSubmissionHandler.kt", i = {0, 1, 1}, l = {81, 138}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "e"}, nl = {131, 144}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class ActivationCodeSubmissionHandler$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1(r0, r13.getHighSpeedVideoFpsRangesFor, null)).collect(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1.AnonymousClass1(r13.getHighSpeedVideoFpsRanges, r13.getHighSpeedVideoFpsRangesFor, r0), r13) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (r0.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Failed to send activation code: ".concat(java.lang.String.valueOf(r2)), null, 2, null), r13) != r1) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ActivationCodeSubmissionHandler: Exception while sending activation code", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("exception", e2.toString())), null, null, 12, null);
            java.lang.String message = e2.getMessage();
            if (message == null) {
                message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            }
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e2);
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = producerScope;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x01ef, code lost:
        
            if (r2.collect(r8, r3) == r4) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0115, code lost:
        
            if (r5.send(r6, r3) != r4) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0160, code lost:
        
            if (r6.send(r7, r3) != r4) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x022b, code lost:
        
            if (r7.send(r8, r3) == r4) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
        
            if (r2 != r4) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$1$emit$1 activationCodeSubmissionHandler$invoke$1$1$emit$1;
            com.payair.model.Response.Success success;
            com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher payairCardPaymentKeysReplenisher;
            java.lang.String str2;
            com.payair.model.Response response;
            java.lang.Object obj;
            com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler cardProvisionHandler;
            java.lang.String str3 = str;
            if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$1$emit$1) {
                activationCodeSubmissionHandler$invoke$1$1$emit$1 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$1$emit$1) continuation;
                if ((activationCodeSubmissionHandler$invoke$1$1$emit$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj2 = activationCodeSubmissionHandler$invoke$1$1$emit$1.getInputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (activationCodeSubmissionHandler$invoke$1$1$emit$1.getOutputFormats) {
                        case 0:
                            kotlin.ResultKt.throwOnFailure(obj2);
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running ActivationCodeSubmissionHandler", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", this.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to("authenticationMethodId", str3)), null, 4, null);
                            com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler activationCodeSubmissionHandler = this.Camera2StreamConfigurationMap;
                            java.lang.String str4 = this.getHighSpeedVideoFpsRangesFor;
                            activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            activationCodeSubmissionHandler$invoke$1$1$emit$1.getOutputFormats = 1;
                            obj2 = kotlinx.coroutines.BuildersKt.withContext(activationCodeSubmissionHandler.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$submitActivationCode$2(activationCodeSubmissionHandler, str4, str3, null), activationCodeSubmissionHandler$invoke$1$1$emit$1);
                            break;
                        case 1:
                            str3 = (java.lang.String) activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            com.payair.model.Response response2 = (com.payair.model.Response) obj2;
                            if (response2 instanceof com.payair.model.Response.Error) {
                                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ActivationCodeSubmissionHandler failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxInt(((com.payair.model.Response.Error) response2).getErrorCode()))), null, null, 12, null);
                                kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed digitizationFailed = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Code activation failed", null, 2, null);
                                activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response2);
                                activationCodeSubmissionHandler$invoke$1$1$emit$1.getOutputFormats = 2;
                                break;
                            } else {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(response2, "");
                                success = (com.payair.model.Response.Success) response2;
                                java.lang.Object data = success.getData();
                                if (!(data instanceof com.payair.model.ActivateCodeResponse)) {
                                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ActivationCodeSubmissionHandler failed to send activation code", null, null, null, 14, null);
                                    kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope2 = this.getHighSpeedVideoSizes;
                                    com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed digitizationFailed2 = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Code activation failed", null, 2, null);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response2);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getOutputFormats = 3;
                                    break;
                                } else if (data == com.payair.model.ActivateCodeResponse.SUCCESS) {
                                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Digitization Completed after yellow path", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", this.getHighSpeedVideoFpsRangesFor)), null, 4, null);
                                    payairCardPaymentKeysReplenisher = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                                    payairCardPaymentKeysReplenisher.replenishKeysIfNeeded(this.getHighSpeedVideoFpsRangesFor, false);
                                    kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope3 = this.getHighSpeedVideoSizes;
                                    com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted digitizationCompleted = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted(this.getHighSpeedVideoFpsRangesFor);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response2);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getOutputFormats = 4;
                                    if (producerScope3.send(digitizationCompleted, activationCodeSubmissionHandler$invoke$1$1$emit$1) != coroutine_suspended) {
                                        str2 = str3;
                                        response = response2;
                                        obj = data;
                                        cardProvisionHandler = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                                        kotlinx.coroutines.flow.Flow m20013invokeHG0u8IE$default = com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler.m20013invokeHG0u8IE$default(cardProvisionHandler, this.getHighSpeedVideoFpsRangesFor, 0L, 2, null);
                                        final kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope4 = this.getHighSpeedVideoSizes;
                                        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler.invoke.1.1.1
                                            @Override // kotlinx.coroutines.flow.FlowCollector
                                            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj3, kotlin.coroutines.Continuation continuation2) {
                                                java.lang.Object send = producerScope4.send((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) obj3, continuation2);
                                                return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                                            }
                                        };
                                        activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                        activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                                        activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success);
                                        activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        activationCodeSubmissionHandler$invoke$1$1$emit$1.getOutputFormats = 5;
                                        break;
                                    }
                                } else {
                                    com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError access$retrieveOtpError = com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler.access$retrieveOtpError(this.Camera2StreamConfigurationMap, (com.payair.model.ActivateCodeResponse) data);
                                    kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope5 = this.getHighSpeedVideoSizes;
                                    com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.OTPError oTPError = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.OTPError(access$retrieveOtpError, "Failed to send activation code");
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response2);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$retrieveOtpError);
                                    activationCodeSubmissionHandler$invoke$1$1$emit$1.getOutputFormats = 6;
                                    break;
                                }
                            }
                            return coroutine_suspended;
                        case 2:
                            kotlin.ResultKt.throwOnFailure(obj2);
                            return kotlin.Unit.INSTANCE;
                        case 3:
                            java.lang.Object obj3 = activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            return kotlin.Unit.INSTANCE;
                        case 4:
                            obj = activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                            success = (com.payair.model.Response.Success) activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRanges;
                            response = (com.payair.model.Response) activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
                            str2 = (java.lang.String) activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            cardProvisionHandler = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                            kotlinx.coroutines.flow.Flow m20013invokeHG0u8IE$default2 = com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler.m20013invokeHG0u8IE$default(cardProvisionHandler, this.getHighSpeedVideoFpsRangesFor, 0L, 2, null);
                            final kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope42 = this.getHighSpeedVideoSizes;
                            kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector2 = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler.invoke.1.1.1
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj32, kotlin.coroutines.Continuation continuation2) {
                                    java.lang.Object send = producerScope42.send((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) obj32, continuation2);
                                    return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                                }
                            };
                            activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                            activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success);
                            activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                            activationCodeSubmissionHandler$invoke$1$1$emit$1.getOutputFormats = 5;
                            break;
                        case 5:
                            java.lang.Object obj4 = activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            return kotlin.Unit.INSTANCE;
                        case 6:
                            java.lang.Object obj5 = activationCodeSubmissionHandler$invoke$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            return kotlin.Unit.INSTANCE;
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            activationCodeSubmissionHandler$invoke$1$1$emit$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$1$emit$1(this, continuation);
            java.lang.Object obj22 = activationCodeSubmissionHandler$invoke$1$1$emit$1.getInputFormats;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (activationCodeSubmissionHandler$invoke$1$1$emit$1.getOutputFormats) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(java.lang.String str, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler activationCodeSubmissionHandler, kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.Camera2StreamConfigurationMap = activationCodeSubmissionHandler;
            this.getHighSpeedVideoSizes = producerScope;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1 activationCodeSubmissionHandler$invoke$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        activationCodeSubmissionHandler$invoke$1.Camera2StreamConfigurationMap = obj;
        return activationCodeSubmissionHandler$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivationCodeSubmissionHandler$invoke$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler activationCodeSubmissionHandler, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = activationCodeSubmissionHandler;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
