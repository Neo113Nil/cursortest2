package com.inmobi.media;

/* renamed from: com.inmobi.media.k1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2524k1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.AbstractC2551l1 f5283a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2524k1(com.inmobi.media.AbstractC2551l1 abstractC2551l1, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5283a = abstractC2551l1;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2524k1(this.f5283a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2524k1) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.ads.network.common.model.Ad b = this.f5283a.b(0);
        if (b == null || !kotlin.jvm.internal.Intrinsics.areEqual(b.getImpressionId(), this.b)) {
            com.inmobi.media.C2799u9 c2799u9 = this.f5283a.i;
            if (c2799u9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u9.b("l1", "Impression ID is null for saveBlob");
            }
        } else {
            this.f5283a.a(b, this.c);
            com.inmobi.media.C2799u9 c2799u92 = this.f5283a.i;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u92.c("l1", "Updated blob " + this.c);
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
