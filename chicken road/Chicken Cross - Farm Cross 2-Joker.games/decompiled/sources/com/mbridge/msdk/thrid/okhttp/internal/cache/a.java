package com.mbridge.msdk.thrid.okhttp.internal.cache;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.internal.cache.b;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;

/* compiled from: CacheInterceptor.java */
/* loaded from: classes6.dex */
public final class a implements t {
    public a(c cVar) {
    }

    static boolean b(String str) {
        return (HttpHeaders.CONNECTION.equalsIgnoreCase(str) || HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || HttpHeaders.TE.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || HttpHeaders.UPGRADE.equalsIgnoreCase(str)) ? false : true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        b c = new b.a(System.currentTimeMillis(), aVar.d(), null).c();
        y yVar = c.f9883a;
        a0 a0Var = c.b;
        if (yVar == null && a0Var == null) {
            return new a0.a().a(aVar.d()).a(w.HTTP_1_1).a(PglCryptUtils.BASE64_FAILED).a("Unsatisfiable Request (only-if-cached)").a(com.mbridge.msdk.thrid.okhttp.internal.c.c).b(-1L).a(System.currentTimeMillis()).a();
        }
        if (yVar == null) {
            return a0Var.p().a(a(a0Var)).a();
        }
        a0 a2 = aVar.a(yVar);
        if (a0Var != null) {
            if (a2.k() == 304) {
                a0Var.p().a(a(a0Var.m(), a2.m())).b(a2.t()).a(a2.r()).a(a(a0Var)).c(a(a2)).a();
                a2.d().close();
                throw null;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(a0Var.d());
        }
        return a2.p().a(a(a0Var)).c(a(a2)).a();
    }

    private static a0 a(a0 a0Var) {
        return (a0Var == null || a0Var.d() == null) ? a0Var : a0Var.p().a((b0) null).a();
    }

    private static r a(r rVar, r rVar2) {
        r.a aVar = new r.a();
        int b = rVar.b();
        for (int i = 0; i < b; i++) {
            String a2 = rVar.a(i);
            String b2 = rVar.b(i);
            if ((!HttpHeaders.WARNING.equalsIgnoreCase(a2) || !b2.startsWith("1")) && (a(a2) || !b(a2) || rVar2.b(a2) == null)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f9879a.a(aVar, a2, b2);
            }
        }
        int b3 = rVar2.b();
        for (int i2 = 0; i2 < b3; i2++) {
            String a3 = rVar2.a(i2);
            if (!a(a3) && b(a3)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f9879a.a(aVar, a3, rVar2.b(i2));
            }
        }
        return aVar.a();
    }

    static boolean a(String str) {
        return HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(str) || HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }
}
