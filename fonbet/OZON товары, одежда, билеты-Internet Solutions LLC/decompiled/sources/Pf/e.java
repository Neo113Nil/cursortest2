package Pf;

import Pf.f;

/* loaded from: classes10.dex */
public final class e extends m {
    public e(String str) {
        super(str);
    }

    @Override // Pf.n
    final void A(Of.b bVar, f.a aVar) {
        String M11 = M();
        if (aVar.g() != f.a.EnumC0445a.xml || M11.contains("<![CDATA[")) {
            bVar.b(M11);
            return;
        }
        h hVar = this.f22485a;
        if (hVar != null && hVar.f22471d.j().equals("script")) {
            bVar.b("//<![CDATA[\n").b(M11).b("\n//]]>");
            return;
        }
        h hVar2 = this.f22485a;
        if (hVar2 == null || !hVar2.f22471d.j().equals("style")) {
            bVar.b("<![CDATA[").b(M11).b("]]>");
        } else {
            bVar.b("/*<![CDATA[*/\n").b(M11).b("\n/*]]>*/");
        }
    }

    @Override // Pf.n
    /* renamed from: clone */
    public final Object k() throws CloneNotSupportedException {
        return (e) super.k();
    }

    @Override // Pf.n
    public final n k() {
        return (e) super.k();
    }

    @Override // Pf.n
    public final String w() {
        return "#data";
    }
}
