package com.inmobi.media;

/* renamed from: com.inmobi.media.w9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2851w9 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {
    public C2851w9(kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2851w9(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.C2851w9((kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.Fb fb = (com.inmobi.media.Fb) com.inmobi.media.Gb.f4724a.getValue();
        com.inmobi.media.C2825v9 listener = com.inmobi.media.AbstractC2877x9.c;
        fb.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        fb.b = new java.lang.ref.WeakReference(listener);
        return kotlin.Unit.INSTANCE;
    }
}
