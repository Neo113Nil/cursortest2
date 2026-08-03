package com.inmobi.media;

/* renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2259a extends com.inmobi.media.R0 {
    public final byte[] b;
    public final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2259a(byte[] response, long j, com.inmobi.media.C2799u9 c2799u9) {
        super(c2799u9);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        this.b = response;
        this.c = j;
    }

    @Override // com.inmobi.media.R0
    public final kotlin.Unit a(com.inmobi.media.ads.network.common.model.AdResponse adResponse, kotlin.jvm.functions.Function1 function1) {
        com.inmobi.media.C2799u9 c2799u9 = this.f4927a;
        if (c2799u9 != null) {
            c2799u9.a("ABAdResponseManager", "Instance PLId: " + this.c + ", Response PLId: " + adResponse.getPlacementId());
        }
        com.inmobi.media.V0.a(adResponse, this.f4927a, function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.R0
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        return new java.lang.String(this.b, kotlin.text.Charsets.UTF_8);
    }
}
