package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006"}, d2 = {"Lkotlin/coroutines/Continuation;", "", "toDebugString", "(Lkotlin/coroutines/Continuation;)Ljava/lang/String;", "", "getHexAddress", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getClassSimpleName", "classSimpleName"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugStringsKt {
    public static final java.lang.String getHexAddress(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    public static final java.lang.String toDebugString(kotlin.coroutines.Continuation<?> continuation) {
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation) {
            return ((kotlinx.coroutines.internal.DispatchedContinuation) continuation).toString();
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(continuation);
            sb.append('@');
            sb.append(getHexAddress(continuation));
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(sb.toString());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(continuation.getClass().getName());
            sb2.append('@');
            sb2.append(getHexAddress(continuation));
            m23436constructorimpl = sb2.toString();
        }
        return (java.lang.String) m23436constructorimpl;
    }

    public static final java.lang.String getClassSimpleName(java.lang.Object obj) {
        return obj.getClass().getSimpleName();
    }
}
