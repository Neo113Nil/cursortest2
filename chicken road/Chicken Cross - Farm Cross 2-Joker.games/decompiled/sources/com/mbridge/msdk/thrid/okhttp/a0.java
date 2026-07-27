package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.r;
import java.io.Closeable;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Response.java */
/* loaded from: classes6.dex */
public final class a0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final y f9865a;
    final w b;
    final int c;
    final String d;

    @Nullable
    final q e;
    final r f;

    @Nullable
    final b0 g;

    @Nullable
    final a0 h;

    @Nullable
    final a0 i;

    @Nullable
    final a0 j;
    final long k;
    final long l;

    @Nullable
    private volatile c m;

    /* compiled from: Response.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        y f9866a;

        @Nullable
        w b;
        int c;
        String d;

        @Nullable
        q e;
        r.a f;

        @Nullable
        b0 g;

        @Nullable
        a0 h;

        @Nullable
        a0 i;

        @Nullable
        a0 j;
        long k;
        long l;

        public a() {
            this.c = -1;
            this.f = new r.a();
        }

        public a a(y yVar) {
            this.f9866a = yVar;
            return this;
        }

        public a b(String str, String str2) {
            this.f.c(str, str2);
            return this;
        }

        public a c(@Nullable a0 a0Var) {
            if (a0Var != null) {
                a("networkResponse", a0Var);
            }
            this.h = a0Var;
            return this;
        }

        public a d(@Nullable a0 a0Var) {
            if (a0Var != null) {
                b(a0Var);
            }
            this.j = a0Var;
            return this;
        }

        private void b(a0 a0Var) {
            if (a0Var.g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(w wVar) {
            this.b = wVar;
            return this;
        }

        public a a(int i) {
            this.c = i;
            return this;
        }

        public a a(String str) {
            this.d = str;
            return this;
        }

        public a b(long j) {
            this.k = j;
            return this;
        }

        public a a(@Nullable q qVar) {
            this.e = qVar;
            return this;
        }

        public a a(String str, String str2) {
            this.f.a(str, str2);
            return this;
        }

        public a a(r rVar) {
            this.f = rVar.a();
            return this;
        }

        public a a(@Nullable b0 b0Var) {
            this.g = b0Var;
            return this;
        }

        public a a(@Nullable a0 a0Var) {
            if (a0Var != null) {
                a("cacheResponse", a0Var);
            }
            this.i = a0Var;
            return this;
        }

        private void a(String str, a0 a0Var) {
            if (a0Var.g == null) {
                if (a0Var.h == null) {
                    if (a0Var.i == null) {
                        if (a0Var.j != null) {
                            throw new IllegalArgumentException(str + ".priorResponse != null");
                        }
                        return;
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        a(a0 a0Var) {
            this.c = -1;
            this.f9866a = a0Var.f9865a;
            this.b = a0Var.b;
            this.c = a0Var.c;
            this.d = a0Var.d;
            this.e = a0Var.e;
            this.f = a0Var.f.a();
            this.g = a0Var.g;
            this.h = a0Var.h;
            this.i = a0Var.i;
            this.j = a0Var.j;
            this.k = a0Var.k;
            this.l = a0Var.l;
        }

        public a a(long j) {
            this.l = j;
            return this;
        }

        public a0 a() {
            if (this.f9866a != null) {
                if (this.b != null) {
                    if (this.c >= 0) {
                        if (this.d != null) {
                            return new a0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    a0(a aVar) {
        this.f9865a = aVar.f9866a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f.a();
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
    }

    @Nullable
    public String a(String str, @Nullable String str2) {
        String b = this.f.b(str);
        return b != null ? b : str2;
    }

    @Nullable
    public String b(String str) {
        return a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.g;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    @Nullable
    public b0 d() {
        return this.g;
    }

    public c h() {
        c cVar = this.m;
        if (cVar != null) {
            return cVar;
        }
        c a2 = c.a(this.f);
        this.m = a2;
        return a2;
    }

    public int k() {
        return this.c;
    }

    @Nullable
    public q l() {
        return this.e;
    }

    public r m() {
        return this.f;
    }

    public boolean n() {
        int i = this.c;
        return i >= 200 && i < 300;
    }

    public String o() {
        return this.d;
    }

    public a p() {
        return new a(this);
    }

    @Nullable
    public a0 q() {
        return this.j;
    }

    public long r() {
        return this.l;
    }

    public y s() {
        return this.f9865a;
    }

    public long t() {
        return this.k;
    }

    public String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.c + ", message=" + this.d + ", url=" + this.f9865a.g() + AbstractJsonLexerKt.END_OBJ;
    }
}
