package kotlinx.coroutines.flow;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
/* loaded from: classes5.dex */
public final class E implements InterfaceC1060e<Object> {
    public final /* synthetic */ InterfaceC1060e a;
    public final /* synthetic */ SuspendLambda b;

    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n75#2,2:50\n*E\n"})
    public static final class a<T> implements InterfaceC1061f {
        public final /* synthetic */ InterfaceC1061f a;
        public final /* synthetic */ SuspendLambda b;

        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {50, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "emit", n = {"value", "$this$onEach_u24lambda_u248"}, s = {"L$0", "L$1"})
        /* renamed from: kotlinx.coroutines.flow.E$a$a, reason: collision with other inner class name */
        public static final class C0155a extends ContinuationImpl {
            public /* synthetic */ Object a;
            public int b;
            public Object d;
            public InterfaceC1061f e;

            public C0155a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2 function2, InterfaceC1061f interfaceC1061f) {
            this.a = interfaceC1061f;
            this.b = (SuspendLambda) function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
        
            if (r6.emit(r2, r0) != r1) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
        @Override // kotlinx.coroutines.flow.InterfaceC1061f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C0155a c0155a;
            int i;
            Object obj;
            InterfaceC1061f interfaceC1061f;
            if (continuation instanceof C0155a) {
                c0155a = (C0155a) continuation;
                int i2 = c0155a.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0155a.b = i2 - Integer.MIN_VALUE;
                    Object obj2 = c0155a.a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0155a.b;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        c0155a.d = t;
                        InterfaceC1061f interfaceC1061f2 = this.a;
                        c0155a.e = interfaceC1061f2;
                        c0155a.b = 1;
                        InlineMarker.mark(6);
                        Object invoke = this.b.invoke(t, c0155a);
                        InlineMarker.mark(7);
                        if (invoke != coroutine_suspended) {
                            obj = t;
                            interfaceC1061f = interfaceC1061f2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    InterfaceC1061f interfaceC1061f3 = c0155a.e;
                    obj = c0155a.d;
                    ResultKt.throwOnFailure(obj2);
                    interfaceC1061f = interfaceC1061f3;
                    c0155a.d = null;
                    c0155a.e = null;
                    c0155a.b = 2;
                }
            }
            c0155a = new C0155a(continuation);
            Object obj22 = c0155a.a;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c0155a.b;
            if (i != 0) {
            }
            c0155a.d = null;
            c0155a.e = null;
            c0155a.b = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E(Function2 function2, InterfaceC1060e interfaceC1060e) {
        this.a = interfaceC1060e;
        this.b = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    public final Object collect(InterfaceC1061f<? super Object> interfaceC1061f, Continuation continuation) {
        Object collect = this.a.collect(new a(this.b, interfaceC1061f), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
