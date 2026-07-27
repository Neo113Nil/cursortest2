package n1;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import b2.AbstractC0279e;
import com.google.android.gms.common.api.Status;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import l.q0;
import m1.C1277d;
import m1.InterfaceC1276c;
import r.C1392b;
import r.C1398h;

/* renamed from: n1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325l implements InterfaceC1308L {

    /* renamed from: a, reason: collision with root package name */
    public final C1337x f11390a;

    /* renamed from: e, reason: collision with root package name */
    public final C1297A f11391e;

    /* renamed from: f, reason: collision with root package name */
    public final C1297A f11392f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f11393g;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1276c f11395i;

    /* renamed from: j, reason: collision with root package name */
    public Bundle f11396j;

    /* renamed from: n, reason: collision with root package name */
    public final ReentrantLock f11400n;

    /* renamed from: h, reason: collision with root package name */
    public final Set f11394h = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k, reason: collision with root package name */
    public l1.b f11397k = null;

    /* renamed from: l, reason: collision with root package name */
    public l1.b f11398l = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11399m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f11401o = 0;

    public C1325l(Context context, C1337x c1337x, ReentrantLock reentrantLock, Looper looper, l1.g gVar, C1392b c1392b, C1392b c1392b2, q0 q0Var, E1.f fVar, InterfaceC1276c interfaceC1276c, ArrayList arrayList, ArrayList arrayList2, C1392b c1392b3, C1392b c1392b4) {
        this.f11390a = c1337x;
        this.f11400n = reentrantLock;
        this.f11395i = interfaceC1276c;
        this.f11391e = new C1297A(context, c1337x, reentrantLock, looper, gVar, c1392b2, null, c1392b4, null, arrayList2, new U.e(this));
        this.f11392f = new C1297A(context, c1337x, reentrantLock, looper, gVar, c1392b, q0Var, c1392b3, fVar, arrayList, new V0.j(22, this));
        C1392b c1392b5 = new C1392b();
        Iterator it = ((C1398h) c1392b2.keySet()).iterator();
        while (it.hasNext()) {
            c1392b5.put((C1277d) it.next(), this.f11391e);
        }
        Iterator it2 = ((C1398h) c1392b.keySet()).iterator();
        while (it2.hasNext()) {
            c1392b5.put((C1277d) it2.next(), this.f11392f);
        }
        this.f11393g = Collections.unmodifiableMap(c1392b5);
    }

    public static /* bridge */ /* synthetic */ void h(C1325l c1325l, int i2) {
        c1325l.f11390a.y(i2);
        c1325l.f11398l = null;
        c1325l.f11397k = null;
    }

    public static void i(C1325l c1325l) {
        l1.b bVar;
        l1.b bVar2;
        l1.b bVar3;
        l1.b bVar4 = c1325l.f11397k;
        boolean z = bVar4 != null && bVar4.b();
        C1297A c1297a = c1325l.f11391e;
        if (!z) {
            l1.b bVar5 = c1325l.f11397k;
            C1297A c1297a2 = c1325l.f11392f;
            if (bVar5 != null && (bVar2 = c1325l.f11398l) != null && bVar2.b()) {
                c1297a2.b();
                l1.b bVar6 = c1325l.f11397k;
                o1.u.g(bVar6);
                c1325l.f(bVar6);
                return;
            }
            l1.b bVar7 = c1325l.f11397k;
            if (bVar7 == null || (bVar = c1325l.f11398l) == null) {
                return;
            }
            if (c1297a2.f11288o < c1297a.f11288o) {
                bVar7 = bVar;
            }
            c1325l.f(bVar7);
            return;
        }
        l1.b bVar8 = c1325l.f11398l;
        if (!(bVar8 != null && bVar8.b()) && ((bVar3 = c1325l.f11398l) == null || bVar3.f11000b != 4)) {
            if (bVar3 != null) {
                if (c1325l.f11401o == 1) {
                    c1325l.g();
                    return;
                } else {
                    c1325l.f(bVar3);
                    c1297a.b();
                    return;
                }
            }
            return;
        }
        int i2 = c1325l.f11401o;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                c1325l.f11401o = 0;
            } else {
                C1337x c1337x = c1325l.f11390a;
                o1.u.g(c1337x);
                c1337x.b(c1325l.f11396j);
            }
        }
        c1325l.g();
        c1325l.f11401o = 0;
    }

    @Override // n1.InterfaceC1308L
    public final void a() {
        this.f11401o = 2;
        this.f11399m = false;
        this.f11398l = null;
        this.f11397k = null;
        this.f11391e.a();
        this.f11392f.a();
    }

    @Override // n1.InterfaceC1308L
    public final void b() {
        this.f11398l = null;
        this.f11397k = null;
        this.f11401o = 0;
        this.f11391e.b();
        this.f11392f.b();
        g();
    }

    @Override // n1.InterfaceC1308L
    public final B1.n c(B1.n nVar) {
        C1297A c1297a = (C1297A) this.f11393g.get(nVar.f236l);
        o1.u.h(c1297a, "GoogleApiClient is not configured to use the API required for this call.");
        if (!c1297a.equals(this.f11392f)) {
            C1297A c1297a2 = this.f11391e;
            c1297a2.getClass();
            nVar.J();
            return c1297a2.f11287n.s(nVar);
        }
        l1.b bVar = this.f11398l;
        if (bVar == null || bVar.f11000b != 4) {
            C1297A c1297a3 = this.f11392f;
            c1297a3.getClass();
            nVar.J();
            return c1297a3.f11287n.s(nVar);
        }
        InterfaceC1276c interfaceC1276c = this.f11395i;
        if (interfaceC1276c == null) {
            nVar.L(new Status(4, null, null, null));
            return nVar;
        }
        System.identityHashCode(this.f11390a);
        interfaceC1276c.m();
        throw null;
    }

    @Override // n1.InterfaceC1308L
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.f11392f.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.f11391e.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r4.f11401o == 1) goto L16;
     */
    @Override // n1.InterfaceC1308L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        this.f11400n.lock();
        try {
            boolean z = false;
            if (this.f11391e.f11287n instanceof C1328o) {
                if (!(this.f11392f.f11287n instanceof C1328o)) {
                    l1.b bVar = this.f11398l;
                    if (!(bVar != null && bVar.f11000b == 4)) {
                    }
                }
                z = true;
            }
            return z;
        } finally {
            this.f11400n.unlock();
        }
    }

    public final void f(l1.b bVar) {
        int i2 = this.f11401o;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f11401o = 0;
            }
            this.f11390a.k(bVar);
        }
        g();
        this.f11401o = 0;
    }

    public final void g() {
        Set set = this.f11394h;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            AbstractC0279e.o(it.next());
            throw null;
        }
        set.clear();
    }
}
