package com.amplitude.core.platform.intercept;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.K;

@DebugMetadata(c = "com.amplitude.core.platform.intercept.IdentifyInterceptor$scheduleTransfer$1", f = "IdentifyInterceptor.kt", i = {}, l = {106, 107}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class f extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.b = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new f(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((f) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r4.c(r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (kotlinx.coroutines.W.b(r5, r7) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        h hVar = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!hVar.f.get()) {
                hVar.f.getAndSet(true);
                long j = hVar.d.v;
                this.a = 1;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            hVar.f.getAndSet(false);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.a = 2;
    }
}
