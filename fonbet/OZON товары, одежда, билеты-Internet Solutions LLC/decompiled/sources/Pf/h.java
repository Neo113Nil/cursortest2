package Pf;

import Pf.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.StreamSupport;
import org.jsoup.parser.C8818g;

/* loaded from: classes10.dex */
public class h extends n implements Iterable<h> {

    /* renamed from: g, reason: collision with root package name */
    private static final List<h> f22468g = Collections.EMPTY_LIST;

    /* renamed from: h, reason: collision with root package name */
    private static final a f22469h = new a(0);

    /* renamed from: i, reason: collision with root package name */
    private static final String f22470i;

    /* renamed from: d, reason: collision with root package name */
    org.jsoup.parser.m f22471d;

    /* renamed from: e, reason: collision with root package name */
    a f22472e;

    /* renamed from: f, reason: collision with root package name */
    Pf.b f22473f;

    static final class a extends ArrayList<n> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements Qf.g {

        /* renamed from: a, reason: collision with root package name */
        private final StringBuilder f22474a;

        public b(StringBuilder sb2) {
            this.f22474a = sb2;
        }

        @Override // Qf.g
        public final void a(int i11, n nVar) {
            boolean z11 = nVar instanceof r;
            StringBuilder sb2 = this.f22474a;
            if (z11) {
                h.L(sb2, (r) nVar);
                return;
            }
            if (nVar instanceof h) {
                h hVar = (h) nVar;
                if (sb2.length() > 0) {
                    if ((hVar.f22471d.d() || hVar.t("br")) && !r.Q(sb2)) {
                        sb2.append(' ');
                    }
                }
            }
        }

        @Override // Qf.g
        public final void b(int i11, n nVar) {
            if (nVar instanceof h) {
                h hVar = (h) nVar;
                n v11 = nVar.v();
                if (hVar.f22471d.f()) {
                    return;
                }
                if ((v11 instanceof r) || ((v11 instanceof h) && ((h) v11).f22471d.f())) {
                    StringBuilder sb2 = this.f22474a;
                    if (r.Q(sb2)) {
                        return;
                    }
                    sb2.append(' ');
                }
            }
        }
    }

    static {
        Pattern.compile("\\s+");
        f22470i = "/baseUri";
    }

    public h(org.jsoup.parser.m mVar, String str, Pf.b bVar) {
        Nf.b.d(mVar);
        this.f22472e = f22469h;
        this.f22473f = bVar;
        this.f22471d = mVar;
        if (str != null) {
            J(str);
        }
    }

    static void L(StringBuilder sb2, r rVar) {
        String M11 = rVar.M();
        h hVar = rVar.f22485a;
        if (hVar != null) {
            int i11 = 0;
            while (!hVar.f22471d.k()) {
                hVar = hVar.f22485a;
                i11++;
                if (i11 < 6 && hVar != null) {
                }
            }
            sb2.append(M11);
        }
        if (!(rVar instanceof c)) {
            Of.k.a(M11, sb2, r.Q(sb2));
            return;
        }
        sb2.append(M11);
    }

    @Override // Pf.n
    void A(Of.b bVar, f.a aVar) {
        f.a.EnumC0445a g10 = aVar.g();
        f.a.EnumC0445a enumC0445a = f.a.EnumC0445a.xml;
        org.jsoup.parser.m mVar = this.f22471d;
        String b11 = g10 == enumC0445a ? C3821a.b(mVar.b(), enumC0445a) : mVar.b();
        bVar.a('<').b(b11);
        Pf.b bVar2 = this.f22473f;
        if (bVar2 != null) {
            bVar2.o(bVar, aVar);
        }
        if (!this.f22472e.isEmpty()) {
            bVar.a('>');
            return;
        }
        f.a.EnumC0445a g11 = aVar.g();
        org.jsoup.parser.m mVar2 = this.f22471d;
        boolean z11 = g11 == enumC0445a || !mVar2.i().equals("http://www.w3.org/1999/xhtml");
        if (z11 && (mVar2.c(32) || (mVar2.g() && (mVar2.e() || mVar2.h())))) {
            bVar.b(" />");
        } else if (z11 || !mVar2.e()) {
            bVar.b("></").b(b11).a('>');
        } else {
            bVar.a('>');
        }
    }

    @Override // Pf.n
    public final h B() {
        return this.f22485a;
    }

    @Override // Pf.n
    public final n I() {
        h hVar = this;
        while (true) {
            h hVar2 = hVar.f22485a;
            if (hVar2 == null) {
                return hVar;
            }
            hVar = hVar2;
        }
    }

    public final void M(n nVar) {
        Nf.b.d(nVar);
        h hVar = nVar.f22485a;
        if (hVar != null) {
            hVar.G(nVar);
        }
        nVar.f22485a = this;
        n();
        this.f22472e.add(nVar);
        nVar.f22486b = this.f22472e.size() - 1;
    }

    public final h N(String str) {
        String i11 = this.f22471d.i();
        n I11 = I();
        f fVar = I11 instanceof f ? (f) I11 : null;
        org.jsoup.parser.l b02 = fVar != null ? fVar.b0() : new org.jsoup.parser.l(new C8818g());
        h hVar = new h(b02.f().e(str, i11, b02.e()), f(), null);
        M(hVar);
        return hVar;
    }

    public final void O(h hVar) {
        Nf.b.d(this.f22485a);
        if (hVar.f22485a == this.f22485a) {
            hVar.F();
        }
        this.f22485a.b(this.f22486b, hVar);
    }

    @Override // Pf.n
    /* renamed from: P, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public h k() {
        return (h) super.k();
    }

    public final boolean Q(String str) {
        org.jsoup.parser.m mVar = this.f22471d;
        return mVar.j().equals(str) && mVar.i().equals("http://www.w3.org/1999/xhtml");
    }

    public final q R() {
        boolean r11 = r();
        q qVar = q.f22497c;
        if (r11) {
            Pf.b e11 = e();
            Object obj = !e11.m("/jsoup.userdata") ? null : e11.B().get("jsoup.end");
            if (obj != null) {
                return (q) obj;
            }
        }
        return qVar;
    }

    public final h S() {
        for (n o11 = o(); o11 != null; o11 = o11.v()) {
            if (o11 instanceof h) {
                return (h) o11;
            }
        }
        return null;
    }

    void T(Of.b bVar, f.a aVar) {
        if (this.f22472e.isEmpty()) {
            return;
        }
        Of.b b11 = bVar.b("</");
        f.a.EnumC0445a g10 = aVar.g();
        f.a.EnumC0445a enumC0445a = f.a.EnumC0445a.xml;
        org.jsoup.parser.m mVar = this.f22471d;
        b11.b(g10 == enumC0445a ? C3821a.b(mVar.b(), enumC0445a) : mVar.b()).a('>');
    }

    public final h U() {
        return this.f22485a;
    }

    public final org.jsoup.parser.m V() {
        return this.f22471d;
    }

    public final String X() {
        return this.f22471d.b();
    }

    @Override // Pf.n
    public final Pf.b e() {
        if (this.f22473f == null) {
            this.f22473f = new Pf.b();
        }
        return this.f22473f;
    }

    @Override // Pf.n
    public final String f() {
        for (h hVar = this; hVar != null; hVar = hVar.f22485a) {
            Pf.b bVar = hVar.f22473f;
            if (bVar != null) {
                String str = f22470i;
                if (bVar.m(str)) {
                    return hVar.f22473f.k(str);
                }
            }
        }
        return "";
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer<? super h> consumer) {
        StreamSupport.stream(Spliterators.spliteratorUnknownSize(new o(this, h.class), 273), false).forEach(consumer);
    }

    @Override // Pf.n
    public final int h() {
        return this.f22472e.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<h> iterator() {
        return new o(this, h.class);
    }

    @Override // Pf.n
    protected final n l(n nVar) {
        h hVar = (h) super.l(nVar);
        a aVar = new a(this.f22472e.size());
        hVar.f22472e = aVar;
        aVar.addAll(this.f22472e);
        Pf.b bVar = this.f22473f;
        if (bVar != null) {
            Pf.b clone = bVar.clone();
            hVar.f22473f = clone;
            clone.C(null, "jsoup.childEls");
        }
        return hVar;
    }

    @Override // Pf.n
    protected final void m(String str) {
        e().v(f22470i, str);
    }

    @Override // Pf.n
    protected final List<n> n() {
        if (this.f22472e == f22469h) {
            this.f22472e = new a(4);
        }
        return this.f22472e;
    }

    @Override // Pf.n
    protected final boolean r() {
        return this.f22473f != null;
    }

    @Override // Pf.n
    public String w() {
        return this.f22471d.b();
    }

    @Override // Pf.n
    public final String x() {
        return this.f22471d.j();
    }
}
