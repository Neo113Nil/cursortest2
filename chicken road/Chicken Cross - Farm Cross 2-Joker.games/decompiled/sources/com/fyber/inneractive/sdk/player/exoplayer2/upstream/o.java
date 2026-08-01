package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;

/* loaded from: classes4.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5749a;
    public final m b;
    public final g c;

    public o(Context context, m mVar, q qVar) {
        this.f5749a = context.getApplicationContext();
        this.b = mVar;
        this.c = qVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new n(this.f5749a, this.b, this.c.a());
    }
}
