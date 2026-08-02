package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ io.ktor.client.request.HttpRequestBuilder f6841a;
    public final /* synthetic */ java.util.Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.Set set, kotlin.coroutines.Continuation continuation) {
        super(4, continuation);
        this.b = set;
    }

    @Override // kotlin.jvm.functions.Function4
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        financial.atomic.muppet.c.d dVar = new financial.atomic.muppet.c.d(this.b, (kotlin.coroutines.Continuation) obj4);
        dVar.f6841a = (io.ktor.client.request.HttpRequestBuilder) obj2;
        return dVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        final io.ktor.http.URLBuilder url = this.f6841a.getUrl();
        io.ktor.http.URLProtocol.Companion companion = io.ktor.http.URLProtocol.INSTANCE;
        if (kotlin.jvm.internal.Intrinsics.areEqual(companion.getHTTP(), url.getProtocol()) && !this.b.contains(url.getHost())) {
            financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
            new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.c.d$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return financial.atomic.muppet.c.d.m23221$r8$lambda$8XAOwNxFQt9L_cqh2yl9d02k(io.ktor.http.URLBuilder.this);
                }
            };
            url.setProtocol(companion.getHTTPS());
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8X-A-Ow-NxFQt9L_cqh2yl9d02k, reason: not valid java name */
    public static /* synthetic */ java.lang.String m23221$r8$lambda$8XAOwNxFQt9L_cqh2yl9d02k(io.ktor.http.URLBuilder uRLBuilder) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Rerouting to HTTPS: ");
        sb.append(io.ktor.http.URLBuilderKt.clone(uRLBuilder).build());
        return sb.toString();
    }
}
