package i0;

import r.C2343v;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final long f17289b = F.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f17290c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f17291d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f17292e;
    public static final long f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f17293g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f17294h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f17295a;

    static {
        F.d(4282664004L);
        F.d(4287137928L);
        F.d(4291611852L);
        f17290c = F.d(4294967295L);
        f17291d = F.d(4294901760L);
        F.d(4278255360L);
        f17292e = F.d(4278190335L);
        F.d(4294967040L);
        F.d(4278255615L);
        F.d(4294902015L);
        f = F.c(0);
        f17293g = F.b(0.0f, 0.0f, 0.0f, 0.0f, j0.d.f17433u);
    }

    public /* synthetic */ p(long j5) {
        this.f17295a = j5;
    }

    public static final long a(long j5, j0.c cVar) {
        j0.g gVar;
        j0.c f5 = f(j5);
        int i = f5.f17414c;
        int i5 = cVar.f17414c;
        if ((i | i5) < 0) {
            gVar = j0.j.e(f5, cVar);
        } else {
            C2343v c2343v = j0.h.f17444a;
            int i6 = i | (i5 << 6);
            Object b3 = c2343v.b(i6);
            if (b3 == null) {
                b3 = j0.j.e(f5, cVar);
                c2343v.g(i6, b3);
            }
            gVar = (j0.g) b3;
        }
        return gVar.a(j5);
    }

    public static long b(float f5, long j5) {
        return F.b(h(j5), g(j5), e(j5), f5, f(j5));
    }

    public static final boolean c(long j5, long j6) {
        return j5 == j6;
    }

    public static final float d(long j5) {
        float Z4;
        float f5;
        if ((63 & j5) == 0) {
            Z4 = (float) N4.b.Z((j5 >>> 56) & 255);
            f5 = 255.0f;
        } else {
            Z4 = (float) N4.b.Z((j5 >>> 6) & 1023);
            f5 = 1023.0f;
        }
        return Z4 / f5;
    }

    public static final float e(long j5) {
        int i;
        int i5;
        int i6;
        if ((63 & j5) == 0) {
            return ((float) N4.b.Z((j5 >>> 32) & 255)) / 255.0f;
        }
        short s2 = (short) ((j5 >>> 16) & 65535);
        int i7 = 32768 & s2;
        int i8 = ((65535 & s2) >>> 10) & 31;
        int i9 = s2 & 1023;
        if (i8 != 0) {
            int i10 = i9 << 13;
            if (i8 == 31) {
                i = 255;
                if (i10 != 0) {
                    i10 |= 4194304;
                }
            } else {
                i = i8 + 112;
            }
            int i11 = i;
            i5 = i10;
            i6 = i11;
        } else {
            if (i9 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i9 + 1056964608) - t.f17298a;
                return i7 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i6 = 0;
            i5 = 0;
        }
        return Float.intBitsToFloat((i6 << 23) | (i7 << 16) | i5);
    }

    public static final j0.c f(long j5) {
        float[] fArr = j0.d.f17415a;
        return j0.d.f17437y[(int) (j5 & 63)];
    }

    public static final float g(long j5) {
        int i;
        int i5;
        int i6;
        if ((63 & j5) == 0) {
            return ((float) N4.b.Z((j5 >>> 40) & 255)) / 255.0f;
        }
        short s2 = (short) ((j5 >>> 32) & 65535);
        int i7 = 32768 & s2;
        int i8 = ((65535 & s2) >>> 10) & 31;
        int i9 = s2 & 1023;
        if (i8 != 0) {
            int i10 = i9 << 13;
            if (i8 == 31) {
                i = 255;
                if (i10 != 0) {
                    i10 |= 4194304;
                }
            } else {
                i = i8 + 112;
            }
            int i11 = i;
            i5 = i10;
            i6 = i11;
        } else {
            if (i9 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i9 + 1056964608) - t.f17298a;
                return i7 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i6 = 0;
            i5 = 0;
        }
        return Float.intBitsToFloat((i6 << 23) | (i7 << 16) | i5);
    }

    public static final float h(long j5) {
        int i;
        int i5;
        int i6;
        if ((63 & j5) == 0) {
            return ((float) N4.b.Z((j5 >>> 48) & 255)) / 255.0f;
        }
        short s2 = (short) ((j5 >>> 48) & 65535);
        int i7 = 32768 & s2;
        int i8 = ((65535 & s2) >>> 10) & 31;
        int i9 = s2 & 1023;
        if (i8 != 0) {
            int i10 = i9 << 13;
            if (i8 == 31) {
                i = 255;
                if (i10 != 0) {
                    i10 |= 4194304;
                }
            } else {
                i = i8 + 112;
            }
            int i11 = i;
            i5 = i10;
            i6 = i11;
        } else {
            if (i9 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i9 + 1056964608) - t.f17298a;
                return i7 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i6 = 0;
            i5 = 0;
        }
        return Float.intBitsToFloat((i6 << 23) | (i7 << 16) | i5);
    }

    public static int i(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static String j(long j5) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j5));
        sb.append(", ");
        sb.append(g(j5));
        sb.append(", ");
        sb.append(e(j5));
        sb.append(", ");
        sb.append(d(j5));
        sb.append(", ");
        return L1.a.p(sb, f(j5).f17412a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f17295a == ((p) obj).f17295a;
        }
        return false;
    }

    public final int hashCode() {
        return i(this.f17295a);
    }

    public final String toString() {
        return j(this.f17295a);
    }
}
