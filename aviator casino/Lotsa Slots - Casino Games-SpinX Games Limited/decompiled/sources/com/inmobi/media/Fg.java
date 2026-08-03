package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Fg {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.InterfaceC2418fo f4708a;
    public final kotlinx.coroutines.flow.MutableStateFlow b;
    public final kotlinx.coroutines.CoroutineScope c;
    public final com.inmobi.media.Hg d;
    public kotlinx.coroutines.Job e;
    public final java.util.concurrent.atomic.AtomicBoolean f;

    public Fg(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Hg pollingVisibilityTrackerConfig, com.inmobi.media.InterfaceC2418fo visibilityTrackedView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollingVisibilityTrackerConfig, "pollingVisibilityTrackerConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibilityTrackedView, "visibilityTrackedView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibilityTrackedView, "visibilityTrackedView");
        this.f4708a = visibilityTrackedView;
        this.b = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.inmobi.media.EnumC2391eo.f5188a);
        this.c = coroutineScope;
        this.d = pollingVisibilityTrackerConfig;
        this.f = new java.util.concurrent.atomic.AtomicBoolean(false);
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
    public static final java.lang.Object a(com.inmobi.media.Fg fg, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Dg dg;
        int i;
        fg.getClass();
        if (continuationImpl instanceof com.inmobi.media.Dg) {
            dg = (com.inmobi.media.Dg) continuationImpl;
            int i2 = dg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dg.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = dg.f4663a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dg.c;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        long j = fg.d.f4746a;
                        dg.c = 2;
                    } else if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (!fg.f.get()) {
                    return kotlin.Unit.INSTANCE;
                }
                kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
                com.inmobi.media.Eg eg = new com.inmobi.media.Eg(fg, null);
                dg.c = 1;
            }
        }
        dg = new com.inmobi.media.Dg(fg, continuationImpl);
        java.lang.Object obj2 = dg.f4663a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dg.c;
        if (i != 0) {
        }
        kotlin.ResultKt.throwOnFailure(obj2);
        if (!fg.f.get()) {
        }
    }

    public final void a() {
        kotlinx.coroutines.Job launch$default;
        if (this.f.get() || this.e != null) {
            return;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.inmobi.media.Cg(this, null), 3, null);
        this.e = launch$default;
    }
}
