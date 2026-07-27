package com.mbridge.msdk.thrid.okhttp;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* compiled from: ResponseBody.java */
/* loaded from: classes6.dex */
public abstract class b0 implements Closeable {

    /* compiled from: ResponseBody.java */
    static class a extends b0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f9868a;
        final /* synthetic */ long b;
        final /* synthetic */ com.mbridge.msdk.thrid.okio.e c;

        a(u uVar, long j, com.mbridge.msdk.thrid.okio.e eVar) {
            this.f9868a = uVar;
            this.b = j;
            this.c = eVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public long k() {
            return this.b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        @Nullable
        public u l() {
            return this.f9868a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public com.mbridge.msdk.thrid.okio.e m() {
            return this.c;
        }
    }

    public static b0 a(@Nullable u uVar, byte[] bArr) {
        return a(uVar, bArr.length, new com.mbridge.msdk.thrid.okio.c().write(bArr));
    }

    private Charset h() {
        u l = l();
        return l != null ? l.a(com.mbridge.msdk.thrid.okhttp.internal.c.j) : com.mbridge.msdk.thrid.okhttp.internal.c.j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(m());
    }

    public final InputStream d() {
        return m().j();
    }

    public abstract long k();

    @Nullable
    public abstract u l();

    public abstract com.mbridge.msdk.thrid.okio.e m();

    public final String n() throws IOException {
        com.mbridge.msdk.thrid.okio.e m = m();
        try {
            return m.a(com.mbridge.msdk.thrid.okhttp.internal.c.a(m, h()));
        } finally {
            com.mbridge.msdk.thrid.okhttp.internal.c.a(m);
        }
    }

    public static b0 a(@Nullable u uVar, long j, com.mbridge.msdk.thrid.okio.e eVar) {
        if (eVar != null) {
            return new a(uVar, j, eVar);
        }
        throw new NullPointerException("source == null");
    }
}
