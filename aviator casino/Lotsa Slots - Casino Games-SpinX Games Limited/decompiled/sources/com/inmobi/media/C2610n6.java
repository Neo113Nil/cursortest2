package com.inmobi.media;

/* renamed from: com.inmobi.media.n6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2610n6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5351a;
    public final /* synthetic */ com.inmobi.media.C2662p6 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2610n6(com.inmobi.media.C2662p6 c2662p6, boolean z, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.b = c2662p6;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2610n6(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.C2610n6(this.b, this.c, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5351a;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.C2662p6 c2662p6 = this.b;
                boolean z = this.c;
                this.f5351a = 1;
                if (com.inmobi.media.C2662p6.a(c2662p6, z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception unused) {
            com.inmobi.media.C2662p6 c2662p62 = this.b;
            java.lang.String str = c2662p62.e;
            c2662p62.f.set(false);
        }
        return kotlin.Unit.INSTANCE;
    }
}
