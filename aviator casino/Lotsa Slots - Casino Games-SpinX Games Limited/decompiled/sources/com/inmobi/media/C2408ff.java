package com.inmobi.media;

/* renamed from: com.inmobi.media.ff, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2408ff extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5200a;
    public final /* synthetic */ com.inmobi.media.C2538kf b;
    public final /* synthetic */ com.inmobi.media.Zf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2408ff(com.inmobi.media.C2538kf c2538kf, com.inmobi.media.Zf zf, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2538kf;
        this.c = zf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2408ff(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2408ff(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5200a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.C2538kf c2538kf = this.b;
            com.inmobi.media.Zf zf = this.c;
            com.inmobi.media.C2381ef c2381ef = new com.inmobi.media.C2381ef(c2538kf, null);
            this.f5200a = 1;
            if (c2538kf.a(zf, c2381ef, this) == coroutine_suspended) {
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
