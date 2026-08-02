package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class L extends OutputStream implements N {
    public final Handler a;
    public final HashMap b = new HashMap();
    public z c;
    public P d;
    public int e;

    public L(Handler handler) {
        this.a = handler;
    }

    @Override // com.facebook.N
    public final void d(z zVar) {
        this.c = zVar;
        this.d = zVar != null ? (P) this.b.get(zVar) : null;
    }

    public final void l(long j) {
        z zVar = this.c;
        if (zVar == null) {
            return;
        }
        if (this.d == null) {
            P p = new P(this.a, zVar);
            this.d = p;
            this.b.put(zVar, p);
        }
        P p2 = this.d;
        if (p2 != null) {
            p2.f += j;
        }
        this.e += (int) j;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        l(buffer.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        l(i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        l(1L);
    }
}
