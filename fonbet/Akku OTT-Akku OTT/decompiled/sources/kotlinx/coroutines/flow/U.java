package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,425:1\n326#2:426\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n416#1:426\n*E\n"})
/* loaded from: classes5.dex */
public final class U<T> implements InterfaceC1061f<T> {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Unit a(ContinuationImpl continuationImpl) {
        T t;
        ?? r1;
        try {
            if (continuationImpl instanceof T) {
                t = (T) continuationImpl;
                int i = t.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    t.e = i - Integer.MIN_VALUE;
                    Object obj = t.c;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r1 = t.e;
                    if (r1 != 0) {
                        ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.internal.v vVar = new kotlinx.coroutines.flow.internal.v(null, t.get$context());
                        t.a = this;
                        t.b = vVar;
                        t.e = 1;
                        throw null;
                    }
                    if (r1 == 1) {
                        kotlinx.coroutines.flow.internal.v vVar2 = t.b;
                        U u = t.a;
                        ResultKt.throwOnFailure(obj);
                        vVar2.releaseIntercepted();
                        u.getClass();
                    } else {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (r1 != 0) {
            }
        } catch (Throwable th) {
            r1.releaseIntercepted();
            throw th;
        }
        t = new T(this, continuationImpl);
        Object obj2 = t.c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r1 = t.e;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC1061f
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        throw null;
    }
}
