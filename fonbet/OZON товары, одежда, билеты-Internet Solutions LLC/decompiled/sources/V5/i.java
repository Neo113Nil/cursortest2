package V5;

import C.o0;
import E0.C2942q;
import V5.g;
import V5.l;
import Z5.p;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import q6.AbstractC8993d;
import q6.C8990a;

/* loaded from: classes.dex */
final class i<R> implements g.a, Runnable, Comparable<i<?>>, C8990a.d {

    /* renamed from: A, reason: collision with root package name */
    private T5.a f28156A;

    /* renamed from: B, reason: collision with root package name */
    private com.bumptech.glide.load.data.d<?> f28157B;

    /* renamed from: C, reason: collision with root package name */
    private volatile g f28158C;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f28159D;

    /* renamed from: E, reason: collision with root package name */
    private volatile boolean f28160E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f28161F;

    /* renamed from: d, reason: collision with root package name */
    private final l.c f28165d;

    /* renamed from: e, reason: collision with root package name */
    private final x2.f<i<?>> f28166e;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.f f28169h;

    /* renamed from: i, reason: collision with root package name */
    private T5.f f28170i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.i f28171j;

    /* renamed from: k, reason: collision with root package name */
    private n f28172k;

    /* renamed from: l, reason: collision with root package name */
    private int f28173l;

    /* renamed from: m, reason: collision with root package name */
    private int f28174m;

    /* renamed from: n, reason: collision with root package name */
    private k f28175n;

    /* renamed from: o, reason: collision with root package name */
    private T5.i f28176o;

    /* renamed from: p, reason: collision with root package name */
    private m f28177p;

    /* renamed from: q, reason: collision with root package name */
    private int f28178q;

    /* renamed from: r, reason: collision with root package name */
    private f f28179r;

    /* renamed from: s, reason: collision with root package name */
    private e f28180s;

    /* renamed from: t, reason: collision with root package name */
    private long f28181t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f28182u;

    /* renamed from: v, reason: collision with root package name */
    private Object f28183v;

    /* renamed from: w, reason: collision with root package name */
    private Thread f28184w;

    /* renamed from: x, reason: collision with root package name */
    private T5.f f28185x;

    /* renamed from: y, reason: collision with root package name */
    private T5.f f28186y;

    /* renamed from: z, reason: collision with root package name */
    private Object f28187z;

    /* renamed from: a, reason: collision with root package name */
    private final h<R> f28162a = new h<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f28163b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC8993d f28164c = AbstractC8993d.a();

    /* renamed from: f, reason: collision with root package name */
    private final c<?> f28167f = new c<>();

    /* renamed from: g, reason: collision with root package name */
    private final d f28168g = new d();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28188a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f28189b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f28190c;

        static {
            int[] iArr = new int[T5.c.values().length];
            f28190c = iArr;
            try {
                iArr[T5.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28190c[T5.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[f.values().length];
            f28189b = iArr2;
            try {
                iArr2[f.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28189b[f.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28189b[f.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28189b[f.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28189b[f.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[e.values().length];
            f28188a = iArr3;
            try {
                iArr3[e.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28188a[e.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28188a[e.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b<Z> {

        /* renamed from: a, reason: collision with root package name */
        private final T5.a f28191a;

        b(T5.a aVar) {
            this.f28191a = aVar;
        }

        @NonNull
        public final v<Z> a(@NonNull v<Z> vVar) {
            return i.this.m(this.f28191a, vVar);
        }
    }

    private static class c<Z> {

        /* renamed from: a, reason: collision with root package name */
        private T5.f f28193a;

        /* renamed from: b, reason: collision with root package name */
        private T5.l<Z> f28194b;

        /* renamed from: c, reason: collision with root package name */
        private u<Z> f28195c;

        final void a() {
            this.f28193a = null;
            this.f28194b = null;
            this.f28195c = null;
        }

        final void b(l.c cVar, T5.i iVar) {
            try {
                cVar.a().b(this.f28193a, new V5.f(this.f28194b, this.f28195c, iVar));
            } finally {
                this.f28195c.e();
            }
        }

        final boolean c() {
            return this.f28195c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final <X> void d(T5.f fVar, T5.l<X> lVar, u<X> uVar) {
            this.f28193a = fVar;
            this.f28194b = lVar;
            this.f28195c = uVar;
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private boolean f28196a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f28197b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f28198c;

        private boolean a() {
            return (this.f28198c || this.f28197b) && this.f28196a;
        }

        final synchronized boolean b() {
            this.f28197b = true;
            return a();
        }

        final synchronized boolean c() {
            this.f28198c = true;
            return a();
        }

        final synchronized boolean d() {
            this.f28196a = true;
            return a();
        }

        final synchronized void e() {
            this.f28197b = false;
            this.f28196a = false;
            this.f28198c = false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e DECODE_DATA;
        public static final e INITIALIZE;
        public static final e SWITCH_TO_SOURCE_SERVICE;

        static {
            e eVar = new e("INITIALIZE", 0);
            INITIALIZE = eVar;
            e eVar2 = new e("SWITCH_TO_SOURCE_SERVICE", 1);
            SWITCH_TO_SOURCE_SERVICE = eVar2;
            e eVar3 = new e("DECODE_DATA", 2);
            DECODE_DATA = eVar3;
            $VALUES = new e[]{eVar, eVar2, eVar3};
        }

        private e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class f {
        private static final /* synthetic */ f[] $VALUES;
        public static final f DATA_CACHE;
        public static final f ENCODE;
        public static final f FINISHED;
        public static final f INITIALIZE;
        public static final f RESOURCE_CACHE;
        public static final f SOURCE;

        static {
            f fVar = new f("INITIALIZE", 0);
            INITIALIZE = fVar;
            f fVar2 = new f("RESOURCE_CACHE", 1);
            RESOURCE_CACHE = fVar2;
            f fVar3 = new f("DATA_CACHE", 2);
            DATA_CACHE = fVar3;
            f fVar4 = new f("SOURCE", 3);
            SOURCE = fVar4;
            f fVar5 = new f("ENCODE", 4);
            ENCODE = fVar5;
            f fVar6 = new f("FINISHED", 5);
            FINISHED = fVar6;
            $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        }

        private f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    i(l.c cVar, x2.f fVar) {
        this.f28165d = cVar;
        this.f28166e = fVar;
    }

    private <Data> v<R> e(com.bumptech.glide.load.data.d<?> dVar, Data data, T5.a aVar) throws q {
        if (data == null) {
            return null;
        }
        try {
            int i11 = p6.g.f80269b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            v<R> f7 = f(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                k(elapsedRealtimeNanos, "Decoded result " + f7, null);
            }
            return f7;
        } finally {
            dVar.cleanup();
        }
    }

    private <Data> v<R> f(Data data, T5.a aVar) throws q {
        Class<?> cls = data.getClass();
        h<R> hVar = this.f28162a;
        t<Data, ?, R> h11 = hVar.h(cls);
        T5.i iVar = this.f28176o;
        boolean z11 = aVar == T5.a.RESOURCE_DISK_CACHE || hVar.w();
        T5.h<Boolean> hVar2 = c6.o.f56574j;
        Boolean bool = (Boolean) iVar.a(hVar2);
        if (bool == null || (bool.booleanValue() && !z11)) {
            iVar = new T5.i();
            iVar.b(this.f28176o);
            iVar.d(hVar2, Boolean.valueOf(z11));
        }
        T5.i iVar2 = iVar;
        com.bumptech.glide.load.data.e j11 = this.f28169h.i().j(data);
        try {
            return h11.a(this.f28173l, this.f28174m, iVar2, new b(aVar), j11);
        } finally {
            j11.cleanup();
        }
    }

    private void g() {
        v<R> vVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            k(this.f28181t, "Retrieved data", "data: " + this.f28187z + ", cache key: " + this.f28185x + ", fetcher: " + this.f28157B);
        }
        u uVar = null;
        try {
            vVar = e(this.f28157B, this.f28187z, this.f28156A);
        } catch (q e11) {
            e11.h(this.f28186y, this.f28156A, null);
            this.f28163b.add(e11);
            vVar = null;
        }
        if (vVar == null) {
            q();
            return;
        }
        T5.a aVar = this.f28156A;
        boolean z11 = this.f28161F;
        if (vVar instanceof r) {
            ((r) vVar).initialize();
        }
        c<?> cVar = this.f28167f;
        if (cVar.c()) {
            uVar = u.c(vVar);
            vVar = uVar;
        }
        s();
        this.f28177p.i(vVar, aVar, z11);
        this.f28179r = f.ENCODE;
        try {
            if (cVar.c()) {
                cVar.b(this.f28165d, this.f28176o);
            }
            if (this.f28168g.b()) {
                o();
            }
        } finally {
            if (uVar != null) {
                uVar.e();
            }
        }
    }

    private g h() {
        int i11 = a.f28189b[this.f28179r.ordinal()];
        h<R> hVar = this.f28162a;
        if (i11 == 1) {
            return new w(hVar, this);
        }
        if (i11 == 2) {
            return new V5.d(hVar.c(), hVar, this);
        }
        if (i11 == 3) {
            return new A(hVar, this);
        }
        if (i11 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f28179r);
    }

    private f i(f fVar) {
        int i11 = a.f28189b[fVar.ordinal()];
        if (i11 == 1) {
            return this.f28175n.a() ? f.DATA_CACHE : i(f.DATA_CACHE);
        }
        if (i11 == 2) {
            return this.f28182u ? f.FINISHED : f.SOURCE;
        }
        if (i11 == 3 || i11 == 4) {
            return f.FINISHED;
        }
        if (i11 == 5) {
            return this.f28175n.b() ? f.RESOURCE_CACHE : i(f.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + fVar);
    }

    private void k(long j11, String str, String str2) {
        StringBuilder e11 = C2942q.e(str, " in ");
        e11.append(p6.g.a(j11));
        e11.append(", load key: ");
        e11.append(this.f28172k);
        e11.append(str2 != null ? ", ".concat(str2) : "");
        e11.append(", thread: ");
        e11.append(Thread.currentThread().getName());
        Log.v("DecodeJob", e11.toString());
    }

    private void l() {
        s();
        this.f28177p.h(new q("Failed to load resource", new ArrayList(this.f28163b)));
        if (this.f28168g.c()) {
            o();
        }
    }

    private void o() {
        this.f28168g.e();
        this.f28167f.a();
        this.f28162a.a();
        this.f28159D = false;
        this.f28169h = null;
        this.f28170i = null;
        this.f28176o = null;
        this.f28171j = null;
        this.f28172k = null;
        this.f28177p = null;
        this.f28179r = null;
        this.f28158C = null;
        this.f28184w = null;
        this.f28185x = null;
        this.f28187z = null;
        this.f28156A = null;
        this.f28157B = null;
        this.f28181t = 0L;
        this.f28160E = false;
        this.f28183v = null;
        this.f28163b.clear();
        this.f28166e.b(this);
    }

    private void q() {
        this.f28184w = Thread.currentThread();
        int i11 = p6.g.f80269b;
        this.f28181t = SystemClock.elapsedRealtimeNanos();
        boolean z11 = false;
        while (!this.f28160E && this.f28158C != null && !(z11 = this.f28158C.b())) {
            this.f28179r = i(this.f28179r);
            this.f28158C = h();
            if (this.f28179r == f.SOURCE) {
                this.f28180s = e.SWITCH_TO_SOURCE_SERVICE;
                this.f28177p.m(this);
                return;
            }
        }
        if ((this.f28179r == f.FINISHED || this.f28160E) && !z11) {
            l();
        }
    }

    private void r() {
        int i11 = a.f28188a[this.f28180s.ordinal()];
        if (i11 == 1) {
            this.f28179r = i(f.INITIALIZE);
            this.f28158C = h();
            q();
        } else if (i11 == 2) {
            q();
        } else if (i11 == 3) {
            g();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f28180s);
        }
    }

    private void s() {
        this.f28164c.c();
        if (this.f28159D) {
            throw new IllegalStateException("Already notified", this.f28163b.isEmpty() ? null : (Throwable) o0.b(1, this.f28163b));
        }
        this.f28159D = true;
    }

    @Override // V5.g.a
    public final void a(T5.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, T5.a aVar) {
        dVar.cleanup();
        q qVar = new q("Fetching data failed", Collections.singletonList(exc));
        qVar.h(fVar, aVar, dVar.getDataClass());
        this.f28163b.add(qVar);
        if (Thread.currentThread() == this.f28184w) {
            q();
        } else {
            this.f28180s = e.SWITCH_TO_SOURCE_SERVICE;
            this.f28177p.m(this);
        }
    }

    public final void b() {
        this.f28160E = true;
        g gVar = this.f28158C;
        if (gVar != null) {
            gVar.cancel();
        }
    }

    @Override // V5.g.a
    public final void c(T5.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, T5.a aVar, T5.f fVar2) {
        this.f28185x = fVar;
        this.f28187z = obj;
        this.f28157B = dVar;
        this.f28156A = aVar;
        this.f28186y = fVar2;
        this.f28161F = fVar != this.f28162a.c().get(0);
        if (Thread.currentThread() == this.f28184w) {
            g();
        } else {
            this.f28180s = e.DECODE_DATA;
            this.f28177p.m(this);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull i<?> iVar) {
        i<?> iVar2 = iVar;
        int ordinal = this.f28171j.ordinal() - iVar2.f28171j.ordinal();
        return ordinal == 0 ? this.f28178q - iVar2.f28178q : ordinal;
    }

    @Override // q6.C8990a.d
    @NonNull
    public final AbstractC8993d d() {
        return this.f28164c;
    }

    final void j(com.bumptech.glide.f fVar, Object obj, n nVar, T5.f fVar2, int i11, int i12, Class cls, Class cls2, com.bumptech.glide.i iVar, k kVar, Map map, boolean z11, boolean z12, boolean z13, T5.i iVar2, m mVar, int i13) {
        this.f28162a.u(fVar, obj, fVar2, i11, i12, kVar, cls, cls2, iVar, iVar2, map, z11, z12, this.f28165d);
        this.f28169h = fVar;
        this.f28170i = fVar2;
        this.f28171j = iVar;
        this.f28172k = nVar;
        this.f28173l = i11;
        this.f28174m = i12;
        this.f28175n = kVar;
        this.f28182u = z13;
        this.f28176o = iVar2;
        this.f28177p = mVar;
        this.f28178q = i13;
        this.f28180s = e.INITIALIZE;
        this.f28183v = obj;
    }

    @NonNull
    final <Z> v<Z> m(T5.a aVar, @NonNull v<Z> vVar) {
        v<Z> vVar2;
        T5.m<Z> mVar;
        T5.c cVar;
        T5.f eVar;
        Class<?> cls = vVar.get().getClass();
        T5.a aVar2 = T5.a.RESOURCE_DISK_CACHE;
        h<R> hVar = this.f28162a;
        T5.l<Z> lVar = null;
        if (aVar != aVar2) {
            T5.m<Z> s11 = hVar.s(cls);
            mVar = s11;
            vVar2 = s11.transform(this.f28169h, vVar, this.f28173l, this.f28174m);
        } else {
            vVar2 = vVar;
            mVar = null;
        }
        if (!vVar.equals(vVar2)) {
            vVar.a();
        }
        if (hVar.v(vVar2)) {
            lVar = hVar.n(vVar2);
            cVar = lVar.b(this.f28176o);
        } else {
            cVar = T5.c.NONE;
        }
        T5.l<Z> lVar2 = lVar;
        T5.f fVar = this.f28185x;
        ArrayList g10 = hVar.g();
        int size = g10.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            if (((p.a) g10.get(i11)).f35542a.equals(fVar)) {
                z11 = true;
                break;
            }
            i11++;
        }
        if (!this.f28175n.d(!z11, aVar, cVar)) {
            return vVar2;
        }
        if (lVar2 == null) {
            throw new j.d(vVar2.get().getClass());
        }
        int i12 = a.f28190c[cVar.ordinal()];
        if (i12 == 1) {
            eVar = new V5.e(this.f28185x, this.f28170i);
        } else {
            if (i12 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVar);
            }
            eVar = new x(hVar.b(), this.f28185x, this.f28170i, this.f28173l, this.f28174m, mVar, cls, this.f28176o);
        }
        u c11 = u.c(vVar2);
        this.f28167f.d(eVar, lVar2, c11);
        return c11;
    }

    final void n() {
        if (this.f28168g.d()) {
            o();
        }
    }

    public final void p() {
        this.f28180s = e.SWITCH_TO_SOURCE_SERVICE;
        this.f28177p.m(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.f28157B;
        try {
            try {
                try {
                    if (this.f28160E) {
                        l();
                        if (dVar != null) {
                            dVar.cleanup();
                            return;
                        }
                        return;
                    }
                    r();
                    if (dVar != null) {
                        dVar.cleanup();
                    }
                } catch (Throwable th2) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f28160E + ", stage: " + this.f28179r, th2);
                    }
                    if (this.f28179r != f.ENCODE) {
                        this.f28163b.add(th2);
                        l();
                    }
                    if (!this.f28160E) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (V5.c e11) {
                throw e11;
            }
        } catch (Throwable th3) {
            if (dVar != null) {
                dVar.cleanup();
            }
            throw th3;
        }
    }

    final boolean t() {
        f i11 = i(f.INITIALIZE);
        return i11 == f.RESOURCE_CACHE || i11 == f.DATA_CACHE;
    }
}
