package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: kotlinx.coroutines.flow.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1057b<T> extends C1058c<T> {
    public final SuspendLambda e;

    @DebugMetadata(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {330}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.b$a */
    public static final class a extends ContinuationImpl {
        public kotlinx.coroutines.channels.t a;
        public /* synthetic */ Object b;
        public int d;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return C1057b.this.b(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1057b(Function2<? super kotlinx.coroutines.channels.t<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        super(function2, coroutineContext, i, aVar);
        this.e = (SuspendLambda) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.C1058c, kotlinx.coroutines.flow.internal.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kotlinx.coroutines.channels.t<? super T> tVar, Continuation<? super Unit> continuation) {
        a aVar;
        int i;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                Object obj = aVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar.a = tVar;
                    aVar.d = 1;
                    if (super.b(tVar, aVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = aVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (tVar.j()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return Unit.INSTANCE;
            }
        }
        aVar = new a((ContinuationImpl) continuation);
        Object obj2 = aVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        if (tVar.j()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.C1058c, kotlinx.coroutines.flow.internal.g
    public final kotlinx.coroutines.flow.internal.g<T> d(CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        return new C1057b(this.e, coroutineContext, i, aVar);
    }
}
