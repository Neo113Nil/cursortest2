package com.google.android.gms.common.api.internal;

import W5.AbstractC0486a1;
import W5.RunnableC0493d;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.appcompat.widget.b1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0812h;
import com.google.android.gms.common.internal.C0820p;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class D implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C0787h f11103D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.g f11105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0780a f11106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f11107d;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f11110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final M f11111y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11112z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f11104a = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f11108e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f11109f = new HashMap();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f11100A = new ArrayList();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ConnectionResult f11101B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f11102C = 0;

    public D(C0787h c0787h, com.google.android.gms.common.api.l lVar) {
        this.f11103D = c0787h;
        com.google.android.gms.common.api.g gVarZab = lVar.zab(c0787h.f11181E.getLooper(), this);
        this.f11105b = gVarZab;
        this.f11106c = lVar.getApiKey();
        this.f11107d = new A();
        this.f11110x = lVar.zaa();
        if (!gVarZab.requiresSignIn()) {
            this.f11111y = null;
        } else {
            this.f11111y = lVar.zac(c0787h.f11187e, c0787h.f11181E);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0786g
    public final void Z() {
        Looper looperMyLooper = Looper.myLooper();
        C0787h c0787h = this.f11103D;
        if (looperMyLooper == c0787h.f11181E.getLooper()) {
            e();
        } else {
            c0787h.f11181E.post(new b1(this, 2));
        }
    }

    public final void a(ConnectionResult connectionResult) {
        HashSet hashSet = this.f11108e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (com.google.android.gms.common.internal.D.m(connectionResult, ConnectionResult.f11059e)) {
                this.f11105b.getEndpointPackageName();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        com.google.android.gms.common.internal.D.c(this.f11103D.f11181E);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z4) {
        com.google.android.gms.common.internal.D.c(this.f11103D.f11181E);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f11104a.iterator();
        while (it.hasNext()) {
            V v6 = (V) it.next();
            if (!z4 || v6.f11149a == 2) {
                if (status != null) {
                    v6.a(status);
                } else {
                    v6.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f11104a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            V v6 = (V) arrayList.get(i7);
            if (!this.f11105b.isConnected()) {
                return;
            }
            if (h(v6)) {
                linkedList.remove(v6);
            }
        }
    }

    public final void e() {
        C0787h c0787h = this.f11103D;
        com.google.android.gms.common.internal.D.c(c0787h.f11181E);
        this.f11101B = null;
        a(ConnectionResult.f11059e);
        if (this.f11112z) {
            zau zauVar = c0787h.f11181E;
            C0780a c0780a = this.f11106c;
            zauVar.removeMessages(11, c0780a);
            c0787h.f11181E.removeMessages(9, c0780a);
            this.f11112z = false;
        }
        Iterator it = this.f11109f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        d();
        g();
    }

    public final void f(int i7) {
        C0787h c0787h = this.f11103D;
        com.google.android.gms.common.internal.D.c(c0787h.f11181E);
        this.f11101B = null;
        this.f11112z = true;
        String lastDisconnectMessage = this.f11105b.getLastDisconnectMessage();
        A a2 = this.f11107d;
        a2.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i7 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i7 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        a2.a(new Status(20, sb.toString(), null, null), true);
        zau zauVar = c0787h.f11181E;
        C0780a c0780a = this.f11106c;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, c0780a), 5000L);
        zau zauVar2 = c0787h.f11181E;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 11, c0780a), 120000L);
        ((SparseIntArray) c0787h.f11189x.f11335b).clear();
        Iterator it = this.f11109f.values().iterator();
        if (it.hasNext()) {
            AbstractC0486a1.n(it.next());
            throw null;
        }
    }

    public final void g() {
        C0787h c0787h = this.f11103D;
        zau zauVar = c0787h.f11181E;
        C0780a c0780a = this.f11106c;
        zauVar.removeMessages(12, c0780a);
        zau zauVar2 = c0787h.f11181E;
        zauVar2.sendMessageDelayed(zauVar2.obtainMessage(12, c0780a), c0787h.f11183a);
    }

    public final boolean h(V v6) {
        Feature feature;
        if (!(v6 instanceof I)) {
            com.google.android.gms.common.api.g gVar = this.f11105b;
            v6.d(this.f11107d, gVar.requiresSignIn());
            try {
                v6.c(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                gVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        I i7 = (I) v6;
        Feature[] featureArrG = i7.g(this);
        if (featureArrG == null || featureArrG.length == 0) {
            feature = null;
            break;
        }
        Feature[] availableFeatures = this.f11105b.getAvailableFeatures();
        if (availableFeatures == null) {
            availableFeatures = new Feature[0];
        }
        p122r.b bVar = new p122r.b(availableFeatures.length);
        for (Feature feature2 : availableFeatures) {
            bVar.put(feature2.f11064a, Long.valueOf(feature2.j()));
        }
        int length = featureArrG.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                feature = null;
                break;
            }
            feature = featureArrG[i8];
            Long l7 = (Long) bVar.getOrDefault(feature.f11064a, null);
            if (l7 == null || l7.longValue() < feature.j()) {
                break;
            }
            i8++;
        }
        if (feature == null) {
            com.google.android.gms.common.api.g gVar2 = this.f11105b;
            v6.d(this.f11107d, gVar2.requiresSignIn());
            try {
                v6.c(this);
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                gVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f11105b.getClass().getName() + " could not execute call because it requires feature (" + feature.f11064a + ", " + feature.j() + ").");
        if (!this.f11103D.f11182F || !i7.f(this)) {
            i7.b(new com.google.android.gms.common.api.w(feature));
            return true;
        }
        E e7 = new E(this.f11106c, feature);
        int iIndexOf = this.f11100A.indexOf(e7);
        if (iIndexOf >= 0) {
            E e8 = (E) this.f11100A.get(iIndexOf);
            this.f11103D.f11181E.removeMessages(15, e8);
            zau zauVar = this.f11103D.f11181E;
            Message messageObtain = Message.obtain(zauVar, 15, e8);
            this.f11103D.getClass();
            zauVar.sendMessageDelayed(messageObtain, 5000L);
        } else {
            this.f11100A.add(e7);
            zau zauVar2 = this.f11103D.f11181E;
            Message messageObtain2 = Message.obtain(zauVar2, 15, e7);
            this.f11103D.getClass();
            zauVar2.sendMessageDelayed(messageObtain2, 5000L);
            zau zauVar3 = this.f11103D.f11181E;
            Message messageObtain3 = Message.obtain(zauVar3, 16, e7);
            this.f11103D.getClass();
            zauVar3.sendMessageDelayed(messageObtain3, 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!i(connectionResult)) {
                this.f11103D.d(connectionResult, this.f11110x);
            }
        }
        return false;
    }

    public final boolean i(ConnectionResult connectionResult) {
        synchronized (C0787h.f11175I) {
            try {
                C0787h c0787h = this.f11103D;
                if (c0787h.f11178B == null || !c0787h.f11179C.contains(this.f11106c)) {
                    return false;
                }
                B b7 = this.f11103D.f11178B;
                int i7 = this.f11110x;
                b7.getClass();
                W w7 = new W(connectionResult, i7);
                AtomicReference atomicReference = b7.f11093b;
                while (!atomicReference.compareAndSet(null, w7)) {
                    if (atomicReference.get() != null && atomicReference.get() != null) {
                        return true;
                    }
                }
                b7.f11094c.post(new X(0, b7, w7));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(boolean z4) {
        com.google.android.gms.common.internal.D.c(this.f11103D.f11181E);
        com.google.android.gms.common.api.g gVar = this.f11105b;
        if (gVar.isConnected() && this.f11109f.size() == 0) {
            A a2 = this.f11107d;
            if (((Map) a2.f11090a).isEmpty() && ((Map) a2.f11091b).isEmpty()) {
                gVar.disconnect("Timing out service connection.");
                return true;
            }
            if (z4) {
                g();
            }
        }
        return false;
    }

    public final void k() {
        C0787h c0787h = this.f11103D;
        com.google.android.gms.common.internal.D.c(c0787h.f11181E);
        com.google.android.gms.common.api.g gVar = this.f11105b;
        if (gVar.isConnected() || gVar.isConnecting()) {
            return;
        }
        try {
            com.google.android.gms.common.internal.w wVar = c0787h.f11189x;
            Context context = c0787h.f11187e;
            wVar.getClass();
            com.google.android.gms.common.internal.D.i(context);
            int iD = 0;
            if (gVar.requiresGooglePlayServices()) {
                int minApkVersion = gVar.getMinApkVersion();
                SparseIntArray sparseIntArray = (SparseIntArray) wVar.f11335b;
                int i7 = sparseIntArray.get(minApkVersion, -1);
                if (i7 != -1) {
                    iD = i7;
                } else {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= sparseIntArray.size()) {
                            iD = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i8);
                        if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    if (iD == -1) {
                        iD = ((com.google.android.gms.common.c) wVar.f11336c).d(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, iD);
                }
            }
            if (iD != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iD, null);
                Log.w("GoogleApiManager", "The service for " + gVar.getClass().getName() + " is not available: " + connectionResult.toString());
                m(connectionResult, null);
                return;
            }
            H2.r rVar = new H2.r(c0787h, gVar, this.f11106c);
            if (gVar.requiresSignIn()) {
                M m7 = this.f11111y;
                com.google.android.gms.common.internal.D.i(m7);
                p173z3.a aVar = m7.f11137f;
                if (aVar != null) {
                    aVar.disconnect();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(m7));
                C0812h c0812h = m7.f11136e;
                c0812h.f11311g = numValueOf;
                Handler handler = m7.f11133b;
                m7.f11137f = (p173z3.a) m7.f11134c.buildClient(m7.f11132a, handler.getLooper(), c0812h, (Object) c0812h.f11310f, (com.google.android.gms.common.api.m) m7, (com.google.android.gms.common.api.n) m7);
                m7.f11138x = rVar;
                Set set = m7.f11135d;
                if (set == null || set.isEmpty()) {
                    handler.post(new b1(m7, 4));
                } else {
                    p173z3.a aVar2 = m7.f11137f;
                    aVar2.getClass();
                    aVar2.connect(new C0820p(aVar2));
                }
            }
            try {
                gVar.connect(rVar);
            } catch (SecurityException e7) {
                m(new ConnectionResult(10), e7);
            }
        } catch (IllegalStateException e8) {
            m(new ConnectionResult(10), e8);
        }
    }

    public final void l(V v6) {
        com.google.android.gms.common.internal.D.c(this.f11103D.f11181E);
        boolean zIsConnected = this.f11105b.isConnected();
        LinkedList linkedList = this.f11104a;
        if (zIsConnected) {
            if (h(v6)) {
                g();
                return;
            } else {
                linkedList.add(v6);
                return;
            }
        }
        linkedList.add(v6);
        ConnectionResult connectionResult = this.f11101B;
        if (connectionResult == null || connectionResult.f11061b == 0 || connectionResult.f11062c == null) {
            k();
        } else {
            m(connectionResult, null);
        }
    }

    public final void m(ConnectionResult connectionResult, RuntimeException runtimeException) {
        p173z3.a aVar;
        com.google.android.gms.common.internal.D.c(this.f11103D.f11181E);
        M m7 = this.f11111y;
        if (m7 != null && (aVar = m7.f11137f) != null) {
            aVar.disconnect();
        }
        com.google.android.gms.common.internal.D.c(this.f11103D.f11181E);
        this.f11101B = null;
        ((SparseIntArray) this.f11103D.f11189x.f11335b).clear();
        a(connectionResult);
        if ((this.f11105b instanceof p055h3.c) && connectionResult.f11061b != 24) {
            C0787h c0787h = this.f11103D;
            c0787h.f11184b = true;
            zau zauVar = c0787h.f11181E;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (connectionResult.f11061b == 4) {
            b(C0787h.f11174H);
            return;
        }
        if (this.f11104a.isEmpty()) {
            this.f11101B = connectionResult;
            return;
        }
        if (runtimeException != null) {
            com.google.android.gms.common.internal.D.c(this.f11103D.f11181E);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f11103D.f11182F) {
            b(C0787h.e(this.f11106c, connectionResult));
            return;
        }
        c(C0787h.e(this.f11106c, connectionResult), null, true);
        if (this.f11104a.isEmpty() || i(connectionResult) || this.f11103D.d(connectionResult, this.f11110x)) {
            return;
        }
        if (connectionResult.f11061b == 18) {
            this.f11112z = true;
        }
        if (!this.f11112z) {
            b(C0787h.e(this.f11106c, connectionResult));
            return;
        }
        zau zauVar2 = this.f11103D.f11181E;
        Message messageObtain = Message.obtain(zauVar2, 9, this.f11106c);
        this.f11103D.getClass();
        zauVar2.sendMessageDelayed(messageObtain, 5000L);
    }

    public final void n() {
        com.google.android.gms.common.internal.D.c(this.f11103D.f11181E);
        Status status = C0787h.f11173G;
        b(status);
        this.f11107d.a(status, false);
        for (AbstractC0792m abstractC0792m : (AbstractC0792m[]) this.f11109f.keySet().toArray(new AbstractC0792m[0])) {
            l(new U(4, new TaskCompletionSource()));
        }
        a(new ConnectionResult(4));
        com.google.android.gms.common.api.g gVar = this.f11105b;
        if (gVar.isConnected()) {
            gVar.onUserSignOut(new p145u1.c(this, 15));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0795p
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        m(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0786g
    public final void onConnectionSuspended(int i7) {
        Looper looperMyLooper = Looper.myLooper();
        C0787h c0787h = this.f11103D;
        if (looperMyLooper == c0787h.f11181E.getLooper()) {
            f(i7);
        } else {
            c0787h.f11181E.post(new RunnableC0493d(this, i7, 2));
        }
    }
}
