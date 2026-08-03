package com.inmobi.media;

/* renamed from: com.inmobi.media.h1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2447h1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5230a;
    public final /* synthetic */ com.inmobi.media.AbstractC2551l1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2447h1(com.inmobi.media.AbstractC2551l1 abstractC2551l1, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = abstractC2551l1;
    }

    public static final kotlin.Unit a(com.inmobi.media.AbstractC2551l1 abstractC2551l1, com.inmobi.media.W w) {
        com.inmobi.media.AbstractC2551l1.a(abstractC2551l1, w);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2447h1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2447h1(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5230a;
        try {
            if (i != 0) {
                try {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.Throwable th) {
                    this.b.b((byte) 0);
                    throw th;
                }
            } else {
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.C2707qo c2707qo = new com.inmobi.media.C2707qo(this.b.H(), this.b.i);
                final com.inmobi.media.AbstractC2551l1 abstractC2551l1 = this.b;
                kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.h1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.inmobi.media.C2447h1.a(com.inmobi.media.AbstractC2551l1.this, (com.inmobi.media.W) obj2);
                    }
                };
                this.f5230a = 1;
                obj = c2707qo.a(function1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            com.inmobi.media.ads.network.common.model.AdResponse adResponse = (com.inmobi.media.ads.network.common.model.AdResponse) obj;
            com.inmobi.media.AbstractC2551l1 abstractC2551l12 = this.b;
            com.inmobi.media.C2799u9 c2799u9 = abstractC2551l12.i;
            if (c2799u9 != null) {
                com.inmobi.media.C2816v0 c2816v0 = abstractC2551l12.l;
                com.inmobi.media.AbstractC2341d0.a(c2816v0.e, c2816v0.f, adResponse, c2799u9);
            }
            this.b.a(adResponse);
        } catch (com.inmobi.media.Y e) {
            com.inmobi.media.AbstractC2551l1.a(this.b, e);
        } catch (java.lang.Throwable th2) {
            com.inmobi.media.C2799u9 c2799u92 = this.b.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u92.a("l1", "doAdLoadWork: " + th2);
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(th2));
            com.inmobi.media.AbstractC2551l1 abstractC2551l13 = this.b;
            abstractC2551l13.getClass();
            abstractC2551l13.b(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", (short) 2363)));
            abstractC2551l13.b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        this.b.b((byte) 0);
        return kotlin.Unit.INSTANCE;
    }
}
