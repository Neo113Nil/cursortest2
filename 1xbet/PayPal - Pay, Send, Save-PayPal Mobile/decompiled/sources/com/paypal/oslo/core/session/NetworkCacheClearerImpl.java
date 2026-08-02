package com.paypal.oslo.core.session;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/session/NetworkCacheClearerImpl;", "Lcom/paypal/oslo/core/session/NetworkCacheClearer;", "Lcom/paypal/oslo/core/session/ApolloCacheClearer;", "apolloCacheClearer", "Lcom/paypal/oslo/core/session/OkHttpCacheClearer;", "okHttpCacheClearer", "Lcom/paypal/oslo/core/session/CronetCacheClearer;", "cronetCacheClearer", "Lkotlinx/coroutines/CoroutineDispatcher;", "clearDispatcher", "<init>", "(Lcom/paypal/oslo/core/session/ApolloCacheClearer;Lcom/paypal/oslo/core/session/OkHttpCacheClearer;Lcom/paypal/oslo/core/session/CronetCacheClearer;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Lcom/paypal/oslo/core/session/ApolloCacheClearer;Lcom/paypal/oslo/core/session/OkHttpCacheClearer;Lcom/paypal/oslo/core/session/CronetCacheClearer;)V", "", "clearAllCaches", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/session/ApolloCacheClearer;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/session/OkHttpCacheClearer;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/session/CronetCacheClearer;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkCacheClearerImpl implements com.paypal.oslo.core.session.NetworkCacheClearer {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.session.CronetCacheClearer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.session.ApolloCacheClearer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.session.OkHttpCacheClearer getHighSpeedVideoFpsRangesFor;

    public NetworkCacheClearerImpl(com.paypal.oslo.core.session.ApolloCacheClearer apolloCacheClearer, com.paypal.oslo.core.session.OkHttpCacheClearer okHttpCacheClearer, com.paypal.oslo.core.session.CronetCacheClearer cronetCacheClearer, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCacheClearer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpCacheClearer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cronetCacheClearer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.Camera2StreamConfigurationMap = apolloCacheClearer;
        this.getHighSpeedVideoFpsRangesFor = okHttpCacheClearer;
        this.getHighSpeedVideoSizes = cronetCacheClearer;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
    }

    public /* synthetic */ NetworkCacheClearerImpl(com.paypal.oslo.core.session.ApolloCacheClearer apolloCacheClearer, com.paypal.oslo.core.session.OkHttpCacheClearer okHttpCacheClearer, com.paypal.oslo.core.session.CronetCacheClearer cronetCacheClearer, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(apolloCacheClearer, okHttpCacheClearer, cronetCacheClearer, (i & 8) != 0 ? kotlinx.coroutines.Dispatchers.getDefault() : coroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public NetworkCacheClearerImpl(com.paypal.oslo.core.session.ApolloCacheClearer apolloCacheClearer, com.paypal.oslo.core.session.OkHttpCacheClearer okHttpCacheClearer, com.paypal.oslo.core.session.CronetCacheClearer cronetCacheClearer) {
        this(apolloCacheClearer, okHttpCacheClearer, cronetCacheClearer, kotlinx.coroutines.Dispatchers.getDefault());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCacheClearer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpCacheClearer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cronetCacheClearer, "");
    }

    @Override // com.paypal.oslo.core.session.NetworkCacheClearer
    public final java.lang.Object clearAllCaches(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2(this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
