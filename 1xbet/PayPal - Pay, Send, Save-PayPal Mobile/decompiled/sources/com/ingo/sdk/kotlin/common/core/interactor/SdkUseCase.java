package com.ingo.sdk.kotlin.common.core.interactor;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\u0006\b\u0001\u0010\u0003 \u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/interactor/SdkUseCase;", "", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, "Params", "Lcom/ingo/sdk/kotlin/common/core/interactor/UseCase;", "", "scopeTimeout", "<init>", "(J)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "e", "", "trackCancellationException", "(Ljava/util/concurrent/CancellationException;)V", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "trackUseCaseException", "(Ljava/lang/Exception;)V", "J", "getScopeTimeout", "()J"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class SdkUseCase<Type, Params> extends com.ingo.sdk.kotlin.common.core.interactor.UseCase<Type, Params> {
    private final long scopeTimeout;

    public /* synthetic */ SdkUseCase(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 60000L : j);
    }

    @Override // com.ingo.sdk.kotlin.common.core.interactor.UseCase
    public long getScopeTimeout() {
        return this.scopeTimeout;
    }

    public SdkUseCase(long j) {
        super(0L, 1, null);
        this.scopeTimeout = j;
    }

    @Override // com.ingo.sdk.kotlin.common.core.interactor.UseCase
    public void trackCancellationException(java.util.concurrent.CancellationException e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            com.ingo.sdk.kotlin.common.analytics.IngoAnalytics ingoAnalytics = (com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj;
            java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "No Message";
            }
            defaultProperties$default.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ExceptionMessage, message);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            ingoAnalytics.trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.CancellationException, defaultProperties$default);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }

    @Override // com.ingo.sdk.kotlin.common.core.interactor.UseCase
    public void trackUseCaseException(java.lang.Exception e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            com.ingo.sdk.kotlin.common.analytics.IngoAnalytics ingoAnalytics = (com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj;
            java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "No Message";
            }
            defaultProperties$default.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ExceptionMessage, message);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            ingoAnalytics.trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.UseCaseException, defaultProperties$default);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }

    public SdkUseCase() {
        this(0L, 1, null);
    }
}
