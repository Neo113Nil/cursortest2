package com.facebook;

import android.os.Handler;
import com.facebook.D;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class M extends FilterOutputStream implements N {
    public final D a;
    public final Map<z, P> b;
    public final long c;
    public final long d;
    public long e;
    public long f;
    public P i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(FilterOutputStream out, D requests, Map progressMap, long j) {
        super(out);
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(progressMap, "progressMap");
        this.a = requests;
        this.b = progressMap;
        this.c = j;
        w wVar = w.a;
        com.facebook.internal.F.f();
        this.d = w.i.get();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        Iterator<P> it = this.b.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        q();
    }

    @Override // com.facebook.N
    public final void d(z zVar) {
        this.i = zVar != null ? this.b.get(zVar) : null;
    }

    public final void l(long j) {
        P p = this.i;
        if (p != null) {
            long j2 = p.d + j;
            p.d = j2;
            if (j2 >= p.e + p.c || j2 >= p.f) {
                p.a();
            }
        }
        long j3 = this.e + j;
        this.e = j3;
        if (j3 >= this.f + this.d || j3 >= this.c) {
            q();
        }
    }

    public final void q() {
        if (this.e > this.f) {
            D d = this.a;
            Iterator it = d.d.iterator();
            while (it.hasNext()) {
                D.a aVar = (D.a) it.next();
                if (aVar instanceof D.c) {
                    Handler handler = d.a;
                    if (handler != null) {
                        handler.post(new androidx.media3.common.util.a(1, (D.c) aVar, this));
                    } else {
                        ((D.c) aVar).b();
                    }
                }
            }
            this.f = this.e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        l(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] buffer, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i, i2);
        l(i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        l(1L);
    }
}
