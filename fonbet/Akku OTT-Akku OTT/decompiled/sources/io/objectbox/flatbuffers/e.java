package io.objectbox.flatbuffers;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class e {
    public static final io.objectbox.flatbuffers.a a = new io.objectbox.flatbuffers.a(new byte[]{0}, 1);

    public static class a extends h {
        public static final a e = new a(e.a, 1, 1);

        @Override // io.objectbox.flatbuffers.e.f
        public final StringBuilder a(StringBuilder sb) {
            sb.append(Typography.quote);
            sb.append(io.objectbox.flatbuffers.j.b(this.a.a, this.b, this.d));
            sb.append(Typography.quote);
            return sb;
        }

        public final byte[] b() {
            int i = this.d;
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = this.a.a[this.b + i2];
            }
            return bArr;
        }

        @Override // io.objectbox.flatbuffers.e.f
        public final String toString() {
            return io.objectbox.flatbuffers.j.b(this.a.a, this.b, this.d);
        }
    }

    public static class b extends RuntimeException {
    }

    public static class c extends f {
        public static final c d = new c(e.a, 0, 0);

        @Override // io.objectbox.flatbuffers.e.f
        public final StringBuilder a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.b == this.b && cVar.c == this.c;
        }

        public final int hashCode() {
            return this.b ^ this.c;
        }

        @Override // io.objectbox.flatbuffers.e.f
        public final String toString() {
            int i = this.b;
            int i2 = i;
            while (true) {
                io.objectbox.flatbuffers.a aVar = this.a;
                if (aVar.a[i2] == 0) {
                    return io.objectbox.flatbuffers.j.b(aVar.a, i, i2 - i);
                }
                i2++;
            }
        }
    }

    public static class d {
        public final i a;

        public d(i iVar) {
            this.a = iVar;
        }

        public final c a(int i) {
            i iVar = this.a;
            if (i >= iVar.d) {
                return c.d;
            }
            int i2 = (i * iVar.c) + iVar.b;
            io.objectbox.flatbuffers.a aVar = iVar.a;
            return new c(aVar, e.a(aVar, i2, iVar.c), 1);
        }

        public final String toString() {
            i iVar = this.a;
            int i = iVar.d;
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i2 = 0; i2 < i; i2++) {
                iVar.b(i2).k(sb);
                if (i2 != i - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: io.objectbox.flatbuffers.e$e, reason: collision with other inner class name */
    public static class C0151e extends j {
        public static final C0151e f = new C0151e(e.a, 1, 1);

        @Override // io.objectbox.flatbuffers.e.j, io.objectbox.flatbuffers.e.f
        public final StringBuilder a(StringBuilder sb) {
            sb.append("{ ");
            d c = c();
            j jVar = new j(this.a, this.b, this.c);
            int i = 0;
            while (true) {
                int i2 = this.d;
                if (i >= i2) {
                    sb.append(" }");
                    return sb;
                }
                sb.append(Typography.quote);
                sb.append(c.a(i).toString());
                sb.append("\" : ");
                sb.append(jVar.b(i).toString());
                if (i != i2 - 1) {
                    sb.append(", ");
                }
                i++;
            }
        }

        public final d c() {
            int i = this.c;
            int i2 = this.b - (i * 3);
            io.objectbox.flatbuffers.a aVar = this.a;
            return new d(new i(aVar, e.a(aVar, i2, i), (int) e.d(aVar, i2 + i, i), 4));
        }
    }

    public static abstract class f {
        public final io.objectbox.flatbuffers.a a;
        public final int b;
        public final int c;

        public f(io.objectbox.flatbuffers.a aVar, int i, int i2) {
            this.a = aVar;
            this.b = i;
            this.c = i2;
        }

        public abstract StringBuilder a(StringBuilder sb);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    public static class g {
        public static final g f = new g(e.a, 0, 1, 0);
        public final io.objectbox.flatbuffers.a a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public g(io.objectbox.flatbuffers.a aVar, int i, int i2, int i3) {
            this(aVar, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public final a a() {
            int i = this.e;
            if (i != 25 && i != 5) {
                return a.e;
            }
            int i2 = this.b;
            int i3 = this.c;
            io.objectbox.flatbuffers.a aVar = this.a;
            return new a(aVar, e.a(aVar, i2, i3), this.d);
        }

        public final boolean b() {
            return this.e == 26 ? this.a.a[this.b] != 0 : h() != 0;
        }

        public final double c() {
            int i = this.c;
            int i2 = this.b;
            io.objectbox.flatbuffers.a aVar = this.a;
            int i3 = this.e;
            if (i3 == 3) {
                return e.b(aVar, i2, i);
            }
            if (i3 == 1) {
                return (int) e.d(aVar, i2, i);
            }
            if (i3 != 2) {
                if (i3 == 5) {
                    return Double.parseDouble(g());
                }
                int i4 = this.d;
                if (i3 == 6) {
                    return (int) e.d(aVar, e.a(aVar, i2, i), i4);
                }
                if (i3 == 7) {
                    return e.e(aVar, e.a(aVar, i2, i), i4);
                }
                if (i3 == 8) {
                    return e.b(aVar, e.a(aVar, i2, i), i4);
                }
                if (i3 == 10) {
                    return i().d;
                }
                if (i3 != 26) {
                    return 0.0d;
                }
            }
            return e.e(aVar, i2, i);
        }

        public final int d() {
            int i = this.b;
            io.objectbox.flatbuffers.a aVar = this.a;
            int i2 = this.c;
            int i3 = this.e;
            if (i3 == 1) {
                return (int) e.d(aVar, i, i2);
            }
            if (i3 == 2) {
                return (int) e.e(aVar, i, i2);
            }
            if (i3 == 3) {
                return (int) e.b(aVar, i, i2);
            }
            if (i3 == 5) {
                return Integer.parseInt(g());
            }
            int i4 = this.d;
            if (i3 == 6) {
                return (int) e.d(aVar, e.a(aVar, i, i2), i4);
            }
            if (i3 == 7) {
                return (int) e.e(aVar, e.a(aVar, i, i2), i2);
            }
            if (i3 == 8) {
                return (int) e.b(aVar, e.a(aVar, i, i2), i4);
            }
            if (i3 == 10) {
                return i().d;
            }
            if (i3 != 26) {
                return 0;
            }
            return (int) e.d(aVar, i, i2);
        }

        public final long e() {
            int i = this.b;
            io.objectbox.flatbuffers.a aVar = this.a;
            int i2 = this.c;
            int i3 = this.e;
            if (i3 == 1) {
                return e.d(aVar, i, i2);
            }
            if (i3 == 2) {
                return e.e(aVar, i, i2);
            }
            if (i3 == 3) {
                return (long) e.b(aVar, i, i2);
            }
            if (i3 == 5) {
                try {
                    return Long.parseLong(g());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            int i4 = this.d;
            if (i3 == 6) {
                return e.d(aVar, e.a(aVar, i, i2), i4);
            }
            if (i3 == 7) {
                return e.e(aVar, e.a(aVar, i, i2), i2);
            }
            if (i3 == 8) {
                return (long) e.b(aVar, e.a(aVar, i, i2), i4);
            }
            if (i3 == 10) {
                return i().d;
            }
            if (i3 != 26) {
                return 0L;
            }
            return (int) e.d(aVar, i, i2);
        }

        public final C0151e f() {
            if (this.e != 9) {
                return C0151e.f;
            }
            int i = this.b;
            int i2 = this.c;
            io.objectbox.flatbuffers.a aVar = this.a;
            return new C0151e(aVar, e.a(aVar, i, i2), this.d);
        }

        public final String g() {
            int i = this.d;
            int i2 = this.b;
            io.objectbox.flatbuffers.a aVar = this.a;
            int i3 = this.e;
            if (i3 == 5) {
                int a = e.a(aVar, i2, this.c);
                return io.objectbox.flatbuffers.j.b(aVar.a, a, (int) e.e(aVar, a - i, i));
            }
            if (i3 != 4) {
                return "";
            }
            int a2 = e.a(aVar, i2, i);
            int i4 = a2;
            while (true) {
                byte[] bArr = aVar.a;
                if (bArr[i4] == 0) {
                    return io.objectbox.flatbuffers.j.b(bArr, a2, i4 - a2);
                }
                i4++;
            }
        }

        public final long h() {
            int i = this.b;
            io.objectbox.flatbuffers.a aVar = this.a;
            int i2 = this.c;
            int i3 = this.e;
            if (i3 == 2) {
                return e.e(aVar, i, i2);
            }
            if (i3 == 1) {
                return e.d(aVar, i, i2);
            }
            if (i3 == 3) {
                return (long) e.b(aVar, i, i2);
            }
            if (i3 == 10) {
                return i().d;
            }
            if (i3 == 26) {
                return (int) e.d(aVar, i, i2);
            }
            if (i3 == 5) {
                return Long.parseLong(g());
            }
            int i4 = this.d;
            if (i3 == 6) {
                return e.d(aVar, e.a(aVar, i, i2), i4);
            }
            if (i3 == 7) {
                return e.e(aVar, e.a(aVar, i, i2), i4);
            }
            if (i3 != 8) {
                return 0L;
            }
            return (long) e.b(aVar, e.a(aVar, i, i2), i2);
        }

        public final j i() {
            boolean j = j();
            int i = this.d;
            int i2 = this.c;
            int i3 = this.b;
            io.objectbox.flatbuffers.a aVar = this.a;
            if (j) {
                return new j(aVar, e.a(aVar, i3, i2), i);
            }
            int i4 = this.e;
            return i4 == 15 ? new i(aVar, e.a(aVar, i3, i2), i, 4) : ((i4 < 11 || i4 > 15) && i4 != 36) ? j.e : new i(aVar, e.a(aVar, i3, i2), i, i4 - 10);
        }

        public final boolean j() {
            int i = this.e;
            return i == 10 || i == 9;
        }

        public final StringBuilder k(StringBuilder sb) {
            c cVar;
            int i = this.e;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(e());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(h());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(c());
                        return sb;
                    case 4:
                        if (i == 4) {
                            int i2 = this.b;
                            int i3 = this.c;
                            io.objectbox.flatbuffers.a aVar = this.a;
                            cVar = new c(aVar, e.a(aVar, i2, i3), this.d);
                        } else {
                            cVar = c.d;
                        }
                        sb.append(Typography.quote);
                        cVar.a(sb);
                        sb.append(Typography.quote);
                        return sb;
                    case 5:
                        sb.append(Typography.quote);
                        sb.append(g());
                        sb.append(Typography.quote);
                        return sb;
                    case 9:
                        f().a(sb);
                        return sb;
                    case 10:
                        i().a(sb);
                        return sb;
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new b(android.support.v4.media.a.a(i, "not_implemented:"));
                    case 25:
                        a().a(sb);
                        return sb;
                    case 26:
                        sb.append(b());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(i());
            return sb;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            k(sb);
            return sb.toString();
        }

        public g(io.objectbox.flatbuffers.a aVar, int i, int i2, int i3, int i4) {
            this.a = aVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public static abstract class h extends f {
        public final int d;

        public h(io.objectbox.flatbuffers.a aVar, int i, int i2) {
            super(aVar, i, i2);
            this.d = (int) e.e(aVar, i - i2, i2);
        }
    }

    public static class i extends j {
        public final int f;

        static {
            new i(e.a, 1, 1, 1);
        }

        public i(io.objectbox.flatbuffers.a aVar, int i, int i2, int i3) {
            super(aVar, i, i2);
            this.f = i3;
        }

        @Override // io.objectbox.flatbuffers.e.j
        public final g b(int i) {
            if (i >= this.d) {
                return g.f;
            }
            return new g(this.a, (i * this.c) + this.b, this.c, 1, this.f);
        }
    }

    public static class j extends h {
        public static final j e = new j(e.a, 1, 1);

        @Override // io.objectbox.flatbuffers.e.f
        public StringBuilder a(StringBuilder sb) {
            sb.append("[ ");
            int i = 0;
            while (true) {
                int i2 = this.d;
                if (i >= i2) {
                    sb.append(" ]");
                    return sb;
                }
                b(i).k(sb);
                if (i != i2 - 1) {
                    sb.append(", ");
                }
                i++;
            }
        }

        public g b(int i) {
            long j = this.d;
            long j2 = i;
            if (j2 >= j) {
                return g.f;
            }
            int i2 = this.b;
            int i3 = this.c;
            int i4 = (int) ((j * i3) + i2 + j2);
            io.objectbox.flatbuffers.a aVar = this.a;
            return new g(aVar, (i * i3) + i2, i3, aVar.a[i4] & UByte.MAX_VALUE);
        }
    }

    public static int a(io.objectbox.flatbuffers.a aVar, int i2, int i3) {
        return (int) (i2 - e(aVar, i2, i3));
    }

    public static double b(io.objectbox.flatbuffers.a aVar, int i2, int i3) {
        if (i3 == 4) {
            return Float.intBitsToFloat(aVar.a(i2));
        }
        if (i3 != 8) {
            return -1.0d;
        }
        return Double.longBitsToDouble(aVar.b(i2));
    }

    public static g c(io.objectbox.flatbuffers.a aVar) {
        int i2 = aVar.b;
        byte[] bArr = aVar.a;
        byte b2 = bArr[i2 - 1];
        int i3 = i2 - 2;
        return new g(aVar, i3 - b2, b2, bArr[i3] & UByte.MAX_VALUE);
    }

    public static long d(io.objectbox.flatbuffers.a aVar, int i2, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = aVar.a[i2];
        } else if (i3 == 2) {
            byte[] bArr = aVar.a;
            i4 = (short) ((bArr[i2] & UByte.MAX_VALUE) | (bArr[i2 + 1] << 8));
        } else {
            if (i3 != 4) {
                if (i3 != 8) {
                    return -1L;
                }
                return aVar.b(i2);
            }
            i4 = aVar.a(i2);
        }
        return i4;
    }

    public static long e(io.objectbox.flatbuffers.a aVar, int i2, int i3) {
        if (i3 == 1) {
            return aVar.a[i2] & UByte.MAX_VALUE;
        }
        if (i3 == 2) {
            byte[] bArr = aVar.a;
            return ((short) ((bArr[i2] & UByte.MAX_VALUE) | (bArr[i2 + 1] << 8))) & UShort.MAX_VALUE;
        }
        if (i3 == 4) {
            return aVar.a(i2) & KeyboardMap.kValueMask;
        }
        if (i3 != 8) {
            return -1L;
        }
        return aVar.b(i2);
    }
}
