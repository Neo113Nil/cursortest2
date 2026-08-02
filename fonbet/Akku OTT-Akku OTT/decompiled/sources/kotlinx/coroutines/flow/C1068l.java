package kotlinx.coroutines.flow;

import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n143#2,13:109\n156#2,6:123\n326#3:122\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n155#1:122\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1068l implements InterfaceC1060e<Object> {
    public final /* synthetic */ DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 a;
    public final /* synthetic */ Function3 b;

    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {110, 117, 124}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.flow.l$a */
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public InterfaceC1061f e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return C1068l.this.collect(null, this);
        }
    }

    public C1068l(DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1, Function3 function3) {
        this.a = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
        this.b = function3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC1061f<? super Object> interfaceC1061f, Continuation<? super Unit> continuation) {
        a aVar;
        Object coroutine_suspended;
        int i;
        C1068l c1068l;
        V v;
        Function3 function3;
        kotlinx.coroutines.flow.internal.v vVar;
        Throwable th;
        kotlinx.coroutines.flow.internal.v vVar2;
        Object invoke;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.b = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.a;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = aVar.b;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1 = this.a;
                            aVar.d = this;
                            aVar.e = interfaceC1061f;
                            aVar.b = 1;
                            if (dataStoreImpl$data$1$invokeSuspend$$inlined$map$1.collect(interfaceC1061f, aVar) != coroutine_suspended) {
                                c1068l = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c1068l = this;
                            v = new V(th);
                            function3 = c1068l.b;
                            aVar.d = th;
                            aVar.e = null;
                            aVar.b = 2;
                            if (C1070n.a(v, function3, th, aVar) != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            Throwable th3 = (Throwable) aVar.d;
                            ResultKt.throwOnFailure(obj);
                            throw th3;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vVar2 = (kotlinx.coroutines.flow.internal.v) aVar.d;
                        try {
                            ResultKt.throwOnFailure(obj);
                            vVar2.releaseIntercepted();
                            return Unit.INSTANCE;
                        } catch (Throwable th4) {
                            th = th4;
                            vVar2.releaseIntercepted();
                            throw th;
                        }
                    }
                    interfaceC1061f = aVar.e;
                    c1068l = (C1068l) aVar.d;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        v = new V(th);
                        function3 = c1068l.b;
                        aVar.d = th;
                        aVar.e = null;
                        aVar.b = 2;
                        if (C1070n.a(v, function3, th, aVar) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw th;
                    }
                    vVar = new kotlinx.coroutines.flow.internal.v(interfaceC1061f, aVar.get$context());
                    Function3 function32 = c1068l.b;
                    aVar.d = vVar;
                    aVar.e = null;
                    aVar.b = 3;
                    InlineMarker.mark(6);
                    invoke = function32.invoke(vVar, null, aVar);
                    InlineMarker.mark(7);
                    if (invoke != coroutine_suspended) {
                        vVar2 = vVar;
                        vVar2.releaseIntercepted();
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            Function3 function322 = c1068l.b;
            aVar.d = vVar;
            aVar.e = null;
            aVar.b = 3;
            InlineMarker.mark(6);
            invoke = function322.invoke(vVar, null, aVar);
            InlineMarker.mark(7);
            if (invoke != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th6) {
            th = th6;
            vVar2 = vVar;
            vVar2.releaseIntercepted();
            throw th;
        }
        aVar = new a(continuation);
        Object obj2 = aVar.a;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.b;
        if (i != 0) {
        }
        vVar = new kotlinx.coroutines.flow.internal.v(interfaceC1061f, aVar.get$context());
    }
}
