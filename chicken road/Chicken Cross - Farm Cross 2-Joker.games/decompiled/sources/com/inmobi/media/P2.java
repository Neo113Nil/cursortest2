package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes6.dex */
public abstract class P2 implements InterfaceC3675e9 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f6773a;
    public final Lp b;
    public final MutableStateFlow c;
    public final Mutex d;
    public final AtomicBoolean e;
    public Job f;
    public final Ff g;

    public P2(CoroutineScope coroutineScope, Ip viewabilityModel, Lp viewabilityCriteria, MutableStateFlow lifecycleObserver) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        Intrinsics.checkNotNullParameter(viewabilityCriteria, "viewabilityCriteria");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        this.f6773a = coroutineScope;
        this.b = viewabilityCriteria;
        this.c = lifecycleObserver;
        this.d = MutexKt.Mutex$default(false, 1, null);
        this.e = new AtomicBoolean(false);
        this.g = new Ff(coroutineScope, viewabilityModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(P2 p2, ContinuationImpl continuationImpl) {
        L2 l2;
        int i;
        Mutex mutex;
        p2.getClass();
        try {
            if (continuationImpl instanceof L2) {
                l2 = (L2) continuationImpl;
                int i2 = l2.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    l2.d = i2 - Integer.MIN_VALUE;
                    Object obj = l2.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = l2.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = p2.d;
                        l2.f6686a = mutex2;
                        l2.d = 1;
                        if (mutex2.lock(null, l2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = l2.f6686a;
                        ResultKt.throwOnFailure(obj);
                    }
                    Pp c = p2.c();
                    Oh oh = c.f6790a;
                    oh.f.set(true);
                    AbstractC3787i7.a(oh.e);
                    oh.e = null;
                    AbstractC3787i7.a(c.d.f6812a);
                    c.d.f6812a = null;
                    AbstractC3787i7.a(c.e);
                    c.e = null;
                    p2.g.b();
                    return Unit.INSTANCE;
                }
            }
            Pp c2 = p2.c();
            Oh oh2 = c2.f6790a;
            oh2.f.set(true);
            AbstractC3787i7.a(oh2.e);
            oh2.e = null;
            AbstractC3787i7.a(c2.d.f6812a);
            c2.d.f6812a = null;
            AbstractC3787i7.a(c2.e);
            c2.e = null;
            p2.g.b();
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        l2 = new L2(p2, continuationImpl);
        Object obj2 = l2.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = l2.d;
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
    public static final Object b(P2 p2, ContinuationImpl continuationImpl) {
        M2 m2;
        int i;
        Mutex mutex;
        p2.getClass();
        try {
            if (continuationImpl instanceof M2) {
                m2 = (M2) continuationImpl;
                int i2 = m2.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    m2.d = i2 - Integer.MIN_VALUE;
                    Object obj = m2.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = m2.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = p2.d;
                        m2.f6708a = mutex2;
                        m2.d = 1;
                        if (mutex2.lock(null, m2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = m2.f6708a;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (p2.e.get()) {
                        p2.g.b();
                    } else {
                        p2.g.a();
                    }
                    if (p2.e.get()) {
                        Oh oh = p2.c().f6790a;
                        oh.b.setValue(EnumC3580aq.f7019a);
                        oh.f.set(true);
                        AbstractC3787i7.a(oh.e);
                        oh.e = null;
                    } else {
                        Oh oh2 = p2.c().f6790a;
                        oh2.f.set(false);
                        oh2.a();
                    }
                    return Unit.INSTANCE;
                }
            }
            if (p2.e.get()) {
            }
            if (p2.e.get()) {
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        m2 = new M2(p2, continuationImpl);
        Object obj2 = m2.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = m2.d;
        if (i != 0) {
        }
    }

    public abstract Pp c();

    @Override // com.inmobi.media.InterfaceC3675e9
    public final Flow b() {
        Job launch$default;
        Job launch$default2;
        if (this.f == null) {
            launch$default2 = BuildersKt__Builders_commonKt.launch$default(this.f6773a, null, null, new K2(this.c, null, this), 3, null);
            this.f = launch$default2;
            Unit unit = Unit.INSTANCE;
        }
        Pp c = c();
        if (c.e == null) {
            Oh oh = c.f6790a;
            oh.a();
            launch$default = BuildersKt__Builders_commonKt.launch$default(c.b.f6836a, null, null, new Np(oh.b, null, c), 3, null);
            c.e = launch$default;
            Unit unit2 = Unit.INSTANCE;
        }
        return FlowKt.onCompletion(FlowKt.onStart(c.c, new N2(this, null)), new O2(this, null));
    }

    @Override // com.inmobi.media.InterfaceC3675e9
    public final void a() {
        this.e.set(false);
        this.g.b();
        Pp c = c();
        Oh oh = c.f6790a;
        oh.f.set(true);
        AbstractC3787i7.a(oh.e);
        oh.e = null;
        AbstractC3787i7.a(c.d.f6812a);
        c.d.f6812a = null;
        AbstractC3787i7.a(c.e);
        c.e = null;
        AbstractC3787i7.a(this.f);
        this.f = null;
    }
}
