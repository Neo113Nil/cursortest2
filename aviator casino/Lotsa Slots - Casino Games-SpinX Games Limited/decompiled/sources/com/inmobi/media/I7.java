package com.inmobi.media;

/* loaded from: classes5.dex */
public final class I7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.R7 f4759a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I7(kotlin.coroutines.Continuation continuation, com.inmobi.media.R7 r7) {
        super(2, continuation);
        this.f4759a = r7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.I7(continuation, this.f4759a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.I7((kotlin.coroutines.Continuation) obj2, this.f4759a).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job launch$default2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.f4759a.b() == com.inmobi.media.Bg.f) {
            this.f4759a.p.seekTo(0L);
            com.inmobi.media.R7 r7 = this.f4759a;
            r7.l.set(com.inmobi.media.Bg.c);
        }
        com.inmobi.media.W7 w7 = this.f4759a.y;
        if (w7.e) {
            w7.a();
            w7.d.a();
        } else {
            com.inmobi.media.T4.a(w7.f5025a, new com.inmobi.media.V7(w7, null));
        }
        com.inmobi.media.C2899y6 c2899y6 = this.f4759a.x;
        if (!c2899y6.d.getAndSet(true)) {
            kotlinx.coroutines.CoroutineScope coroutineScope = c2899y6.b;
            long j = c2899y6.k;
            com.inmobi.media.C2848w6 action = new com.inmobi.media.C2848w6(c2899y6, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, kotlinx.coroutines.Dispatchers.getMain().getImmediate(), null, new com.inmobi.media.G3(j, null, action), 2, null);
            c2899y6.e = launch$default;
            kotlinx.coroutines.CoroutineScope coroutineScope2 = c2899y6.b;
            long j2 = c2899y6.l;
            com.inmobi.media.C2874x6 action2 = new com.inmobi.media.C2874x6(c2899y6, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope2, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action2, "action");
            launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, kotlinx.coroutines.Dispatchers.getMain().getImmediate(), null, new com.inmobi.media.G3(j2, null, action2), 2, null);
            c2899y6.f = launch$default2;
        }
        this.f4759a.p.play();
        com.inmobi.media.R7 r72 = this.f4759a;
        r72.l.set(com.inmobi.media.Bg.d);
        com.inmobi.media.R7 r73 = this.f4759a;
        r73.a(new com.inmobi.media.C2916yn(r73.p.getCurrentPosition()));
        return kotlin.Unit.INSTANCE;
    }
}
