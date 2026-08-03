package com.unity3d.ads.core.domain;

/* compiled from: AndroidHandleFocusCounters.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001b\u001a\u00020\u001cH\u0086\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000fH\u0002J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "focusRepository", "Lcom/unity3d/ads/core/data/repository/FocusRepository;", "isAdActivity", "Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "timeSource", "Lkotlin/time/TimeSource$WithComparableMarks;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/FocusRepository;Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/time/TimeSource$WithComparableMarks;)V", "focusTimesPerActivity", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlin/time/ComparableTimeMark;", "latestKnownActivityResumed", "getLatestKnownActivityResumed$annotations", "()V", "getLatestKnownActivityResumed", "()Ljava/lang/String;", "setLatestKnownActivityResumed", "(Ljava/lang/String;)V", "previousFocusState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/unity3d/ads/core/data/repository/FocusState;", "invoke", "", "onFocusStateChange", "newState", com.ironsource.X3.i.t0, "activityName", com.ironsource.X3.i.u0, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidHandleFocusCounters {
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher;
    private final com.unity3d.ads.core.data.repository.FocusRepository focusRepository;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.time.ComparableTimeMark> focusTimesPerActivity;
    private final com.unity3d.ads.core.domain.AndroidGetIsAdActivity isAdActivity;
    private volatile java.lang.String latestKnownActivityResumed;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.repository.FocusState> previousFocusState;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final kotlin.time.TimeSource.WithComparableMarks timeSource;

    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }

    public AndroidHandleFocusCounters(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.FocusRepository focusRepository, com.unity3d.ads.core.domain.AndroidGetIsAdActivity isAdActivity, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, kotlin.time.TimeSource.WithComparableMarks timeSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusRepository, "focusRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isAdActivity, "isAdActivity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = isAdActivity;
        this.defaultDispatcher = defaultDispatcher;
        this.timeSource = timeSource;
        this.focusTimesPerActivity = new java.util.concurrent.ConcurrentHashMap<>();
        this.previousFocusState = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
    }

    public /* synthetic */ AndroidHandleFocusCounters(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.FocusRepository focusRepository, com.unity3d.ads.core.domain.AndroidGetIsAdActivity androidGetIsAdActivity, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.time.TimeSource.Monotonic monotonic, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, coroutineDispatcher, (i & 16) != 0 ? kotlin.time.TimeSource.Monotonic.INSTANCE : monotonic);
    }

    public final java.lang.String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void setLatestKnownActivityResumed(java.lang.String str) {
        this.latestKnownActivityResumed = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(java.lang.String activityName) {
        this.latestKnownActivityResumed = activityName;
        this.focusTimesPerActivity.put(activityName, this.timeSource.markNow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(java.lang.String activityName) {
        java.lang.String str = this.latestKnownActivityResumed;
        if (str == null || kotlin.jvm.internal.Intrinsics.areEqual(str, activityName)) {
            kotlin.time.ComparableTimeMark remove = this.focusTimesPerActivity.remove(activityName);
            if (remove == null) {
                remove = this.timeSource.markNow();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(remove, "focusTimesPerActivity.re…) ?: timeSource.markNow()");
            this.sessionRepository.addTimeToGlobalAdsFocusTime((int) kotlin.time.Duration.m12157getInWholeMillisecondsimpl(remove.mo12136elapsedNowUwyO8pc()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(com.unity3d.ads.core.data.repository.FocusState newState) {
        com.unity3d.ads.core.data.repository.FocusState value;
        com.unity3d.ads.core.data.repository.FocusState focusState;
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.repository.FocusState> mutableStateFlow = this.previousFocusState;
        do {
            value = mutableStateFlow.getValue();
            focusState = value;
        } while (!mutableStateFlow.compareAndSet(value, newState));
        if (focusState == null || newState.getClass() == focusState.getClass()) {
            return;
        }
        this.sessionRepository.incrementFocusChangeCount();
    }

    public final void invoke() {
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(this.focusRepository.getFocusState(), new com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1(this, null)), kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.defaultDispatcher));
    }
}
