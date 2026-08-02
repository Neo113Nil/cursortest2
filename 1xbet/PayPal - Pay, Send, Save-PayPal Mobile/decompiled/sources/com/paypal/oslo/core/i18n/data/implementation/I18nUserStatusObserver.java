package com.paypal.oslo.core.i18n.data.implementation;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/implementation/I18nUserStatusObserver;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/ReconfigureI18nUseCase;", "reconfigureI18nUseCase", "Lkotlinx/coroutines/CoroutineScope;", "applicationScope", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/ReconfigureI18nUseCase;Lkotlinx/coroutines/CoroutineScope;)V", "", "startObserving", "()V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/usecase/ReconfigureI18nUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class I18nUserStatusObserver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.ReconfigureI18nUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public I18nUserStatusObserver(com.paypal.oslo.core.i18n.domain.usecase.ReconfigureI18nUseCase reconfigureI18nUseCase, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reconfigureI18nUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighResolutionOutputSizeshNQ4ISI = reconfigureI18nUseCase;
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        this.Camera2StreamConfigurationMap = new java.lang.Object();
    }

    public final void startObserving() {
        kotlinx.coroutines.Job launch$default;
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoFpsRanges != null) {
                return;
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.i18n.data.implementation.I18nUserStatusObserver$startObserving$lambda$0$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE), null, new com.paypal.oslo.core.i18n.data.implementation.I18nUserStatusObserver$startObserving$1$1(this, null), 2, null);
            launch$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.data.implementation.I18nUserStatusObserver$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = com.paypal.oslo.core.i18n.data.implementation.I18nUserStatusObserver.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.i18n.data.implementation.I18nUserStatusObserver.this, (java.lang.Throwable) obj);
                    return highSpeedVideoFpsRangesFor;
                }
            });
            this.getHighSpeedVideoFpsRanges = launch$default;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.i18n.data.implementation.I18nUserStatusObserver i18nUserStatusObserver, java.lang.Throwable th) {
        synchronized (i18nUserStatusObserver.Camera2StreamConfigurationMap) {
            i18nUserStatusObserver.getHighSpeedVideoFpsRanges = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (th != null) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
            java.lang.String message = th.getMessage();
            if (message == null) {
                message = "normal completion";
            }
            com.paypal.android.logger.Logger.d$default(logger, "I18n user status observer stopped", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cause", message)), null, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
