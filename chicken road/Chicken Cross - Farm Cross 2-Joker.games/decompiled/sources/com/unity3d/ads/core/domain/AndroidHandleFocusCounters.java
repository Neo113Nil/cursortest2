package com.unity3d.ads.core.domain;

import com.ironsource.U3;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AndroidHandleFocusCounters.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001bH\u0002J\t\u0010\"\u001a\u00020\u001dH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "focusRepository", "Lcom/unity3d/ads/core/data/repository/FocusRepository;", "isAdActivity", "Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "timeSource", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/FocusRepository;Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/time/TimeSource$WithComparableMarks;)V", "latestKnownActivityResumed", "", "getLatestKnownActivityResumed$annotations", "()V", "getLatestKnownActivityResumed", "()Ljava/lang/String;", "setLatestKnownActivityResumed", "(Ljava/lang/String;)V", "focusTimesPerActivity", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/time/ComparableTimeMark;", "previousFocusState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/unity3d/ads/core/data/repository/FocusState;", U3.i.u0, "", "activityName", U3.i.t0, "onFocusStateChange", "newState", "invoke", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidHandleFocusCounters {
    private final CoroutineDispatcher defaultDispatcher;
    private final FocusRepository focusRepository;
    private final ConcurrentHashMap<String, ComparableTimeMark> focusTimesPerActivity;
    private final AndroidGetIsAdActivity isAdActivity;
    private volatile String latestKnownActivityResumed;
    private final MutableStateFlow<FocusState> previousFocusState;
    private final SessionRepository sessionRepository;
    private final TimeSource.WithComparableMarks timeSource;

    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }

    public AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity isAdActivity, CoroutineDispatcher defaultDispatcher, TimeSource.WithComparableMarks timeSource) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(focusRepository, "focusRepository");
        Intrinsics.checkNotNullParameter(isAdActivity, "isAdActivity");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = isAdActivity;
        this.defaultDispatcher = defaultDispatcher;
        this.timeSource = timeSource;
        this.focusTimesPerActivity = new ConcurrentHashMap<>();
        this.previousFocusState = StateFlowKt.MutableStateFlow(null);
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, CoroutineDispatcher coroutineDispatcher, TimeSource.Monotonic monotonic, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, coroutineDispatcher, (i & 16) != 0 ? TimeSource.Monotonic.INSTANCE : monotonic);
    }

    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void setLatestKnownActivityResumed(String str) {
        this.latestKnownActivityResumed = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(String activityName) {
        this.latestKnownActivityResumed = activityName;
        this.focusTimesPerActivity.put(activityName, this.timeSource.markNow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(String activityName) {
        String str = this.latestKnownActivityResumed;
        if (str == null || Intrinsics.areEqual(str, activityName)) {
            ComparableTimeMark remove = this.focusTimesPerActivity.remove(activityName);
            if (remove == null) {
                remove = this.timeSource.markNow();
            }
            this.sessionRepository.addTimeToGlobalAdsFocusTime((int) Duration.m9437getInWholeMillisecondsimpl(remove.mo9416elapsedNowUwyO8pc()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState newState) {
        FocusState value;
        FocusState focusState;
        MutableStateFlow<FocusState> mutableStateFlow = this.previousFocusState;
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
        FlowKt.launchIn(FlowKt.onEach(this.focusRepository.getFocusState(), new AndroidHandleFocusCounters$invoke$1(this, null)), CoroutineScopeKt.CoroutineScope(this.defaultDispatcher));
    }
}
