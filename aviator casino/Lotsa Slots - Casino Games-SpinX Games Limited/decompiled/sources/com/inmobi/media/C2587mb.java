package com.inmobi.media;

/* renamed from: com.inmobi.media.mb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2587mb extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2615nb f5333a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2587mb(com.inmobi.media.C2615nb c2615nb, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5333a = c2615nb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2587mb(this.f5333a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2587mb(this.f5333a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2615nb c2615nb = this.f5333a;
        c2615nb.f.onAdLoadFailed(c2615nb.e);
        return kotlin.Unit.INSTANCE;
    }
}
