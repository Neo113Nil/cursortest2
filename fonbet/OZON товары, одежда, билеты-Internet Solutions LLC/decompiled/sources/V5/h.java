package V5;

import V5.l;
import Z5.p;
import com.bumptech.glide.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class h<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f28138a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f28139b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.f f28140c;

    /* renamed from: d, reason: collision with root package name */
    private Object f28141d;

    /* renamed from: e, reason: collision with root package name */
    private int f28142e;

    /* renamed from: f, reason: collision with root package name */
    private int f28143f;

    /* renamed from: g, reason: collision with root package name */
    private Class<?> f28144g;

    /* renamed from: h, reason: collision with root package name */
    private l.c f28145h;

    /* renamed from: i, reason: collision with root package name */
    private T5.i f28146i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Class<?>, T5.m<?>> f28147j;

    /* renamed from: k, reason: collision with root package name */
    private Class<Transcode> f28148k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f28149l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f28150m;

    /* renamed from: n, reason: collision with root package name */
    private T5.f f28151n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.i f28152o;

    /* renamed from: p, reason: collision with root package name */
    private k f28153p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28154q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f28155r;

    h() {
    }

    final void a() {
        this.f28140c = null;
        this.f28141d = null;
        this.f28151n = null;
        this.f28144g = null;
        this.f28148k = null;
        this.f28146i = null;
        this.f28152o = null;
        this.f28147j = null;
        this.f28153p = null;
        this.f28138a.clear();
        this.f28149l = false;
        this.f28139b.clear();
        this.f28150m = false;
    }

    final W5.b b() {
        return this.f28140c.b();
    }

    final ArrayList c() {
        boolean z11 = this.f28150m;
        ArrayList arrayList = this.f28139b;
        if (!z11) {
            this.f28150m = true;
            arrayList.clear();
            ArrayList g10 = g();
            int size = g10.size();
            for (int i11 = 0; i11 < size; i11++) {
                p.a aVar = (p.a) g10.get(i11);
                if (!arrayList.contains(aVar.f35542a)) {
                    arrayList.add(aVar.f35542a);
                }
                int i12 = 0;
                while (true) {
                    List<T5.f> list = aVar.f35543b;
                    if (i12 < list.size()) {
                        if (!arrayList.contains(list.get(i12))) {
                            arrayList.add(list.get(i12));
                        }
                        i12++;
                    }
                }
            }
        }
        return arrayList;
    }

    final X5.a d() {
        return this.f28145h.a();
    }

    final k e() {
        return this.f28153p;
    }

    final int f() {
        return this.f28143f;
    }

    final ArrayList g() {
        boolean z11 = this.f28149l;
        ArrayList arrayList = this.f28138a;
        if (!z11) {
            this.f28149l = true;
            arrayList.clear();
            List g10 = this.f28140c.i().g(this.f28141d);
            int size = g10.size();
            for (int i11 = 0; i11 < size; i11++) {
                p.a buildLoadData = ((Z5.p) g10.get(i11)).buildLoadData(this.f28141d, this.f28142e, this.f28143f, this.f28146i);
                if (buildLoadData != null) {
                    arrayList.add(buildLoadData);
                }
            }
        }
        return arrayList;
    }

    final <Data> t<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f28140c.i().f(cls, this.f28144g, this.f28148k);
    }

    final Class<?> i() {
        return this.f28141d.getClass();
    }

    final List<Z5.p<File, ?>> j(File file) throws j.c {
        return this.f28140c.i().g(file);
    }

    final T5.i k() {
        return this.f28146i;
    }

    final com.bumptech.glide.i l() {
        return this.f28152o;
    }

    final List<Class<?>> m() {
        return this.f28140c.i().h(this.f28141d.getClass(), this.f28144g, this.f28148k);
    }

    final <Z> T5.l<Z> n(v<Z> vVar) {
        return this.f28140c.i().i(vVar);
    }

    final <T> com.bumptech.glide.load.data.e<T> o(T t2) {
        return this.f28140c.i().j(t2);
    }

    final T5.f p() {
        return this.f28151n;
    }

    final <X> T5.d<X> q(X x11) throws j.e {
        return this.f28140c.i().k(x11);
    }

    final Class<?> r() {
        return this.f28148k;
    }

    final <Z> T5.m<Z> s(Class<Z> cls) {
        T5.m<Z> mVar = (T5.m) this.f28147j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, T5.m<?>>> it = this.f28147j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, T5.m<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    mVar = (T5.m) next.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f28147j.isEmpty() || !this.f28154q) {
            return b6.j.a();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    final int t() {
        return this.f28142e;
    }

    final void u(com.bumptech.glide.f fVar, Object obj, T5.f fVar2, int i11, int i12, k kVar, Class cls, Class cls2, com.bumptech.glide.i iVar, T5.i iVar2, Map map, boolean z11, boolean z12, l.c cVar) {
        this.f28140c = fVar;
        this.f28141d = obj;
        this.f28151n = fVar2;
        this.f28142e = i11;
        this.f28143f = i12;
        this.f28153p = kVar;
        this.f28144g = cls;
        this.f28145h = cVar;
        this.f28148k = cls2;
        this.f28152o = iVar;
        this.f28146i = iVar2;
        this.f28147j = map;
        this.f28154q = z11;
        this.f28155r = z12;
    }

    final boolean v(v<?> vVar) {
        return this.f28140c.i().l(vVar);
    }

    final boolean w() {
        return this.f28155r;
    }
}
