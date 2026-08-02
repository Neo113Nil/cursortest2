package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: kotlinx.coroutines.flow.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1059d<T> implements InterfaceC1060e<T> {
    public final InterfaceC1060e<T> a;

    /* renamed from: kotlinx.coroutines.flow.d$a */
    public static final class a<T> implements InterfaceC1061f {
        public final /* synthetic */ Ref.ObjectRef<Object> a;
        public final /* synthetic */ InterfaceC1061f<T> b;

        @DebugMetadata(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {73}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.d$a$a, reason: collision with other inner class name */
        public static final class C0157a extends ContinuationImpl {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0157a(a<? super T> aVar, Continuation<? super C0157a> continuation) {
                super(continuation);
                this.b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(C1059d<T> c1059d, Ref.ObjectRef<Object> objectRef, InterfaceC1061f<? super T> interfaceC1061f) {
            this.a = objectRef;
            this.b = interfaceC1061f;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC1061f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C0157a c0157a;
            int i;
            if (continuation instanceof C0157a) {
                c0157a = (C0157a) continuation;
                int i2 = c0157a.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0157a.c = i2 - Integer.MIN_VALUE;
                    Object obj = c0157a.a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0157a.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Ref.ObjectRef<Object> objectRef = this.a;
                        Object obj2 = objectRef.element;
                        if (obj2 != kotlinx.coroutines.flow.internal.t.a && Intrinsics.areEqual(obj2, t)) {
                            return Unit.INSTANCE;
                        }
                        objectRef.element = t;
                        c0157a.c = 1;
                        if (this.b.emit(t, c0157a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
            c0157a = new C0157a(this, continuation);
            Object obj3 = c0157a.a;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c0157a.c;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }
    }

    public C1059d(InterfaceC1060e interfaceC1060e) {
        this.a = interfaceC1060e;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    public final Object collect(InterfaceC1061f<? super T> interfaceC1061f, Continuation<? super Unit> continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) kotlinx.coroutines.flow.internal.t.a;
        Object collect = this.a.collect(new a(this, objectRef, interfaceC1061f), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
