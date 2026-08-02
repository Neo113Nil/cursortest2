package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.C1065a;

@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n82#2:109\n123#2,15:110\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n82#1:110,15\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1076u implements InterfaceC1060e<Object> {
    public final /* synthetic */ InterfaceC1060e a;
    public final /* synthetic */ SuspendLambda b;

    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {120}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.u$a */
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public C1077v d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return C1076u.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1076u(Function2 function2, InterfaceC1060e interfaceC1060e) {
        this.a = interfaceC1060e;
        this.b = (SuspendLambda) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC1061f<? super Object> interfaceC1061f, Continuation<? super Unit> continuation) {
        a aVar;
        int i;
        C1077v c1077v;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.b = i2 - Integer.MIN_VALUE;
                Object obj = aVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC1060e interfaceC1060e = this.a;
                    C1077v c1077v2 = new C1077v(this.b, interfaceC1061f);
                    try {
                        aVar.d = c1077v2;
                        aVar.b = 1;
                        if (interfaceC1060e.collect(c1077v2, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (C1065a e) {
                        e = e;
                        c1077v = c1077v2;
                        if (e.a != c1077v) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1077v = aVar.d;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (C1065a e2) {
                        e = e2;
                        if (e.a != c1077v) {
                            throw e;
                        }
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
