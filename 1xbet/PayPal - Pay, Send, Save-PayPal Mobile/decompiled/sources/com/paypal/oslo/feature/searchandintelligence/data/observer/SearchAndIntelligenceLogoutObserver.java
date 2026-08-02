package com.paypal.oslo.feature.searchandintelligence.data.observer;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/observer/SearchAndIntelligenceLogoutObserver;", "Lcom/paypal/oslo/core/session/LogoutObserver;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/searchandintelligence/domain/InternalSearchAndIntelligence;", "internalSearchAndIntelligence", "Lkotlinx/coroutines/CoroutineDispatcher;", "observerDispatcher", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/searchandintelligence/domain/InternalSearchAndIntelligence;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/searchandintelligence/domain/InternalSearchAndIntelligence;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/searchandintelligence/domain/InternalSearchAndIntelligence;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SearchAndIntelligenceLogoutObserver implements com.paypal.oslo.core.session.LogoutObserver {
    public static final int $stable = 8;
    private final kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence getHighResolutionOutputSizeshNQ4ISI;

    public SearchAndIntelligenceLogoutObserver(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence internalSearchAndIntelligence, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSearchAndIntelligence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = userStore;
        this.getHighResolutionOutputSizeshNQ4ISI = internalSearchAndIntelligence;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.Camera2StreamConfigurationMap = CoroutineScope;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1(this, null), 3, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public SearchAndIntelligenceLogoutObserver(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence internalSearchAndIntelligence) {
        this(userStore, internalSearchAndIntelligence, kotlinx.coroutines.Dispatchers.getDefault());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSearchAndIntelligence, "");
    }
}
