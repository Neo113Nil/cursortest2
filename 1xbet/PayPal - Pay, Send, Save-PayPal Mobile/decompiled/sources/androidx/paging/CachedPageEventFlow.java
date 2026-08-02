package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00150\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/paging/CachedPageEventFlow;", "", "T", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PageEvent;", "src", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)V", "", "close", "()V", "Landroidx/paging/PageEvent$Insert;", "getCachedEvent$paging_common", "()Landroidx/paging/PageEvent$Insert;", "Landroidx/paging/FlattenedPageController;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/paging/FlattenedPageController;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlin/collections/IndexedValue;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRanges", "downstreamFlow", "Lkotlinx/coroutines/flow/Flow;", "getDownstreamFlow", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CachedPageEventFlow<T> {
    private final kotlinx.coroutines.flow.SharedFlow<kotlin.collections.IndexedValue<androidx.paging.PageEvent<T>>> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<T>> downstreamFlow;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.paging.FlattenedPageController<T> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.collections.IndexedValue<androidx.paging.PageEvent<T>>> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job getHighSpeedVideoFpsRanges;

    public CachedPageEventFlow(kotlinx.coroutines.flow.Flow<? extends androidx.paging.PageEvent<T>> flow, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoSizes = new androidx.paging.FlattenedPageController<>();
        kotlinx.coroutines.flow.MutableSharedFlow<kotlin.collections.IndexedValue<androidx.paging.PageEvent<T>>> MutableSharedFlow = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(1, Integer.MAX_VALUE, kotlinx.coroutines.channels.BufferOverflow.SUSPEND);
        this.getHighSpeedVideoFpsRangesFor = MutableSharedFlow;
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.flow.FlowKt.onSubscription(MutableSharedFlow, new androidx.paging.CachedPageEventFlow$sharedForDownstream$1(this, null));
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.LAZY, new androidx.paging.CachedPageEventFlow$job$1(flow, this, null), 1, null);
        launch$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.paging.CachedPageEventFlow.m9251$r8$lambda$1Vvxxa0oYqlhB21vliMpMDc_4M(androidx.paging.CachedPageEventFlow.this, (java.lang.Throwable) obj);
            }
        });
        this.getHighSpeedVideoFpsRanges = launch$default;
        this.downstreamFlow = kotlinx.coroutines.flow.FlowKt.flow(new androidx.paging.CachedPageEventFlow$downstreamFlow$1(this, null));
    }

    public final void close() {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(this.getHighSpeedVideoFpsRanges, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<T>> getDownstreamFlow() {
        return this.downstreamFlow;
    }

    public final androidx.paging.PageEvent.Insert<T> getCachedEvent$paging_common() {
        androidx.paging.PageEvent pageEvent = (androidx.paging.PageEvent) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.getAsEvents());
        if (pageEvent == null || !(pageEvent instanceof androidx.paging.PageEvent.Insert)) {
            return null;
        }
        androidx.paging.PageEvent.Insert<T> insert = (androidx.paging.PageEvent.Insert) pageEvent;
        if (insert.getLoadType() == androidx.paging.LoadType.REFRESH) {
            return insert;
        }
        return null;
    }

    /* renamed from: $r8$lambda$1Vvxxa0oYqlhB-21vliMpMDc_4M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9251$r8$lambda$1Vvxxa0oYqlhB21vliMpMDc_4M(androidx.paging.CachedPageEventFlow cachedPageEventFlow, java.lang.Throwable th) {
        cachedPageEventFlow.getHighSpeedVideoFpsRangesFor.tryEmit(null);
        return kotlin.Unit.INSTANCE;
    }
}
