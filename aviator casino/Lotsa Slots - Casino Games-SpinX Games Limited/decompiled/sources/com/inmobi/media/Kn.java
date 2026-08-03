package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Kn extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4805a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ android.view.ViewGroup d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kn(android.view.View view, android.view.ViewGroup viewGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = view;
        this.d = viewGroup;
    }

    public static final kotlin.Unit a(android.view.View view, com.inmobi.media.Jn jn) {
        view.removeOnAttachStateChangeListener(jn);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Kn kn = new com.inmobi.media.Kn(this.c, this.d, continuation);
        kn.b = obj;
        return kn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Kn) create((kotlinx.coroutines.channels.ProducerScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4805a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.b;
            android.view.View view = this.c;
            final com.inmobi.media.Jn jn = new com.inmobi.media.Jn(producerScope, view, this.d);
            view.addOnAttachStateChangeListener(jn);
            producerScope.mo10716trySendJP2dKIU(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.inmobi.media.Mn.b(this.c, this.d)));
            final android.view.View view2 = this.c;
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Kn$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.inmobi.media.Kn.a(view2, jn);
                }
            };
            this.f4805a = 1;
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
