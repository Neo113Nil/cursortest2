package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class AB extends AbstractC1674uy {

    /* renamed from: m, reason: collision with root package name */
    public final Iterator f7543m;

    /* renamed from: n, reason: collision with root package name */
    public ByteBuffer f7544n;

    /* renamed from: o, reason: collision with root package name */
    public int f7545o;

    /* renamed from: p, reason: collision with root package name */
    public int f7546p;

    /* renamed from: r, reason: collision with root package name */
    public int f7548r;

    /* renamed from: t, reason: collision with root package name */
    public long f7550t;

    /* renamed from: u, reason: collision with root package name */
    public long f7551u;

    /* renamed from: v, reason: collision with root package name */
    public long f7552v;

    /* renamed from: q, reason: collision with root package name */
    public int f7547q = Integer.MAX_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public int f7549s = 0;

    public /* synthetic */ AB(int i, ArrayList arrayList) {
        this.f7545o = i;
        this.f7543m = arrayList.iterator();
        if (i != 0) {
            L();
            return;
        }
        this.f7544n = VB.f11873c;
        this.f7550t = 0L;
        this.f7551u = 0L;
        this.f7552v = 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long A() {
        return P();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long B() {
        return AbstractC1674uy.i(Q());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long C() {
        return Q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final C1733wB D() {
        int O5 = O();
        if (O5 > 0) {
            long j5 = this.f7552v;
            long j6 = this.f7550t;
            long j7 = O5;
            if (j7 <= j5 - j6) {
                byte[] bArr = new byte[O5];
                CC.f7973c.c1(j6, bArr, 0L, j7);
                this.f7550t += j7;
                return new C1733wB(bArr);
            }
        }
        if (O5 > 0 && O5 <= J()) {
            byte[] bArr2 = new byte[O5];
            K(O5, bArr2);
            return new C1733wB(bArr2);
        }
        if (O5 == 0) {
            return AbstractC1823yB.f16414l;
        }
        if (O5 < 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final String E() {
        int O5 = O();
        if (O5 > 0) {
            long j5 = this.f7552v;
            long j6 = this.f7550t;
            long j7 = O5;
            if (j7 <= j5 - j6) {
                byte[] bArr = new byte[O5];
                CC.f7973c.c1(j6, bArr, 0L, j7);
                String str = new String(bArr, VB.f11871a);
                this.f7550t += j7;
                return str;
            }
        }
        if (O5 > 0 && O5 <= J()) {
            byte[] bArr2 = new byte[O5];
            K(O5, bArr2);
            return new String(bArr2, VB.f11871a);
        }
        if (O5 == 0) {
            return "";
        }
        if (O5 < 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final String F() {
        String n5;
        int O5 = O();
        if (O5 > 0) {
            long j5 = this.f7552v;
            long j6 = this.f7550t;
            long j7 = O5;
            if (j7 <= j5 - j6) {
                long j8 = j6 - this.f7551u;
                ByteBuffer byteBuffer = this.f7544n;
                int i = (int) j8;
                Fz fz = EC.f8472a;
                if (byteBuffer.hasArray()) {
                    int arrayOffset = byteBuffer.arrayOffset();
                    EC.f8472a.getClass();
                    n5 = Fz.m(byteBuffer.array(), arrayOffset + i, O5);
                } else {
                    n5 = byteBuffer.isDirect() ? Fz.n(byteBuffer, i, O5) : Fz.n(byteBuffer, i, O5);
                }
                this.f7550t += j7;
                return n5;
            }
        }
        if (O5 >= 0 && O5 <= J()) {
            byte[] bArr = new byte[O5];
            K(O5, bArr);
            EC.f8472a.getClass();
            return Fz.m(bArr, 0, O5);
        }
        if (O5 == 0) {
            return "";
        }
        if (O5 <= 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final void G() {
        if (this.f7548r != 0) {
            throw new XB("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final void H(int i) {
        this.f7547q = i;
        int i5 = this.f7545o + this.f7546p;
        this.f7545o = i5;
        if (i5 <= i) {
            this.f7546p = 0;
            return;
        }
        int i6 = i5 - i;
        this.f7546p = i6;
        this.f7545o = i5 - i6;
    }

    public final long I() {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            j5 |= (r3 & Byte.MAX_VALUE) << i;
            if ((M() & 128) == 0) {
                return j5;
            }
        }
        throw new XB("CodedInputStream encountered a malformed varint.");
    }

    public final int J() {
        return (int) (((this.f7545o - this.f7549s) - this.f7550t) + this.f7551u);
    }

    public final void K(int i, byte[] bArr) {
        if (i > J()) {
            if (i > 0) {
                throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i5 = i;
        while (i5 > 0) {
            if (this.f7552v - this.f7550t == 0) {
                if (!this.f7543m.hasNext()) {
                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                L();
            }
            int min = Math.min(i5, (int) (this.f7552v - this.f7550t));
            long j5 = min;
            byte[] bArr2 = bArr;
            CC.f7973c.c1(this.f7550t, bArr2, i - i5, j5);
            i5 -= min;
            this.f7550t += j5;
            bArr = bArr2;
        }
    }

    public final void L() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f7543m.next();
        this.f7544n = byteBuffer;
        this.f7549s += (int) (this.f7550t - this.f7551u);
        long position = byteBuffer.position();
        this.f7550t = position;
        this.f7551u = position;
        this.f7552v = this.f7544n.limit();
        long f = CC.f(this.f7544n);
        this.f7550t += f;
        this.f7551u += f;
        this.f7552v += f;
    }

    public final byte M() {
        if (this.f7552v - this.f7550t == 0) {
            if (!this.f7543m.hasNext()) {
                throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            L();
        }
        long j5 = this.f7550t;
        this.f7550t = 1 + j5;
        return CC.f7973c.W0(j5);
    }

    public final int N() {
        long j5 = this.f7552v;
        long j6 = this.f7550t;
        if (j5 - j6 < 4) {
            int M5 = M() & 255;
            int M6 = (M() & 255) << 8;
            return M5 | M6 | ((M() & 255) << 16) | ((M() & 255) << 24);
        }
        this.f7550t = 4 + j6;
        BC bc = CC.f7973c;
        int W02 = bc.W0(j6) & 255;
        int W03 = (bc.W0(1 + j6) & 255) << 8;
        return ((bc.W0(j6 + 3) & 255) << 24) | W02 | W03 | ((bc.W0(2 + j6) & 255) << 16);
    }

    public final int O() {
        int i;
        long j5 = this.f7550t;
        if (this.f7552v != j5) {
            long j6 = j5 + 1;
            BC bc = CC.f7973c;
            byte W02 = bc.W0(j5);
            if (W02 >= 0) {
                this.f7550t++;
                return W02;
            }
            if (this.f7552v - this.f7550t >= 10) {
                long j7 = 2 + j5;
                int W03 = (bc.W0(j6) << 7) ^ W02;
                if (W03 < 0) {
                    i = W03 ^ (-128);
                } else {
                    long j8 = 3 + j5;
                    int W04 = (bc.W0(j7) << 14) ^ W03;
                    if (W04 >= 0) {
                        i = W04 ^ 16256;
                    } else {
                        long j9 = 4 + j5;
                        int W05 = W04 ^ (bc.W0(j8) << 21);
                        if (W05 < 0) {
                            i = (-2080896) ^ W05;
                        } else {
                            j8 = 5 + j5;
                            byte W06 = bc.W0(j9);
                            int i5 = (W05 ^ (W06 << 28)) ^ 266354560;
                            if (W06 < 0) {
                                j9 = 6 + j5;
                                if (bc.W0(j8) < 0) {
                                    j8 = 7 + j5;
                                    if (bc.W0(j9) < 0) {
                                        j9 = 8 + j5;
                                        if (bc.W0(j8) < 0) {
                                            j8 = 9 + j5;
                                            if (bc.W0(j9) < 0) {
                                                long j10 = j5 + 10;
                                                if (bc.W0(j8) >= 0) {
                                                    i = i5;
                                                    j7 = j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i5;
                            }
                            i = i5;
                        }
                        j7 = j9;
                    }
                    j7 = j8;
                }
                this.f7550t = j7;
                return i;
            }
        }
        return (int) I();
    }

    public final long P() {
        long j5 = this.f7552v;
        long j6 = this.f7550t;
        if (j5 - j6 < 8) {
            return ((M() & 255) << 56) | (M() & 255) | ((M() & 255) << 8) | ((M() & 255) << 16) | ((M() & 255) << 24) | ((M() & 255) << 32) | ((M() & 255) << 40) | ((M() & 255) << 48);
        }
        this.f7550t = 8 + j6;
        BC bc = CC.f7973c;
        long W02 = bc.W0(j6) & 255;
        long W03 = (bc.W0(j6 + 1) & 255) << 8;
        long W04 = (bc.W0(j6 + 2) & 255) << 16;
        long W05 = (bc.W0(3 + j6) & 255) << 24;
        long W06 = (bc.W0(j6 + 4) & 255) << 32;
        return ((bc.W0(j6 + 7) & 255) << 56) | W02 | W03 | W04 | W05 | W06 | ((bc.W0(j6 + 5) & 255) << 40) | ((bc.W0(j6 + 6) & 255) << 48);
    }

    public final long Q() {
        long j5;
        long j6;
        long j7;
        long j8 = this.f7550t;
        if (this.f7552v != j8) {
            long j9 = j8 + 1;
            BC bc = CC.f7973c;
            byte W02 = bc.W0(j8);
            if (W02 >= 0) {
                this.f7550t++;
                return W02;
            }
            if (this.f7552v - this.f7550t >= 10) {
                long j10 = 2 + j8;
                int W03 = (bc.W0(j9) << 7) ^ W02;
                if (W03 < 0) {
                    j5 = W03 ^ (-128);
                } else {
                    long j11 = 3 + j8;
                    int W04 = (bc.W0(j10) << 14) ^ W03;
                    if (W04 >= 0) {
                        j5 = W04 ^ 16256;
                    } else {
                        long j12 = 4 + j8;
                        int W05 = W04 ^ (bc.W0(j11) << 21);
                        if (W05 < 0) {
                            j5 = (-2080896) ^ W05;
                            j10 = j12;
                        } else {
                            j11 = 5 + j8;
                            long W06 = (bc.W0(j12) << 28) ^ W05;
                            if (W06 >= 0) {
                                j7 = 266354560;
                            } else {
                                long j13 = 6 + j8;
                                long W07 = W06 ^ (bc.W0(j11) << 35);
                                if (W07 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    j11 = 7 + j8;
                                    W06 = W07 ^ (bc.W0(j13) << 42);
                                    if (W06 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        j13 = 8 + j8;
                                        W07 = W06 ^ (bc.W0(j11) << 49);
                                        if (W07 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            j11 = 9 + j8;
                                            long W08 = (W07 ^ (bc.W0(j13) << 56)) ^ 71499008037633920L;
                                            if (W08 < 0) {
                                                long j14 = j8 + 10;
                                                if (bc.W0(j11) >= 0) {
                                                    j10 = j14;
                                                    j5 = W08;
                                                }
                                            } else {
                                                j5 = W08;
                                            }
                                        }
                                    }
                                }
                                j5 = j6 ^ W07;
                                j10 = j13;
                            }
                            j5 = j7 ^ W06;
                        }
                    }
                    j10 = j11;
                }
                this.f7550t = j10;
                return j5;
            }
        }
        return I();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final boolean f() {
        return (((long) this.f7549s) + this.f7550t) - this.f7551u == ((long) this.f7545o);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final boolean g() {
        return Q() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final double k() {
        return Double.longBitsToDouble(P());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final float m() {
        return Float.intBitsToFloat(N());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int o() {
        return (int) ((this.f7549s + this.f7550t) - this.f7551u);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int q(int i) {
        if (i < 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int o5 = o() + i;
        int i5 = this.f7547q;
        if (o5 > i5) {
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f7547q = o5;
        int i6 = this.f7545o + this.f7546p;
        this.f7545o = i6;
        if (i6 <= o5) {
            this.f7546p = 0;
            return i5;
        }
        int i7 = i6 - o5;
        this.f7546p = i7;
        this.f7545o = i6 - i7;
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int r() {
        return O();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int s() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int t() {
        return O();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int u() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int v() {
        return AbstractC1674uy.h(O());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int w() {
        if (f()) {
            this.f7548r = 0;
            return 0;
        }
        int O5 = O();
        this.f7548r = O5;
        if ((O5 >>> 3) != 0) {
            return O5;
        }
        throw new XB("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final int x() {
        return O();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long y() {
        return P();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final long z() {
        return Q();
    }
}
