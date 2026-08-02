package Ef;

import Hf.u;
import Hf.x;
import Hf.z;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class n {

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f7919i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f7920j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f7921k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f7922l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f7923m = Pattern.compile("`+");

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f7924n = Pattern.compile("^`+");

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f7925o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f7926p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f7927q = Pattern.compile("^ *(?:\n *)?");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f7928r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f7929s = Pattern.compile("\\s+");

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f7930t = Pattern.compile(" *$");

    /* renamed from: a, reason: collision with root package name */
    private final BitSet f7931a;

    /* renamed from: b, reason: collision with root package name */
    private final BitSet f7932b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f7933c;

    /* renamed from: d, reason: collision with root package name */
    private final m f7934d;

    /* renamed from: e, reason: collision with root package name */
    private String f7935e;

    /* renamed from: f, reason: collision with root package name */
    private int f7936f;

    /* renamed from: g, reason: collision with root package name */
    private f f7937g;

    /* renamed from: h, reason: collision with root package name */
    private e f7938h;

    /* loaded from: classes10.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final int f7939a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f7940b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f7941c;

        a(int i11, boolean z11, boolean z12) {
            this.f7939a = i11;
            this.f7941c = z11;
            this.f7940b = z12;
        }
    }

    public n(m mVar) {
        List b11 = mVar.b();
        HashMap hashMap = new HashMap();
        b(Arrays.asList(new Ff.a(), new Ff.c()), hashMap);
        b(b11, hashMap);
        this.f7933c = hashMap;
        Set keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.f7932b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.f7931a = bitSet2;
        this.f7934d = mVar;
    }

    private static void a(char c11, Kf.a aVar, HashMap hashMap) {
        if (((Kf.a) hashMap.put(Character.valueOf(c11), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c11 + "'");
    }

    private static void b(List list, HashMap hashMap) {
        s sVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Kf.a aVar = (Kf.a) it.next();
            char c11 = aVar.c();
            char a11 = aVar.a();
            if (c11 == a11) {
                Kf.a aVar2 = (Kf.a) hashMap.get(Character.valueOf(c11));
                if (aVar2 == null || aVar2.c() != aVar2.a()) {
                    a(c11, aVar, hashMap);
                } else {
                    if (aVar2 instanceof s) {
                        sVar = (s) aVar2;
                    } else {
                        s sVar2 = new s(c11);
                        sVar2.f(aVar2);
                        sVar = sVar2;
                    }
                    sVar.f(aVar);
                    hashMap.put(Character.valueOf(c11), sVar);
                }
            } else {
                a(c11, aVar, hashMap);
                a(a11, aVar, hashMap);
            }
        }
    }

    private String c(Pattern pattern) {
        if (this.f7936f >= this.f7935e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f7935e);
        matcher.region(this.f7936f, this.f7935e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f7936f = matcher.end();
        return matcher.group();
    }

    private static void d(z zVar, z zVar2, int i11) {
        if (zVar == null || zVar2 == null || zVar == zVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i11);
        sb2.append(zVar.m());
        u e11 = zVar.e();
        u e12 = zVar2.e();
        while (e11 != e12) {
            sb2.append(((z) e11).m());
            u e13 = e11.e();
            e11.l();
            e11 = e13;
        }
        zVar.n(sb2.toString());
    }

    private static void e(u uVar, u uVar2) {
        z zVar = null;
        z zVar2 = null;
        int i11 = 0;
        while (uVar != null) {
            if (uVar instanceof z) {
                zVar2 = (z) uVar;
                if (zVar == null) {
                    zVar = zVar2;
                }
                i11 = zVar2.m().length() + i11;
            } else {
                d(zVar, zVar2, i11);
                zVar = null;
                zVar2 = null;
                i11 = 0;
            }
            if (uVar == uVar2) {
                break;
            } else {
                uVar = uVar.e();
            }
        }
        d(zVar, zVar2, i11);
    }

    private char g() {
        if (this.f7936f < this.f7935e.length()) {
            return this.f7935e.charAt(this.f7936f);
        }
        return (char) 0;
    }

    private void h(f fVar) {
        boolean z11;
        HashMap hashMap = new HashMap();
        f fVar2 = this.f7937g;
        while (fVar2 != null) {
            f fVar3 = fVar2.f7882e;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            HashMap hashMap2 = this.f7933c;
            char c11 = fVar2.f7879b;
            Kf.a aVar = (Kf.a) hashMap2.get(Character.valueOf(c11));
            if (!fVar2.f7881d || aVar == null) {
                fVar2 = fVar2.f7883f;
            } else {
                char c12 = aVar.c();
                f fVar4 = fVar2.f7882e;
                int i11 = 0;
                boolean z12 = false;
                while (fVar4 != null && fVar4 != fVar && fVar4 != hashMap.get(Character.valueOf(c11))) {
                    if (fVar4.f7880c && fVar4.f7879b == c12) {
                        i11 = aVar.d(fVar4, fVar2);
                        z12 = true;
                        if (i11 > 0) {
                            z11 = true;
                            break;
                        }
                    }
                    fVar4 = fVar4.f7882e;
                }
                z11 = z12;
                z12 = false;
                if (z12) {
                    z zVar = fVar4.f7878a;
                    fVar4.f7884g -= i11;
                    fVar2.f7884g -= i11;
                    zVar.n(zVar.m().substring(0, zVar.m().length() - i11));
                    z zVar2 = fVar2.f7878a;
                    zVar2.n(zVar2.m().substring(0, zVar2.m().length() - i11));
                    f fVar5 = fVar2.f7882e;
                    while (fVar5 != null && fVar5 != fVar4) {
                        f fVar6 = fVar5.f7882e;
                        i(fVar5);
                        fVar5 = fVar6;
                    }
                    if (zVar != zVar2 && zVar.e() != zVar2) {
                        e(zVar.e(), zVar2.g());
                    }
                    aVar.e(zVar, zVar2, i11);
                    if (fVar4.f7884g == 0) {
                        fVar4.f7878a.l();
                        i(fVar4);
                    }
                    if (fVar2.f7884g == 0) {
                        f fVar7 = fVar2.f7883f;
                        zVar2.l();
                        i(fVar2);
                        fVar2 = fVar7;
                    }
                } else {
                    if (!z11) {
                        hashMap.put(Character.valueOf(c11), fVar2.f7882e);
                        if (!fVar2.f7880c) {
                            i(fVar2);
                        }
                    }
                    fVar2 = fVar2.f7883f;
                }
            }
        }
        while (true) {
            f fVar8 = this.f7937g;
            if (fVar8 == null || fVar8 == fVar) {
                return;
            } else {
                i(fVar8);
            }
        }
    }

    private void i(f fVar) {
        f fVar2 = fVar.f7882e;
        if (fVar2 != null) {
            fVar2.f7883f = fVar.f7883f;
        }
        f fVar3 = fVar.f7883f;
        if (fVar3 == null) {
            this.f7937g = fVar2;
        } else {
            fVar3.f7882e = fVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x04b3  */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r4v30, types: [Ef.n$a] */
    /* JADX WARN: Type inference failed for: r4v31, types: [Ef.n$a] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r5v18, types: [Hf.q] */
    /* JADX WARN: Type inference failed for: r5v20, types: [Hf.o] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [Hf.z] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(String str, u uVar) {
        ?? r82;
        z zVar;
        Hf.q qVar;
        String c11;
        z zVar2;
        boolean z11;
        ?? r22;
        ?? r32;
        Object obj;
        boolean z12;
        boolean z13;
        ?? aVar;
        this.f7935e = str.trim();
        this.f7936f = 0;
        u uVar2 = null;
        this.f7937g = null;
        this.f7938h = null;
        u uVar3 = null;
        while (true) {
            char g10 = g();
            if (g10 == 0) {
                uVar3 = uVar2;
            } else {
                if (g10 != '\n') {
                    if (g10 == '!') {
                        int i11 = this.f7936f + 1;
                        this.f7936f = i11;
                        if (g() == '[') {
                            this.f7936f++;
                            zVar = new z("![");
                            e a11 = e.a(zVar, i11, this.f7938h, this.f7937g);
                            e eVar = this.f7938h;
                            if (eVar != null) {
                                eVar.f7877g = true;
                            }
                            this.f7938h = a11;
                            r82 = zVar;
                        } else {
                            uVar2 = new z("!");
                        }
                    } else if (g10 == '&') {
                        String c12 = c(f7922l);
                        if (c12 != null) {
                            zVar = new z(Gf.b.a(c12));
                            r82 = zVar;
                        }
                        r82 = null;
                    } else if (g10 == '<') {
                        String c13 = c(f7925o);
                        if (c13 != null) {
                            String substring = c13.substring(1, c13.length() - 1);
                            Hf.q qVar2 = new Hf.q(Nk.a.b("mailto:", substring), null);
                            qVar2.b(new z(substring));
                            qVar = qVar2;
                        } else {
                            String c14 = c(f7926p);
                            if (c14 != null) {
                                String substring2 = c14.substring(1, c14.length() - 1);
                                Hf.q qVar3 = new Hf.q(substring2, null);
                                qVar3.b(new z(substring2));
                                qVar = qVar3;
                            } else {
                                r82 = null;
                                if (r82 == null) {
                                    if (c(f7920j) != null) {
                                        uVar2 = new Hf.n();
                                    }
                                    r82 = null;
                                }
                            }
                        }
                        r82 = qVar;
                        if (r82 == null) {
                        }
                    } else if (g10 != '`') {
                        switch (g10) {
                            case '[':
                                int i12 = this.f7936f;
                                this.f7936f = i12 + 1;
                                r82 = new z("[");
                                e b11 = e.b(r82, i12, this.f7938h, this.f7937g);
                                e eVar2 = this.f7938h;
                                if (eVar2 != null) {
                                    eVar2.f7877g = true;
                                }
                                this.f7938h = b11;
                                break;
                            case '\\':
                                this.f7936f++;
                                if (g() != '\n') {
                                    if (this.f7936f < this.f7935e.length()) {
                                        String str2 = this.f7935e;
                                        int i13 = this.f7936f;
                                        if (f7921k.matcher(str2.substring(i13, i13 + 1)).matches()) {
                                            String str3 = this.f7935e;
                                            int i14 = this.f7936f;
                                            zVar2 = new z(str3.substring(i14, i14 + 1));
                                            this.f7936f++;
                                            r82 = zVar2;
                                            break;
                                        }
                                    }
                                    uVar2 = new z("\\");
                                    break;
                                } else {
                                    uVar2 = new Hf.k();
                                    this.f7936f++;
                                    break;
                                }
                            case ']':
                                int i15 = this.f7936f + 1;
                                this.f7936f = i15;
                                e eVar3 = this.f7938h;
                                if (eVar3 != null) {
                                    if (eVar3.f7876f) {
                                        if (g() == '(') {
                                            this.f7936f++;
                                            Pattern pattern = f7927q;
                                            c(pattern);
                                            int c15 = Gf.c.c(this.f7936f, this.f7935e);
                                            if (c15 == -1) {
                                                r32 = uVar2;
                                            } else {
                                                String substring3 = g() == '<' ? this.f7935e.substring(this.f7936f + 1, c15 - 1) : this.f7935e.substring(this.f7936f, c15);
                                                this.f7936f = c15;
                                                r32 = Gf.a.c(substring3);
                                            }
                                            if (r32 != null) {
                                                c(pattern);
                                                String str4 = this.f7935e;
                                                int i16 = this.f7936f;
                                                if (f7929s.matcher(str4.substring(i16 - 1, i16)).matches()) {
                                                    int e11 = Gf.c.e(this.f7936f, this.f7935e);
                                                    Object obj2 = uVar2;
                                                    if (e11 != -1) {
                                                        String substring4 = this.f7935e.substring(this.f7936f + 1, e11 - 1);
                                                        this.f7936f = e11;
                                                        obj2 = Gf.a.c(substring4);
                                                    }
                                                    c(pattern);
                                                    obj = obj2;
                                                } else {
                                                    obj = null;
                                                }
                                                if (g() == ')') {
                                                    this.f7936f++;
                                                    z11 = true;
                                                    r22 = obj;
                                                } else {
                                                    this.f7936f = i15;
                                                    z11 = false;
                                                    r22 = obj;
                                                }
                                            } else {
                                                z11 = false;
                                                r22 = 0;
                                            }
                                        } else {
                                            z11 = false;
                                            r22 = 0;
                                            r32 = null;
                                        }
                                        if (!z11) {
                                            int i17 = this.f7936f;
                                            if (i17 < this.f7935e.length() && this.f7935e.charAt(this.f7936f) == '[') {
                                                int i18 = this.f7936f + 1;
                                                int d11 = Gf.c.d(i18, this.f7935e);
                                                int i19 = d11 - i18;
                                                if (d11 != -1 && i19 <= 999 && d11 < this.f7935e.length() && this.f7935e.charAt(d11) == ']') {
                                                    this.f7936f = d11 + 1;
                                                }
                                            }
                                            int i21 = this.f7936f - i17;
                                            String substring5 = i21 > 2 ? this.f7935e.substring(i17, i21 + i17) : !eVar3.f7877g ? this.f7935e.substring(eVar3.f7872b, i15) : null;
                                            if (substring5 != null) {
                                                Hf.r c16 = this.f7934d.c(Gf.a.b(substring5));
                                                if (c16 != null) {
                                                    r32 = c16.m();
                                                    r22 = c16.o();
                                                    z11 = true;
                                                }
                                            }
                                        }
                                        if (!z11) {
                                            this.f7936f = i15;
                                            this.f7938h = this.f7938h.f7874d;
                                            uVar2 = new z("]");
                                            break;
                                        } else {
                                            boolean z14 = eVar3.f7873c;
                                            zVar2 = z14 ? new Hf.o(r32, r22) : new Hf.q(r32, r22);
                                            z zVar3 = eVar3.f7871a;
                                            u e12 = zVar3.e();
                                            while (e12 != null) {
                                                u e13 = e12.e();
                                                zVar2.b(e12);
                                                e12 = e13;
                                            }
                                            h(eVar3.f7875e);
                                            if (zVar2.c() != zVar2.d()) {
                                                e(zVar2.c(), zVar2.d());
                                            }
                                            zVar3.l();
                                            e eVar4 = this.f7938h.f7874d;
                                            this.f7938h = eVar4;
                                            if (!z14) {
                                                while (eVar4 != null) {
                                                    if (!eVar4.f7873c) {
                                                        eVar4.f7876f = false;
                                                    }
                                                    eVar4 = eVar4.f7874d;
                                                }
                                            }
                                            r82 = zVar2;
                                            break;
                                        }
                                    } else {
                                        this.f7938h = eVar3.f7874d;
                                        zVar = new z("]");
                                    }
                                } else {
                                    zVar = new z("]");
                                }
                                r82 = zVar;
                                break;
                            default:
                                if (!this.f7932b.get(g10)) {
                                    int i22 = this.f7936f;
                                    int length = this.f7935e.length();
                                    while (true) {
                                        int i23 = this.f7936f;
                                        if (i23 != length && !this.f7931a.get(this.f7935e.charAt(i23))) {
                                            this.f7936f++;
                                        }
                                    }
                                    int i24 = this.f7936f;
                                    if (i22 != i24) {
                                        r82 = new z(this.f7935e.substring(i22, i24));
                                        break;
                                    }
                                } else {
                                    Kf.a aVar2 = (Kf.a) this.f7933c.get(Character.valueOf(g10));
                                    int i25 = this.f7936f;
                                    int i26 = 0;
                                    while (g() == g10) {
                                        i26++;
                                        this.f7936f++;
                                    }
                                    if (i26 < aVar2.b()) {
                                        this.f7936f = i25;
                                        aVar = uVar2;
                                    } else {
                                        String substring6 = i25 == 0 ? "\n" : this.f7935e.substring(i25 - 1, i25);
                                        char g11 = g();
                                        String valueOf = g11 != 0 ? String.valueOf(g11) : "\n";
                                        Pattern pattern2 = f7919i;
                                        boolean matches = pattern2.matcher(substring6).matches();
                                        Pattern pattern3 = f7928r;
                                        boolean matches2 = pattern3.matcher(substring6).matches();
                                        boolean matches3 = pattern2.matcher(valueOf).matches();
                                        boolean matches4 = pattern3.matcher(valueOf).matches();
                                        boolean z15 = !matches4 && (!matches3 || matches2 || matches);
                                        boolean z16 = !matches2 && (!matches || matches4 || matches3);
                                        if (g10 == '_') {
                                            z13 = z15 && (!z16 || matches);
                                            z12 = z16 && (!z15 || matches3);
                                        } else {
                                            boolean z17 = z15 && g10 == aVar2.c();
                                            z12 = z16 && g10 == aVar2.a();
                                            z13 = z17;
                                        }
                                        this.f7936f = i25;
                                        aVar = new a(i26, z13, z12);
                                    }
                                    if (aVar != null) {
                                        int i27 = this.f7936f;
                                        int i28 = aVar.f7939a;
                                        int i29 = i27 + i28;
                                        this.f7936f = i29;
                                        z zVar4 = new z(this.f7935e.substring(i27, i29));
                                        f fVar = this.f7937g;
                                        zVar2 = zVar4;
                                        f fVar2 = new f(zVar2, g10, aVar.f7941c, aVar.f7940b, fVar);
                                        this.f7937g = fVar2;
                                        fVar2.f7884g = i28;
                                        fVar2.f7885h = i28;
                                        if (fVar != null) {
                                            fVar.f7883f = fVar2;
                                        }
                                        r82 = zVar2;
                                        break;
                                    }
                                }
                                break;
                        }
                    } else {
                        String c17 = c(f7924n);
                        if (c17 != null) {
                            int i31 = this.f7936f;
                            do {
                                c11 = c(f7923m);
                                if (c11 == null) {
                                    this.f7936f = i31;
                                    zVar = new z(c17);
                                    r82 = zVar;
                                }
                            } while (!c11.equals(c17));
                            Hf.e eVar5 = new Hf.e();
                            String replace = this.f7935e.substring(i31, this.f7936f - c17.length()).replace('\n', ' ');
                            if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ' && Gf.d.e(replace)) {
                                replace = replace.substring(1, replace.length() - 1);
                            }
                            eVar5.n(replace);
                            r82 = eVar5;
                        }
                        r82 = null;
                    }
                    if (r82 == null) {
                        uVar3 = r82;
                    } else {
                        this.f7936f++;
                        uVar3 = new z(String.valueOf(g10));
                    }
                } else {
                    this.f7936f++;
                    if (uVar3 instanceof z) {
                        z zVar5 = (z) uVar3;
                        if (zVar5.m().endsWith(" ")) {
                            String m11 = zVar5.m();
                            Matcher matcher = f7930t.matcher(m11);
                            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                            if (end > 0) {
                                zVar5.n(m11.substring(0, m11.length() - end));
                            }
                            uVar2 = end >= 2 ? new Hf.k() : new x();
                        }
                    }
                    uVar2 = new x();
                }
                r82 = uVar2;
                if (r82 == null) {
                }
            }
            if (uVar3 == null) {
                h(null);
                if (uVar.c() == uVar.d()) {
                    return;
                }
                e(uVar.c(), uVar.d());
                return;
            }
            uVar.b(uVar3);
            uVar2 = null;
        }
    }
}
