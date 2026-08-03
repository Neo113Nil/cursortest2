package com.inmobi.media;

/* renamed from: com.inmobi.media.j1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2498j1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5267a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ com.inmobi.media.AbstractC2551l1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2498j1(byte[] bArr, com.inmobi.media.AbstractC2551l1 abstractC2551l1, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = bArr;
        this.c = abstractC2551l1;
    }

    public static final kotlin.Unit a(com.inmobi.media.AbstractC2551l1 abstractC2551l1, com.inmobi.media.W w) {
        com.inmobi.media.AbstractC2551l1.a(abstractC2551l1, w);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2498j1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2498j1(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5267a;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                byte[] bArr = this.b;
                com.inmobi.media.AbstractC2551l1 abstractC2551l1 = this.c;
                com.inmobi.media.C2259a c2259a = new com.inmobi.media.C2259a(bArr, abstractC2551l1.l.f5497a, abstractC2551l1.i);
                final com.inmobi.media.AbstractC2551l1 abstractC2551l12 = this.c;
                kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.j1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.inmobi.media.C2498j1.a(com.inmobi.media.AbstractC2551l1.this, (com.inmobi.media.W) obj2);
                    }
                };
                this.f5267a = 1;
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
            com.inmobi.media.AbstractC2551l1 abstractC2551l13 = this.c;
            com.inmobi.media.C2799u9 c2799u9 = abstractC2551l13.i;
            if (c2799u9 != null) {
                com.inmobi.media.C2816v0 c2816v0 = abstractC2551l13.l;
                com.inmobi.media.AbstractC2341d0.a(c2816v0.e, c2816v0.f, adResponse, c2799u9);
            }
            this.c.a(adResponse);
        } catch (com.inmobi.media.Y e) {
            com.inmobi.media.AbstractC2551l1 abstractC2551l14 = this.c;
            com.inmobi.media.V v = e.b;
            if (v instanceof com.inmobi.media.C2306bj) {
                abstractC2551l14.b(((com.inmobi.media.C2306bj) v).f5127a);
            }
            abstractC2551l14.b(e.f5055a, true, (short) 0);
        } catch (java.lang.Throwable th) {
            com.inmobi.media.C2799u9 c2799u92 = this.c.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u92.a("l1", "doAdLoadWork: " + th);
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(th));
            com.inmobi.media.AbstractC2551l1 abstractC2551l15 = this.c;
            abstractC2551l15.getClass();
            abstractC2551l15.b(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", (short) 2363)));
            abstractC2551l15.b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        return kotlin.Unit.INSTANCE;
    }
}
