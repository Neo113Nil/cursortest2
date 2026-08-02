package kotlinx.coroutines.flow;

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
import kotlinx.coroutines.flow.internal.C1065a;

@SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,130:1\n83#2,6:131\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1077v implements InterfaceC1061f<Object> {
    public final /* synthetic */ SuspendLambda a;
    public final /* synthetic */ InterfaceC1061f b;

    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {131, 132}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: kotlinx.coroutines.flow.v$a */
    public static final class a extends ContinuationImpl {
        public C1077v a;
        public /* synthetic */ Object b;
        public int c;
        public Object e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return C1077v.this.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1077v(Function2 function2, InterfaceC1061f interfaceC1061f) {
        this.a = (SuspendLambda) function2;
        this.b = interfaceC1061f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.InterfaceC1061f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        a aVar;
        int i;
        boolean z;
        Object obj2;
        Object obj3;
        C1077v c1077v;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                Object obj4 = aVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.c;
                z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj4);
                    aVar.a = this;
                    aVar.e = obj;
                    aVar.c = 1;
                    InlineMarker.mark(6);
                    Object invoke = this.a.invoke(obj, aVar);
                    InlineMarker.mark(7);
                    if (invoke != coroutine_suspended) {
                        obj2 = invoke;
                        obj3 = obj;
                        c1077v = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1077v = aVar.a;
                    ResultKt.throwOnFailure(obj4);
                    if (z) {
                        return Unit.INSTANCE;
                    }
                    throw new C1065a(c1077v);
                }
                Object obj5 = aVar.e;
                C1077v c1077v2 = aVar.a;
                ResultKt.throwOnFailure(obj4);
                obj3 = obj5;
                c1077v = c1077v2;
                obj2 = obj4;
                if (((Boolean) obj2).booleanValue()) {
                    z = false;
                } else {
                    InterfaceC1061f interfaceC1061f = c1077v.b;
                    aVar.a = c1077v;
                    aVar.e = null;
                    aVar.c = 2;
                }
                if (z) {
                }
            }
        }
        aVar = new a(continuation);
        Object obj42 = aVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.c;
        z = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
        if (z) {
        }
    }
}
