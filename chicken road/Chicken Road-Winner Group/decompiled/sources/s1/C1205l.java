package s1;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import v1.AbstractC1217a;

/* renamed from: s1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205l {

    /* renamed from: d, reason: collision with root package name */
    public static final C1205l f10339d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f10340a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10341b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10342c;

    static {
        C1205l c1205l = new C1205l();
        c1205l.f10341b = false;
        c1205l.f10342c = false;
        f10339d = c1205l;
    }

    public final void a(boolean z3, boolean z4) {
        if ((z4 || z3) == (this.f10342c || this.f10341b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(C1196c.f10320c.f10321a).iterator();
        while (it.hasNext()) {
            AbstractC1217a abstractC1217a = ((o1.i) it.next()).f10172e;
            boolean z5 = z4 || z3;
            if (abstractC1217a.f10407b.get() != 0) {
                C1202i.f10332a.a(abstractC1217a.g(), "setDeviceLockState", z5 ? "locked" : "unlocked");
            }
        }
    }
}
