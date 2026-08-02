package Vf0;

import Sc.InterfaceC4008j;
import Sc.s;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.InterfaceC8918a;
import ru.ozon.app.android.R;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolLibsApi;
import ru.ozon.app.android.abtool.AbToolNamespace;
import xb0.InterfaceC10696a;
import xb0.InterfaceC10697b;
import zb0.AbstractC11016a;

/* loaded from: classes7.dex */
public final class h implements InterfaceC8918a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.c f32710a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f32711b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f32712c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f32713d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f32714e;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<Set<? extends String>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Set<? extends String> invoke() {
            String[] stringArray = h.this.f32710a.c().a().getResources().getStringArray(R.array.prod_extra_headers_whitelist);
            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
            return C7705l.j0(stringArray);
        }
    }

    static final class b extends AbstractC7737t implements Function0<AbstractC11016a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC11016a invoke() {
            return ((InterfaceC10697b) h.this.f32710a.e(InterfaceC10696a.class)).M();
        }
    }

    static final class c extends AbstractC7737t implements Function0<e> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final e invoke() {
            Context applicationContext = h.this.f32710a.c().a().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return new e(applicationContext);
        }
    }

    static final class d extends AbstractC7737t implements Function0<List<? extends URI>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends URI> invoke() {
            List m11 = kotlin.text.h.m(((AbToolLibsApi) h.this.f32710a.e(AbToolBaseApi.class)).getString("ozon_second_level_domains", "ozon_network", AbToolNamespace.PLATFORM_MOBILE), new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : m11) {
                if (!kotlin.text.h.K((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new URI(Nk.a.b("https://", (String) it.next())));
            }
            return arrayList2;
        }
    }

    public h(@NotNull Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f32710a = store;
        this.f32711b = Sc.k.b(new a());
        this.f32712c = Sc.k.b(new d());
        this.f32713d = Sc.k.b(new b());
        this.f32714e = Sc.k.b(new c());
    }

    private final e i() {
        return (e) this.f32714e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        if (r2.k("x-o3-meshversion", r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r2.k("x-o3-internal-headers-token", r8, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(kotlin.coroutines.jvm.internal.c cVar) {
        k kVar;
        int i11;
        h hVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i12 = kVar.f32730g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                kVar.f32730g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = kVar.f32728e;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = kVar.f32730g;
                if (i11 != 0) {
                    s.b(obj);
                    e i13 = i();
                    kVar.f32727d = this;
                    kVar.f32730g = 1;
                    obj = i13.e(kVar);
                    if (obj != obj2) {
                        hVar = this;
                    }
                    return obj2;
                }
                if (i11 == 1) {
                    hVar = kVar.f32727d;
                    s.b(obj);
                } else if (i11 == 2) {
                    hVar = kVar.f32727d;
                    s.b(obj);
                    e i14 = hVar.i();
                    kVar.f32727d = hVar;
                    kVar.f32730g = 3;
                    obj = i14.e(kVar);
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    hVar = kVar.f32727d;
                    s.b(obj);
                    String str = (String) ((Map) obj).get("x-o3-meshversion");
                    kVar.f32727d = null;
                    kVar.f32730g = 4;
                }
                String str2 = (String) ((Map) obj).get("x-o3-internal-headers-token");
                kVar.f32727d = hVar;
                kVar.f32730g = 2;
            }
        }
        kVar = new k(this, cVar);
        Object obj3 = kVar.f32728e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = kVar.f32730g;
        if (i11 != 0) {
        }
        String str22 = (String) ((Map) obj3).get("x-o3-internal-headers-token");
        kVar.f32727d = hVar;
        kVar.f32730g = 2;
    }

    private final Object k(String str, String str2, kotlin.coroutines.d<? super Unit> dVar) {
        if (str2 == null || str2.length() == 0) {
            ((AbstractC11016a) this.f32713d.getValue()).a((List) this.f32712c.getValue(), e0.h(str));
            return Unit.f71690a;
        }
        Object l11 = l(str, (kotlin.coroutines.jvm.internal.c) dVar);
        return l11 == Wc.a.COROUTINE_SUSPENDED ? l11 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        int i11;
        h hVar;
        String str2;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i12 = lVar.f32735h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lVar.f32735h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = lVar.f32733f;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = lVar.f32735h;
                if (i11 != 0) {
                    s.b(obj);
                    e i13 = i();
                    lVar.f32731d = this;
                    lVar.f32732e = str;
                    lVar.f32735h = 1;
                    obj = i13.e(lVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    hVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = lVar.f32732e;
                    hVar = lVar.f32731d;
                    s.b(obj);
                }
                str2 = (String) ((Map) obj).get(str);
                if (str2 == null) {
                    str2 = "";
                }
                ((AbstractC11016a) hVar.f32713d.getValue()).c(C7714v.a0(new m(str, str2)), (List) hVar.f32712c.getValue());
                return Unit.f71690a;
            }
        }
        lVar = new l(this, cVar);
        Object obj3 = lVar.f32733f;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = lVar.f32735h;
        if (i11 != 0) {
        }
        str2 = (String) ((Map) obj3).get(str);
        if (str2 == null) {
        }
        ((AbstractC11016a) hVar.f32713d.getValue()).c(C7714v.a0(new m(str, str2)), (List) hVar.f32712c.getValue());
        return Unit.f71690a;
    }

    @Override // pf0.InterfaceC8918a
    public final Serializable a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return i().e(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r2.j(r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // pf0.InterfaceC8918a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        int i11;
        h hVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i12 = jVar.f32726g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f32726g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f32724e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar.f32726g;
                if (i11 != 0) {
                    s.b(obj);
                    if (o.a(this.f32710a)) {
                        return Unit.f71690a;
                    }
                    e i13 = i();
                    jVar.f32723d = this;
                    jVar.f32726g = 1;
                    if (i13.d(jVar) != aVar) {
                        hVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                hVar = jVar.f32723d;
                s.b(obj);
                jVar.f32723d = null;
                jVar.f32726g = 2;
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f32724e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar.f32726g;
        if (i11 != 0) {
        }
        jVar.f32723d = null;
        jVar.f32726g = 2;
    }

    @Override // pf0.InterfaceC8918a
    public final Object c(@NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object e11 = e(U.i(new Pair(str, str2)), jVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r6.j(r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // pf0.InterfaceC8918a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        i iVar;
        int i11;
        h hVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i12 = iVar.f32722g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                iVar.f32722g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = iVar.f32720e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = iVar.f32722g;
                if (i11 != 0) {
                    s.b(obj);
                    if (o.a(this.f32710a)) {
                        return Unit.f71690a;
                    }
                    e i13 = i();
                    iVar.f32719d = this;
                    iVar.f32722g = 1;
                    if (i13.c(str, iVar) != aVar) {
                        hVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                hVar = iVar.f32719d;
                s.b(obj);
                iVar.f32719d = null;
                iVar.f32722g = 2;
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f32720e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = iVar.f32722g;
        if (i11 != 0) {
        }
        iVar.f32719d = null;
        iVar.f32722g = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        if (r8.j(r0) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // pf0.InterfaceC8918a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull Map map, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        int i11;
        h hVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i12 = nVar.f32741g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                nVar.f32741g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = nVar.f32739e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = nVar.f32741g;
                if (i11 != 0) {
                    s.b(obj);
                    Ld0.c cVar2 = this.f32710a;
                    if (o.a(cVar2)) {
                        return Unit.f71690a;
                    }
                    if (cVar2.c().b() == Nd0.b.RELEASE) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (((Set) this.f32711b.getValue()).contains((String) entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        map = linkedHashMap;
                    }
                    e i13 = i();
                    nVar.f32738d = this;
                    nVar.f32741g = 1;
                    if (i13.g(map, nVar) != aVar) {
                        hVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                hVar = nVar.f32738d;
                s.b(obj);
                nVar.f32738d = null;
                nVar.f32741g = 2;
            }
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.f32739e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = nVar.f32741g;
        if (i11 != 0) {
        }
        nVar.f32738d = null;
        nVar.f32741g = 2;
    }
}
