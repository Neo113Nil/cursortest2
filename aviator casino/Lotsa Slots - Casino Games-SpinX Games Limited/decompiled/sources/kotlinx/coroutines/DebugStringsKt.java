package kotlinx.coroutines;

/* compiled from: DebugStrings.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0006H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"hexAddress", "", "", "getHexAddress", "(Ljava/lang/Object;)Ljava/lang/String;", "toDebugString", "Lkotlin/coroutines/Continuation;", "classSimpleName", "getClassSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugStringsKt {
    public static final java.lang.String getHexAddress(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    public static final java.lang.String toDebugString(kotlin.coroutines.Continuation<?> continuation) {
        java.lang.Object m10798constructorimpl;
        if (continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation) {
            return ((kotlinx.coroutines.internal.DispatchedContinuation) continuation).toString();
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(continuation + '@' + getHexAddress(continuation));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) != null) {
            m10798constructorimpl = continuation.getClass().getName() + '@' + getHexAddress(continuation);
        }
        return (java.lang.String) m10798constructorimpl;
    }

    public static final java.lang.String getClassSimpleName(java.lang.Object obj) {
        return obj.getClass().getSimpleName();
    }
}
