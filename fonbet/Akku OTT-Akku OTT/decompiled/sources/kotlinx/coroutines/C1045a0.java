package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.C1089f;

@SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,208:1\n186#1,17:226\n1#2:209\n236#3:210\n237#3,2:221\n239#3:225\n103#4,10:211\n114#4,2:223\n57#5,2:243\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n176#1:226,17\n164#1:210\n164#1:221,2\n164#1:225\n164#1:211,10\n164#1:223,2\n206#1:243,2\n*E\n"})
/* renamed from: kotlinx.coroutines.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1045a0 {
    public static final void a(C1100n c1100n, Continuation continuation, boolean z) {
        Object g;
        Object obj = C1100n.i.get(c1100n);
        Throwable e = c1100n.e(obj);
        if (e != null) {
            Result.Companion companion = Result.INSTANCE;
            g = ResultKt.createFailure(e);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            g = c1100n.g(obj);
        }
        Object m1716constructorimpl = Result.m1716constructorimpl(g);
        if (!z) {
            continuation.resumeWith(m1716constructorimpl);
            return;
        }
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C1089f c1089f = (C1089f) continuation;
        Continuation<T> continuation2 = c1089f.e;
        Object obj2 = c1089f.i;
        CoroutineContext coroutineContext = continuation2.get$context();
        Object c = kotlinx.coroutines.internal.C.c(coroutineContext, obj2);
        Z0<?> c2 = c != kotlinx.coroutines.internal.C.a ? H.c(continuation2, coroutineContext, c) : null;
        try {
            c1089f.e.resumeWith(m1716constructorimpl);
            Unit unit = Unit.INSTANCE;
            if (c2 == null || c2.d0()) {
                kotlinx.coroutines.internal.C.a(coroutineContext, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.d0()) {
                kotlinx.coroutines.internal.C.a(coroutineContext, c);
            }
            throw th;
        }
    }
}
