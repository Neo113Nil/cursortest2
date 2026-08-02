package com.paypal.oslo.feature.taptopay.data.payair.replenishment;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\u0017\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/replenishment/PayairCardPaymentKeysReplenisher;", "", "Lcom/payair/logic/managers/PaymentManager;", "paymentManager", "Lcom/paypal/oslo/feature/taptopay/data/payair/worker/PayairWorkManager;", "payairWorkManager", "Lcom/payair/logic/managers/TokenManager;", "tokenManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/payair/logic/managers/PaymentManager;Lcom/paypal/oslo/feature/taptopay/data/payair/worker/PayairWorkManager;Lcom/payair/logic/managers/TokenManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "digitizedCardId", "", "forceReplenishment", "", "replenishKeysIfNeeded", "(Ljava/lang/String;Z)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/payair/logic/managers/PaymentManager;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/payair/worker/PayairWorkManager;", "getOutputFormats", "Lcom/payair/logic/managers/TokenManager;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "Camera2StreamConfigurationMap", "", com.visa.cbp.getEncExpo.warmup, "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayairCardPaymentKeysReplenisher {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getOutputFormats;
    private final com.payair.logic.managers.PaymentManager getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.payair.logic.managers.TokenManager getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PayairCardPaymentKeysReplenisher(com.payair.logic.managers.PaymentManager paymentManager, com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager payairWorkManager, com.payair.logic.managers.TokenManager tokenManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payairWorkManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = paymentManager;
        this.getHighSpeedVideoFpsRanges = payairWorkManager;
        this.getHighSpeedVideoSizes = tokenManager;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
        this.getHighSpeedVideoFpsRangesFor = 5;
        this.getOutputFormats = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
    }

    public static /* synthetic */ void replenishKeysIfNeeded$default(com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher payairCardPaymentKeysReplenisher, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        payairCardPaymentKeysReplenisher.replenishKeysIfNeeded(str, z);
    }

    public final void replenishKeysIfNeeded(java.lang.String digitizedCardId, boolean forceReplenishment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getOutputFormats, null, null, new com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher$replenishKeysIfNeeded$1(forceReplenishment, this, digitizedCardId, null), 3, null);
    }
}
