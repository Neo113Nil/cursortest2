package com.paypal.oslo.feature.taptopay.data.thales;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesInitializerAdapter;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;", "Landroid/app/Application;", "application", "Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesInitializerFactory;", "thalesInitializerFactory", "<init>", "(Landroid/app/Application;Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesInitializerFactory;)V", "Ljava/lang/Class;", "Landroid/app/Activity;", "paymentActivity", "", "baseUrl", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializationError;", "", "init", "(Ljava/lang/Class;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroid/app/Application;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesInitializerFactory;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThalesInitializerAdapter implements com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerFactory getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.app.Application Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ThalesInitializerAdapter(android.app.Application application, com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerFactory thalesInitializerFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thalesInitializerFactory, "");
        this.Camera2StreamConfigurationMap = application;
        this.getHighSpeedVideoFpsRangesFor = thalesInitializerFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object init(java.lang.Class<? extends android.app.Activity> cls, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter$init$1 thalesInitializerAdapter$init$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter$init$1) {
            thalesInitializerAdapter$init$1 = (com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter$init$1) continuation;
            if ((thalesInitializerAdapter$init$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                thalesInitializerAdapter$init$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = thalesInitializerAdapter$init$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesInitializerAdapter$init$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Initializing Thales SDK", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paymentActivity", cls.getSimpleName())), null, 4, null);
                    com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerFactory thalesInitializerFactory = this.getHighSpeedVideoFpsRangesFor;
                    android.content.Context applicationContext = this.Camera2StreamConfigurationMap.getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerHandle create = thalesInitializerFactory.create(applicationContext, com.paypal.android.taptopay.data.thales.init.AppPaymentExperience.ONE_TAP, cls);
                    thalesInitializerAdapter$init$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cls);
                    thalesInitializerAdapter$init$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    thalesInitializerAdapter$init$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(create);
                    thalesInitializerAdapter$init$1.getHighSpeedVideoSizes = 1;
                    obj = create.init(thalesInitializerAdapter$init$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj);
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.android.taptopay.data.thales.init.InitError initError = (com.paypal.android.taptopay.data.thales.init.InitError) ((arrow.core.Either.Left) either).getValue();
                    return new arrow.core.Either.Left(new com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError(initError.getDebugMessage(), initError.getThrowable()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        thalesInitializerAdapter$init$1 = new com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter$init$1(this, continuation);
        java.lang.Object obj2 = thalesInitializerAdapter$init$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesInitializerAdapter$init$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj2);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }
}
