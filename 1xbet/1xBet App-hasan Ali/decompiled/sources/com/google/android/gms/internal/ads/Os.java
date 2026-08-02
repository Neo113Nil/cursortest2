package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Os {

    /* renamed from: d, reason: collision with root package name */
    public static final Os f11007d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f11008a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11009b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11010c;

    static {
        Os os = new Os();
        os.f11009b = false;
        os.f11010c = false;
        f11007d = os;
    }

    public final void a(boolean z3, boolean z5) {
        if ((z5 || z3) == (this.f11010c || this.f11009b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(Hs.f9492c.f9493a).iterator();
        while (it.hasNext()) {
            Rs rs = ((C1893zs) it.next()).f16778d;
            boolean z6 = z5 || z3;
            if (rs.f11461b.get() != 0) {
                AbstractC1668us.E(rs.a(), "setDeviceLockState", true != z6 ? "unlocked" : "locked");
            }
        }
    }
}
