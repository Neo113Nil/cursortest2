package com.inmobi.media;

/* renamed from: com.inmobi.media.t2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2765t2 implements com.inmobi.media.C8 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f5457a;
    public final com.inmobi.media.On b;
    public final kotlinx.coroutines.flow.MutableStateFlow c;
    public final kotlinx.coroutines.sync.Mutex d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public kotlinx.coroutines.Job f;
    public final com.inmobi.media.Me g;

    public AbstractC2765t2(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Ln viewabilityModel, com.inmobi.media.On viewabilityCriteria, kotlinx.coroutines.flow.MutableStateFlow lifecycleObserver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewabilityCriteria, "viewabilityCriteria");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        this.f5457a = coroutineScope;
        this.b = viewabilityCriteria;
        this.c = lifecycleObserver;
        this.d = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.g = new com.inmobi.media.Me(coroutineScope, viewabilityModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.AbstractC2765t2 abstractC2765t2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2658p2 c2658p2;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        abstractC2765t2.getClass();
        try {
            if (continuationImpl instanceof com.inmobi.media.C2658p2) {
                c2658p2 = (com.inmobi.media.C2658p2) continuationImpl;
                int i2 = c2658p2.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2658p2.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2658p2.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2658p2.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = abstractC2765t2.d;
                        c2658p2.f5383a = mutex2;
                        c2658p2.d = 1;
                        if (mutex2.lock(null, c2658p2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c2658p2.f5383a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    com.inmobi.media.Sn c = abstractC2765t2.c();
                    com.inmobi.media.Fg fg = c.f4963a;
                    fg.f.set(true);
                    com.inmobi.media.L6.a(fg.e);
                    fg.e = null;
                    com.inmobi.media.L6.a(c.d.f4983a);
                    c.d.f4983a = null;
                    com.inmobi.media.L6.a(c.e);
                    c.e = null;
                    abstractC2765t2.g.b();
                    return kotlin.Unit.INSTANCE;
                }
            }
            com.inmobi.media.Sn c2 = abstractC2765t2.c();
            com.inmobi.media.Fg fg2 = c2.f4963a;
            fg2.f.set(true);
            com.inmobi.media.L6.a(fg2.e);
            fg2.e = null;
            com.inmobi.media.L6.a(c2.d.f4983a);
            c2.d.f4983a = null;
            com.inmobi.media.L6.a(c2.e);
            c2.e = null;
            abstractC2765t2.g.b();
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        c2658p2 = new com.inmobi.media.C2658p2(abstractC2765t2, continuationImpl);
        java.lang.Object obj2 = c2658p2.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2658p2.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:11:0x0048, B:13:0x0050, B:14:0x005b, B:16:0x0063, B:17:0x008c, B:22:0x0073, B:23:0x0056), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:11:0x0048, B:13:0x0050, B:14:0x005b, B:16:0x0063, B:17:0x008c, B:22:0x0073, B:23:0x0056), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:11:0x0048, B:13:0x0050, B:14:0x005b, B:16:0x0063, B:17:0x008c, B:22:0x0073, B:23:0x0056), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:11:0x0048, B:13:0x0050, B:14:0x005b, B:16:0x0063, B:17:0x008c, B:22:0x0073, B:23:0x0056), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(com.inmobi.media.AbstractC2765t2 abstractC2765t2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2685q2 c2685q2;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        abstractC2765t2.getClass();
        try {
            if (continuationImpl instanceof com.inmobi.media.C2685q2) {
                c2685q2 = (com.inmobi.media.C2685q2) continuationImpl;
                int i2 = c2685q2.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2685q2.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2685q2.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2685q2.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = abstractC2765t2.d;
                        c2685q2.f5403a = mutex2;
                        c2685q2.d = 1;
                        if (mutex2.lock(null, c2685q2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c2685q2.f5403a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (abstractC2765t2.e.get()) {
                        abstractC2765t2.g.b();
                    } else {
                        abstractC2765t2.g.a();
                    }
                    if (abstractC2765t2.e.get()) {
                        com.inmobi.media.Fg fg = abstractC2765t2.c().f4963a;
                        fg.b.setValue(com.inmobi.media.EnumC2391eo.f5188a);
                        fg.f.set(true);
                        com.inmobi.media.L6.a(fg.e);
                        fg.e = null;
                    } else {
                        com.inmobi.media.Fg fg2 = abstractC2765t2.c().f4963a;
                        fg2.f.set(false);
                        fg2.a();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (abstractC2765t2.e.get()) {
            }
            if (abstractC2765t2.e.get()) {
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        c2685q2 = new com.inmobi.media.C2685q2(abstractC2765t2, continuationImpl);
        java.lang.Object obj2 = c2685q2.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2685q2.d;
        if (i != 0) {
        }
    }

    public abstract com.inmobi.media.Sn c();

    @Override // com.inmobi.media.C8
    public final kotlinx.coroutines.flow.Flow b() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job launch$default2;
        if (this.f == null) {
            launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f5457a, null, null, new com.inmobi.media.C2632o2(this.c, null, this), 3, null);
            this.f = launch$default2;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        com.inmobi.media.Sn c = c();
        if (c.e == null) {
            com.inmobi.media.Fg fg = c.f4963a;
            fg.a();
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(c.b.f5004a, null, null, new com.inmobi.media.Qn(fg.b, null, c), 3, null);
            c.e = launch$default;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
        return kotlinx.coroutines.flow.FlowKt.onCompletion(kotlinx.coroutines.flow.FlowKt.onStart(c.c, new com.inmobi.media.C2710r2(this, null)), new com.inmobi.media.C2736s2(this, null));
    }

    @Override // com.inmobi.media.C8
    public final void a() {
        this.e.set(false);
        this.g.b();
        com.inmobi.media.Sn c = c();
        com.inmobi.media.Fg fg = c.f4963a;
        fg.f.set(true);
        com.inmobi.media.L6.a(fg.e);
        fg.e = null;
        com.inmobi.media.L6.a(c.d.f4983a);
        c.d.f4983a = null;
        com.inmobi.media.L6.a(c.e);
        c.e = null;
        com.inmobi.media.L6.a(this.f);
        this.f = null;
    }
}
