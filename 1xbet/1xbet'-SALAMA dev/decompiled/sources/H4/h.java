package H4;

import G4.C0269b;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0269b f3316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p075k4.e f3317c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f3318a;

    static {
        C0269b c0269b = new C0269b(5);
        f3316b = c0269b;
        f3317c = new p075k4.e(Collections.emptyList(), c0269b);
    }

    public h(m mVar) {
        p113p3.f.O("Not a document key path: %s", f(mVar), mVar);
        this.f3318a = mVar;
    }

    public static h b() {
        List listEmptyList = Collections.emptyList();
        m mVar = m.f3331b;
        return new h(listEmptyList.isEmpty() ? m.f3331b : new m(listEmptyList));
    }

    public static h c(String str) {
        m mVarY = m.y(str);
        boolean z4 = false;
        if (mVarY.f3312a.size() > 4 && mVarY.l(0).equals("projects") && mVarY.l(2).equals("databases") && mVarY.l(4).equals("documents")) {
            z4 = true;
        }
        p113p3.f.O("Tried to parse an invalid key: %s", z4, mVarY);
        return new h((m) mVarY.p());
    }

    public static boolean f(m mVar) {
        return mVar.f3312a.size() % 2 == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        return this.f3318a.compareTo(hVar.f3318a);
    }

    public final m d() {
        return (m) this.f3318a.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.f3318a.equals(((h) obj).f3318a);
    }

    public final int hashCode() {
        return this.f3318a.hashCode();
    }

    public final String toString() {
        return this.f3318a.c();
    }
}
