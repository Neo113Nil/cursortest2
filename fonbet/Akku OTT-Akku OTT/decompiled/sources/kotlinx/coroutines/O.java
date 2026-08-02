package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.C1089f;

@SourceDebugExtension({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
/* loaded from: classes5.dex */
public final class O {
    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String b(Continuation<?> continuation) {
        Object m1716constructorimpl;
        if (continuation instanceof C1089f) {
            return ((C1089f) continuation).toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m1716constructorimpl = Result.m1716constructorimpl(continuation + '@' + a(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m1716constructorimpl = Result.m1716constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m1719exceptionOrNullimpl(m1716constructorimpl) != null) {
            m1716constructorimpl = continuation.getClass().getName() + '@' + a(continuation);
        }
        return (String) m1716constructorimpl;
    }
}
