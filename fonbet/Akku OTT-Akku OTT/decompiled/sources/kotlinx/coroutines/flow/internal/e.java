package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.H;
import kotlinx.coroutines.K;
import kotlinx.coroutines.M;
import kotlinx.coroutines.flow.InterfaceC1061f;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class e extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ InterfaceC1061f<Object> c;
    public final /* synthetic */ g<Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC1061f<Object> interfaceC1061f, g<Object> gVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.c = interfaceC1061f;
        this.d = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        e eVar = new e(this.c, this.d, continuation);
        eVar.b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((e) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            K k = (K) this.b;
            g<Object> gVar = this.d;
            CoroutineContext coroutineContext = gVar.a;
            int i2 = gVar.b;
            if (i2 == -3) {
                i2 = -2;
            }
            kotlinx.coroutines.channels.a aVar = gVar.c;
            M m = M.c;
            Function2 fVar = new f(gVar, null);
            kotlinx.coroutines.channels.s sVar = new kotlinx.coroutines.channels.s(H.b(k, coroutineContext), kotlinx.coroutines.channels.j.a(i2, aVar, 4));
            sVar.c0(m, sVar, fVar);
            this.a = 1;
            Object a = com.amplitude.android.storage.b.a(this.c, sVar, true, this);
            if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a = Unit.INSTANCE;
            }
            if (a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
