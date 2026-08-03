package com.inmobi.media;

/* renamed from: com.inmobi.media.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2655p extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.InterfaceC2772t9 f5381a;
    public final /* synthetic */ android.content.Context b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2655p(com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, android.content.Context context, long j, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5381a = interfaceC2772t9;
        this.b = context;
        this.c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2655p(this.f5381a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2655p) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5381a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("AdAudioTracker", "Starting audio volume tracking");
        }
        if (com.inmobi.media.C2682q.b == null) {
            java.lang.Object systemService = this.b.getSystemService("audio");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            com.inmobi.media.C2682q.b = (android.media.AudioManager) systemService;
        }
        com.inmobi.media.C2682q c2682q = com.inmobi.media.C2682q.f5400a;
        com.inmobi.media.C2682q.f = com.inmobi.media.J3.a(com.inmobi.media.C2682q.g, 0L, this.c, new com.inmobi.media.C2629o(null));
        com.inmobi.media.C2682q.a(this.c);
        android.content.Context context = this.b;
        com.inmobi.media.C2682q.c = new com.inmobi.media.C2522k();
        com.inmobi.media.J3.a(context, com.inmobi.media.C2682q.c, new android.content.IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        com.inmobi.media.C2682q.a(java.lang.Float.valueOf(c2682q.a()));
        return kotlin.Unit.INSTANCE;
    }
}
