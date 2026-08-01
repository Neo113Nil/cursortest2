package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;

/* compiled from: ConnectInterceptor.java */
/* loaded from: classes6.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final v f9885a;

    public a(v vVar) {
        this.f9885a = vVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.http.g gVar = (com.mbridge.msdk.thrid.okhttp.internal.http.g) aVar;
        y d = gVar.d();
        g i = gVar.i();
        return gVar.a(d, i, i.a(this.f9885a, aVar, !d.e().equals("GET")), i.c());
    }
}
