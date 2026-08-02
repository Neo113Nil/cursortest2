package Y80;

import B4.C2584m;
import B4.P;
import B90.C2613o;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.D;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kd.C7665d;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l80.C7894a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.bottomnavigation.FintechBottomNavigationView;
import xe.B0;
import xe.C10727i;
import xe.H0;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final FintechBottomNavigationView f34838a;

    /* renamed from: b, reason: collision with root package name */
    private final D f34839b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5434v f34840c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f34841d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final G f34842e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final m f34843f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final l80.e f34844g;

    /* renamed from: h, reason: collision with root package name */
    private final C7894a f34845h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f34846i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f34847j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f34848k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f34849l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final V<C2584m> f34850m;

    /* renamed from: n, reason: collision with root package name */
    private B0 f34851n;

    public k(FintechBottomNavigationView fintechBottomNavigationView, D d11, AbstractC5434v abstractC5434v, @NotNull ArrayList tabGraphIds, @NotNull G fragmentManager, @NotNull m stackWrap, @NotNull l80.e onReselected, C7894a c7894a) {
        Intrinsics.checkNotNullParameter(tabGraphIds, "tabGraphIds");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(stackWrap, "stackWrap");
        Intrinsics.checkNotNullParameter(onReselected, "onReselected");
        this.f34838a = fintechBottomNavigationView;
        this.f34839b = d11;
        this.f34840c = abstractC5434v;
        this.f34841d = tabGraphIds;
        this.f34842e = fragmentManager;
        this.f34843f = stackWrap;
        this.f34844g = onReselected;
        this.f34845h = c7894a;
        this.f34848k = new LinkedHashMap();
        this.f34850m = new V<>();
    }

    public static void a(k kVar, LinkedHashMap linkedHashMap, G g10, l80.e eVar, androidx.appcompat.view.menu.i item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (kVar.f34849l) {
            return;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(item.getItemId()));
        ComponentCallbacksC5392m g02 = g10.g0(str);
        Intrinsics.g(g02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        P v11 = ((E4.k) g02).v();
        v11.O(v11.A().F(), false);
        eVar.invoke(v11, String.valueOf(str), String.valueOf(C7714v.R(linkedHashMap.keySet(), Integer.valueOf(item.getItemId()))));
    }

    public static void b(k kVar) {
        C2584m value = kVar.f34850m.getValue();
        if (value == null || value.y() != null) {
            return;
        }
        value.I(value.A().m(), null);
    }

    public static void c(k kVar, androidx.appcompat.view.menu.i item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (kVar.f34849l) {
            return;
        }
        kVar.t(item.getItemId(), String.valueOf(item.getTitle()), null);
    }

    private static E4.k r(G g10, String str, int i11) {
        Bundle bundle;
        E4.k kVar = (E4.k) g10.g0(str);
        if (kVar != null) {
            return kVar;
        }
        if (i11 != 0) {
            bundle = new Bundle();
            bundle.putInt("android-support-nav:fragment:graphId", i11);
        } else {
            bundle = null;
        }
        E4.k kVar2 = new E4.k();
        if (bundle != null) {
            kVar2.setArguments(bundle);
        }
        Q p11 = g10.p();
        p11.b(R.id.main_activity_host_fragment, kVar2, str);
        p11.m(kVar2);
        p11.l();
        return kVar2;
    }

    public final void k() {
        Iterator it = this.f34841d.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                this.f34846i = null;
                B0 b02 = this.f34851n;
                if (b02 != null) {
                    ((H0) b02).j(null);
                }
                this.f34851n = null;
                this.f34848k.clear();
                this.f34849l = false;
                return;
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ((Number) next).intValue();
            G g10 = this.f34842e;
            ComponentCallbacksC5392m g02 = g10.g0("TAG_TAB#" + i11);
            E4.k kVar = g02 instanceof E4.k ? (E4.k) g02 : null;
            if (kVar != null) {
                for (ComponentCallbacksC5392m componentCallbacksC5392m : kVar.getChildFragmentManager().r0()) {
                    Q p11 = kVar.getChildFragmentManager().p();
                    p11.q(componentCallbacksC5392m);
                    p11.j();
                }
                Q p12 = g10.p();
                p12.q(kVar);
                p12.j();
            }
            i11 = i12;
        }
    }

    public final void l() {
        ComponentCallbacksC5392m g02 = this.f34842e.g0((String) this.f34848k.get(this.f34846i));
        E4.k kVar = g02 instanceof E4.k ? (E4.k) g02 : null;
        this.f34850m.setValue(kVar != null ? kVar.v() : null);
    }

    @NotNull
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        for (Object obj : this.f34841d) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            int intValue = ((Number) obj).intValue();
            String a11 = Ej.b.a(i11, "TAG_TAB#");
            linkedHashMap.put(Integer.valueOf(i11), new ArrayList());
            E4.k r11 = r(this.f34842e, a11, intValue);
            IntRange o11 = kotlin.ranges.h.o(0, r11.getChildFragmentManager().l0());
            ArrayList arrayList = new ArrayList();
            C7665d it = o11.iterator();
            while (it.hasNext()) {
                String name = r11.getChildFragmentManager().k0(it.b()).getName();
                if (name != null) {
                    arrayList.add(name);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ComponentCallbacksC5392m g02 = r11.getChildFragmentManager().g0((String) it2.next());
                if (g02 != null) {
                    arrayList2.add(g02);
                }
            }
            List list = (List) linkedHashMap.get(Integer.valueOf(i11));
            if (list != null) {
                list.addAll(arrayList2);
            }
            i11 = i12;
        }
        return linkedHashMap;
    }

    public final Integer n() {
        return this.f34846i;
    }

    @NotNull
    public final V<C2584m> o() {
        return this.f34850m;
    }

    public final Integer p() {
        return this.f34847j;
    }

    @NotNull
    public final List<Integer> q() {
        return this.f34841d;
    }

    public final void s() {
        ComponentCallbacksC5392m g02 = this.f34842e.g0((String) this.f34848k.get(this.f34846i));
        E4.k kVar = g02 instanceof E4.k ? (E4.k) g02 : null;
        P v11 = kVar != null ? kVar.v() : null;
        if (v11 != null) {
            v11.O(v11.A().F(), false);
        }
    }

    public final void t(int i11, @NotNull String selectedName, G30.a aVar) {
        Intrinsics.checkNotNullParameter(selectedName, "selectedName");
        B0 b02 = this.f34851n;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f34851n = C10727i.c(this.f34839b, null, null, new j(this, i11, selectedName, aVar, null), 3);
    }

    public final void u(G30.a aVar) {
        Integer num = (Integer) C7714v.M(this.f34841d);
        if (num != null) {
            t(num.intValue(), "", aVar);
        }
    }

    public final void v(Integer num) {
        this.f34846i = num;
    }

    public final void w(Integer num) {
        this.f34847j = num;
    }

    public final void x() {
        Iterator it = this.f34841d.iterator();
        int i11 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.f34848k;
            G g10 = this.f34842e;
            if (!hasNext) {
                FintechBottomNavigationView fintechBottomNavigationView = this.f34838a;
                fintechBottomNavigationView.setOnNavigationItemSelectedListener(new C2613o(this, 3));
                fintechBottomNavigationView.setOnNavigationItemReselectedListener(new i(this, linkedHashMap, g10, this.f34844g));
                g10.k(new G.p() { // from class: Y80.h
                    @Override // androidx.fragment.app.G.p
                    public final void onBackStackChanged() {
                        k.b(k.this);
                    }
                });
                return;
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            int intValue = ((Number) next).intValue();
            String a11 = Ej.b.a(i11, "TAG_TAB#");
            r(g10, a11, intValue);
            linkedHashMap.put(Integer.valueOf(intValue), a11);
            i11 = i12;
        }
    }
}
