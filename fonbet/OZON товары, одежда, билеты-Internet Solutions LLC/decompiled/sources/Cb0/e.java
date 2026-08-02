package Cb0;

import Cb0.g;
import Sc.InterfaceC4008j;
import dc0.C6144H;
import dc0.C6171q;
import dc0.C6179y;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zb0.AbstractC11016a;

/* loaded from: classes7.dex */
public final class e extends AbstractC11016a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Fb0.e f4634b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<i> f4635c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Tc.j f4636d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4637e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4638f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f4639g;

    static final class a extends AbstractC7737t implements Function1<zb0.e, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f4640b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList arrayList) {
            super(1);
            this.f4640b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(zb0.e eVar) {
            zb0.e cookie = eVar;
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            return Boolean.valueOf(this.f4640b.contains(cookie.getName()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(@NotNull InterfaceC4008j localCookieDataSourceLazy, @NotNull Fb0.e primaryDomain, @NotNull InterfaceC4008j networkCookieEventsImpl, @NotNull Tc.j unmodifiableCookieNames) {
        super(r0);
        Intrinsics.checkNotNullParameter(localCookieDataSourceLazy, "localCookieDataSourceLazy");
        Intrinsics.checkNotNullParameter(primaryDomain, "primaryDomain");
        Intrinsics.checkNotNullParameter(networkCookieEventsImpl, "networkCookieEventsImpl");
        Intrinsics.checkNotNullParameter(unmodifiableCookieNames, "unmodifiableCookieNames");
        URI create = URI.create(primaryDomain.i());
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        this.f4634b = primaryDomain;
        this.f4635c = networkCookieEventsImpl;
        this.f4636d = unmodifiableCookieNames;
        this.f4637e = Sc.k.b(new d(this));
        this.f4638f = localCookieDataSourceLazy;
        this.f4639g = new LinkedHashSet();
    }

    public static void h(e eVar, List list) {
        eVar.g(list, C7714v.a0((URI) eVar.f4637e.getValue()), false);
    }

    private static boolean i(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                return false;
            }
        }
        return true;
    }

    @Override // zb0.AbstractC11016a
    public final void a(@NotNull List domains, @NotNull Set cookieNames) {
        Intrinsics.checkNotNullParameter(cookieNames, "cookieNames");
        Intrinsics.checkNotNullParameter(domains, "domains");
        if (cookieNames.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : cookieNames) {
            if (this.f4636d.contains(obj.toString())) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.a();
        List list2 = (List) pair.b();
        if (this.f4634b.n()) {
            List list3 = list;
            if (C7714v.s(list3)) {
                throw new AssertionError(Nk.a.b("Attempt to change unmodifiable cookies: ", C7714v.V(list3, null, "[", "]", new b(), 25)));
            }
        }
        if (list2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (i((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = this.f4639g;
        final a aVar = new a(arrayList3);
        linkedHashSet.removeIf(new Predicate() { // from class: Cb0.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj3) {
                return ((Boolean) Function1.this.invoke(obj3)).booleanValue();
            }
        });
        Iterator it = domains.iterator();
        while (it.hasNext()) {
            ((C6144H) this.f4638f.getValue()).f((URI) it.next(), arrayList3);
        }
    }

    @Override // zb0.AbstractC11016a
    public final void c(@NotNull List<? extends zb0.e> cookies, @NotNull List<URI> domains) {
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(domains, "domains");
        g(cookies, domains, true);
    }

    public final void f() {
        h(this, C7714v.U0(this.f4639g));
        this.f4635c.getValue().b(new g.a());
    }

    public final void g(@NotNull List<? extends zb0.e> cookies, @NotNull Collection<URI> domains, boolean z11) {
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(domains, "domains");
        if (cookies.isEmpty()) {
            return;
        }
        if (z11) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : cookies) {
                if (this.f4636d.contains(((zb0.e) obj).getName())) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List list = (List) pair.a();
            cookies = (List) pair.b();
            if (this.f4634b.n()) {
                List list2 = list;
                if (C7714v.s(list2)) {
                    throw new AssertionError(Nk.a.b("Attempt to change unmodifiable cookies: ", C7714v.V(list2, null, "[", "]", new c(), 25)));
                }
            }
        }
        if (cookies.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : cookies) {
            zb0.e eVar = (zb0.e) obj2;
            if (i(eVar.getName()) && i(eVar.getValue())) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            zb0.e eVar2 = (zb0.e) it.next();
            if (eVar2.getAttributes().c()) {
                this.f4639g.add(eVar2);
            }
        }
        for (URI uri : domains) {
            ArrayList arrayList4 = new ArrayList(C7714v.z(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                zb0.e eVar3 = (zb0.e) it2.next();
                String name = eVar3.getName();
                String value = eVar3.getValue();
                String host = uri.getHost();
                Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
                arrayList4.add(C6179y.a(C6171q.c(name, value, host, eVar3.getAttributes().d() ? null : eVar3.getAttributes().a(), eVar3.getAttributes().b())));
            }
            ((C6144H) this.f4638f.getValue()).l(uri, arrayList4, false);
        }
    }
}
