package kotlinx.coroutines.flow.internal;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.flow.InterfaceC1061f;

@SourceDebugExtension({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes5.dex */
public final class v<T> extends ContinuationImpl implements InterfaceC1061f<T> {

    @JvmField
    public final InterfaceC1061f<T> a;

    @JvmField
    public final CoroutineContext b;

    @JvmField
    public final int c;
    public CoroutineContext d;
    public Continuation<? super Unit> e;

    /* JADX WARN: Multi-variable type inference failed */
    public v(InterfaceC1061f<? super T> interfaceC1061f, CoroutineContext coroutineContext) {
        super(r.a, EmptyCoroutineContext.INSTANCE);
        this.a = interfaceC1061f;
        this.b = coroutineContext;
        this.c = ((Number) coroutineContext.fold(0, new u())).intValue();
    }

    public final Object a(Continuation<? super Unit> continuation, T t) {
        CoroutineContext coroutineContext = continuation.get$context();
        com.google.common.base.r.d(coroutineContext);
        CoroutineContext coroutineContext2 = this.d;
        if (coroutineContext2 != coroutineContext) {
            if (coroutineContext2 instanceof o) {
                throw new IllegalStateException(StringsKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((o) coroutineContext2).b + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) coroutineContext.fold(0, new Function2() { // from class: kotlinx.coroutines.flow.internal.x
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
                
                    if (r1 == null) goto L16;
                 */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
                    int intValue = ((Integer) obj).intValue();
                    CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                    CoroutineContext.Key<?> key = element.getKey();
                    CoroutineContext.Element element2 = v.this.b.get(key);
                    if (key != InterfaceC1120x0.a.a) {
                        if (element != element2) {
                            intValue = Integer.MIN_VALUE;
                        }
                        intValue++;
                    } else {
                        InterfaceC1120x0 interfaceC1120x0 = (InterfaceC1120x0) element2;
                        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                        InterfaceC1120x0 interfaceC1120x02 = (InterfaceC1120x0) element;
                        while (true) {
                            if (interfaceC1120x02 != null) {
                                if (interfaceC1120x02 == interfaceC1120x0 || !(interfaceC1120x02 instanceof kotlinx.coroutines.internal.t)) {
                                    break;
                                }
                                interfaceC1120x02 = ((kotlinx.coroutines.internal.t) interfaceC1120x02).getParent();
                            } else {
                                interfaceC1120x02 = null;
                                break;
                            }
                        }
                        if (interfaceC1120x02 != interfaceC1120x0) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC1120x02 + ", expected child of " + interfaceC1120x0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                    }
                    return Integer.valueOf(intValue);
                }
            })).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = coroutineContext;
        }
        this.e = continuation;
        Function3<InterfaceC1061f<Object>, Object, Continuation<? super Unit>, Object> function3 = w.a;
        InterfaceC1061f<T> interfaceC1061f = this.a;
        Intrinsics.checkNotNull(interfaceC1061f, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = function3.invoke(interfaceC1061f, t, this);
        if (!Intrinsics.areEqual(invoke, IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
            this.e = null;
        }
        return invoke;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC1061f
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        try {
            Object a = a(continuation, t);
            if (a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
        } catch (Throwable th) {
            this.d = new o(continuation.get$context(), th);
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<? super Unit> continuation = this.e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        CoroutineContext coroutineContext = this.d;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(obj);
        if (m1719exceptionOrNullimpl != null) {
            this.d = new o(get$context(), m1719exceptionOrNullimpl);
        }
        Continuation<? super Unit> continuation = this.e;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }
}
