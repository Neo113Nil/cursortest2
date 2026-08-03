package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Xb extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Fb f5045a;
    public java.util.Iterator b;
    public int c;
    public final /* synthetic */ com.inmobi.media.Fb d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xb(com.inmobi.media.Fb fb, long j, int i, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.d = fb;
        this.e = j;
        this.f = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Xb(this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Xb) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:7:0x0013, B:9:0x003d, B:11:0x0043, B:23:0x001f, B:24:0x0035, B:26:0x0026), top: B:2:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.inmobi.media.Fb fb;
        java.util.Iterator it;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.Fb fb2 = this.d;
                long j = this.e;
                int i2 = this.f;
                this.c = 1;
                obj = fb2.a(j, i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.b;
                    fb = this.f5045a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        com.inmobi.media.C2904yb c2904yb = (com.inmobi.media.C2904yb) it.next();
                        com.inmobi.media.AbstractC2299bc.a(c2904yb.f5568a);
                        java.lang.String str = c2904yb.f5568a;
                        this.f5045a = fb;
                        this.b = it;
                        this.c = 2;
                        if (fb.a(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    com.inmobi.media.AbstractC2273ac.c.set(false);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            fb = this.d;
            it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
            }
            com.inmobi.media.AbstractC2273ac.c.set(false);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            com.inmobi.media.AbstractC2273ac.c.set(false);
            throw th;
        }
    }
}
