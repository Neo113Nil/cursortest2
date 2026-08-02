package kotlinx.coroutines.intrinsics;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC1044a;
import kotlinx.coroutines.internal.C1090g;

@SourceDebugExtension({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,64:1\n45#1,6:65\n45#1,6:71\n45#1,6:77\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n15#1:65,6\n25#1:71,6\n34#1:77,6\n*E\n"})
/* loaded from: classes5.dex */
public final class a {
    public static final void a(AbstractC1044a abstractC1044a, Throwable th) {
        Result.Companion companion = Result.INSTANCE;
        abstractC1044a.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(th)));
        throw th;
    }

    public static final void b(Continuation continuation, AbstractC1044a abstractC1044a) {
        try {
            Continuation intercepted = IntrinsicsKt.intercepted(continuation);
            Result.Companion companion = Result.INSTANCE;
            C1090g.a(Result.m1716constructorimpl(Unit.INSTANCE), intercepted);
        } catch (Throwable th) {
            a(abstractC1044a, th);
            throw null;
        }
    }

    public static final void c(Function2 function2, AbstractC1044a abstractC1044a, AbstractC1044a abstractC1044a2) {
        try {
            Continuation intercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, abstractC1044a, abstractC1044a2));
            Result.Companion companion = Result.INSTANCE;
            C1090g.a(Result.m1716constructorimpl(Unit.INSTANCE), intercepted);
        } catch (Throwable th) {
            a(abstractC1044a2, th);
            throw null;
        }
    }
}
