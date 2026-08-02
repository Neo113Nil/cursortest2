package k2;

import android.content.Context;
import f2.m;
import java.util.ArrayList;
import java.util.Collection;
import l2.C2053a;
import l2.d;
import m2.C2084a;
import m2.C2085b;
import m2.C2088e;
import m2.C2089f;
import m2.g;
import r2.InterfaceC2348a;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2032c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f17582d = m.f("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2031b f17583a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.b[] f17584b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17585c;

    public C2032c(Context context, InterfaceC2348a interfaceC2348a, InterfaceC2031b interfaceC2031b) {
        Context applicationContext = context.getApplicationContext();
        this.f17583a = interfaceC2031b;
        this.f17584b = new l2.b[]{new C2053a((C2084a) g.i(applicationContext, interfaceC2348a).f17994l, 0), new C2053a((C2085b) g.i(applicationContext, interfaceC2348a).f17995m, 1), new C2053a((C2089f) g.i(applicationContext, interfaceC2348a).f17997o, 4), new C2053a((C2088e) g.i(applicationContext, interfaceC2348a).f17996n, 2), new C2053a((C2088e) g.i(applicationContext, interfaceC2348a).f17996n, 3), new d((C2088e) g.i(applicationContext, interfaceC2348a).f17996n), new l2.c((C2088e) g.i(applicationContext, interfaceC2348a).f17996n)};
        this.f17585c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f17585c) {
            try {
                for (l2.b bVar : this.f17584b) {
                    Object obj = bVar.f17766b;
                    if (obj != null && bVar.b(obj) && bVar.f17765a.contains(str)) {
                        m.d().a(f17582d, "Work " + str + " constrained by " + bVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList) {
        synchronized (this.f17585c) {
            InterfaceC2031b interfaceC2031b = this.f17583a;
            if (interfaceC2031b != null) {
                interfaceC2031b.c(arrayList);
            }
        }
    }

    public final void c(Collection collection) {
        synchronized (this.f17585c) {
            try {
                for (l2.b bVar : this.f17584b) {
                    if (bVar.f17768d != null) {
                        bVar.f17768d = null;
                        bVar.d(null, bVar.f17766b);
                    }
                }
                for (l2.b bVar2 : this.f17584b) {
                    bVar2.c(collection);
                }
                for (l2.b bVar3 : this.f17584b) {
                    if (bVar3.f17768d != this) {
                        bVar3.f17768d = this;
                        bVar3.d(this, bVar3.f17766b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f17585c) {
            try {
                for (l2.b bVar : this.f17584b) {
                    ArrayList arrayList = bVar.f17765a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        bVar.f17767c.b(bVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
