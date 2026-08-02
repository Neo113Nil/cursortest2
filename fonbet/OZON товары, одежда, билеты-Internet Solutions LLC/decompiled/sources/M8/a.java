package M8;

import M8.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: w, reason: collision with root package name */
    private static final g.a f17581w;

    /* renamed from: x, reason: collision with root package name */
    private static final Pattern f17582x;

    /* renamed from: y, reason: collision with root package name */
    private static final Pattern f17583y;

    /* renamed from: z, reason: collision with root package name */
    private static final Pattern f17584z;

    /* renamed from: a, reason: collision with root package name */
    private String f17585a = "";

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f17586b = new StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    private String f17587c = "";

    /* renamed from: d, reason: collision with root package name */
    private StringBuilder f17588d = new StringBuilder();

    /* renamed from: e, reason: collision with root package name */
    private StringBuilder f17589e = new StringBuilder();

    /* renamed from: f, reason: collision with root package name */
    private boolean f17590f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17591g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17592h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17593i = false;

    /* renamed from: j, reason: collision with root package name */
    private final e f17594j;

    /* renamed from: k, reason: collision with root package name */
    private String f17595k;

    /* renamed from: l, reason: collision with root package name */
    private g f17596l;

    /* renamed from: m, reason: collision with root package name */
    private g f17597m;

    /* renamed from: n, reason: collision with root package name */
    private int f17598n;

    /* renamed from: o, reason: collision with root package name */
    private int f17599o;

    /* renamed from: p, reason: collision with root package name */
    private int f17600p;

    /* renamed from: q, reason: collision with root package name */
    private StringBuilder f17601q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f17602r;

    /* renamed from: s, reason: collision with root package name */
    private String f17603s;

    /* renamed from: t, reason: collision with root package name */
    private StringBuilder f17604t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f17605u;

    /* renamed from: v, reason: collision with root package name */
    private N8.b f17606v;

    static {
        g.a aVar = new g.a();
        aVar.I();
        aVar.J();
        f17581w = aVar;
        f17582x = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
        f17583y = Pattern.compile("[- ]");
        f17584z = Pattern.compile("\u2008");
    }

    a(String str) {
        e g10 = e.g();
        this.f17594j = g10;
        this.f17598n = 0;
        this.f17599o = 0;
        this.f17600p = 0;
        this.f17601q = new StringBuilder();
        this.f17602r = false;
        this.f17603s = "";
        this.f17604t = new StringBuilder();
        this.f17605u = new ArrayList();
        this.f17606v = new N8.b(64);
        this.f17595k = str;
        g i11 = g10.i(g10.m(g10.f(str)));
        i11 = i11 == null ? f17581w : i11;
        this.f17597m = i11;
        this.f17596l = i11;
    }

    private String a(String str) {
        StringBuilder sb2 = this.f17601q;
        int length = sb2.length();
        if (!this.f17602r || length <= 0 || sb2.charAt(length - 1) == ' ') {
            return ((Object) sb2) + str;
        }
        return new String(sb2) + ' ' + str;
    }

    private String b() {
        StringBuilder sb2 = this.f17604t;
        if (sb2.length() < 3) {
            return a(sb2.toString());
        }
        String sb3 = sb2.toString();
        for (f fVar : (this.f17592h && this.f17603s.length() == 0 && this.f17597m.g() > 0) ? this.f17597m.h() : this.f17597m.n()) {
            if (this.f17603s.length() <= 0 || !e.d(fVar.e()) || fVar.f() || fVar.h()) {
                if (this.f17603s.length() != 0 || this.f17592h || e.d(fVar.e()) || fVar.f()) {
                    if (f17582x.matcher(fVar.a()).matches()) {
                        this.f17605u.add(fVar);
                    }
                }
            }
        }
        n(sb3);
        String e11 = e();
        return e11.length() > 0 ? e11 : m() ? h() : this.f17588d.toString();
    }

    private boolean c() {
        StringBuilder sb2;
        e eVar;
        int c11;
        StringBuilder sb3 = this.f17604t;
        if (sb3.length() == 0 || (c11 = (eVar = this.f17594j).c(sb3, (sb2 = new StringBuilder()))) == 0) {
            return false;
        }
        sb3.setLength(0);
        sb3.append((CharSequence) sb2);
        String m11 = eVar.m(c11);
        if ("001".equals(m11)) {
            this.f17597m = eVar.h(c11);
        } else if (!m11.equals(this.f17595k)) {
            g i11 = eVar.i(eVar.m(eVar.f(m11)));
            if (i11 == null) {
                i11 = f17581w;
            }
            this.f17597m = i11;
        }
        String num = Integer.toString(c11);
        StringBuilder sb4 = this.f17601q;
        sb4.append(num);
        sb4.append(' ');
        this.f17603s = "";
        return true;
    }

    private boolean d() {
        Pattern a11 = this.f17606v.a("\\+|" + this.f17597m.f());
        StringBuilder sb2 = this.f17589e;
        Matcher matcher = a11.matcher(sb2);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f17592h = true;
        int end = matcher.end();
        StringBuilder sb3 = this.f17604t;
        sb3.setLength(0);
        sb3.append(sb2.substring(end));
        StringBuilder sb4 = this.f17601q;
        sb4.setLength(0);
        sb4.append(sb2.substring(0, end));
        if (sb2.charAt(0) != '+') {
            sb4.append(' ');
        }
        return true;
    }

    private String h() {
        StringBuilder sb2 = this.f17604t;
        int length = sb2.length();
        if (length <= 0) {
            return this.f17601q.toString();
        }
        String str = "";
        for (int i11 = 0; i11 < length; i11++) {
            str = k(sb2.charAt(i11));
        }
        return this.f17590f ? a(str) : this.f17588d.toString();
    }

    private String k(char c11) {
        StringBuilder sb2 = this.f17586b;
        Matcher matcher = f17584z.matcher(sb2);
        if (!matcher.find(this.f17598n)) {
            if (this.f17605u.size() == 1) {
                this.f17590f = false;
            }
            this.f17587c = "";
            return this.f17588d.toString();
        }
        String replaceFirst = matcher.replaceFirst(Character.toString(c11));
        sb2.replace(0, replaceFirst.length(), replaceFirst);
        int start = matcher.start();
        this.f17598n = start;
        return sb2.substring(0, start + 1);
    }

    private String l(char c11, boolean z11) {
        StringBuilder sb2 = this.f17588d;
        sb2.append(c11);
        if (z11) {
            this.f17599o = sb2.length();
        }
        boolean isDigit = Character.isDigit(c11);
        StringBuilder sb3 = this.f17589e;
        StringBuilder sb4 = this.f17604t;
        if (isDigit || (sb2.length() == 1 && e.f17617p.matcher(Character.toString(c11)).matches())) {
            if (c11 == '+') {
                sb3.append(c11);
            } else {
                c11 = Character.forDigit(Character.digit(c11, 10), 10);
                sb3.append(c11);
                sb4.append(c11);
            }
            if (z11) {
                this.f17600p = sb3.length();
            }
        } else {
            this.f17590f = false;
            this.f17591g = true;
        }
        boolean z12 = this.f17590f;
        StringBuilder sb5 = this.f17601q;
        if (!z12) {
            if (this.f17591g) {
                return sb2.toString();
            }
            if (!d()) {
                if (this.f17603s.length() > 0) {
                    sb4.insert(0, this.f17603s);
                    sb5.setLength(sb5.lastIndexOf(this.f17603s));
                }
                if (!this.f17603s.equals(o())) {
                    sb5.append(' ');
                    this.f17590f = true;
                    this.f17593i = false;
                    this.f17605u.clear();
                    this.f17598n = 0;
                    this.f17586b.setLength(0);
                    this.f17587c = "";
                    return b();
                }
            } else if (c()) {
                this.f17590f = true;
                this.f17593i = false;
                this.f17605u.clear();
                this.f17598n = 0;
                this.f17586b.setLength(0);
                this.f17587c = "";
                return b();
            }
            return sb2.toString();
        }
        int length = sb3.length();
        if (length == 0 || length == 1 || length == 2) {
            return sb2.toString();
        }
        if (length == 3) {
            if (!d()) {
                this.f17603s = o();
                return b();
            }
            this.f17593i = true;
        }
        if (this.f17593i) {
            if (c()) {
                this.f17593i = false;
            }
            return ((Object) sb5) + sb4.toString();
        }
        if (this.f17605u.size() <= 0) {
            return b();
        }
        String k11 = k(c11);
        String e11 = e();
        if (e11.length() > 0) {
            return e11;
        }
        n(sb4.toString());
        return m() ? h() : this.f17590f ? a(k11) : sb2.toString();
    }

    private boolean m() {
        Iterator it = this.f17605u.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            String g10 = fVar.g();
            if (this.f17587c.equals(g10)) {
                return false;
            }
            String g11 = fVar.g();
            StringBuilder sb2 = this.f17586b;
            sb2.setLength(0);
            String a11 = fVar.a();
            Matcher matcher = this.f17606v.a(g11).matcher("999999999999999");
            matcher.find();
            String group = matcher.group();
            String replaceAll = group.length() < this.f17604t.length() ? "" : group.replaceAll(g11, a11).replaceAll("9", "\u2008");
            if (replaceAll.length() > 0) {
                sb2.append(replaceAll);
                this.f17587c = g10;
                this.f17602r = f17583y.matcher(fVar.e()).find();
                this.f17598n = 0;
                return true;
            }
            it.remove();
        }
        this.f17590f = false;
        return false;
    }

    private void n(String str) {
        int length = str.length() - 3;
        Iterator it = this.f17605u.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.d() != 0) {
                if (!this.f17606v.a(fVar.b(Math.min(length, fVar.d() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    private String o() {
        int a11 = this.f17597m.a();
        StringBuilder sb2 = this.f17601q;
        StringBuilder sb3 = this.f17604t;
        int i11 = 1;
        if (a11 != 1 || sb3.charAt(0) != '1' || sb3.charAt(1) == '0' || sb3.charAt(1) == '1') {
            if (this.f17597m.F()) {
                Matcher matcher = this.f17606v.a(this.f17597m.l()).matcher(sb3);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.f17592h = true;
                    i11 = matcher.end();
                    sb2.append(sb3.substring(0, i11));
                }
            }
            i11 = 0;
        } else {
            sb2.append('1');
            sb2.append(' ');
            this.f17592h = true;
        }
        String substring = sb3.substring(0, i11);
        sb3.delete(0, i11);
        return substring;
    }

    final String e() {
        Iterator it = this.f17605u.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Matcher matcher = this.f17606v.a(fVar.g()).matcher(this.f17604t);
            if (matcher.matches()) {
                this.f17602r = f17583y.matcher(fVar.e()).find();
                String a11 = a(matcher.replaceAll(fVar.a()));
                if (e.s(a11).contentEquals(this.f17589e)) {
                    return a11;
                }
            }
        }
        return "";
    }

    public final void f() {
        this.f17585a = "";
        this.f17588d.setLength(0);
        this.f17589e.setLength(0);
        this.f17586b.setLength(0);
        this.f17598n = 0;
        this.f17587c = "";
        this.f17601q.setLength(0);
        this.f17603s = "";
        this.f17604t.setLength(0);
        this.f17590f = true;
        this.f17591g = false;
        this.f17600p = 0;
        this.f17599o = 0;
        this.f17592h = false;
        this.f17593i = false;
        this.f17605u.clear();
        this.f17602r = false;
        if (this.f17597m.equals(this.f17596l)) {
            return;
        }
        String str = this.f17595k;
        e eVar = this.f17594j;
        g i11 = eVar.i(eVar.m(eVar.f(str)));
        if (i11 == null) {
            i11 = f17581w;
        }
        this.f17597m = i11;
    }

    public final int g() {
        if (!this.f17590f) {
            return this.f17599o;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.f17600p && i12 < this.f17585a.length()) {
            if (this.f17589e.charAt(i11) == this.f17585a.charAt(i12)) {
                i11++;
            }
            i12++;
        }
        return i12;
    }

    public final String i(char c11) {
        String l11 = l(c11, false);
        this.f17585a = l11;
        return l11;
    }

    public final String j(char c11) {
        String l11 = l(c11, true);
        this.f17585a = l11;
        return l11;
    }
}
