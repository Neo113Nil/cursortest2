package i1;

import android.content.Context;
import d1.n;
import j1.AbstractC1301b;
import j1.C1300a;
import j1.C1302c;
import j1.C1303d;
import java.util.ArrayList;
import java.util.Collection;
import k1.C1329a;
import k1.C1330b;
import k1.C1333e;
import k1.f;
import k1.g;
import p1.InterfaceC1533a;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f13833d = n.g("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1243b f13834a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1301b[] f13835b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13836c;

    public C1244c(Context context, InterfaceC1533a interfaceC1533a, InterfaceC1243b interfaceC1243b) {
        Context applicationContext = context.getApplicationContext();
        this.f13834a = interfaceC1243b;
        this.f13835b = new AbstractC1301b[]{new C1300a((C1329a) g.B(applicationContext, interfaceC1533a).f14674a, 0), new C1300a((C1330b) g.B(applicationContext, interfaceC1533a).f14675b, 1), new C1300a((f) g.B(applicationContext, interfaceC1533a).f14677d, 4), new C1300a((C1333e) g.B(applicationContext, interfaceC1533a).f14676c, 2), new C1300a((C1333e) g.B(applicationContext, interfaceC1533a).f14676c, 3), new C1303d((C1333e) g.B(applicationContext, interfaceC1533a).f14676c), new C1302c((C1333e) g.B(applicationContext, interfaceC1533a).f14676c)};
        this.f13836c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f13836c) {
            try {
                for (AbstractC1301b abstractC1301b : this.f13835b) {
                    Object obj = abstractC1301b.f14547b;
                    if (obj != null && abstractC1301b.b(obj) && abstractC1301b.f14546a.contains(str)) {
                        n.d().b(f13833d, "Work " + str + " constrained by " + abstractC1301b.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f13836c) {
            try {
                for (AbstractC1301b abstractC1301b : this.f13835b) {
                    if (abstractC1301b.f14549d != null) {
                        abstractC1301b.f14549d = null;
                        abstractC1301b.d(null, abstractC1301b.f14547b);
                    }
                }
                for (AbstractC1301b abstractC1301b2 : this.f13835b) {
                    abstractC1301b2.c(collection);
                }
                for (AbstractC1301b abstractC1301b3 : this.f13835b) {
                    if (abstractC1301b3.f14549d != this) {
                        abstractC1301b3.f14549d = this;
                        abstractC1301b3.d(this, abstractC1301b3.f14547b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f13836c) {
            try {
                for (AbstractC1301b abstractC1301b : this.f13835b) {
                    ArrayList arrayList = abstractC1301b.f14546a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        abstractC1301b.f14548c.b(abstractC1301b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
