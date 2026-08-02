package P10;

import De.s;
import P10.f;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.E0;
import xe.H0;
import xe.I;
import xe.L0;
import xe.M;
import xe.N;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> f21611a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f21612b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final D f21613c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final He.c f21614d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final I f21615e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f21616f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private List<i> f21617g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayList f21618h;

    /* renamed from: i, reason: collision with root package name */
    private List<l> f21619i;

    /* renamed from: j, reason: collision with root package name */
    private B0 f21620j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> f21621a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final k f21622b;

        public a(@NotNull n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> widgetStore, @NotNull k stickyItemDiffCallback) {
            Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
            Intrinsics.checkNotNullParameter(stickyItemDiffCallback, "stickyItemDiffCallback");
            this.f21621a = widgetStore;
            this.f21622b = stickyItemDiffCallback;
        }

        public static c a(a aVar, D viewLifecycleScope, boolean z11) {
            He.c backgroundDispatcher = C10720e0.a();
            L0 mainDispatcher = s.f6650a;
            Intrinsics.checkNotNullParameter(viewLifecycleScope, "viewLifecycleScope");
            Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
            Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
            return new c(aVar.f21621a, aVar.f21622b, viewLifecycleScope, backgroundDispatcher, mainDispatcher, z11);
        }
    }

    public interface b {
        void a();

        void b(@NotNull i.c cVar);
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.sticky.internal.adapter.StickyHeaderAsyncDiffer$submitItems$3", f = "StickyHeaderAsyncDiffer.kt", l = {74, 79}, m = "invokeSuspend")
    /* renamed from: P10.c$c, reason: collision with other inner class name */
    static final class C0423c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f21623d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f21624e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<l> f21626g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.sticky.internal.adapter.StickyHeaderAsyncDiffer$submitItems$3$1", f = "StickyHeaderAsyncDiffer.kt", l = {}, m = "invokeSuspend")
        /* renamed from: P10.c$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f21627d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<i> f21628e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ i.c f21629f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, List<i> list, i.c cVar2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f21627d = cVar;
                this.f21628e = list;
                this.f21629f = cVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f21627d, this.f21628e, this.f21629f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                c cVar = this.f21627d;
                cVar.f21617g = this.f21628e;
                Iterator it = cVar.f21618h.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).b(this.f21629f);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0423c(List<l> list, kotlin.coroutines.d<? super C0423c> dVar) {
            super(2, dVar);
            this.f21626g = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C0423c c0423c = c.this.new C0423c(this.f21626g, dVar);
            c0423c.f21624e = obj;
            return c0423c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0423c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
        
            if (xe.C10727i.f(r1, r5, r7) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            M m11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f21623d;
            c cVar = c.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                m11 = (M) this.f21624e;
                this.f21624e = m11;
                this.f21623d = 1;
                obj = c.b(cVar, this.f21626g, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                m11 = (M) this.f21624e;
                Sc.s.b(obj);
            }
            List newList = (List) obj;
            k kVar = cVar.f21612b;
            List<i> oldList = cVar.g();
            kVar.getClass();
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(newList, "newList");
            i.c a11 = androidx.recyclerview.widget.i.a(new j(oldList, newList, kVar), false);
            Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
            N.e(m11);
            I i12 = cVar.f21615e;
            a aVar2 = new a(cVar, newList, a11, null);
            this.f21624e = null;
            this.f21623d = 2;
        }
    }

    public c(@NotNull n20.k widgetStore, @NotNull k stickyItemDiffCallback, @NotNull D viewLifecycleScope, @NotNull He.c backgroundDispatcher, @NotNull I mainDispatcher, boolean z11) {
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(stickyItemDiffCallback, "stickyItemDiffCallback");
        Intrinsics.checkNotNullParameter(viewLifecycleScope, "viewLifecycleScope");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.f21611a = widgetStore;
        this.f21612b = stickyItemDiffCallback;
        this.f21613c = viewLifecycleScope;
        this.f21614d = backgroundDispatcher;
        this.f21615e = mainDispatcher;
        this.f21616f = z11;
        this.f21617g = K.f71697a;
        this.f21618h = new ArrayList();
    }

    public static final Tc.b b(c cVar, List list, kotlin.coroutines.d dVar) {
        cVar.getClass();
        Tc.b builder = C7714v.B();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            E0.f(dVar.getContext());
            i i13 = cVar.i(i11, (l) obj);
            if (i13 != null) {
                builder.add(i13);
            }
            i11 = i12;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final i i(int i11, l lVar) {
        InterfaceC8046a<?, ? extends l20.c> viewMapper = this.f21611a.getViewMapper(lVar.j());
        if (!(viewMapper instanceof ru.ozon.composer.ui.widget.g)) {
            viewMapper = null;
        }
        ru.ozon.composer.ui.widget.g gVar = (ru.ozon.composer.ui.widget.g) viewMapper;
        N10.h stickyWidgetConfig = gVar != null ? gVar.getStickyWidgetConfig(lVar.d()) : null;
        if (stickyWidgetConfig == null) {
            return null;
        }
        return new i(i11, stickyWidgetConfig, lVar);
    }

    public final void f(@NotNull f.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f21618h.add(listener);
    }

    @NotNull
    public final List<i> g() {
        return this.f21617g;
    }

    public final void h(@NotNull List<l> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List<l> list = this.f21619i;
        if (list == items) {
            return;
        }
        List<l> list2 = list;
        if ((list2 == null || list2.isEmpty()) && this.f21620j == null && items.isEmpty()) {
            return;
        }
        List<l> list3 = this.f21619i;
        boolean z11 = (list3 == null || list3.isEmpty()) && this.f21620j == null;
        this.f21619i = items;
        ArrayList arrayList = this.f21618h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        if (!this.f21616f || !z11) {
            B0 b02 = this.f21620j;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            this.f21620j = C10727i.c(this.f21613c, this.f21614d, null, new C0423c(items, null), 2);
            return;
        }
        Tc.b builder = C7714v.B();
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            i i13 = i(i11, (l) obj);
            if (i13 != null) {
                builder.add(i13);
            }
            i11 = i12;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.b newList = builder.B();
        k kVar = this.f21612b;
        List<i> oldList = this.f21617g;
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        i.c a11 = androidx.recyclerview.widget.i.a(new j(oldList, newList, kVar), false);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.f21617g = newList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).b(a11);
        }
    }
}
