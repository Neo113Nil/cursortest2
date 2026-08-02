package Ef;

import C.o0;
import Ef.c;
import Ef.i;
import Ef.j;
import Ef.k;
import Ef.l;
import Ef.p;
import Ef.t;
import Hf.A;
import Hf.AbstractC3139b;
import Hf.w;
import If.InterfaceC3234a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes6.dex */
public final class h {

    /* renamed from: p, reason: collision with root package name */
    private static final LinkedHashSet f7887p = new LinkedHashSet(Arrays.asList(Hf.c.class, Hf.l.class, Hf.j.class, Hf.m.class, A.class, Hf.s.class, Hf.p.class));

    /* renamed from: q, reason: collision with root package name */
    private static final Map<Class<? extends AbstractC3139b>, Jf.d> f7888q;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f7889a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7892d;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7896h;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f7897i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3234a f7898j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f7899k;

    /* renamed from: l, reason: collision with root package name */
    private final g f7900l;

    /* renamed from: b, reason: collision with root package name */
    private int f7890b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f7891c = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f7893e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f7894f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f7895g = 0;

    /* renamed from: m, reason: collision with root package name */
    private final LinkedHashMap f7901m = new LinkedHashMap();

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f7902n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    private LinkedHashSet f7903o = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    static class a implements Jf.e {

        /* renamed from: a, reason: collision with root package name */
        private final Jf.c f7904a;

        public a(Jf.c cVar) {
            this.f7904a = cVar;
        }

        @Override // Jf.e
        public final StringBuilder a() {
            Jf.c cVar = this.f7904a;
            if (!(cVar instanceof r)) {
                return null;
            }
            StringBuilder i11 = ((r) cVar).i();
            if (i11.length() == 0) {
                return null;
            }
            return i11;
        }

        public final Jf.c b() {
            return this.f7904a;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Hf.c.class, new c.a());
        hashMap.put(Hf.l.class, new j.a());
        hashMap.put(Hf.j.class, new i.a());
        hashMap.put(Hf.m.class, new k.a());
        hashMap.put(A.class, new t.a());
        hashMap.put(Hf.s.class, new p.a());
        hashMap.put(Hf.p.class, new l.a());
        f7888q = Collections.unmodifiableMap(hashMap);
    }

    public h(ArrayList arrayList, InterfaceC3234a interfaceC3234a, ArrayList arrayList2) {
        this.f7897i = arrayList;
        this.f7898j = interfaceC3234a;
        this.f7899k = arrayList2;
        g gVar = new g();
        this.f7900l = gVar;
        this.f7902n.add(gVar);
        this.f7903o.add(gVar);
    }

    private void a(Jf.c cVar) {
        while (!i().c(cVar.e())) {
            f(i());
        }
        i().e().b(cVar.e());
        this.f7902n.add(cVar);
        this.f7903o.add(cVar);
    }

    private void b(r rVar) {
        Iterator it = rVar.j().iterator();
        while (it.hasNext()) {
            Hf.r rVar2 = (Hf.r) it.next();
            rVar.e().i(rVar2);
            String n11 = rVar2.n();
            LinkedHashMap linkedHashMap = this.f7901m;
            if (!linkedHashMap.containsKey(n11)) {
                linkedHashMap.put(n11, rVar2);
            }
        }
    }

    private void c() {
        CharSequence subSequence;
        if (this.f7892d) {
            int i11 = this.f7890b + 1;
            CharSequence charSequence = this.f7889a;
            CharSequence subSequence2 = charSequence.subSequence(i11, charSequence.length());
            int c11 = Gf.d.c(this.f7891c);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + c11);
            for (int i12 = 0; i12 < c11; i12++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f7889a;
            subSequence = charSequence2.subSequence(this.f7890b, charSequence2.length());
        }
        i().f(subSequence);
    }

    private void d() {
        if (this.f7889a.charAt(this.f7890b) != '\t') {
            this.f7890b++;
            this.f7891c++;
        } else {
            this.f7890b++;
            int i11 = this.f7891c;
            this.f7891c = Gf.d.c(i11) + i11;
        }
    }

    public static ArrayList e(ArrayList arrayList, LinkedHashSet linkedHashSet) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(f7888q.get((Class) it.next()));
        }
        return arrayList2;
    }

    private void f(Jf.c cVar) {
        if (i() == cVar) {
            Ej.b.b(1, this.f7902n);
        }
        if (cVar instanceof r) {
            b((r) cVar);
        }
        cVar.g();
    }

    private void g(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f((Jf.c) arrayList.get(size));
        }
    }

    private void h() {
        int i11 = this.f7890b;
        int i12 = this.f7891c;
        this.f7896h = true;
        int length = this.f7889a.length();
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = this.f7889a.charAt(i11);
            if (charAt == '\t') {
                i11++;
                i12 += 4 - (i12 % 4);
            } else if (charAt != ' ') {
                this.f7896h = false;
                break;
            } else {
                i11++;
                i12++;
            }
        }
        this.f7893e = i11;
        this.f7894f = i12;
        this.f7895g = i12 - this.f7891c;
    }

    public static LinkedHashSet k() {
        return f7887p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0120, code lost:
    
        t(r9.f7893e);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void p(String str) {
        d dVar;
        this.f7889a = Gf.d.i(str);
        this.f7890b = 0;
        this.f7891c = 0;
        this.f7892d = false;
        ArrayList arrayList = this.f7902n;
        int i11 = 1;
        for (Jf.c cVar : arrayList.subList(1, arrayList.size())) {
            h();
            b h11 = cVar.h(this);
            if (h11 == null) {
                break;
            }
            if (h11.d()) {
                f(cVar);
                return;
            }
            if (h11.c() != -1) {
                t(h11.c());
            } else if (h11.b() != -1) {
                s(h11.b());
            }
            i11++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i11, arrayList.size()));
        r0 = (Jf.c) arrayList.get(i11 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z11 = (r0.e() instanceof w) || r0.b();
        while (true) {
            if (!z11) {
                break;
            }
            h();
            if (this.f7896h) {
                break;
            }
            if (this.f7895g < 4) {
                if (Gf.d.g(this.f7893e, this.f7889a)) {
                    break;
                }
            }
            a aVar = new a(r0);
            Iterator it = this.f7897i.iterator();
            while (true) {
                if (it.hasNext()) {
                    dVar = ((Jf.d) it.next()).a(this, aVar);
                    if (dVar != null) {
                        break;
                    }
                } else {
                    dVar = null;
                    break;
                }
            }
            if (dVar == null) {
                t(this.f7893e);
                break;
            }
            if (!isEmpty) {
                g(arrayList2);
                isEmpty = true;
            }
            if (dVar.e() != -1) {
                t(dVar.e());
            } else if (dVar.d() != -1) {
                s(dVar.d());
            }
            if (dVar.f()) {
                Jf.c i12 = i();
                Ej.b.b(1, this.f7902n);
                this.f7903o.remove(i12);
                if (i12 instanceof r) {
                    b((r) i12);
                }
                i12.e().l();
            }
            Jf.c[] c11 = dVar.c();
            for (Jf.c cVar2 : c11) {
                a(cVar2);
                z11 = cVar2.b();
            }
        }
        if (!isEmpty && !this.f7896h && i().d()) {
            c();
            return;
        }
        if (!isEmpty) {
            g(arrayList2);
        }
        if (!cVar2.b()) {
            c();
        } else {
            if (this.f7896h) {
                return;
            }
            a(new r());
            c();
        }
    }

    private void s(int i11) {
        int i12;
        int i13 = this.f7894f;
        if (i11 >= i13) {
            this.f7890b = this.f7893e;
            this.f7891c = i13;
        }
        int length = this.f7889a.length();
        while (true) {
            i12 = this.f7891c;
            if (i12 >= i11 || this.f7890b == length) {
                break;
            } else {
                d();
            }
        }
        if (i12 <= i11) {
            this.f7892d = false;
            return;
        }
        this.f7890b--;
        this.f7891c = i11;
        this.f7892d = true;
    }

    private void t(int i11) {
        int i12 = this.f7893e;
        if (i11 >= i12) {
            this.f7890b = i12;
            this.f7891c = this.f7894f;
        }
        int length = this.f7889a.length();
        while (true) {
            int i13 = this.f7890b;
            if (i13 >= i11 || i13 == length) {
                break;
            } else {
                d();
            }
        }
        this.f7892d = false;
    }

    public final Jf.c i() {
        return (Jf.c) o0.b(1, this.f7902n);
    }

    public final int j() {
        return this.f7891c;
    }

    public final int l() {
        return this.f7895g;
    }

    public final int m() {
        return this.f7890b;
    }

    public final CharSequence n() {
        return this.f7889a;
    }

    public final int o() {
        return this.f7893e;
    }

    public final boolean q() {
        return this.f7896h;
    }

    public final Hf.h r(String str) {
        int i11 = 0;
        while (true) {
            int d11 = Gf.d.d(i11, str);
            if (d11 == -1) {
                break;
            }
            p(str.substring(i11, d11));
            i11 = d11 + 1;
            if (i11 < str.length() && str.charAt(d11) == '\r' && str.charAt(i11) == '\n') {
                i11 = d11 + 2;
            }
        }
        if (str.length() > 0 && (i11 == 0 || i11 < str.length())) {
            p(str.substring(i11));
        }
        g(this.f7902n);
        n a11 = this.f7898j.a(new m(this.f7899k, this.f7901m));
        Iterator it = this.f7903o.iterator();
        while (it.hasNext()) {
            ((Jf.c) it.next()).a(a11);
        }
        return this.f7900l.i();
    }
}
