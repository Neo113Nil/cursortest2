package com.unity3d.ads.core.data.datasource;

import android.os.SystemClock;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AppForegroundDurationObserver.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0017H\u0086\u0002J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AppForegroundDurationObserver;", "Lcom/unity3d/ads/core/data/datasource/ForegroundDurationReader;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "elapsedRealtimeProvider", "Lkotlin/Function0;", "", "initTimeProvider", "<init>", "(Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "accumulatedBackgroundMs", "Ljava/util/concurrent/atomic/AtomicLong;", "backgroundStartMs", "isInBackground", "Ljava/util/concurrent/atomic/AtomicBoolean;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "", "sessionDurationInForegroundMs", "getSessionDurationInForegroundMs", "()J", "currentAccumulatedBackgroundMs", "initTime", "now", "onBackground", "onForeground", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppForegroundDurationObserver implements ForegroundDurationReader {
    private final AtomicLong accumulatedBackgroundMs;
    private final AtomicLong backgroundStartMs;
    private final CoroutineDispatcher defaultDispatcher;
    private final Function0<Long> elapsedRealtimeProvider;
    private final Function0<Long> initTimeProvider;
    private final AtomicBoolean isInBackground;
    private final MutableStateFlow<Boolean> isRunning;
    private final LifecycleDataSource lifecycleDataSource;
    private final CoroutineScope scope;

    public AppForegroundDurationObserver(LifecycleDataSource lifecycleDataSource, CoroutineDispatcher defaultDispatcher, Function0<Long> elapsedRealtimeProvider, Function0<Long> initTimeProvider) {
        Intrinsics.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(elapsedRealtimeProvider, "elapsedRealtimeProvider");
        Intrinsics.checkNotNullParameter(initTimeProvider, "initTimeProvider");
        this.lifecycleDataSource = lifecycleDataSource;
        this.defaultDispatcher = defaultDispatcher;
        this.elapsedRealtimeProvider = elapsedRealtimeProvider;
        this.initTimeProvider = initTimeProvider;
        this.isRunning = StateFlowKt.MutableStateFlow(false);
        this.accumulatedBackgroundMs = new AtomicLong(0L);
        this.backgroundStartMs = new AtomicLong(0L);
        this.isInBackground = new AtomicBoolean(false);
        this.scope = CoroutineScopeKt.CoroutineScope(defaultDispatcher.plus(new AppForegroundDurationObserver$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE)));
    }

    public /* synthetic */ AppForegroundDurationObserver(LifecycleDataSource lifecycleDataSource, CoroutineDispatcher coroutineDispatcher, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleDataSource, coroutineDispatcher, (i & 4) != 0 ? new Function0() { // from class: com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                long elapsedRealtime;
                elapsedRealtime = SystemClock.elapsedRealtime();
                return Long.valueOf(elapsedRealtime);
            }
        } : function0, (i & 8) != 0 ? new Function0() { // from class: com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                long initializationTime;
                initializationTime = SdkProperties.getInitializationTime();
                return Long.valueOf(initializationTime);
            }
        } : function02);
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        MutableStateFlow<Boolean> mutableStateFlow = this.isRunning;
        do {
            value = mutableStateFlow.getValue();
            bool = value;
            bool.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, true));
        if (bool.booleanValue()) {
            return;
        }
        if (!this.lifecycleDataSource.appIsForeground()) {
            this.isInBackground.set(true);
            long longValue = this.initTimeProvider.invoke().longValue();
            AtomicLong atomicLong = this.backgroundStartMs;
            if (longValue == 0) {
                longValue = this.elapsedRealtimeProvider.invoke().longValue();
            }
            atomicLong.set(longValue);
        }
        FlowKt.launchIn(FlowKt.onEach(this.lifecycleDataSource.getAppActive(), new AppForegroundDurationObserver$invoke$2(this, null)), this.scope);
    }

    @Override // com.unity3d.ads.core.data.datasource.ForegroundDurationReader
    public long getSessionDurationInForegroundMs() {
        long longValue = this.initTimeProvider.invoke().longValue();
        if (longValue == 0) {
            return 0L;
        }
        long longValue2 = this.elapsedRealtimeProvider.invoke().longValue();
        return Math.max(0L, (longValue2 - longValue) - currentAccumulatedBackgroundMs(longValue, longValue2));
    }

    private final long currentAccumulatedBackgroundMs(long initTime, long now) {
        long j = this.accumulatedBackgroundMs.get();
        return !this.isInBackground.get() ? j : j + Math.max(0L, now - Math.max(this.backgroundStartMs.get(), initTime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackground() {
        if (this.isInBackground.compareAndSet(false, true)) {
            this.backgroundStartMs.set(this.elapsedRealtimeProvider.invoke().longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onForeground() {
        if (this.isInBackground.compareAndSet(true, false)) {
            long longValue = this.initTimeProvider.invoke().longValue();
            if (longValue == 0) {
                return;
            }
            long max = Math.max(this.backgroundStartMs.get(), longValue);
            this.accumulatedBackgroundMs.addAndGet(Math.max(0L, this.elapsedRealtimeProvider.invoke().longValue() - max));
        }
    }
}
