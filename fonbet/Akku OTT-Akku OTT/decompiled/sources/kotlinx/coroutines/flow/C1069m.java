package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n73#2:109\n74#2,7:111\n326#3:110\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n73#1:110\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1069m implements InterfaceC1060e<Object> {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ InterfaceC1060e b;

    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {112, 116}, m = "collect", n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.flow.m$a */
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public C1069m d;
        public InterfaceC1061f e;
        public kotlinx.coroutines.flow.internal.v f;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return C1069m.this.collect(null, this);
        }
    }

    public C1069m(Function2 function2, InterfaceC1060e interfaceC1060e) {
        this.a = function2;
        this.b = interfaceC1060e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r7.collect(r2, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC1061f<? super Object> interfaceC1061f, Continuation<? super Unit> continuation) {
        a aVar;
        int i;
        Throwable th;
        kotlinx.coroutines.flow.internal.v vVar;
        C1069m c1069m;
        InterfaceC1061f<? super Object> interfaceC1061f2;
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
                    kotlinx.coroutines.flow.internal.v vVar2 = new kotlinx.coroutines.flow.internal.v(interfaceC1061f, aVar.get$context());
                    try {
                        Function2 function2 = this.a;
                        aVar.d = this;
                        aVar.e = interfaceC1061f;
                        aVar.f = vVar2;
                        aVar.b = 1;
                        InlineMarker.mark(6);
                        Object invoke = function2.invoke(vVar2, aVar);
                        InlineMarker.mark(7);
                        if (invoke != coroutine_suspended) {
                            c1069m = this;
                            interfaceC1061f2 = interfaceC1061f;
                            vVar = vVar2;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        vVar = vVar2;
                        vVar.releaseIntercepted();
                        throw th;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                vVar = aVar.f;
                interfaceC1061f2 = aVar.e;
                c1069m = aVar.d;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th = th3;
                    vVar.releaseIntercepted();
                    throw th;
                }
                vVar.releaseIntercepted();
                InterfaceC1060e interfaceC1060e = c1069m.b;
                aVar.d = null;
                aVar.e = null;
                aVar.f = null;
                aVar.b = 2;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.b;
        if (i != 0) {
        }
        vVar.releaseIntercepted();
        InterfaceC1060e interfaceC1060e2 = c1069m.b;
        aVar.d = null;
        aVar.e = null;
        aVar.f = null;
        aVar.b = 2;
    }
}
