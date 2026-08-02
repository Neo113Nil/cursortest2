package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.C0838l;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class K implements h.a, h.b {
    public final a.f b;
    public final C0828b c;
    public final A d;
    public final int p;

    @Nullable
    public final c0 q;
    public boolean r;
    public final /* synthetic */ C0833g v;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList s = new ArrayList();

    @Nullable
    public C0852b t = null;
    public int u = 0;

    @WorkerThread
    public K(C0833g c0833g, com.google.android.gms.common.api.g gVar) {
        this.v = c0833g;
        zau zauVar = c0833g.p;
        a.f zab = gVar.zab(zauVar.getLooper(), this);
        this.b = zab;
        this.c = gVar.getApiKey();
        this.d = new A();
        this.p = gVar.zaa();
        if (zab.requiresSignIn()) {
            this.q = gVar.zac(c0833g.e, zauVar);
        } else {
            this.q = null;
        }
    }

    @WorkerThread
    public final void a(C0852b c0852b) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        n0 n0Var = (n0) it.next();
        if (C0874p.a(c0852b, C0852b.e)) {
            this.b.getEndpointPackageName();
        }
        n0Var.getClass();
        throw null;
    }

    @WorkerThread
    public final void b(Status status) {
        C0875q.c(this.v.p);
        c(status, null, false);
    }

    @WorkerThread
    public final void c(@Nullable Status status, @Nullable Exception exc, boolean z) {
        C0875q.c(this.v.p);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            if (!z || m0Var.a == 2) {
                if (status != null) {
                    m0Var.a(status);
                } else {
                    m0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    @WorkerThread
    public final void d() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m0 m0Var = (m0) arrayList.get(i);
            if (!this.b.isConnected()) {
                return;
            }
            if (h(m0Var)) {
                linkedList.remove(m0Var);
            }
        }
    }

    @WorkerThread
    public final void e() {
        C0833g c0833g = this.v;
        C0875q.c(c0833g.p);
        this.t = null;
        a(C0852b.e);
        zau zauVar = c0833g.p;
        if (this.r) {
            C0828b c0828b = this.c;
            zauVar.removeMessages(11, c0828b);
            zauVar.removeMessages(9, c0828b);
            this.r = false;
        }
        Iterator it = this.f.values().iterator();
        if (it.hasNext()) {
            ((X) it.next()).getClass();
            throw null;
        }
        d();
        g();
    }

    @WorkerThread
    public final void f(int i) {
        C0833g c0833g = this.v;
        zau zauVar = c0833g.p;
        C0875q.c(c0833g.p);
        this.t = null;
        this.r = true;
        String lastDisconnectMessage = this.b.getLastDisconnectMessage();
        A a = this.d;
        a.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        a.a(new Status(20, sb.toString(), null, null), true);
        C0828b c0828b = this.c;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, c0828b), 5000L);
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 11, c0828b), 120000L);
        c0833g.i.a.clear();
        Iterator it = this.f.values().iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final void g() {
        C0833g c0833g = this.v;
        zau zauVar = c0833g.p;
        C0828b c0828b = this.c;
        zauVar.removeMessages(12, c0828b);
        zauVar.sendMessageDelayed(zauVar.obtainMessage(12, c0828b), c0833g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final boolean h(m0 m0Var) {
        C0854d c0854d;
        if (!(m0Var instanceof S)) {
            A a = this.d;
            a.f fVar = this.b;
            m0Var.d(a, fVar.requiresSignIn());
            try {
                m0Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                fVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        S s = (S) m0Var;
        C0854d[] g = s.g(this);
        if (g != null && g.length != 0) {
            C0854d[] availableFeatures = this.b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new C0854d[0];
            }
            ArrayMap arrayMap = new ArrayMap(availableFeatures.length);
            for (C0854d c0854d2 : availableFeatures) {
                arrayMap.put(c0854d2.a, Long.valueOf(c0854d2.l()));
            }
            int length = g.length;
            for (int i = 0; i < length; i++) {
                c0854d = g[i];
                Long l = (Long) arrayMap.get(c0854d.a);
                if (l == null || l.longValue() < c0854d.l()) {
                    break;
                }
            }
        }
        c0854d = null;
        if (c0854d == null) {
            A a2 = this.d;
            a.f fVar2 = this.b;
            m0Var.d(a2, fVar2.requiresSignIn());
            try {
                m0Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                fVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        this.b.getClass();
        if (!this.v.q || !s.f(this)) {
            s.b(new com.google.android.gms.common.api.p(c0854d));
            return true;
        }
        L l2 = new L(this.c, c0854d);
        int indexOf = this.s.indexOf(l2);
        if (indexOf >= 0) {
            L l3 = (L) this.s.get(indexOf);
            this.v.p.removeMessages(15, l3);
            zau zauVar = this.v.p;
            zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, l3), 5000L);
        } else {
            this.s.add(l2);
            zau zauVar2 = this.v.p;
            zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, l2), 5000L);
            zau zauVar3 = this.v.p;
            zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, l2), 120000L);
            C0852b c0852b = new C0852b(2, null);
            if (!i(c0852b)) {
                this.v.d(c0852b, this.p);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r5.get() == null) goto L30;
     */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(@NonNull C0852b c0852b) {
        synchronized (C0833g.t) {
            try {
                C0833g c0833g = this.v;
                if (c0833g.m == null || !c0833g.n.contains(this.c)) {
                    return false;
                }
                B b = this.v.m;
                int i = this.p;
                b.getClass();
                o0 o0Var = new o0(c0852b, i);
                loop0: while (true) {
                    AtomicReference atomicReference = b.b;
                    while (true) {
                        if (atomicReference.compareAndSet(null, o0Var)) {
                            b.c.post(new q0(b, o0Var));
                            break loop0;
                        }
                        if (atomicReference.get() != null) {
                            break;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    public final boolean j(boolean z) {
        C0875q.c(this.v.p);
        a.f fVar = this.b;
        if (!fVar.isConnected() || !this.f.isEmpty()) {
            return false;
        }
        A a = this.d;
        if (a.a.isEmpty() && a.b.isEmpty()) {
            fVar.disconnect("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        g();
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.android.gms.common.api.a$f, com.google.android.gms.signin.f] */
    @WorkerThread
    public final void k() {
        C0833g c0833g = this.v;
        C0875q.c(c0833g.p);
        a.f fVar = this.b;
        if (fVar.isConnected() || fVar.isConnecting()) {
            return;
        }
        try {
            com.google.android.gms.common.internal.G g = c0833g.i;
            Context context = c0833g.e;
            SparseIntArray sparseIntArray = g.a;
            C0875q.g(context);
            int i = 0;
            if (fVar.requiresGooglePlayServices()) {
                int minApkVersion = fVar.getMinApkVersion();
                int i2 = g.a.get(minApkVersion, -1);
                if (i2 != -1) {
                    i = i2;
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= sparseIntArray.size()) {
                            i = -1;
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i3);
                        if (keyAt > minApkVersion && sparseIntArray.get(keyAt) == 0) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i == -1) {
                        i = g.b.c(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, i);
                }
            }
            if (i != 0) {
                C0852b c0852b = new C0852b(i, null);
                c0852b.toString();
                m(c0852b, null);
                return;
            }
            N n = new N(c0833g, fVar, this.c);
            if (fVar.requiresSignIn()) {
                c0 c0Var = this.q;
                C0875q.g(c0Var);
                Handler handler = c0Var.b;
                C0863e c0863e = c0Var.e;
                com.google.android.gms.signin.f fVar2 = c0Var.f;
                if (fVar2 != null) {
                    fVar2.disconnect();
                }
                c0863e.h = Integer.valueOf(System.identityHashCode(c0Var));
                c0Var.f = c0Var.c.buildClient(c0Var.a, handler.getLooper(), c0863e, (Object) c0863e.g, (h.a) c0Var, (h.b) c0Var);
                c0Var.p = n;
                Set set = c0Var.d;
                if (set == null || set.isEmpty()) {
                    handler.post(new a0(c0Var));
                } else {
                    c0Var.f.a();
                }
            }
            try {
                fVar.connect(n);
            } catch (SecurityException e) {
                m(new C0852b(10), e);
            }
        } catch (IllegalStateException e2) {
            m(new C0852b(10), e2);
        }
    }

    @WorkerThread
    public final void l(m0 m0Var) {
        C0875q.c(this.v.p);
        boolean isConnected = this.b.isConnected();
        LinkedList linkedList = this.a;
        if (isConnected) {
            if (h(m0Var)) {
                g();
                return;
            } else {
                linkedList.add(m0Var);
                return;
            }
        }
        linkedList.add(m0Var);
        C0852b c0852b = this.t;
        if (c0852b == null || !c0852b.l()) {
            k();
        } else {
            m(this.t, null);
        }
    }

    @WorkerThread
    public final void m(@NonNull C0852b c0852b, @Nullable RuntimeException runtimeException) {
        com.google.android.gms.signin.f fVar;
        C0875q.c(this.v.p);
        c0 c0Var = this.q;
        if (c0Var != null && (fVar = c0Var.f) != null) {
            fVar.disconnect();
        }
        C0875q.c(this.v.p);
        this.t = null;
        this.v.i.a.clear();
        a(c0852b);
        if ((this.b instanceof com.google.android.gms.common.internal.service.e) && c0852b.b != 24) {
            C0833g c0833g = this.v;
            c0833g.b = true;
            zau zauVar = c0833g.p;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (c0852b.b == 4) {
            b(C0833g.s);
            return;
        }
        if (this.a.isEmpty()) {
            this.t = c0852b;
            return;
        }
        if (runtimeException != null) {
            C0875q.c(this.v.p);
            c(null, runtimeException, false);
            return;
        }
        if (!this.v.q) {
            b(C0833g.e(this.c, c0852b));
            return;
        }
        c(C0833g.e(this.c, c0852b), null, true);
        if (this.a.isEmpty() || i(c0852b) || this.v.d(c0852b, this.p)) {
            return;
        }
        if (c0852b.b == 18) {
            this.r = true;
        }
        if (!this.r) {
            b(C0833g.e(this.c, c0852b));
            return;
        }
        C0833g c0833g2 = this.v;
        C0828b c0828b = this.c;
        zau zauVar2 = c0833g2.p;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, c0828b), 5000L);
    }

    @WorkerThread
    public final void n(@NonNull C0852b c0852b) {
        C0875q.c(this.v.p);
        a.f fVar = this.b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c0852b));
        m(c0852b, null);
    }

    @WorkerThread
    public final void o() {
        C0875q.c(this.v.p);
        Status status = C0833g.r;
        b(status);
        A a = this.d;
        a.getClass();
        a.a(status, false);
        for (C0838l.a aVar : (C0838l.a[]) this.f.keySet().toArray(new C0838l.a[0])) {
            l(new l0(aVar, new TaskCompletionSource()));
        }
        a(new C0852b(4));
        a.f fVar = this.b;
        if (fVar.isConnected()) {
            fVar.onUserSignOut(new J(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0832f
    public final void onConnected() {
        Looper myLooper = Looper.myLooper();
        zau zauVar = this.v.p;
        if (myLooper == zauVar.getLooper()) {
            e();
        } else {
            zauVar.post(new G(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0841o
    @WorkerThread
    public final void onConnectionFailed(@NonNull C0852b c0852b) {
        m(c0852b, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0832f
    public final void onConnectionSuspended(int i) {
        Looper myLooper = Looper.myLooper();
        zau zauVar = this.v.p;
        if (myLooper == zauVar.getLooper()) {
            f(i);
        } else {
            zauVar.post(new H(this, i));
        }
    }
}
