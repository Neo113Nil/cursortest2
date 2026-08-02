package A50;

import Ae.C0;
import Ae.E0;
import B50.h;
import C50.a;
import Sc.s;
import d40.InterfaceC6083a;
import h3.C6788a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2StoriesDTO;
import ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment;
import ru.ozon.fintech.ui.ActionResult2UI;
import x40.C10656a;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.L0;
import xe.M;
import y40.C10837a;
import z50.C10989c;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10656a f455a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f456b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f457c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C0 f458d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C0 f459e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C0 f460f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C0 f461g;

    /* renamed from: h, reason: collision with root package name */
    public C6788a f462h;

    /* renamed from: i, reason: collision with root package name */
    public Function0<Unit> f463i;

    /* renamed from: j, reason: collision with root package name */
    public Function1<? super ActionResult2UI, Unit> f464j;

    /* renamed from: k, reason: collision with root package name */
    private C50.d f465k;

    /* renamed from: l, reason: collision with root package name */
    private int f466l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f467m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f468n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f469o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f470p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f471q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f472r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f473s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f474t;

    /* renamed from: u, reason: collision with root package name */
    private B0 f475u;

    public interface a {
        @NotNull
        c provideStoriesInteractor();
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.intercator.StoriesInteractor$analyticsReportViewDuration$$inlined$post$1", f = "StoriesInteractor.kt", l = {11}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f476d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f477e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f478f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f479g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Long f480h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.intercator.StoriesInteractor$analyticsReportViewDuration$$inlined$post$1$1", f = "StoriesInteractor.kt", l = {}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f481d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f482e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f483f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Long f484g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, c cVar, int i11, int i12, Long l11) {
                super(2, dVar);
                this.f481d = cVar;
                this.f482e = i11;
                this.f483f = i12;
                this.f484g = l11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(dVar, this.f481d, this.f482e, this.f483f, this.f484g);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                String str;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                c cVar = this.f481d;
                Function1<ActionResult2UI, Unit> h11 = cVar.h();
                C50.d dVar = cVar.f465k;
                if (dVar == null || (str = dVar.c()) == null) {
                    str = "";
                }
                h11.invoke(new ActionResult2UI(str, null, ActionResult2UI.Type.TIME_VIEWED, null, null, null, new Integer(this.f482e), new Integer(this.f483f), null, null, null, null, null, this.f484g, null, null, null, null, null, null, null, 2088760, null));
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.coroutines.d dVar, c cVar, int i11, int i12, Long l11) {
            super(2, dVar);
            this.f477e = cVar;
            this.f478f = i11;
            this.f479g = i12;
            this.f480h = l11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(dVar, this.f477e, this.f478f, this.f479g, this.f480h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f476d;
            if (i11 == 0) {
                s.b(obj);
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                a aVar2 = new a(null, this.f477e, this.f478f, this.f479g, this.f480h);
                this.f476d = 1;
                if (C10727i.f(l02, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.intercator.StoriesInteractor$putOneFrameFragment$$inlined$post$1", f = "StoriesInteractor.kt", l = {11}, m = "invokeSuspend")
    /* renamed from: A50.c$c, reason: collision with other inner class name */
    public static final class C0018c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f485d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.intercator.StoriesInteractor$putOneFrameFragment$$inlined$post$1$1", f = "StoriesInteractor.kt", l = {}, m = "invokeSuspend")
        /* renamed from: A50.c$c$a */
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f487d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f487d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f487d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                c cVar = this.f487d;
                c.d(cVar);
                M s11 = cVar.s();
                C10720e0 c10720e0 = C10720e0.f105451a;
                C10727i.c(s11, He.b.f10879b, null, cVar.new d(null), 2);
                return Unit.f71690a;
            }
        }

        public C0018c(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new C0018c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0018c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f485d;
            if (i11 == 0) {
                s.b(obj);
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                a aVar2 = new a(c.this, null);
                this.f485d = 1;
                if (C10727i.f(l02, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.intercator.StoriesInteractor$putOneFrameFragment$lambda$15$$inlined$postDelayed$1", f = "StoriesInteractor.kt", l = {19, 20}, m = "invokeSuspend")
    public static final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f488d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.intercator.StoriesInteractor$putOneFrameFragment$lambda$15$$inlined$postDelayed$1$1", f = "StoriesInteractor.kt", l = {}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f490d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f490d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f490d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                this.f490d.t(false);
                return Unit.f71690a;
            }
        }

        public d(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (xe.C10727i.f(r6, r1, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        
            if (xe.Y.b(1000, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f488d;
            if (i11 == 0) {
                s.b(obj);
                this.f488d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 l02 = De.s.f6650a;
            a aVar2 = new a(c.this, null);
            this.f488d = 2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.intercator.StoriesInteractor$setStoryFrame$$inlined$postDelayed$1", f = "StoriesInteractor.kt", l = {19, 20}, m = "invokeSuspend")
    public static final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f491d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f492e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f493f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f494g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.intercator.StoriesInteractor$setStoryFrame$$inlined$postDelayed$1$1", f = "StoriesInteractor.kt", l = {}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f495d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f496e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f497f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, c cVar, int i11, int i12) {
                super(2, dVar);
                this.f495d = cVar;
                this.f496e = i11;
                this.f497f = i12;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(dVar, this.f495d, this.f496e, this.f497f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                this.f495d.k().tryEmit(new Pair(new Integer(this.f496e), new Integer(this.f497f)));
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlin.coroutines.d dVar, c cVar, int i11, int i12) {
            super(2, dVar);
            this.f492e = cVar;
            this.f493f = i11;
            this.f494g = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(dVar, this.f492e, this.f493f, this.f494g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (xe.C10727i.f(r8, r1, r7) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        
            if (xe.Y.b(500, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f491d;
            if (i11 == 0) {
                s.b(obj);
                this.f491d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 l02 = De.s.f6650a;
            a aVar2 = new a(null, this.f492e, this.f493f, this.f494g);
            this.f491d = 2;
        }
    }

    public c(@NotNull C10656a cbottomMapper2, @NotNull InterfaceC6083a exchanger) {
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        this.f455a = cbottomMapper2;
        this.f456b = exchanger;
        this.f457c = "";
        EnumC11113a enumC11113a = EnumC11113a.DROP_LATEST;
        this.f458d = E0.a(0, 1, enumC11113a);
        this.f459e = E0.a(0, 1, enumC11113a);
        this.f460f = E0.a(0, 1, enumC11113a);
        this.f461g = E0.a(0, 1, enumC11113a);
        this.f467m = new LinkedHashMap();
        this.f468n = new LinkedHashMap();
        this.f469o = new LinkedHashMap();
        this.f470p = new LinkedHashMap();
        this.f471q = new LinkedHashMap();
        this.f472r = new LinkedHashMap();
        this.f473s = new LinkedHashMap();
    }

    private final void D(int i11, int i12, int i13, int i14, boolean z11) {
        String str;
        if (this.f465k != null) {
            ActionResult2UI.Type type = z11 ? ActionResult2UI.Type.TAP_NEXT : ActionResult2UI.Type.TAP_PREV;
            Integer valueOf = i13 < 0 ? null : Integer.valueOf(i13);
            Integer valueOf2 = i14 >= 0 ? Integer.valueOf(i14) : null;
            Function1<ActionResult2UI, Unit> h11 = h();
            C50.d dVar = this.f465k;
            if (dVar == null || (str = dVar.c()) == null) {
                str = "";
            }
            h11.invoke(new ActionResult2UI(str, null, type, null, null, null, null, null, Integer.valueOf(i11), Integer.valueOf(i12), valueOf, valueOf2, null, null, null, null, null, null, null, null, null, 2093304, null));
        }
    }

    private final void F() {
        C50.a aVar;
        h hVar;
        for (Map.Entry entry : this.f472r.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int intValue2 = ((Number) entry2.getKey()).intValue();
                WeakReference weakReference = (WeakReference) entry2.getValue();
                Map map = (Map) this.f468n.get(Integer.valueOf(intValue));
                if (map != null && (aVar = (C50.a) map.get(Integer.valueOf(intValue2))) != null && weakReference != null && (hVar = (h) weakReference.get()) != null) {
                    hVar.X(aVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        WeakReference weakReference;
        h hVar;
        Long l11;
        C50.d dVar = this.f465k;
        if (dVar != null) {
            int i11 = 0;
            for (Object obj : dVar.f()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                int i13 = 0;
                for (Object obj2 : ((C50.e) obj).a()) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    Map map = (Map) this.f469o.get(Integer.valueOf(i11));
                    long longValue = (map == null || (l11 = (Long) map.get(Integer.valueOf(i13))) == null) ? 0L : l11.longValue();
                    Map map2 = (Map) this.f472r.get(Integer.valueOf(i11));
                    long S11 = (map2 == null || (weakReference = (WeakReference) map2.get(Integer.valueOf(i13))) == null || (hVar = (h) weakReference.get()) == null) ? 0L : hVar.S();
                    int q11 = q(i11);
                    float f7 = i13 < q11 ? 1.0f : (i13 <= q11 && longValue != 0) ? S11 / longValue : 0.0f;
                    Map map3 = (Map) this.f470p.get(Integer.valueOf(i11));
                    if (map3 != null) {
                    }
                    Map map4 = (Map) this.f471q.get(Integer.valueOf(i11));
                    if (map4 != null) {
                    }
                    i13 = i14;
                }
                i11 = i12;
            }
        }
        this.f461g.tryEmit(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Unit a(c cVar) {
        int i11;
        int i12;
        c cVar2;
        int i13 = cVar.f466l;
        int q11 = cVar.q(i13);
        C50.d dVar = cVar.f465k;
        if (dVar != null) {
            C50.e eVar = (C50.e) ((ArrayList) dVar.f()).get(cVar.f466l);
            if (eVar != null) {
                i11 = ((ArrayList) eVar.a()).size();
                C50.d dVar2 = cVar.f465k;
                int size = dVar2 != null ? ((ArrayList) dVar2.f()).size() : 0;
                i12 = i11 - 1;
                if (q11 != i12 && i13 == size - 1) {
                    cVar2 = cVar;
                    cVar2.D(i13, q11, -1, -1, true);
                } else if (q11 != i12 && i13 < size - 1) {
                    int i14 = i13 + 1;
                    cVar2 = cVar;
                    cVar2.D(i13, q11, i14, cVar.q(i14), true);
                } else if (q11 >= i12) {
                    cVar2 = cVar;
                    cVar2.D(i13, q11, i13, q11 + 1, true);
                } else {
                    cVar2 = cVar;
                }
                int i15 = cVar2.f466l;
                cVar2.E(i15, cVar2.q(i15));
                return Unit.f71690a;
            }
        }
        i11 = 0;
        C50.d dVar22 = cVar.f465k;
        if (dVar22 != null) {
        }
        i12 = i11 - 1;
        if (q11 != i12) {
        }
        if (q11 != i12) {
        }
        if (q11 >= i12) {
        }
        int i152 = cVar2.f466l;
        cVar2.E(i152, cVar2.q(i152));
        return Unit.f71690a;
    }

    public static Unit b(c cVar) {
        c cVar2;
        int i11 = cVar.f466l;
        int q11 = cVar.q(i11);
        if (q11 > 0) {
            cVar2 = cVar;
            cVar2.D(i11, q11, i11, q11 - 1, false);
        } else {
            cVar2 = cVar;
            if (q11 == 0 && i11 > 0) {
                int i12 = i11 - 1;
                cVar2.D(i11, q11, i12, cVar2.q(i12), false);
            } else if (q11 == 0 && i11 == 0) {
                cVar2.D(i11, q11, -1, -1, false);
            }
        }
        int i13 = cVar2.f466l;
        int q12 = cVar2.q(i13);
        C10989c.a("StoriesRepo", "setFrameStart storyPos=" + i13 + " framePos=" + q12);
        if (i13 == cVar2.f466l) {
            if (q12 > 0) {
                cVar2.f459e.tryEmit(new Pair(Integer.valueOf(i13), Integer.valueOf(q12 - 1)));
            } else if (q12 == 0 && i13 > 0) {
                int i14 = i13 - 1;
                cVar2.f460f.tryEmit(new Pair(Integer.valueOf(i14), Integer.valueOf(cVar2.q(i14))));
            } else if (q12 == 0 && i13 == 0) {
                cVar2.f458d.tryEmit(new Pair(0, 0));
            }
        }
        return Unit.f71690a;
    }

    public static final void d(c cVar) {
        int q11 = cVar.q(cVar.f466l);
        LinkedHashMap linkedHashMap = cVar.f468n;
        Map map = (Map) linkedHashMap.get(Integer.valueOf(cVar.f466l));
        if (map != null) {
        }
        C10989c.a("StoriesRepo", "startUp frameStatuses=" + linkedHashMap);
        cVar.F();
    }

    public final void A(int i11, @NotNull StoryFragment storyFragment) {
        Intrinsics.checkNotNullParameter(storyFragment, "storyFragment");
        this.f473s.put(Integer.valueOf(i11), new WeakReference(storyFragment));
    }

    public final void B(int i11, int i12) {
        Map map = (Map) this.f472r.get(Integer.valueOf(i11));
        if (map != null) {
        }
    }

    public final void C(int i11) {
        this.f473s.remove(Integer.valueOf(i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(int i11, int i12) {
        int i13;
        int i14;
        C10989c.a("StoriesRepo", "setFrameEnd storyPos=" + i11 + " framePos=" + i12);
        if (i11 != this.f466l) {
            return;
        }
        C50.d dVar = this.f465k;
        if (dVar != null) {
            C50.e eVar = (C50.e) ((ArrayList) dVar.f()).get(this.f466l);
            if (eVar != null) {
                i13 = ((ArrayList) eVar.a()).size();
                C50.d dVar2 = this.f465k;
                int size = dVar2 != null ? ((ArrayList) dVar2.f()).size() : 0;
                i14 = i13 - 1;
                if (i12 != i14 && i11 == size - 1) {
                    L();
                    return;
                }
                if (i12 != i14 && i11 < size - 1) {
                    int i15 = i11 + 1;
                    this.f460f.tryEmit(new Pair(Integer.valueOf(i15), Integer.valueOf(q(i15))));
                    return;
                } else {
                    if (i12 >= i14) {
                        this.f459e.tryEmit(new Pair(Integer.valueOf(i11), Integer.valueOf(i12 + 1)));
                        return;
                    }
                    return;
                }
            }
        }
        i13 = 0;
        C50.d dVar22 = this.f465k;
        if (dVar22 != null) {
        }
        i14 = i13 - 1;
        if (i12 != i14) {
        }
        if (i12 != i14) {
        }
        if (i12 >= i14) {
        }
    }

    public final void G(int i11, int i12) {
        this.f460f.tryEmit(new Pair(Integer.valueOf(i11), Integer.valueOf(i12)));
        M s11 = s();
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(s11, He.b.f10879b, null, new e(null, this, i11, i12), 2);
    }

    public final void H(Cbottom2StoriesDTO cbottom2StoriesDTO) {
        C50.d dVar;
        List<Cbottom2StoriesDTO.FrameDTO> frames;
        C10656a c10656a;
        C50.d dVar2;
        if (cbottom2StoriesDTO == null) {
            dVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object obj : cbottom2StoriesDTO.getStories()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ArrayList arrayList2 = new ArrayList();
                List<Cbottom2StoriesDTO.FrameDTO> frames2 = ((Cbottom2StoriesDTO.StoryDTO) obj).getFrames();
                if (frames2 != null) {
                    int i13 = 0;
                    for (Object obj2 : frames2) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        Cbottom2StoriesDTO.FrameDTO frameDTO = (Cbottom2StoriesDTO.FrameDTO) obj2;
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        List<F40.a> topWidgets = frameDTO.getTopWidgets();
                        C10656a c10656a2 = this.f455a;
                        if (topWidgets != null) {
                            String id2 = cbottom2StoriesDTO.getId();
                            c10656a = c10656a2;
                            Function1<ActionResult2UI, Unit> h11 = h();
                            c10656a.getClass();
                            arrayList3.addAll(C10656a.b(id2, topWidgets, h11, null));
                        } else {
                            c10656a = c10656a2;
                        }
                        List<F40.a> bottomWidgets = frameDTO.getBottomWidgets();
                        if (bottomWidgets != null) {
                            String id3 = cbottom2StoriesDTO.getId();
                            Function1<ActionResult2UI, Unit> h12 = h();
                            c10656a.getClass();
                            arrayList4.addAll(C10656a.b(id3, bottomWidgets, h12, null));
                        }
                        List<F40.a> centerWidgets = frameDTO.getCenterWidgets();
                        if (centerWidgets != null) {
                            String id4 = cbottom2StoriesDTO.getId();
                            Function1<ActionResult2UI, Unit> h13 = h();
                            c10656a.getClass();
                            arrayList5.addAll(C10656a.b(id4, centerWidgets, h13, null));
                        }
                        arrayList2.add(new C50.b(frameDTO.getId(), i13, i11, frameDTO.getBackground(), frameDTO.getDuration(), frameDTO.getAutoplay(), frameDTO.getImageUrl(), frameDTO.getVideoUrl(), arrayList3, arrayList4, arrayList5));
                        i13 = i14;
                    }
                }
                Boolean canClose = cbottom2StoriesDTO.getCanClose();
                arrayList.add(new C50.e(i11, arrayList2, canClose != null ? canClose.booleanValue() : true));
                i11 = i12;
            }
            int min = Math.min(Math.abs(cbottom2StoriesDTO.getSelectedStory()), cbottom2StoriesDTO.getStories().size() - 1);
            Cbottom2StoriesDTO.StoryDTO storyDTO = (Cbottom2StoriesDTO.StoryDTO) C7714v.Q(min, cbottom2StoriesDTO.getStories());
            int min2 = Math.min(Math.abs(cbottom2StoriesDTO.getSelectedFrame()), ((storyDTO == null || (frames = storyDTO.getFrames()) == null) ? 0 : frames.size()) - 1);
            String id5 = cbottom2StoriesDTO.getId();
            Boolean canClose2 = cbottom2StoriesDTO.getCanClose();
            boolean booleanValue = canClose2 != null ? canClose2.booleanValue() : true;
            Boolean canClose3 = cbottom2StoriesDTO.getCanClose();
            dVar = new C50.d(id5, min, min2, booleanValue, Boolean.valueOf(canClose3 != null ? canClose3.booleanValue() : true), arrayList);
        }
        this.f465k = dVar;
        this.f466l = dVar != null ? dVar.e() : 0;
        C50.d dVar3 = this.f465k;
        if (dVar3 != null) {
            int i15 = 0;
            for (Object obj3 : dVar3.f()) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    C7714v.O0();
                    throw null;
                }
                C50.e eVar = (C50.e) obj3;
                LinkedHashMap linkedHashMap = this.f467m;
                Integer valueOf = Integer.valueOf(i15);
                C50.d dVar4 = this.f465k;
                linkedHashMap.put(valueOf, Integer.valueOf((dVar4 == null || i15 != dVar4.e() || (dVar2 = this.f465k) == null) ? 0 : dVar2.d()));
                int i17 = 0;
                for (Object obj4 : eVar.a()) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    LinkedHashMap linkedHashMap2 = this.f468n;
                    Integer valueOf2 = Integer.valueOf(i15);
                    Object obj5 = linkedHashMap2.get(valueOf2);
                    if (obj5 == null) {
                        obj5 = new LinkedHashMap();
                        linkedHashMap2.put(valueOf2, obj5);
                    }
                    ((Map) obj5).put(Integer.valueOf(i17), a.b.f4398a);
                    LinkedHashMap linkedHashMap3 = this.f469o;
                    Integer valueOf3 = Integer.valueOf(i15);
                    Object obj6 = linkedHashMap3.get(valueOf3);
                    if (obj6 == null) {
                        obj6 = new LinkedHashMap();
                        linkedHashMap3.put(valueOf3, obj6);
                    }
                    ((Map) obj6).put(Integer.valueOf(i17), 0L);
                    LinkedHashMap linkedHashMap4 = this.f470p;
                    Integer valueOf4 = Integer.valueOf(i15);
                    Object obj7 = linkedHashMap4.get(valueOf4);
                    if (obj7 == null) {
                        obj7 = new LinkedHashMap();
                        linkedHashMap4.put(valueOf4, obj7);
                    }
                    ((Map) obj7).put(Integer.valueOf(i17), Float.valueOf(0.0f));
                    LinkedHashMap linkedHashMap5 = this.f471q;
                    Integer valueOf5 = Integer.valueOf(i15);
                    Object obj8 = linkedHashMap5.get(valueOf5);
                    if (obj8 == null) {
                        obj8 = new LinkedHashMap();
                        linkedHashMap5.put(valueOf5, obj8);
                    }
                    ((Map) obj8).put(Integer.valueOf(i17), 0L);
                    LinkedHashMap linkedHashMap6 = this.f472r;
                    Integer valueOf6 = Integer.valueOf(i15);
                    Object obj9 = linkedHashMap6.get(valueOf6);
                    if (obj9 == null) {
                        obj9 = new LinkedHashMap();
                        linkedHashMap6.put(valueOf6, obj9);
                    }
                    ((Map) obj9).put(Integer.valueOf(i17), null);
                    this.f473s.put(Integer.valueOf(i15), null);
                    i17 = i18;
                }
                i15 = i16;
            }
        }
    }

    public final void I(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f457c = str;
    }

    public final void J(int i11, int i12, long j11) {
        Map map = (Map) this.f469o.get(Integer.valueOf(i11));
        if (map != null) {
        }
    }

    public final void L() {
        String c11;
        C50.d dVar = this.f465k;
        if (dVar != null && (c11 = dVar.c()) != null) {
            ActionResult2.Companion companion = ActionResult2.INSTANCE;
            String str = this.f457c;
            companion.getClass();
            this.f456b.c(C10837a.a(new ActionResult2UI(c11, null, ActionResult2UI.Type.BACK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097144, null)), ActionResult2.Companion.a(str));
        }
        C50.d dVar2 = this.f465k;
        if (dVar2 == null || !dVar2.a()) {
            return;
        }
        Function0<Unit> function0 = this.f463i;
        if (function0 != null) {
            function0.invoke();
        } else {
            Intrinsics.n("endDismissListener");
            throw null;
        }
    }

    public final void f() {
        if (this.f465k != null) {
            int i11 = this.f466l;
            int q11 = q(i11);
            Map map = (Map) this.f471q.get(Integer.valueOf(this.f466l));
            Long l11 = map != null ? (Long) map.get(Integer.valueOf(q11)) : null;
            M s11 = s();
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(s11, He.b.f10879b, null, new b(null, this, q11, i11, l11), 2);
        }
    }

    public final void g(int i11, int i12) {
        String str;
        if (i11 == i12 || this.f465k == null) {
            return;
        }
        ActionResult2UI.Type type = i12 > i11 ? ActionResult2UI.Type.PREV_STORY : ActionResult2UI.Type.NEXT_STORY;
        Function1<ActionResult2UI, Unit> h11 = h();
        C50.d dVar = this.f465k;
        if (dVar == null || (str = dVar.c()) == null) {
            str = "";
        }
        h11.invoke(new ActionResult2UI(str, null, type, null, null, null, null, Integer.valueOf(i11), null, null, null, null, Integer.valueOf(i12), null, null, null, null, null, null, null, null, 2092920, null));
    }

    @NotNull
    public final Function1<ActionResult2UI, Unit> h() {
        Function1 function1 = this.f464j;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.n("actionListenerV2");
        throw null;
    }

    public final C50.a i(int i11, int i12) {
        Map map = (Map) this.f468n.get(Integer.valueOf(i11));
        if (map != null) {
            return (C50.a) map.get(Integer.valueOf(i12));
        }
        return null;
    }

    public final C50.b j(int i11, int i12) {
        C50.e eVar;
        C50.d dVar = this.f465k;
        if (dVar == null || (eVar = (C50.e) ((ArrayList) dVar.f()).get(i11)) == null) {
            return null;
        }
        return (C50.b) ((ArrayList) eVar.a()).get(i12);
    }

    @NotNull
    public final C0 k() {
        return this.f459e;
    }

    @NotNull
    public final C0 l() {
        return this.f460f;
    }

    @NotNull
    public final List<Float> m(int i11) {
        Map map = (Map) this.f470p.get(Integer.valueOf(i11));
        if (map == null) {
            map = U.c();
        }
        return C7714v.U0(map.values());
    }

    @NotNull
    public final C0 n() {
        return this.f461g;
    }

    @NotNull
    public final C0 o() {
        return this.f458d;
    }

    public final C50.d p() {
        return this.f465k;
    }

    public final int q(int i11) {
        return ((Number) this.f467m.getOrDefault(Integer.valueOf(i11), 0)).intValue();
    }

    public final C50.e r(int i11) {
        C50.d dVar = this.f465k;
        if (dVar != null) {
            return (C50.e) ((ArrayList) dVar.f()).get(i11);
        }
        return null;
    }

    @NotNull
    public final M s() {
        C6788a c6788a = this.f462h;
        if (c6788a != null) {
            return c6788a;
        }
        Intrinsics.n("viewModelScope");
        throw null;
    }

    public final void t(boolean z11) {
        String str;
        C50.d dVar = this.f465k;
        LinkedHashMap linkedHashMap = this.f468n;
        if (dVar != null) {
            int i11 = 0;
            for (Object obj : dVar.f()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                int q11 = q(i11);
                int i13 = 0;
                for (Object obj2 : ((C50.e) obj).a()) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    int i15 = this.f466l;
                    if (i11 == i15 && i13 == q11) {
                        Map map = (Map) linkedHashMap.get(Integer.valueOf(i11));
                        if (map != null) {
                        }
                    } else {
                        if (i11 == i15) {
                            int i16 = q11 - 1;
                            if (i13 <= q11 + 1 && i16 <= i13) {
                                Map map2 = (Map) linkedHashMap.get(Integer.valueOf(i11));
                                if (map2 != null) {
                                }
                            }
                        }
                        if (i11 == i15) {
                            Map map3 = (Map) linkedHashMap.get(Integer.valueOf(i11));
                            if (map3 != null) {
                            }
                        } else {
                            int i17 = i15 - 1;
                            if (i11 > i15 + 1 || i17 > i11 || i13 != q11) {
                                Map map4 = (Map) linkedHashMap.get(Integer.valueOf(i11));
                                if (map4 != null) {
                                }
                            } else {
                                Map map5 = (Map) linkedHashMap.get(Integer.valueOf(i11));
                                if (map5 != null) {
                                }
                            }
                        }
                    }
                    i13 = i14;
                }
                i11 = i12;
            }
        }
        C10989c.a("StoriesRepo", "handleVisibleStories frameStatuses=" + linkedHashMap);
        K();
        F();
        if (z11) {
            return;
        }
        int q12 = q(this.f466l);
        if (this.f465k != null) {
            Function1<ActionResult2UI, Unit> h11 = h();
            C50.d dVar2 = this.f465k;
            if (dVar2 == null || (str = dVar2.c()) == null) {
                str = "";
            }
            h11.invoke(new ActionResult2UI(str, null, ActionResult2UI.Type.SELECTED, null, null, null, Integer.valueOf(q12), Integer.valueOf(this.f466l), null, null, null, null, null, null, null, null, null, null, null, null, null, 2096952, null));
        }
    }

    public final void u(int i11, int i12) {
        Integer valueOf = Integer.valueOf(i11);
        Integer valueOf2 = Integer.valueOf(i12);
        LinkedHashMap linkedHashMap = this.f467m;
        linkedHashMap.put(valueOf, valueOf2);
        C10989c.a("StoriesRepo", "nowFrame storyPos=" + i11 + " storyFramePos=" + linkedHashMap);
    }

    public final void v(int i11) {
        this.f466l = i11;
        C10989c.a("StoriesRepo", "nowStory storyPos=" + i11 + " storyFramePos=" + this.f467m);
    }

    public final void w() {
        this.f474t = false;
        this.f465k = null;
        B0 b02 = this.f475u;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }

    public final void x() {
        B0 b02 = this.f475u;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        for (Map map : this.f468n.values()) {
            int i11 = 0;
            for (Object obj : map.keySet()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ((Number) obj).intValue();
                if (map.get(Integer.valueOf(i11)) instanceof a.AbstractC0108a.C0109a) {
                    map.put(Integer.valueOf(i11), a.AbstractC0108a.b.f4397a);
                }
                i11 = i12;
            }
        }
        F();
    }

    public final void y() {
        if (this.f465k != null && this.f474t) {
            t(false);
        }
        B0 b02 = this.f475u;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f475u = C10727i.c(s(), null, null, new A50.d(this, null), 3);
        this.f474t = true;
    }

    public final void z(int i11, int i12, @NotNull h oneFramePageFragment) {
        Intrinsics.checkNotNullParameter(oneFramePageFragment, "oneFramePageFragment");
        Map map = (Map) this.f472r.get(Integer.valueOf(i11));
        if (map != null) {
        }
        int i13 = this.f466l;
        if (i13 == i11 && q(i13) == i12) {
            M s11 = s();
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(s11, He.b.f10879b, null, new C0018c(null), 2);
        }
    }
}
