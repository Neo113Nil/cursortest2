package kotlinx.coroutines.intrinsics;

import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.A;
import kotlinx.coroutines.F0;
import kotlinx.coroutines.internal.t;

@SourceDebugExtension({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,91:1\n61#1,4:99\n78#1,6:103\n84#1,5:111\n61#1,4:116\n78#1,6:120\n84#1,5:128\n8#2:92\n11#2,2:96\n91#3,3:93\n95#3:98\n57#4,2:109\n57#4,2:126\n57#4,2:133\n57#4,2:135\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n41#1:99,4\n41#1:103,6\n41#1:111,5\n52#1:116,4\n52#1:120,6\n52#1:128,5\n14#1:92\n19#1:96,2\n18#1:93,3\n18#1:98\n41#1:109,2\n52#1:126,2\n83#1:133,2\n84#1:135,2\n*E\n"})
/* loaded from: classes5.dex */
public final class b {
    public static final Object a(t tVar, t tVar2, Function2 function2) {
        Object a;
        try {
            a = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, tVar2, tVar) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(tVar2, tVar);
        } catch (Throwable th) {
            a = new A(th, false);
        }
        if (a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object N = tVar.N(a);
        if (N == F0.b) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (N instanceof A) {
            throw ((A) N).a;
        }
        return F0.a(N);
    }
}
