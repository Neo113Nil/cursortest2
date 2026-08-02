package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class N extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f12125a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f12126b;

    /* renamed from: c, reason: collision with root package name */
    public int f12127c;

    /* renamed from: d, reason: collision with root package name */
    public int f12128d;

    /* renamed from: e, reason: collision with root package name */
    public int f12129e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12130f;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f12131x;

    /* renamed from: y, reason: collision with root package name */
    public int f12132y;

    /* renamed from: z, reason: collision with root package name */
    public long f12133z;

    public final boolean a() {
        this.f12128d++;
        Iterator it = this.f12125a;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f12126b = byteBuffer;
        this.f12129e = byteBuffer.position();
        if (this.f12126b.hasArray()) {
            this.f12130f = true;
            this.f12131x = this.f12126b.array();
            this.f12132y = this.f12126b.arrayOffset();
        } else {
            this.f12130f = false;
            this.f12133z = K0.f12117c.j(K0.f12121g, this.f12126b);
            this.f12131x = null;
        }
        return true;
    }

    public final void b(int i7) {
        int i8 = this.f12129e + i7;
        this.f12129e = i8;
        if (i8 == this.f12126b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f12128d == this.f12127c) {
            return -1;
        }
        if (this.f12130f) {
            int i7 = this.f12131x[this.f12129e + this.f12132y] & 255;
            b(1);
            return i7;
        }
        int e7 = K0.f12117c.e(this.f12129e + this.f12133z) & 255;
        b(1);
        return e7;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        if (this.f12128d == this.f12127c) {
            return -1;
        }
        int limit = this.f12126b.limit();
        int i9 = this.f12129e;
        int i10 = limit - i9;
        if (i8 > i10) {
            i8 = i10;
        }
        if (this.f12130f) {
            System.arraycopy(this.f12131x, i9 + this.f12132y, bArr, i7, i8);
            b(i8);
        } else {
            int position = this.f12126b.position();
            this.f12126b.position(this.f12129e);
            this.f12126b.get(bArr, i7, i8);
            this.f12126b.position(position);
            b(i8);
        }
        return i8;
    }
}
