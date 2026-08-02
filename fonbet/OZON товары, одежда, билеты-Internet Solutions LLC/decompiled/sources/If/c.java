package If;

import Bf.C2637a;
import Df.C2870a;
import Ef.h;
import Ef.m;
import Hf.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import zf.InterfaceC11118a;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f12337a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f12338b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3234a f12339c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f12340d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f12341a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f12342b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f12343c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private LinkedHashSet f12344d = h.k();

        public final c e() {
            return new c(this);
        }

        public final void f(C2870a.C0138a c0138a) {
            this.f12341a.add(c0138a);
        }

        public final void g(C2637a c2637a) {
            this.f12342b.add(c2637a);
        }

        public final void h(Set set) {
            if (set == null) {
                throw new NullPointerException("extensions must not be null");
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC11118a interfaceC11118a = (InterfaceC11118a) it.next();
                if (interfaceC11118a instanceof b) {
                    ((b) interfaceC11118a).a(this);
                }
            }
        }

        public final void i(d dVar) {
            this.f12343c.add(dVar);
        }
    }

    public interface b extends InterfaceC11118a {
        void a(a aVar);
    }

    c(a aVar) {
        this.f12337a = h.e(aVar.f12341a, aVar.f12344d);
        If.b bVar = new If.b();
        this.f12339c = bVar;
        this.f12340d = aVar.f12343c;
        ArrayList arrayList = aVar.f12342b;
        this.f12338b = arrayList;
        bVar.a(new m(arrayList, Collections.EMPTY_MAP));
    }

    public final u a(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        u r11 = new h(this.f12337a, this.f12339c, this.f12338b).r(str);
        Iterator it = this.f12340d.iterator();
        while (it.hasNext()) {
            r11 = ((d) it.next()).a(r11);
        }
        return r11;
    }
}
