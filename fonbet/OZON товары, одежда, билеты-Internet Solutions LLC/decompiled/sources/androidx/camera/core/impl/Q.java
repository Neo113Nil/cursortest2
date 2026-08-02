package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes8.dex */
public final class Q {

    /* renamed from: i, reason: collision with root package name */
    public static final T.a<Integer> f38177i = T.a.a(Integer.TYPE, "camerax.core.captureConfig.rotation");

    /* renamed from: j, reason: collision with root package name */
    public static final T.a<Integer> f38178j = T.a.a(Integer.class, "camerax.core.captureConfig.jpegQuality");

    /* renamed from: k, reason: collision with root package name */
    private static final T.a<Range<Integer>> f38179k = T.a.a(Range.class, "camerax.core.captureConfig.resolvedFrameRate");

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f38180a;

    /* renamed from: b, reason: collision with root package name */
    final A0 f38181b;

    /* renamed from: c, reason: collision with root package name */
    final int f38182c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f38183d;

    /* renamed from: e, reason: collision with root package name */
    final List<AbstractC5111p> f38184e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f38185f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final X0 f38186g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC5130z f38187h;

    public interface b {
        void a(@NonNull C5098i0 c5098i0, @NonNull a aVar);
    }

    Q(ArrayList arrayList, A0 a02, int i11, boolean z11, ArrayList arrayList2, boolean z12, @NonNull X0 x02, InterfaceC5130z interfaceC5130z) {
        this.f38180a = arrayList;
        this.f38181b = a02;
        this.f38182c = i11;
        this.f38184e = Collections.unmodifiableList(arrayList2);
        this.f38185f = z12;
        this.f38186g = x02;
        this.f38187h = interfaceC5130z;
        this.f38183d = z11;
    }

    @NonNull
    public final List<AbstractC5111p> b() {
        return this.f38184e;
    }

    public final InterfaceC5130z c() {
        return this.f38187h;
    }

    @NonNull
    public final Range<Integer> d() {
        T.a<Range<Integer>> aVar = f38179k;
        Object obj = T0.f38211a;
        try {
            obj = this.f38181b.a(aVar);
        } catch (IllegalArgumentException unused) {
        }
        Range<Integer> range = (Range) obj;
        Objects.requireNonNull(range);
        return range;
    }

    public final int e() {
        Object obj = this.f38186g.f38239a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    @NonNull
    public final T f() {
        return this.f38181b;
    }

    public final int g() {
        Object obj = 0;
        try {
            obj = this.f38181b.a(b1.f38265E);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) obj;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    @NonNull
    public final List<W> h() {
        return Collections.unmodifiableList(this.f38180a);
    }

    @NonNull
    public final X0 i() {
        return this.f38186g;
    }

    public final int j() {
        return this.f38182c;
    }

    public final int k() {
        Object obj = 0;
        try {
            obj = this.f38181b.a(b1.f38266F);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) obj;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final boolean l() {
        return this.f38185f;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashSet f38188a;

        /* renamed from: b, reason: collision with root package name */
        private C5123v0 f38189b;

        /* renamed from: c, reason: collision with root package name */
        private int f38190c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f38191d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f38192e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f38193f;

        /* renamed from: g, reason: collision with root package name */
        private C5127x0 f38194g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC5130z f38195h;

        public a() {
            this.f38188a = new HashSet();
            this.f38189b = C5123v0.R();
            this.f38190c = -1;
            this.f38191d = false;
            this.f38192e = new ArrayList();
            this.f38193f = false;
            this.f38194g = new C5127x0(new ArrayMap());
        }

        @NonNull
        public static a j(@NonNull Q q11) {
            return new a(q11);
        }

        public final void a(@NonNull List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c((AbstractC5111p) it.next());
            }
        }

        public final void b(@NonNull X0 x02) {
            this.f38194g.f38239a.putAll((Map) x02.f38239a);
        }

        public final void c(@NonNull AbstractC5111p abstractC5111p) {
            ArrayList arrayList = this.f38192e;
            if (arrayList.contains(abstractC5111p)) {
                return;
            }
            arrayList.add(abstractC5111p);
        }

        public final <T> void d(@NonNull T.a<T> aVar, @NonNull T t2) {
            this.f38189b.U(aVar, t2);
        }

        public final void e(@NonNull T t2) {
            Object obj;
            for (T.a<?> aVar : t2.g()) {
                C5123v0 c5123v0 = this.f38189b;
                c5123v0.getClass();
                try {
                    obj = c5123v0.a(aVar);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Object a11 = t2.a(aVar);
                if (obj instanceof AbstractC5119t0) {
                    ((AbstractC5119t0) obj).a(((AbstractC5119t0) a11).c());
                } else {
                    if (a11 instanceof AbstractC5119t0) {
                        a11 = ((AbstractC5119t0) a11).clone();
                    }
                    this.f38189b.T(aVar, t2.h(aVar), a11);
                }
            }
        }

        public final void f(@NonNull W w11) {
            this.f38188a.add(w11);
        }

        public final void g(@NonNull Object obj, @NonNull String str) {
            this.f38194g.f38239a.put(str, obj);
        }

        @NonNull
        public final Q h() {
            ArrayList arrayList = new ArrayList(this.f38188a);
            A0 Q11 = A0.Q(this.f38189b);
            int i11 = this.f38190c;
            boolean z11 = this.f38191d;
            ArrayList arrayList2 = new ArrayList(this.f38192e);
            boolean z12 = this.f38193f;
            int i12 = X0.f38238c;
            ArrayMap arrayMap = new ArrayMap();
            C5127x0 c5127x0 = this.f38194g;
            for (String str : c5127x0.f38239a.keySet()) {
                arrayMap.put(str, c5127x0.f38239a.get(str));
            }
            return new Q(arrayList, Q11, i11, z11, arrayList2, z12, new X0(arrayMap), this.f38195h);
        }

        public final void i() {
            this.f38188a.clear();
        }

        public final Range<Integer> k() {
            C5123v0 c5123v0 = this.f38189b;
            T.a aVar = Q.f38179k;
            Object obj = T0.f38211a;
            c5123v0.getClass();
            try {
                obj = c5123v0.a(aVar);
            } catch (IllegalArgumentException unused) {
            }
            return (Range) obj;
        }

        @NonNull
        public final Set<W> l() {
            return this.f38188a;
        }

        public final int m() {
            return this.f38190c;
        }

        public final boolean n(@NonNull AbstractC5111p abstractC5111p) {
            return this.f38192e.remove(abstractC5111p);
        }

        public final void o(@NonNull InterfaceC5130z interfaceC5130z) {
            this.f38195h = interfaceC5130z;
        }

        public final void p(int i11) {
            this.f38194g.f38239a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i11));
        }

        public final void q(@NonNull T t2) {
            this.f38189b = C5123v0.S(t2);
        }

        public final void r(boolean z11) {
            this.f38191d = z11;
        }

        public final void s(int i11) {
            this.f38190c = i11;
        }

        public final void t() {
            this.f38193f = true;
        }

        private a(Q q11) {
            HashSet hashSet = new HashSet();
            this.f38188a = hashSet;
            this.f38189b = C5123v0.R();
            this.f38190c = -1;
            this.f38191d = false;
            ArrayList arrayList = new ArrayList();
            this.f38192e = arrayList;
            this.f38193f = false;
            this.f38194g = new C5127x0(new ArrayMap());
            hashSet.addAll(q11.f38180a);
            this.f38189b = C5123v0.S(q11.f38181b);
            this.f38190c = q11.f38182c;
            arrayList.addAll(q11.f38184e);
            this.f38193f = q11.l();
            X0 i11 = q11.i();
            ArrayMap arrayMap = new ArrayMap();
            for (String str : i11.f38239a.keySet()) {
                arrayMap.put(str, i11.f38239a.get(str));
            }
            this.f38194g = new C5127x0(arrayMap);
            this.f38191d = q11.f38183d;
        }
    }
}
