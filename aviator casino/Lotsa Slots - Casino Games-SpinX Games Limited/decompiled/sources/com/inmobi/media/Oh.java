package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Oh extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f4879a;
    public com.inmobi.media.Fb b;
    public int c;
    public final /* synthetic */ com.inmobi.media.Ph d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oh(com.inmobi.media.Ph ph, long j, boolean z, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.d = ph;
        this.e = j;
        this.f = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Oh(this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Oh) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r2.b(r7, r19) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.inmobi.media.Fb fb;
        java.lang.Object b;
        com.inmobi.media.C2904yb c2904yb;
        com.inmobi.media.Fb dao;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Ph ph = this.d;
            long j = this.e;
            boolean z = this.f;
            java.lang.String str = ph.j;
            com.inmobi.media.C2904yb c2904yb2 = new com.inmobi.media.C2904yb(str, j, 0, 0L, z, ph.k.get(), 12);
            fb = (com.inmobi.media.Fb) com.inmobi.media.Gb.f4724a.getValue();
            this.f4879a = c2904yb2;
            this.b = fb;
            this.c = 1;
            b = fb.b(str, this);
            if (b != coroutine_suspended) {
                c2904yb = c2904yb2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.inmobi.media.Fb fb2 = (com.inmobi.media.Fb) this.f4879a;
            kotlin.ResultKt.throwOnFailure(obj);
            dao = fb2;
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
            long j2 = this.e;
            com.inmobi.media.Ph ph2 = this.d;
            long j3 = j2 - ph2.b;
            int i2 = ph2.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dao, "dao");
            if (!com.inmobi.media.AbstractC2273ac.c.getAndSet(true)) {
                com.inmobi.media.Yb runnable = new com.inmobi.media.Yb(dao, j3, i2, null);
                kotlinx.coroutines.CoroutineScope coroutineScope2 = com.inmobi.media.AbstractC2939zl.f5596a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.AbstractC2939zl.f5596a, null, null, new com.inmobi.media.C2863wl(10000L, null, runnable), 3, null);
            }
            return kotlin.Unit.INSTANCE;
        }
        fb = this.b;
        c2904yb = (com.inmobi.media.C2904yb) this.f4879a;
        kotlin.ResultKt.throwOnFailure(obj);
        b = obj;
        if (((java.lang.Boolean) b).booleanValue()) {
            this.f4879a = null;
            this.b = null;
            this.c = 2;
        } else {
            this.f4879a = fb;
            this.b = null;
            this.c = 3;
            if (fb.a(c2904yb, this) != coroutine_suspended) {
                dao = fb;
                kotlinx.coroutines.CoroutineScope coroutineScope3 = com.inmobi.media.AbstractC2273ac.f5097a;
                long j22 = this.e;
                com.inmobi.media.Ph ph22 = this.d;
                long j32 = j22 - ph22.b;
                int i22 = ph22.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dao, "dao");
                if (!com.inmobi.media.AbstractC2273ac.c.getAndSet(true)) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
