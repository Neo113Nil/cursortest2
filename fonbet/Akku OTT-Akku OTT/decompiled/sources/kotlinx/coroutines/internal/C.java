package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.T0;

/* loaded from: classes5.dex */
public final class C {

    @JvmField
    public static final x a = new x("NO_THREAD_ELEMENTS");
    public static final z b = new z();
    public static final A c = new A();
    public static final B d = new B();

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof H)) {
            Object fold = coroutineContext.fold(null, c);
            Intrinsics.checkNotNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((T0) fold).restoreThreadContext(coroutineContext, obj);
            return;
        }
        H h = (H) obj;
        T0<Object>[] t0Arr = h.c;
        int length = t0Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            T0<Object> t0 = t0Arr[length];
            Intrinsics.checkNotNull(t0);
            t0.restoreThreadContext(coroutineContext, h.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, b);
        Intrinsics.checkNotNull(fold);
        return fold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new H(((Number) obj).intValue(), coroutineContext), d);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((T0) obj).updateThreadContext(coroutineContext);
    }
}
