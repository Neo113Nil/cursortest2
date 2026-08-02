package kotlinx.coroutines.channels;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.K;
import kotlinx.coroutines.channels.k;

@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt$trySendBlocking$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes5.dex */
public final class n extends SuspendLambda implements Function2<K, Continuation<? super k<? extends Unit>>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ w<Object> c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w<Object> wVar, Object obj, Continuation<? super n> continuation) {
        super(2, continuation);
        this.c = wVar;
        this.d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        n nVar = new n(this.c, this.d, continuation);
        nVar.b = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super k<? extends Unit>> continuation) {
        return ((n) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m1716constructorimpl;
        Object aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                w<Object> wVar = this.c;
                Object obj2 = this.d;
                Result.Companion companion = Result.INSTANCE;
                this.a = 1;
                if (wVar.i(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m1716constructorimpl = Result.m1716constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m1716constructorimpl = Result.m1716constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m1723isSuccessimpl(m1716constructorimpl)) {
            k.b bVar = k.Companion;
            aVar = Unit.INSTANCE;
            bVar.getClass();
        } else {
            k.b bVar2 = k.Companion;
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(m1716constructorimpl);
            bVar2.getClass();
            aVar = new k.a(m1719exceptionOrNullimpl);
        }
        return new k(aVar);
    }
}
