package com.inmobi.media;

/* renamed from: com.inmobi.media.v3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2819v3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5500a;
    public final /* synthetic */ com.inmobi.media.V2 b;
    public final /* synthetic */ com.inmobi.media.InterfaceC2772t9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2819v3(com.inmobi.media.V2 v2, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = v2;
        this.c = interfaceC2772t9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2819v3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2819v3(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5500a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
            android.os.SystemClock.elapsedRealtime();
            if (this.b.e) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
                if (interfaceC2772t9 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).c("A3", "ping in web view");
                }
                new com.inmobi.media.C2579m3(com.inmobi.media.A3.l).a(this.b);
                return kotlin.Unit.INSTANCE;
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c("A3", "ping in http executor");
            }
            com.inmobi.media.C2633o3 c2633o3 = new com.inmobi.media.C2633o3();
            com.inmobi.media.V2 v2 = this.b;
            this.f5500a = 1;
            obj = c2633o3.a(v2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.inmobi.media.EnumC2372e6 enumC2372e6 = (com.inmobi.media.EnumC2372e6) obj;
        if (enumC2372e6 != null) {
            com.inmobi.media.A3.l.a(this.b, enumC2372e6);
        } else {
            com.inmobi.media.A3.l.a(this.b);
        }
        return kotlin.Unit.INSTANCE;
    }
}
