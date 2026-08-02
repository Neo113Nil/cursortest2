package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1790#2,6:213\n12511#2,2:221\n1682#2,6:223\n12511#2,2:229\n1682#2,6:232\n37#3,2:219\n1#4:231\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n39#1:213,6\n127#1:221,2\n137#1:223,6\n169#1:229,2\n190#1:232,6\n102#1:219,2\n*E\n"})
/* loaded from: classes5.dex */
public final class w {
    public static final /* synthetic */ int a = 0;

    static {
        Object m1716constructorimpl;
        Object m1716constructorimpl2;
        Exception exc = new Exception();
        String simpleName = _COROUTINE.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            Result.Companion companion = Result.INSTANCE;
            m1716constructorimpl = Result.m1716constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m1716constructorimpl = Result.m1716constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m1719exceptionOrNullimpl(m1716constructorimpl) != null) {
            m1716constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            m1716constructorimpl2 = Result.m1716constructorimpl(w.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m1716constructorimpl2 = Result.m1716constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m1719exceptionOrNullimpl(m1716constructorimpl2) != null) {
            m1716constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
