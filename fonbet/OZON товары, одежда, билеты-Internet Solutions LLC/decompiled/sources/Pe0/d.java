package Pe0;

import De.C2862e;
import Hj.C3143a;
import Le0.w;
import Oe0.d;
import Pe0.b;
import android.graphics.PointF;
import androidx.recyclerview.widget.LinearLayoutManager;
import ce0.InterfaceC5817a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import we0.InterfaceC10542A;
import we0.u;
import we0.z;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.C10745r0;
import xe.E0;
import xe.H0;
import xe.L0;
import xe.M;

/* loaded from: classes3.dex */
public final class d extends Pe0.b {

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C10745r0 f22333p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, u> f22334q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final Oe0.d f22335r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final we0.o<a> f22336s;

    /* renamed from: t, reason: collision with root package name */
    private B0 f22337t;

    public interface a {

        /* renamed from: Pe0.d$a$a, reason: collision with other inner class name */
        public static final class C0443a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f22338a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final z f22339b;

            public C0443a(@NotNull String placemarkId, @NotNull z displayOptions) {
                Intrinsics.checkNotNullParameter(placemarkId, "placemarkId");
                Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
                this.f22338a = placemarkId;
                this.f22339b = displayOptions;
            }

            @NotNull
            public final z a() {
                return this.f22339b;
            }

            @NotNull
            public final String b() {
                return this.f22338a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0443a)) {
                    return false;
                }
                C0443a c0443a = (C0443a) obj;
                return Intrinsics.d(this.f22338a, c0443a.f22338a) && Intrinsics.d(this.f22339b, c0443a.f22339b);
            }

            public final int hashCode() {
                return this.f22339b.hashCode() + (this.f22338a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "ChangeDisplayOptions(placemarkId=" + this.f22338a + ", displayOptions=" + this.f22339b + ")";
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final List<u> f22340a;

            /* renamed from: b, reason: collision with root package name */
            private final long f22341b;

            /* renamed from: c, reason: collision with root package name */
            private final Long f22342c;

            public b(@NotNull List<u> placemarks, long j11, Long l11) {
                Intrinsics.checkNotNullParameter(placemarks, "placemarks");
                this.f22340a = placemarks;
                this.f22341b = j11;
                this.f22342c = l11;
            }

            public final long a() {
                return this.f22341b;
            }

            public final Long b() {
                return this.f22342c;
            }

            @NotNull
            public final List<u> c() {
                return this.f22340a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.d(this.f22340a, bVar.f22340a) && this.f22341b == bVar.f22341b && Intrinsics.d(this.f22342c, bVar.f22342c);
            }

            public final int hashCode() {
                int a11 = Pk0.c.a(this.f22340a.hashCode() * 31, 31, this.f22341b);
                Long l11 = this.f22342c;
                return a11 + (l11 == null ? 0 : l11.hashCode());
            }

            @NotNull
            public final String toString() {
                return "Insert(placemarks=" + this.f22340a + ", animationDuration=" + this.f22341b + ", layerOrder=" + this.f22342c + ")";
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final ArrayList f22343a;

            /* renamed from: b, reason: collision with root package name */
            private final long f22344b;

            public c() {
                throw null;
            }

            public c(long j11, ArrayList placemarks) {
                Intrinsics.checkNotNullParameter(placemarks, "placemarks");
                this.f22343a = placemarks;
                this.f22344b = j11;
            }

            public final long a() {
                return this.f22344b;
            }

            @NotNull
            public final List<Pair<u, d.C0411d>> b() {
                return this.f22343a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.d(this.f22343a, cVar.f22343a) && this.f22344b == cVar.f22344b;
            }

            public final int hashCode() {
                return Pk0.c.a(this.f22343a.hashCode() * 31, 31, this.f22344b);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InsertWithRes(placemarks=");
                sb2.append(this.f22343a);
                sb2.append(", animationDuration=");
                return P4.f.a(this.f22344b, ", layerOrder=null)", sb2);
            }
        }

        /* renamed from: Pe0.d$a$d, reason: collision with other inner class name */
        public static final class C0444d implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final List<String> f22345a;

            /* renamed from: b, reason: collision with root package name */
            private final long f22346b;

            public C0444d(@NotNull List<String> placemarkIds, long j11) {
                Intrinsics.checkNotNullParameter(placemarkIds, "placemarkIds");
                this.f22345a = placemarkIds;
                this.f22346b = j11;
            }

            public final long a() {
                return this.f22346b;
            }

            @NotNull
            public final List<String> b() {
                return this.f22345a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0444d)) {
                    return false;
                }
                C0444d c0444d = (C0444d) obj;
                return Intrinsics.d(this.f22345a, c0444d.f22345a) && this.f22346b == c0444d.f22346b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f22346b) + (this.f22345a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "Remove(placemarkIds=" + this.f22345a + ", animationDuration=" + this.f22346b + ")";
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.customSymbol.LibreCustomSymbolAsyncPlacemarkController$fadeSymbols$2", f = "LibreCustomSymbolAsyncPlacemarkController.kt", l = {315, 341, 343}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        ArrayList f22347d;

        /* renamed from: e, reason: collision with root package name */
        long f22348e;

        /* renamed from: f, reason: collision with root package name */
        long f22349f;

        /* renamed from: g, reason: collision with root package name */
        int f22350g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f22351h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f22352i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f22353j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f22354k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f22355l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f22356m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ r f22357n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<n> list, long j11, Function2<? super List<n>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, float f7, float f11, r rVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f22352i = list;
            this.f22353j = j11;
            this.f22354k = (kotlin.coroutines.jvm.internal.j) function2;
            this.f22355l = f7;
            this.f22356m = f11;
            this.f22357n = rVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f22352i, this.f22353j, this.f22354k, this.f22355l, this.f22356m, this.f22357n, dVar);
            bVar.f22351h = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
        
            if (r3.invoke(r2, r30) != r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0101, code lost:
        
            if (r3.invoke(r7, r30) == r1) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e5 -> B:13:0x00e6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            M m11;
            ArrayList arrayList;
            long j11;
            long nanoTime;
            float f7;
            r rVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f22350g;
            ?? r32 = this.f22354k;
            if (i11 == 0) {
                Sc.s.b(obj);
                M m12 = (M) this.f22351h;
                ?? r72 = this.f22352i;
                if (!r72.isEmpty()) {
                    long j12 = this.f22353j;
                    if (j12 > 0) {
                        m11 = m12;
                        arrayList = r72;
                        j11 = j12 * 1000000;
                        nanoTime = System.nanoTime();
                        if (E0.i(m11.getCoroutineContext())) {
                        }
                        this.f22351h = null;
                        this.f22347d = null;
                        this.f22350g = 3;
                    }
                }
                this.f22350g = 1;
            } else if (i11 == 1) {
                Sc.s.b(obj);
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                j11 = this.f22349f;
                nanoTime = this.f22348e;
                arrayList = this.f22347d;
                m11 = (M) this.f22351h;
                Sc.s.b(obj);
                char c11 = 2;
                if (E0.i(m11.getCoroutineContext())) {
                    float f11 = 1.0f;
                    float d11 = kotlin.ranges.h.d((System.nanoTime() - nanoTime) / j11, 0.0f, 1.0f);
                    float f12 = this.f22356m;
                    float f13 = this.f22355l;
                    float d12 = C3143a.d(f12, f13, d11, f13);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        f7 = f11;
                        rVar = this.f22357n;
                        if (!hasNext) {
                            break;
                        }
                        n nVar = (n) it.next();
                        n a11 = rVar.k(nVar.e()) != null ? n.a(nVar, null, null, null, d12, null, null, 0.0f, 0.0f, 0.0f, false, 2031) : null;
                        if (a11 != null) {
                            arrayList2.add(a11);
                        }
                        f11 = f7;
                    }
                    rVar.r(arrayList2);
                    if (d11 < f7) {
                        this.f22351h = m11;
                        this.f22347d = arrayList2;
                        this.f22348e = nanoTime;
                        this.f22349f = j11;
                        c11 = 2;
                        this.f22350g = 2;
                        if (ye.j.c(this) != aVar) {
                            arrayList = arrayList2;
                            if (E0.i(m11.getCoroutineContext())) {
                            }
                        }
                        return aVar;
                    }
                    arrayList = arrayList2;
                }
                this.f22351h = null;
                this.f22347d = null;
                this.f22350g = 3;
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w mapView, MapLibreMap mapLibreMap, Pe0.a draggableSymbolController, InterfaceC5817a cameraController, C2862e coroutineScope, boolean z11, boolean z12, boolean z13, xe0.j pinSelectSynchronizer) {
        super(mapView, mapLibreMap, draggableSymbolController, cameraController, coroutineScope, z11, pinSelectSynchronizer);
        Oe0.d hVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        C10745r0 actionRenderCoroutineDispatcher = new C10745r0(newSingleThreadExecutor);
        Intrinsics.checkNotNullParameter(mapView, "map");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(draggableSymbolController, "draggableSymbolController");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
        Intrinsics.checkNotNullParameter(actionRenderCoroutineDispatcher, "actionRenderCoroutineDispatcher");
        this.f22333p = actionRenderCoroutineDispatcher;
        this.f22334q = new ConcurrentHashMap<>();
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
        if (z12) {
            Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
            Intrinsics.checkNotNullParameter(mapView, "mapView");
            Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
            hVar = new Oe0.b(true, mapLibreMap, mapView, pinSelectSynchronizer, true);
        } else {
            hVar = new Oe0.h(mapLibreMap, mapView, pinSelectSynchronizer, true);
        }
        this.f22335r = hVar;
        this.f22336s = new we0.o<>(10000);
        super.J(z13);
        this.f22337t = C10727i.c(q(), null, null, new i(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x016f, code lost:
    
        if (r0 == r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x016f -> B:12:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x00c9 -> B:57:0x012f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x00d5 -> B:57:0x012f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0101 -> B:51:0x0106). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(d dVar, List list, long j11, kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        d dVar2;
        int i11;
        HashMap hashMap;
        Iterator it;
        long j12;
        d dVar3;
        HashMap hashMap2;
        String str;
        b.c cVar2;
        Object T11;
        HashMap hashMap3;
        Iterator it2;
        Object next;
        dVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i12 = jVar.f22392k;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f22392k = i12 - LinearLayoutManager.INVALID_OFFSET;
                dVar2 = dVar;
                Object obj = jVar.f22390i;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar.f22392k;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    hashMap = new HashMap(list.size());
                    it = list.iterator();
                    j12 = j11;
                    dVar3 = dVar2;
                    if (!it.hasNext()) {
                    }
                } else if (i11 == 1) {
                    long j13 = jVar.f22389h;
                    str = (String) jVar.f22388g;
                    it = jVar.f22387f;
                    hashMap2 = jVar.f22386e;
                    d dVar4 = jVar.f22385d;
                    Sc.s.b(obj);
                    dVar3 = dVar4;
                    j12 = j13;
                    if (!((Boolean) obj).booleanValue()) {
                        dVar3.f22334q.remove(str);
                        dVar3.I().remove(str);
                        Long l11 = new Long(cVar2.b());
                        jVar.f22385d = dVar3;
                        jVar.f22386e = hashMap2;
                        jVar.f22387f = it;
                        jVar.f22388g = cVar2;
                        jVar.f22389h = j12;
                        jVar.f22392k = 2;
                        T11 = dVar3.T(l11, jVar);
                        if (T11 != aVar) {
                        }
                        return aVar;
                    }
                    hashMap = hashMap2;
                    if (!it.hasNext()) {
                    }
                } else if (i11 == 2) {
                    long j14 = jVar.f22389h;
                    b.c cVar3 = (b.c) jVar.f22388g;
                    it = jVar.f22387f;
                    hashMap2 = jVar.f22386e;
                    d dVar5 = jVar.f22385d;
                    Sc.s.b(obj);
                    dVar3 = dVar5;
                    j12 = j14;
                    n k11 = ((r) obj).k(cVar3.a());
                    if (k11 != null) {
                        Long l12 = new Long(cVar3.b());
                        Object obj2 = hashMap2.get(l12);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            hashMap2.put(l12, obj2);
                        }
                        ((ArrayList) obj2).add(k11);
                    }
                    hashMap = hashMap2;
                    if (!it.hasNext()) {
                        String str2 = (String) it.next();
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        L0 x11 = De.s.f6650a.x();
                        l lVar = new l(dVar3, str2, j12, null);
                        jVar.f22385d = dVar3;
                        jVar.f22386e = hashMap;
                        jVar.f22387f = it;
                        jVar.f22388g = str2;
                        jVar.f22389h = j12;
                        jVar.f22392k = 1;
                        Object f7 = C10727i.f(x11, lVar, jVar);
                        if (f7 != aVar) {
                            hashMap2 = hashMap;
                            obj = f7;
                            str = str2;
                            if (!((Boolean) obj).booleanValue() && (cVar2 = dVar3.I().get(str)) != null) {
                                dVar3.f22334q.remove(str);
                                dVar3.I().remove(str);
                                Long l112 = new Long(cVar2.b());
                                jVar.f22385d = dVar3;
                                jVar.f22386e = hashMap2;
                                jVar.f22387f = it;
                                jVar.f22388g = cVar2;
                                jVar.f22389h = j12;
                                jVar.f22392k = 2;
                                T11 = dVar3.T(l112, jVar);
                                if (T11 != aVar) {
                                    cVar3 = cVar2;
                                    obj = T11;
                                    n k112 = ((r) obj).k(cVar3.a());
                                    if (k112 != null) {
                                    }
                                }
                            }
                            hashMap = hashMap2;
                            if (!it.hasNext()) {
                                hashMap3 = hashMap;
                                it2 = hashMap.entrySet().iterator();
                                r6 = j12;
                                if (it2.hasNext()) {
                                }
                            }
                        }
                        return aVar;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j15 = jVar.f22389h;
                    ArrayList arrayList = (ArrayList) jVar.f22388g;
                    it2 = jVar.f22387f;
                    hashMap3 = jVar.f22386e;
                    dVar3 = jVar.f22385d;
                    Sc.s.b(obj);
                    HashMap hashMap4 = hashMap3;
                    ArrayList<n> arrayList2 = arrayList;
                    j12 = j15;
                    d dVar6 = dVar3;
                    r rVar = (r) obj;
                    if (j12 == 0 || hashMap4.isEmpty()) {
                        for (n nVar : arrayList2) {
                            dVar6.f22335r.l(nVar.c());
                            dVar6.F().f(nVar);
                        }
                        rVar.n(arrayList2);
                    } else {
                        Iterator it3 = arrayList2.iterator();
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (it3.hasNext()) {
                                float d11 = ((n) next).d();
                                do {
                                    Object next2 = it3.next();
                                    float d12 = ((n) next2).d();
                                    if (Float.compare(d11, d12) < 0) {
                                        next = next2;
                                        d11 = d12;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        n nVar2 = (n) next;
                        dVar6.R(rVar, arrayList2, nVar2 != null ? nVar2.d() : 1.0f, 0.0f, j12, new k(rVar, dVar6, null));
                    }
                    hashMap3 = hashMap4;
                    dVar3 = dVar6;
                    j15 = j12;
                    if (it2.hasNext()) {
                        return Unit.f71690a;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    long longValue = ((Number) entry.getKey()).longValue();
                    arrayList = (ArrayList) entry.getValue();
                    Long l13 = new Long(longValue);
                    jVar.f22385d = dVar3;
                    jVar.f22386e = hashMap3;
                    jVar.f22387f = it2;
                    jVar.f22388g = arrayList;
                    jVar.f22389h = j15;
                    jVar.f22392k = 3;
                    obj = dVar3.T(l13, jVar);
                }
            }
        }
        dVar2 = dVar;
        jVar = new j(dVar2, cVar);
        Object obj3 = jVar.f22390i;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar.f22392k;
        if (i11 != 0) {
        }
    }

    private final void R(r rVar, List<n> list, float f7, float f11, long j11, Function2<? super List<n>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        C10727i.c(q(), this.f22333p, null, new b(list, j11, function2, f7, f11, rVar, null), 2);
    }

    private final Object T(Long l11, kotlin.coroutines.jvm.internal.c cVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(De.s.f6650a.x(), new f(this, l11, null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04a0 A[LOOP:3: B:66:0x049a->B:68:0x04a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x018a -> B:75:0x019a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x01b6 -> B:76:0x01be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x03bc -> B:13:0x004a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0365 -> B:67:0x0368). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(List list, long j11, long j12, boolean z11, kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        d dVar;
        int i11;
        boolean z12;
        HashMap hashMap;
        g gVar2;
        d dVar2;
        HashMap hashMap2;
        Iterator it;
        long j13;
        long j14;
        long j15;
        Wc.a aVar;
        d dVar3;
        Iterator it2;
        d.C0411d resourceBitmap;
        long j16;
        Wc.a aVar2;
        b.c cVar2;
        n nVar;
        u placemark;
        long j17;
        d dVar4;
        long j18;
        boolean z13;
        HashMap hashMap3;
        Iterator it3;
        HashMap hashMap4;
        u uVar;
        b.c cVar3;
        long j19;
        boolean z14;
        long j21;
        long j22;
        Iterator it4;
        Object next;
        Float c11;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f22373q;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f22373q = i12 - LinearLayoutManager.INVALID_OFFSET;
                dVar = this;
                Object obj = gVar.f22371o;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = gVar.f22373q;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    z12 = z11;
                    hashMap = new HashMap(list.size());
                    gVar2 = gVar;
                    dVar2 = dVar;
                    hashMap2 = new HashMap(list.size());
                    it = list.iterator();
                    j13 = j11;
                    j14 = j12;
                } else if (i11 == 1) {
                    boolean z15 = gVar.f22370n;
                    long j23 = gVar.f22368l;
                    long j24 = gVar.f22367k;
                    it = (Iterator) gVar.f22363g;
                    hashMap2 = (HashMap) gVar.f22362f;
                    HashMap hashMap5 = (HashMap) gVar.f22361e;
                    d dVar5 = gVar.f22360d;
                    Sc.s.b(obj);
                    gVar2 = gVar;
                    j13 = j24;
                    z12 = z15;
                    j14 = j23;
                    hashMap = hashMap5;
                    dVar2 = dVar5;
                } else if (i11 == 2) {
                    z13 = gVar.f22370n;
                    long j25 = gVar.f22368l;
                    j16 = gVar.f22367k;
                    cVar3 = gVar.f22366j;
                    resourceBitmap = gVar.f22365i;
                    uVar = gVar.f22364h;
                    it3 = (Iterator) gVar.f22363g;
                    hashMap4 = (HashMap) gVar.f22362f;
                    hashMap3 = (HashMap) gVar.f22361e;
                    dVar4 = gVar.f22360d;
                    Sc.s.b(obj);
                    aVar2 = aVar3;
                    j18 = j25;
                    long j26 = j18;
                    nVar = ((r) obj).k(cVar3.a());
                    cVar2 = cVar3;
                    dVar2 = dVar4;
                    j17 = j16;
                    placemark = uVar;
                    hashMap2 = hashMap4;
                    gVar2 = gVar;
                    it = it3;
                    hashMap = hashMap3;
                    z12 = z13;
                    j14 = j26;
                    if (z12) {
                        j19 = j17;
                        dVar2.f22334q.put(placemark.e(), placemark);
                    } else {
                        j19 = j17;
                    }
                    if (nVar != null) {
                        z14 = z12;
                        Long l11 = new Long(cVar2.b());
                        Object obj2 = hashMap.get(l11);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            hashMap.put(l11, obj2);
                        }
                        ArrayList arrayList = (ArrayList) obj2;
                        dVar2.getClass();
                        Intrinsics.checkNotNullParameter(nVar, "<this>");
                        Intrinsics.checkNotNullParameter(placemark, "placemark");
                        Intrinsics.checkNotNullParameter(resourceBitmap, "resourceBitmap");
                        LatLng f7 = placemark.f();
                        float f11 = placemark.d().h() ? 1.0f : 0.0f;
                        float b11 = placemark.d().b();
                        float c12 = placemark.d().c();
                        float f12 = placemark.d().f();
                        String d11 = resourceBitmap.d();
                        String a11 = d.C0411d.a(placemark.d().e());
                        PointF contentAnchor = placemark.d().e();
                        Intrinsics.checkNotNullParameter(contentAnchor, "contentAnchor");
                        Float[] c13 = resourceBitmap.c(contentAnchor);
                        arrayList.add(n.a(nVar, f7, d11, placemark.e(), f11, new PointF(c13[0].floatValue(), c13[1].floatValue()), a11, c12, b11, f12, false, 1));
                    } else {
                        z14 = z12;
                        Long l12 = new Long(j14);
                        Object obj3 = hashMap2.get(l12);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            hashMap2.put(l12, obj3);
                        }
                        ArrayList arrayList2 = (ArrayList) obj3;
                        dVar2.getClass();
                        Intrinsics.checkNotNullParameter(placemark, "<this>");
                        Intrinsics.checkNotNullParameter(resourceBitmap, "resourceBitmap");
                        Float[] c14 = resourceBitmap.c(placemark.d().e());
                        arrayList2.add(new s(placemark.f(), placemark.e(), resourceBitmap.d(), Float.valueOf(placemark.d().h() ? 1.0f : 0.0f), new PointF(c14[0].floatValue(), c14[1].floatValue()), d.C0411d.a(placemark.d().e()), Float.valueOf(placemark.d().c()), Float.valueOf(placemark.d().b()), Float.valueOf(placemark.d().f()), Boolean.FALSE));
                    }
                    j13 = j19;
                    z12 = z14;
                    aVar3 = aVar2;
                } else if (i11 == 3) {
                    j14 = gVar.f22368l;
                    long j27 = gVar.f22367k;
                    ArrayList arrayList3 = (ArrayList) gVar.f22363g;
                    Iterator it5 = (Iterator) gVar.f22362f;
                    HashMap hashMap6 = (HashMap) gVar.f22361e;
                    dVar3 = gVar.f22360d;
                    Sc.s.b(obj);
                    ArrayList arrayList4 = arrayList3;
                    long j28 = j27;
                    hashMap2 = hashMap6;
                    aVar = aVar3;
                    ((r) obj).r(arrayList4);
                    it2 = it5;
                    j15 = j28;
                    if (!it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        long longValue = ((Number) entry.getKey()).longValue();
                        arrayList4 = (ArrayList) entry.getValue();
                        Long l13 = new Long(longValue);
                        gVar.f22360d = dVar3;
                        gVar.f22361e = hashMap2;
                        gVar.f22362f = it2;
                        gVar.f22363g = arrayList4;
                        gVar.f22364h = null;
                        gVar.f22365i = null;
                        gVar.f22366j = null;
                        gVar.f22367k = j15;
                        gVar.f22368l = j14;
                        gVar.f22373q = 3;
                        Object T11 = dVar3.T(l13, gVar);
                        if (T11 == aVar) {
                            return aVar;
                        }
                        j28 = j15;
                        it5 = it2;
                        obj = T11;
                        ((r) obj).r(arrayList4);
                        it2 = it5;
                        j15 = j28;
                        if (!it2.hasNext()) {
                            long j29 = j15;
                            j21 = j14;
                            j22 = j29;
                            it4 = hashMap2.entrySet().iterator();
                            if (it4.hasNext()) {
                            }
                        }
                    }
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j31 = gVar.f22369m;
                    j21 = gVar.f22368l;
                    j22 = gVar.f22367k;
                    ArrayList arrayList5 = (ArrayList) gVar.f22362f;
                    it4 = (Iterator) gVar.f22361e;
                    dVar3 = gVar.f22360d;
                    Sc.s.b(obj);
                    aVar = aVar3;
                    long longValue2 = j31;
                    long j32 = j22;
                    d dVar6 = dVar3;
                    r rVar = (r) obj;
                    if (j32 != 0 || arrayList5.isEmpty()) {
                        for (n nVar2 : rVar.f(arrayList5)) {
                            dVar6.I().put(Pe0.b.G(nVar2), new b.c(nVar2.e(), longValue2));
                        }
                    } else {
                        Iterator it6 = arrayList5.iterator();
                        if (it6.hasNext()) {
                            next = it6.next();
                            if (it6.hasNext()) {
                                Float c15 = ((s) next).c();
                                float floatValue = c15 != null ? c15.floatValue() : 0.0f;
                                do {
                                    Object next2 = it6.next();
                                    Float c16 = ((s) next2).c();
                                    float floatValue2 = c16 != null ? c16.floatValue() : 0.0f;
                                    if (Float.compare(floatValue, floatValue2) < 0) {
                                        next = next2;
                                        floatValue = floatValue2;
                                    }
                                } while (it6.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        s sVar = (s) next;
                        if (sVar == null || (c11 = sVar.c()) == null) {
                            return Unit.f71690a;
                        }
                        float floatValue3 = c11.floatValue();
                        ArrayList arrayList6 = new ArrayList(C7714v.z(arrayList5, 10));
                        Iterator it7 = arrayList5.iterator();
                        while (it7.hasNext()) {
                            arrayList6.add(s.b((s) it7.next(), new Float(0.0f)));
                        }
                        List<n> f13 = rVar.f(arrayList6);
                        for (n nVar3 : f13) {
                            dVar6.I().put(Pe0.b.G(nVar3), new b.c(nVar3.e(), j21));
                        }
                        dVar6.R(rVar, f13, 0.0f, floatValue3, j32, new e(2, null));
                    }
                    dVar3 = dVar6;
                    j22 = j32;
                    if (it4.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it4.next();
                        longValue2 = ((Number) entry2.getKey()).longValue();
                        arrayList5 = (ArrayList) entry2.getValue();
                        Long l14 = new Long(longValue2);
                        gVar.f22360d = dVar3;
                        gVar.f22361e = it4;
                        gVar.f22362f = arrayList5;
                        gVar.f22363g = null;
                        gVar.f22364h = null;
                        gVar.f22365i = null;
                        gVar.f22366j = null;
                        gVar.f22367k = j22;
                        gVar.f22368l = j21;
                        gVar.f22369m = longValue2;
                        gVar.f22373q = 4;
                        obj = dVar3.T(l14, gVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        long j322 = j22;
                        d dVar62 = dVar3;
                        r rVar2 = (r) obj;
                        if (j322 != 0) {
                        }
                        while (r0.hasNext()) {
                        }
                        dVar3 = dVar62;
                        j22 = j322;
                        if (it4.hasNext()) {
                            return Unit.f71690a;
                        }
                    }
                }
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    u uVar2 = (u) pair.a();
                    resourceBitmap = (d.C0411d) pair.b();
                    if (uVar2.d().d() instanceof InterfaceC10542A.a) {
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        L0 x11 = De.s.f6650a.x();
                        long j33 = j13;
                        d dVar7 = dVar2;
                        h hVar = new h(dVar7, uVar2, j33, null);
                        gVar2.f22360d = dVar7;
                        gVar2.f22361e = hashMap;
                        gVar2.f22362f = hashMap2;
                        gVar2.f22363g = it;
                        gVar2.f22364h = null;
                        gVar2.f22365i = null;
                        gVar2.f22366j = null;
                        gVar2.f22367k = j33;
                        gVar2.f22368l = j14;
                        gVar2.f22370n = z12;
                        gVar2.f22373q = 1;
                        if (C10727i.f(x11, hVar, gVar2) == aVar3) {
                            return aVar3;
                        }
                        dVar2 = dVar7;
                        j13 = j33;
                    } else {
                        j16 = j13;
                        d dVar8 = dVar2;
                        b.c cVar4 = dVar8.I().get(uVar2.e());
                        aVar2 = aVar3;
                        if (cVar4 != null) {
                            Long l15 = new Long(cVar4.b());
                            gVar2.f22360d = dVar8;
                            gVar2.f22361e = hashMap;
                            gVar2.f22362f = hashMap2;
                            gVar2.f22363g = it;
                            gVar2.f22364h = uVar2;
                            gVar2.f22365i = resourceBitmap;
                            gVar2.f22366j = cVar4;
                            gVar2.f22367k = j16;
                            gVar2.f22368l = j14;
                            gVar2.f22370n = z12;
                            gVar2.f22373q = 2;
                            Object T12 = dVar8.T(l15, gVar2);
                            aVar2 = aVar2;
                            if (T12 == aVar2) {
                                return aVar2;
                            }
                            HashMap hashMap7 = hashMap2;
                            dVar4 = dVar8;
                            obj = T12;
                            j18 = j14;
                            z13 = z12;
                            hashMap3 = hashMap;
                            it3 = it;
                            hashMap4 = hashMap7;
                            g gVar3 = gVar2;
                            uVar = uVar2;
                            gVar = gVar3;
                            cVar3 = cVar4;
                            long j262 = j18;
                            nVar = ((r) obj).k(cVar3.a());
                            cVar2 = cVar3;
                            dVar2 = dVar4;
                            j17 = j16;
                            placemark = uVar;
                            hashMap2 = hashMap4;
                            gVar2 = gVar;
                            it = it3;
                            hashMap = hashMap3;
                            z12 = z13;
                            j14 = j262;
                            if (z12) {
                            }
                            if (nVar != null) {
                            }
                            j13 = j19;
                            z12 = z14;
                            aVar3 = aVar2;
                            while (it.hasNext()) {
                            }
                        } else {
                            cVar2 = cVar4;
                            nVar = null;
                            dVar2 = dVar8;
                            placemark = uVar2;
                            j17 = j16;
                            if (z12) {
                            }
                            if (nVar != null) {
                            }
                            j13 = j19;
                            z12 = z14;
                            aVar3 = aVar2;
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                j15 = j13;
                aVar = aVar3;
                dVar3 = dVar2;
                it2 = hashMap.entrySet().iterator();
                gVar = gVar2;
                if (!it2.hasNext()) {
                }
            }
        }
        dVar = this;
        gVar = new g(dVar, cVar);
        Object obj4 = gVar.f22371o;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar.f22373q;
        if (i11 != 0) {
        }
        while (it.hasNext()) {
        }
        j15 = j13;
        aVar = aVar32;
        dVar3 = dVar2;
        it2 = hashMap.entrySet().iterator();
        gVar = gVar2;
        if (!it2.hasNext()) {
        }
    }

    static /* synthetic */ Object V(d dVar, List list, long j11, long j12, kotlin.coroutines.d dVar2, int i11) {
        if ((i11 & 4) != 0) {
            j12 = 10;
        }
        return dVar.U(list, j11, j12, (i11 & 8) != 0, (kotlin.coroutines.jvm.internal.c) dVar2);
    }

    @NotNull
    protected final ConcurrentHashMap<String, u> S() {
        return this.f22334q;
    }

    @Override // xe0.InterfaceC10766e
    public final void b(long j11, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f22334q.remove(id2);
        this.f22336s.b(new a.C0444d(C7714v.a0(id2), j11));
    }

    @Override // xe0.InterfaceC10766e
    public final void c(long j11, @NotNull List placemarks) {
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        List<u> U02 = C7714v.U0(placemarks);
        for (u uVar : U02) {
            this.f22334q.put(uVar.e(), uVar);
        }
        this.f22336s.b(new a.b(U02, j11, null));
    }

    @Override // xe0.AbstractC10765d, xe0.InterfaceC10766e
    public final void d(long j11) {
        ConcurrentHashMap<String, u> concurrentHashMap = this.f22334q;
        Set<String> keySet = concurrentHashMap.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        List U02 = C7714v.U0(keySet);
        concurrentHashMap.clear();
        this.f22336s.b(new a.C0444d(U02, j11));
    }

    @Override // xe0.AbstractC10765d, xe0.InterfaceC10766e
    public final void g(long j11, @NotNull List placemarks, long j12) {
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        List<u> U02 = C7714v.U0(placemarks);
        for (u uVar : U02) {
            this.f22334q.put(uVar.e(), uVar);
        }
        this.f22336s.b(new a.b(U02, j11, Long.valueOf(j12)));
    }

    @Override // Ne0.f
    @NotNull
    public final Oe0.d i() {
        return this.f22335r;
    }

    @Override // xe0.InterfaceC10766e
    public final void j(long j11, @NotNull List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        List U02 = C7714v.U0(ids);
        Iterator it = U02.iterator();
        while (it.hasNext()) {
            this.f22334q.remove((String) it.next());
        }
        this.f22336s.b(new a.C0444d(U02, j11));
    }

    @Override // xe0.InterfaceC10766e
    public final void m(@NotNull u placemark, long j11) {
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        this.f22334q.put(placemark.e(), placemark);
        this.f22336s.b(new a.b(C7714v.a0(placemark), j11, null));
    }

    @Override // Ne0.f
    public final void o(long j11, @NotNull ArrayList placemarks) {
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        Iterator it = placemarks.iterator();
        while (it.hasNext()) {
            u uVar = (u) ((Pair) it.next()).a();
            this.f22334q.put(uVar.e(), uVar);
        }
        this.f22336s.b(new a.c(j11, placemarks));
    }

    @Override // xe0.AbstractC10765d
    public final void s(@NotNull String id2, @NotNull z displayOptions) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        this.f22336s.b(new a.C0443a(id2, displayOptions));
    }

    @Override // Pe0.b, Ne0.b, xe0.AbstractC10765d
    public final void t() {
        B0 b02 = this.f22337t;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        C10745r0 c10745r0 = this.f22333p;
        C10745r0 c10745r02 = c10745r0 != null ? c10745r0 : null;
        if (c10745r02 != null) {
            c10745r02.close();
        }
        super.t();
    }

    @Override // Ne0.b
    public final Map w() {
        return this.f22334q;
    }
}
