package kotlinx.coroutines.flow;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.BuilderInference;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.flow.internal.C1065a;
import kotlinx.coroutines.flow.internal.q;

/* renamed from: kotlinx.coroutines.flow.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1062g {
    public static InterfaceC1060e a(InterfaceC1060e interfaceC1060e, int i) {
        kotlinx.coroutines.channels.a aVar = kotlinx.coroutines.channels.a.a;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1) {
            aVar = kotlinx.coroutines.channels.a.b;
            i = 0;
        }
        int i2 = i;
        kotlinx.coroutines.channels.a aVar2 = aVar;
        return interfaceC1060e instanceof kotlinx.coroutines.flow.internal.q ? q.a.a((kotlinx.coroutines.flow.internal.q) interfaceC1060e, null, i2, aVar2, 1) : new kotlinx.coroutines.flow.internal.k(interfaceC1060e, null, i2, aVar2, 2);
    }

    public static final C1057b b(@BuilderInference Function2 function2) {
        return new C1057b(function2, EmptyCoroutineContext.INSTANCE, -2, kotlinx.coroutines.channels.a.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(InterfaceC1060e interfaceC1060e, InterfaceC1061f interfaceC1061f, ContinuationImpl continuationImpl) {
        C1072p c1072p;
        int i;
        Ref.ObjectRef objectRef;
        Throwable th;
        InterfaceC1120x0 interfaceC1120x0;
        CancellationException cancellationException;
        if (continuationImpl instanceof C1072p) {
            c1072p = (C1072p) continuationImpl;
            int i2 = c1072p.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1072p.c = i2 - Integer.MIN_VALUE;
                Object obj = c1072p.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1072p.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        C1073q c1073q = new C1073q(interfaceC1061f, objectRef2);
                        c1072p.a = objectRef2;
                        c1072p.c = 1;
                        if (interfaceC1060e.collect(c1073q, c1072p) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        objectRef = objectRef2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = c1072p.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = (Throwable) objectRef.element;
                if ((th == null && Intrinsics.areEqual(th, th)) || ((interfaceC1120x0 = (InterfaceC1120x0) c1072p.get$context().get(InterfaceC1120x0.a.a)) != null && interfaceC1120x0.isCancelled() && (cancellationException = interfaceC1120x0.getCancellationException()) != null && Intrinsics.areEqual(cancellationException, th))) {
                    throw th;
                }
                if (th != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    ExceptionsKt.addSuppressed(th, th);
                    throw th;
                }
                ExceptionsKt.addSuppressed(th, th);
                throw th;
            }
        }
        c1072p = new C1072p(continuationImpl);
        Object obj2 = c1072p.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1072p.c;
        if (i != 0) {
        }
        th = (Throwable) objectRef.element;
        if (th == null) {
        }
        if (th != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC1060e<T> d(InterfaceC1060e<? extends T> interfaceC1060e) {
        if (interfaceC1060e instanceof O) {
            return interfaceC1060e;
        }
        if (!(interfaceC1060e instanceof C1059d)) {
            return new C1059d(interfaceC1060e);
        }
        ((C1059d) interfaceC1060e).getClass();
        return interfaceC1060e;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, kotlinx.coroutines.internal.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(InterfaceC1060e interfaceC1060e, ContinuationImpl continuationImpl) {
        A a;
        int i;
        ?? r3;
        Ref.ObjectRef objectRef;
        C1065a e;
        y yVar;
        T t;
        if (continuationImpl instanceof A) {
            a = (A) continuationImpl;
            int i2 = a.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a.d = i2 - Integer.MIN_VALUE;
                Object obj = a.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = a.d;
                r3 = kotlinx.coroutines.flow.internal.t.a;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = r3;
                    y yVar2 = new y(objectRef2);
                    try {
                        a.a = objectRef2;
                        a.b = yVar2;
                        a.d = 1;
                        if (interfaceC1060e.collect(yVar2, a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (C1065a e2) {
                        objectRef = objectRef2;
                        e = e2;
                        yVar = yVar2;
                        if (e.a != yVar) {
                            throw e;
                        }
                        t = objectRef.element;
                        if (t == r3) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = a.b;
                    objectRef = a.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (C1065a e3) {
                        e = e3;
                        if (e.a != yVar) {
                        }
                        t = objectRef.element;
                        if (t == r3) {
                        }
                    }
                }
                t = objectRef.element;
                if (t == r3) {
                    return t;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        a = new A(continuationImpl);
        Object obj2 = a.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = a.d;
        r3 = kotlinx.coroutines.flow.internal.t.a;
        if (i != 0) {
        }
        t = objectRef.element;
        if (t == r3) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object f(InterfaceC1060e<? extends T> interfaceC1060e, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super T> continuation) {
        B b;
        int i;
        T t;
        Function2 function22;
        Ref.ObjectRef objectRef;
        C1065a e;
        z zVar;
        T t2;
        if (continuation instanceof B) {
            b = (B) continuation;
            int i2 = b.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b.e = i2 - Integer.MIN_VALUE;
                Object obj = b.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = b.e;
                t = (T) kotlinx.coroutines.flow.internal.t.a;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = t;
                    z zVar2 = new z(function2, objectRef2);
                    try {
                        b.a = (SuspendLambda) function2;
                        b.b = objectRef2;
                        b.c = zVar2;
                        b.e = 1;
                        if (interfaceC1060e.collect(zVar2, b) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function22 = function2;
                        objectRef = objectRef2;
                    } catch (C1065a e2) {
                        function22 = function2;
                        objectRef = objectRef2;
                        e = e2;
                        zVar = zVar2;
                        if (e.a != zVar) {
                        }
                        t2 = objectRef.element;
                        if (t2 == t) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = b.c;
                    objectRef = b.b;
                    function22 = (Function2) b.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (C1065a e3) {
                        e = e3;
                        if (e.a != zVar) {
                            throw e;
                        }
                        t2 = objectRef.element;
                        if (t2 == t) {
                        }
                    }
                }
                t2 = objectRef.element;
                if (t2 == t) {
                    return t2;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + function22);
            }
        }
        b = new B(continuation);
        Object obj2 = b.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = b.e;
        t = (T) kotlinx.coroutines.flow.internal.t.a;
        if (i != 0) {
        }
        t2 = objectRef.element;
        if (t2 == t) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object g(InterfaceC1060e<? extends T> interfaceC1060e, Continuation<? super T> continuation) {
        D d;
        int i;
        Ref.ObjectRef objectRef;
        C1065a e;
        C c;
        if (continuation instanceof D) {
            d = (D) continuation;
            int i2 = d.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d.d = i2 - Integer.MIN_VALUE;
                Object obj = d.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = d.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    C c2 = new C(objectRef2);
                    try {
                        d.a = objectRef2;
                        d.b = c2;
                        d.d = 1;
                        if (interfaceC1060e.collect(c2, d) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (C1065a e2) {
                        objectRef = objectRef2;
                        e = e2;
                        c = c2;
                        if (e.a != c) {
                            throw e;
                        }
                        return objectRef.element;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c = d.b;
                    objectRef = d.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (C1065a e3) {
                        e = e3;
                        if (e.a != c) {
                        }
                        return objectRef.element;
                    }
                }
                return objectRef.element;
            }
        }
        d = new D(continuation);
        Object obj2 = d.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = d.d;
        if (i != 0) {
        }
        return objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC1060e<T> h(InterfaceC1060e<? extends T> interfaceC1060e, CoroutineContext coroutineContext) {
        if (coroutineContext.get(InterfaceC1120x0.a.a) == null) {
            return Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE) ? interfaceC1060e : interfaceC1060e instanceof kotlinx.coroutines.flow.internal.q ? q.a.a((kotlinx.coroutines.flow.internal.q) interfaceC1060e, coroutineContext, 0, null, 6) : new kotlinx.coroutines.flow.internal.k(interfaceC1060e, coroutineContext, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }
}
