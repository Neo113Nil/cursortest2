package com.paypal.android.taptopay.data.thales.fcm;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0014\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenHandler;", "", "Landroid/content/Context;", "context", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;", "dataSource", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Landroid/content/Context;Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "p0", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenHandler$UpdateTokenResult;", "updateToken", "getHighSpeedVideoSizes", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Camera2StreamConfigurationMap", "Companion", "UpdateTokenResult"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PushNotificationTokenHandler {
    private static final com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.Companion Companion = new com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String SHARED_PREFS_NAME = "com.paypal.android.taptopay.data.thales.fcm.storage";

    @java.lang.Deprecated
    public static final int THALES_FCM_UPDATE_RETRIES = 3;

    @java.lang.Deprecated
    public static final long THALES_FCM_UPDATE_RETRY_DELAY_MS = 2000;

    @java.lang.Deprecated
    public static final java.lang.String TOKEN_KEY = "fcm_token";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    public PushNotificationTokenHandler(android.content.Context context, com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource pushNotificationTokenDataSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = pushNotificationTokenDataSource;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
        android.content.Context applicationContext = context.getApplicationContext();
        this.getHighResolutionOutputSizeshNQ4ISI = applicationContext;
        java.lang.String string = applicationContext.getSharedPreferences("com.paypal.android.taptopay.data.thales.fcm.storage", 0).getString(TOKEN_KEY, null);
        if (string != null) {
            pushNotificationTokenDataSource.notify(string);
        }
        com.google.firebase.messaging.FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.$r8$lambda$o0kv7XpGXxbIGlnbXRs07bn2qiE(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.this, task);
            }
        });
    }

    public /* synthetic */ PushNotificationTokenHandler(android.content.Context context, com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource pushNotificationTokenDataSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pushNotificationTokenDataSource, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenHandler$Companion;", "", "<init>", "()V", "", "SHARED_PREFS_NAME", "Ljava/lang/String;", "", "THALES_FCM_UPDATE_RETRIES", com.visa.cbp.getEncExpo.warmup, "", "THALES_FCM_UPDATE_RETRY_DELAY_MS", "J", com.visa.cbp.sdk.facade.data.Constants.TOKEN_KEY}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenHandler$UpdateTokenResult;", "", "<init>", "(Ljava/lang/String;I)V", "Skipped", "Success", "Failure"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateTokenResult {
        public static final com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult Failure;
        public static final com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult Skipped;
        public static final com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult Success;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult[] getHighSpeedVideoSizes;

        private UpdateTokenResult(java.lang.String str, int i) {
        }

        static {
            com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult updateTokenResult = new com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult("Skipped", 0);
            Skipped = updateTokenResult;
            com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult updateTokenResult2 = new com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult("Success", 1);
            Success = updateTokenResult2;
            com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult updateTokenResult3 = new com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult("Failure", 2);
            Failure = updateTokenResult3;
            com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult[] updateTokenResultArr = {updateTokenResult, updateTokenResult2, updateTokenResult3};
            getHighSpeedVideoSizes = updateTokenResultArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(updateTokenResultArr);
        }

        public static com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult[] values() {
            return (com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult valueOf(java.lang.String str) {
            return (com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult) java.lang.Enum.valueOf(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e2, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(2000, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00e2 -> B:11:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateToken(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult> continuation) {
        com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler$updateToken$1 pushNotificationTokenHandler$updateToken$1;
        int i;
        com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler pushNotificationTokenHandler;
        com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult updateTokenResult;
        java.lang.String str2;
        int i2;
        com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler pushNotificationTokenHandler2;
        java.lang.String str3;
        com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult updateTokenResult2;
        if (continuation instanceof com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler$updateToken$1) {
            pushNotificationTokenHandler$updateToken$1 = (com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler$updateToken$1) continuation;
            if ((pushNotificationTokenHandler$updateToken$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                pushNotificationTokenHandler$updateToken$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = pushNotificationTokenHandler$updateToken$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushNotificationTokenHandler$updateToken$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str, this.getHighResolutionOutputSizeshNQ4ISI.getSharedPreferences("com.paypal.android.taptopay.data.thales.fcm.storage", 0).getString(TOKEN_KEY, null))) {
                        return com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult.Skipped;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.getSharedPreferences("com.paypal.android.taptopay.data.thales.fcm.storage", 0).edit().putString(TOKEN_KEY, str).apply();
                    if (str != null) {
                        this.getHighSpeedVideoFpsRanges.notify(str);
                    }
                    if (com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getConfigurationState() != com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.CONFIGURED || com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getEnrollingBusinessService().isEnrolled() != com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_COMPLETE) {
                        return com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult.Skipped;
                    }
                    pushNotificationTokenHandler = this;
                    updateTokenResult = com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult.Failure;
                    str2 = str;
                    i2 = 3;
                    com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler$updateToken$1 pushNotificationTokenHandler$updateToken$12 = pushNotificationTokenHandler$updateToken$1;
                    com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult updateTokenResult3 = updateTokenResult;
                    if (i2 > 0) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = pushNotificationTokenHandler$updateToken$1.Camera2StreamConfigurationMap;
                        updateTokenResult2 = (com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult) pushNotificationTokenHandler$updateToken$1.getHighResolutionOutputSizeshNQ4ISI;
                        str3 = (java.lang.String) pushNotificationTokenHandler$updateToken$1.getHighSpeedVideoSizes;
                        pushNotificationTokenHandler2 = (com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler) pushNotificationTokenHandler$updateToken$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str2 = str3;
                        pushNotificationTokenHandler = pushNotificationTokenHandler2;
                        updateTokenResult = updateTokenResult2;
                        com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler$updateToken$1 pushNotificationTokenHandler$updateToken$122 = pushNotificationTokenHandler$updateToken$1;
                        com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult updateTokenResult32 = updateTokenResult;
                        if (i2 > 0) {
                            return updateTokenResult32;
                        }
                        pushNotificationTokenHandler$updateToken$122.getHighSpeedVideoFpsRangesFor = pushNotificationTokenHandler;
                        pushNotificationTokenHandler$updateToken$122.getHighSpeedVideoSizes = str2;
                        pushNotificationTokenHandler$updateToken$122.getHighResolutionOutputSizeshNQ4ISI = updateTokenResult32;
                        pushNotificationTokenHandler$updateToken$122.Camera2StreamConfigurationMap = i2;
                        pushNotificationTokenHandler$updateToken$122.getHighSpeedVideoFpsRanges = 1;
                        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str2, pushNotificationTokenHandler$updateToken$122);
                        if (highSpeedVideoFpsRanges != coroutine_suspended) {
                            com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler pushNotificationTokenHandler3 = pushNotificationTokenHandler;
                            str3 = str2;
                            obj = highSpeedVideoFpsRanges;
                            pushNotificationTokenHandler2 = pushNotificationTokenHandler3;
                            updateTokenResult2 = updateTokenResult32;
                            pushNotificationTokenHandler$updateToken$1 = pushNotificationTokenHandler$updateToken$122;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                return com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult.Success;
                            }
                            i2--;
                            pushNotificationTokenHandler$updateToken$1.getHighSpeedVideoFpsRangesFor = pushNotificationTokenHandler2;
                            pushNotificationTokenHandler$updateToken$1.getHighSpeedVideoSizes = str3;
                            pushNotificationTokenHandler$updateToken$1.getHighResolutionOutputSizeshNQ4ISI = updateTokenResult2;
                            pushNotificationTokenHandler$updateToken$1.Camera2StreamConfigurationMap = i2;
                            pushNotificationTokenHandler$updateToken$1.getHighSpeedVideoFpsRanges = 2;
                        }
                        return coroutine_suspended;
                    }
                    i2 = pushNotificationTokenHandler$updateToken$1.Camera2StreamConfigurationMap;
                    updateTokenResult2 = (com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler.UpdateTokenResult) pushNotificationTokenHandler$updateToken$1.getHighResolutionOutputSizeshNQ4ISI;
                    str3 = (java.lang.String) pushNotificationTokenHandler$updateToken$1.getHighSpeedVideoSizes;
                    pushNotificationTokenHandler2 = (com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler) pushNotificationTokenHandler$updateToken$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                    }
                }
            }
        }
        pushNotificationTokenHandler$updateToken$1 = new com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler$updateToken$1(this, continuation);
        java.lang.Object obj2 = pushNotificationTokenHandler$updateToken$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushNotificationTokenHandler$updateToken$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object getHighSpeedVideoFpsRanges(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        try {
            com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService().updatePushToken(str, new com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener() { // from class: com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler$updateThalesPushToken$2$1
                @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                public final void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    kotlin.coroutines.Continuation<java.lang.Boolean> continuation2 = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.FALSE));
                }

                @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                public final void onComplete() {
                    kotlin.coroutines.Continuation<java.lang.Boolean> continuation2 = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.TRUE));
                }

                @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                public final void onUnsupportedPushContent(android.os.Bundle bundle) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
                }

                @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
                public final void onServerMessage(java.lang.String tokenizedCardId, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage provisioningServiceMessage) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenizedCardId, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisioningServiceMessage, "");
                }
            });
        } catch (java.lang.Throwable th) {
            com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Error in Thales ProvisioningBusinessService.updatePushToken()", th);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)));
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static /* synthetic */ void $r8$lambda$o0kv7XpGXxbIGlnbXRs07bn2qiE(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler pushNotificationTokenHandler, com.google.android.gms.tasks.Task task) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful()) {
            com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("exception", task.getException());
            java.lang.Exception exception = task.getException();
            pairArr[1] = kotlin.TuplesKt.to("exceptionMessage", exception != null ? exception.getMessage() : null);
            com.paypal.android.logger.Logger.w$default(log, "Fetching FCM registration token failed.", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return;
        }
        java.lang.String str = (java.lang.String) task.getResult();
        if (str != null) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(pushNotificationTokenHandler.Camera2StreamConfigurationMap), null, null, new com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler$2$1$1(pushNotificationTokenHandler, str, null), 3, null);
            if (launch$default != null) {
                return;
            }
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "null FCM token", null, null, null, 14, null);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
    }
}
