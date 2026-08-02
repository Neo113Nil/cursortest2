package com.paypal.oslo.core.remoteconfig;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/RemoteConfigUserObserver;", "", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/paypal/oslo/core/remoteconfig/StatsigWrapper;", "statsigWrapper", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "appIdentity", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Lkotlinx/coroutines/CoroutineScope;Lcom/paypal/oslo/core/remoteconfig/StatsigWrapper;Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;)V", "", "startObserving", "()V", "getInputFormats", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/StatsigWrapper;", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Job;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/Job;", "Ljava/lang/Object;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RemoteConfigUserObserver {
    private kotlinx.coroutines.Job Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.AppIdentity getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.core.remoteconfig.StatsigWrapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public RemoteConfigUserObserver(com.paypal.oslo.core.userstore.UserStore userStore, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.core.remoteconfig.StatsigWrapper statsigWrapper, com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appIdentity, "");
        this.getHighSpeedVideoFpsRanges = userStore;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = statsigWrapper;
        this.getHighSpeedVideoSizes = appIdentity;
        this.getHighSpeedVideoSizesFor = new java.lang.Object();
    }

    public final void startObserving() {
        kotlinx.coroutines.Job launch$default;
        synchronized (this.getHighSpeedVideoSizesFor) {
            if (this.Camera2StreamConfigurationMap != null) {
                return;
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1(this, null), 3, null);
            this.Camera2StreamConfigurationMap = launch$default;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
