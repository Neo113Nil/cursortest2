package com.inmobi.media;

/* renamed from: com.inmobi.media.pb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2667pb extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5388a;
    public final /* synthetic */ com.inmobi.media.C2259a b;
    public final /* synthetic */ com.inmobi.media.AbstractC2694qb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2667pb(com.inmobi.media.C2259a c2259a, com.inmobi.media.AbstractC2694qb abstractC2694qb, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2259a;
        this.c = abstractC2694qb;
    }

    public static final kotlin.Unit a(com.inmobi.media.AbstractC2694qb abstractC2694qb, com.inmobi.media.W w) {
        abstractC2694qb.m.a(w);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2667pb(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2667pb(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5388a;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.C2259a c2259a = this.b;
                final com.inmobi.media.AbstractC2694qb abstractC2694qb = this.c;
                kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.pb$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.inmobi.media.C2667pb.a(com.inmobi.media.AbstractC2694qb.this, (com.inmobi.media.W) obj2);
                    }
                };
                this.f5388a = 1;
                obj = c2259a.a(function1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.inmobi.media.ads.network.common.model.AdResponse adResponse = (com.inmobi.media.ads.network.common.model.AdResponse) obj;
            this.c.f5166a.getClass();
            com.inmobi.media.AbstractC2694qb abstractC2694qb2 = this.c;
            com.inmobi.media.AbstractC2341d0.a("native", abstractC2694qb2.d.g, adResponse, abstractC2694qb2.e);
            com.inmobi.media.C2799u9 c2799u9 = this.c.e;
            if (c2799u9 != null) {
                c2799u9.a("AUM-LoadResponseState", "AdResponse Parse Success");
            }
            this.c.a(adResponse);
        } catch (com.inmobi.media.Y e) {
            com.inmobi.media.C2799u9 c2799u92 = this.c.e;
            if (c2799u92 != null) {
                c2799u92.b("AUM-LoadResponseState", "AdResponse Parse Failure " + e);
            }
            com.inmobi.media.AbstractC2694qb abstractC2694qb3 = this.c;
            abstractC2694qb3.getClass();
            com.inmobi.media.V v = e.b;
            if (v instanceof com.inmobi.media.C2360dj) {
                com.inmobi.media.C2576m0 c2576m0 = abstractC2694qb3.g;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(c2576m0.f5324a, null, null, new com.inmobi.media.C2550l0(c2576m0, null), 3, null);
                abstractC2694qb3.a(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", (short) 0)), e.f5055a);
            } else if (v instanceof com.inmobi.media.N6) {
                abstractC2694qb3.a(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", java.lang.Short.valueOf(((com.inmobi.media.N6) v).f4848a))), e.f5055a);
            } else if (v instanceof com.inmobi.media.O6) {
                abstractC2694qb3.a(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", java.lang.Short.valueOf((short) ((com.inmobi.media.O6) v).f4870a))), e.f5055a);
            } else {
                if (!(v instanceof com.inmobi.media.C2306bj)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                abstractC2694qb3.a(((com.inmobi.media.C2306bj) v).f5127a, e.f5055a);
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
