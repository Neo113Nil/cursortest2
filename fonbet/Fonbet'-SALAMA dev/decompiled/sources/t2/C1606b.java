package t2;

import A1.X;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.C0164w;
import android.os.SystemClock;
import android.util.Log;
import c2.e0;
import e2.AbstractC1013j;
import e2.InterfaceC1014k;
import java.util.ArrayList;
import java.util.List;
import u2.C1642t;
import u2.InterfaceC1629f;

/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1606b extends c {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1629f f16282g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16283h;

    /* renamed from: i, reason: collision with root package name */
    public final long f16284i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16285k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16286l;

    /* renamed from: m, reason: collision with root package name */
    public final float f16287m;

    /* renamed from: n, reason: collision with root package name */
    public final float f16288n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC0167z f16289o;

    /* renamed from: p, reason: collision with root package name */
    public final v2.p f16290p;

    /* renamed from: q, reason: collision with root package name */
    public float f16291q;

    /* renamed from: r, reason: collision with root package name */
    public int f16292r;

    /* renamed from: s, reason: collision with root package name */
    public int f16293s;

    /* renamed from: t, reason: collision with root package name */
    public long f16294t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC1013j f16295u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1606b(e0 e0Var, int[] iArr, int i7, InterfaceC1629f interfaceC1629f, long j, long j3, long j7, AbstractC0167z abstractC0167z) {
        super(e0Var, iArr);
        v2.p pVar = v2.p.f17145a;
        if (j7 < j) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j7 = j;
        }
        this.f16282g = interfaceC1629f;
        this.f16283h = j * 1000;
        this.f16284i = j3 * 1000;
        this.j = j7 * 1000;
        this.f16285k = 1279;
        this.f16286l = 719;
        this.f16287m = 0.7f;
        this.f16288n = 0.75f;
        this.f16289o = AbstractC0167z.E(abstractC0167z);
        this.f16290p = pVar;
        this.f16291q = 1.0f;
        this.f16293s = 0;
        this.f16294t = -9223372036854775807L;
    }

    public static void m(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j3 : jArr) {
            j += j3;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C0164w c0164w = (C0164w) arrayList.get(i7);
            if (c0164w != null) {
                c0164w.b(new C1605a(j, jArr[i7]));
            }
        }
    }

    public static long o(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        AbstractC1013j abstractC1013j = (AbstractC1013j) AbstractC0158p.f(list);
        long j = abstractC1013j.f12599x;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = abstractC1013j.f12600y;
        if (j3 != -9223372036854775807L) {
            return j3 - j;
        }
        return -9223372036854775807L;
    }

    @Override // t2.c
    public final void b() {
        this.f16295u = null;
    }

    @Override // t2.c
    public final void c() {
        this.f16294t = -9223372036854775807L;
        this.f16295u = null;
    }

    @Override // t2.c
    public final int d(long j, List list) {
        int i7;
        int i8;
        this.f16290p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f16294t;
        if (j3 != -9223372036854775807L && elapsedRealtime - j3 < 1000 && (list.isEmpty() || ((AbstractC1013j) AbstractC0158p.f(list)).equals(this.f16295u))) {
            return list.size();
        }
        this.f16294t = elapsedRealtime;
        this.f16295u = list.isEmpty() ? null : (AbstractC1013j) AbstractC0158p.f(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long x4 = v2.t.x(((AbstractC1013j) list.get(size - 1)).f12599x - j, this.f16291q);
        long j7 = this.j;
        if (x4 < j7) {
            return size;
        }
        o(list);
        X x7 = this.f16299d[n(elapsedRealtime)];
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC1013j abstractC1013j = (AbstractC1013j) list.get(i9);
            X x8 = abstractC1013j.f12596d;
            if (v2.t.x(abstractC1013j.f12599x - j, this.f16291q) >= j7 && x8.f311y < x7.f311y && (i7 = x8.f289I) != -1 && i7 <= this.f16286l && (i8 = x8.f288H) != -1 && i8 <= this.f16285k && i7 < x7.f289I) {
                return i9;
            }
        }
        return size;
    }

    @Override // t2.c
    public final int e() {
        return this.f16292r;
    }

    @Override // t2.c
    public final Object f() {
        return null;
    }

    @Override // t2.c
    public final int g() {
        return this.f16293s;
    }

    @Override // t2.c
    public final void k(float f7) {
        this.f16291q = f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    @Override // t2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(long j, long j3, List list, InterfaceC1014k[] interfaceC1014kArr) {
        long o7;
        long f7;
        long c3;
        int i7;
        this.f16290p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i8 = this.f16292r;
        if (i8 >= interfaceC1014kArr.length || !interfaceC1014kArr[i8].next()) {
            for (InterfaceC1014k interfaceC1014k : interfaceC1014kArr) {
                if (interfaceC1014k.next()) {
                    f7 = interfaceC1014k.f();
                    c3 = interfaceC1014k.c();
                }
            }
            o7 = o(list);
            i7 = this.f16293s;
            if (i7 != 0) {
                this.f16293s = 1;
                this.f16292r = n(elapsedRealtime);
                return;
            }
            int i9 = this.f16292r;
            int i10 = list.isEmpty() ? -1 : i(((AbstractC1013j) AbstractC0158p.f(list)).f12596d);
            if (i10 != -1) {
                i7 = ((AbstractC1013j) AbstractC0158p.f(list)).f12597e;
                i9 = i10;
            }
            int n2 = n(elapsedRealtime);
            if (!j(i9, elapsedRealtime)) {
                X[] xArr = this.f16299d;
                X x4 = xArr[i9];
                X x7 = xArr[n2];
                long j7 = this.f16283h;
                if (j3 != -9223372036854775807L) {
                    j7 = Math.min((long) ((o7 != -9223372036854775807L ? j3 - o7 : j3) * this.f16288n), j7);
                }
                int i11 = x7.f311y;
                int i12 = x4.f311y;
                if ((i11 > i12 && j < j7) || (i11 < i12 && j >= this.f16284i)) {
                    n2 = i9;
                }
            }
            if (n2 != i9) {
                i7 = 3;
            }
            this.f16293s = i7;
            this.f16292r = n2;
            return;
        }
        InterfaceC1014k interfaceC1014k2 = interfaceC1014kArr[this.f16292r];
        f7 = interfaceC1014k2.f();
        c3 = interfaceC1014k2.c();
        o7 = f7 - c3;
        i7 = this.f16293s;
        if (i7 != 0) {
        }
    }

    public final int n(long j) {
        long j3;
        C1642t c1642t = (C1642t) this.f16282g;
        synchronized (c1642t) {
            j3 = c1642t.f16840l;
        }
        long j7 = (long) (j3 * this.f16287m);
        this.f16282g.getClass();
        long j8 = (long) (j7 / this.f16291q);
        if (!this.f16289o.isEmpty()) {
            int i7 = 1;
            while (i7 < this.f16289o.size() - 1 && ((C1605a) this.f16289o.get(i7)).f16280a < j8) {
                i7++;
            }
            C1605a c1605a = (C1605a) this.f16289o.get(i7 - 1);
            C1605a c1605a2 = (C1605a) this.f16289o.get(i7);
            long j9 = c1605a.f16280a;
            long j10 = c1605a.f16281b;
            j8 = j10 + ((long) (((j8 - j9) / (c1605a2.f16280a - j9)) * (c1605a2.f16281b - j10)));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f16297b; i9++) {
            if (j == Long.MIN_VALUE || !j(i9, j)) {
                if (this.f16299d[i9].f311y <= j8) {
                    return i9;
                }
                i8 = i9;
            }
        }
        return i8;
    }
}
