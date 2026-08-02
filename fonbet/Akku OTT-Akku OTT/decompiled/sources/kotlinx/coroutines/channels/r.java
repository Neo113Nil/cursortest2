package kotlinx.coroutines.channels;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.InterfaceC1120x0;

@SourceDebugExtension({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,300:1\n1#2:301\n351#3,11:302\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n63#1:302,11\n*E\n"})
/* loaded from: classes5.dex */
public final class r {

    @DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {302}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {
        public t a;
        public Function0 b;
        public /* synthetic */ Object c;
        public int d;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return r.a(null, null, this);
        }
    }

    public static final class b implements Function1<Throwable, Unit> {
        public final /* synthetic */ C1100n a;

        public b(C1100n c1100n) {
            this.a = c1100n;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            Unit unit = Unit.INSTANCE;
            this.a.resumeWith(Result.m1716constructorimpl(unit));
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t<?> tVar, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        a aVar;
        int i;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.d = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = aVar.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (aVar.get$context().get(InterfaceC1120x0.a.a) != tVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        aVar.a = tVar;
                        aVar.b = function0;
                        aVar.d = 1;
                        C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(aVar));
                        c1100n.r();
                        tVar.h(new b(c1100n));
                        Object q = c1100n.q();
                        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(aVar);
                        }
                        if (q == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = aVar.b;
                        ResultKt.throwOnFailure(obj);
                    }
                    function0.invoke();
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
        aVar = new a(continuation);
        Object obj2 = aVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
    }
}
