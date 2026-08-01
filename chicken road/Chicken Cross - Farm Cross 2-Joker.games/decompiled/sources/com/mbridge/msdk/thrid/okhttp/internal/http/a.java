package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.google.common.net.HttpHeaders;
import com.ironsource.C4761z5;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.l;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.u;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import java.io.IOException;
import java.util.List;

/* compiled from: BridgeInterceptor.java */
/* loaded from: classes6.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    private final l f9893a;

    public a(l lVar) {
        this.f9893a = lVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        y d = aVar.d();
        y.a f = d.f();
        z a2 = d.a();
        if (a2 != null) {
            u b = a2.b();
            if (b != null) {
                f.b("Content-Type", b.toString());
            }
            long a3 = a2.a();
            if (a3 != -1) {
                f.b(HttpHeaders.CONTENT_LENGTH, Long.toString(a3));
                f.a(HttpHeaders.TRANSFER_ENCODING);
            } else {
                f.b(HttpHeaders.TRANSFER_ENCODING, "chunked");
                f.a(HttpHeaders.CONTENT_LENGTH);
            }
        }
        boolean z = false;
        if (d.a(HttpHeaders.HOST) == null) {
            f.b(HttpHeaders.HOST, com.mbridge.msdk.thrid.okhttp.internal.c.a(d.g(), false));
        }
        if (d.a(HttpHeaders.CONNECTION) == null) {
            f.b(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        }
        if (d.a(HttpHeaders.ACCEPT_ENCODING) == null && d.a("Range") == null) {
            f.b(HttpHeaders.ACCEPT_ENCODING, "gzip");
            z = true;
        }
        List<com.mbridge.msdk.thrid.okhttp.k> a4 = this.f9893a.a(d.g());
        if (!a4.isEmpty()) {
            f.b(HttpHeaders.COOKIE, a(a4));
        }
        if (d.a("User-Agent") == null) {
            f.b("User-Agent", com.mbridge.msdk.thrid.okhttp.internal.d.a());
        }
        a0 a5 = aVar.a(f.a());
        e.a(this.f9893a, d.g(), a5.m());
        a0.a a6 = a5.p().a(d);
        if (z && "gzip".equalsIgnoreCase(a5.b(HttpHeaders.CONTENT_ENCODING)) && e.b(a5)) {
            com.mbridge.msdk.thrid.okio.j jVar = new com.mbridge.msdk.thrid.okio.j(a5.d().m());
            a6.a(a5.m().a().b(HttpHeaders.CONTENT_ENCODING).b(HttpHeaders.CONTENT_LENGTH).a());
            a6.a(new h(a5.b("Content-Type"), -1L, com.mbridge.msdk.thrid.okio.l.a(jVar)));
        }
        return a6.a();
    }

    private String a(List<com.mbridge.msdk.thrid.okhttp.k> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            com.mbridge.msdk.thrid.okhttp.k kVar = list.get(i);
            sb.append(kVar.a()).append(C4761z5.U).append(kVar.b());
        }
        return sb.toString();
    }
}
