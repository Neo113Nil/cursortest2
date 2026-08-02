package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1", f = "PayairCardRepository.kt", i = {0}, l = {192}, m = "invokeSuspend", n = {"$this$channelFlow"}, nl = {231}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class PayairCardRepository$activateCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairCardRepository.activateCard called", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", this.getHighSpeedVideoFpsRangesFor)), 2, null);
            coroutineDispatcher = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, producerScope, null), this) == coroutine_suspended) {
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
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1$1", f = "PayairCardRepository.kt", i = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5}, l = {193, 204, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m = "invokeSuspend", n = {"this_$iv", "tokenDetails", "$i$f$fold", "$i$a$-fold-PayairCardRepository$activateCard$1$1$2", "this_$iv", "tokenDetails", "$i$f$fold", "$i$a$-fold-PayairCardRepository$activateCard$1$1$2", "this_$iv", "tokenDetails", "this_$iv", "authenticationMethods", "$i$f$fold", "$i$a$-fold-PayairCardRepository$activateCard$1$1$2", "$i$f$fold", "$i$a$-fold-PayairCardRepository$activateCard$1$1$2$2", "this_$iv", "tokenDetails", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-PayairCardRepository$activateCard$1$1$2", "$i$f$fold", "$i$a$-fold-PayairCardRepository$activateCard$1$1$2$1", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-PayairCardRepository$activateCard$1$1$1"}, nl = {394, 205, 396, 226, 211, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "I$1"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        java.lang.Object getHighSpeedVideoSizesFor;
        java.lang.Object getInputFormats;
        java.lang.Object getInputSizeshNQ4ISI;
        java.lang.Object getOutputFormats;
        int getOutputMinFrameDuration;
        java.lang.Object getOutputMinFrameDurationlomOqCM;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository getOutputSizes;
        int getOutputSizeshNQ4ISI;

        /* JADX WARN: Code restructure failed: missing block: B:18:0x015b, code lost:
        
            if (r14.send(r9, r19) == r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0195, code lost:
        
            if (r14.send(r4, r19) != r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
        
            if (r8.send(r2, r19) != r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x01c5, code lost:
        
            if (r8.send(r2, r19) == r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
        
            if (r2 != r1) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x015e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI;
            java.lang.Object highSpeedVideoFpsRanges;
            int i;
            kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope;
            arrow.core.Either either;
            java.lang.String str;
            com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository payairCardRepository;
            com.payair.model.TokenDetails tokenDetails;
            int i2;
            arrow.core.Either either2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.getOutputSizeshNQ4ISI) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getOutputSizeshNQ4ISI = 1;
                    highResolutionOutputSizeshNQ4ISI = this.getOutputSizes.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this);
                    break;
                case 1:
                    kotlin.ResultKt.throwOnFailure(obj);
                    highResolutionOutputSizeshNQ4ISI = obj;
                    arrow.core.Either either3 = (arrow.core.Either) highResolutionOutputSizeshNQ4ISI;
                    kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope2 = this.getHighSpeedVideoFpsRanges;
                    java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository payairCardRepository2 = this.getOutputSizes;
                    if (either3 instanceof arrow.core.Either.Right) {
                        com.payair.model.TokenDetails tokenDetails2 = (com.payair.model.TokenDetails) ((arrow.core.Either.Right) either3).getValue();
                        if (tokenDetails2.getTokenStatus() != com.payair.model.TokenStatus.INACTIVE) {
                            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairActivateCard failed, no pending activation for card", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", str2)), 2, null);
                            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed activationFailed = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed("No pending activation for card", null, 2, null);
                            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either3);
                            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenDetails2);
                            this.getHighResolutionOutputSizeshNQ4ISI = 0;
                            this.getHighSpeedVideoSizes = 0;
                            this.getOutputSizeshNQ4ISI = 2;
                            break;
                        } else {
                            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either3);
                            this.getHighSpeedVideoSizesFor = str2;
                            this.getOutputFormats = producerScope2;
                            this.getInputSizeshNQ4ISI = payairCardRepository2;
                            this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenDetails2);
                            this.getHighResolutionOutputSizeshNQ4ISI = 0;
                            this.getHighSpeedVideoSizes = 0;
                            this.getOutputSizeshNQ4ISI = 3;
                            highSpeedVideoFpsRanges = payairCardRepository2.getHighSpeedVideoFpsRanges(str2, this);
                            if (highSpeedVideoFpsRanges != coroutine_suspended) {
                                i = 0;
                                producerScope = producerScope2;
                                either = either3;
                                str = str2;
                                payairCardRepository = payairCardRepository2;
                                tokenDetails = tokenDetails2;
                                i2 = 0;
                                either2 = (arrow.core.Either) highSpeedVideoFpsRanges;
                                if (!(either2 instanceof arrow.core.Either.Right)) {
                                    java.util.List list = (java.util.List) ((arrow.core.Either.Right) either2).getValue();
                                    com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod selectIdentityVerificationMethod = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod(com.paypal.oslo.feature.taptopay.data.repository.card.payair.ExtensionsKt.toIdentityVerificationMethod(list), new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1$1$2$2$1(payairCardRepository, str, list, producerScope, null));
                                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenDetails);
                                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                                    this.getOutputMinFrameDurationlomOqCM = null;
                                    this.getHighResolutionOutputSizeshNQ4ISI = i2;
                                    this.getHighSpeedVideoSizes = i;
                                    this.Camera2StreamConfigurationMap = 0;
                                    this.getOutputMinFrameDuration = 0;
                                    this.getOutputSizeshNQ4ISI = 4;
                                    break;
                                } else if (either2 instanceof arrow.core.Either.Left) {
                                    com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure failure = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure) ((arrow.core.Either.Left) either2).getValue();
                                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenDetails);
                                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(failure);
                                    this.getOutputMinFrameDurationlomOqCM = null;
                                    this.getHighResolutionOutputSizeshNQ4ISI = i2;
                                    this.getHighSpeedVideoSizes = i;
                                    this.Camera2StreamConfigurationMap = 0;
                                    this.getOutputMinFrameDuration = 0;
                                    this.getOutputSizeshNQ4ISI = 5;
                                    break;
                                } else {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                            }
                        }
                    } else if (either3 instanceof arrow.core.Either.Left) {
                        com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure failure2 = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure) ((arrow.core.Either.Left) either3).getValue();
                        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either3);
                        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(failure2);
                        this.getHighResolutionOutputSizeshNQ4ISI = 0;
                        this.getHighSpeedVideoSizes = 0;
                        this.getOutputSizeshNQ4ISI = 6;
                        break;
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return coroutine_suspended;
                case 2:
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                case 3:
                    int i3 = this.getHighSpeedVideoSizes;
                    int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.payair.model.TokenDetails tokenDetails3 = (com.payair.model.TokenDetails) this.getOutputMinFrameDurationlomOqCM;
                    com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository payairCardRepository3 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository) this.getInputSizeshNQ4ISI;
                    kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputFormats;
                    java.lang.String str3 = (java.lang.String) this.getHighSpeedVideoSizesFor;
                    arrow.core.Either either4 = (arrow.core.Either) this.getInputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    producerScope = producerScope3;
                    either = either4;
                    str = str3;
                    payairCardRepository = payairCardRepository3;
                    tokenDetails = tokenDetails3;
                    i2 = i4;
                    i = i3;
                    highSpeedVideoFpsRanges = obj;
                    either2 = (arrow.core.Either) highSpeedVideoFpsRanges;
                    if (!(either2 instanceof arrow.core.Either.Right)) {
                    }
                    break;
                case 4:
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                case 5:
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                case 6:
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1.AnonymousClass1(this.getOutputSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository payairCardRepository, java.lang.String str, kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getOutputSizes = payairCardRepository;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoFpsRanges = producerScope;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1 payairCardRepository$activateCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        payairCardRepository$activateCard$1.getHighSpeedVideoSizes = obj;
        return payairCardRepository$activateCard$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairCardRepository$activateCard$1(java.lang.String str, com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository payairCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$activateCard$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = payairCardRepository;
    }
}
