package m2;

import b2.AbstractC0279e;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import u1.AbstractC1477a;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1278a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11138a;

    /* renamed from: b, reason: collision with root package name */
    public int f11139b;

    /* renamed from: c, reason: collision with root package name */
    public int f11140c;

    /* renamed from: d, reason: collision with root package name */
    public int f11141d;

    /* renamed from: h, reason: collision with root package name */
    public EnumC1281d f11145h;

    /* renamed from: j, reason: collision with root package name */
    public V0.j f11147j;

    /* renamed from: e, reason: collision with root package name */
    public int f11142e = 2;

    /* renamed from: f, reason: collision with root package name */
    public int f11143f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f11144g = -1;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f11146i = new ArrayList();

    public C1278a(byte[] bArr, int i2, int i3) {
        this.f11138a = bArr;
        this.f11139b = i2;
        this.f11140c = i3;
    }

    public final void a(int i2) {
        if (this.f11142e == i2) {
            this.f11142e = 6;
            return;
        }
        int i3 = this.f11139b;
        int i6 = this.f11140c;
        if (i3 > i6) {
            throw new IOException("Expected to end at " + this.f11140c + " but was " + this.f11139b);
        }
        if (i3 != i6) {
            this.f11142e = 7;
            return;
        }
        this.f11140c = this.f11144g;
        this.f11144g = -1;
        this.f11142e = 6;
    }

    public final int b() {
        if (this.f11142e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f11142e);
        }
        int i2 = this.f11140c - this.f11139b;
        this.f11142e = 6;
        this.f11140c = this.f11144g;
        this.f11144g = -1;
        return i2;
    }

    public final int c() {
        if (this.f11142e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i2 = this.f11141d + 1;
        this.f11141d = i2;
        if (i2 > 100) {
            throw new IOException("Wire recursion limit exceeded");
        }
        ArrayList arrayList = this.f11146i;
        if (i2 > arrayList.size()) {
            arrayList.add(new j5.f());
        }
        int i3 = this.f11144g;
        this.f11144g = -1;
        this.f11142e = 6;
        return i3;
    }

    public final j5.i d(int i2) {
        if (this.f11142e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i3 = this.f11141d - 1;
        this.f11141d = i3;
        if (i3 < 0 || this.f11144g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.f11139b == this.f11140c || i3 == 0) {
            this.f11140c = i2;
            j5.f fVar = (j5.f) this.f11146i.get(i3);
            long j2 = fVar.f10495b;
            return j2 > 0 ? fVar.o(j2) : j5.i.f10496d;
        }
        throw new IOException("Expected to end at " + this.f11140c + " but was " + this.f11139b);
    }

    public final int e() {
        int i2;
        byte g6 = g();
        if (g6 >= 0) {
            return g6;
        }
        int i3 = g6 & Byte.MAX_VALUE;
        byte g7 = g();
        if (g7 >= 0) {
            i2 = g7 << 7;
        } else {
            i3 |= (g7 & Byte.MAX_VALUE) << 7;
            byte g8 = g();
            if (g8 >= 0) {
                i2 = g8 << 14;
            } else {
                i3 |= (g8 & Byte.MAX_VALUE) << 14;
                byte g9 = g();
                if (g9 < 0) {
                    int i6 = i3 | ((g9 & Byte.MAX_VALUE) << 21);
                    byte g10 = g();
                    int i7 = i6 | (g10 << 28);
                    if (g10 >= 0) {
                        return i7;
                    }
                    for (int i8 = 0; i8 < 5; i8++) {
                        if (g() >= 0) {
                            return i7;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
                i2 = g9 << 21;
            }
        }
        return i3 | i2;
    }

    public final int f() {
        int i2 = this.f11142e;
        if (i2 == 7) {
            this.f11142e = 2;
            return this.f11143f;
        }
        if (i2 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.f11139b < this.f11140c) {
            int e3 = e();
            if (e3 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i3 = e3 >> 3;
            this.f11143f = i3;
            int i6 = e3 & 7;
            if (i6 == 0) {
                this.f11145h = EnumC1281d.f11151b;
                this.f11142e = 0;
                return i3;
            }
            if (i6 == 1) {
                this.f11145h = EnumC1281d.f11152c;
                this.f11142e = 1;
                return i3;
            }
            if (i6 == 2) {
                this.f11145h = EnumC1281d.f11153d;
                this.f11142e = 2;
                int e6 = e();
                if (e6 < 0) {
                    throw new ProtocolException(AbstractC0279e.d(e6, "Negative length: "));
                }
                if (this.f11144g != -1) {
                    throw new IllegalStateException();
                }
                int i7 = this.f11140c;
                this.f11144g = i7;
                int i8 = this.f11139b + e6;
                this.f11140c = i8;
                if (i8 <= i7) {
                    return this.f11143f;
                }
                throw new EOFException();
            }
            if (i6 != 3) {
                if (i6 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i6 != 5) {
                    throw new ProtocolException(AbstractC0279e.d(i6, "Unexpected field encoding: "));
                }
                this.f11145h = EnumC1281d.f11154e;
                this.f11142e = 5;
                return i3;
            }
            o(i3);
        }
        return -1;
    }

    public final byte g() {
        int i2 = this.f11139b;
        if (i2 == this.f11140c) {
            throw new EOFException();
        }
        this.f11139b = i2 + 1;
        return this.f11138a[i2];
    }

    public final int h() {
        int i2 = this.f11142e;
        if (i2 != 5 && i2 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f11142e);
        }
        int i3 = this.f11139b;
        int i6 = i3 + 4;
        if (i6 > this.f11140c) {
            throw new EOFException();
        }
        int i7 = i3 + 1;
        this.f11139b = i7;
        byte[] bArr = this.f11138a;
        int i8 = bArr[i3] & 255;
        int i9 = i3 + 2;
        this.f11139b = i9;
        int i10 = ((bArr[i7] & 255) << 8) | i8;
        int i11 = i3 + 3;
        this.f11139b = i11;
        int i12 = i10 | ((bArr[i9] & 255) << 16);
        this.f11139b = i6;
        int i13 = ((bArr[i11] & 255) << 24) | i12;
        a(5);
        return i13;
    }

    public final long i() {
        int i2 = this.f11142e;
        if (i2 != 1 && i2 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f11142e);
        }
        int i3 = this.f11139b;
        int i6 = i3 + 8;
        if (i6 > this.f11140c) {
            throw new EOFException();
        }
        this.f11139b = i3 + 1;
        byte[] bArr = this.f11138a;
        this.f11139b = i3 + 2;
        long j2 = (bArr[i3] & 255) | ((bArr[r3] & 255) << 8);
        this.f11139b = i3 + 3;
        long j6 = j2 | ((bArr[r9] & 255) << 16);
        this.f11139b = i3 + 4;
        long j7 = j6 | ((bArr[r3] & 255) << 24);
        this.f11139b = i3 + 5;
        long j8 = j7 | ((bArr[r9] & 255) << 32);
        this.f11139b = i3 + 6;
        this.f11139b = i3 + 7;
        this.f11139b = i6;
        long j9 = ((bArr[r0] & 255) << 56) | j8 | ((bArr[r3] & 255) << 40) | ((bArr[r9] & 255) << 48);
        a(1);
        return j9;
    }

    public final String j() {
        int b6 = b();
        int i2 = this.f11139b;
        int i3 = b6 + i2;
        if (i3 > this.f11140c) {
            throw new EOFException();
        }
        byte[] bArr = this.f11138a;
        AbstractC1477a.c(i2, i3, bArr.length);
        String str = new String(bArr, i2, i3 - i2, B4.a.f287a);
        this.f11139b = i3;
        return str;
    }

    public final void k(int i2) {
        EnumC1281d enumC1281d = this.f11145h;
        kotlin.jvm.internal.i.b(enumC1281d);
        Object c2 = enumC1281d.a().c(this);
        U.e eVar = new U.e((j5.g) this.f11146i.get(this.f11141d - 1));
        AbstractC1286i a6 = enumC1281d.a();
        kotlin.jvm.internal.i.c(a6, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        a6.e(eVar, i2, c2);
    }

    public final int l() {
        int i2 = this.f11142e;
        if (i2 == 0 || i2 == 2) {
            int e3 = e();
            a(0);
            return e3;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f11142e);
    }

    public final long m() {
        int i2 = this.f11142e;
        if (i2 != 0 && i2 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f11142e);
        }
        long j2 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            j2 |= (r4 & Byte.MAX_VALUE) << i3;
            if ((g() & 128) == 0) {
                a(0);
                return j2;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void n() {
        int i2 = this.f11142e;
        if (i2 == 0) {
            m();
            return;
        }
        if (i2 == 1) {
            i();
            return;
        }
        if (i2 != 2) {
            if (i2 != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            h();
        } else {
            int b6 = this.f11139b + b();
            if (b6 > this.f11140c) {
                throw new EOFException();
            }
            this.f11139b = b6;
        }
    }

    public final void o(int i2) {
        while (this.f11139b < this.f11140c) {
            int e3 = e();
            if (e3 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i3 = e3 >> 3;
            int i6 = e3 & 7;
            if (i6 == 0) {
                this.f11142e = 0;
                m();
            } else if (i6 == 1) {
                this.f11142e = 1;
                i();
            } else if (i6 == 2) {
                int e6 = this.f11139b + e();
                if (e6 > this.f11140c) {
                    throw new EOFException();
                }
                this.f11139b = e6;
            } else {
                if (i6 == 3) {
                    int i7 = this.f11141d + 1;
                    this.f11141d = i7;
                    if (i7 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        o(i3);
                    } finally {
                    }
                    this.f11141d--;
                }
                if (i6 == 4) {
                    if (i3 != i2) {
                        throw new ProtocolException("Unexpected end group");
                    }
                    return;
                } else {
                    if (i6 != 5) {
                        throw new ProtocolException(AbstractC0279e.d(i6, "Unexpected field encoding: "));
                    }
                    this.f11142e = 5;
                    h();
                }
            }
        }
        throw new EOFException();
    }
}
