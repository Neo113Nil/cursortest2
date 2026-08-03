package com.inmobi.media;

/* renamed from: com.inmobi.media.wo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2866wo extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5537a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ com.inmobi.media.InterfaceC2772t9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2866wo(java.lang.String str, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = interfaceC2772t9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2866wo(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2866wo(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.inmobi.media.C2787to c2787to;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5537a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Ao ao = com.inmobi.media.Ao.f4610a;
            kotlinx.coroutines.Deferred a2 = com.inmobi.media.Ao.a(this.b, this.c);
            this.f5537a = 1;
            obj = a2.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.inmobi.media.Ve ve = (com.inmobi.media.Ve) obj;
        com.inmobi.media.Ao ao2 = com.inmobi.media.Ao.f4610a;
        if (ve != null && com.inmobi.media.AbstractC2889xl.a(ve)) {
            okio.ByteString d = ve.d();
            java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
            if (d.string(charset).length() > 0 && (c2787to = com.inmobi.media.Ao.c) != null) {
                java.lang.String str = this.b;
                kotlin.ranges.IntRange intRange = com.inmobi.media.AbstractC2276af.f5103a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ve, "<this>");
                java.lang.String string = ve.d().string(charset);
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
                java.lang.String str2 = this.b;
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).c("WebResourceHandler", "downloadResourceAndSaveToCache() response received: " + str2);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(c2787to.a(str, string, this.c));
            }
        }
        return ve;
    }
}
