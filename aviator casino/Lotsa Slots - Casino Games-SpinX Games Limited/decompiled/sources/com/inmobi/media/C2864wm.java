package com.inmobi.media;

/* renamed from: com.inmobi.media.wm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2864wm extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5535a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ kotlinx.coroutines.flow.Flow c;
    public final /* synthetic */ com.inmobi.media.Fm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2864wm(kotlinx.coroutines.flow.Flow flow, kotlin.coroutines.Continuation continuation, com.inmobi.media.Fm fm) {
        super(2, continuation);
        this.c = flow;
        this.d = fm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2864wm c2864wm = new com.inmobi.media.C2864wm(this.c, continuation, this.d);
        c2864wm.b = obj;
        return c2864wm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2864wm) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5535a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            kotlinx.coroutines.flow.Flow flow = this.c;
            com.inmobi.media.C2838vm c2838vm = new com.inmobi.media.C2838vm(coroutineScope, this.d);
            this.f5535a = 1;
            if (flow.collect(c2838vm, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
