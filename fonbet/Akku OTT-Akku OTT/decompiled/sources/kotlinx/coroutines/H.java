package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public final class H {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) coroutineContext.fold(bool, new E())).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.fold(bool, new E())).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new Function2() { // from class: kotlinx.coroutines.F
            /* JADX WARN: Type inference failed for: r1v5, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineContext coroutineContext4 = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof D)) {
                    return coroutineContext4.plus(element);
                }
                Ref.ObjectRef objectRef2 = Ref.ObjectRef.this;
                if (((CoroutineContext) objectRef2.element).get(element.getKey()) != null) {
                    objectRef2.element = ((CoroutineContext) objectRef2.element).minusKey(element.getKey());
                    return coroutineContext4.plus(((D) element).y());
                }
                D d = (D) element;
                if (z) {
                    d = d.q();
                }
                return coroutineContext4.plus(d);
            }
        });
        if (booleanValue2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, new G());
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    public static final CoroutineContext b(K k, CoroutineContext coroutineContext) {
        CoroutineContext a = a(k.getCoroutineContext(), coroutineContext, true);
        kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
        return (a == cVar || a.get(ContinuationInterceptor.INSTANCE) != null) ? a : a.plus(cVar);
    }

    public static final Z0<?> c(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        Z0<?> z0 = null;
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (coroutineContext.get(a1.a) != null) {
            CoroutineStackFrame coroutineStackFrame = (CoroutineStackFrame) continuation;
            while (true) {
                if ((coroutineStackFrame instanceof Y) || (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) == null) {
                    break;
                }
                if (coroutineStackFrame instanceof Z0) {
                    z0 = (Z0) coroutineStackFrame;
                    break;
                }
            }
            if (z0 != null) {
                z0.e0(coroutineContext, obj);
            }
        }
        return z0;
    }
}
