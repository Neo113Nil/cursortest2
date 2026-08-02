package Wc;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b extends h {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static kotlin.coroutines.d a(kotlin.coroutines.d dVar, @NotNull kotlin.coroutines.d completion, @NotNull Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (function2 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function2).create(dVar, completion);
        }
        CoroutineContext context = completion.getContext();
        return context == kotlin.coroutines.g.f71771a ? new c(completion, dVar, function2) : new d(completion, context, function2, dVar);
    }

    @NotNull
    public static kotlin.coroutines.d b(@NotNull kotlin.coroutines.d dVar) {
        kotlin.coroutines.d<Object> intercepted;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        kotlin.coroutines.jvm.internal.c cVar = dVar instanceof kotlin.coroutines.jvm.internal.c ? (kotlin.coroutines.jvm.internal.c) dVar : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? dVar : intercepted;
    }

    public static Object c(@NotNull Function2 function2, Object obj, @NotNull kotlin.coroutines.d completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        CoroutineContext context = completion.getContext();
        kotlin.coroutines.jvm.internal.d eVar = context == kotlin.coroutines.g.f71771a ? new e(completion) : new f(completion, context);
        U.g(2, function2);
        return function2.invoke(obj, eVar);
    }
}
