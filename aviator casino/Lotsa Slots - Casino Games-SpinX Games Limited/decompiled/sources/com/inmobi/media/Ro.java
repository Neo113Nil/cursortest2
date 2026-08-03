package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ro extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4945a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ android.view.ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ro(android.view.ViewGroup viewGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = viewGroup;
    }

    public static final kotlin.Unit a(android.view.View view, com.inmobi.media.Qo qo) {
        view.removeOnAttachStateChangeListener(qo);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Ro ro = new com.inmobi.media.Ro(this.c, continuation);
        ro.b = obj;
        return ro;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.Ro ro = new com.inmobi.media.Ro(this.c, (kotlin.coroutines.Continuation) obj2);
        ro.b = (kotlinx.coroutines.channels.ProducerScope) obj;
        return ro.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4945a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.b;
            producerScope.mo10716trySendJP2dKIU(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.c.isAttachedToWindow()));
            final com.inmobi.media.Qo qo = new com.inmobi.media.Qo(producerScope);
            this.c.addOnAttachStateChangeListener(qo);
            final android.view.ViewGroup viewGroup = this.c;
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ro$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.inmobi.media.Ro.a(viewGroup, qo);
                }
            };
            this.f4945a = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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
