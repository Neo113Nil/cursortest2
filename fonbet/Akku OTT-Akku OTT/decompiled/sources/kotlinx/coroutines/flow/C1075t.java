package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: kotlinx.coroutines.flow.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1075t<T> implements InterfaceC1061f {
    public final /* synthetic */ Ref.BooleanRef a;
    public final /* synthetic */ InterfaceC1061f<T> b;
    public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> c;

    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {33, 34, 36}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.t$a */
    public static final class a extends ContinuationImpl {
        public C1075t a;
        public Object b;
        public /* synthetic */ Object c;
        public final /* synthetic */ C1075t<T> d;
        public int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C1075t<? super T> c1075t, Continuation<? super a> continuation) {
            super(continuation);
            this.d = c1075t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return this.d.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1075t(Ref.BooleanRef booleanRef, InterfaceC1061f<? super T> interfaceC1061f, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        this.a = booleanRef;
        this.b = interfaceC1061f;
        this.c = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r6.b.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.InterfaceC1061f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        a aVar;
        int i;
        C1075t<T> c1075t;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
                Object obj = aVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.a.element) {
                        aVar.e = 1;
                    } else {
                        aVar.a = this;
                        aVar.b = t;
                        aVar.e = 2;
                        obj = this.c.invoke(t, aVar);
                        if (obj != coroutine_suspended) {
                            c1075t = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                t = (T) aVar.b;
                c1075t = aVar.a;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                c1075t.a.element = true;
                InterfaceC1061f<T> interfaceC1061f = c1075t.b;
                aVar.a = null;
                aVar.b = null;
                aVar.e = 3;
            }
        }
        aVar = new a(this, continuation);
        Object obj2 = aVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.e;
        if (i != 0) {
        }
    }
}
