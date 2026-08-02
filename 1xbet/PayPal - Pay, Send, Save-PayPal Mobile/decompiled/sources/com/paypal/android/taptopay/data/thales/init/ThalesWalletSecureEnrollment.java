package com.paypal.android.taptopay.data.thales.init;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0080@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/init/ThalesWalletSecureEnrollment;", "", "<init>", "()V", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/data/thales/init/InitError;", "init$tap_to_pay_data_thales_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThalesWalletSecureEnrollment {
    public final java.lang.Object init$tap_to_pay_data_thales_release(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        try {
            com.gemalto.mfs.mwsdk.provisioning.sdkconfig.WalletSecureEnrollmentBusinessService walletSecureEnrollmentBusinessService = com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getWalletSecureEnrollmentBusinessService();
            com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState state = walletSecureEnrollmentBusinessService.getState();
            int i = state == null ? -1 : com.paypal.android.taptopay.data.thales.init.ThalesWalletSecureEnrollment.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i == 1 || i == 2) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Success(kotlin.Unit.INSTANCE)));
            } else if (i != 3) {
                if (i == 4) {
                    if (!walletSecureEnrollmentBusinessService.startWalletSecureEnrollment(new com.gemalto.mfs.mwsdk.provisioning.listener.WalletSecureEnrollmentListener() { // from class: com.paypal.android.taptopay.data.thales.init.ThalesWalletSecureEnrollment$init$2$1
                        @Override // com.gemalto.mfs.mwsdk.provisioning.listener.WalletSecureEnrollmentListener
                        public final void onProgressUpdate(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState state2) {
                            if (state2 == com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_COMPLETED) {
                                kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> continuation2 = safeContinuation2;
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                continuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Success(kotlin.Unit.INSTANCE)));
                            }
                        }

                        @Override // com.gemalto.mfs.mwsdk.provisioning.listener.WalletSecureEnrollmentListener
                        public final void onError(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentError error) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                            com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
                            kotlin.Pair[] pairArr = new kotlin.Pair[5];
                            pairArr[0] = kotlin.TuplesKt.to("errorMessage", error.getErrorMessage());
                            pairArr[1] = kotlin.TuplesKt.to("cpsCode", java.lang.Integer.valueOf(error.getCpsErrorCode()));
                            pairArr[2] = kotlin.TuplesKt.to("sdkCode", error.getSdkErrorCode());
                            java.lang.Throwable causingException = error.getCausingException();
                            pairArr[3] = kotlin.TuplesKt.to("exception", causingException != null ? causingException.getMessage() : null);
                            pairArr[4] = kotlin.TuplesKt.to("statusCode", java.lang.Integer.valueOf(error.getHttpStatusCode()));
                            com.paypal.android.logger.Logger.e$default(log, "Enrollment failed", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
                            kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> continuation2 = safeContinuation2;
                            java.lang.String errorMessage = error.getErrorMessage();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorMessage, "");
                            com.paypal.android.taptopay.domain.Result.Failure failure = new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.data.thales.init.InitError(errorMessage, error.getCausingException()));
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            continuation2.resumeWith(kotlin.Result.m23436constructorimpl(failure));
                        }
                    })) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Couldn't start enrollment, start enrollment returned false", null, null, 6, null);
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.data.thales.init.InitError("startWalletSecureEnrollment() failed to start.", null, 2, null))));
                    }
                } else {
                    com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Unexpected enrollment serviceState received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", walletSecureEnrollmentBusinessService.getState())), null, null, 12, null);
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.data.thales.init.InitError("Unexpected null WalletSecureEnrollmentBusinessService.state.\nWas ThalesInitializer.init() called?", null, 2, null))));
                }
            }
        } catch (java.lang.Throwable th) {
            com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Unexpected enrollment failure", th);
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.data.thales.init.InitError("Internal exception", th))));
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.values().length];
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_COMPLETED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_NOT_REQUIRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_STARTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_REQUIRED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
