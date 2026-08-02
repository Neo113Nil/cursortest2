package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* renamed from: kotlinx.coroutines.flow.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1056a<T> implements InterfaceC1060e<T> {

    @DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {226}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.a$a, reason: collision with other inner class name */
    public static final class C0156a extends ContinuationImpl {
        public kotlinx.coroutines.flow.internal.v a;
        public /* synthetic */ Object b;
        public final /* synthetic */ AbstractC1056a<T> c;
        public int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0156a(AbstractC1056a<T> abstractC1056a, Continuation<? super C0156a> continuation) {
            super(continuation);
            this.c = abstractC1056a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC1061f<? super T> interfaceC1061f, Continuation<? super Unit> continuation) {
        C0156a c0156a;
        int i;
        Throwable th;
        kotlinx.coroutines.flow.internal.v vVar;
        if (continuation instanceof C0156a) {
            c0156a = (C0156a) continuation;
            int i2 = c0156a.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0156a.d = i2 - Integer.MIN_VALUE;
                Object obj = c0156a.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0156a.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.internal.v vVar2 = new kotlinx.coroutines.flow.internal.v(interfaceC1061f, c0156a.getContext());
                    try {
                        c0156a.a = vVar2;
                        c0156a.d = 1;
                        Object invoke = ((J) this).a.invoke(vVar2, c0156a);
                        if (invoke != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            invoke = Unit.INSTANCE;
                        }
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        vVar = vVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        vVar = vVar2;
                        vVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = c0156a.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        vVar.releaseIntercepted();
                        throw th;
                    }
                }
                vVar.releaseIntercepted();
                return Unit.INSTANCE;
            }
        }
        c0156a = new C0156a(this, continuation);
        Object obj2 = c0156a.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0156a.d;
        if (i != 0) {
        }
        vVar.releaseIntercepted();
        return Unit.INSTANCE;
    }
}
