package com.paypal.oslo.feature.pushnotification.delivery.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase$invoke$1", f = "HandleCommsPushNotificationUseCase.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {109, 142}, m = "invokeSuspend", n = {"$this$launch", "it", "$i$a$-firstNotNullOfOrNull-HandleCommsPushNotificationUseCase$invoke$1$notificationData$1", "$this$launch", "notificationData", "this_$iv", "it", "it", "$i$f$fold", "$i$a$-fold-HandleCommsPushNotificationUseCase$invoke$1$2", "$i$a$-let-HandleCommsPushNotificationUseCase$invoke$1$2$1"}, nl = {108, 142}, s = {"L$0", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes5.dex */
final class HandleCommsPushNotificationUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    private /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
    
        if (r8 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (r8 != r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0131, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012f, code lost:
    
        if (r5.invoke(r13, r21) == r2) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0075 -> B:12:0x0077). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Set set;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload validatedPayload;
        java.util.Iterator it;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationData notificationData;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer notificationRenderer;
        com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase trackPushNotificationImpressionUseCase;
        java.lang.Object tryMap;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            set = this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRangesFor;
            validatedPayload = this.getHighSpeedVideoFpsRanges;
            it = set.iterator();
            if (!it.hasNext()) {
                notificationData = null;
                if (notificationData != null) {
                    notificationRenderer = this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap;
                    arrow.core.Either<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError, kotlin.Unit> show = notificationRenderer.show(notificationData);
                    java.lang.String str = this.getHighSpeedVideoSizes;
                    java.lang.String str2 = this.Camera2StreamConfigurationMap;
                    java.lang.String str3 = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase handleCommsPushNotificationUseCase = this.getOutputMinFrameDurationlomOqCM;
                    if (show instanceof arrow.core.Either.Right) {
                        kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) show).getValue();
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Notification rendered successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str), kotlin.TuplesKt.to("campaign_id", str2)), null, 4, null);
                        if (str3 != null) {
                            trackPushNotificationImpressionUseCase = handleCommsPushNotificationUseCase.getHighResolutionOutputSizeshNQ4ISI;
                            this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(notificationData);
                            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(show);
                            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
                            this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                            this.getHighResolutionOutputSizeshNQ4ISI = 0;
                            this.getInputSizeshNQ4ISI = 0;
                            this.getOutputFormats = 0;
                            this.getOutputStallDuration = 2;
                        }
                    } else if (show instanceof arrow.core.Either.Left) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Failed to render notification", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str), kotlin.TuplesKt.to("campaign_id", str2), kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError) ((arrow.core.Either.Left) show).getValue()).toString())), null, 4, null);
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return kotlin.Unit.INSTANCE;
                }
                java.lang.String str4 = this.getHighSpeedVideoSizes;
                java.lang.String str5 = this.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload validatedPayload2 = this.getHighSpeedVideoFpsRanges;
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str4);
                pairArr[1] = kotlin.TuplesKt.to("campaign_id", str5);
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(validatedPayload2.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "";
                }
                pairArr[2] = kotlin.TuplesKt.to("payload_type", simpleName);
                com.paypal.android.logger.Logger.w$default(logger, "No mapper could handle validated payload", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper pushNotificationDataMapper = (com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper) it.next();
            this.getOutputStallDurationlomOqCM = coroutineScope;
            this.getOutputMinFrameDuration = validatedPayload;
            this.getInputFormats = it;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pushNotificationDataMapper);
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getOutputStallDuration = 1;
            tryMap = pushNotificationDataMapper.tryMap(validatedPayload, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            it = (java.util.Iterator) this.getInputFormats;
            validatedPayload = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            tryMap = obj;
            notificationData = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationData) tryMap;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase$invoke$1 handleCommsPushNotificationUseCase$invoke$1 = new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase$invoke$1(this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        handleCommsPushNotificationUseCase$invoke$1.getOutputStallDurationlomOqCM = obj;
        return handleCommsPushNotificationUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandleCommsPushNotificationUseCase$invoke$1(com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase handleCommsPushNotificationUseCase, com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload validatedPayload, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDurationlomOqCM = handleCommsPushNotificationUseCase;
        this.getHighSpeedVideoFpsRanges = validatedPayload;
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
    }
}
