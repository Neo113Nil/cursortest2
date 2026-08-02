package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class YB extends InputStream {

    /* renamed from: k, reason: collision with root package name */
    public Iterator f12283k;

    /* renamed from: l, reason: collision with root package name */
    public ByteBuffer f12284l;

    /* renamed from: m, reason: collision with root package name */
    public int f12285m;

    /* renamed from: n, reason: collision with root package name */
    public int f12286n;

    /* renamed from: o, reason: collision with root package name */
    public int f12287o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12288p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f12289q;

    /* renamed from: r, reason: collision with root package name */
    public int f12290r;

    /* renamed from: s, reason: collision with root package name */
    public long f12291s;

    public final void b(int i) {
        int i5 = this.f12287o + i;
        this.f12287o = i5;
        if (i5 == this.f12284l.limit()) {
            d();
        }
    }

    public final boolean d() {
        this.f12286n++;
        Iterator it = this.f12283k;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f12284l = byteBuffer;
        this.f12287o = byteBuffer.position();
        if (this.f12284l.hasArray()) {
            this.f12288p = true;
            this.f12289q = this.f12284l.array();
            this.f12290r = this.f12284l.arrayOffset();
        } else {
            this.f12288p = false;
            this.f12291s = CC.f(this.f12284l);
            this.f12289q = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f12286n == this.f12285m) {
            return -1;
        }
        if (this.f12288p) {
            int i = this.f12289q[this.f12287o + this.f12290r] & 255;
            b(1);
            return i;
        }
        int W02 = CC.f7973c.W0(this.f12287o + this.f12291s) & 255;
        b(1);
        return W02;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) {
        if (this.f12286n == this.f12285m) {
            return -1;
        }
        int limit = this.f12284l.limit();
        int i6 = this.f12287o;
        int i7 = limit - i6;
        if (i5 > i7) {
            i5 = i7;
        }
        if (this.f12288p) {
            System.arraycopy(this.f12289q, i6 + this.f12290r, bArr, i, i5);
            b(i5);
            return i5;
        }
        int position = this.f12284l.position();
        this.f12284l.position(this.f12287o);
        this.f12284l.get(bArr, i, i5);
        this.f12284l.position(position);
        b(i5);
        return i5;
    }
}
