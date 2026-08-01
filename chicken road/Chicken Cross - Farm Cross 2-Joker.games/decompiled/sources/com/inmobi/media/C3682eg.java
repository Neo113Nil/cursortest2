package com.inmobi.media;

import com.adjust.sdk.Constants;
import java.util.concurrent.CancellationException;
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

/* renamed from: com.inmobi.media.eg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3682eg extends AbstractC3796ih {
    public final Mutex e;
    public Job f;
    public Job g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3682eg(Gh dao, O5 listener, C3852kg networkHandler) {
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
        Wf wf;
        int i;
        Mutex mutex;
        Job job;
        Job job2;
        Job launch$default;
        try {
            if (continuationImpl instanceof Wf) {
                wf = (Wf) continuationImpl;
                int i2 = wf.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wf.d = i2 - Integer.MIN_VALUE;
                    Object obj = wf.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = wf.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.e;
                        wf.f6933a = mutex2;
                        wf.d = 1;
                        if (mutex2.lock(null, wf) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = wf.f6933a;
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
                    launch$default = BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new Xf(this, null), 3, null);
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
            launch$default = BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new Xf(this, null), 3, null);
            this.f = launch$default;
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        wf = new Wf(this, continuationImpl);
        Object obj2 = wf.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wf.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r7 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (g(r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:
    
        if (r7 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        Yf yf;
        Object obj;
        int i;
        Object obj2;
        if (continuationImpl instanceof Yf) {
            yf = (Yf) continuationImpl;
            int i2 = yf.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yf.c = i2 - Integer.MIN_VALUE;
                obj = yf.f6973a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = yf.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!b()) {
                        return Unit.INSTANCE;
                    }
                    Gh gh = this.f7163a;
                    yf.c = 1;
                    obj = gh.a(Constants.NORMAL, yf);
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
                    yf.c = 2;
                    EnumC3599bh enumC3599bh = EnumC3599bh.f7030a;
                    if (this.d == EnumC3599bh.b) {
                        this.d = enumC3599bh;
                        obj2 = h(yf);
                        if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        obj2 = Unit.INSTANCE;
                    }
                } else {
                    yf.c = 3;
                }
                return coroutine_suspended;
            }
        }
        yf = new Yf(this, continuationImpl);
        obj = yf.f6973a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = yf.c;
        if (i != 0) {
        }
        if (((Number) obj).intValue() != 0) {
        }
        return coroutine_suspended2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(1:17))(5:21|22|(1:24)|25|(2:27|20))|18))|30|6|7|(0)(0)|18) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (e(r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        r0 = "Error during normal priority ping processing: " + r8.getMessage();
        r0 = com.inmobi.media.Ba.f6473a;
        com.inmobi.media.U9.a(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        Zf zf;
        int i;
        if (continuationImpl instanceof Zf) {
            zf = (Zf) continuationImpl;
            int i2 = zf.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zf.c = i2 - Integer.MIN_VALUE;
                Object obj = zf.f6992a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zf.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int normal = AbstractC3796ih.a().getMaxBatchSize().getNormal();
                    if (normal <= 0) {
                        normal = 1;
                    }
                    CoroutineScope coroutineScope = AbstractC3904ma.d;
                    Function1 c3570ag = new C3570ag(this, normal, null);
                    zf.c = 1;
                    if (a(coroutineScope, normal, c3570ag, zf) == coroutine_suspended) {
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
                zf.c = 2;
            }
        }
        zf = new Zf(this, continuationImpl);
        Object obj2 = zf.f6992a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zf.c;
        if (i != 0) {
        }
        zf.c = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #0 {all -> 0x00a9, blocks: (B:11:0x0047, B:13:0x004d, B:17:0x0053, B:19:0x0057, B:21:0x005d, B:24:0x0063, B:26:0x007a, B:29:0x0080), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[Catch: all -> 0x00a9, TRY_ENTER, TryCatch #0 {all -> 0x00a9, blocks: (B:11:0x0047, B:13:0x004d, B:17:0x0053, B:19:0x0057, B:21:0x005d, B:24:0x0063, B:26:0x007a, B:29:0x0080), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        C3598bg c3598bg;
        int i;
        Mutex mutex;
        Job launch$default;
        try {
            if (continuationImpl instanceof C3598bg) {
                c3598bg = (C3598bg) continuationImpl;
                int i2 = c3598bg.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3598bg.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3598bg.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3598bg.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.e;
                        c3598bg.f7029a = mutex2;
                        c3598bg.d = 1;
                        if (mutex2.lock(null, c3598bg) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c3598bg.f7029a;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (b()) {
                        return Unit.INSTANCE;
                    }
                    Job job = this.g;
                    if (job != null && job.isActive()) {
                        return Unit.INSTANCE;
                    }
                    int normal = AbstractC3796ih.a().getInterval().getNormal();
                    IntRange intRange = Tf.f6872a;
                    long j = normal * 1000;
                    if (j <= 0) {
                        return Unit.INSTANCE;
                    }
                    String str = "Scheduling normal priority ping processing in " + j + " ms";
                    launch$default = BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C3627cg(j, this, null), 3, null);
                    this.g = launch$default;
                    return Unit.INSTANCE;
                }
            }
            if (b()) {
            }
        } finally {
            mutex.unlock(null);
        }
        c3598bg = new C3598bg(this, continuationImpl);
        Object obj2 = c3598bg.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3598bg.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:11:0x0045, B:13:0x0049, B:14:0x004c), top: B:10:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        C3655dg c3655dg;
        int i;
        Mutex mutex;
        Job job;
        try {
            if (continuationImpl instanceof C3655dg) {
                c3655dg = (C3655dg) continuationImpl;
                int i2 = c3655dg.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3655dg.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3655dg.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3655dg.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.e;
                        c3655dg.f7069a = mutex2;
                        c3655dg.d = 1;
                        if (mutex2.lock(null, c3655dg) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c3655dg.f7069a;
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
        c3655dg = new C3655dg(this, continuationImpl);
        Object obj2 = c3655dg.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3655dg.d;
        if (i != 0) {
        }
    }
}
