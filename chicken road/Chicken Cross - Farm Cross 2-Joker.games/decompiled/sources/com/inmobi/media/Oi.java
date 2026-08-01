package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes6.dex */
public final class Oi {

    /* renamed from: a, reason: collision with root package name */
    public final Mutex f6765a = MutexKt.Mutex$default(false, 1, null);
    public WeakReference b = new WeakReference(null);
    public int c;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        Mi mi;
        int i;
        CoroutineContext coroutineContext;
        if (continuationImpl instanceof Mi) {
            mi = (Mi) continuationImpl;
            int i2 = mi.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mi.d = i2 - Integer.MIN_VALUE;
                Object obj = mi.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mi.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext context = mi.getContext();
                    System.out.println(mi.getContext());
                    if (Intrinsics.areEqual(this.b.get(), context)) {
                        this.c++;
                        return Unit.INSTANCE;
                    }
                    Mutex mutex = this.f6765a;
                    mi.f6721a = context;
                    mi.d = 1;
                    if (Mutex.DefaultImpls.lock$default(mutex, null, mi, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineContext = context;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineContext = mi.f6721a;
                    ResultKt.throwOnFailure(obj);
                }
                this.b = new WeakReference(coroutineContext);
                this.c = 1;
                return Unit.INSTANCE;
            }
        }
        mi = new Mi(this, continuationImpl);
        Object obj2 = mi.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mi.d;
        if (i != 0) {
        }
        this.b = new WeakReference(coroutineContext);
        this.c = 1;
        return Unit.INSTANCE;
    }

    public final Unit a(Ni ni) {
        CoroutineContext context = ni.getContext();
        System.out.println(ni.getContext());
        if (Intrinsics.areEqual(this.b.get(), context)) {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                this.b = new WeakReference(null);
                Mutex.DefaultImpls.unlock$default(this.f6765a, null, 1, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("ReentrantMutex is not locked by this coroutine.");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(2:18|19))(3:20|21|(1:24)(1:23)))(1:26))(1:30)|27|28))|36|6|7|(0)(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (a((kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        r0.f6745a = r8;
        r0.d = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (a(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        throw r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C3699f4 c3699f4, ContinuationImpl continuationImpl) {
        Ni ni;
        int i;
        C3699f4 c3699f42;
        if (continuationImpl instanceof Ni) {
            ni = (Ni) continuationImpl;
            int i2 = ni.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ni.d = i2 - Integer.MIN_VALUE;
                Object obj = ni.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ni.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ni.f6745a = c3699f4;
                    ni.d = 1;
                    c3699f42 = c3699f4;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            ni.f6745a = obj;
                            ni.d = 3;
                            return a(ni) == coroutine_suspended ? coroutine_suspended : obj;
                        }
                        if (i == 3) {
                            Object obj2 = ni.f6745a;
                            ResultKt.throwOnFailure(obj);
                            return obj2;
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) ni.f6745a;
                        ResultKt.throwOnFailure(obj);
                        throw th;
                    }
                    ?? r8 = (Function1) ni.f6745a;
                    ResultKt.throwOnFailure(obj);
                    c3699f42 = r8;
                }
                ni.f6745a = null;
                ni.d = 2;
                obj = c3699f42.invoke(ni);
            }
        }
        ni = new Ni(this, continuationImpl);
        Object obj3 = ni.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ni.d;
        if (i != 0) {
        }
        ni.f6745a = null;
        ni.d = 2;
        obj3 = c3699f42.invoke(ni);
    }
}
