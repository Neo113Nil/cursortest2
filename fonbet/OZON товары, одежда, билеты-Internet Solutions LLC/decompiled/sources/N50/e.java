package N50;

import Ae.C0;
import Ae.E0;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import B0.A0;
import C.J;
import Sc.C4005g;
import Sc.s;
import T7.E;
import android.app.Application;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerItem;
import com.detmir.recycli.adapters.ScrollKeeper;
import h3.C6788a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.demo.ui.account.DemoAccountItem;
import ru.ozon.fintech.features.demo.ui.account.DemoAccountItemView;
import ru.ozon.fintech.features.demo.ui.income.DemoIncomeItem;
import ru.ozon.fintech.features.demo.ui.message.DemoMessageItem;
import ru.ozon.fintech.network.models.a;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.button.small.FinSmallButtonState;
import ru.ozon.fintech.ui.container.RecyclerContainerItem;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class e extends E30.d implements ScrollKeeper.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ScrollKeeper.b f18709a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final M50.c f18710b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f18711c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Application f18712d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final K40.a f18713e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final x0<List<RecyclerItem>> f18714f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<FinToolbarState> f18715g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<ScreenState> f18716h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final x0<FinLargeButtonState> f18717i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f18718j;

    /* renamed from: k, reason: collision with root package name */
    private Map<String, ? extends List<Integer>> f18719k;

    /* renamed from: l, reason: collision with root package name */
    private List<String> f18720l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private ru.ozon.fintech.network.models.a f18721m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private ru.ozon.fintech.network.models.a f18722n;

    /* renamed from: o, reason: collision with root package name */
    private String f18723o;

    /* renamed from: p, reason: collision with root package name */
    private Integer f18724p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final C0 f18725q;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoViewModel$1", f = "DemoViewModel.kt", l = {132}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f18726d;

        /* renamed from: N50.e$a$a, reason: collision with other inner class name */
        static final class C0360a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f18728a;

            C0360a(e eVar) {
                this.f18728a = eVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                ((Boolean) obj).booleanValue();
                this.f18728a.handleState();
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f18726d;
            if (i11 == 0) {
                s.b(obj);
                e eVar = e.this;
                C0 g10 = eVar.f18710b.g();
                C0360a c0360a = new C0360a(eVar);
                this.f18726d = 1;
                if (g10.collect(c0360a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoViewModel$handleState$1", f = "DemoViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            long currentTimeMillis = System.currentTimeMillis();
            L80.a.a("DemoViewModel", "handleState START");
            e eVar = e.this;
            eVar.C0().setValue(e.p0(eVar));
            eVar.B0().setValue(Boolean.valueOf(e.n0(eVar)));
            eVar.z0().setValue(e.m0(eVar));
            eVar.D0().setValue(e.r0(eVar));
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(e.l0(eVar));
            RecyclerItem j02 = e.j0(eVar);
            if (j02 != null) {
                arrayList.add(j02);
            }
            arrayList.addAll(e.k0(eVar));
            eVar.A0().setValue(arrayList);
            L80.a.a("DemoViewModel", "handleState DONE in " + (System.currentTimeMillis() - currentTimeMillis));
            return Unit.f71690a;
        }
    }

    public e(@NotNull M50.c demoInteractor, @NotNull S80.b fintechNavigation, @NotNull Application application, @NotNull K40.a cbottomDisplay) {
        Intrinsics.checkNotNullParameter(demoInteractor, "demoInteractor");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        this.f18709a = new ScrollKeeper.b();
        this.f18710b = demoInteractor;
        this.f18711c = fintechNavigation;
        this.f18712d = application;
        this.f18713e = cbottomDisplay;
        this.f18714f = O0.a(K.f71697a);
        this.f18715g = O0.a(FinToolbarState.INSTANCE.getEMPTY());
        this.f18716h = O0.a(null);
        this.f18717i = O0.a(null);
        this.f18718j = O0.a(Boolean.FALSE);
        a.b bVar = a.b.f96629a;
        this.f18721m = bVar;
        this.f18722n = bVar;
        this.f18725q = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new a(null), 3);
    }

    public static RecyclerContainerItem d0(e eVar, List list, Map accountsSafe) {
        RecyclerView.n nVar;
        List<Integer> list2;
        e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(accountsSafe, "accountsSafe");
        DemoAccountItemView.INSTANCE.getClass();
        nVar = DemoAccountItemView.accountsDecoration;
        List a02 = C7714v.a0(nVar);
        ScrollKeeper L11 = eVar2.L("accounts");
        ArrayList arrayList = new ArrayList(accountsSafe.size());
        for (Map.Entry entry : accountsSafe.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getKey();
            Map<String, ? extends List<Integer>> map = eVar2.f18719k;
            if (map == null || (list2 = map.get(str3)) == null) {
                list2 = K.f71697a;
            }
            arrayList.add(new DemoAccountItem(str, str2, Ej.b.a(C7714v.J0(list2), "На счету "), Intrinsics.d(entry.getKey(), eVar2.f18723o), new FinSmallButtonState((String) entry.getKey(), "Удалить", null, new f(1, eVar2, e.class, "deleteAccountDialog", "deleteAccountDialog(Ljava/lang/String;)V", 0), FinSmallButtonState.Type.DANGER, Integer.valueOf(R.drawable.ic_m_cross), 4, null), new g(1, eVar, e.class, "accountSelected", "accountSelected(Ljava/lang/String;)V", 0)));
            eVar2 = eVar;
        }
        return new RecyclerContainerItem("accounts", L11, false, true, null, arrayList, null, null, null, null, a02, null, null, null, 15316, null);
    }

    public static ArrayList e0(e eVar, List incomesList, String selectedAccountId) {
        Intrinsics.checkNotNullParameter(incomesList, "incomesList");
        Intrinsics.checkNotNullParameter(selectedAccountId, "selectedAccountId");
        List list = incomesList;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(new DemoIncomeItem(Ej.b.a(i11, "income_"), i11, eVar.f18710b.f(i11, selectedAccountId), new FinSmallButtonState(String.valueOf(i11), "Пополнить", null, new h(1, eVar, e.class, "plusIncome", "plusIncome(Ljava/lang/String;)V", 0), null, null, 52, null), E.a(((Number) obj).intValue(), "Входящий ", " Р.")));
            i11 = i12;
        }
        return arrayList;
    }

    public static final void f0(e eVar, String str) {
        if (Intrinsics.d(str, eVar.f18723o)) {
            str = null;
        }
        eVar.f18723o = str;
        eVar.handleState();
    }

    public static final void g0(e eVar, String str) {
        eVar.f18725q.tryEmit(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState() {
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new b(null), 2);
    }

    public static final void i0(e eVar) {
        Integer num = eVar.f18724p;
        if (num != null) {
            eVar.f18711c.l0(num.intValue() + 1);
        }
    }

    public static final RecyclerItem j0(final e eVar) {
        return (RecyclerItem) E30.g.a(new Function2() { // from class: N50.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return e.d0(e.this, (List) obj, (Map) obj2);
            }
        }, eVar.f18720l, eVar.f18719k);
    }

    public static final List k0(final e eVar) {
        Map<String, ? extends List<Integer>> map = eVar.f18719k;
        List list = (List) E30.g.a(new Function2() { // from class: N50.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return e.e0(e.this, (List) obj, (String) obj2);
            }
        }, map != null ? map.get(eVar.f18723o) : null, eVar.f18723o);
        return list == null ? K.f71697a : list;
    }

    public static final List l0(final e eVar) {
        List list = (List) E30.g.a(new Function2() { // from class: N50.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                List messagesSafe = (List) obj;
                Intrinsics.checkNotNullParameter(messagesSafe, "messagesSafe");
                Intrinsics.checkNotNullParameter((Map) obj2, "<unused var>");
                List<String> list2 = messagesSafe;
                ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                for (String str : list2) {
                    arrayList.add(new DemoMessageItem(str, str, Nk.a.b("Сообщение ", str), new i(1, e.this, e.class, "messageClicked", "messageClicked(Ljava/lang/String;)V", 0)));
                }
                return arrayList;
            }
        }, eVar.f18720l, eVar.f18719k);
        return list == null ? K.f71697a : list;
    }

    public static final FinLargeButtonState m0(e eVar) {
        Integer num = eVar.f18724p;
        return new FinLargeButtonState("next", Ej.b.a((num != null ? num.intValue() : 0) + 1, "Перейти к screenID "), null, new j(1, eVar, e.class, "gotoNext", "gotoNext(Ljava/lang/String;)V", 0), null, null, null, null, null, CounterView.COUNTER_MAX_DEFAULT, null);
    }

    public static final boolean n0(e eVar) {
        List<String> list;
        Map<String, ? extends List<Integer>> map = eVar.f18719k;
        return ((map != null && (map.isEmpty() ^ true)) || ((list = eVar.f18720l) != null && (list.isEmpty() ^ true))) && Intrinsics.d(eVar.f18722n, a.c.f96630a);
    }

    public static final ScreenState p0(e eVar) {
        List<String> list;
        List<String> list2;
        Map<String, ? extends List<Integer>> map = eVar.f18719k;
        boolean z11 = map == null || map.isEmpty() || (list2 = eVar.f18720l) == null || list2.isEmpty();
        Map<String, ? extends List<Integer>> map2 = eVar.f18719k;
        boolean z12 = map2 != null && map2.isEmpty() && (list = eVar.f18720l) != null && list.isEmpty();
        ru.ozon.fintech.network.models.a aVar = eVar.f18721m;
        boolean z13 = (aVar instanceof a.C2102a) || (eVar.f18722n instanceof a.C2102a);
        a.c cVar = a.c.f96630a;
        boolean z14 = Intrinsics.d(aVar, cVar) || Intrinsics.d(eVar.f18722n, cVar);
        ru.ozon.fintech.network.models.a aVar2 = eVar.f18721m;
        a.b bVar = a.b.f96629a;
        boolean z15 = Intrinsics.d(aVar2, bVar) || Intrinsics.d(eVar.f18722n, bVar);
        if (z11 && z14) {
            return new ScreenState.Progress(0L, null, 3, null);
        }
        Application application = eVar.f18712d;
        if (z11 && z13) {
            return ScreenState.INSTANCE.getNetworkError(new k(0, eVar, e.class, "onErrorOrEmpty", "onErrorOrEmpty()V", 0), application);
        }
        if (z12 && z15) {
            return ScreenState.INSTANCE.getGeneralEmpty(application, new l(0, eVar, e.class, "onErrorOrEmpty", "onErrorOrEmpty()V", 0));
        }
        return null;
    }

    public static final FinToolbarState r0(e eVar) {
        Collection<? extends List<Integer>> collection;
        eVar.getClass();
        String b11 = J.b(eVar.f18724p, "Экран ");
        Map<String, ? extends List<Integer>> map = eVar.f18719k;
        int i11 = 0;
        int size = map != null ? map.size() : 0;
        Map<String, ? extends List<Integer>> map2 = eVar.f18719k;
        if (map2 == null || (collection = map2.values()) == null) {
            collection = K.f71697a;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            i11 += C7714v.J0((List) it.next());
        }
        return new FinToolbarState(b11, A0.a(size, i11, "Аккаунтов ", ", рублей "), null, null, null, null, null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new m(0, eVar.f18711c, S80.b.class, "pop", "pop()V", 0), null, null, null, null, 17, 61948, null);
    }

    public static final void s0(e eVar, String str) {
        K40.a aVar = eVar.f18713e;
        aVar.g(K40.b.h(aVar.creator(), str, 0, 30), CbottomType.SNACK, "", null);
    }

    public static final void t0(e eVar, String str) {
        String str2 = eVar.f18723o;
        if (str2 != null) {
            eVar.f18710b.h(Integer.parseInt(str), str2);
        }
    }

    @NotNull
    public final x0<List<RecyclerItem>> A0() {
        return this.f18714f;
    }

    @NotNull
    public final x0<Boolean> B0() {
        return this.f18718j;
    }

    @NotNull
    public final x0<ScreenState> C0() {
        return this.f18716h;
    }

    @NotNull
    public final x0<FinToolbarState> D0() {
        return this.f18715g;
    }

    public final void E0(int i11) {
        this.f18724p = Integer.valueOf(i11);
        handleState();
        F0(false);
    }

    public final void F0(boolean z11) {
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b bVar = He.b.f10879b;
        C10727i.c(a11, bVar, null, new n(this, z11, null), 2);
        C10727i.c(androidx.lifecycle.x0.a(this), bVar, null, new o(this, z11, null), 2);
    }

    @Override // com.detmir.recycli.adapters.ScrollKeeper.a
    @NotNull
    public final ScrollKeeper L(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.f18709a.L(id2);
    }

    public final void deleteAccount(@NotNull String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f18710b.c(accountId);
        if (Intrinsics.d(this.f18723o, accountId)) {
            this.f18723o = null;
        }
        handleState();
    }

    @NotNull
    public final C0 y0() {
        return this.f18725q;
    }

    @NotNull
    public final x0<FinLargeButtonState> z0() {
        return this.f18717i;
    }
}
