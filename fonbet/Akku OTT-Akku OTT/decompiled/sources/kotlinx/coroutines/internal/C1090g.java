package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC1083i0;
import kotlinx.coroutines.I;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.U0;
import kotlinx.coroutines.Z0;

@SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,297:1\n277#1,5:305\n282#1,12:311\n294#1:379\n281#1:381\n282#1,12:383\n294#1:412\n207#2,7:298\n214#2,23:326\n237#2,2:359\n239#2:363\n217#2:364\n219#2:380\n1#3:310\n1#3:382\n1#3:413\n186#4,3:323\n189#4,14:365\n186#4,17:395\n186#4,17:414\n103#5,10:349\n114#5,2:361\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n262#1:305,5\n262#1:311,12\n262#1:379\n267#1:381\n267#1:383,12\n267#1:412\n262#1:298,7\n262#1:326,23\n262#1:359,2\n262#1:363\n262#1:364\n262#1:380\n262#1:310\n267#1:382\n262#1:323,3\n262#1:365,14\n267#1:395,17\n293#1:414,17\n262#1:349,10\n262#1:361,2\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1090g {
    public static final x a = new x("UNDEFINED");

    @JvmField
    public static final x b = new x("REUSABLE_CLAIMED");

    public static final void a(Object obj, Continuation continuation) {
        if (!(continuation instanceof C1089f)) {
            continuation.resumeWith(obj);
            return;
        }
        C1089f c1089f = (C1089f) continuation;
        Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(obj);
        Object a2 = m1719exceptionOrNullimpl == null ? obj : new kotlinx.coroutines.A(m1719exceptionOrNullimpl, false);
        I i = c1089f.d;
        Continuation<T> continuation2 = c1089f.e;
        if (i.isDispatchNeeded(continuation2.get$context())) {
            c1089f.f = a2;
            c1089f.c = 1;
            c1089f.d.dispatch(continuation2.get$context(), c1089f);
            return;
        }
        AbstractC1083i0 a3 = U0.a();
        if (a3.a >= 4294967296L) {
            c1089f.f = a2;
            c1089f.c = 1;
            a3.X(c1089f);
            return;
        }
        a3.Y(true);
        try {
            InterfaceC1120x0 interfaceC1120x0 = (InterfaceC1120x0) continuation2.get$context().get(InterfaceC1120x0.a.a);
            if (interfaceC1120x0 == null || interfaceC1120x0.isActive()) {
                Object obj2 = c1089f.i;
                CoroutineContext coroutineContext = continuation2.get$context();
                Object c = C.c(coroutineContext, obj2);
                Z0<?> c2 = c != C.a ? kotlinx.coroutines.H.c(continuation2, coroutineContext, c) : null;
                try {
                    continuation2.resumeWith(obj);
                    Unit unit = Unit.INSTANCE;
                } finally {
                    if (c2 == null || c2.d0()) {
                        C.a(coroutineContext, c);
                    }
                }
            } else {
                c1089f.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(interfaceC1120x0.getCancellationException())));
            }
            while (a3.a0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
