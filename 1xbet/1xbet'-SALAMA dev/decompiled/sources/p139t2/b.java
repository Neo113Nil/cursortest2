package p139t2;

import A1.X;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.C0164w;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p018c2.e0;
import p032e2.j;
import p032e2.k;
import p146u2.C0960t;
import p146u2.InterfaceC0947f;
import p151v2.p;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC0947f f16288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f16289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f16290i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f16291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f16292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f16293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f16294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC0167z f16295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f16296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f16297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f16300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j f16301u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e0 e0Var, int[] iArr, int i7, InterfaceC0947f interfaceC0947f, long j, long j3, long j7, AbstractC0167z abstractC0167z) {
        super(e0Var, iArr);
        p pVar = p.f17151a;
        if (j7 < j) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j7 = j;
        }
        this.f16288g = interfaceC0947f;
        this.f16289h = j * 1000;
        this.f16290i = j3 * 1000;
        this.j = j7 * 1000;
        this.f16291k = 1279;
        this.f16292l = 719;
        this.f16293m = 0.7f;
        this.f16294n = 0.75f;
        this.f16295o = AbstractC0167z.E(abstractC0167z);
        this.f16296p = pVar;
        this.f16297q = 1.0f;
        this.f16299s = 0;
        this.f16300t = -9223372036854775807L;
    }

    public static void m(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j3 : jArr) {
            j += j3;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C0164w c0164w = (C0164w) arrayList.get(i7);
            if (c0164w != null) {
                c0164w.b(new a(j, jArr[i7]));
            }
        }
    }

    public static long o(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        j jVar = (j) AbstractC0158p.f(list);
        long j = jVar.f12605x;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = jVar.f12606y;
        if (j3 != -9223372036854775807L) {
            return j3 - j;
        }
        return -9223372036854775807L;
    }

    @Override // p139t2.c
    public final void b() {
        this.f16301u = null;
    }

    @Override // p139t2.c
    public final void c() {
        this.f16300t = -9223372036854775807L;
        this.f16301u = null;
    }

    @Override // p139t2.c
    public final int d(long j, List list) {
        int i7;
        int i8;
        this.f16296p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f16300t;
        if (j3 != -9223372036854775807L && jElapsedRealtime - j3 < 1000 && (list.isEmpty() || ((j) AbstractC0158p.f(list)).equals(this.f16301u))) {
            return list.size();
        }
        this.f16300t = jElapsedRealtime;
        this.f16301u = list.isEmpty() ? null : (j) AbstractC0158p.f(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jX = t.x(((j) list.get(size - 1)).f12605x - j, this.f16297q);
        long j7 = this.j;
        if (jX < j7) {
            return size;
        }
        o(list);
        X x4 = this.f16305d[n(jElapsedRealtime)];
        for (int i9 = 0; i9 < size; i9++) {
            j jVar = (j) list.get(i9);
            X x7 = jVar.f12602d;
            if (t.x(jVar.f12605x - j, this.f16297q) >= j7 && x7.f311y < x4.f311y && (i7 = x7.f289I) != -1 && i7 <= this.f16292l && (i8 = x7.f288H) != -1 && i8 <= this.f16291k && i7 < x4.f289I) {
                return i9;
            }
        }
        return size;
    }

    @Override // p139t2.c
    public final int e() {
        return this.f16298r;
    }

    @Override // p139t2.c
    public final Object f() {
        return null;
    }

    @Override // p139t2.c
    public final int g() {
        return this.f16299s;
    }

    @Override // p139t2.c
    public final void k(float f7) {
        this.f16297q = f7;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    @Override // p139t2.c
    public final void l(long j, long j3, List list, k[] kVarArr) {
        long jO;
        long jF;
        long jC;
        int i7;
        int i8;
        int i9;
        int iN;
        long jMin;
        int i10;
        int i11;
        long j7;
        this.f16296p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i12 = this.f16298r;
        if (i12 >= kVarArr.length || !kVarArr[i12].next()) {
            int length = kVarArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    jO = o(list);
                    break;
                }
                k kVar = kVarArr[i13];
                if (kVar.next()) {
                    jF = kVar.f();
                    jC = kVar.c();
                } else {
                    i13++;
                }
            }
            i7 = this.f16299s;
            if (i7 == 0) {
                this.f16299s = 1;
                this.f16298r = n(jElapsedRealtime);
                return;
            }
            i8 = this.f16298r;
            if (list.isEmpty()) {
                i9 = -1;
            } else {
                i9 = i(((j) AbstractC0158p.f(list)).f12602d);
            }
            if (i9 != -1) {
                i7 = ((j) AbstractC0158p.f(list)).f12603e;
                i8 = i9;
            }
            iN = n(jElapsedRealtime);
            if (!j(i8, jElapsedRealtime)) {
                X[] xArr = this.f16305d;
                X x4 = xArr[i8];
                X x7 = xArr[iN];
                jMin = this.f16289h;
                if (j3 != -9223372036854775807L) {
                    if (jO != -9223372036854775807L) {
                        j7 = j3 - jO;
                    } else {
                        j7 = j3;
                    }
                    jMin = Math.min((long) (j7 * this.f16294n), jMin);
                }
                i10 = x7.f311y;
                i11 = x4.f311y;
                if ((i10 <= i11 && j < jMin) || (i10 < i11 && j >= this.f16290i)) {
                }
            }
            if (iN != i8) {
                i7 = 3;
            }
            this.f16299s = i7;
            this.f16298r = iN;
        }
        k kVar2 = kVarArr[this.f16298r];
        jF = kVar2.f();
        jC = kVar2.c();
        jO = jF - jC;
        i7 = this.f16299s;
        if (i7 == 0) {
            this.f16299s = 1;
            this.f16298r = n(jElapsedRealtime);
            return;
        }
        i8 = this.f16298r;
        if (list.isEmpty()) {
            i9 = -1;
        } else {
            i9 = i(((j) AbstractC0158p.f(list)).f12602d);
        }
        if (i9 != -1) {
            i7 = ((j) AbstractC0158p.f(list)).f12603e;
            i8 = i9;
        }
        iN = n(jElapsedRealtime);
        if (!j(i8, jElapsedRealtime)) {
            X[] xArr2 = this.f16305d;
            X x8 = xArr2[i8];
            X x9 = xArr2[iN];
            jMin = this.f16289h;
            if (j3 != -9223372036854775807L) {
                if (jO != -9223372036854775807L) {
                    j7 = j3 - jO;
                } else {
                    j7 = j3;
                }
                jMin = Math.min((long) (j7 * this.f16294n), jMin);
            }
            i10 = x9.f311y;
            i11 = x8.f311y;
            iN = i10 <= i11 ? i8 : i8;
        }
        if (iN != i8) {
            i7 = 3;
        }
        this.f16299s = i7;
        this.f16298r = iN;
    }

    public final int n(long j) {
        long j3;
        C0960t c0960t = (C0960t) this.f16288g;
        synchronized (c0960t) {
            j3 = c0960t.f16846l;
        }
        long j7 = (long) (j3 * this.f16293m);
        this.f16288g.getClass();
        long j8 = (long) (j7 / this.f16297q);
        if (!this.f16295o.isEmpty()) {
            int i7 = 1;
            while (i7 < this.f16295o.size() - 1 && ((a) this.f16295o.get(i7)).f16286a < j8) {
                i7++;
            }
            a aVar = (a) this.f16295o.get(i7 - 1);
            a aVar2 = (a) this.f16295o.get(i7);
            long j9 = aVar.f16286a;
            float f7 = (j8 - j9) / (aVar2.f16286a - j9);
            long j10 = aVar.f16287b;
            j8 = j10 + ((long) (f7 * (aVar2.f16287b - j10)));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f16303b; i9++) {
            if (j == Long.MIN_VALUE || !j(i9, j)) {
                if (this.f16305d[i9].f311y <= j8) {
                    return i9;
                }
                i8 = i9;
            }
        }
        return i8;
    }
}
