package L4;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public static final String f3126l;

    /* renamed from: k, reason: collision with root package name */
    public final C0229l f3127k;

    static {
        String str = File.separator;
        kotlin.jvm.internal.l.e("separator", str);
        f3126l = str;
    }

    public z(C0229l c0229l) {
        kotlin.jvm.internal.l.f("bytes", c0229l);
        this.f3127k = c0229l;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a5 = M4.c.a(this);
        C0229l c0229l = this.f3127k;
        if (a5 == -1) {
            a5 = 0;
        } else if (a5 < c0229l.c() && c0229l.h(a5) == 92) {
            a5++;
        }
        int c5 = c0229l.c();
        int i = a5;
        while (a5 < c5) {
            if (c0229l.h(a5) == 47 || c0229l.h(a5) == 92) {
                arrayList.add(c0229l.m(i, a5));
                i = a5 + 1;
            }
            a5++;
        }
        if (i < c0229l.c()) {
            arrayList.add(c0229l.m(i, c0229l.c()));
        }
        return arrayList;
    }

    public final z b() {
        C0229l c0229l = M4.c.f3624d;
        C0229l c0229l2 = this.f3127k;
        if (kotlin.jvm.internal.l.a(c0229l2, c0229l)) {
            return null;
        }
        C0229l c0229l3 = M4.c.f3621a;
        if (kotlin.jvm.internal.l.a(c0229l2, c0229l3)) {
            return null;
        }
        C0229l c0229l4 = M4.c.f3622b;
        if (kotlin.jvm.internal.l.a(c0229l2, c0229l4)) {
            return null;
        }
        C0229l c0229l5 = M4.c.f3625e;
        c0229l2.getClass();
        kotlin.jvm.internal.l.f("suffix", c0229l5);
        int c5 = c0229l2.c();
        byte[] bArr = c0229l5.f3093k;
        if (c0229l2.l(c5 - bArr.length, c0229l5, bArr.length) && (c0229l2.c() == 2 || c0229l2.l(c0229l2.c() - 3, c0229l3, 1) || c0229l2.l(c0229l2.c() - 3, c0229l4, 1))) {
            return null;
        }
        int j5 = C0229l.j(c0229l2, c0229l3);
        if (j5 == -1) {
            j5 = C0229l.j(c0229l2, c0229l4);
        }
        if (j5 == 2 && g() != null) {
            if (c0229l2.c() == 3) {
                return null;
            }
            return new z(C0229l.n(c0229l2, 0, 3, 1));
        }
        if (j5 == 1) {
            kotlin.jvm.internal.l.f("prefix", c0229l4);
            if (c0229l2.l(0, c0229l4, c0229l4.c())) {
                return null;
            }
        }
        if (j5 != -1 || g() == null) {
            return j5 == -1 ? new z(c0229l) : j5 == 0 ? new z(C0229l.n(c0229l2, 0, 1, 1)) : new z(C0229l.n(c0229l2, 0, j5, 1));
        }
        if (c0229l2.c() == 2) {
            return null;
        }
        return new z(C0229l.n(c0229l2, 0, 2, 1));
    }

    public final z c(z zVar) {
        kotlin.jvm.internal.l.f("other", zVar);
        int a5 = M4.c.a(this);
        C0229l c0229l = this.f3127k;
        z zVar2 = a5 == -1 ? null : new z(c0229l.m(0, a5));
        int a6 = M4.c.a(zVar);
        C0229l c0229l2 = zVar.f3127k;
        if (!kotlin.jvm.internal.l.a(zVar2, a6 != -1 ? new z(c0229l2.m(0, a6)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + zVar).toString());
        }
        ArrayList a7 = a();
        ArrayList a8 = zVar.a();
        int min = Math.min(a7.size(), a8.size());
        int i = 0;
        while (i < min && kotlin.jvm.internal.l.a(a7.get(i), a8.get(i))) {
            i++;
        }
        if (i == min && c0229l.c() == c0229l2.c()) {
            return j3.i.s(".");
        }
        if (a8.subList(i, a8.size()).indexOf(M4.c.f3625e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + zVar).toString());
        }
        C0226i c0226i = new C0226i();
        C0229l c5 = M4.c.c(zVar);
        if (c5 == null && (c5 = M4.c.c(this)) == null) {
            c5 = M4.c.f(f3126l);
        }
        int size = a8.size();
        for (int i5 = i; i5 < size; i5++) {
            c0226i.M(M4.c.f3625e);
            c0226i.M(c5);
        }
        int size2 = a7.size();
        while (i < size2) {
            c0226i.M((C0229l) a7.get(i));
            c0226i.M(c5);
            i++;
        }
        return M4.c.d(c0226i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        z zVar = (z) obj;
        kotlin.jvm.internal.l.f("other", zVar);
        return this.f3127k.compareTo(zVar.f3127k);
    }

    public final z d(String str) {
        kotlin.jvm.internal.l.f("child", str);
        C0226i c0226i = new C0226i();
        c0226i.U(str);
        return M4.c.b(this, M4.c.d(c0226i, false), false);
    }

    public final File e() {
        return new File(this.f3127k.p());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && kotlin.jvm.internal.l.a(((z) obj).f3127k, this.f3127k);
    }

    public final Path f() {
        Path path;
        path = Paths.get(this.f3127k.p(), new String[0]);
        kotlin.jvm.internal.l.e("get(...)", path);
        return path;
    }

    public final Character g() {
        C0229l c0229l = M4.c.f3621a;
        C0229l c0229l2 = this.f3127k;
        if (C0229l.f(c0229l2, c0229l) != -1 || c0229l2.c() < 2 || c0229l2.h(1) != 58) {
            return null;
        }
        char h3 = (char) c0229l2.h(0);
        if (('a' > h3 || h3 >= '{') && ('A' > h3 || h3 >= '[')) {
            return null;
        }
        return Character.valueOf(h3);
    }

    public final int hashCode() {
        return this.f3127k.hashCode();
    }

    public final String toString() {
        return this.f3127k.p();
    }
}
