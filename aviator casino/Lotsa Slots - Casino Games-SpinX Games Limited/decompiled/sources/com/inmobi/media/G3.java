package com.inmobi.media;

/* loaded from: classes5.dex */
public final class G3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4717a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ kotlin.coroutines.jvm.internal.SuspendLambda c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G3(long j, kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function1 function1) {
        super(2, continuation);
        this.c = (kotlin.coroutines.jvm.internal.SuspendLambda) function1;
        this.d = j;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.G3 g3 = new com.inmobi.media.G3(this.d, continuation, this.c);
        g3.b = obj;
        return g3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.G3) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r7.invoke(r6) == r0) goto L23;
     */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005c -> B:12:0x003f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4717a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.b;
            this.b = coroutineScope2;
            this.f4717a = 1;
            if (kotlinx.coroutines.DelayKt.delay(0L, this) != coroutine_suspended) {
                coroutineScope = coroutineScope2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
                kotlin.ResultKt.throwOnFailure(obj);
                long j = this.d;
                this.b = coroutineScope;
                this.f4717a = 3;
            } else if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
        kotlin.ResultKt.throwOnFailure(obj);
        if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
            return kotlin.Unit.INSTANCE;
        }
        ?? r7 = this.c;
        this.b = coroutineScope;
        this.f4717a = 2;
    }
}
