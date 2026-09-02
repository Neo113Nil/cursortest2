package P;

import Q.C0005c;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import c0.C0040a;
import com.google.android.gms.common.api.Status;
import d0.C0052a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes.dex */
public final class o implements O.g, O.h {

    /* renamed from: b, reason: collision with root package name */
    public final O.c f329b;

    /* renamed from: c, reason: collision with root package name */
    public final C0000a f330c;

    /* renamed from: d, reason: collision with root package name */
    public final Y.e f331d;

    /* renamed from: g, reason: collision with root package name */
    public final int f334g;

    /* renamed from: h, reason: collision with root package name */
    public final y f335h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f336i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0002c f340m;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f328a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f332e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f333f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f337j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public N.b f338k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f339l = 0;

    public o(C0002c c0002c, O.f fVar) {
        this.f340m = c0002c;
        Looper looper = c0002c.f314m.getLooper();
        C0.b a2 = fVar.a();
        C0005c c0005c = new C0005c((f.c) a2.f54b, (String) a2.f55c, (String) a2.f56d);
        V.a aVar = (V.a) fVar.f268c.f523b;
        Q.s.c(aVar);
        O.c d2 = aVar.d(fVar.f266a, looper, c0005c, fVar.f269d, this, this);
        String str = fVar.f267b;
        if (str != null && (d2 instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) d2).f749r = str;
        }
        if (str != null && (d2 instanceof g)) {
            C0.g.j(d2);
            throw null;
        }
        this.f329b = d2;
        this.f330c = fVar.f270e;
        this.f331d = new Y.e(15);
        this.f334g = fVar.f271f;
        if (!d2.j()) {
            this.f335h = null;
            return;
        }
        Context context = c0002c.f306e;
        Z.e eVar = c0002c.f314m;
        C0.b a3 = fVar.a();
        this.f335h = new y(context, eVar, new C0005c((f.c) a3.f54b, (String) a3.f55c, (String) a3.f56d));
    }

    @Override // O.h
    public final void a(N.b bVar) {
        o(bVar, null);
    }

    @Override // O.g
    public final void b(int i2) {
        Looper myLooper = Looper.myLooper();
        C0002c c0002c = this.f340m;
        if (myLooper == c0002c.f314m.getLooper()) {
            i(i2);
        } else {
            c0002c.f314m.post(new n(this, i2));
        }
    }

    @Override // O.g
    public final void c() {
        Looper myLooper = Looper.myLooper();
        C0002c c0002c = this.f340m;
        if (myLooper == c0002c.f314m.getLooper()) {
            h();
        } else {
            c0002c.f314m.post(new m(0, this));
        }
    }

    public final void d(N.b bVar) {
        HashSet hashSet = this.f332e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (Q.s.e(bVar, N.b.f229e)) {
                this.f329b.d();
            }
            throw null;
        }
    }

    public final void e(Status status) {
        Q.s.a(this.f340m.f314m);
        f(status, null, false);
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z2) {
        Q.s.a(this.f340m.f314m);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f328a.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (!z2 || uVar.f354a == 2) {
                if (status != null) {
                    uVar.c(status);
                } else {
                    uVar.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.f328a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            u uVar = (u) arrayList.get(i2);
            if (!this.f329b.c()) {
                return;
            }
            if (k(uVar)) {
                linkedList.remove(uVar);
            }
        }
    }

    public final void h() {
        C0002c c0002c = this.f340m;
        Q.s.a(c0002c.f314m);
        this.f338k = null;
        d(N.b.f229e);
        if (this.f336i) {
            Z.e eVar = c0002c.f314m;
            C0000a c0000a = this.f330c;
            eVar.removeMessages(11, c0000a);
            c0002c.f314m.removeMessages(9, c0000a);
            this.f336i = false;
        }
        Iterator it = this.f333f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        g();
        j();
    }

    public final void i(int i2) {
        C0002c c0002c = this.f340m;
        Q.s.a(c0002c.f314m);
        this.f338k = null;
        this.f336i = true;
        String f2 = this.f329b.f();
        Y.e eVar = this.f331d;
        eVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (f2 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(f2);
        }
        eVar.q(true, new Status(20, sb.toString(), null, null));
        Z.e eVar2 = c0002c.f314m;
        C0000a c0000a = this.f330c;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, c0000a), 5000L);
        Z.e eVar3 = c0002c.f314m;
        eVar3.sendMessageDelayed(Message.obtain(eVar3, 11, c0000a), 120000L);
        ((SparseIntArray) c0002c.f308g.f523b).clear();
        Iterator it = this.f333f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        C0002c c0002c = this.f340m;
        Z.e eVar = c0002c.f314m;
        C0000a c0000a = this.f330c;
        eVar.removeMessages(12, c0000a);
        Z.e eVar2 = c0002c.f314m;
        eVar2.sendMessageDelayed(eVar2.obtainMessage(12, c0000a), c0002c.f302a);
    }

    public final boolean k(u uVar) {
        N.d dVar;
        if (uVar == null) {
            O.c cVar = this.f329b;
            uVar.f(this.f331d, cVar.j());
            try {
                uVar.e(this);
            } catch (DeadObjectException unused) {
                b(1);
                cVar.i("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        N.d[] b2 = uVar.b(this);
        if (b2 != null && b2.length != 0) {
            N.d[] b3 = this.f329b.b();
            if (b3 == null) {
                b3 = new N.d[0];
            }
            int length = b3.length;
            f.b bVar = new f.b();
            if (length == 0) {
                bVar.f1036a = f.d.f1018a;
                bVar.f1037b = f.d.f1019b;
            } else {
                bVar.a(length);
            }
            bVar.f1038c = 0;
            for (N.d dVar2 : b3) {
                bVar.put(dVar2.f237a, Long.valueOf(dVar2.a()));
            }
            int length2 = b2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                dVar = b2[i2];
                Long l2 = (Long) bVar.getOrDefault(dVar.f237a, null);
                if (l2 == null || l2.longValue() < dVar.a()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            O.c cVar2 = this.f329b;
            uVar.f(this.f331d, cVar2.j());
            try {
                uVar.e(this);
            } catch (DeadObjectException unused2) {
                b(1);
                cVar2.i("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f329b.getClass().getName() + " could not execute call because it requires feature (" + dVar.f237a + ", " + dVar.a() + ").");
        if (!this.f340m.f315n || !uVar.a(this)) {
            uVar.d(new O.k(dVar));
            return true;
        }
        p pVar = new p(this.f330c, dVar);
        int indexOf = this.f337j.indexOf(pVar);
        if (indexOf >= 0) {
            p pVar2 = (p) this.f337j.get(indexOf);
            this.f340m.f314m.removeMessages(15, pVar2);
            Z.e eVar = this.f340m.f314m;
            eVar.sendMessageDelayed(Message.obtain(eVar, 15, pVar2), 5000L);
        } else {
            this.f337j.add(pVar);
            Z.e eVar2 = this.f340m.f314m;
            eVar2.sendMessageDelayed(Message.obtain(eVar2, 15, pVar), 5000L);
            Z.e eVar3 = this.f340m.f314m;
            eVar3.sendMessageDelayed(Message.obtain(eVar3, 16, pVar), 120000L);
            N.b bVar2 = new N.b(2, null);
            if (!l(bVar2)) {
                this.f340m.b(bVar2, this.f334g);
            }
        }
        return false;
    }

    public final boolean l(N.b bVar) {
        synchronized (C0002c.f300q) {
            this.f340m.getClass();
        }
        return false;
    }

    public final void m() {
        C0002c c0002c = this.f340m;
        Q.s.a(c0002c.f314m);
        O.c cVar = this.f329b;
        if (cVar.c() || cVar.a()) {
            return;
        }
        try {
            Y.e eVar = c0002c.f308g;
            Context context = c0002c.f306e;
            eVar.getClass();
            Q.s.c(context);
            int m2 = cVar.m();
            SparseIntArray sparseIntArray = (SparseIntArray) eVar.f523b;
            int i2 = sparseIntArray.get(m2, -1);
            if (i2 == -1) {
                i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= sparseIntArray.size()) {
                        i2 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i3);
                    if (keyAt > m2 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 == -1) {
                    i2 = ((N.e) eVar.f524c).b(context, m2);
                }
                sparseIntArray.put(m2, i2);
            }
            if (i2 != 0) {
                N.b bVar = new N.b(i2, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + bVar.toString());
                o(bVar, null);
                return;
            }
            C0000a c0000a = this.f330c;
            r rVar = new r();
            rVar.f351f = c0002c;
            rVar.f349d = null;
            rVar.f350e = null;
            rVar.f346a = false;
            rVar.f347b = cVar;
            rVar.f348c = c0000a;
            if (cVar.j()) {
                y yVar = this.f335h;
                Q.s.c(yVar);
                C0052a c0052a = yVar.f373g;
                if (c0052a != null) {
                    c0052a.h();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(yVar));
                C0005c c0005c = yVar.f372f;
                c0005c.f405f = valueOf;
                Z.e eVar2 = yVar.f369c;
                yVar.f373g = (C0052a) yVar.f370d.d(yVar.f368b, eVar2.getLooper(), c0005c, (C0040a) c0005c.f404e, yVar, yVar);
                yVar.f374h = rVar;
                Set set = yVar.f371e;
                if (set == null || set.isEmpty()) {
                    eVar2.post(new m(2, yVar));
                } else {
                    C0052a c0052a2 = yVar.f373g;
                    c0052a2.getClass();
                    c0052a2.l(new Q.h(c0052a2));
                }
            }
            try {
                cVar.l(rVar);
            } catch (SecurityException e2) {
                o(new N.b(10), e2);
            }
        } catch (IllegalStateException e3) {
            o(new N.b(10), e3);
        }
    }

    public final void n(u uVar) {
        Q.s.a(this.f340m.f314m);
        boolean c2 = this.f329b.c();
        LinkedList linkedList = this.f328a;
        if (c2) {
            if (k(uVar)) {
                j();
                return;
            } else {
                linkedList.add(uVar);
                return;
            }
        }
        linkedList.add(uVar);
        N.b bVar = this.f338k;
        if (bVar == null || bVar.f231b == 0 || bVar.f232c == null) {
            m();
        } else {
            o(bVar, null);
        }
    }

    public final void o(N.b bVar, RuntimeException runtimeException) {
        C0052a c0052a;
        Q.s.a(this.f340m.f314m);
        y yVar = this.f335h;
        if (yVar != null && (c0052a = yVar.f373g) != null) {
            c0052a.h();
        }
        Q.s.a(this.f340m.f314m);
        this.f338k = null;
        ((SparseIntArray) this.f340m.f308g.f523b).clear();
        d(bVar);
        if ((this.f329b instanceof S.d) && bVar.f231b != 24) {
            C0002c c0002c = this.f340m;
            c0002c.f303b = true;
            Z.e eVar = c0002c.f314m;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (bVar.f231b == 4) {
            e(C0002c.f299p);
            return;
        }
        if (this.f328a.isEmpty()) {
            this.f338k = bVar;
            return;
        }
        if (runtimeException != null) {
            Q.s.a(this.f340m.f314m);
            f(null, runtimeException, false);
            return;
        }
        if (!this.f340m.f315n) {
            e(C0002c.c(this.f330c, bVar));
            return;
        }
        f(C0002c.c(this.f330c, bVar), null, true);
        if (this.f328a.isEmpty() || l(bVar) || this.f340m.b(bVar, this.f334g)) {
            return;
        }
        if (bVar.f231b == 18) {
            this.f336i = true;
        }
        if (!this.f336i) {
            e(C0002c.c(this.f330c, bVar));
            return;
        }
        C0002c c0002c2 = this.f340m;
        C0000a c0000a = this.f330c;
        Z.e eVar2 = c0002c2.f314m;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, c0000a), 5000L);
    }

    public final void p(N.b bVar) {
        Q.s.a(this.f340m.f314m);
        O.c cVar = this.f329b;
        cVar.i("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(bVar));
        o(bVar, null);
    }

    public final void q() {
        Q.s.a(this.f340m.f314m);
        Status status = C0002c.f298o;
        e(status);
        this.f331d.q(false, status);
        for (f fVar : (f[]) this.f333f.keySet().toArray(new f[0])) {
            n(new A(new e0.d()));
        }
        d(new N.b(4));
        O.c cVar = this.f329b;
        if (cVar.c()) {
            cVar.k(new C0.a(23, this));
        }
    }
}
