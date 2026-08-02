package I3;

import I3.y;
import android.os.SystemClock;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.J;
import com.google.common.collect.M;
import j3.C7253I;
import j3.C7272n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m3.C8053F;
import m3.InterfaceC8064f;
import m3.N;

/* renamed from: I3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3226a extends AbstractC3228c {

    /* renamed from: g, reason: collision with root package name */
    private final J3.d f11827g;

    /* renamed from: h, reason: collision with root package name */
    private final long f11828h;

    /* renamed from: i, reason: collision with root package name */
    private final long f11829i;

    /* renamed from: j, reason: collision with root package name */
    private final long f11830j;

    /* renamed from: k, reason: collision with root package name */
    private final int f11831k;

    /* renamed from: l, reason: collision with root package name */
    private final int f11832l;

    /* renamed from: m, reason: collision with root package name */
    private final float f11833m;

    /* renamed from: n, reason: collision with root package name */
    private final float f11834n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC5880y<C0231a> f11835o;

    /* renamed from: p, reason: collision with root package name */
    private final C8053F f11836p;

    /* renamed from: q, reason: collision with root package name */
    private float f11837q;

    /* renamed from: r, reason: collision with root package name */
    private int f11838r;

    /* renamed from: s, reason: collision with root package name */
    private int f11839s;

    /* renamed from: t, reason: collision with root package name */
    private long f11840t;

    /* renamed from: u, reason: collision with root package name */
    private G3.d f11841u;

    /* renamed from: I3.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C0231a {

        /* renamed from: a, reason: collision with root package name */
        public final long f11842a;

        /* renamed from: b, reason: collision with root package name */
        public final long f11843b;

        public C0231a(long j11, long j12) {
            this.f11842a = j11;
            this.f11843b = j12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0231a)) {
                return false;
            }
            C0231a c0231a = (C0231a) obj;
            return this.f11842a == c0231a.f11842a && this.f11843b == c0231a.f11843b;
        }

        public final int hashCode() {
            return (((int) this.f11842a) * 31) + ((int) this.f11843b);
        }
    }

    /* renamed from: I3.a$b */
    public static class b implements y.b {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // I3.y.b
        public final y[] a(y.a[] aVarArr, J3.d dVar) {
            y c3226a;
            AbstractC5880y t2 = C3226a.t(aVarArr);
            y[] yVarArr = new y[aVarArr.length];
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                y.a aVar = aVarArr[i11];
                if (aVar != null) {
                    int[] iArr = aVar.f11971b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            c3226a = new z(aVar.f11970a, new int[]{iArr[0]});
                        } else {
                            long j11 = 25000;
                            c3226a = new C3226a(aVar.f11970a, iArr, dVar, 10000, j11, j11, (AbstractC5880y) t2.get(i11));
                        }
                        yVarArr[i11] = c3226a;
                    }
                }
            }
            return yVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C3226a(C7253I c7253i, int[] iArr, J3.d dVar, long j11, long j12, long j13, AbstractC5880y abstractC5880y) {
        super(c7253i, iArr);
        C8053F c8053f = InterfaceC8064f.f74315a;
        if (j13 < j11) {
            m3.s.f("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j11;
        }
        this.f11827g = dVar;
        this.f11828h = j11 * 1000;
        this.f11829i = j12 * 1000;
        this.f11830j = j13 * 1000;
        this.f11831k = 1279;
        this.f11832l = 719;
        this.f11833m = 0.7f;
        this.f11834n = 0.75f;
        this.f11835o = AbstractC5880y.n(abstractC5880y);
        this.f11836p = c8053f;
        this.f11837q = 1.0f;
        this.f11839s = 0;
        this.f11840t = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static AbstractC5880y t(y.a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 1;
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (y.a aVar : aVarArr) {
            if (aVar == null || aVar.f11971b.length <= 1) {
                arrayList.add(null);
            } else {
                int i15 = AbstractC5880y.f59142c;
                AbstractC5880y.a aVar2 = new AbstractC5880y.a();
                aVar2.e(new C0231a(0L, 0L));
                arrayList.add(aVar2);
            }
        }
        int length = aVarArr.length;
        long[][] jArr = new long[length][];
        for (int i16 = 0; i16 < aVarArr.length; i16++) {
            y.a aVar3 = aVarArr[i16];
            if (aVar3 == null) {
                jArr[i16] = new long[0];
            } else {
                int[] iArr = aVar3.f11971b;
                jArr[i16] = new long[iArr.length];
                for (int i17 = 0; i17 < iArr.length; i17++) {
                    long j11 = aVar3.f11970a.a(iArr[i17]).f69122j;
                    long[] jArr2 = jArr[i16];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i17] = j11;
                }
                Arrays.sort(jArr[i16]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i18 = 0; i18 < length; i18++) {
            long[] jArr4 = jArr[i18];
            jArr3[i18] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        u(arrayList, jArr3);
        J c11 = M.b().a().c();
        int i19 = 0;
        while (i19 < length) {
            long[] jArr5 = jArr[i19];
            if (jArr5.length <= i13) {
                i11 = i13;
                i12 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i21 = i14;
                while (true) {
                    long[] jArr6 = jArr[i19];
                    i11 = i13;
                    double d11 = 0.0d;
                    if (i21 >= jArr6.length) {
                        break;
                    }
                    int i22 = i14;
                    int i23 = length;
                    long j12 = jArr6[i21];
                    if (j12 != -1) {
                        d11 = Math.log(j12);
                    }
                    dArr[i21] = d11;
                    i21++;
                    i14 = i22;
                    i13 = i11;
                    length = i23;
                }
                int i24 = i14;
                i12 = length;
                int i25 = length2 - 1;
                double d12 = dArr[i25] - dArr[i24];
                int i26 = i24;
                while (i26 < i25) {
                    double d13 = dArr[i26];
                    i26++;
                    c11.put(Double.valueOf(d12 == 0.0d ? 1.0d : (((d13 + dArr[i26]) * 0.5d) - dArr[i24]) / d12), Integer.valueOf(i19));
                    i24 = 0;
                }
            }
            i19++;
            i13 = i11;
            length = i12;
            i14 = 0;
        }
        AbstractC5880y n11 = AbstractC5880y.n(c11.values());
        for (int i27 = 0; i27 < n11.size(); i27++) {
            int intValue = ((Integer) n11.get(i27)).intValue();
            int i28 = iArr2[intValue] + 1;
            iArr2[intValue] = i28;
            jArr3[intValue] = jArr[intValue][i28];
            u(arrayList, jArr3);
        }
        for (int i29 = 0; i29 < aVarArr.length; i29++) {
            if (arrayList.get(i29) != null) {
                jArr3[i29] = jArr3[i29] * 2;
            }
        }
        u(arrayList, jArr3);
        AbstractC5880y.a aVar4 = new AbstractC5880y.a();
        for (int i31 = 0; i31 < arrayList.size(); i31++) {
            AbstractC5880y.a aVar5 = (AbstractC5880y.a) arrayList.get(i31);
            aVar4.e(aVar5 == null ? AbstractC5880y.v() : aVar5.j());
        }
        return aVar4.j();
    }

    private static void u(ArrayList arrayList, long[] jArr) {
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += j12;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            AbstractC5880y.a aVar = (AbstractC5880y.a) arrayList.get(i11);
            if (aVar != null) {
                aVar.e(new C0231a(j11, jArr[i11]));
            }
        }
    }

    private int v(long j11, long j12) {
        long a11 = (long) (((long) (this.f11827g.a() * this.f11833m)) / this.f11837q);
        AbstractC5880y<C0231a> abstractC5880y = this.f11835o;
        if (!abstractC5880y.isEmpty()) {
            int i11 = 1;
            while (i11 < abstractC5880y.size() - 1 && abstractC5880y.get(i11).f11842a < a11) {
                i11++;
            }
            C0231a c0231a = abstractC5880y.get(i11 - 1);
            C0231a c0231a2 = abstractC5880y.get(i11);
            long j13 = c0231a.f11842a;
            float f7 = (a11 - j13) / (c0231a2.f11842a - j13);
            long j14 = c0231a2.f11843b;
            a11 = ((long) (f7 * (j14 - r0))) + c0231a.f11843b;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f11846b; i13++) {
            if (j11 == Long.MIN_VALUE || !b(i13, j11)) {
                if (m(i13).f69122j <= a11) {
                    return i13;
                }
                i12 = i13;
            }
        }
        return i12;
    }

    private static long w(List list) {
        if (!list.isEmpty()) {
            G3.d dVar = (G3.d) com.google.common.collect.B.b(list);
            long j11 = dVar.f9676g;
            if (j11 != -9223372036854775807L) {
                long j12 = dVar.f9677h;
                if (j12 != -9223372036854775807L) {
                    return j12 - j11;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // I3.AbstractC3228c, I3.y
    public final void a() {
        this.f11840t = -9223372036854775807L;
        this.f11841u = null;
    }

    @Override // I3.AbstractC3228c, I3.y
    public final void disable() {
        this.f11841u = null;
    }

    @Override // I3.y
    public final int getSelectedIndex() {
        return this.f11838r;
    }

    @Override // I3.AbstractC3228c, I3.y
    public final int h(long j11, List<? extends G3.d> list) {
        int i11;
        int i12;
        this.f11836p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = this.f11840t;
        if (j12 != -9223372036854775807L && elapsedRealtime - j12 < 1000 && (list.isEmpty() || ((G3.d) com.google.common.collect.B.b(list)).equals(this.f11841u))) {
            return list.size();
        }
        this.f11840t = elapsedRealtime;
        this.f11841u = list.isEmpty() ? null : (G3.d) com.google.common.collect.B.b(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long D11 = N.D(this.f11837q, list.get(size - 1).f9676g - j11);
        long j13 = this.f11830j;
        if (D11 >= j13) {
            C7272n m11 = m(v(elapsedRealtime, w(list)));
            for (int i13 = 0; i13 < size; i13++) {
                G3.d dVar = list.get(i13);
                C7272n c7272n = dVar.f9673d;
                if (N.D(this.f11837q, dVar.f9676g - j11) >= j13 && c7272n.f69122j < m11.f69122j && (i11 = c7272n.f69135w) != -1 && i11 <= this.f11832l && (i12 = c7272n.f69134v) != -1 && i12 <= this.f11831k && i11 < m11.f69135w) {
                    return i13;
                }
            }
        }
        return size;
    }

    @Override // I3.y
    public final void n(long j11, long j12, long j13, List<? extends G3.d> list, G3.e[] eVarArr) {
        long w11;
        this.f11836p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = this.f11838r;
        if (i11 >= eVarArr.length || !eVarArr[i11].next()) {
            int length = eVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    w11 = w(list);
                    break;
                }
                G3.e eVar = eVarArr[i12];
                if (eVar.next()) {
                    w11 = eVar.a() - eVar.b();
                    break;
                }
                i12++;
            }
        } else {
            G3.e eVar2 = eVarArr[this.f11838r];
            w11 = eVar2.a() - eVar2.b();
        }
        int i13 = this.f11839s;
        if (i13 == 0) {
            this.f11839s = 1;
            this.f11838r = v(elapsedRealtime, w11);
            return;
        }
        int i14 = this.f11838r;
        int s11 = list.isEmpty() ? -1 : s(((G3.d) com.google.common.collect.B.b(list)).f9673d);
        if (s11 != -1) {
            i13 = ((G3.d) com.google.common.collect.B.b(list)).f9674e;
            i14 = s11;
        }
        int v11 = v(elapsedRealtime, w11);
        if (v11 != i14 && !b(i14, elapsedRealtime)) {
            C7272n m11 = m(i14);
            C7272n m12 = m(v11);
            long j14 = this.f11828h;
            if (j13 != -9223372036854775807L) {
                j14 = Math.min((long) ((w11 != -9223372036854775807L ? j13 - w11 : j13) * this.f11834n), j14);
            }
            int i15 = m12.f69122j;
            int i16 = m11.f69122j;
            if ((i15 > i16 && j12 < j14) || (i15 < i16 && j12 >= this.f11829i)) {
                v11 = i14;
            }
        }
        if (v11 != i14) {
            i13 = 3;
        }
        this.f11839s = i13;
        this.f11838r = v11;
    }

    @Override // I3.AbstractC3228c, I3.y
    public final void o(float f7) {
        this.f11837q = f7;
    }

    @Override // I3.y
    public final Object p() {
        return null;
    }

    @Override // I3.y
    public final int r() {
        return this.f11839s;
    }
}
