package O4;

import Q2.C0375o;
import com.google.android.gms.internal.ads.C1234l6;
import java.util.ArrayList;
import java.util.regex.Pattern;
import o0.C2202f;
import v.AbstractC2528x;
import y4.C2674b;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f4145l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f4146m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f4147a;

    /* renamed from: b, reason: collision with root package name */
    public final y4.n f4148b;

    /* renamed from: c, reason: collision with root package name */
    public String f4149c;

    /* renamed from: d, reason: collision with root package name */
    public C1234l6 f4150d;

    /* renamed from: e, reason: collision with root package name */
    public final C0375o f4151e = new C0375o();
    public final C2202f f;

    /* renamed from: g, reason: collision with root package name */
    public y4.q f4152g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4153h;
    public final v3.e i;

    /* renamed from: j, reason: collision with root package name */
    public final G.v f4154j;

    /* renamed from: k, reason: collision with root package name */
    public y4.x f4155k;

    public O(String str, y4.n nVar, String str2, y4.m mVar, y4.q qVar, boolean z3, boolean z5, boolean z6) {
        this.f4147a = str;
        this.f4148b = nVar;
        this.f4149c = str2;
        this.f4152g = qVar;
        this.f4153h = z3;
        if (mVar != null) {
            this.f = mVar.f();
        } else {
            this.f = new C2202f(1);
        }
        if (z5) {
            this.f4154j = new G.v(23);
            return;
        }
        if (z6) {
            v3.e eVar = new v3.e(25);
            this.i = eVar;
            y4.q qVar2 = y4.s.f;
            kotlin.jvm.internal.l.f("type", qVar2);
            if (qVar2.f21373b.equals("multipart")) {
                eVar.f20433m = qVar2;
            } else {
                throw new IllegalArgumentException(("multipart != " + qVar2).toString());
            }
        }
    }

    public final void a(String str, String str2, boolean z3) {
        G.v vVar = this.f4154j;
        if (z3) {
            vVar.getClass();
            kotlin.jvm.internal.l.f("name", str);
            ((ArrayList) vVar.f1749l).add(C2674b.b(0, 0, 83, str, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
            ((ArrayList) vVar.f1750m).add(C2674b.b(0, 0, 83, str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
            return;
        }
        vVar.getClass();
        kotlin.jvm.internal.l.f("name", str);
        ((ArrayList) vVar.f1749l).add(C2674b.b(0, 0, 91, str, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
        ((ArrayList) vVar.f1750m).add(C2674b.b(0, 0, 91, str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
    }

    public final void b(String str, String str2, boolean z3) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = y4.q.f21370d;
                this.f4152g = AbstractC2528x.d(str2);
                return;
            } catch (IllegalArgumentException e3) {
                throw new IllegalArgumentException(L1.a.m("Malformed content type: ", str2), e3);
            }
        }
        C2202f c2202f = this.f;
        if (z3) {
            c2202f.c(str, str2);
        } else {
            c2202f.a(str, str2);
        }
    }

    public final void c(y4.m mVar, y4.x xVar) {
        v3.e eVar = this.i;
        eVar.getClass();
        kotlin.jvm.internal.l.f("body", xVar);
        if (mVar.c("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (mVar.c("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) eVar.f20434n).add(new y4.r(mVar, xVar));
    }

    public final void d(String str, String str2, boolean z3) {
        String str3 = this.f4149c;
        if (str3 != null) {
            y4.n nVar = this.f4148b;
            C1234l6 f = nVar.f(str3);
            this.f4150d = f;
            if (f == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + nVar + ", Relative: " + this.f4149c);
            }
            this.f4149c = null;
        }
        if (z3) {
            C1234l6 c1234l6 = this.f4150d;
            c1234l6.getClass();
            kotlin.jvm.internal.l.f("encodedName", str);
            if (((ArrayList) c1234l6.f14328h) == null) {
                c1234l6.f14328h = new ArrayList();
            }
            ArrayList arrayList = (ArrayList) c1234l6.f14328h;
            kotlin.jvm.internal.l.c(arrayList);
            arrayList.add(C2674b.b(0, 0, 211, str, " \"'<>#&="));
            ArrayList arrayList2 = (ArrayList) c1234l6.f14328h;
            kotlin.jvm.internal.l.c(arrayList2);
            arrayList2.add(str2 != null ? C2674b.b(0, 0, 211, str2, " \"'<>#&=") : null);
            return;
        }
        C1234l6 c1234l62 = this.f4150d;
        c1234l62.getClass();
        kotlin.jvm.internal.l.f("name", str);
        if (((ArrayList) c1234l62.f14328h) == null) {
            c1234l62.f14328h = new ArrayList();
        }
        ArrayList arrayList3 = (ArrayList) c1234l62.f14328h;
        kotlin.jvm.internal.l.c(arrayList3);
        arrayList3.add(C2674b.b(0, 0, 219, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList4 = (ArrayList) c1234l62.f14328h;
        kotlin.jvm.internal.l.c(arrayList4);
        arrayList4.add(str2 != null ? C2674b.b(0, 0, 219, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }
}
