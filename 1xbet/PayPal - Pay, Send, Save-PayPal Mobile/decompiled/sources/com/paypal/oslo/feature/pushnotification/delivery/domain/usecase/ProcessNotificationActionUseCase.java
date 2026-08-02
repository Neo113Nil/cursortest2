package com.paypal.oslo.feature.pushnotification.delivery.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessNotificationActionUseCase;", "", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationActionRepository;", "repository", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationActionRepository;Lcom/paypal/oslo/core/userstore/UserStore;)V", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "code", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessActionError;", "", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationActionRepository;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/userstore/UserStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProcessNotificationActionUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.userstore.UserStore Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationActionRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ProcessNotificationActionUseCase(com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationActionRepository notificationActionRepository, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationActionRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoSizes = notificationActionRepository;
        this.Camera2StreamConfigurationMap = userStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase$invoke$1 processNotificationActionUseCase$invoke$1;
        int i;
        java.lang.String str3;
        com.paypal.oslo.core.userstore.model.User user;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase$invoke$1) {
            processNotificationActionUseCase$invoke$1 = (com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase$invoke$1) continuation;
            if ((processNotificationActionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                processNotificationActionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = processNotificationActionUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = processNotificationActionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str4 = str;
                    if (kotlin.text.StringsKt.isBlank(str4) || kotlin.text.StringsKt.isBlank(str2)) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Missing required fields for ONE_CLICK_CTA processing", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("actionId_blank", java.lang.String.valueOf(kotlin.text.StringsKt.isBlank(str4))), kotlin.TuplesKt.to("code_blank", java.lang.String.valueOf(kotlin.text.StringsKt.isBlank(str2)))), null, 4, null);
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.InvalidInput.INSTANCE);
                    }
                    com.paypal.oslo.core.userstore.model.UserState value = this.Camera2StreamConfigurationMap.getUserState().getValue();
                    java.lang.String str5 = null;
                    com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
                    if (profileLoaded != null && (user = profileLoaded.getUser()) != null) {
                        str5 = user.getId();
                    }
                    if (str5 == null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "User not logged in, cannot process ONE_CLICK_CTA action", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("code", str2)), null, 4, null);
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.NotAuthenticated.INSTANCE);
                    }
                    com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationActionRepository notificationActionRepository = this.getHighSpeedVideoSizes;
                    processNotificationActionUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    processNotificationActionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = str2;
                    processNotificationActionUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                    processNotificationActionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = notificationActionRepository.processAction(str, str2, str5, processNotificationActionUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (java.lang.String) processNotificationActionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "ONE_CLICK_CTA API call failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("code", str3), kotlin.TuplesKt.to("error", callError.toString())), null, 4, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.ApiCallFailed(callError));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "ONE_CLICK_CTA API call succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("code", str3)), null, 4, null);
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "ONE_CLICK_CTA API call partial success, retrying", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("code", str3), kotlin.TuplesKt.to("error", callError2.toString())), null, 4, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.ApiCallFailed(callError2));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        processNotificationActionUseCase$invoke$1 = new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = processNotificationActionUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = processNotificationActionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
