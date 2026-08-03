package com.inmobi.media;

/* renamed from: com.inmobi.media.i1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2473i1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.AbstractC2551l1 f5249a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ com.inmobi.media.G2 c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.lang.String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2473i1(com.inmobi.media.AbstractC2551l1 abstractC2551l1, java.lang.String str, com.inmobi.media.G2 g2, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5249a = abstractC2551l1;
        this.b = str;
        this.c = g2;
        this.d = str2;
        this.e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2473i1(this.f5249a, this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2473i1) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.inmobi.media.ads.network.common.model.Ad b = this.f5249a.b(0);
            if (b == null || !kotlin.jvm.internal.Intrinsics.areEqual(b.getImpressionId(), this.b)) {
                com.inmobi.media.C2799u9 c2799u9 = this.f5249a.i;
                if (c2799u9 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u9.c("l1", "Returning blob as empty string");
                }
                ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.c).c(this.d, this.e, "");
            } else {
                java.lang.String webVast = b.getWebVast();
                ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.c).c(this.d, this.e, webVast);
                com.inmobi.media.C2799u9 c2799u92 = this.f5249a.i;
                if (c2799u92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u92.c("l1", "Returning blob " + webVast);
                }
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u93 = this.f5249a.i;
            if (c2799u93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u93.a("l1", "Exception while getBlob", e);
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
        return kotlin.Unit.INSTANCE;
    }
}
