package com.inmobi.media;

/* renamed from: com.inmobi.media.ha, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2456ha extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5238a;
    public final /* synthetic */ com.inmobi.media.C2507ja b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2456ha(com.inmobi.media.C2507ja c2507ja, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2507ja;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2456ha(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2456ha(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5238a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Fb fb = (com.inmobi.media.Fb) com.inmobi.media.Gb.f4724a.getValue();
            java.lang.String str = this.b.f5276a.c.f5568a;
            this.f5238a = 1;
            if (fb.a(str, this) == coroutine_suspended) {
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
