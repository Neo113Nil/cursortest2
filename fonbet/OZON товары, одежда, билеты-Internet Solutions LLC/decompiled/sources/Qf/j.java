package Qf;

import Of.C3707a;
import Pf.r;
import Qf.AbstractC3860b;
import Qf.e;
import Qf.f;
import Qf.m;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.parser.G;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes10.dex */
public final class j implements AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f23423d = {'>', '+', '~'};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f23424e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* renamed from: f, reason: collision with root package name */
    private static final char[] f23425f = {',', ')'};

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f23426g = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f23427h = Pattern.compile("([+-])?(\\d+)");

    /* renamed from: a, reason: collision with root package name */
    private final G f23428a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23429b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23430c;

    private j(String str) {
        Nf.b.b(str);
        String trim = str.trim();
        this.f23429b = trim;
        this.f23428a = new G(trim);
    }

    static e c(e eVar, e eVar2) {
        if (eVar == null) {
            return eVar2;
        }
        if (!(eVar instanceof AbstractC3860b.a)) {
            return new AbstractC3860b.a(Arrays.asList(eVar, eVar2));
        }
        AbstractC3860b.a aVar = (AbstractC3860b.a) eVar;
        aVar.f23389a.add(eVar2);
        aVar.c();
        return eVar;
    }

    private int d() {
        String trim = j().trim();
        boolean z11 = false;
        if (trim != null && trim.length() != 0) {
            int length = trim.length();
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = true;
                    break;
                }
                if (!Of.k.g(trim.charAt(i11))) {
                    break;
                }
                i11++;
            }
        }
        if (z11) {
            return Integer.parseInt(trim);
        }
        throw new Nf.c("Index must be numeric");
    }

    private String j() {
        return this.f23428a.j('(', ')');
    }

    private e k(boolean z11) {
        String str = z11 ? ":containsOwn" : ":contains";
        String I11 = G.I(j());
        Nf.b.c(I11, str.concat("(text) query must not be empty"));
        return this.f23430c ? new f.b(I11) : z11 ? new e.C3872m(I11) : new e.C3873n(I11);
    }

    private e m(boolean z11) {
        String str = z11 ? ":containsWholeOwnText" : ":containsWholeText";
        String I11 = G.I(j());
        Nf.b.c(I11, str.concat("(text) query must not be empty"));
        return z11 ? new e.C3874o(I11) : new e.C3875p(I11);
    }

    private e.q o(boolean z11, boolean z12) {
        String b11 = C3707a.b(j());
        int i11 = 2;
        if (!"odd".equals(b11)) {
            if (!"even".equals(b11)) {
                Matcher matcher = f23426g.matcher(b11);
                if (matcher.matches()) {
                    if (matcher.group(3) != null) {
                        i11 = Integer.parseInt(matcher.group(1).replaceFirst("^\\+", ""));
                    } else {
                        i11 = "-".equals(matcher.group(2)) ? -1 : 1;
                    }
                    if (matcher.group(4) != null) {
                        r2 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                    }
                } else {
                    Matcher matcher2 = f23427h.matcher(b11);
                    if (!matcher2.matches()) {
                        throw new k("Could not parse nth-index '%s': unexpected format", b11);
                    }
                    r2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                    i11 = 0;
                }
            }
            r2 = 0;
        }
        return z12 ? z11 ? new e.D(i11, r2) : new e.E(i11, r2) : z11 ? new e.C(i11, r2) : new e.B(i11, r2);
    }

    private e p(G g10) {
        String p11 = g10.p(f23424e);
        Nf.b.b(p11);
        g10.q();
        if (g10.r()) {
            return p11.startsWith("^") ? new e.C3864d(p11.substring(1)) : p11.equals("*") ? new e.C3864d("") : new e.C3862b(p11);
        }
        if (g10.t('=')) {
            return new e.C0472e(p11, g10.B(), true);
        }
        if (g10.v("!=")) {
            return new e.C3868i(p11, g10.B(), true);
        }
        if (g10.v("^=")) {
            return new e.C3869j(p11, g10.B(), false);
        }
        if (g10.v("$=")) {
            return new e.C3866g(p11, g10.B(), false);
        }
        if (g10.v("*=")) {
            return new e.C3865f(p11, g10.B(), true);
        }
        if (g10.v("~=")) {
            return new e.C3867h(p11, Pattern.compile(g10.B()));
        }
        throw new k("Could not parse attribute query '%s': unexpected token at '%s'", this.f23429b, g10.B());
    }

    private e q(boolean z11) {
        String str = z11 ? ":matchesOwn" : ":matches";
        String j11 = j();
        Nf.b.c(j11, str.concat("(regex) query must not be empty"));
        Pattern compile = Pattern.compile(j11);
        return this.f23430c ? new f.d(compile) : z11 ? new e.K(compile) : new e.J(compile);
    }

    private e r(boolean z11) {
        String str = z11 ? ":matchesWholeOwnText" : ":matchesWholeText";
        String j11 = j();
        Nf.b.c(j11, str.concat("(regex) query must not be empty"));
        return z11 ? new e.L(Pattern.compile(j11)) : new e.M(Pattern.compile(j11));
    }

    public static e s(String str) {
        try {
            j jVar = new j(str);
            try {
                e v11 = jVar.v();
                G g10 = jVar.f23428a;
                g10.q();
                if (g10.r()) {
                    jVar.close();
                    return v11;
                }
                throw new k("Could not parse query '%s': unexpected token at '%s'", jVar.f23429b, g10.B());
            } finally {
            }
        } catch (IllegalArgumentException e11) {
            throw new k(e11.getMessage());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f23428a.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [Qf.e] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [Qf.e] */
    /* JADX WARN: Type inference failed for: r2v5, types: [Qf.e] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [Qf.m, Qf.m$c] */
    /* JADX WARN: Type inference failed for: r2v9, types: [Qf.e] */
    final e t() {
        G g10 = this.f23428a;
        g10.q();
        char[] cArr = f23423d;
        ?? hVar = g10.y(cArr) ? new m.h() : w();
        while (true) {
            char c11 = g10.q() ? ' ' : (char) 0;
            if (!g10.y(cArr)) {
                if (g10.y(f23425f)) {
                    break;
                }
            } else {
                c11 = g10.k();
            }
            if (c11 == 0) {
                break;
            }
            e w11 = w();
            if (c11 == ' ') {
                hVar = c(new m.a(hVar), w11);
            } else if (c11 == '+') {
                hVar = c(new m.d(hVar), w11);
            } else if (c11 == '>') {
                hVar = hVar instanceof m.c ? (m.c) hVar : new m.c(hVar);
                hVar.f23433c.add(w11);
                hVar.f23434d += w11.a();
                hVar.f23432b |= w11.b();
            } else {
                if (c11 != '~') {
                    throw new k("Unknown combinator '%s'", Character.valueOf(c11));
                }
                hVar = c(new m.g(hVar), w11);
            }
        }
        return hVar;
    }

    public final String toString() {
        return this.f23429b;
    }

    final e v() {
        e t2 = t();
        while (this.f23428a.t(',')) {
            e t11 = t();
            if (t2 instanceof AbstractC3860b.C0471b) {
                AbstractC3860b.C0471b c0471b = (AbstractC3860b.C0471b) t2;
                c0471b.f23389a.add(t11);
                c0471b.c();
            } else {
                t2 = new AbstractC3860b.C0471b(t2, t11);
            }
        }
        return t2;
    }

    final e w() {
        e n11;
        G g10 = this.f23428a;
        g10.q();
        if (g10.z() || g10.w()) {
            String b11 = C3707a.b(g10.o());
            Nf.b.b(b11);
            if (b11.startsWith("*|")) {
                String substring = b11.substring(2);
                n11 = new AbstractC3860b.C0471b(new e.N(substring), new e.O(Nk.a.b(ProductContainerDTO.RATIO_DELIMITER, substring)));
            } else if (b11.endsWith("|*")) {
                n11 = new e.P(b11.substring(0, b11.length() - 2) + ProductContainerDTO.RATIO_DELIMITER);
            } else {
                if (b11.contains("|")) {
                    b11 = b11.replace("|", ProductContainerDTO.RATIO_DELIMITER);
                }
                n11 = new e.N(b11);
            }
        } else {
            n11 = g10.t('*') ? new e.C3861a() : null;
        }
        while (true) {
            e x11 = x();
            if (x11 == null) {
                break;
            }
            n11 = c(n11, x11);
        }
        if (n11 != null) {
            return n11;
        }
        throw new k("Could not parse query '%s': unexpected token at '%s'", this.f23429b, g10.B());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x025b, code lost:
    
        if (r8.equals("only-child") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007e, code lost:
    
        if (r7.equals("leafnode") == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final e x() {
        e cVar;
        char c11 = 5;
        G g10 = this.f23428a;
        if (g10.t('#')) {
            String m11 = g10.m();
            Nf.b.b(m11);
            return new e.r(m11);
        }
        if (g10.t('.')) {
            String m12 = g10.m();
            Nf.b.b(m12);
            return new e.C3870k(m12.trim());
        }
        if (g10.x()) {
            G g11 = new G(g10.j('[', ']'));
            try {
                e p11 = p(g11);
                g11.close();
                return p11;
            } catch (Throwable th2) {
                try {
                    g11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        boolean v11 = g10.v("::");
        String str = this.f23429b;
        if (!v11) {
            if (!g10.t(':')) {
                return null;
            }
            String m13 = g10.m();
            m13.getClass();
            switch (m13.hashCode()) {
                case -2141736343:
                    if (m13.equals("containsData")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -2136991809:
                    if (m13.equals("first-child")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1939921007:
                    if (m13.equals("matchesWholeText")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1754914063:
                    if (m13.equals("nth-child")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1629748624:
                    if (m13.equals("nth-last-child")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -947996741:
                    break;
                case -897532411:
                    if (m13.equals("nth-of-type")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -872629820:
                    if (m13.equals("nth-last-of-type")) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -567445985:
                    if (m13.equals("contains")) {
                        c11 = '\b';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -55413797:
                    if (m13.equals("containsWholeOwnText")) {
                        c11 = '\t';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3244:
                    if (m13.equals("eq")) {
                        c11 = '\n';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3309:
                    if (m13.equals("gt")) {
                        c11 = 11;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3370:
                    if (m13.equals("is")) {
                        c11 = '\f';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3464:
                    if (m13.equals("lt")) {
                        c11 = '\r';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 103066:
                    if (m13.equals("has")) {
                        c11 = 14;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 109267:
                    if (m13.equals("not")) {
                        c11 = 15;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3506402:
                    if (m13.equals("root")) {
                        c11 = 16;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 93819220:
                    if (m13.equals("blank")) {
                        c11 = 17;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 96634189:
                    if (m13.equals("empty")) {
                        c11 = 18;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 208017639:
                    if (m13.equals("containsOwn")) {
                        c11 = 19;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 614017170:
                    if (m13.equals("matchText")) {
                        c11 = 20;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 835834661:
                    if (m13.equals("last-child")) {
                        c11 = 21;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 840862003:
                    if (m13.equals("matches")) {
                        c11 = 22;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1255901423:
                    if (m13.equals("matchesWholeOwnText")) {
                        c11 = 23;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1292941139:
                    if (m13.equals("first-of-type")) {
                        c11 = 24;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1455900751:
                    if (m13.equals("only-of-type")) {
                        c11 = 25;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1870740819:
                    if (m13.equals("matchesOwn")) {
                        c11 = 26;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2014184485:
                    if (m13.equals("containsWholeText")) {
                        c11 = 27;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2025926969:
                    if (m13.equals("last-of-type")) {
                        c11 = 28;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    String I11 = G.I(j());
                    Nf.b.c(I11, ":containsData(text) query must not be empty");
                    return new e.C3871l(I11);
                case 1:
                    return new e.x();
                case 2:
                    return r(false);
                case 3:
                    return o(false, false);
                case 4:
                    return o(true, false);
                case 5:
                    return new e.F();
                case 6:
                    return o(false, true);
                case 7:
                    return o(true, true);
                case '\b':
                    return k(false);
                case '\t':
                    return m(true);
                case '\n':
                    return new e.s(d());
                case 11:
                    return new e.u(d());
                case '\f':
                    if (!g10.t('(')) {
                        throw new Nf.c(":is() must have a selector");
                    }
                    e v12 = v();
                    if (g10.t(')')) {
                        return new m.e(v12);
                    }
                    throw new Nf.c(":is() must have a selector");
                case '\r':
                    return new e.v(d());
                case 14:
                    if (!g10.t('(')) {
                        throw new Nf.c(":has() must have a selector");
                    }
                    e v13 = v();
                    if (!g10.t(')')) {
                        throw new Nf.c(":has() must have a selector");
                    }
                    m.b bVar = new m.b(v13);
                    if (v13 instanceof AbstractC3860b) {
                        Iterator<e> it = ((AbstractC3860b) v13).f23389a.iterator();
                        while (it.hasNext()) {
                            e next = it.next();
                            if (!(next instanceof m.g) && !(next instanceof m.d)) {
                            }
                        }
                    }
                    return bVar;
                case 15:
                    String j11 = j();
                    Nf.b.c(j11, ":not(selector) subselect must not be empty");
                    return new m.f(s(j11));
                case 16:
                    return new e.H();
                case 17:
                    return new f.a();
                case 18:
                    return new e.w();
                case 19:
                    return k(true);
                case 20:
                    return new e.I();
                case 21:
                    return new e.z();
                case 22:
                    return q(false);
                case 23:
                    return r(true);
                case 24:
                    return new e.y(0, 1);
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    return new e.G();
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    return q(true);
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    return m(false);
                case 28:
                    return new e.A(0, 1);
                default:
                    throw new k("Could not parse query '%s': unexpected token at '%s'", str, g10.B());
            }
        }
        String m14 = g10.m();
        this.f23430c = true;
        m14.getClass();
        switch (m14.hashCode()) {
            case 3076010:
                if (m14.equals("data")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 3386882:
                if (m14.equals("node")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 3556653:
                if (m14.equals("text")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 94504589:
                if (m14.equals("cdata")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 950398559:
                if (m14.equals("comment")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 1563127392:
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                cVar = new f.c(Pf.e.class, m14);
                break;
            case 1:
                cVar = new f.c(Pf.n.class, m14);
                break;
            case 2:
                cVar = new f.c(r.class, m14);
                break;
            case 3:
                cVar = new f.c(Pf.c.class, m14);
                break;
            case 4:
                cVar = new f.c(Pf.d.class, m14);
                break;
            case 5:
                cVar = new f.c(Pf.m.class, m14);
                break;
            default:
                throw new k("Could not parse query '%s': unknown node type '::%s'", str, m14);
        }
        while (true) {
            e x11 = x();
            if (x11 == null) {
                this.f23430c = false;
                return cVar;
            }
            cVar = c(cVar, x11);
        }
    }
}
