package Y80;

import Sc.s;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.E;
import androidx.lifecycle.I0;
import fd.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l80.C7894a;
import ru.ozon.app.android.R;
import xe.C10720e0;
import xe.L0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.navjet.JetNavBottomController$selectGraph$1", f = "JetNavBottomController.kt", l = {323}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f34821d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f34822e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f34823f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f34824g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ G30.a f34825h;

    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f34826a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E4.k f34827b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34828c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G30.a f34829d;

        a(k kVar, E4.k kVar2, int i11, G30.a aVar) {
            this.f34826a = kVar;
            this.f34827b = kVar2;
            this.f34828c = i11;
            this.f34829d = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar;
            com.google.android.material.bottomnavigation.c cVar;
            k kVar = this.f34826a;
            kVar.o().setValue(this.f34827b.v());
            List<Integer> q11 = kVar.q();
            int i11 = this.f34828c;
            if (((ArrayList) q11).contains(Integer.valueOf(i11))) {
                kVar.f34849l = true;
                cVar = kVar.f34838a;
                cVar.setSelectedItemId(i11);
                kVar.f34849l = false;
            }
            mVar = kVar.f34843f;
            Integer num = (Integer) C7714v.M(kVar.q());
            mVar.b(num == null || i11 != num.intValue());
            G30.a aVar = this.f34829d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f34830a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E4.k f34831b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34832c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G30.a f34833d;

        b(k kVar, E4.k kVar2, int i11, G30.a aVar) {
            this.f34830a = kVar;
            this.f34831b = kVar2;
            this.f34832c = i11;
            this.f34833d = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar;
            com.google.android.material.bottomnavigation.c cVar;
            k kVar = this.f34830a;
            kVar.o().setValue(this.f34831b.v());
            List<Integer> q11 = kVar.q();
            int i11 = this.f34832c;
            if (((ArrayList) q11).contains(Integer.valueOf(i11))) {
                kVar.f34849l = true;
                cVar = kVar.f34838a;
                cVar.setSelectedItemId(i11);
                kVar.f34849l = false;
            }
            mVar = kVar.f34843f;
            Integer num = (Integer) C7714v.M(kVar.q());
            mVar.b(num == null || i11 != num.intValue());
            G30.a aVar = this.f34833d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f34834b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34835c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f34836d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ G30.a f34837e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar, int i11, String str, G30.a aVar) {
            super(0);
            this.f34834b = kVar;
            this.f34835c = i11;
            this.f34836d = str;
            this.f34837e = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            G g10;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            com.google.android.material.bottomnavigation.c cVar;
            LinkedHashMap linkedHashMap3;
            LinkedHashMap linkedHashMap4;
            G g11;
            G g12;
            p pVar;
            com.google.android.material.bottomnavigation.c cVar2;
            G g13;
            G g14;
            G g15;
            G g16;
            com.google.android.material.bottomnavigation.c cVar3;
            k kVar = this.f34834b;
            g10 = kVar.f34842e;
            if (!g10.H0()) {
                linkedHashMap = kVar.f34848k;
                int i11 = this.f34835c;
                String str = (String) linkedHashMap.get(Integer.valueOf(i11));
                linkedHashMap2 = kVar.f34848k;
                String str2 = (String) linkedHashMap2.get(kVar.n());
                boolean d11 = Intrinsics.d(str2, str);
                G30.a aVar = this.f34837e;
                if (d11) {
                    if (((ArrayList) kVar.q()).contains(Integer.valueOf(i11))) {
                        kVar.f34849l = true;
                        cVar = kVar.f34838a;
                        cVar.setSelectedItemId(i11);
                        kVar.f34849l = false;
                    }
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    linkedHashMap3 = kVar.f34848k;
                    int R11 = C7714v.R(linkedHashMap3.keySet(), kVar.n());
                    linkedHashMap4 = kVar.f34848k;
                    int R12 = C7714v.R(linkedHashMap4.keySet(), Integer.valueOf(i11));
                    kVar.v(Integer.valueOf(i11));
                    kVar.w(Integer.valueOf(R12));
                    g11 = kVar.f34842e;
                    ComponentCallbacksC5392m g02 = g11.g0(str);
                    CharSequence charSequence = null;
                    E4.k kVar2 = g02 instanceof E4.k ? (E4.k) g02 : null;
                    if (kVar2 != null) {
                        g12 = kVar.f34842e;
                        ComponentCallbacksC5392m g03 = g12.g0(str2);
                        pVar = kVar.f34845h;
                        String str3 = str == null ? "" : str;
                        String str4 = str2 == null ? "" : str2;
                        cVar2 = kVar.f34838a;
                        Menu menu = cVar2.getMenu();
                        if (menu != null) {
                            cVar3 = kVar.f34838a;
                            MenuItem findItem = menu.findItem(cVar3.getSelectedItemId());
                            if (findItem != null) {
                                charSequence = findItem.getTitle();
                            }
                        }
                        ((C7894a) pVar).invoke(str3, this.f34836d, str4, String.valueOf(charSequence), Integer.valueOf(R12));
                        try {
                            if (g03 == null) {
                                g15 = kVar.f34842e;
                                Q p11 = g15.p();
                                p11.h(kVar2);
                                p11.v(kVar2);
                                p11.w();
                                p11.s(new a(kVar, kVar2, i11, aVar));
                                p11.l();
                                g16 = kVar.f34842e;
                                g16.c0();
                            } else {
                                g13 = kVar.f34842e;
                                Q p12 = g13.p();
                                boolean z11 = R12 > R11;
                                Pair pair = z11 ? new Pair(Integer.valueOf(R.anim.slide_in_right), Integer.valueOf(R.anim.slide_out_left)) : new Pair(Integer.valueOf(R.anim.slide_in_left), Integer.valueOf(R.anim.slide_out_right));
                                int intValue = ((Number) pair.a()).intValue();
                                int intValue2 = ((Number) pair.b()).intValue();
                                Pair pair2 = z11 ? new Pair(Integer.valueOf(R.anim.slide_in_left), Integer.valueOf(R.anim.slide_out_right)) : new Pair(Integer.valueOf(R.anim.slide_in_right), Integer.valueOf(R.anim.slide_out_left));
                                p12.t(intValue, intValue2, ((Number) pair2.a()).intValue(), ((Number) pair2.b()).intValue());
                                p12.m(g03);
                                p12.h(kVar2);
                                p12.v(kVar2);
                                p12.w();
                                p12.s(new b(kVar, kVar2, i11, aVar));
                                p12.l();
                                g14 = kVar.f34842e;
                                g14.c0();
                            }
                        } catch (Exception e11) {
                            L80.a.b("JetNav", "error select graph e=" + e11);
                            Unit unit = Unit.f71690a;
                        }
                    }
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, int i11, String str, G30.a aVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f34822e = kVar;
        this.f34823f = i11;
        this.f34824g = str;
        this.f34825h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f34822e, this.f34823f, this.f34824g, this.f34825h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010f A[Catch: Exception -> 0x0134, TRY_ENTER, TryCatch #0 {Exception -> 0x0134, blocks: (B:39:0x010f, B:40:0x0137, B:45:0x0151, B:46:0x0170, B:48:0x0186, B:49:0x01a6, B:50:0x0196, B:51:0x0161), top: B:37:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0137 A[Catch: Exception -> 0x0134, TryCatch #0 {Exception -> 0x0134, blocks: (B:39:0x010f, B:40:0x0137, B:45:0x0151, B:46:0x0170, B:48:0x0186, B:49:0x01a6, B:50:0x0196, B:51:0x0161), top: B:37:0x010d }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC5434v abstractC5434v;
        G g10;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        com.google.android.material.bottomnavigation.c cVar;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        G g11;
        G g12;
        p pVar;
        com.google.android.material.bottomnavigation.c cVar2;
        CharSequence charSequence;
        G g13;
        G g14;
        G g15;
        G g16;
        com.google.android.material.bottomnavigation.c cVar3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f34821d;
        boolean z11 = true;
        if (i11 == 0) {
            s.b(obj);
            k kVar = this.f34822e;
            abstractC5434v = kVar.f34840c;
            if (abstractC5434v != null) {
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 x11 = De.s.f6650a.x();
                boolean t2 = x11.t(getContext());
                String str = this.f34824g;
                int i12 = this.f34823f;
                G30.a aVar2 = this.f34825h;
                if (!t2) {
                    if (abstractC5434v.b() == AbstractC5434v.b.DESTROYED) {
                        throw new E(null);
                    }
                    if (abstractC5434v.b().compareTo(bVar) >= 0) {
                        g10 = kVar.f34842e;
                        if (!g10.H0()) {
                            linkedHashMap = kVar.f34848k;
                            String str2 = (String) linkedHashMap.get(new Integer(i12));
                            linkedHashMap2 = kVar.f34848k;
                            String str3 = (String) linkedHashMap2.get(kVar.n());
                            if (Intrinsics.d(str3, str2)) {
                                if (((ArrayList) kVar.q()).contains(new Integer(i12))) {
                                    kVar.f34849l = true;
                                    cVar = kVar.f34838a;
                                    cVar.setSelectedItemId(i12);
                                    kVar.f34849l = false;
                                }
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                }
                            } else {
                                linkedHashMap3 = kVar.f34848k;
                                int R11 = C7714v.R(linkedHashMap3.keySet(), kVar.n());
                                linkedHashMap4 = kVar.f34848k;
                                int R12 = C7714v.R(linkedHashMap4.keySet(), new Integer(i12));
                                kVar.v(new Integer(i12));
                                kVar.w(new Integer(R12));
                                g11 = kVar.f34842e;
                                ComponentCallbacksC5392m g02 = g11.g0(str2);
                                E4.k kVar2 = g02 instanceof E4.k ? (E4.k) g02 : null;
                                if (kVar2 != null) {
                                    g12 = kVar.f34842e;
                                    ComponentCallbacksC5392m g03 = g12.g0(str3);
                                    pVar = kVar.f34845h;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    cVar2 = kVar.f34838a;
                                    Menu menu = cVar2.getMenu();
                                    try {
                                        if (menu != null) {
                                            cVar3 = kVar.f34838a;
                                            MenuItem findItem = menu.findItem(cVar3.getSelectedItemId());
                                            if (findItem != null) {
                                                charSequence = findItem.getTitle();
                                                String str4 = str2;
                                                E4.k kVar3 = kVar2;
                                                ((C7894a) pVar).invoke(str4, str, str3, String.valueOf(charSequence), new Integer(R12));
                                                if (g03 != null) {
                                                    g15 = kVar.f34842e;
                                                    Q p11 = g15.p();
                                                    p11.h(kVar3);
                                                    p11.v(kVar3);
                                                    p11.w();
                                                    p11.s(new a(kVar, kVar3, i12, aVar2));
                                                    p11.l();
                                                    g16 = kVar.f34842e;
                                                    g16.c0();
                                                } else {
                                                    g13 = kVar.f34842e;
                                                    Q p12 = g13.p();
                                                    if (R12 <= R11) {
                                                        z11 = false;
                                                    }
                                                    Pair pair = z11 ? new Pair(new Integer(R.anim.slide_in_right), new Integer(R.anim.slide_out_left)) : new Pair(new Integer(R.anim.slide_in_left), new Integer(R.anim.slide_out_right));
                                                    int intValue = ((Number) pair.a()).intValue();
                                                    int intValue2 = ((Number) pair.b()).intValue();
                                                    Pair pair2 = z11 ? new Pair(new Integer(R.anim.slide_in_left), new Integer(R.anim.slide_out_right)) : new Pair(new Integer(R.anim.slide_in_right), new Integer(R.anim.slide_out_left));
                                                    p12.t(intValue, intValue2, ((Number) pair2.a()).intValue(), ((Number) pair2.b()).intValue());
                                                    p12.m(g03);
                                                    p12.h(kVar3);
                                                    p12.v(kVar3);
                                                    p12.w();
                                                    p12.s(new b(kVar, kVar3, i12, aVar2));
                                                    p12.l();
                                                    g14 = kVar.f34842e;
                                                    g14.c0();
                                                }
                                            }
                                        }
                                        if (g03 != null) {
                                        }
                                    } catch (Exception e11) {
                                        L80.a.b("JetNav", "error select graph e=" + e11);
                                        Unit unit = Unit.f71690a;
                                    }
                                    charSequence = null;
                                    String str42 = str2;
                                    E4.k kVar32 = kVar2;
                                    ((C7894a) pVar).invoke(str42, str, str3, String.valueOf(charSequence), new Integer(R12));
                                }
                            }
                        }
                        Unit unit2 = Unit.f71690a;
                    }
                }
                c cVar4 = new c(kVar, i12, str, aVar2);
                this.f34821d = 1;
                if (I0.a(abstractC5434v, bVar, t2, x11, cVar4, this) == aVar) {
                    return aVar;
                }
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
