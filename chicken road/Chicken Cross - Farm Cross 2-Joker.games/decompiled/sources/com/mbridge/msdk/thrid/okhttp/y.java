package com.mbridge.msdk.thrid.okhttp;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.r;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Request.java */
/* loaded from: classes6.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    final s f9955a;
    final String b;
    final r c;

    @Nullable
    final z d;
    final Map<Class<?>, Object> e;

    @Nullable
    private volatile c f;

    /* compiled from: Request.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        s f9956a;
        String b;
        r.a c;

        @Nullable
        z d;
        Map<Class<?>, Object> e;

        public a() {
            this.e = Collections.emptyMap();
            this.b = "GET";
            this.c = new r.a();
        }

        public a a(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f9956a = sVar;
            return this;
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            return a(s.b(str));
        }

        public a c() {
            return a("GET", (z) null);
        }

        public a d() {
            return a("HEAD", (z) null);
        }

        public a c(z zVar) {
            return a("POST", zVar);
        }

        public a d(z zVar) {
            return a("PUT", zVar);
        }

        public a a(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.c.b(str);
            return this;
        }

        public a a(r rVar) {
            this.c = rVar.a();
            return this;
        }

        public a a(c cVar) {
            String cVar2 = cVar.toString();
            return cVar2.isEmpty() ? a(HttpHeaders.CACHE_CONTROL) : b(HttpHeaders.CACHE_CONTROL, cVar2);
        }

        a(y yVar) {
            this.e = Collections.emptyMap();
            this.f9956a = yVar.f9955a;
            this.b = yVar.b;
            this.d = yVar.d;
            this.e = yVar.e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(yVar.e);
            this.c = yVar.c.a();
        }

        public a a(@Nullable z zVar) {
            return a("DELETE", zVar);
        }

        public a b(String str, String str2) {
            this.c.c(str, str2);
            return this;
        }

        public a a(String str, @Nullable z zVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (zVar != null && !com.mbridge.msdk.thrid.okhttp.internal.http.f.a(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                    if (zVar == null && com.mbridge.msdk.thrid.okhttp.internal.http.f.d(str)) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                    this.b = str;
                    this.d = zVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public a b() {
            return a(com.mbridge.msdk.thrid.okhttp.internal.c.d);
        }

        public a b(z zVar) {
            return a("PATCH", zVar);
        }

        public y a() {
            if (this.f9956a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    y(a aVar) {
        this.f9955a = aVar.f9956a;
        this.b = aVar.b;
        this.c = aVar.c.a();
        this.d = aVar.d;
        this.e = com.mbridge.msdk.thrid.okhttp.internal.c.a(aVar.e);
    }

    @Nullable
    public String a(String str) {
        return this.c.b(str);
    }

    public c b() {
        c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        c a2 = c.a(this.c);
        this.f = a2;
        return a2;
    }

    public r c() {
        return this.c;
    }

    public boolean d() {
        return this.f9955a.h();
    }

    public String e() {
        return this.b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.f9955a;
    }

    public String toString() {
        return "Request{method=" + this.b + ", url=" + this.f9955a + ", tags=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }

    @Nullable
    public z a() {
        return this.d;
    }
}
