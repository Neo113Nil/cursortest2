package s1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class k implements s {

    /* renamed from: a, reason: collision with root package name */
    public final n f6630a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f6631b;

    /* renamed from: c, reason: collision with root package name */
    public int f6632c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6633d;

    public k(n nVar, Inflater inflater) {
        this.f6630a = nVar;
        this.f6631b = inflater;
    }

    @Override // s1.s
    public final long c(e eVar, long j2) {
        boolean z2;
        if (this.f6633d) {
            throw new IllegalStateException("closed");
        }
        do {
            Inflater inflater = this.f6631b;
            boolean needsInput = inflater.needsInput();
            n nVar = this.f6630a;
            z2 = false;
            if (needsInput) {
                int i2 = this.f6632c;
                if (i2 != 0) {
                    int remaining = i2 - inflater.getRemaining();
                    this.f6632c -= remaining;
                    nVar.p(remaining);
                }
                if (inflater.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                if (nVar.a()) {
                    z2 = true;
                } else {
                    o oVar = nVar.f6638a.f6617a;
                    int i3 = oVar.f6643c;
                    int i4 = oVar.f6642b;
                    int i5 = i3 - i4;
                    this.f6632c = i5;
                    inflater.setInput(oVar.f6641a, i4, i5);
                }
            }
            try {
                o r2 = eVar.r(1);
                int inflate = inflater.inflate(r2.f6641a, r2.f6643c, (int) Math.min(8192L, 8192 - r2.f6643c));
                if (inflate > 0) {
                    r2.f6643c += inflate;
                    long j3 = inflate;
                    eVar.f6618b += j3;
                    return j3;
                }
                if (!inflater.finished() && !inflater.needsDictionary()) {
                }
                int i6 = this.f6632c;
                if (i6 != 0) {
                    int remaining2 = i6 - inflater.getRemaining();
                    this.f6632c -= remaining2;
                    nVar.p(remaining2);
                }
                if (r2.f6642b != r2.f6643c) {
                    return -1L;
                }
                eVar.f6617a = r2.a();
                p.a(r2);
                return -1L;
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        } while (!z2);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6633d) {
            return;
        }
        this.f6631b.end();
        this.f6633d = true;
        this.f6630a.close();
    }

    @Override // s1.s
    public final u d() {
        return this.f6630a.f6639b.d();
    }
}
