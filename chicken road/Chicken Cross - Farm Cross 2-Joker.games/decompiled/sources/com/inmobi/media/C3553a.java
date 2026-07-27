package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3553a extends T0 {
    public final byte[] b;
    public final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3553a(byte[] response, long j, Z9 z9) {
        super(z9);
        Intrinsics.checkNotNullParameter(response, "response");
        this.b = response;
        this.c = j;
    }

    @Override // com.inmobi.media.T0
    public final Unit a(AdResponse adResponse, Function1 function1) {
        Z9 z9 = this.f6862a;
        if (z9 != null) {
            z9.a("ABAdResponseManager", "Instance PLId: " + this.c + ", Response PLId: " + adResponse.getPlacementId());
        }
        X0.a(adResponse, this.f6862a, function1);
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.T0
    public final Object a(Continuation continuation) {
        return new String(this.b, Charsets.UTF_8);
    }
}
