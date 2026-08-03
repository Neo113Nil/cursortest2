package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Qb extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4915a;
    public final /* synthetic */ com.inmobi.media.Rb b;
    public final /* synthetic */ android.content.Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qb(com.inmobi.media.Rb rb, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.b = rb;
        this.c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Qb(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.Qb(this.b, this.c, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4915a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.b.g.get()) {
                return kotlin.Unit.INSTANCE;
            }
            com.inmobi.media.Rb rb = this.b;
            android.content.Context context = this.c;
            this.f4915a = 1;
            if (rb.a(context, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
        com.inmobi.media.Fb dao = (com.inmobi.media.Fb) com.inmobi.media.Gb.f4724a.getValue();
        long timeInMillis = java.util.Calendar.getInstance().getTimeInMillis();
        com.inmobi.media.Rb rb2 = this.b;
        long j = timeInMillis - rb2.c;
        int i2 = rb2.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dao, "dao");
        if (!com.inmobi.media.AbstractC2273ac.c.getAndSet(true)) {
            com.inmobi.media.Yb runnable = new com.inmobi.media.Yb(dao, j, i2, null);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = com.inmobi.media.AbstractC2939zl.f5596a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.AbstractC2939zl.f5596a, null, null, new com.inmobi.media.C2863wl(10000L, null, runnable), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
