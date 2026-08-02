package com.paypal.oslo.feature.onboarding.signup.phone.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl$startListening$1", f = "SmsRetrieverRepositoryImpl.kt", i = {0, 0, 0}, l = {71}, m = "invokeSuspend", n = {"$this$callbackFlow", "client", "task"}, nl = {74}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class SmsRetrieverRepositoryImpl$startListening$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope.mo9266trySendJP2dKIU(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Listening.INSTANCE);
            com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.INSTANCE.setListener(new com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.SmsListener() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl$startListening$1.1
                @Override // com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.SmsListener
                public final void onSmsReceived(java.lang.String message) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                    java.lang.String m16391extractOtpCodehSlSWII = com.paypal.oslo.feature.onboarding.signup.phone.data.util.OtpExtractor.INSTANCE.m16391extractOtpCodehSlSWII(message);
                    if (m16391extractOtpCodehSlSWII != null) {
                        producerScope.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Success(m16391extractOtpCodehSlSWII, null));
                    } else {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Failed to extract OTP from SMS message", null, null, 6, null);
                        producerScope.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Error(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverError.ExtractionFailed.INSTANCE));
                    }
                }

                @Override // com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.SmsListener
                public final void onTimeout() {
                    producerScope.mo9266trySendJP2dKIU(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Timeout.INSTANCE);
                }
            });
            context = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            com.google.android.gms.auth.api.phone.SmsRetrieverClient client = com.google.android.gms.auth.api.phone.SmsRetriever.getClient(context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(client, "");
            com.google.android.gms.tasks.Task<java.lang.Void> startSmsRetriever = client.startSmsRetriever();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(startSmsRetriever, "");
            startSmsRetriever.addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl$startListening$1$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl$startListening$1.Camera2StreamConfigurationMap(kotlinx.coroutines.channels.ProducerScope.this, exc);
                }
            });
            final com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl smsRetrieverRepositoryImpl = this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(client);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(startSmsRetriever);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl$startListening$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl$startListening$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl.this);
                }
            }, this) == coroutine_suspended) {
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl smsRetrieverRepositoryImpl) {
        smsRetrieverRepositoryImpl.stopListening();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void Camera2StreamConfigurationMap(kotlinx.coroutines.channels.ProducerScope producerScope, java.lang.Exception exc) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.onboarding.LoggerKt.log;
        kotlin.jvm.internal.Intrinsics.checkNotNull(exc);
        logger.e("SMS retriever failed to start", exc);
        producerScope.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Error(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverError.ClientStartFailed.INSTANCE));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl$startListening$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl$startListening$1 smsRetrieverRepositoryImpl$startListening$1 = new com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl$startListening$1(this.getHighSpeedVideoFpsRanges, continuation);
        smsRetrieverRepositoryImpl$startListening$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return smsRetrieverRepositoryImpl$startListening$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmsRetrieverRepositoryImpl$startListening$1(com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl smsRetrieverRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl$startListening$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = smsRetrieverRepositoryImpl;
    }
}
