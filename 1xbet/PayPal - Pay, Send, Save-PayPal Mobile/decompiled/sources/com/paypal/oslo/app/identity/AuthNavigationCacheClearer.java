package com.paypal.oslo.app.identity;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u000b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/app/identity/AuthNavigationCacheClearer;", "Lcom/paypal/oslo/core/session/LogoutObserver;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lcom/paypal/oslo/core/session/NetworkCacheClearer;", "networkCacheClearer", "Lkotlinx/coroutines/CoroutineDispatcher;", "observerDispatcher", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/session/NetworkCacheClearer;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/session/NetworkCacheClearer;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/session/NetworkCacheClearer;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuthNavigationCacheClearer implements com.paypal.oslo.core.session.LogoutObserver {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.session.NetworkCacheClearer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;

    public AuthNavigationCacheClearer(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.session.NetworkCacheClearer networkCacheClearer, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkCacheClearer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = networkCacheClearer;
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.Camera2StreamConfigurationMap = CoroutineScope;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1(this, null), 3, null);
    }

    public /* synthetic */ AuthNavigationCacheClearer(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.session.NetworkCacheClearer networkCacheClearer, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(appNavigator, networkCacheClearer, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getDefault() : coroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public AuthNavigationCacheClearer(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.session.NetworkCacheClearer networkCacheClearer) {
        this(appNavigator, networkCacheClearer, kotlinx.coroutines.Dispatchers.getDefault());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkCacheClearer, "");
    }
}
