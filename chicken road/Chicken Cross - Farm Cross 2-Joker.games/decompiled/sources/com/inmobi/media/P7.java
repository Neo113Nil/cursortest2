package com.inmobi.media;

import com.adjust.sdk.Constants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes6.dex */
public final class P7 extends AbstractC3796ih {
    public static final AtomicBoolean h = new AtomicBoolean(false);
    public final Mutex e;
    public Job f;
    public Job g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P7(Gh dao, C3903m9 listener, C3852kg networkHandler) {
        super(dao, listener, networkHandler);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.e = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.inmobi.media.AbstractC3796ih
    public final Object b(ContinuationImpl continuationImpl) {
        Object d = d(continuationImpl);
        return d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d : Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC3796ih
    public final Object c(ContinuationImpl continuationImpl) {
        if (h.compareAndSet(false, true)) {
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.e, null, null, new N7(this, null), 3, null);
        }
        Object d = d(continuationImpl);
        return d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:11:0x0045, B:13:0x0049, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:22:0x005e), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        E7 e7;
        int i;
        Mutex mutex;
        Job job;
        Job job2;
        Job launch$default;
        try {
            if (continuationImpl instanceof E7) {
                e7 = (E7) continuationImpl;
                int i2 = e7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    e7.d = i2 - Integer.MIN_VALUE;
                    Object obj = e7.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = e7.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.e;
                        e7.f6530a = mutex2;
                        e7.d = 1;
                        if (mutex2.lock(null, e7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = e7.f6530a;
                        ResultKt.throwOnFailure(obj);
                    }
                    job = this.g;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    this.g = null;
                    job2 = this.f;
                    if (job2 == null && job2.isActive()) {
                        return Unit.INSTANCE;
                    }
                    launch$default = BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.e, null, null, new F7(this, null), 3, null);
                    this.f = launch$default;
                    return Unit.INSTANCE;
                }
            }
            job = this.g;
            if (job != null) {
            }
            this.g = null;
            job2 = this.f;
            if (job2 == null) {
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.e, null, null, new F7(this, null), 3, null);
            this.f = launch$default;
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        e7 = new E7(this, continuationImpl);
        Object obj2 = e7.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = e7.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r7 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (h(r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:
    
        if (r7 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        G7 g7;
        Object obj;
        int i;
        Object obj2;
        if (continuationImpl instanceof G7) {
            g7 = (G7) continuationImpl;
            int i2 = g7.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g7.c = i2 - Integer.MIN_VALUE;
                obj = g7.f6576a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = g7.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!b()) {
                        return Unit.INSTANCE;
                    }
                    Gh gh = this.f7163a;
                    g7.c = 1;
                    obj = gh.a(Constants.HIGH, g7);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Number) obj).intValue() != 0) {
                    Intrinsics.checkNotNullExpressionValue("P7", "TAG");
                    g7.c = 2;
                    EnumC3599bh enumC3599bh = EnumC3599bh.f7030a;
                    if (this.d == EnumC3599bh.b) {
                        this.d = enumC3599bh;
                        obj2 = i(g7);
                        if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        obj2 = Unit.INSTANCE;
                    }
                } else {
                    g7.c = 3;
                }
                return coroutine_suspended;
            }
        }
        g7 = new G7(this, continuationImpl);
        obj = g7.f6576a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = g7.c;
        if (i != 0) {
        }
        if (((Number) obj).intValue() != 0) {
        }
        return coroutine_suspended2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(1:17))(5:21|22|(1:24)|25|(2:27|20))|18))|32|6|7|(0)(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (e(r0) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003c, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("P7", "TAG");
        r0 = "Error during high priority retry processing: " + r10.getMessage();
        r0 = com.inmobi.media.Ba.f6473a;
        com.inmobi.media.U9.a(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        H7 h7;
        int i;
        if (continuationImpl instanceof H7) {
            h7 = (H7) continuationImpl;
            int i2 = h7.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h7.c = i2 - Integer.MIN_VALUE;
                Object obj = h7.f6598a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = h7.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue("P7", "TAG");
                    int high = AbstractC3796ih.a().getMaxBatchSize().getHigh();
                    if (high <= 0) {
                        high = 1;
                    }
                    CoroutineScope coroutineScope = AbstractC3904ma.e;
                    Function1 i7 = new I7(this, high, null);
                    h7.c = 1;
                    if (a(coroutineScope, high, i7, h7) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                h7.c = 2;
            }
        }
        h7 = new H7(this, continuationImpl);
        Object obj2 = h7.f6598a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = h7.c;
        if (i != 0) {
        }
        h7.c = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(5:18|19|(1:21)|22|(1:24))|11|12|13))|29|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002f, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        throw r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("P7", "TAG");
        r0 = "Error processing pending high priority pings: " + r14.getMessage();
        r0 = com.inmobi.media.Ba.f6473a;
        com.inmobi.media.U9.a(r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        J7 j7;
        int i;
        if (continuationImpl instanceof J7) {
            j7 = (J7) continuationImpl;
            int i2 = j7.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j7.c = i2 - Integer.MIN_VALUE;
                Object obj = j7.f6644a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = j7.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue("P7", "TAG");
                    long currentTimeMillis = System.currentTimeMillis();
                    int high = AbstractC3796ih.a().getMaxBatchSize().getHigh();
                    if (high <= 0) {
                        high = 1;
                    }
                    CoroutineScope coroutineScope = AbstractC3904ma.e;
                    Function1 k7 = new K7(this, high, currentTimeMillis, null);
                    j7.c = 1;
                    if (a(coroutineScope, high, k7, j7) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        j7 = new J7(this, continuationImpl);
        Object obj2 = j7.f6644a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = j7.c;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:11:0x0047, B:13:0x004d, B:17:0x0053, B:19:0x0057, B:21:0x005d, B:24:0x0063, B:26:0x007a, B:29:0x0080), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[Catch: all -> 0x00b0, TRY_ENTER, TryCatch #0 {all -> 0x00b0, blocks: (B:11:0x0047, B:13:0x004d, B:17:0x0053, B:19:0x0057, B:21:0x005d, B:24:0x0063, B:26:0x007a, B:29:0x0080), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        L7 l7;
        int i;
        Mutex mutex;
        Job launch$default;
        try {
            if (continuationImpl instanceof L7) {
                l7 = (L7) continuationImpl;
                int i2 = l7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    l7.d = i2 - Integer.MIN_VALUE;
                    Object obj = l7.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = l7.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.e;
                        l7.f6690a = mutex2;
                        l7.d = 1;
                        if (mutex2.lock(null, l7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = l7.f6690a;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (b()) {
                        return Unit.INSTANCE;
                    }
                    Job job = this.g;
                    if (job != null && job.isActive()) {
                        return Unit.INSTANCE;
                    }
                    int high = AbstractC3796ih.a().getInterval().getHigh();
                    IntRange intRange = Tf.f6872a;
                    long j = high * 1000;
                    if (j <= 0) {
                        return Unit.INSTANCE;
                    }
                    Intrinsics.checkNotNullExpressionValue("P7", "TAG");
                    String str = "Scheduling high priority retry ping processing in " + j + " ms";
                    launch$default = BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.e, null, null, new M7(j, this, null), 3, null);
                    this.g = launch$default;
                    return Unit.INSTANCE;
                }
            }
            if (b()) {
            }
        } finally {
            mutex.unlock(null);
        }
        l7 = new L7(this, continuationImpl);
        Object obj2 = l7.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = l7.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:11:0x0045, B:13:0x0049, B:14:0x004c), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        O7 o7;
        int i;
        Mutex mutex;
        Job job;
        try {
            if (continuationImpl instanceof O7) {
                o7 = (O7) continuationImpl;
                int i2 = o7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    o7.d = i2 - Integer.MIN_VALUE;
                    Object obj = o7.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = o7.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.e;
                        o7.f6758a = mutex2;
                        o7.d = 1;
                        if (mutex2.lock(null, o7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = o7.f6758a;
                        ResultKt.throwOnFailure(obj);
                    }
                    job = this.g;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    this.g = null;
                    return Unit.INSTANCE;
                }
            }
            job = this.g;
            if (job != null) {
            }
            this.g = null;
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        o7 = new O7(this, continuationImpl);
        Object obj2 = o7.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = o7.d;
        if (i != 0) {
        }
    }
}
