package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes6.dex */
public final class Oh {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3609bq f6764a;
    public final MutableStateFlow b;
    public final CoroutineScope c;
    public final Qh d;
    public Job e;
    public final AtomicBoolean f;

    public Oh(CoroutineScope coroutineScope, Qh pollingVisibilityTrackerConfig, InterfaceC3609bq visibilityTrackedView) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(pollingVisibilityTrackerConfig, "pollingVisibilityTrackerConfig");
        Intrinsics.checkNotNullParameter(visibilityTrackedView, "visibilityTrackedView");
        Intrinsics.checkNotNullParameter(visibilityTrackedView, "visibilityTrackedView");
        this.f6764a = visibilityTrackedView;
        this.b = StateFlowKt.MutableStateFlow(EnumC3580aq.f7019a);
        this.c = coroutineScope;
        this.d = pollingVisibilityTrackerConfig;
        this.f = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r5, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0061 -> B:16:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Oh oh, ContinuationImpl continuationImpl) {
        Mh mh;
        int i;
        oh.getClass();
        if (continuationImpl instanceof Mh) {
            mh = (Mh) continuationImpl;
            int i2 = mh.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mh.c = i2 - Integer.MIN_VALUE;
                Object obj = mh.f6720a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mh.c;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        long j = oh.d.f6805a;
                        mh.c = 2;
                    } else if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
                if (!oh.f.get()) {
                    return Unit.INSTANCE;
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                Nh nh = new Nh(oh, null);
                mh.c = 1;
            }
        }
        mh = new Mh(oh, continuationImpl);
        Object obj2 = mh.f6720a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mh.c;
        if (i != 0) {
        }
        ResultKt.throwOnFailure(obj2);
        if (!oh.f.get()) {
        }
    }

    public final void a() {
        Job launch$default;
        if (this.f.get() || this.e != null) {
            return;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new Lh(this, null), 3, null);
        this.e = launch$default;
    }
}
