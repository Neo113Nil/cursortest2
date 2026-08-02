package Pf;

import Nf.C3671a;
import Pf.h;
import Pf.j;
import Pf.p;
import Qf.e;
import java.nio.charset.Charset;
import java.util.Spliterators;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;
import org.jsoup.parser.C8818g;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

/* loaded from: classes10.dex */
public final class f extends h {

    /* renamed from: m, reason: collision with root package name */
    private static final e.N f22458m = new e.N(SelectionItemFormDTO.TITLE_FIELD_NAME);

    /* renamed from: j, reason: collision with root package name */
    private a f22459j;

    /* renamed from: k, reason: collision with root package name */
    private org.jsoup.parser.l f22460k;

    /* renamed from: l, reason: collision with root package name */
    private b f22461l;

    public static class a implements Cloneable {

        /* renamed from: a, reason: collision with root package name */
        private j.c f22462a = j.c.base;

        /* renamed from: b, reason: collision with root package name */
        private Charset f22463b = C3671a.f19502a;

        /* renamed from: c, reason: collision with root package name */
        private boolean f22464c = true;

        /* renamed from: d, reason: collision with root package name */
        private int f22465d = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f22466e = 30;

        /* renamed from: f, reason: collision with root package name */
        private EnumC0445a f22467f = EnumC0445a.html;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: Pf.f$a$a, reason: collision with other inner class name */
        public static final class EnumC0445a {
            private static final /* synthetic */ EnumC0445a[] $VALUES;
            public static final EnumC0445a html;
            public static final EnumC0445a xml;

            static {
                EnumC0445a enumC0445a = new EnumC0445a("html", 0);
                html = enumC0445a;
                EnumC0445a enumC0445a2 = new EnumC0445a("xml", 1);
                xml = enumC0445a2;
                $VALUES = new EnumC0445a[]{enumC0445a, enumC0445a2};
            }

            private EnumC0445a() {
                throw null;
            }

            public static EnumC0445a valueOf(String str) {
                return (EnumC0445a) Enum.valueOf(EnumC0445a.class, str);
            }

            public static EnumC0445a[] values() {
                return (EnumC0445a[]) $VALUES.clone();
            }
        }

        public final Charset a() {
            return this.f22463b;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            try {
                a aVar = (a) super.clone();
                String name = this.f22463b.name();
                aVar.getClass();
                aVar.f22463b = Charset.forName(name);
                aVar.f22462a = j.c.valueOf(this.f22462a.name());
                return aVar;
            } catch (CloneNotSupportedException e11) {
                throw new RuntimeException(e11);
            }
        }

        public final j.c c() {
            return this.f22462a;
        }

        public final int d() {
            return this.f22465d;
        }

        public final int e() {
            return this.f22466e;
        }

        public final boolean f() {
            return this.f22464c;
        }

        public final EnumC0445a g() {
            return this.f22467f;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b limitedQuirks;
        public static final b noQuirks;
        public static final b quirks;

        static {
            b bVar = new b("noQuirks", 0);
            noQuirks = bVar;
            b bVar2 = new b("quirks", 1);
            quirks = bVar2;
            b bVar3 = new b("limitedQuirks", 2);
            limitedQuirks = bVar3;
            $VALUES = new b[]{bVar, bVar2, bVar3};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    private f(String str, String str2, org.jsoup.parser.l lVar) {
        super(new org.jsoup.parser.m(str), str2, null);
        this.f22459j = new a();
        this.f22461l = b.noQuirks;
        this.f22460k = lVar;
    }

    @Override // Pf.h, Pf.n
    /* renamed from: Y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f k() {
        f fVar = (f) super.k();
        Pf.b bVar = this.f22473f;
        if (bVar != null) {
            fVar.f22473f = bVar.clone();
        }
        fVar.f22459j = this.f22459j.clone();
        return fVar;
    }

    public final a a0() {
        return this.f22459j;
    }

    public final org.jsoup.parser.l b0() {
        return this.f22460k;
    }

    public final void c0(org.jsoup.parser.l lVar) {
        this.f22460k = lVar;
    }

    public final b d0() {
        return this.f22461l;
    }

    public final void e0(b bVar) {
        this.f22461l = bVar;
    }

    public final f f0() {
        f fVar = new f(this.f22471d.i(), f(), this.f22460k);
        Pf.b bVar = this.f22473f;
        if (bVar != null) {
            fVar.f22473f = bVar.clone();
        }
        fVar.f22459j = this.f22459j.clone();
        return fVar;
    }

    public final String g0() {
        h S11 = S();
        while (true) {
            if (S11 == null) {
                S11 = N("html");
                break;
            }
            if (S11.t("html")) {
                break;
            }
            S11 = S11.u();
        }
        final h S12 = S11.S();
        while (true) {
            if (S12 == null) {
                String i11 = S11.f22471d.i();
                n I11 = S11.I();
                f fVar = I11 instanceof f ? (f) I11 : null;
                org.jsoup.parser.l b02 = fVar != null ? fVar.b0() : new org.jsoup.parser.l(new C8818g());
                h hVar = new h(b02.f().e("head", i11, b02.e()), S11.f(), null);
                S11.b(0, hVar);
                S12 = hVar;
            } else {
                if (S12.t("head")) {
                    break;
                }
                S12 = S12.u();
            }
        }
        final e.N n11 = f22458m;
        n11.getClass();
        h hVar2 = (h) StreamSupport.stream(Spliterators.spliteratorUnknownSize(new o(S12, h.class), 273), false).filter(new Predicate() { // from class: Qf.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Pf.h hVar3 = S12;
                return e.N.this.c(hVar3, (Pf.h) obj);
            }
        }).findFirst().orElse(null);
        if (hVar2 == null) {
            return "";
        }
        hVar2.getClass();
        StringBuilder b11 = Of.k.b();
        new h.b(b11).c(hVar2);
        String trim = Of.k.l(b11).trim();
        StringBuilder b12 = Of.k.b();
        Of.k.a(trim, b12, false);
        return Of.k.l(b12).trim();
    }

    @Override // Pf.h, Pf.n
    public final String w() {
        return "#document";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [Pf.p] */
    /* JADX WARN: Type inference failed for: r5v3, types: [Qf.g] */
    /* JADX WARN: Type inference failed for: r5v4, types: [Pf.p, Pf.p$a] */
    @Override // Pf.n
    public final String z() {
        ?? pVar;
        StringBuilder b11 = Of.k.b();
        n o11 = o();
        if (o11 != null) {
            Of.b d11 = Of.b.d(b11);
            n I11 = o11.I();
            f fVar = I11 instanceof f ? (f) I11 : null;
            if (fVar == null) {
                fVar = new f();
            }
            a a02 = fVar.a0();
            a02.getClass();
            if (a02.f()) {
                pVar = new p.a(o11, d11, a02);
                pVar.f22496d = false;
                n nVar = o11;
                while (true) {
                    if (nVar != null) {
                        if ((nVar instanceof h) && ((h) nVar).f22471d.c(64)) {
                            pVar.f22496d = true;
                            break;
                        }
                        nVar = nVar.f22485a;
                    } else {
                        break;
                    }
                }
            } else {
                pVar = new p(o11, d11, a02);
            }
            while (o11 != null) {
                pVar.c(o11);
                o11 = o11.v();
            }
        }
        String l11 = Of.k.l(b11);
        n I12 = I();
        f fVar2 = I12 instanceof f ? (f) I12 : null;
        return (fVar2 != null ? fVar2.a0() : new f().a0()).f() ? l11.trim() : l11;
    }

    public f() {
        this("http://www.w3.org/1999/xhtml", "", new org.jsoup.parser.l(new C8818g()));
    }
}
