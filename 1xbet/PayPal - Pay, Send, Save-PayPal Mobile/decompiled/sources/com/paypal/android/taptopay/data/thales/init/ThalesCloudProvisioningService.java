package com.paypal.android.taptopay.data.thales.init;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0080@¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/init/ThalesCloudProvisioningService;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/data/thales/init/ThalesCloudProvisioningInitError;", "init$tap_to_pay_data_thales_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThalesCloudProvisioningService {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    public ThalesCloudProvisioningService(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context.getApplicationContext();
    }

    public final java.lang.Object init$tap_to_pay_data_thales_release(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.ThalesCloudProvisioningInitError>> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        try {
            com.gemalto.mfs.mwsdk.payment.sdkconfig.SDKInitializer.INSTANCE.initialize(this.Camera2StreamConfigurationMap, new com.gemalto.mfs.mwsdk.payment.CustomConfiguration.Builder().keyValidityPeriod(90).build(), new com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener() { // from class: com.paypal.android.taptopay.data.thales.init.ThalesCloudProvisioningService$init$2$1
                @Override // com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener
                public final void onSetupComplete() {
                    kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.ThalesCloudProvisioningInitError>> continuation2 = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Success(kotlin.Unit.INSTANCE)));
                }

                @Override // com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener
                public final void onError(com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode> error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode errorCode = error.getErrorCode();
                    switch (errorCode == null ? -1 : com.paypal.android.taptopay.data.thales.init.ThalesCloudProvisioningService$init$2$1.WhenMappings.$EnumSwitchMapping$0[errorCode.ordinal()]) {
                        case 1:
                            kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.ThalesCloudProvisioningInitError>> continuation2 = safeContinuation2;
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            continuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Success(kotlin.Unit.INSTANCE)));
                            break;
                        case 2:
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            try {
                                kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.ThalesCloudProvisioningInitError>> continuation3 = safeContinuation2;
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                continuation3.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(com.paypal.android.taptopay.data.thales.init.ThalesCloudProvisioningInitError.RetryableError.INSTANCE)));
                                break;
                            } catch (java.lang.Throwable th) {
                                kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.ThalesCloudProvisioningInitError>> continuation4 = safeContinuation2;
                                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                                java.lang.String errorMessage = error.getErrorMessage();
                                com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode errorCode2 = error.getErrorCode();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("message: ");
                                sb.append(errorMessage);
                                sb.append(" | code: ");
                                sb.append(errorCode2);
                                continuation4.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.data.thales.init.ThalesCloudProvisioningInitError.DefaultError(sb.toString(), th))));
                                return;
                            }
                        default:
                            kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.ThalesCloudProvisioningInitError>> continuation5 = safeContinuation2;
                            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                            java.lang.String errorMessage2 = error.getErrorMessage();
                            com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode errorCode3 = error.getErrorCode();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("message: ");
                            sb2.append(errorMessage2);
                            sb2.append(" | code: ");
                            sb2.append(errorCode3);
                            continuation5.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.data.thales.init.ThalesCloudProvisioningInitError.DefaultError(sb2.toString(), null, 2, null))));
                            break;
                    }
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public final /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.values().length];
                        try {
                            iArr[com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.SDK_INITIALIZED.ordinal()] = 1;
                        } catch (java.lang.NoSuchFieldError unused) {
                        }
                        try {
                            iArr[com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.SDK_INITIALIZING_IN_PROGRESS.ordinal()] = 2;
                        } catch (java.lang.NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.INTERNAL_COMPONENT_ERROR.ordinal()] = 3;
                        } catch (java.lang.NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.SDK_INIT_FAILED.ordinal()] = 4;
                        } catch (java.lang.NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.STORAGE_COMPONENT_ERROR.ordinal()] = 5;
                        } catch (java.lang.NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.INVALID_PREVIOUS_VERSION.ordinal()] = 6;
                        } catch (java.lang.NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.ASM_INIT_ERROR.ordinal()] = 7;
                        } catch (java.lang.NoSuchFieldError unused7) {
                        }
                        try {
                            iArr[com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode.ASM_MIGRATION_ERROR.ordinal()] = 8;
                        } catch (java.lang.NoSuchFieldError unused8) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // com.gemalto.mfs.mwsdk.sdkconfig.SDKControllerListener
                public final void onSetupProgress(com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState state, java.lang.String message) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                }
            });
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.data.thales.init.ThalesCloudProvisioningInitError.DefaultError("Internal exception", th))));
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
