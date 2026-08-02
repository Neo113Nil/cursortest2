package com.paypal.oslo.feature.taptopay.data.sdk;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J6\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2(\u0010\u0014\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/sdk/CompositeSdkInitializer;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;", "Ljavax/inject/Provider;", "thalesInitializerProvider", "payairInitializerProvider", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "Ljava/lang/Class;", "Landroid/app/Activity;", "paymentActivity", "", "baseUrl", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializationError;", "", "init", "(Ljava/lang/Class;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "p0", "Camera2StreamConfigurationMap", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljavax/inject/Provider;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CompositeSdkInitializer implements com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CompositeSdkInitializer(javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> provider, javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> provider2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider2, "");
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer
    public final java.lang.Object init(java.lang.Class<? extends android.app.Activity> cls, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError, kotlin.Unit>> continuation) {
        return kotlinx.coroutines.SupervisorKt.supervisorScope(new com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2(this, cls, str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError, kotlin.Unit>>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$initSdk$1 compositeSdkInitializer$initSdk$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$initSdk$1) {
                compositeSdkInitializer$initSdk$1 = (com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$initSdk$1) continuation;
                if ((compositeSdkInitializer$initSdk$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    compositeSdkInitializer$initSdk$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = compositeSdkInitializer$initSdk$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = compositeSdkInitializer$initSdk$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        compositeSdkInitializer$initSdk$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                        compositeSdkInitializer$initSdk$1.Camera2StreamConfigurationMap = 1;
                        obj = function1.invoke(compositeSdkInitializer$initSdk$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (arrow.core.Either) obj;
                }
            }
            if (i != 0) {
            }
            return (arrow.core.Either) obj;
        } catch (java.lang.Exception e) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError("SDK initialization threw an exception: ".concat(java.lang.String.valueOf(e.getClass().getSimpleName())), e));
        }
        compositeSdkInitializer$initSdk$1 = new com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$initSdk$1(this, continuation);
        java.lang.Object obj2 = compositeSdkInitializer$initSdk$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = compositeSdkInitializer$initSdk$1.Camera2StreamConfigurationMap;
    }
}
