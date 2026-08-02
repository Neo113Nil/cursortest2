package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,108:1\n129#2,15:109\n*E\n"})
/* loaded from: classes5.dex */
public final class r implements InterfaceC1060e<Object> {
    public final /* synthetic */ InterfaceC1060e a;
    public final /* synthetic */ Function4 b;

    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {113, 115}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u242", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u242", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public r d;
        public InterfaceC1061f e;
        public Throwable f;
        public long i;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return r.this.collect(null, this);
        }
    }

    public r(InterfaceC1060e interfaceC1060e, Function4 function4) {
        this.a = interfaceC1060e;
        this.b = function4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0086 -> B:11:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0098 -> B:14:0x0095). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC1061f<? super Object> interfaceC1061f, Continuation<? super Unit> continuation) {
        a aVar;
        int i;
        long j;
        r rVar;
        r rVar2;
        InterfaceC1061f<? super Object> interfaceC1061f2;
        Throwable th;
        Object c;
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
                    j = 0;
                    rVar = this;
                    InterfaceC1060e interfaceC1060e = rVar.a;
                    aVar.d = rVar;
                    aVar.e = interfaceC1061f;
                    aVar.f = null;
                    aVar.i = j;
                    aVar.b = 1;
                    c = C1062g.c(interfaceC1060e, interfaceC1061f, aVar);
                    if (c != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = aVar.i;
                    th = aVar.f;
                    interfaceC1061f2 = aVar.e;
                    rVar2 = aVar.d;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        throw th;
                    }
                    j++;
                    boolean z = true;
                    rVar = rVar2;
                    if (z) {
                        return Unit.INSTANCE;
                    }
                    interfaceC1061f = interfaceC1061f2;
                    InterfaceC1060e interfaceC1060e2 = rVar.a;
                    aVar.d = rVar;
                    aVar.e = interfaceC1061f;
                    aVar.f = null;
                    aVar.i = j;
                    aVar.b = 1;
                    c = C1062g.c(interfaceC1060e2, interfaceC1061f, aVar);
                    if (c != coroutine_suspended) {
                        rVar2 = rVar;
                        obj = c;
                        interfaceC1061f2 = interfaceC1061f;
                        th = (Throwable) obj;
                        if (th == null) {
                            Function4 function4 = rVar2.b;
                            Long boxLong = Boxing.boxLong(j);
                            aVar.d = rVar2;
                            aVar.e = interfaceC1061f2;
                            aVar.f = th;
                            aVar.i = j;
                            aVar.b = 2;
                            InlineMarker.mark(6);
                            obj = function4.invoke(interfaceC1061f2, th, boxLong, aVar);
                            InlineMarker.mark(7);
                        } else {
                            z = false;
                            rVar = rVar2;
                            if (z) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                j = aVar.i;
                interfaceC1061f = aVar.e;
                r rVar3 = aVar.d;
                ResultKt.throwOnFailure(obj);
                rVar2 = rVar3;
                interfaceC1061f2 = interfaceC1061f;
                th = (Throwable) obj;
                if (th == null) {
                }
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.b;
        if (i != 0) {
        }
    }
}
