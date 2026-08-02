package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C5372s.b;
import androidx.datastore.preferences.protobuf.C5378y;
import androidx.datastore.preferences.protobuf.i0;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5372s<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final C5372s<?> f42612d = new C5372s<>(0);

    /* renamed from: a, reason: collision with root package name */
    private final h0 f42613a = i0.s();

    /* renamed from: b, reason: collision with root package name */
    private boolean f42614b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42615c;

    /* renamed from: androidx.datastore.preferences.protobuf.s$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f42616a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f42617b;

        static {
            int[] iArr = new int[r0.values().length];
            f42617b = iArr;
            try {
                iArr[r0.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42617b[r0.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42617b[r0.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42617b[r0.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42617b[r0.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42617b[r0.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42617b[r0.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42617b[r0.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42617b[r0.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f42617b[r0.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f42617b[r0.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f42617b[r0.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f42617b[r0.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f42617b[r0.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f42617b[r0.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f42617b[r0.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f42617b[r0.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f42617b[r0.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[s0.values().length];
            f42616a = iArr2;
            try {
                iArr2[s0.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f42616a[s0.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f42616a[s0.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f42616a[s0.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f42616a[s0.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f42616a[s0.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f42616a[s0.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f42616a[s0.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f42616a[s0.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s$b */
    /* loaded from: classes8.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        s0 getLiteJavaType();
    }

    private C5372s() {
    }

    static int b(r0 r0Var, int i11, Object obj) {
        int serializedSize;
        int i12;
        int h11 = AbstractC5365k.h(i11);
        if (r0Var == r0.GROUP) {
            h11 *= 2;
        }
        int i13 = 4;
        switch (a.f42617b[r0Var.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                int i14 = AbstractC5365k.f42576d;
                i13 = 8;
                return h11 + i13;
            case 2:
                ((Float) obj).getClass();
                int i15 = AbstractC5365k.f42576d;
                return h11 + i13;
            case 3:
                i13 = AbstractC5365k.j(((Long) obj).longValue());
                return h11 + i13;
            case 4:
                i13 = AbstractC5365k.j(((Long) obj).longValue());
                return h11 + i13;
            case 5:
                i13 = AbstractC5365k.j(((Integer) obj).intValue());
                return h11 + i13;
            case 6:
                ((Long) obj).getClass();
                int i16 = AbstractC5365k.f42576d;
                i13 = 8;
                return h11 + i13;
            case 7:
                ((Integer) obj).getClass();
                int i17 = AbstractC5365k.f42576d;
                return h11 + i13;
            case 8:
                ((Boolean) obj).getClass();
                int i18 = AbstractC5365k.f42576d;
                i13 = 1;
                return h11 + i13;
            case 9:
                int i19 = AbstractC5365k.f42576d;
                i13 = ((Q) obj).getSerializedSize();
                return h11 + i13;
            case 10:
                if (obj instanceof B) {
                    int i21 = AbstractC5365k.f42576d;
                    serializedSize = ((B) obj).a();
                    i12 = AbstractC5365k.i(serializedSize);
                } else {
                    int i22 = AbstractC5365k.f42576d;
                    serializedSize = ((Q) obj).getSerializedSize();
                    i12 = AbstractC5365k.i(serializedSize);
                }
                i13 = i12 + serializedSize;
                return h11 + i13;
            case 11:
                i13 = obj instanceof AbstractC5362h ? AbstractC5365k.d((AbstractC5362h) obj) : AbstractC5365k.g((String) obj);
                return h11 + i13;
            case 12:
                if (obj instanceof AbstractC5362h) {
                    i13 = AbstractC5365k.d((AbstractC5362h) obj);
                    return h11 + i13;
                }
                int i23 = AbstractC5365k.f42576d;
                serializedSize = ((byte[]) obj).length;
                i12 = AbstractC5365k.i(serializedSize);
                i13 = i12 + serializedSize;
                return h11 + i13;
            case 13:
                i13 = AbstractC5365k.i(((Integer) obj).intValue());
                return h11 + i13;
            case 14:
                ((Integer) obj).getClass();
                int i24 = AbstractC5365k.f42576d;
                return h11 + i13;
            case 15:
                ((Long) obj).getClass();
                int i25 = AbstractC5365k.f42576d;
                i13 = 8;
                return h11 + i13;
            case 16:
                i13 = AbstractC5365k.e(((Integer) obj).intValue());
                return h11 + i13;
            case 17:
                i13 = AbstractC5365k.f(((Long) obj).longValue());
                return h11 + i13;
            case 18:
                i13 = obj instanceof C5378y.a ? AbstractC5365k.j(((C5378y.a) obj).getNumber()) : AbstractC5365k.j(((Integer) obj).intValue());
                return h11 + i13;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int c(b<?> bVar, Object obj) {
        bVar.getClass();
        return b(null, 0, obj);
    }

    public static <T extends b<T>> C5372s<T> e() {
        return (C5372s<T>) f42612d;
    }

    private static int g(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        entry.getValue();
        bVar.getLiteJavaType();
        throw null;
    }

    private static <T extends b<T>> boolean l(Map.Entry<T, Object> entry) {
        entry.getKey().getLiteJavaType();
        throw null;
    }

    private void p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        boolean z11 = entry.getValue() instanceof B;
        key.getClass();
        key.getLiteJavaType();
        throw null;
    }

    static void r(AbstractC5365k abstractC5365k, r0 r0Var, int i11, Object obj) throws IOException {
        if (r0Var == r0.GROUP) {
            abstractC5365k.D(i11, 3);
            ((Q) obj).b(abstractC5365k);
            abstractC5365k.D(i11, 4);
        }
        abstractC5365k.D(i11, r0Var.b());
        switch (a.f42617b[r0Var.ordinal()]) {
            case 1:
                abstractC5365k.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                abstractC5365k.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                abstractC5365k.H(((Long) obj).longValue());
                break;
            case 4:
                abstractC5365k.H(((Long) obj).longValue());
                break;
            case 5:
                abstractC5365k.w(((Integer) obj).intValue());
                break;
            case 6:
                abstractC5365k.u(((Long) obj).longValue());
                break;
            case 7:
                abstractC5365k.s(((Integer) obj).intValue());
                break;
            case 8:
                abstractC5365k.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((Q) obj).b(abstractC5365k);
                break;
            case 10:
                abstractC5365k.y((Q) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC5362h)) {
                    abstractC5365k.C((String) obj);
                    break;
                } else {
                    abstractC5365k.q((AbstractC5362h) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC5362h)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC5365k.o(bArr.length, bArr);
                    break;
                } else {
                    abstractC5365k.q((AbstractC5362h) obj);
                    break;
                }
            case 13:
                abstractC5365k.F(((Integer) obj).intValue());
                break;
            case 14:
                abstractC5365k.s(((Integer) obj).intValue());
                break;
            case 15:
                abstractC5365k.u(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                abstractC5365k.F((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                abstractC5365k.H((longValue >> 63) ^ (longValue << 1));
                break;
            case 18:
                if (!(obj instanceof C5378y.a)) {
                    abstractC5365k.w(((Integer) obj).intValue());
                    break;
                } else {
                    abstractC5365k.w(((C5378y.a) obj).getNumber());
                    break;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5372s<T> clone() {
        C5372s<T> c5372s = (C5372s<T>) new C5372s();
        h0 h0Var = this.f42613a;
        if (h0Var.n() > 0) {
            Map.Entry<Object, Object> m11 = h0Var.m(0);
            c5372s.q((b) m11.getKey(), m11.getValue());
            throw null;
        }
        Iterator it = h0Var.o().iterator();
        if (!it.hasNext()) {
            c5372s.f42615c = this.f42615c;
            return c5372s;
        }
        Map.Entry entry = (Map.Entry) it.next();
        c5372s.q((b) entry.getKey(), entry.getValue());
        throw null;
    }

    final Iterator<Map.Entry<T, Object>> d() {
        h0 h0Var = this.f42613a;
        return h0Var.isEmpty() ? Collections.emptyIterator() : this.f42615c ? new B.b(((i0.b) h0Var.l()).iterator()) : ((i0.b) h0Var.l()).iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5372s) {
            return this.f42613a.equals(((C5372s) obj).f42613a);
        }
        return false;
    }

    public final int f() {
        h0 h0Var = this.f42613a;
        if (h0Var.n() > 0) {
            g(h0Var.m(0));
            throw null;
        }
        Iterator it = h0Var.o().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        g((Map.Entry) it.next());
        throw null;
    }

    public final int h() {
        h0 h0Var = this.f42613a;
        int n11 = h0Var.n();
        int i11 = 0;
        for (int i12 = 0; i12 < n11; i12++) {
            Map.Entry<Object, Object> m11 = h0Var.m(i12);
            i11 += c((b) m11.getKey(), m11.getValue());
        }
        for (Map.Entry entry : h0Var.o()) {
            i11 += c((b) entry.getKey(), entry.getValue());
        }
        return i11;
    }

    public final int hashCode() {
        return this.f42613a.hashCode();
    }

    final boolean i() {
        return this.f42613a.isEmpty();
    }

    public final boolean j() {
        return this.f42614b;
    }

    public final boolean k() {
        h0 h0Var = this.f42613a;
        if (h0Var.n() > 0) {
            l(h0Var.m(0));
            throw null;
        }
        Iterator it = h0Var.o().iterator();
        if (!it.hasNext()) {
            return true;
        }
        l((Map.Entry) it.next());
        throw null;
    }

    public final Iterator<Map.Entry<T, Object>> m() {
        h0 h0Var = this.f42613a;
        return h0Var.isEmpty() ? Collections.emptyIterator() : this.f42615c ? new B.b(((i0.e) h0Var.entrySet()).iterator()) : ((i0.e) h0Var.entrySet()).iterator();
    }

    public final void n() {
        if (this.f42614b) {
            return;
        }
        h0 h0Var = this.f42613a;
        int n11 = h0Var.n();
        for (int i11 = 0; i11 < n11; i11++) {
            Map.Entry<Object, Object> m11 = h0Var.m(i11);
            if (m11.getValue() instanceof AbstractC5376w) {
                AbstractC5376w abstractC5376w = (AbstractC5376w) m11.getValue();
                abstractC5376w.getClass();
                c0 a11 = c0.a();
                a11.getClass();
                a11.b(abstractC5376w.getClass()).makeImmutable(abstractC5376w);
                abstractC5376w.o();
            }
        }
        h0Var.r();
        this.f42614b = true;
    }

    public final void o(C5372s<T> c5372s) {
        h0 h0Var = c5372s.f42613a;
        if (h0Var.n() > 0) {
            p(h0Var.m(0));
            throw null;
        }
        Iterator it = h0Var.o().iterator();
        if (it.hasNext()) {
            p((Map.Entry) it.next());
            throw null;
        }
    }

    public final void q(T t2, Object obj) {
        t2.getClass();
        t2.getClass();
        byte[] bArr = C5378y.f42629b;
        obj.getClass();
        int[] iArr = a.f42616a;
        throw null;
    }

    private C5372s(int i11) {
        n();
        n();
    }
}
