package S0;

import Ae.C2399j;
import Sc.r;
import a1.C4912a;
import android.util.Log;
import c1.AbstractC5715f;
import c1.AbstractC5716g;
import c1.C5710a;
import c1.C5711b;
import c1.C5721l;
import c1.InterfaceC5704H;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.C10737n;
import xe.C10740o0;
import xe.InterfaceC10733l;

/* loaded from: classes.dex */
public final class L0 extends AbstractC3984t {

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private static final Ae.x0<V0.e<c>> f25240w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private static final AtomicReference<Boolean> f25241x;

    /* renamed from: a, reason: collision with root package name */
    private long f25242a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3957g f25243b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f25244c;

    /* renamed from: d, reason: collision with root package name */
    private xe.B0 f25245d;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f25246e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList f25247f;

    /* renamed from: g, reason: collision with root package name */
    private Object f25248g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private androidx.collection.M<Object> f25249h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final U0.b<G> f25250i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ArrayList f25251j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ArrayList f25252k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f25253l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f25254m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f25255n;

    /* renamed from: o, reason: collision with root package name */
    private LinkedHashSet f25256o;

    /* renamed from: p, reason: collision with root package name */
    private C10737n f25257p;

    /* renamed from: q, reason: collision with root package name */
    private b f25258q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f25259r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final Ae.x0<d> f25260s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final xe.D0 f25261t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f25262u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final c f25263v;

    public static final class a {
    }

    /* loaded from: classes8.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Exception f25264a;

        public b(@NotNull Exception exc) {
            this.f25264a = exc;
        }

        @NotNull
        public final Exception a() {
            return this.f25264a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d Idle;
        public static final d Inactive;
        public static final d InactivePendingWork;
        public static final d PendingWork;
        public static final d ShutDown;
        public static final d ShuttingDown;

        static {
            d dVar = new d("ShutDown", 0);
            ShutDown = dVar;
            d dVar2 = new d("ShuttingDown", 1);
            ShuttingDown = dVar2;
            d dVar3 = new d("Inactive", 2);
            Inactive = dVar3;
            d dVar4 = new d("InactivePendingWork", 3);
            InactivePendingWork = dVar4;
            d dVar5 = new d("Idle", 4);
            Idle = dVar5;
            d dVar6 = new d("PendingWork", 5);
            PendingWork = dVar6;
            $VALUES = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        }

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    static final class e extends AbstractC7737t implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            InterfaceC10733l U10;
            Object obj = L0.this.f25244c;
            L0 l02 = L0.this;
            synchronized (obj) {
                U10 = l02.U();
                if (((d) l02.f25260s.getValue()).compareTo(d.ShuttingDown) <= 0) {
                    throw C10740o0.a("Recomposer shutdown; frame clock awaiter will never resume", l02.f25246e);
                }
            }
            if (U10 != null) {
                r.Companion companion = Sc.r.INSTANCE;
                ((C10737n) U10).resumeWith(Unit.f71690a);
            }
            return Unit.f71690a;
        }
    }

    static final class f extends AbstractC7737t implements Function1<Throwable, Unit> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Throwable th3 = th2;
            CancellationException a11 = C10740o0.a("Recomposer effect job completed", th3);
            Object obj = L0.this.f25244c;
            L0 l02 = L0.this;
            synchronized (obj) {
                try {
                    xe.B0 b02 = l02.f25245d;
                    if (b02 != null) {
                        l02.f25260s.setValue(d.ShuttingDown);
                        b02.j(a11);
                        l02.f25257p = null;
                        b02.y(new M0(l02, th3));
                    } else {
                        l02.f25246e = a11;
                        l02.f25260s.setValue(d.ShutDown);
                        Unit unit = Unit.f71690a;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<d, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f25267d;

        g() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            g gVar = new g(2, dVar);
            gVar.f25267d = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(d dVar, kotlin.coroutines.d<? super Boolean> dVar2) {
            return ((g) create(dVar, dVar2)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            return Boolean.valueOf(((d) this.f25267d) == d.ShutDown);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {574, 585}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<xe.M, InterfaceC3955f0, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        List f25268d;

        /* renamed from: e, reason: collision with root package name */
        List f25269e;

        /* renamed from: f, reason: collision with root package name */
        List f25270f;

        /* renamed from: g, reason: collision with root package name */
        androidx.collection.M f25271g;

        /* renamed from: h, reason: collision with root package name */
        androidx.collection.M f25272h;

        /* renamed from: i, reason: collision with root package name */
        androidx.collection.M f25273i;

        /* renamed from: j, reason: collision with root package name */
        Set f25274j;

        /* renamed from: k, reason: collision with root package name */
        androidx.collection.M f25275k;

        /* renamed from: l, reason: collision with root package name */
        int f25276l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ InterfaceC3955f0 f25277m;

        static final class a extends AbstractC7737t implements Function1<Long, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L0 f25279b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.collection.M<Object> f25280c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.collection.M<G> f25281d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<G> f25282e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<C3968k0> f25283f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.collection.M<G> f25284g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ List<G> f25285h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ androidx.collection.M<G> f25286i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Set<Object> f25287j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, androidx.collection.M<Object> m11, androidx.collection.M<G> m12, List<G> list, List<C3968k0> list2, androidx.collection.M<G> m13, List<G> list3, androidx.collection.M<G> m14, Set<? extends Object> set) {
                super(1);
                this.f25279b = l02;
                this.f25280c = m11;
                this.f25281d = m12;
                this.f25282e = list;
                this.f25283f = list2;
                this.f25284g = m13;
                this.f25285h = list3;
                this.f25286i = m14;
                this.f25287j = set;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(4:3|21|(1:13)|14)|20|63|33|(4:34|(11:147|148|149|150|(5:152|153|(1:155)|156|157)|164|165|(2:190|252)|169|(4:171|172|(5:175|(2:178|176)|179|180|173)|181)(1:189)|182)(1:38)|58|59)|39|(9:41|42|43|(1:45)|46|47|(2:49|50)|52|53)|65|(5:110|111|112|(2:114|(4:115|116|(5:118|(3:120|(2:122|123)(1:125)|124)|126|127|(1:129))|(1:131)(1:132)))(0)|140)(1:67)|68|69|(4:80|81|(2:83|(3:84|(5:86|(4:88|(1:90)|91|92)|93|94|(1:99))(1:100)|(1:97)(1:98)))(0)|102)|71|1f5|76|58|59|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x01c6, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x01e2, code lost:
            
                r3.f0(r0, null);
                S0.L0.h.a(r3, r4, r5, r6, r7, r8, r9, r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x01c4, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x01ed, code lost:
            
                r8.f();
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x01f0, code lost:
            
                throw r0;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Unit invoke(Long l11) {
                int i11;
                long j11;
                AtomicReference atomicReference;
                boolean z11;
                boolean z12 = true;
                long longValue = l11.longValue();
                if (L0.z(this.f25279b)) {
                    this.f25279b.f25243b.f(longValue);
                    synchronized (C5721l.D()) {
                        atomicReference = C5721l.f56259j;
                        androidx.collection.M<InterfaceC5704H> D11 = ((C5710a) atomicReference.get()).D();
                        if (D11 != null) {
                            z11 = D11.c();
                        }
                    }
                    if (z11) {
                        C5721l.b();
                    }
                    Unit unit = Unit.f71690a;
                }
                L0 l02 = this.f25279b;
                androidx.collection.M<Object> m11 = this.f25280c;
                androidx.collection.M<G> m12 = this.f25281d;
                List<G> list = this.f25282e;
                List<C3968k0> list2 = this.f25283f;
                androidx.collection.M<G> m13 = this.f25284g;
                List<G> list3 = this.f25285h;
                androidx.collection.M<G> m14 = this.f25286i;
                Set<? extends Object> set = this.f25287j;
                L0.K(l02);
                synchronized (l02.f25244c) {
                    try {
                        U0.b bVar = l02.f25250i;
                        int m15 = bVar.m();
                        if (m15 > 0) {
                            Object[] l12 = bVar.l();
                            int i12 = 0;
                            while (true) {
                                boolean z13 = z12;
                                list.add((G) l12[i12]);
                                i12++;
                                if (i12 >= m15) {
                                    break;
                                }
                                z12 = z13;
                            }
                        }
                        l02.f25250i.h();
                        Unit unit2 = Unit.f71690a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                m11.f();
                m12.f();
                while (true) {
                    if (list.isEmpty() && list2.isEmpty()) {
                        break;
                    }
                    try {
                        try {
                            int size = list.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                try {
                                    G g10 = list.get(i13);
                                    G J11 = L0.J(l02, g10, m11);
                                    if (J11 != null) {
                                        list3.add(J11);
                                        Unit unit3 = Unit.f71690a;
                                    }
                                    m12.d(g10);
                                } catch (Exception e11) {
                                    e = e11;
                                    i11 = 2;
                                    l02.f0(e, null);
                                    h.a(l02, list, list2, list3, m13, m14, m11, m12);
                                    list.clear();
                                    return Unit.f71690a;
                                }
                            }
                            list.clear();
                            if (m11.c() || l02.f25250i.p()) {
                                synchronized (l02.f25244c) {
                                    try {
                                        List Z11 = l02.Z();
                                        int size2 = Z11.size();
                                        for (int i14 = 0; i14 < size2; i14++) {
                                            G g11 = (G) Z11.get(i14);
                                            if (!m12.a(g11) && g11.c(set)) {
                                                list.add(g11);
                                            }
                                        }
                                        U0.b bVar2 = l02.f25250i;
                                        int m16 = bVar2.m();
                                        int i15 = 0;
                                        for (int i16 = 0; i16 < m16; i16++) {
                                            G g12 = (G) bVar2.l()[i16];
                                            if (!m12.a(g12) && !list.contains(g12)) {
                                                list.add(g12);
                                                i15++;
                                            } else if (i15 > 0) {
                                                bVar2.l()[i16 - i15] = bVar2.l()[i16];
                                            }
                                        }
                                        int i17 = m16 - i15;
                                        C7705l.x(bVar2.l(), null, i17, m16);
                                        bVar2.y(i17);
                                        Unit unit4 = Unit.f71690a;
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                            if (list.isEmpty()) {
                                try {
                                    h.d(list2, l02);
                                    while (!list2.isEmpty()) {
                                        List elements = l02.e0(list2, m11);
                                        m13.getClass();
                                        Intrinsics.checkNotNullParameter(elements, "elements");
                                        Iterator it = elements.iterator();
                                        while (it.hasNext()) {
                                            m13.k(it.next());
                                        }
                                        h.d(list2, l02);
                                    }
                                } catch (Exception e12) {
                                    l02.f0(e12, null);
                                    h.a(l02, list, list2, list3, m13, m14, m11, m12);
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            i11 = 2;
                        }
                    } finally {
                        list.clear();
                    }
                    return Unit.f71690a;
                }
                if (!list3.isEmpty()) {
                    l02.f25242a = l02.V() + 1;
                    try {
                        try {
                            int size3 = list3.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                m14.d(list3.get(i18));
                            }
                            int size4 = list3.size();
                            for (int i19 = 0; i19 < size4; i19++) {
                                list3.get(i19).o();
                            }
                            list3.clear();
                        } catch (Exception e14) {
                            l02.f0(e14, null);
                            h.a(l02, list, list2, list3, m13, m14, m11, m12);
                            list3.clear();
                        }
                    } finally {
                        list3.clear();
                    }
                }
                if (m13.c()) {
                    try {
                        try {
                            m14.j(m13);
                            Object[] objArr = m13.f38663b;
                            long[] jArr = m13.f38662a;
                            j11 = 255;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i21 = 0;
                                while (true) {
                                    try {
                                        long j12 = jArr[i21];
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length)) >>> 31);
                                            for (int i23 = 0; i23 < i22; i23++) {
                                                if ((j12 & 255) < 128) {
                                                    ((G) objArr[(i21 << 3) + i23]).i();
                                                }
                                                j12 >>= 8;
                                            }
                                            if (i22 != 8) {
                                                break;
                                            }
                                        }
                                        if (i21 == length) {
                                            break;
                                        }
                                        i21++;
                                    } catch (Exception e15) {
                                        e = e15;
                                        l02 = l02;
                                        l02.f0(e, null);
                                        h.a(l02, list, list2, list3, m13, m14, m11, m12);
                                        return Unit.f71690a;
                                    }
                                }
                            }
                            m13.f();
                            l02 = l02;
                        } catch (Exception e16) {
                            e = e16;
                        }
                    } finally {
                        m13.f();
                    }
                } else {
                    j11 = 255;
                }
                if (m14.c()) {
                    Object[] objArr2 = m14.f38663b;
                    long[] jArr2 = m14.f38662a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i24 = 0;
                        while (true) {
                            long j13 = jArr2[i24];
                            Object[] objArr3 = objArr2;
                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i25 = 8 - ((~(i24 - length2)) >>> 31);
                                for (int i26 = 0; i26 < i25; i26++) {
                                    if ((j13 & j11) < 128) {
                                        ((G) objArr3[(i24 << 3) + i26]).e();
                                    }
                                    j13 >>= 8;
                                }
                                if (i25 != 8) {
                                    break;
                                }
                            }
                            if (i24 == length2) {
                                break;
                            }
                            i24++;
                            objArr2 = objArr3;
                        }
                    }
                }
                synchronized (l02.f25244c) {
                    l02.U();
                }
                C5721l.C().o();
                m12.f();
                m11.f();
                l02.f25256o = null;
                Unit unit5 = Unit.f71690a;
                return Unit.f71690a;
            }
        }

        h(kotlin.coroutines.d<? super h> dVar) {
            super(3, dVar);
        }

        public static final void a(L0 l02, List list, List list2, List list3, androidx.collection.M m11, androidx.collection.M m12, androidx.collection.M m13, androidx.collection.M m14) {
            char c11;
            long j11;
            long j12;
            synchronized (l02.f25244c) {
                try {
                    list.clear();
                    list2.clear();
                    int size = list3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        G g10 = (G) list3.get(i11);
                        g10.s();
                        L0.L(l02, g10);
                    }
                    list3.clear();
                    Object[] objArr = m11.f38663b;
                    long[] jArr = m11.f38662a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        j11 = 255;
                        while (true) {
                            long j13 = jArr[i12];
                            c11 = 7;
                            j12 = -9187201950435737472L;
                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8 - ((~(i12 - length)) >>> 31);
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if ((j13 & 255) < 128) {
                                        G g11 = (G) objArr[(i12 << 3) + i14];
                                        g11.s();
                                        L0.L(l02, g11);
                                    }
                                    j13 >>= 8;
                                }
                                if (i13 != 8) {
                                    break;
                                }
                            }
                            if (i12 == length) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    } else {
                        c11 = 7;
                        j11 = 255;
                        j12 = -9187201950435737472L;
                    }
                    m11.f();
                    Object[] objArr2 = m12.f38663b;
                    long[] jArr2 = m12.f38662a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j14 = jArr2[i15];
                            if ((((~j14) << c11) & j14 & j12) != j12) {
                                int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j14 & j11) < 128) {
                                        ((G) objArr2[(i15 << 3) + i17]).e();
                                    }
                                    j14 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length2) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                    m12.f();
                    m13.f();
                    Object[] objArr3 = m14.f38663b;
                    long[] jArr3 = m14.f38662a;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j15 = jArr3[i18];
                            if ((((~j15) << c11) & j15 & j12) != j12) {
                                int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                for (int i21 = 0; i21 < i19; i21++) {
                                    if ((j15 & j11) < 128) {
                                        G g12 = (G) objArr3[(i18 << 3) + i21];
                                        g12.s();
                                        L0.L(l02, g12);
                                    }
                                    j15 >>= 8;
                                }
                                if (i19 != 8) {
                                    break;
                                }
                            }
                            if (i18 == length3) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                    }
                    m14.f();
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public static final void d(List list, L0 l02) {
            list.clear();
            synchronized (l02.f25244c) {
                try {
                    ArrayList arrayList = l02.f25252k;
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        list.add((C3968k0) arrayList.get(i11));
                    }
                    l02.f25252k.clear();
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(xe.M m11, InterfaceC3955f0 interfaceC3955f0, kotlin.coroutines.d<? super Unit> dVar) {
            h hVar = L0.this.new h(dVar);
            hVar.f25277m = interfaceC3955f0;
            return hVar.invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00c8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0102 -> B:6:0x010a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x010e -> B:7:0x009e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC3955f0 interfaceC3955f0;
            androidx.collection.M a11;
            androidx.collection.M a12;
            List list;
            Set set;
            List list2;
            androidx.collection.M m11;
            List list3;
            androidx.collection.M m12;
            List list4;
            androidx.collection.M m13;
            List list5;
            androidx.collection.M m14;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f25276l;
            L0 l02 = L0.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                interfaceC3955f0 = this.f25277m;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a11 = androidx.collection.Y.a();
                androidx.collection.M a13 = androidx.collection.Y.a();
                androidx.collection.M m15 = new androidx.collection.M((Object) null);
                U0.c cVar = new U0.c(m15);
                a12 = androidx.collection.Y.a();
                list = arrayList;
                set = cVar;
                list2 = arrayList2;
                m11 = m15;
                list3 = arrayList3;
                m12 = a13;
                L0.D(l02);
                this.f25277m = interfaceC3955f0;
                this.f25268d = list;
                this.f25269e = list2;
                this.f25270f = list3;
                this.f25271g = a11;
                this.f25272h = m12;
                this.f25273i = m11;
                this.f25274j = set;
                this.f25275k = a12;
                this.f25276l = 1;
                if (L0.s(l02, this) != aVar) {
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.collection.M m16 = this.f25275k;
                set = this.f25274j;
                m11 = this.f25273i;
                m12 = this.f25272h;
                a11 = this.f25271g;
                list3 = this.f25270f;
                list2 = this.f25269e;
                list = this.f25268d;
                InterfaceC3955f0 interfaceC3955f02 = this.f25277m;
                Sc.s.b(obj);
                a12 = m16;
                interfaceC3955f0 = interfaceC3955f02;
                L0.u(l02);
                L0.D(l02);
                this.f25277m = interfaceC3955f0;
                this.f25268d = list;
                this.f25269e = list2;
                this.f25270f = list3;
                this.f25271g = a11;
                this.f25272h = m12;
                this.f25273i = m11;
                this.f25274j = set;
                this.f25275k = a12;
                this.f25276l = 1;
                if (L0.s(l02, this) != aVar) {
                    List list6 = list;
                    m13 = a11;
                    m14 = a12;
                    list4 = list3;
                    list5 = list6;
                    Set set2 = set;
                    androidx.collection.M m17 = m12;
                    androidx.collection.M m18 = m11;
                    if (L0.K(l02)) {
                        List list7 = list4;
                        a12 = m14;
                        a11 = m13;
                        list = list5;
                        list3 = list7;
                        m11 = m18;
                        m12 = m17;
                        set = set2;
                        L0.D(l02);
                        this.f25277m = interfaceC3955f0;
                        this.f25268d = list;
                        this.f25269e = list2;
                        this.f25270f = list3;
                        this.f25271g = a11;
                        this.f25272h = m12;
                        this.f25273i = m11;
                        this.f25274j = set;
                        this.f25275k = a12;
                        this.f25276l = 1;
                        if (L0.s(l02, this) != aVar) {
                        }
                    } else {
                        a aVar2 = new a(L0.this, m18, m14, list5, list2, m13, list4, m17, set2);
                        this.f25277m = interfaceC3955f0;
                        this.f25268d = list5;
                        this.f25269e = list2;
                        this.f25270f = list4;
                        this.f25271g = m13;
                        this.f25272h = m17;
                        this.f25273i = m18;
                        this.f25274j = set2;
                        this.f25275k = m14;
                        this.f25276l = 2;
                        if (interfaceC3955f0.v(aVar2, this) != aVar) {
                            List list8 = list4;
                            a12 = m14;
                            a11 = m13;
                            list = list5;
                            list3 = list8;
                            m11 = m18;
                            m12 = m17;
                            set = set2;
                            L0.u(l02);
                            L0.D(l02);
                            this.f25277m = interfaceC3955f0;
                            this.f25268d = list;
                            this.f25269e = list2;
                            this.f25270f = list3;
                            this.f25271g = a11;
                            this.f25272h = m12;
                            this.f25273i = m11;
                            this.f25274j = set;
                            this.f25275k = a12;
                            this.f25276l = 1;
                            if (L0.s(l02, this) != aVar) {
                            }
                        }
                    }
                }
                return aVar;
            }
            androidx.collection.M m19 = this.f25275k;
            set = this.f25274j;
            m11 = this.f25273i;
            m12 = this.f25272h;
            androidx.collection.M m21 = this.f25271g;
            List list9 = this.f25270f;
            list2 = this.f25269e;
            List list10 = this.f25268d;
            InterfaceC3955f0 interfaceC3955f03 = this.f25277m;
            Sc.s.b(obj);
            m14 = m19;
            interfaceC3955f0 = interfaceC3955f03;
            list4 = list9;
            list5 = list10;
            m13 = m21;
            Set set22 = set;
            androidx.collection.M m172 = m12;
            androidx.collection.M m182 = m11;
            if (L0.K(l02)) {
            }
        }
    }

    static {
        Y0.b bVar;
        bVar = Y0.b.f34518e;
        f25240w = Ae.O0.a(bVar);
        f25241x = new AtomicReference<>(Boolean.FALSE);
    }

    public L0(@NotNull CoroutineContext coroutineContext) {
        C3957g c3957g = new C3957g(new e());
        this.f25243b = c3957g;
        this.f25244c = new Object();
        this.f25247f = new ArrayList();
        this.f25249h = new androidx.collection.M<>((Object) null);
        this.f25250i = new U0.b<>(new G[16]);
        this.f25251j = new ArrayList();
        this.f25252k = new ArrayList();
        this.f25253l = new LinkedHashMap();
        this.f25254m = new LinkedHashMap();
        this.f25260s = Ae.O0.a(d.Inactive);
        xe.D0 d02 = new xe.D0((xe.B0) coroutineContext.get(xe.B0.f105374o0));
        d02.y(new f());
        this.f25261t = d02;
        this.f25262u = coroutineContext.plus(c3957g).plus(d02);
        this.f25263v = new c();
    }

    public static final void D(L0 l02) {
        synchronized (l02.f25244c) {
        }
    }

    public static final G J(L0 l02, G g10, androidx.collection.M m11) {
        LinkedHashSet linkedHashSet;
        C5711b O11;
        l02.getClass();
        if (!g10.p() && !g10.isDisposed() && ((linkedHashSet = l02.f25256o) == null || !linkedHashSet.contains(g10))) {
            O0 o02 = new O0(g10);
            Q0 q02 = new Q0(g10, m11);
            AbstractC5715f C11 = C5721l.C();
            C5711b c5711b = C11 instanceof C5711b ? (C5711b) C11 : null;
            if (c5711b == null || (O11 = c5711b.O(o02, q02)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC5715f l11 = O11.l();
                if (m11 != null) {
                    try {
                        if (m11.c()) {
                            g10.n(new N0(g10, m11));
                        }
                    } catch (Throwable th2) {
                        AbstractC5715f.s(l11);
                        throw th2;
                    }
                }
                boolean j11 = g10.j();
                AbstractC5715f.s(l11);
                if (j11) {
                    return g10;
                }
            } finally {
                S(O11);
            }
        }
        return null;
    }

    public static final boolean K(L0 l02) {
        List<G> Z11;
        boolean z11 = true;
        synchronized (l02.f25244c) {
            if (l02.f25249h.b()) {
                if (!l02.f25250i.p() && !l02.X()) {
                    z11 = false;
                }
                return z11;
            }
            U0.c elements = new U0.c(l02.f25249h);
            l02.f25249h = new androidx.collection.M<>((Object) null);
            synchronized (l02.f25244c) {
                Z11 = l02.Z();
            }
            try {
                int size = Z11.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Z11.get(i11).b(elements);
                    if (l02.f25260s.getValue().compareTo(d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (l02.f25244c) {
                    l02.f25249h = new androidx.collection.M<>((Object) null);
                    Unit unit = Unit.f71690a;
                }
                synchronized (l02.f25244c) {
                    if (l02.U() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (!l02.f25250i.p() && !l02.X()) {
                        z11 = false;
                    }
                }
                return z11;
            } catch (Throwable th2) {
                synchronized (l02.f25244c) {
                    androidx.collection.M<Object> m11 = l02.f25249h;
                    m11.getClass();
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    Iterator<T> it = elements.iterator();
                    while (it.hasNext()) {
                        m11.k(it.next());
                    }
                    throw th2;
                }
            }
        }
    }

    public static final void L(L0 l02, G g10) {
        ArrayList arrayList = l02.f25255n;
        if (arrayList == null) {
            arrayList = new ArrayList();
            l02.f25255n = arrayList;
        }
        if (!arrayList.contains(g10)) {
            arrayList.add(g10);
        }
        l02.f25247f.remove(g10);
        l02.f25248g = null;
    }

    public static final void M(L0 l02, xe.B0 b02) {
        synchronized (l02.f25244c) {
            Throwable th2 = l02.f25246e;
            if (th2 != null) {
                throw th2;
            }
            if (l02.f25260s.getValue().compareTo(d.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (l02.f25245d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            l02.f25245d = b02;
            l02.U();
        }
    }

    private static void S(C5711b c5711b) {
        try {
            if (c5711b.B() instanceof AbstractC5716g.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c5711b.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC10733l<Unit> U() {
        d dVar;
        Ae.x0<d> x0Var = this.f25260s;
        int compareTo = x0Var.getValue().compareTo(d.ShuttingDown);
        ArrayList arrayList = this.f25252k;
        ArrayList arrayList2 = this.f25251j;
        U0.b<G> bVar = this.f25250i;
        if (compareTo <= 0) {
            this.f25247f.clear();
            this.f25248g = kotlin.collections.K.f71697a;
            this.f25249h = new androidx.collection.M<>((Object) null);
            bVar.h();
            arrayList2.clear();
            arrayList.clear();
            this.f25255n = null;
            C10737n c10737n = this.f25257p;
            if (c10737n != null) {
                c10737n.A(null);
            }
            this.f25257p = null;
            this.f25258q = null;
            return null;
        }
        if (this.f25258q != null) {
            dVar = d.Inactive;
        } else if (this.f25245d == null) {
            this.f25249h = new androidx.collection.M<>((Object) null);
            bVar.h();
            dVar = X() ? d.InactivePendingWork : d.Inactive;
        } else {
            dVar = (bVar.p() || this.f25249h.c() || !arrayList2.isEmpty() || !arrayList.isEmpty() || X()) ? d.PendingWork : d.Idle;
        }
        x0Var.setValue(dVar);
        if (dVar != d.PendingWork) {
            return null;
        }
        C10737n c10737n2 = this.f25257p;
        this.f25257p = null;
        return c10737n2;
    }

    private final boolean X() {
        return !this.f25259r && this.f25243b.e();
    }

    private final boolean Y() {
        boolean z11;
        synchronized (this.f25244c) {
            if (!this.f25249h.c() && !this.f25250i.p()) {
                z11 = X();
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<S0.G>] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List<G> Z() {
        Object obj = this.f25248g;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f25247f;
            RandomAccess arrayList2 = arrayList.isEmpty() ? kotlin.collections.K.f71697a : new ArrayList(arrayList);
            this.f25248g = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    private final void c0(C3988v c3988v) {
        synchronized (this.f25244c) {
            ArrayList arrayList = this.f25252k;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((C3968k0) arrayList.get(i11)).b().equals(c3988v)) {
                    Unit unit = Unit.f71690a;
                    ArrayList arrayList2 = new ArrayList();
                    d0(arrayList2, this, c3988v);
                    while (!arrayList2.isEmpty()) {
                        e0(arrayList2, null);
                        d0(arrayList2, this, c3988v);
                    }
                    return;
                }
            }
        }
    }

    private static final void d0(ArrayList arrayList, L0 l02, C3988v c3988v) {
        arrayList.clear();
        synchronized (l02.f25244c) {
            try {
                Iterator it = l02.f25252k.iterator();
                while (it.hasNext()) {
                    C3968k0 c3968k0 = (C3968k0) it.next();
                    if (c3968k0.b().equals(c3988v)) {
                        arrayList.add(c3968k0);
                        it.remove();
                    }
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
    
        if (r4 >= r3) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).f() == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ef, code lost:
    
        if (r9 >= r4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f1, code lost:
    
        r12 = (kotlin.Pair) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        if (r12.f() != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fd, code lost:
    
        r12 = (S0.C3968k0) r12.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0107, code lost:
    
        if (r12 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010c, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010f, code lost:
    
        r4 = r16.f25244c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        kotlin.collections.C7714v.p(r3, r16.f25252k);
        r3 = kotlin.Unit.f71690a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0128, code lost:
    
        if (r9 >= r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012a, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        if (((kotlin.Pair) r11).f() == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0137, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013a, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<G> e0(List<C3968k0> list, androidx.collection.M<Object> m11) {
        C5711b O11;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3968k0 c3968k0 = list.get(i11);
            G b11 = c3968k0.b();
            Object obj = hashMap.get(b11);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(b11, obj);
            }
            ((ArrayList) obj).add(c3968k0);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            G g10 = (G) entry.getKey();
            List list2 = (List) entry.getValue();
            r.u(!g10.p());
            O0 o02 = new O0(g10);
            Q0 q02 = new Q0(g10, m11);
            AbstractC5715f C11 = C5721l.C();
            C5711b c5711b = C11 instanceof C5711b ? (C5711b) C11 : null;
            if (c5711b == null || (O11 = c5711b.O(o02, q02)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC5715f l11 = O11.l();
                try {
                    synchronized (this.f25244c) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            C3968k0 c3968k02 = (C3968k0) list2.get(i12);
                            arrayList.add(new Pair(c3968k02, R0.b(this.f25253l, c3968k02.c())));
                        }
                    }
                    int size3 = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size3) {
                            break;
                        }
                        if (((Pair) arrayList.get(i13)).f() != null) {
                            break;
                        }
                        i13++;
                    }
                    g10.d(arrayList);
                    Unit unit = Unit.f71690a;
                    AbstractC5715f.s(l11);
                } catch (Throwable th2) {
                    AbstractC5715f.s(l11);
                    throw th2;
                }
            } finally {
                S(O11);
            }
        }
        return C7714v.U0(hashMap.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(Exception exc, C3988v c3988v) {
        if (!f25241x.get().booleanValue() || (exc instanceof C3965j)) {
            synchronized (this.f25244c) {
                b bVar = this.f25258q;
                if (bVar != null) {
                    throw bVar.a();
                }
                this.f25258q = new b(exc);
                Unit unit = Unit.f71690a;
            }
            throw exc;
        }
        synchronized (this.f25244c) {
            int i11 = C3939a.f25331c;
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
            this.f25251j.clear();
            this.f25250i.h();
            this.f25249h = new androidx.collection.M<>((Object) null);
            this.f25252k.clear();
            this.f25253l.clear();
            this.f25254m.clear();
            this.f25258q = new b(exc);
            if (c3988v != null) {
                ArrayList arrayList = this.f25255n;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f25255n = arrayList;
                }
                if (!arrayList.contains(c3988v)) {
                    arrayList.add(c3988v);
                }
                this.f25247f.remove(c3988v);
                this.f25248g = null;
            }
            U();
        }
    }

    public static final Object s(L0 l02, kotlin.coroutines.d frame) {
        C10737n c10737n;
        if (l02.Y()) {
            return Unit.f71690a;
        }
        C10737n c10737n2 = new C10737n(1, Wc.b.b(frame));
        c10737n2.o();
        synchronized (l02.f25244c) {
            if (l02.Y()) {
                c10737n = c10737n2;
            } else {
                l02.f25257p = c10737n2;
                c10737n = null;
            }
        }
        if (c10737n != null) {
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(Unit.f71690a);
        }
        Object n11 = c10737n2.n();
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u(L0 l02) {
        int i11;
        kotlin.collections.K k11;
        synchronized (l02.f25244c) {
            try {
                if (l02.f25253l.isEmpty()) {
                    k11 = kotlin.collections.K.f71697a;
                } else {
                    ArrayList N11 = C7714v.N(l02.f25253l.values());
                    l02.f25253l.clear();
                    ArrayList arrayList = new ArrayList(N11.size());
                    int size = N11.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        C3968k0 c3968k0 = (C3968k0) N11.get(i12);
                        arrayList.add(new Pair(c3968k0, l02.f25254m.get(c3968k0)));
                    }
                    l02.f25254m.clear();
                    k11 = arrayList;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size2 = k11.size();
        for (i11 = 0; i11 < size2; i11++) {
            Pair pair = (Pair) k11.get(i11);
            C3968k0 c3968k02 = (C3968k0) pair.a();
            C3966j0 c3966j0 = (C3966j0) pair.b();
            if (c3966j0 != null) {
                ((C3988v) c3968k02.b()).y(c3966j0);
            }
        }
    }

    public static final boolean z(L0 l02) {
        boolean X9;
        synchronized (l02.f25244c) {
            X9 = l02.X();
        }
        return X9;
    }

    public final void T() {
        synchronized (this.f25244c) {
            try {
                if (this.f25260s.getValue().compareTo(d.Idle) >= 0) {
                    this.f25260s.setValue(d.ShuttingDown);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f25261t.j(null);
    }

    public final long V() {
        return this.f25242a;
    }

    @NotNull
    public final Ae.M0<d> W() {
        return this.f25260s;
    }

    @Override // S0.AbstractC3984t
    public final void a(@NotNull C3988v c3988v, @NotNull C4912a c4912a) {
        C5711b O11;
        boolean p11 = c3988v.p();
        try {
            O0 o02 = new O0(c3988v);
            Q0 q02 = new Q0(c3988v, null);
            AbstractC5715f C11 = C5721l.C();
            C5711b c5711b = C11 instanceof C5711b ? (C5711b) C11 : null;
            if (c5711b == null || (O11 = c5711b.O(o02, q02)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC5715f l11 = O11.l();
                try {
                    c3988v.x(c4912a);
                    Unit unit = Unit.f71690a;
                    if (!p11) {
                        C5721l.C().o();
                    }
                    synchronized (this.f25244c) {
                        if (this.f25260s.getValue().compareTo(d.ShuttingDown) > 0 && !Z().contains(c3988v)) {
                            this.f25247f.add(c3988v);
                            this.f25248g = null;
                        }
                    }
                    try {
                        c0(c3988v);
                        try {
                            c3988v.o();
                            c3988v.i();
                            if (p11) {
                                return;
                            }
                            C5721l.C().o();
                        } catch (Exception e11) {
                            f0(e11, null);
                        }
                    } catch (Exception e12) {
                        f0(e12, c3988v);
                    }
                } finally {
                    AbstractC5715f.s(l11);
                }
            } finally {
                S(O11);
            }
        } catch (Exception e13) {
            f0(e13, c3988v);
        }
    }

    public final Object a0(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object v11 = C2399j.v(this.f25260s, new g(2, null), dVar);
        return v11 == Wc.a.COROUTINE_SUSPENDED ? v11 : Unit.f71690a;
    }

    @Override // S0.AbstractC3984t
    public final void b(@NotNull C3968k0 c3968k0) {
        synchronized (this.f25244c) {
            R0.a(this.f25253l, c3968k0.c(), c3968k0);
        }
    }

    public final void b0() {
        synchronized (this.f25244c) {
            this.f25259r = true;
            Unit unit = Unit.f71690a;
        }
    }

    @Override // S0.AbstractC3984t
    public final boolean d() {
        return f25241x.get().booleanValue();
    }

    @Override // S0.AbstractC3984t
    public final boolean e() {
        return false;
    }

    @Override // S0.AbstractC3984t
    public final boolean f() {
        return false;
    }

    @Override // S0.AbstractC3984t
    public final int h() {
        return 1000;
    }

    public final void h0() {
        InterfaceC10733l<Unit> interfaceC10733l;
        synchronized (this.f25244c) {
            if (this.f25259r) {
                this.f25259r = false;
                interfaceC10733l = U();
            } else {
                interfaceC10733l = null;
            }
        }
        if (interfaceC10733l != null) {
            r.Companion companion = Sc.r.INSTANCE;
            ((C10737n) interfaceC10733l).resumeWith(Unit.f71690a);
        }
    }

    @Override // S0.AbstractC3984t
    @NotNull
    public final CoroutineContext i() {
        return this.f25262u;
    }

    public final Object i0(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(this.f25243b, new P0(this, new h(null), C3961h0.a(dVar.getContext()), null), dVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (f7 != aVar) {
            f7 = Unit.f71690a;
        }
        return f7 == aVar ? f7 : Unit.f71690a;
    }

    @Override // S0.AbstractC3984t
    public final void j(@NotNull G g10) {
        InterfaceC10733l<Unit> interfaceC10733l;
        synchronized (this.f25244c) {
            if (this.f25250i.i(g10)) {
                interfaceC10733l = null;
            } else {
                this.f25250i.b(g10);
                interfaceC10733l = U();
            }
        }
        if (interfaceC10733l != null) {
            r.Companion companion = Sc.r.INSTANCE;
            ((C10737n) interfaceC10733l).resumeWith(Unit.f71690a);
        }
    }

    @Override // S0.AbstractC3984t
    public final void k(@NotNull C3968k0 c3968k0, @NotNull C3966j0 c3966j0) {
        synchronized (this.f25244c) {
            this.f25254m.put(c3968k0, c3966j0);
            Unit unit = Unit.f71690a;
        }
    }

    @Override // S0.AbstractC3984t
    public final C3966j0 l(@NotNull C3968k0 c3968k0) {
        C3966j0 c3966j0;
        synchronized (this.f25244c) {
            c3966j0 = (C3966j0) this.f25254m.remove(c3968k0);
        }
        return c3966j0;
    }

    @Override // S0.AbstractC3984t
    public final void m(@NotNull Set<Object> set) {
    }

    @Override // S0.AbstractC3984t
    public final void o(@NotNull C3988v c3988v) {
        synchronized (this.f25244c) {
            try {
                LinkedHashSet linkedHashSet = this.f25256o;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f25256o = linkedHashSet;
                }
                linkedHashSet.add(c3988v);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // S0.AbstractC3984t
    public final void r(@NotNull C3988v c3988v) {
        synchronized (this.f25244c) {
            this.f25247f.remove(c3988v);
            this.f25248g = null;
            this.f25250i.s(c3988v);
            this.f25251j.remove(c3988v);
            Unit unit = Unit.f71690a;
        }
    }
}
